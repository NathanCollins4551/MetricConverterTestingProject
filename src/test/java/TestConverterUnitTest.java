import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestConverterUnitTest {

    private Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }


    /////////////////////////////////////////////////////////
    //
    // Unit Testing
    //
    // Length conversion tests


    @Test
    public void testInchesToFeet() {
        /**
         * (conversion from inches to feet)
         * Path ->
         * Inputs: {12} (12 inches)
         * Expected: [1.0] (12 inches is 1 foot)
         */
        double result = converter.convertLength(12, Converter.LengthUnit.INCHES, Converter.LengthUnit.FEET);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testFeetToInches() {
        /**
         * (conversion from feet to inches)
         * Path ->
         * Inputs: {1} (1 foot)
         * Expected: [12.0] (1 foot is 12 inches)
         */
        double result = converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES);
        assertEquals(12.0, result, 0.0001);
    }

    // Weight Conversion Tests
    @Test
    public void testPoundsToOunces() {
        /**
         * (conversion from pounds to ounces)
         * Path ->
         * Inputs: {1} (1 pound)
         * Expected: [16.0] (1 pound is 16 ounces)
         */
        double result = converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES);
        assertEquals(16.0, result, 0.0001);
    }

    @Test
    public void testOuncesToPounds() {
        /**
         * (conversion from ounces to pounds)
         * Path ->
         * Inputs: {16} (16 ounces)
         * Expected: [1.0] (16 ounces is 1 pound)
         */
        double result = converter.convertWeight(16, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testPoundsToMG() {
        /**
         * (conversion from pounds to milligrams)
         * Path ->
         * Inputs: {1} (1 pound)
         * Expected: [453600.0] (1 pound is 453,600 milligrams)
         */
        double result = converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG);
        assertEquals(453600.0, result, 0.0001);
    }

    @Test
    public void testPoundsToG() {
        /**
         * (conversion from pounds to grams)
         * Path ->
         * Inputs: {1} (1 pound)
         * Expected: [453.6] (1 pound is 453.6 grams)
         */
        double result = converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G);
        assertEquals(453.6, result, 0.0001);
    }

    @Test
    public void testPoundsToKG() {
        /**
         * (conversion from pounds to kilograms)
         * Path ->
         * Inputs: {1} (1 pound)
         * Expected: [0.4536] (1 pound is approximately 0.4536 kilograms)
         */
        double result = converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG);
        assertEquals(0.4536, result, 0.0001);
    }

    @Test
    public void testKGToPounds() {
        /**
         * (conversion from kilograms to pounds)
         * Path ->
         * Inputs: {1} (1 kilogram)
         * Expected: [2.205] (1 kilogram is approximately 2.205 pounds)
         */
        double result = converter.convertWeight(1, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS);
        assertEquals(2.205, result, 0.0001);
    }

    // Volume Conversion Tests
    @Test
    public void testFluidOuncesToL() {
        /**
         * (conversion from fluid ounces to liters)
         * Path ->
         * Inputs: {33.814} (33.814 fluid ounces)
         * Expected: [1.0] (33.814 fluid ounces is 1 liter)
         */
        double result = converter.convertVolume(33.814, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L);
        assertEquals(1.0, result, 0.0001);
    }
/*
    @Test
    public void testPintsToL() {

         //(conversion from pints to liters)
         //Path ->
         //Inputs: {2.113} (2.113 pints)
         //Expected: [1.0] (2.113 pints is 1 liter)

        double result = converter.convertVolume(2.113, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testQuartsToL() {

         //(conversion from quarts to liters)
         //Path ->
         //Inputs: {1.057} (1.057 quarts)
         //Expected: [1.0] (1.057 quarts is 1 liter)

        double result = converter.convertVolume(1.057, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testGallonsToL() {
        //
         //(conversion from gallons to liters)
         //Path ->
         //Inputs: {3} (3 gallons)
         //Expected: [11.355] (3 gallons are 11.355 liters)
         //
        double result = converter.convertVolume(3, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L);
        assertEquals(11.355, result, 0.0001);
    }
*/
    @Test
    public void testMLToL() {
        /**
         * (conversion from milliliters to liters)
         * Path ->
         * Inputs: {1000} (1000 milliliters)
         * Expected: [1.0] (1000 milliliters is 1 liter)
         */
        double result = converter.convertVolume(1000, Converter.VolumeUnit.ML, Converter.VolumeUnit.L);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testLToFluidOunces() {
        /**
         * (conversion from liters to fluid ounces)
         * Path ->
         * Inputs: {1} (1 liter)
         * Expected: [33.814] (1 liter is 33.814 fluid ounces)
         */
        double result = converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES);
        assertEquals(33.814, result, 0.0001);
    }

    // Time Conversion Tests
    @Test
    public void testSecondsToHours() {
        /**
         * (conversion from seconds to hours)
         * Path ->
         * Inputs: {3600} (3600 seconds)
         * Expected: [1.0] (3600 seconds is 1 hour)
         */
        double result = converter.convertTime(3600, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testMinutesToHours() {
        /**
         * (conversion from minutes to hours)
         * Path ->
         * Inputs: {60} (60 minutes)
         * Expected: [1.0] (60 minutes is 1 hour)
         */
        double result = converter.convertTime(60, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testHoursToSeconds() {
        /**
         * (conversion from hours to seconds)
         * Path ->
         * Inputs: {1} (1 hour)
         * Expected: [3600.0] (1 hour is 3600 seconds)
         */
        double result = converter.convertTime(1, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS);
        assertEquals(3600.0, result, 0.0001);
    }

    @Test
    public void testHoursToMinutes() {
        /**
         * (conversion from hours to minutes)
         * Path ->
         * Inputs: {1} (1 hour)
         * Expected: [60.0] (1 hour is 60 minutes)
         */
        double result = converter.convertTime(1, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES);
        assertEquals(60.0, result, 0.0001);
    }

    @Test
    public void testDaysToHours() {
        /**
         * (conversion from days to hours)
         * Path ->
         * Inputs: {1} (1 day)
         * Expected: [24.0] (1 day is 24 hours)
         */
        double result = converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS);
        assertEquals(24.0, result, 0.0001);
    }

    @Test
    public void testWeeksToHours() {
        /**
         * (conversion from weeks to hours)
         * Path ->
         * Inputs: {1} (1 week)
         * Expected: [168.0] (1 week is 168 hours)
         */
        double result = converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS);
        assertEquals(168.0, result, 0.0001);
    }

    @Test
    public void testMonthsToHours() {
        /**
         * (conversion from months to hours)
         * Path ->
         * Inputs: {1} (1 month)
         * Expected: [730.0] (1 month is 730 hours)
         */
        double result = converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS);
        assertEquals(730.0, result, 0.0001);
    }

    @Test
    public void testYearsToHours() {
        /**
         * (conversion from years to hours)
         * Path ->
         * Inputs: {1} (1 year)
         * Expected: [8760.0] (1 year is 8760 hours)
         */
        double result = converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS);
        assertEquals(8760.0, result, 0.0001);
    }




    ////////////////////////////////////////////////////////////////////////////////////////
}