import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BVATesting {

    Converter converter = new Converter();

    // BVA for Length Conversion from Inches

    @Test
    public void testInchesToFeet_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.INCHES, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals(1.0, converter.convertLength(12, Converter.LengthUnit.INCHES, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals(1.7895697058333334E8, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.INCHES, Converter.LengthUnit.FEET), 0.0001);
    }

    @Test
    public void testInchesToYards_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.INCHES, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals(0.0278, converter.convertLength(1, Converter.LengthUnit.INCHES, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals(5.965232352777778E7, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.INCHES, Converter.LengthUnit.YARDS), 0.0001);
    }

    @Test
    public void testInchesToMiles_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.INCHES, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals(0.0000158, converter.convertLength(1, Converter.LengthUnit.INCHES, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals(33893.36564078283, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.INCHES, Converter.LengthUnit.MILES), 0.0001);
    }

    @Test
    public void testInchesToMillimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.INCHES, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals(25.4, converter.convertLength(1, Converter.LengthUnit.INCHES, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals(5.45460846338E10, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.INCHES, Converter.LengthUnit.MM), 0.0001);
    }

    @Test
    public void testInchesToCentimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.INCHES, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals(2.54, converter.convertLength(1, Converter.LengthUnit.INCHES, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals(5.45460846338E9, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.INCHES, Converter.LengthUnit.CM), 0.0001);
    }

    @Test
    public void testInchesToMeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.INCHES, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals(0.0254, converter.convertLength(1, Converter.LengthUnit.INCHES, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals(5.454608463380001E7, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.INCHES, Converter.LengthUnit.M), 0.0001);
    }

    @Test
    public void testInchesToKilometers_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.INCHES, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals(0.0000254, converter.convertLength(1, Converter.LengthUnit.INCHES, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals(54546.0846338, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.INCHES, Converter.LengthUnit.KM), 0.0001);
    }

    @Test
    public void testFeetToInches_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals(12.0, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 12, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES), 0.0001);
    }

    @Test
    public void testFeetToYards_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals(0.3333, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 3, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.YARDS), 0.0001);
    }

    @Test
    public void testFeetToMiles_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals(1.0, converter.convertLength(5280, Converter.LengthUnit.FEET, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 5280, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.MILES), 0.0001);
    }

    @Test
    public void testFeetToMillimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals(304.8, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 304.8, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.MM), 0.0001);
    }

    @Test
    public void testFeetToCentimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals(30.48, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 30.48, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.CM), 0.0001);
    }

    @Test
    public void testFeetToMeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals(0.3048, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.3048, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.M), 0.0001);
    }

    @Test
    public void testFeetToKilometers_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals(1.0, converter.convertLength(3280.84, Converter.LengthUnit.FEET, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0003048, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.KM), 0.0001);
    }

    @Test
    public void testYardsToInches_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals(36.0, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 36, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.INCHES), 0.0001);
    }

    @Test
    public void testYardsToFeet_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals(3.0, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.FEET), 0.0001);
    }

    @Test
    public void testYardsToMiles_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals(0.0005682, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 1760, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.MILES), 0.0001);
    }

    @Test
    public void testYardsToMillimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals(914.4, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 914.4, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.MM), 0.0001);
    }

    @Test
    public void testYardsToCentimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals(91.44, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 91.44, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM), 0.0001);
    }

    @Test
    public void testYardsToMeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals(0.9144, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.9144, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.M), 0.0001);
    }

    @Test
    public void testYardsToKilometers_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals(0.0009144, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0009144, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.KM), 0.0001);
    }

    @Test
    public void testMilesToInches_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals(63360.0, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 63360, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.INCHES), 0.0001);
    }

    @Test
    public void testMilesToFeet_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals(5280.0, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 5280, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.FEET), 0.0001);
    }

    @Test
    public void testMilesToYards_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals(1760.0, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1760, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.YARDS), 0.0001);
    }

    @Test
    public void testMilesToMillimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals(1609344.0, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1609344, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.MM), 0.0001);
    }

    @Test
    public void testMilesToCentimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals(160934.4, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 160934.4, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.CM), 0.0001);
    }

    @Test
    public void testMilesToMeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals(1609.344, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1609.344, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.M), 0.0001);
    }

    @Test
    public void testMilesToKilometers_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals(1.609344, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1.609344, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.KM), 0.0001);
    }

    @Test
    public void testMillimetersToInches_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals(0.03937, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.03937, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.INCHES), 0.0001);
    }

    @Test
    public void testMillimetersToFeet_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals(0.00328084, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00328084, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.FEET), 0.0001);
    }

    @Test
    public void testMillimetersToYards_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals(0.00109361, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00109361, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.YARDS), 0.0001);
    }

    @Test
    public void testMillimetersToMiles_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals(0.000000621371, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000000621371, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.MILES), 0.0001);
    }

    @Test
    public void testMillimetersToCentimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals(0.1, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.1, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.CM), 0.0001);
    }

    @Test
    public void testMillimetersToMeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals(0.001, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.001, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.M), 0.0001);
    }

    @Test
    public void testMillimetersToKilometers_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals(0.000001, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000001, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.KM), 0.0001);
    }

    @Test
    public void testCentimetersToInches_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals(0.3937, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.3937, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.INCHES), 0.0001);
    }

    @Test
    public void testCentimetersToFeet_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals(0.0328084, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0328084, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.FEET), 0.0001);
    }

    @Test
    public void testCentimetersToYards_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals(0.0109361, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0109361, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS), 0.0001);
    }

    @Test
    public void testCentimetersToMiles_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals(0.00000621371, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00000621371, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.MILES), 0.0001);
    }

    @Test
    public void testCentimetersToMillimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals(10.0, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 10, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.MM), 0.0001);
    }

    @Test
    public void testCentimetersToMeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals(0.01, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.01, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.M), 0.0001);
    }

    @Test
    public void testCentimetersToKilometers_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals(0.00001, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00001, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.KM), 0.0001);
    }

    @Test
    public void testMetersToInches_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals(39.3701, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 39.3701, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.INCHES), 0.0001);
    }

    @Test
    public void testMetersToFeet_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals(3.28084, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3.28084, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.FEET), 0.0001);
    }

    @Test
    public void testMetersToYards_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals(1.09361, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1.09361, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.YARDS), 0.0001);
    }

    @Test
    public void testMetersToMiles_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals(0.000621371, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000621371, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.MILES), 0.0001);
    }

    @Test
    public void testMetersToMillimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals(1000.0, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.MM), 0.0001);
    }

    @Test
    public void testMetersToCentimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals(100.0, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 100, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.CM), 0.0001);
    }

    @Test
    public void testMetersToKilometers_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals(0.001, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.KM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.001, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.KM), 0.0001);
    }

    @Test
    public void testKilometersToInches_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals(39370.1, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 39370.1, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES), 0.0001);
    }

    @Test
    public void testKilometersToFeet_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals(3280.84, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.FEET), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3280.84, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.FEET), 0.0001);
    }

    @Test
    public void testKilometersToYards_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals(1093.61, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.YARDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1093.61, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.YARDS), 0.0001);
    }

    @Test
    public void testKilometersToMiles_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals(0.621371, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.MILES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.621371, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.MILES), 0.0001);
    }

    @Test
    public void testKilometersToMillimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals(1000000.0, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.MM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000000, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.MM), 0.0001);
    }

    @Test
    public void testKilometersToCentimeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals(100000.0, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.CM), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 100000, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.CM), 0.0001);
    }

    @Test
    public void testKilometersToMeters_Boundary() {
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals(1000.0, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.M), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.M), 0.0001);
    }


    // Testing for weigth conversions

    @Test
    public void testPoundsToOunces_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES), 0.0001);
        Assert.assertEquals(16.0, converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 16, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES), 0.0001);
    }

    @Test
    public void testPoundsToMilligrams_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG), 0.0001);
        Assert.assertEquals(453600.0, converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 453600, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG), 0.0001);
    }

    @Test
    public void testPoundsToGrams_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G), 0.0001);
        Assert.assertEquals(453.6, converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 453.6, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G), 0.0001);
    }

    @Test
    public void testPoundsToKilograms_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG), 0.0001);
        Assert.assertEquals(0.4536, converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.4536, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG), 0.0001);
    }


    @Test
    public void testOuncesToPounds_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS), 0.0001);
        Assert.assertEquals(1.0, converter.convertWeight(16, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 16, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS), 0.0001);
    }

    @Test
    public void testOuncesToMilligrams_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.OUNCES, Converter.WeightUnit.MG), 0.0001);
        Assert.assertEquals(28349.5, converter.convertWeight(1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.MG), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 28349.5, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.MG), 0.0001);
    }

    @Test
    public void testOuncesToGrams_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.OUNCES, Converter.WeightUnit.G), 0.0001);
        Assert.assertEquals(28.3495, converter.convertWeight(1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.G), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 28.3495, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.G), 0.0001);
    }

    @Test
    public void testOuncesToKilograms_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.OUNCES, Converter.WeightUnit.KG), 0.0001);
        Assert.assertEquals(0.0283495, converter.convertWeight(1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.KG), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0283495, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.KG), 0.0001);
    }

    @Test
    public void testMilligramsToPounds_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.MG, Converter.WeightUnit.POUNDS), 0.0001);
        Assert.assertEquals(0.00000220462, converter.convertWeight(1, Converter.WeightUnit.MG, Converter.WeightUnit.POUNDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00000220462, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.POUNDS), 0.0001);
    }

    @Test
    public void testMilligramsToOunces_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.MG, Converter.WeightUnit.OUNCES), 0.0001);
        Assert.assertEquals(0.00003527396, converter.convertWeight(1, Converter.WeightUnit.MG, Converter.WeightUnit.OUNCES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00003527396, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.OUNCES), 0.0001);
    }

    @Test
    public void testMilligramsToGrams_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.MG, Converter.WeightUnit.G), 0.0001);
        Assert.assertEquals(0.001, converter.convertWeight(1, Converter.WeightUnit.MG, Converter.WeightUnit.G), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.001, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.G), 0.0001);
    }

    @Test
    public void testMilligramsToKilograms_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.MG, Converter.WeightUnit.KG), 0.0001);
        Assert.assertEquals(0.000001, converter.convertWeight(1, Converter.WeightUnit.MG, Converter.WeightUnit.KG), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000001, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.KG), 0.0001);
    }

    @Test
    public void testGramsToPounds_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.G, Converter.WeightUnit.POUNDS), 0.0001);
        Assert.assertEquals(0.00220462, converter.convertWeight(1, Converter.WeightUnit.G, Converter.WeightUnit.POUNDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00220462, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.POUNDS), 0.0001);
    }

    @Test
    public void testGramsToOunces_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.G, Converter.WeightUnit.OUNCES), 0.0001);
        Assert.assertEquals(0.03527396, converter.convertWeight(1, Converter.WeightUnit.G, Converter.WeightUnit.OUNCES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.03527396, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.OUNCES), 0.0001);
    }

    @Test
    public void testGramsToMilligrams_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.G, Converter.WeightUnit.MG), 0.0001);
        Assert.assertEquals(1000.0, converter.convertWeight(1, Converter.WeightUnit.G, Converter.WeightUnit.MG), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.MG), 0.0001);
    }

    @Test
    public void testGramsToKilograms_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.G, Converter.WeightUnit.KG), 0.0001);
        Assert.assertEquals(0.001, converter.convertWeight(1, Converter.WeightUnit.G, Converter.WeightUnit.KG), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.001, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.KG), 0.0001);
    }

    @Test
    public void testKilogramsToPounds_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS), 0.0001);
        Assert.assertEquals(2.20462, converter.convertWeight(1, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 2.20462, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS), 0.0001);
    }

    @Test
    public void testKilogramsToOunces_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.KG, Converter.WeightUnit.OUNCES), 0.0001);
        Assert.assertEquals(35.27396, converter.convertWeight(1, Converter.WeightUnit.KG, Converter.WeightUnit.OUNCES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 35.27396, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.OUNCES), 0.0001);
    }

    @Test
    public void testKilogramsToMilligrams_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.KG, Converter.WeightUnit.MG), 0.0001);
        Assert.assertEquals(1000000.0, converter.convertWeight(1, Converter.WeightUnit.KG, Converter.WeightUnit.MG), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000000, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.MG), 0.0001);
    }

    @Test
    public void testKilogramsToGrams_Boundary() {
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.KG, Converter.WeightUnit.G), 0.0001);
        Assert.assertEquals(1000.0, converter.convertWeight(1, Converter.WeightUnit.KG, Converter.WeightUnit.G), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.G), 0.0001);
    }


    // Volume conversion testings

    @Test
    public void testFluidOuncesToLiters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals(0.0295735, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0295735, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L), 0.0001);
    }

    @Test
    public void testFluidOuncesToMilliliters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals(29.5735, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 29.5735, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.ML), 0.0001);
    }

    @Test
    public void testFluidOuncesToPints_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals(0.0625, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0625, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.PINTS), 0.0001);
    }

    @Test
    public void testFluidOuncesToQuarts_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals(0.03125, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.03125, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.QUARTS), 0.0001);
    }

    @Test
    public void testFluidOuncesToGallons_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals(0.0078125, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0078125, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.GALLONS), 0.0001);
    }

    @Test
    public void testPintsToFluidOunces_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
        Assert.assertEquals(16.0, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 16, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
    }

    @Test
    public void testPintsToLiters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals(0.473176, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.473176, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L), 0.0001);
    }

    @Test
    public void testPintsToMilliliters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals(473.176, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 473.176, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.ML), 0.0001);
    }

    @Test
    public void testPintsToQuarts_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals(0.5, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.5, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.QUARTS), 0.0001);
    }

    @Test
    public void testPintsToGallons_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals(0.125, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.125, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.GALLONS), 0.0001);
    }

    @Test
    public void testQuartsToFluidOunces_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
        Assert.assertEquals(32.0, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 32, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
    }

    @Test
    public void testQuartsToLiters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals(0.946353, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.946353, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L), 0.0001);
    }

    @Test
    public void testQuartsToMilliliters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals(946.353, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 946.353, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.ML), 0.0001);
    }

    @Test
    public void testQuartsToPints_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals(2.0, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 2, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.PINTS), 0.0001);
    }

    @Test
    public void testQuartsToGallons_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals(0.25, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.25, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.GALLONS), 0.0001);
    }

    @Test
    public void testGallonsToFluidOunces_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
        Assert.assertEquals(128.0, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.FLUID_OUNCES), 0.1);
        Assert.assertEquals((double) Integer.MAX_VALUE * 128, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.FLUID_OUNCES), 0.00006);
    }

    @Test
    public void testGallonsToLiters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals(3.78541, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3.78541, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L), 0.0001);
    }

    @Test
    public void testGallonsToMilliliters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals(3785.41, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3785.41, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.ML), 0.0001);
    }

    @Test
    public void testGallonsToPints_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals(8.0, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 8, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.PINTS), 0.0001);
    }

    @Test
    public void testGallonsToQuarts_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals(4.0, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 4, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.QUARTS), 0.0001);
    }

    @Test
    public void testMillilitersToLiters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals(1.0, converter.convertVolume(1000, Converter.VolumeUnit.ML, Converter.VolumeUnit.L), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 1000, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.L), 0.0001);
    }

    @Test
    public void testMillilitersToFluidOunces_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
        Assert.assertEquals(0.033814, converter.convertVolume(1, Converter.VolumeUnit.ML, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.033814, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
    }

    @Test
    public void testMillilitersToPints_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals(0.00211338, converter.convertVolume(1, Converter.VolumeUnit.ML, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00211338, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.PINTS), 0.0001);
    }

    @Test
    public void testMillilitersToQuarts_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals(0.00105669, converter.convertVolume(1, Converter.VolumeUnit.ML, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00105669, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.QUARTS), 0.0001);
    }

    @Test
    public void testMillilitersToGallons_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals(0.000264172, converter.convertVolume(1, Converter.VolumeUnit.ML, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000264172, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.GALLONS), 0.0001);
    }

    @Test
    public void testLitersToMilliliters_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals(1000.0, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.ML), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.ML), 0.0001);
    }

    @Test
    public void testLitersToFluidOunces_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
        Assert.assertEquals(33.814, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 33.814, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES), 0.0001);
    }

    @Test
    public void testLitersToPints_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals(2.11338, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 2.11338, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS), 0.0001);
    }

    @Test
    public void testLitersToQuarts_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals(1.05669, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.QUARTS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1.05669, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.QUARTS), 0.0001);
    }

    @Test
    public void testLitersToGallons_Boundary() {
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals(0.264172, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.GALLONS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.264172, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.GALLONS), 0.0001);
    }

    // test for time conversion

    @Test
    public void testSecondsToMinutes_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(60, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 60, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MINUTES), 0.0001);
    }

    @Test
    public void testSecondsToHours_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(3600, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 3600, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS), 0.0001);
    }

    @Test
    public void testSecondsToDays_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(86400, Converter.TimeUnit.SECONDS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 86400, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.DAYS), 0.0001);
    }

    @Test
    public void testSecondsToWeeks_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(604800, Converter.TimeUnit.SECONDS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 604800, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.WEEKS), 0.0001);
    }

    @Test
    public void testSecondsToMonths_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(2628000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 2628000, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MONTHS), 0.0001);
    }

    @Test
    public void testSecondsToYears_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(31536000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 31536000, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS), 0.0001);
    }

    @Test
    public void testMinutesToSeconds_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals(60.0, converter.convertTime(1, Converter.TimeUnit.MINUTES, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 60, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.SECONDS), 0.0001);
    }

    @Test
    public void testMinutesToHours_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(60, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 60, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS), 0.0001);
    }

    @Test
    public void testMinutesToDays_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(1440, Converter.TimeUnit.MINUTES, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 1440, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.DAYS), 0.0001);
    }

    @Test
    public void testMinutesToWeeks_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(10080, Converter.TimeUnit.MINUTES, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 10080, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.WEEKS), 0.0001);
    }

    @Test
    public void testMinutesToMonths_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(43800, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 43800, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MONTHS), 0.0001);
    }

    @Test
    public void testMinutesToYears_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(525600, Converter.TimeUnit.MINUTES, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 525600, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.YEARS), 0.0001);
    }

    @Test
    public void testHoursToSeconds_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals(3600.0, converter.convertTime(1, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3600, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS), 0.0001);
    }

    @Test
    public void testHoursToMinutes_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals(60.0, converter.convertTime(1, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 60, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES), 0.0001);
    }

    @Test
    public void testHoursToDays_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(24, Converter.TimeUnit.HOURS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 24, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.DAYS), 0.0001);
    }

    @Test
    public void testHoursToWeeks_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(168, Converter.TimeUnit.HOURS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 168, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.WEEKS), 0.0001);
    }

    @Test
    public void testHoursToMonths_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(730, Converter.TimeUnit.HOURS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 730, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.MONTHS), 0.0001);
    }

    @Test
    public void testHoursToYears_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals(1.0, converter.convertTime(8760, Converter.TimeUnit.HOURS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 8760, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.YEARS), 0.0001);
    }

    @Test
    public void testDaysToSeconds_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals(86400.0, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 86400, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.SECONDS), 0.0001);
    }

    @Test
    public void testDaysToMinutes_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals(1440.0, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1440, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.MINUTES), 0.0001);
    }

    @Test
    public void testDaysToHours_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals(24.0, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 24, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS), 0.0001);
    }

    @Test
    public void testDaysToWeeks_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals(0.142857, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 7, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.WEEKS), 0.0001);
    }

    @Test
    public void testDaysToMonths_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals(0.0328767, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 30.4167, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.MONTHS), 0.0001);
    }

    @Test
    public void testDaysToYears_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals(0.00273973, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 365.25, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.YEARS), 0.0001);
    }

    @Test
    public void testWeeksToSeconds_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals(604800.0, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 604800, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.SECONDS), 0.0001);
    }

    @Test
    public void testWeeksToMinutes_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals(10080.0, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 10080, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MINUTES), 0.0001);
    }

    @Test
    public void testWeeksToHours_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals(168.0, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 168, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS), 0.0001);
    }

    @Test
    public void testWeeksToDays_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals(7.0, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 7, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.DAYS), 0.0001);
    }

    @Test
    public void testWeeksToMonths_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals(0.230137, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 4.34524, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MONTHS), 0.0001);
    }

    @Test
    public void testWeeksToYears_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals(0.0191781, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 52.1775, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.YEARS), 0.0001);
    }

    @Test
    public void testMonthsToSeconds_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals(2628000.0, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 2628000, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.SECONDS), 0.0001);
    }

    @Test
    public void testMonthsToMinutes_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals(43800.0, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 43800, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MINUTES), 0.0001);
    }

    @Test
    public void testMonthsToHours_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals(730.0, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 730, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS), 0.0001);
    }

    @Test
    public void testMonthsToDays_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals(30.4167, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 30.4167, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.DAYS), 0.0001);
    }

    @Test
    public void testMonthsToWeeks_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals(4.34524, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 4.34524, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.WEEKS), 0.0001);
    }

    @Test
    public void testMonthsToYears_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals(0.0833333, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.YEARS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE / 12, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.YEARS), 0.0001);
    }

    @Test
    public void testYearsToSeconds_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals(31536000.0, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.SECONDS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 31536000, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.SECONDS), 0.0001);
    }

    @Test
    public void testYearsToMinutes_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals(525600.0, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 525600, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES), 0.0001);
    }

    @Test
    public void testYearsToHours_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals(8760.0, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 8760, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS), 0.0001);
    }

    @Test
    public void testYearsToDays_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals(365, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.DAYS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 365, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.DAYS), 0.1);
    }

    @Test
    public void testYearsToWeeks_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals(52.142857142857146, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.WEEKS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 52.142857142857146, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.WEEKS), 0.0001);
    }

    @Test
    public void testYearsToMonths_Boundary() {
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals(12.0, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.MONTHS), 0.0001);
        Assert.assertEquals((double) Integer.MAX_VALUE * 12, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.MONTHS), 0.0001);
    }


}
