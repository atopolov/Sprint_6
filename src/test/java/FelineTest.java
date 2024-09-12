import com.example.classes.Animal;
import com.example.classes.Feline;
import com.example.classes.constants.Constants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

// Аннотация @RunWith сообщает JUnit использовать MockitoJUnitRunner
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    // Аннотация @Mock создаёт мок-объект класса Animal
    @Mock
    private Animal animal;
    private Feline feline;

    // Метод @Before выполняется перед каждым тестом
    @Before
    public void setUp() {
        feline = new Feline();
    }

    // Тестовый метод для проверки метода eatMeat() класса Feline
    @Test
    public void testEatMeat_ReturnsCorrectFoodList() throws Exception {
        // Ожидаемый список еды для семейства хищника
        List<String> expectedFood = Constants.PREDATOR_FOOD;
        Mockito.lenient().when(animal.getFood(Constants.ANIMAL_KIND.get(1))).thenReturn(expectedFood);
        // Получаем список еды от метода eatMeat()
        List<String> actualFood = feline.eatMeat();
        // Проверяем список еды, соответствующий ожидаемому для семейства хищника
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFoodWhenAnimal() throws Exception {
        // список еды для семейства травоядного
        List<String> expectedResult = Constants.HERBIVORE_FOOD;
        //  мок-объект, чтобы метод getFood("Травоядное") возвращал ожидаемый список еды
        List<String> actualResult = feline.getFood(Constants.ANIMAL_KIND.get(0));
        // Проверяем список еды, соответствующий ожидаемому
        assertEquals("Получен некорректный список", expectedResult, actualResult);
    }

    // Тестовый метод для проверки метода getFamily() класса Feline
    @Test
    public void testGetFamily() {
        assertEquals(Constants.PREDATOR_FAMILY_KIND, feline.getFamily());
    }

    // Тестовый метод для проверки метода getKittens() класса Feline
    @Test
    public void testGetKittens() {
        assertEquals(Constants.FELINE_KITTENS, feline.getKittens());
    }
}