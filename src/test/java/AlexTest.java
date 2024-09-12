import com.example.classes.Alex;
import com.example.classes.Feline;
import com.example.classes.constants.Constants;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

// Тестовый класс AlexTest
public class AlexTest {

    private Alex alex;

    // Метод @Before выполняется перед каждым тестом
    @Before
    public void setUp() throws Exception {
        alex = new Alex(Constants.ANIMAL_SEX.get(0), new Feline());
    }

    // Тестовый метод для проверки метода getFriendsList() класса Alex
    @Test
    public void testGetFriendsList_ExpectedFriends() {
        List<String> expectedFriends = Constants.ALEX_FRIENDS_LIST;
        assertEquals(expectedFriends, alex.getFriendsList());
    }

    // Тестовый метод для проверки метода getPlaceOfLiving() класса Alex
    @Test
    public void testGetPlaceOfLiving_ExpectedValue() {
        String expectedPlaceOfLiving = Constants.ALEX_PLACE_OF_LIVING;
        assertEquals(expectedPlaceOfLiving, alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        // Создаём мок-объект Feline для проверки метода getKittens
        Feline feline = Mockito.mock(Feline.class);
        // Создаём объект Alex с мок-объектом Feline
        Alex alex = new Alex(Constants.ANIMAL_SEX.get(0), feline);
        // Вызываем метод getKittens и получаем результат
        int kittens = alex.getKittens();
        // Проверяем, что метод getKittens возвращает 0
        assertEquals(Constants.ALEX_KITTENS, kittens);
    }


}