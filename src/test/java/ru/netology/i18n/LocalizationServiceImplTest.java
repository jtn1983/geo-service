package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void locale_rus() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expected = "Добро пожаловать";
        String result = localizationService.locale(Country.RUSSIA);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void locale_eng() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expected = "Welcome";
        String result = localizationService.locale(Country.USA);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void locale_other() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expected = "Welcome";
        String result = localizationService.locale(Country.GERMANY);
        Assertions.assertEquals(expected, result);
    }
}