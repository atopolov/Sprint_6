import com.example.classes.Animal;
import com.example.classes.constants.Constants;
import org.junit.Assert;
import org.junit.Test;

// тестовый класс AnimaTest
public class AnimalTest {
    // создаем объект класса Animal
    Animal animal = new Animal();

    // тестовый метод для проверки метода getFamily() класса Animal
    @Test
    public void getFamilyMessageTest() {
        // получаем фактическое сообщение при вызове метода getFamily()
        String actual = animal.getFamily();
        // ожидаемое сообщение при вызове метода getFamily()
        String expected = Constants.FAMILY_KINDS;
        // сравниваем ожидаемое и фактическое сообщения при вызове метода getFamily() с помощью Assert класса
        Assert.assertEquals(expected, actual);
    }
}