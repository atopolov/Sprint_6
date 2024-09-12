package com.example.classes.constants;

import java.util.List;

// Класс с константами
public class Constants {

    // Константы для класса Alex
    public static final String ALEX_PLACE_OF_LIVING = "Нью-Йоркский зоопарк";
    public static final List<String> ALEX_FRIENDS_LIST = List.of("Марти", "Глория", "Мелман");

    // Константы для проверки метода getKittens
    public static final int ALEX_KITTENS = 0;
    public static final int FELINE_KITTENS = 1;

    // Константы для проверки пола животного
    public static final List<String> ANIMAL_SEX = List.of("Самец", "Самка");
    public static final String ANIMAL_SEX_EXCEPTION_TEXT = "Используйте допустимые значения пола животного - самец или самка";

    // Константы для проверки типа животного
    public static final List<String> ANIMAL_KIND = List.of("Травоядное", "Хищник");
    public static final String ANIMAL_KIND_EXCEPTION_TEXT = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

    // Константы для проверки еды животного
    public static final List<String> PREDATOR_FOOD = List.of("Животные", "Птицы", "Рыба");
    public static final List<String> HERBIVORE_FOOD = List.of("Трава", "Различные растения");

    // Константы для проверки звука животного
    public static final String CAT_SOUND = "Мяу";

    // Константы для проверки семейств животных
    public static final String FAMILY_KINDS = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    public static final String PREDATOR_FAMILY_KIND = "Кошачьи";

    // Константы для проверки некорректного ввода типа животного
    public static final List<String>INVALID_ANIMAL_TEST_DATA = List.of("Predator", "Всеядное", "Undefined");






}