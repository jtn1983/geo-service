package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    void byIp_rus() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Country expected = Country.RUSSIA;

        Country result = geoService.byIp("172.").getCountry();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void byIp_eng() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Country expected = Country.USA;

        Country result = geoService.byIp("96.").getCountry();

        Assertions.assertEquals(expected, result);
    }
}