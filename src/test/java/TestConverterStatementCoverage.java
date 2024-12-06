import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestConverterStatementCoverage {

    private Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }
/*
    @Test
    public void testConvertInchesToKilometers() {
        double result = converter.convertLength(0.004, Converter.LengthUnit.INCHES, Converter.LengthUnit.KM);
        assertEquals(157.48032, result, 0.0001);
    }
    @Test
    public void testConvertFeetToMeters() {
        double result = converter.convertLength(0.004, Converter.LengthUnit.FEET, Converter.LengthUnit.M);
        assertEquals(157.48032, result, 0.0001);
    }
    @Test
    public void testConvertYardsToCentimeters() {
        double result = converter.convertLength(0.004, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM);
        assertEquals(157.48032, result, 0.0001);
    }
    @Test
    public void testConvertMilesToMillimeters() {
        double result = converter.convertLength(0.004, Converter.LengthUnit.MILES, Converter.LengthUnit.MM);
        assertEquals(157.48032, result, 0.0001);
    }
    @Test
    public void testConvertMillimetersToMile() {
        double result = converter.convertLength(0.004, Converter.LengthUnit.MM, Converter.LengthUnit.MILES);
        assertEquals(157.48032, result, 0.0001);
    }
    @Test
    public void testConvertCentimetersToYards() {
        double result = converter.convertLength(0.004, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS);
        assertEquals(4, result, 0.0001);
    }
    @Test
    public void testConvertMetersToFeet() {
        double result = converter.convertLength(0.004, Converter.LengthUnit.M, Converter.LengthUnit.FEET);
        assertEquals(157.48032, result, 0.0001);
    }
    @Test
    public void testConvertKilometersToInches() {
        double result = converter.convertLength(0.004, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES);
        assertEquals(157.48032, result, 0.0001);
    }







    //////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testConvertKilogramsToPounds() {
        double result = converter.convertWeight(2.54, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS);
        assertEquals(5.600700000000001, result, 0.1);
    }
    @Test
    public void testConvertGramsToKilograms() {
        double result = converter.convertWeight(2.54, Converter.WeightUnit.G, Converter.WeightUnit.KG);
        assertEquals(0.0025395225697568856, result, 0.1);
    }
    @Test
    public void testConvertOuncesToLiters() {
        double result = converter.convertVolume(32, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L);
        assertEquals(0.946352, result, 0.0001);
    }
    @Test
    public void testConvertLitersToPints() {
        double result = converter.convertVolume(32, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS);
        assertEquals(67.62816, result, 0.0001);
    }
    @Test
    public void testConvertSecondsToYears() {
        double result = converter.convertTime(1000000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS);
        assertEquals(0.031709791983764585, result, 0.001);
    }
    @Test
    public void testConvertYearsToMinutes() {
        double result = converter.convertTime(0.0007, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES);
        assertEquals(367.91999999999996, result, 0.001);
    }
*/
}