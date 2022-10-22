package org.example;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

import java.time.LocalDate;

class CarTest {

    @Test
    void canMove() {

        String name = "Mazda 6";
        int gasTankVolume = 40;
        int cons = 15;
        LocalDate date = LocalDate.parse("2022-01-11");
        Car car = new Car(name, gasTankVolume, cons, date);
        assertTrue(car.canMove());

    }

    @Test
    void allowedToUse() {
        String name = "Renault Sandero";
        int gasTankVolume = 40;
        int cons = 15;
        LocalDate date = LocalDate.parse("2019-01-11");
        Car car = new Car(name, gasTankVolume, cons, date);
        assertFalse(car.allowedToUse());


    }

    @Test
    void distanceToMove() {
        String name = "Renault Sandero";
        int gasTankVolume = 15;
        int cons = 15;
        LocalDate date = LocalDate.parse("2019-01-11");
        Car car = new Car(name, gasTankVolume, cons, date);
        assertEquals(car.distanceToMove(), 100.0, 0);

    }
}