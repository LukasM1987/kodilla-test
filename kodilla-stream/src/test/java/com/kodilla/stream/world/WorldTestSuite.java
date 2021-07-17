package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

public class WorldTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    void testGetPeopleQuantity() {

        //Given
        World world = new World();
        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(new Country("Argentina", new BigDecimal("44082000")));
        southAmerica.addCountry(new Country("Brazil", new BigDecimal("210677000")));
        southAmerica.addCountry(new Country("Peru", new BigDecimal("33036196")));
        world.addContinent(southAmerica);

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Switzerland", new BigDecimal("8526932")));
        europe.addCountry(new Country("United Kingdom", new BigDecimal("66796800")));
        europe.addCountry(new Country("Poland", new BigDecimal("38265000")));
        world.addContinent(europe);

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1420000000")));
        asia.addCountry(new Country("India", new BigDecimal("1296384042")));
        asia.addCountry(new Country("Cambodia", new BigDecimal("15288489")));
        world.addContinent(asia);

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("3133056459");
        Assertions.assertEquals(expectedResult, worldPopulation);
    }
}
