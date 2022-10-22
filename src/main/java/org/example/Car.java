package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
@AllArgsConstructor
public class Car {
    private String carName;
    private int gasTankVolume;
    private int consumptionPer100Km;
    private LocalDate inspection;

    public boolean canMove(){
        if(gasTankVolume > 0) {
            return true;
        }
        return false;
    }

    public boolean allowedToUse() {
        long diff = ChronoUnit.YEARS.between(inspection, LocalDate.now());
        return diff <= 2;
    }

    public double distanceToMove() {
        double consPer1Km = consumptionPer100Km / 100.0;
        return gasTankVolume / consPer1Km;

    }


    public static void main(String[] args) {

    }



}