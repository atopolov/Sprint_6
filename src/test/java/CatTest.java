import com.example.classes.Cat;
import com.example.classes.Feline;
import com.example.classes.constants.Constants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

// использую MockitoJUnitRunner
@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    //  мок-объект класса Feline
    @Mock
    private Feline predator;

    // переменная для объекта Cat
    private Cat cat;

    // Метод @Before выполняется перед каждым тестом
    @Before
    public void setUp() {
        // новый объект Cat с  мок-объектом predator
        cat = new Cat(predator);
    }

    // тестовый метод для проверки возврата строки "Мяу"
    @Test
    public void testGetSound() {
        // проверка возврата строки "Мяу"
        assertEquals(Constants.CAT_SOUND, cat.getSound());
    }

    // тестовый метод для проверки метода getFood() класса Cat
    @Test
    public void testGetFood() throws Exception {
        // список еды для кота
        List<String> expectedFood = Constants.PREDATOR_FOOD;
        //  мок-объект, чтобы метод eatMeat() возвращал ожидаемый список еды
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);
        // Получаем фактический список еды от метода getFood()
        List<String> actual = cat.getFood();
        // Проверяем списка еды который соответствует ожидаемому
        assertEquals(expectedFood, actual);
    }
}