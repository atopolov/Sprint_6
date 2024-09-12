import com.example.classes.constants.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.example.classes.Feline;

// Аннотация @RunWith сообщает JUnit использовать Parameterized тестовый класс
@RunWith(Parameterized.class)
public class InvalidAnimalTest {
    //
    private final String animalKind;

    // Конструктор с параметром animalKind для тестового метода
    public InvalidAnimalTest(String animalKind) {
        this.animalKind = animalKind;
    }

    // Аннотация @Parameterized.Parameters указывает, что этот метод предоставляет параметры для тестов
    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[] invalidFelineAnimalKind() {
        return new Object[]{
                null,
                Constants.INVALID_ANIMAL_TEST_DATA.get(0),
                Constants.INVALID_ANIMAL_TEST_DATA.get(1),
                Constants.INVALID_ANIMAL_TEST_DATA.get(2),
        };
    }

    // Тестовый метод для проверки ввода некорректных значений
    @Test(expected = Exception.class)
    public void getInvalidAnimalFoodTest() throws Exception {
        Feline feline = new Feline();
        feline.getFood(animalKind);
    }
}