package com.company.entities;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Кобзарь on 24/09/2016.
 */
public class DriverTests {
    Vehicle vehicle;
    Driver driver;
    String from;
    String where;
    Human human = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
    List<DriverLicense.Category> categoty = new ArrayList<DriverLicense.Category>();
    DriverLicense driverLicense = new DriverLicense();


    @Test
    public void checkAmountOfDriverLicanseForOneDriverTest() {

        List<DriverLicense.Category> categoty1 = new ArrayList<DriverLicense.Category>();
        categoty1.add(DriverLicense.Category.A);

        categoty.add(DriverLicense.Category.A);
        categoty.add(DriverLicense.Category.A);
        categoty.add(DriverLicense.Category.A);

        driverLicense.setCategories(categoty);
        driver = new Driver(human, new DriverLicense(new Date(), categoty, new Date()));
        Assert.assertEquals(categoty1, categoty);
    }

    @Test
    public void driverLicenseDateCheckTest() {
        Date fromdate = new Date(2012, 12, 1);
        driverLicense.setFromDate(fromdate);
        Date expdate = new Date(2011, 11, 1);
        driverLicense.setExpires(expdate);
        driverLicense = new DriverLicense(driverLicense.getFromDate(), categoty, driverLicense.getExpires());
        Assert.assertTrue(driverLicense.getExpires().before(driverLicense.getFromDate()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void driverLicenseDoesntMatchTest() {
        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(),
                DriverLicense.Category.A, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C,
                1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car, johnDriver, "Troeshina", "Klovska");
    }

    @Test(expected = IllegalArgumentException.class)
    public void driverDriverWithSeveralNotMatchingLicenseTest() {
        categoty.add(DriverLicense.Category.A);
        categoty.add(DriverLicense.Category.B);
        categoty.add(DriverLicense.Category.C);
        driverLicense.setCategories(categoty);
        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(),
                categoty, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.D,
                1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car, johnDriver, "Troeshina", "Klovska");
        Assert.assertTrue(categoty.contains(car.getCategory()));
    }

    @Test
    public void driverDriverWithSeveralLicenseTest() {
        categoty.add(DriverLicense.Category.A);
        categoty.add(DriverLicense.Category.B);
        categoty.add(DriverLicense.Category.C);
        driverLicense.setCategories(categoty);
        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(),
                categoty, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C,
                1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car, johnDriver, "Troeshina", "Klovska");
        Assert.assertTrue(categoty.contains(car.getCategory()));
    }
}