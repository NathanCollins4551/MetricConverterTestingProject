import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import org.junit.Before;


@RunWith(JUnit4.class)
public class TestConverterPathCoverage {

    private Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }

    //////////////////////////////////////////////
    // Test convertLength paths
    @Test
    public void testConvertLengthP1() {
        // P1 - 1,2,3,4,19,20,21,36
        // From inches to
        double result = converter.convertLength(364, Converter.LengthUnit.INCHES, Converter.LengthUnit.INCHES);
        assertEquals(364, result, 0.0001);
    }
    @Test
    public void testConvertLengthP2() {
        // P2 - 1,2,3,4,19,20,22,23,36
        // From inches to feet
        double result = converter.convertLength(364, Converter.LengthUnit.INCHES, Converter.LengthUnit.FEET);
        assertEquals(30.33333, result, 0.0001);
    }
    @Test
    public void testConvertLengthP3() {
        // P3 - 1,2,3,4,19,20,22,24,25,36
        // From inches to yards
        double result = converter.convertLength(364, Converter.LengthUnit.INCHES, Converter.LengthUnit.YARDS);
        assertEquals(10.11111, result, 0.0001);
    }
    @Test
    public void testConvertLengthP4() {
        // P4 - 1,2,3,4,19,20,22,24,26,27,36
        // From inches to miles
        double result = converter.convertLength(364, Converter.LengthUnit.INCHES, Converter.LengthUnit.MILES);
        assertEquals(0.005744949, result, 0.0001);
    }
    @Test
    public void testConvertLengthP5() {
        // P5 - 1,2,3,4,19,20,22,24,26,28,29,36
        // From inches to MM
        double result = converter.convertLength(364, Converter.LengthUnit.INCHES, Converter.LengthUnit.MM);
        assertEquals(9245.6, result, 0.0001);
    }
    @Test
    public void testConvertLengthP6() {
        // P6 - 1,2,3,4,19,20,22,24,26,28,30,31,36
        // From inches to CM
        double result = converter.convertLength(364, Converter.LengthUnit.INCHES, Converter.LengthUnit.CM);
        assertEquals(924.56, result, 0.0001);
    }
    @Test
    public void testConvertLengthP7() {
        // P7 - 1,2,3,4,19,20,22,24,26,28,30,32,33,36
        // From inches to M
        double result = converter.convertLength(364, Converter.LengthUnit.INCHES, Converter.LengthUnit.M);
        assertEquals(9.2456, result, 0.0001);
    }
    @Test
    public void testConvertLengthP8() {
        // P8 - 1,2,3,4,19,20,22,24,26,28,30,32,34,35,36
        // From inches to KM
        double result = converter.convertLength(364, Converter.LengthUnit.INCHES, Converter.LengthUnit.KM);
        assertEquals(0.0092456, result, 0.0001);
    }
    @Test
    public void testConvertLengthP9() {
        // P9 - 1,2,3,5,6,19,20,21,36
        // From feet to inches
        double result = converter.convertLength(4.5, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES);
        assertEquals(54, result, 0.0001);
    }
    @Test
    public void testConvertLengthP10() {
        // P10 - 1,2,3,5,6,19,20,22,23,36
        // From feet to feet
        double result = converter.convertLength(4.5, Converter.LengthUnit.FEET, Converter.LengthUnit.FEET);
        assertEquals(4.5, result, 0.0001);
    }
    @Test
    public void testConvertLengthP11() {
        // P11 - 1,2,3,5,6,19,20,22,24,25,36
        // From feet to yards
        double result = converter.convertLength(4.5, Converter.LengthUnit.FEET, Converter.LengthUnit.YARDS);
        assertEquals(1.5, result, 0.0001);
    }
    @Test
    public void testConvertLengthP12() {
        // P12 - 1,2,3,5,6,19,20,22,24,26,27,36
        // From feet to miles
        double result = converter.convertLength(4.5, Converter.LengthUnit.FEET, Converter.LengthUnit.MILES);
        assertEquals(0.0008522727, result, 0.0001);
    }
    @Test
    public void testConvertLengthP13() {
        // P13 - 1,2,3,5,6,19,20,22,24,26,28,29,36
        // From feet to MM
        double result = converter.convertLength(4.5, Converter.LengthUnit.FEET, Converter.LengthUnit.MM);
        assertEquals(1371.6, result, 0.0001);
    }
    @Test
    public void testConvertLengthP14() {
        // P14 - 1,2,3,5,6,19,20,22,24,26,28,30,31,36
        // From feet to CM
        double result = converter.convertLength(4.5, Converter.LengthUnit.FEET, Converter.LengthUnit.CM);
        assertEquals(137.16, result, 0.0001);
    }
    @Test
    public void testConvertLengthP15() {
        // P15 - 1,2,3,5,6,19,20,22,24,26,28,30,32,33,36
        // From feet to M
        double result = converter.convertLength(4.5, Converter.LengthUnit.FEET, Converter.LengthUnit.M);
        assertEquals(1.3716, result, 0.0001);
    }
    @Test
    public void testConvertLengthP16() {
        // P16 - 1,2,3,5,6,19,20,22,24,26,28,30,32,34,35,36
        // From feet to KM
        double result = converter.convertLength(4.5, Converter.LengthUnit.FEET, Converter.LengthUnit.KM);
        assertEquals(0.0013716, result, 0.0001);
    }
    @Test
    public void testConvertLengthP17() {
        // P17 - 1,2,3,5,7,8,19,20,21,36
        // From yards to inches
        double result = converter.convertLength(2.2, Converter.LengthUnit.YARDS, Converter.LengthUnit.INCHES);
        assertEquals(79.2, result, 0.0001);
    }
    @Test
    public void testConvertLengthP18() {
        // P18 - 1,2,3,5,7,8,19,20,22,23,36
        // From yards to feet
        double result = converter.convertLength(2.2, Converter.LengthUnit.YARDS, Converter.LengthUnit.FEET);
        assertEquals(6.6, result, 0.0001);
    }
    @Test
    public void testConvertLengthP19() {
        // P19 - 1,2,3,5,7,8,19,20,22,24,25,36
        // From yards to yards
        double result = converter.convertLength(2.2, Converter.LengthUnit.YARDS, Converter.LengthUnit.YARDS);
        assertEquals(2.2, result, 0.0001);
    }
    @Test
    public void testConvertLengthP20() {
        // P20 - 1,2,3,5,7,8,19,20,22,24,26,27,36
        // From yards to miles
        double result = converter.convertLength(2.2, Converter.LengthUnit.YARDS, Converter.LengthUnit.MILES);
        assertEquals(0.00125, result, 0.0001);
    }
    @Test
    public void testConvertLengthP21() {
        // P21 - 1,2,3,5,7,8,19,20,22,24,26,28,29,36
        // From yards to MM
        double result = converter.convertLength(2.2, Converter.LengthUnit.YARDS, Converter.LengthUnit.MM);
        assertEquals(2011.68, result, 0.0001);
    }
    @Test
    public void testConvertLengthP22() {
        // P22 - 1,2,3,5,7,8,19,20,22,24,26,28,30,31,36
        // From yards to CM
        double result = converter.convertLength(2.2, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM);
        assertEquals(201.168, result, 0.0001);
    }
    @Test
    public void testConvertLengthP23() {
        // P23 - 1,2,3,5,7,8,19,20,22,24,26,28,30,32,33,36
        // From yards to M
        double result = converter.convertLength(2.2, Converter.LengthUnit.YARDS, Converter.LengthUnit.M);
        assertEquals(2.01168, result, 0.0001);
    }
    @Test
    public void testConvertLengthP24() {
        // P24 - 1,2,3,5,7,8,19,20,22,24,26,28,30,32,34,35,36
        // From yards to KM
        double result = converter.convertLength(2.2, Converter.LengthUnit.YARDS, Converter.LengthUnit.KM);
        assertEquals(0.00201168, result, 0.0001);
    }
    @Test
    public void testConvertLengthP25() {
        // P25 - 1,2,3,5,7,9,10,19,20,21,36
        // From miles to inches
        double result = converter.convertLength(0.043, Converter.LengthUnit.MILES, Converter.LengthUnit.INCHES);
        assertEquals(2724.48, result, 0.0001);
    }
    @Test
    public void testConvertLengthP26() {
        // P26 - 1,2,3,5,7,9,10,19,20,22,23,36
        // From miles to feet
        double result = converter.convertLength(0.043, Converter.LengthUnit.MILES, Converter.LengthUnit.FEET);
        assertEquals(227.04, result, 0.0001);
    }
    @Test
    public void testConvertLengthP27() {
        // P27 - 1,2,3,5,7,9,10,19,20,22,24,25,36
        // From miles to yards
        double result = converter.convertLength(0.043, Converter.LengthUnit.MILES, Converter.LengthUnit.YARDS);
        assertEquals(75.68, result, 0.0001);
    }
    @Test
    public void testConvertLengthP28() {
        // P28 - 1,2,3,5,7,9,10,19,20,22,24,26,27,36
        // From miles to miles
        double result = converter.convertLength(0.043, Converter.LengthUnit.MILES, Converter.LengthUnit.MILES);
        assertEquals(0.043, result, 0.0001);
    }
    @Test
    public void testConvertLengthP29() {
        // P29 - 1,2,3,5,7,9,10,19,20,22,24,26,28,29,36
        // From miles to MM
        double result = converter.convertLength(0.043, Converter.LengthUnit.MILES, Converter.LengthUnit.MM);
        assertEquals(69201.79, result, 0.1);
    }
    @Test
    public void testConvertLengthP30() {
        // P30 - 1,2,3,5,7,9,10,19,20,22,24,26,28,30,31,36
        // From miles to CM
        double result = converter.convertLength(0.043, Converter.LengthUnit.MILES, Converter.LengthUnit.CM);
        assertEquals(6920.179, result, 0.1);
    }
    @Test
    public void testConvertLengthP31() {
        // P31 - 1,2,3,5,7,9,10,19,20,22,24,26,28,30,32,33,36
        // From miles to M
        double result = converter.convertLength(0.043, Converter.LengthUnit.MILES, Converter.LengthUnit.M);
        assertEquals(69.20179, result, 0.0001);
    }
    @Test
    public void testConvertLengthP32() {
        // P32 - 1,2,3,5,7,9,10,19,20,22,24,26,28,30,32,34,35,36
        // From miles to KM
        double result = converter.convertLength(0.043, Converter.LengthUnit.MILES, Converter.LengthUnit.KM);
        assertEquals(0.06920179, result, 0.0001);
    }
    @Test
    public void testConvertLengthP33() {
        // P33 - 1,2,3,5,7,9,11,12,19,20,21,36
        // From MM to inches
        double result = converter.convertLength(3546, Converter.LengthUnit.MM, Converter.LengthUnit.INCHES);
        assertEquals(139.6063, result, 0.0001);
    }
    @Test
    public void testConvertLengthP34() {
        // P34 - 1,2,3,5,7,9,11,12,19,20,22,23,36
        // From MM to feet
        double result = converter.convertLength(3546, Converter.LengthUnit.MM, Converter.LengthUnit.FEET);
        assertEquals(11.63386, result, 0.0001);
    }
    @Test
    public void testConvertLengthP35() {
        // P35 - 1,2,3,5,7,9,11,12,19,20,22,24,25,36
        // From MM to yards
        double result = converter.convertLength(3546, Converter.LengthUnit.MM, Converter.LengthUnit.YARDS);
        assertEquals(3.877953, result, 0.0001);
    }
    @Test
    public void testConvertLengthP36() {
        // P36 - 1,2,3,5,7,9,11,12,19,20,22,24,26,27,36
        // From MM to miles
        double result = converter.convertLength(3546, Converter.LengthUnit.MM, Converter.LengthUnit.MILES);
        assertEquals(0.002203382, result, 0.0001);
    }
    @Test
    public void testConvertLengthP37() {
        // P37 - 1,2,3,5,7,9,11,12,19,20,22,24,26,28,29,36
        // From MM to MM
        double result = converter.convertLength(3546, Converter.LengthUnit.MM, Converter.LengthUnit.MM);
        assertEquals(3546, result, 0.1);
    }
    @Test
    public void testConvertLengthP38() {
        // P38 - 1,2,3,5,7,9,11,12,19,20,22,24,26,28,30,31,36
        // From MM to CM
        double result = converter.convertLength(3546, Converter.LengthUnit.MM, Converter.LengthUnit.CM);
        assertEquals(354.6, result, 0.0001);
    }
    @Test
    public void testConvertLengthP39() {
        // P39 - 1,2,3,5,7,9,11,12,19,20,22,24,26,28,30,32,33,36
        // From MM to M
        double result = converter.convertLength(3546, Converter.LengthUnit.MM, Converter.LengthUnit.M);
        assertEquals(3.546, result, 0.0001);
    }
    @Test
    public void testConvertLengthP40() {
        // P40 - 1,2,3,5,7,9,11,12,19,20,22,24,26,28,30,32,34,35,36
        // From MM to KM
        double result = converter.convertLength(3546, Converter.LengthUnit.MM, Converter.LengthUnit.KM);
        assertEquals(0.003546, result, 0.0001);
    }
    @Test
    public void testConvertLengthP41() {
        // P41 - 1,2,3,5,7,9,11,13,14,19,20,21,36
        // From CM to inches
        double result = converter.convertLength(4056.7, Converter.LengthUnit.CM, Converter.LengthUnit.INCHES);
        assertEquals(1597.126, result, 0.0001);
    }
    @Test
    public void testConvertLengthP42() {
        // P42 - 1,2,3,5,7,9,11,13,14,19,20,22,23,36
        // From CM to feet
        double result = converter.convertLength(4056.7, Converter.LengthUnit.CM, Converter.LengthUnit.FEET);
        assertEquals(133.0938, result, 0.0001);
    }
    @Test
    public void testConvertLengthP43() {
        // P43 - 1,2,3,5,7,9,11,13,14,19,20,22,24,25,36
        // From CM to yards
        double result = converter.convertLength(4056.7, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS);
        assertEquals(44.36461, result, 0.0001);
    }
    @Test
    public void testConvertLengthP44() {
        // P44 - 1,2,3,5,7,9,11,13,14,19,20,22,24,26,27,36
        // From CM to miles
        double result = converter.convertLength(4056.7, Converter.LengthUnit.CM, Converter.LengthUnit.MILES);
        assertEquals(0.02520717, result, 0.0001);
    }
    @Test
    public void testConvertLengthP45() {
        // P45 - 1,2,3,5,7,9,11,13,14,19,20,22,24,26,28,29,36
        // From CM to MM
        double result = converter.convertLength(4056.7, Converter.LengthUnit.CM, Converter.LengthUnit.MM);
        assertEquals(40567, result, 0.1);
    }
    @Test
    public void testConvertLengthP46() {
        // P46 - 1,2,3,5,7,9,11,13,14,19,20,22,24,26,28,30,31,36
        // From CM to CM
        double result = converter.convertLength(4056.7, Converter.LengthUnit.CM, Converter.LengthUnit.CM);
        assertEquals(4056.7, result, 0.1);
    }
    @Test
    public void testConvertLengthP47() {
        // P47 - 1,2,3,5,7,9,11,13,14,19,20,22,24,26,28,30,32,33,36
        // From CM to M
        double result = converter.convertLength(4056.7, Converter.LengthUnit.CM, Converter.LengthUnit.M);
        assertEquals(40.567, result, 0.0001);
    }
    @Test
    public void testConvertLengthP48() {
        // P48 - 1,2,3,5,7,9,11,13,14,19,20,22,24,26,28,30,32,34,35,36
        // From CM to KM
        double result = converter.convertLength(4056.7, Converter.LengthUnit.CM, Converter.LengthUnit.KM);
        assertEquals(0.040567, result, 0.0001);
    }
    @Test
    public void testConvertLengthP49() {
        // P49 - 1,2,3,5,7,9,11,13,15,16,19,20,21,36
        // From M to inches
        double result = converter.convertLength(5.23, Converter.LengthUnit.M, Converter.LengthUnit.INCHES);
        assertEquals(205.9055, result, 0.0001);
    }
    @Test
    public void testConvertLengthP50() {
        // P50 - 1,2,3,5,7,9,11,13,15,16,19,20,22,23,36
        // From M to feet
        double result = converter.convertLength(5.23, Converter.LengthUnit.M, Converter.LengthUnit.FEET);
        assertEquals(17.15879, result, 0.0001);
    }
    @Test
    public void testConvertLengthP51() {
        // P51 - 1,2,3,5,7,9,11,13,15,16,19,20,22,24,25,36
        // From M to yards
        double result = converter.convertLength(5.23, Converter.LengthUnit.M, Converter.LengthUnit.YARDS);
        assertEquals(5.719598, result, 0.0001);
    }
    @Test
    public void testConvertLengthP52() {
        // P52 - 1,2,3,5,7,9,11,13,15,16,19,20,22,24,26,27,36
        // From M to miles
        double result = converter.convertLength(5.23, Converter.LengthUnit.M, Converter.LengthUnit.MILES);
        assertEquals(0.003249771, result, 0.0001);
    }
    @Test
    public void testConvertLengthP53() {
        // P53 - 1,2,3,5,7,9,11,13,15,16,19,20,22,24,26,28,29,36
        // From M to MM
        double result = converter.convertLength(5.23, Converter.LengthUnit.M, Converter.LengthUnit.MM);
        assertEquals(5230, result, 0.1);
    }
    @Test
    public void testConvertLengthP54() {
        // P54 - 1,2,3,5,7,9,11,13,15,16,19,20,22,24,26,28,30,31,36
        // From M to CM
        double result = converter.convertLength(5.23, Converter.LengthUnit.M, Converter.LengthUnit.CM);
        assertEquals(523, result, 0.0001);
    }
    @Test
    public void testConvertLengthP55() {
        // P55 - 1,2,3,5,7,9,11,13,15,16,19,20,22,24,26,28,30,32,33,36
        // From M to M
        double result = converter.convertLength(5.23, Converter.LengthUnit.M, Converter.LengthUnit.M);
        assertEquals(5.23, result, 0.0001);
    }
    @Test
    public void testConvertLengthP56() {
        // P56 - 1,2,3,5,7,9,11,13,15,16,19,20,22,24,26,28,30,32,34,35,36
        // From M to KM
        double result = converter.convertLength(5.23, Converter.LengthUnit.M, Converter.LengthUnit.KM);
        assertEquals(0.00523, result, 0.0001);
    }
    @Test
    public void testConvertLengthP57() {
        // P57 - 1,2,3,5,7,9,11,13,15,17,18,19,20,21,36
        // From KM to inches
        double result = converter.convertLength(1.3, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES);
        assertEquals(51181.1, result, 0.01);
    }
    @Test
    public void testConvertLengthP58() {
        // P58 - 1,2,3,5,7,9,11,13,15,17,18,19,20,22,23,36
        // From KM to feet
        double result = converter.convertLength(1.3, Converter.LengthUnit.KM, Converter.LengthUnit.FEET);
        assertEquals(4265.092, result, 0.0001);
    }
    @Test
    public void testConvertLengthP59() {
        // P59 - 1,2,3,5,7,9,11,13,15,17,18,19,20,22,24,25,36
        // From KM to yards
        double result = converter.convertLength(1.3, Converter.LengthUnit.KM, Converter.LengthUnit.YARDS);
        assertEquals(1421.697, result, 0.1);
    }
    @Test
    public void testConvertLengthP60() {
        // P60 - 1,2,3,5,7,9,11,13,15,17,18,19,20,22,24,26,27,36
        // From KM to miles
        double result = converter.convertLength(1.3, Converter.LengthUnit.KM, Converter.LengthUnit.MILES);
        assertEquals(0.8077825, result, 0.0001);
    }
    @Test
    public void testConvertLengthP61() {
        // P61 - 1,2,3,5,7,9,11,13,15,17,18,19,20,22,24,26,28,29,36
        // From KM to MM
        double result = converter.convertLength(1.3, Converter.LengthUnit.KM, Converter.LengthUnit.MM);
        assertEquals(1300000, result, 0.1);
    }
    @Test
    public void testConvertLengthP62() {
        // P62 - 1,2,3,5,7,9,11,13,15,17,18,19,20,22,24,26,28,30,31,36
        // From KM to CM
        double result = converter.convertLength(1.3, Converter.LengthUnit.KM, Converter.LengthUnit.CM);
        assertEquals(130000, result, 0.1);
    }
    @Test
    public void testConvertLengthP63() {
        // P63 - 1,2,3,5,7,9,11,13,15,17,18,19,20,22,24,26,28,30,32,33,36
        // From KM to M
        double result = converter.convertLength(1.3, Converter.LengthUnit.KM, Converter.LengthUnit.M);
        assertEquals(1300, result, 0.0001);
    }
    @Test
    public void testConvertLengthP64() {
        // P64 - 1,2,3,5,7,9,11,13,15,17,18,19,20,22,24,26,28,30,32,34,35,36
        // From KM to KM
        double result = converter.convertLength(1.3, Converter.LengthUnit.KM, Converter.LengthUnit.KM);
        assertEquals(1.3, result, 0.0001);
    }


    //////////////////////////////////////////////
    // Test convertWeight paths

    @Test
    public void testConvertWeightP1() {
        // P1 - 1,2,3,4,13,14,15,24
        // From pounds to pounds
        double result = converter.convertWeight(2.54, Converter.WeightUnit.POUNDS, Converter.WeightUnit.POUNDS);
        assertEquals(2.54, result, 0.1);
    }
    @Test
    public void testConvertWeightP2() {
        // P2 - 1,2,3,4,13,14,16,17,24
        // From pounds to ounces
        double result = converter.convertWeight(2.54, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES);
        assertEquals(40.64, result, 0.1);
    }
    @Test
    public void testConvertWeightP3() {
        // P3 - 1,2,3,4,13,14,16,18,19,24
        // From pounds to mg
        double result = converter.convertWeight(2.54, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG);
        assertEquals(1152125, result, 100);
    }
    @Test
    public void testConvertWeightP4() {
        // P4 - 1,2,3,4,13,14,16,18,20,21,24
        // From pounds to g
        double result = converter.convertWeight(2.54, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G);
        assertEquals(1152.1, result, 0.1);
    }
    @Test
    public void testConvertWeightP5() {
        // P5 - 1,2,3,4,13,14,16,18,20,22,23,24
        // From pounds to kg
        double result = converter.convertWeight(2.54, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG);
        assertEquals(1.152125, result, 0.1);
    }
    @Test
    public void testConvertWeightP6() {
        // P6 - 1,2,3,5,6,13,14,15,24
        // From ounces to pounds
        double result = converter.convertWeight(7.91, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS);
        assertEquals(0.494375, result, 0.0001);
    }
    @Test
    public void testConvertWeightP7() {
        // P7 - 1,2,3,5,6,13,14,16,17,24
        // From ounces to ounces
        double result = converter.convertWeight(7.91, Converter.WeightUnit.OUNCES, Converter.WeightUnit.OUNCES);
        assertEquals(7.91, result, 0.0001);
    }
    @Test
    public void testConvertWeightP8() {
        // P8 - 1,2,3,5,6,13,14,16,18,19,24
        // From ounces to mg
        double result = converter.convertWeight(7.91, Converter.WeightUnit.OUNCES, Converter.WeightUnit.MG);
        assertEquals(224245, result, 10);
    }
    @Test
    public void testConvertWeightP9() {
        // P9 - 1,2,3,5,6,13,14,16,18,20,21,24
        // From ounces to g
        double result = converter.convertWeight(7.91, Converter.WeightUnit.OUNCES, Converter.WeightUnit.G);
        assertEquals(224.24, result, 0.01);
    }
    @Test
    public void testConvertWeightP10() {
        // P10 - 1,2,3,5,6,13,14,16,18,20,22,23,24
        // From ounces to kg
        double result = converter.convertWeight(7.91, Converter.WeightUnit.OUNCES, Converter.WeightUnit.KG);
        assertEquals(0.2242447, result, 0.0001);
    }
    @Test
    public void testConvertWeightP11() {
        // P11 - 1,2,3,5,7,8,13,14,15,24
        // From mg to pounds
        double result = converter.convertWeight(500000, Converter.WeightUnit.MG, Converter.WeightUnit.POUNDS);
        assertEquals(1.102311, result, 0.0001);
    }
    @Test
    public void testConvertWeightP12() {
        // P12 - 1,2,3,5,7,8,13,14,16,17,24
        // From mg to ounces
        double result = converter.convertWeight(500000, Converter.WeightUnit.MG, Converter.WeightUnit.OUNCES);
        assertEquals(17.63698, result, 0.001);
    }
    @Test
    public void testConvertWeightP13() {
        // P13 - 1,2,3,5,7,8,13,14,16,18,19,24
        // From mg to mg
        double result = converter.convertWeight(500000, Converter.WeightUnit.MG, Converter.WeightUnit.MG);
        assertEquals(500000, result, 0.0001);
    }
    @Test
    public void testConvertWeightP14() {
        // P14 - 1,2,3,5,7,8,13,14,16,18,20,21,24
        // From mg to g
        double result = converter.convertWeight(500000, Converter.WeightUnit.MG, Converter.WeightUnit.G);
        assertEquals(500, result, 0.0001);
    }
    @Test
    public void testConvertWeightP15() {
        // P15 - 1,2,3,5,7,8,13,14,16,18,20,22,23,24
        // From mg to kg
        double result = converter.convertWeight(500000, Converter.WeightUnit.MG, Converter.WeightUnit.KG);
        assertEquals(0.5, result, 0.0001);
    }
    @Test
    public void testConvertWeightP16() {
        // P16 - 1,2,3,5,7,9,10,13,14,15,24
        // From g to pounds
        double result = converter.convertWeight(434, Converter.WeightUnit.G, Converter.WeightUnit.POUNDS);
        assertEquals(0.956806, result, 0.0001);
    }
    @Test
    public void testConvertWeightP17() {
        // P17 - 1,2,3,5,7,9,10,13,14,16,17,24
        // From g to ounces
        double result = converter.convertWeight(434, Converter.WeightUnit.G, Converter.WeightUnit.OUNCES);
        assertEquals(15.3089, result, 0.001);
    }
    @Test
    public void testConvertWeightP18() {
        // P18 - 1,2,3,5,7,9,10,13,14,16,18,19,24
        // From g to mg
        double result = converter.convertWeight(434, Converter.WeightUnit.G, Converter.WeightUnit.MG);
        assertEquals(434000, result, 0.0001);
    }
    @Test
    public void testConvertWeightP19() {
        // P19 - 1,2,3,5,7,9,10,13,14,16,18,20,21,24
        // From g to g
        double result = converter.convertWeight(434, Converter.WeightUnit.G, Converter.WeightUnit.G);
        assertEquals(434, result, 0.0001);
    }
    @Test
    public void testConvertWeightP20() {
        // P20 - 1,2,3,5,7,9,10,13,14,16,18,20,22,23,24
        // From g to kg
        double result = converter.convertWeight(434, Converter.WeightUnit.G, Converter.WeightUnit.KG);
        assertEquals(0.434, result, 0.0001);
    }
    @Test
    public void testConvertWeightP21() {
        // P21 - 1,2,3,5,7,9,11,12,13,14,15,24
        // From kg to pounds
        double result = converter.convertWeight(2.5, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS);
        assertEquals(5.51156, result, 0.1);
    }
    @Test
    public void testConvertWeightP22() {
        // P22 - 1,2,3,5,7,9,11,12,13,14,16,17,24
        // From kg to ounces
        double result = converter.convertWeight(2.5, Converter.WeightUnit.KG, Converter.WeightUnit.OUNCES);
        assertEquals(88.1849, result, 0.1);
    }
    @Test
    public void testConvertWeightP23() {
        // P23 - 1,2,3,5,7,9,11,12,13,14,16,18,19,24
        // From kg to mg
        double result = converter.convertWeight(2.5, Converter.WeightUnit.KG, Converter.WeightUnit.MG);
        assertEquals(2500000, result, 1000);
    }
    @Test
    public void testConvertWeightP24() {
        // P24 - 1,2,3,5,7,9,11,12,13,14,16,18,20,21,24
        // From kg to g
        double result = converter.convertWeight(2.5, Converter.WeightUnit.KG, Converter.WeightUnit.G);
        assertEquals(2500, result, 1);
    }
    @Test
    public void testConvertWeightP25() {
        // P25 - 1,2,3,5,7,9,11,12,13,14,16,18,20,22,23,24
        // From kg to kg
        double result = converter.convertWeight(2.5, Converter.WeightUnit.KG, Converter.WeightUnit.KG);
        assertEquals(2.5, result, 0.1);
    }

    //////////////////////////////////////////////
    // Test convertVolume paths
    //fl_oz, pint, quarts, gallons, ml, l

    @Test
    public void testConvertVolumeP1() {
        // P1 - 1,2,3,4,15,16,17,28
        // From fl_oz to fl_oz
        double result = converter.convertVolume(32, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.FLUID_OUNCES);
        assertEquals(32, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP2() {
        // P2 - 1,2,3,4,15,16,18,19,28
        // From fl_oz to pints
        double result = converter.convertVolume(32, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.PINTS);
        assertEquals(2, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP3() {
        // P3 - 1,2,3,4,15,16,18,20,21,28
        // From fl_oz to quarts
        double result = converter.convertVolume(32, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.QUARTS);
        assertEquals(1, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP4() {
        // P4 - 1,2,3,4,15,16,18,20,22,23,28
        // From fl_oz to gallons
        double result = converter.convertVolume(32, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.GALLONS);
        assertEquals(0.25, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP5() {
        // P5 - 1,2,3,4,15,16,18,20,22,24,25,28
        // From fl_oz to mL
        double result = converter.convertVolume(32, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.ML);
        assertEquals(946.4, result, 1);
    }
    @Test
    public void testConvertVolumeP6() {
        // P6 - 1,2,3,4,15,16,18,20,22,24,26,27,28
        // From fl_oz to L
        double result = converter.convertVolume(32, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L);
        assertEquals(0.9464, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP7() {
        // P7 - 1,2,3,5,6,15,16,17,28
        // From pints to fl_oz
        double result = converter.convertVolume(4.3, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.FLUID_OUNCES);
        assertEquals(68.8, result, 0.01);
    }
    @Test
    public void testConvertVolumeP8() {
        // P8 - 1,2,3,5,6,15,16,18,19,28
        // From pints to pints
        double result = converter.convertVolume(4.3, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.PINTS);
        assertEquals(4.3, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP9() {
        // P9 - 1,2,3,5,6,15,16,18,20,21,28
        // From pints to quarts
        double result = converter.convertVolume(4.3, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.QUARTS);
        assertEquals(2.15, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP10() {
        // P10 - 1,2,3,5,6,15,16,18,20,22,23,28
        // From pints to Gallons
        double result = converter.convertVolume(4.3, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.GALLONS);
        assertEquals(0.5375, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP11() {
        // P11 - 1,2,3,5,6,15,16,18,20,22,24,25,28
        // From pints to mL
        double result = converter.convertVolume(4.3, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.ML);
        assertEquals(2034.7, result, 1);
    }
    @Test
    public void testConvertVolumeP12() {
        // P12 - 1,2,3,5,6,15,16,18,20,22,24,26,27,28
        // From pints to L
        double result = converter.convertVolume(4.3, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L);
        assertEquals(2.0347, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP13() {
        // P13 - 1,2,3,5,7,8,15,16,17,28
        // From quarts to fl_oz
        double result = converter.convertVolume(0.5, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.FLUID_OUNCES);
        assertEquals(16, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP14() {
        // P14 - 1,2,3,5,7,8,15,16,18,19,28
        // From quarts to pints
        double result = converter.convertVolume(0.5, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.PINTS);
        assertEquals(1, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP15() {
        // P15 - 1,2,3,5,7,8,15,16,18,20,21,28
        // From quarts to quarts
        double result = converter.convertVolume(0.5, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.QUARTS);
        assertEquals(0.5, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP16() {
        // P16 - 1,2,3,5,7,8,15,16,18,20,22,23,28
        // From quarts to gallons
        double result = converter.convertVolume(0.5, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.GALLONS);
        assertEquals(0.125, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP17() {
        // P17 - 1,2,3,5,7,8,15,16,18,20,22,24,25,28
        // From quarts to mL
        double result = converter.convertVolume(0.5, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.ML);
        assertEquals(473.2, result, 0.1);
    }
    @Test
    public void testConvertVolumeP18() {
        // P18 - 1,2,3,5,7,8,15,16,18,20,22,24,26,27,28
        // From quarts to L
        double result = converter.convertVolume(0.5, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L);
        assertEquals(0.4732, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP19() {
        // P19 - 1,2,3,5,7,9,10,15,16,17,28
        // From gallons to fl_oz
        double result = converter.convertVolume(2, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.FLUID_OUNCES);
        assertEquals(256, result, 0.001);
    }
    @Test
    public void testConvertVolumeP20() {
        // P20 - 1,2,3,5,7,9,10,15,16,18,19,28
        // From gallons to pints
        double result = converter.convertVolume(2, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.PINTS);
        assertEquals(16, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP21() {
        // P21 - 1,2,3,5,7,9,10,15,16,18,20,21,28
        // From gallons to quarts
        double result = converter.convertVolume(2, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.QUARTS);
        assertEquals(8, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP22() {
        // P22 - 1,2,3,5,7,9,10,15,16,18,20,22,23,28
        // From gallons to gallons
        double result = converter.convertVolume(2, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.GALLONS);
        assertEquals(2, result, 0.0001);
    }
    @Test
    public void testConvertVolumeP23() {
        // P23 - 1,2,3,5,7,9,10,15,16,18,20,22,24,25,28
        // From gallons to mL
        double result = converter.convertVolume(2, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.ML);
        assertEquals(7571, result, 1);
    }
    @Test
    public void testConvertVolumeP24() {
        // P24 - 1,2,3,5,7,9,10,15,16,18,20,22,24,26,27,28
        // From gallons to L
        double result = converter.convertVolume(2, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L);
        assertEquals(7.571, result, 0.01);
    }
    @Test
    public void testConvertVolumeP25() {
        // P25 - 1,2,3,5,7,9,11,12,15,16,17,28
        // From mL to fl_oz
        double result = converter.convertVolume(3742.5, Converter.VolumeUnit.ML, Converter.VolumeUnit.FLUID_OUNCES);
        assertEquals(126.55, result, 0.01);
    }
    @Test
    public void testConvertVolumeP26() {
        // P26 - 1,2,3,5,7,9,11,12,15,16,18,19,28
        // From mL to pints
        double result = converter.convertVolume(3742.5, Converter.VolumeUnit.ML, Converter.VolumeUnit.PINTS);
        assertEquals(7.91, result, 0.01);
    }
    @Test
    public void testConvertVolumeP27() {
        // P27 - 1,2,3,5,7,9,11,12,15,16,18,20,21,28
        // From mL to quarts
        double result = converter.convertVolume(3742.5, Converter.VolumeUnit.ML, Converter.VolumeUnit.QUARTS);
        assertEquals(3.955, result, 0.01);
    }
    @Test
    public void testConvertVolumeP28() {
        // P28 - 1,2,3,5,7,9,11,12,15,16,18,20,22,23,28
        // From mL to gallons
        double result = converter.convertVolume(3742.5, Converter.VolumeUnit.ML, Converter.VolumeUnit.GALLONS);
        assertEquals(0.9887, result, 0.01);
    }
    @Test
    public void testConvertVolumeP29() {
        // P29 - 1,2,3,5,7,9,11,12,15,16,18,20,22,24,25,28
        // From mL to mL
        double result = converter.convertVolume(3742.5, Converter.VolumeUnit.ML, Converter.VolumeUnit.ML);
        assertEquals(3742.5, result, 0.01);
    }
    @Test
    public void testConvertVolumeP30() {
        // P30 - 1,2,3,5,7,9,11,12,15,16,18,20,22,24,26,27,28
        // From mL to L
        double result = converter.convertVolume(3742.5, Converter.VolumeUnit.ML, Converter.VolumeUnit.L);
        assertEquals(3.7425, result, 0.01);
    }
    @Test
    public void testConvertVolumeP31() {
        // P31 - 1,2,3,5,7,9,11,13,14,15,16,17,28
        // From L to fl_oz
        double result = converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES);
        assertEquals(33.814, result, 0.01);
    }
    @Test
    public void testConvertVolumeP32() {
        // P32 - 1,2,3,5,7,9,11,13,14,15,16,18,19,28
        // From L to pints
        double result = converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS);
        assertEquals(2.1134, result, 0.01);
    }
    @Test
    public void testConvertVolumeP33() {
        // P33 - 1,2,3,5,7,9,11,13,14,15,16,18,20,21,28
        // From L to quarts
        double result = converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.QUARTS);
        assertEquals(1.0567, result, 0.01);
    }
    @Test
    public void testConvertVolumeP34() {
        // P34 - 1,2,3,5,7,9,11,13,14,15,16,18,20,22,23,28
        // From L to gallons
        double result = converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.GALLONS);
        assertEquals(0.26417, result, 0.01);
    }
    @Test
    public void testConvertVolumeP35() {
        // P35 - 1,2,3,5,7,9,11,13,14,15,16,18,20,22,24,25,28
        // From L to mL
        double result = converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.ML);
        assertEquals(1000, result, 0.01);
    }
    @Test
    public void testConvertVolumeP36() {
        // P36 - 1,2,3,5,7,9,11,13,14,15,16,18,20,22,24,26,27,28
        // From L to L
        double result = converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.L);
        assertEquals(1, result, 0.01);
    }

    //////////////////////////////////////////////
    // Test convertTime paths


    @Test
    public void testConvertTime1() {
        // P1 - 1,2,3,4,17,18,19,32
        // From seconds to seconds
        double result = converter.convertTime(1000000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.SECONDS);
        assertEquals(1000000, result, 0.001);
    }
    @Test
    public void testConvertTime2() {
        // P2 - 1,2,3,4,17,18,20,21,32
        // From seconds to minutes
        double result = converter.convertTime(1000000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MINUTES);
        assertEquals(16667, result, 1);
    }
    @Test
    public void testConvertTime3() {
        // P3 - 1,2,3,4,17,18,20,22,23,32
        // From seconds to hours
        double result = converter.convertTime(1000000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS);
        assertEquals(277.8, result, 0.1);
    }
    @Test
    public void testConvertTime4() {
        // P4 - 1,2,3,4,17,18,20,22,24,25,32
        // From seconds to days
        double result = converter.convertTime(1000000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.DAYS);
        assertEquals(11.574, result, 0.001);
    }
    @Test
    public void testConvertTime5() {
        // P5 - 1,2,3,4,17,18,20,22,24,26,27,32
        // From seconds to weeks
        double result = converter.convertTime(1000000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.WEEKS);
        assertEquals(1.6534, result, 0.001);
    }
    @Test
    public void testConvertTime6() {
        // P6 - 1,2,3,4,17,18,20,22,24,26,28,29,32
        // From seconds to months
        double result = converter.convertTime(1000000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MONTHS);
        assertEquals(0.38026, result, 0.001);
    }
    @Test
    public void testConvertTime7() {
        // P7 - 1,2,3,4,17,18,20,22,24,26,28,30,31,32
        // From seconds to years
        double result = converter.convertTime(1000000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS);
        assertEquals(0.03169, result, 0.001);
    }
    @Test
    public void testConvertTime8() {
        // P8 - 1,2,3,5,6,17,18,19,32
        // From minutes to seconds
        double result = converter.convertTime(3400, Converter.TimeUnit.MINUTES, Converter.TimeUnit.SECONDS);
        assertEquals(204000, result, 0.001);
    }
    @Test
    public void testConvertTime9() {
        // P9 - 1,2,3,5,6,17,18,20,21,32
        // From minutes to minutes
        double result = converter.convertTime(3400, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MINUTES);
        assertEquals(3400, result, 0.001);
    }
    @Test
    public void testConvertTime10() {
        // P10 - 1,2,3,5,6,17,18,20,22,23,32
        // From minutes to hours
        double result = converter.convertTime(3400, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS);
        assertEquals(56.67, result, 0.01);
    }
    @Test
    public void testConvertTime11() {
        //P11 - 1,2,3,5,6,17,18,20,22,24,25,32
        // From minutes to days
        double result = converter.convertTime(3400, Converter.TimeUnit.MINUTES, Converter.TimeUnit.DAYS);
        assertEquals(2.361, result, 0.001);
    }
    @Test
    public void testConvertTime12() {
        // P12 - 1,2,3,5,6,17,18,20,22,24,26,27,32
        // From minutes to weeks
        double result = converter.convertTime(3400, Converter.TimeUnit.MINUTES, Converter.TimeUnit.WEEKS);
        assertEquals(0.3373, result, 0.001);
    }
    @Test
    public void testConvertTime13() {
        //P13 - 1,2,3,5,6,17,18,20,22,24,26,28,29,32
        // From minutes to months
        double result = converter.convertTime(3400, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MONTHS);
        assertEquals(0.07757, result, 0.001);
    }
    @Test
    public void testConvertTime14() {
        //P14 - 1,2,3,5,6,17,18,20,22,24,26,28,30,31,32
        // From minutes to years
        double result = converter.convertTime(3400, Converter.TimeUnit.MINUTES, Converter.TimeUnit.YEARS);
        assertEquals(0.006464, result, 0.001);
    }
    @Test
    public void testConvertTime15() {
        //P15 - 1,2,3,5,7,8,17,18,19,32
        // From hours to seconds
        double result = converter.convertTime(24, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS);
        assertEquals(86400, result, 0.001);
    }
    @Test
    public void testConvertTime16() {
        //P16 - 1,2,3,5,7,8,17,18,20,21,32
        // From hours to minutes
        double result = converter.convertTime(24, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES);
        assertEquals(1440, result, 0.001);
    }
    @Test
    public void testConvertTime17() {
        //P17 - 1,2,3,5,7,8,17,18,20,22,23,32
        // From hours to hours
        double result = converter.convertTime(24, Converter.TimeUnit.HOURS, Converter.TimeUnit.HOURS);
        assertEquals(24, result, 0.001);
    }
    @Test
    public void testConvertTime18() {
        //P18 - 1,2,3,5,7,8,17,18,20,22,24,25,32
        // From hours to days
        double result = converter.convertTime(24, Converter.TimeUnit.HOURS, Converter.TimeUnit.DAYS);
        assertEquals(1, result, 0.001);
    }
    @Test
    public void testConvertTime19() {
        //P19 - 1,2,3,5,7,8,17,18,20,22,24,26,27,32
        // From hours to weeks
        double result = converter.convertTime(24, Converter.TimeUnit.HOURS, Converter.TimeUnit.WEEKS);
        assertEquals(0.14286, result, 0.001);
    }
    @Test
    public void testConvertTime20() {
        //P20 - 1,2,3,5,7,8,17,18,20,22,24,26,28,29,32
        // From hours to months
        double result = converter.convertTime(24, Converter.TimeUnit.HOURS, Converter.TimeUnit.MONTHS);
        assertEquals(0.032854, result, 0.001);
    }
    @Test
    public void testConvertTime21() {
        //P21 - 1,2,3,5,7,8,17,18,20,22,24,26,28,30,31,32
        // From hours to years
        double result = converter.convertTime(24, Converter.TimeUnit.HOURS, Converter.TimeUnit.YEARS);
        assertEquals(0.002738, result, 0.001);
    }
    @Test
    public void testConvertTime22() {
        //P22 - 1,2,3,5,7,9,10,17,18,19,32
        // From days to seconds
        double result = converter.convertTime(5, Converter.TimeUnit.DAYS, Converter.TimeUnit.SECONDS);
        assertEquals(432000, result, 0.001);
    }
    @Test
    public void testConvertTime23() {
        //P23 - 1,2,3,5,7,9,10,17,18,20,21,32
        // From days to minutes
        double result = converter.convertTime(5, Converter.TimeUnit.DAYS, Converter.TimeUnit.MINUTES);
        assertEquals(7200, result, 0.001);
    }
    @Test
    public void testConvertTime24() {
        //P24 - 1,2,3,5,7,9,10,17,18,20,22,23,32
        // From days to hours
        double result = converter.convertTime(5, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS);
        assertEquals(120, result, 0.001);
    }
    @Test
    public void testConvertTime25() {
        //P25 - 1,2,3,5,7,9,10,17,18,20,22,24,25,32
        // From days to days
        double result = converter.convertTime(5, Converter.TimeUnit.DAYS, Converter.TimeUnit.DAYS);
        assertEquals(5, result, 0.001);
    }
    @Test
    public void testConvertTime26() {
        //P26 - 1,2,3,5,7,9,10,17,18,20,22,24,26,27,32
        // From days to weeks
        double result = converter.convertTime(5, Converter.TimeUnit.DAYS, Converter.TimeUnit.WEEKS);
        assertEquals(0.7143, result, 0.001);
    }
    @Test
    public void testConvertTime27() {
        //P27 - 1,2,3,5,7,9,10,17,18,20,22,24,26,28,29,32
        // From days to months
        double result = converter.convertTime(5, Converter.TimeUnit.DAYS, Converter.TimeUnit.MONTHS);
        assertEquals(0.16427, result, 0.001);
    }
    @Test
    public void testConvertTime28() {
        //P28 - 1,2,3,5,7,9,10,17,18,20,22,24,26,28,30,31,32
        // From days to years
        double result = converter.convertTime(5, Converter.TimeUnit.DAYS, Converter.TimeUnit.YEARS);
        assertEquals(0.01369, result, 0.001);
    }
    @Test
    public void testConvertTime29() {
        //P29 - 1,2,3,5,7,9,11,12,17,18,19,32
        // From weeks to seconds
        double result = converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.SECONDS);
        assertEquals(604800, result, 0.001);
    }
    @Test
    public void testConvertTime30() {
        //P30 - 1,2,3,5,7,9,11,12,17,18,20,21,32
        // From weeks to minutes
        double result = converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MINUTES);
        assertEquals(10080, result, 0.001);
    }
    @Test
    public void testConvertTime31() {
        //P31 - 1,2,3,5,7,9,11,12,17,18,20,22,23,32
        // From weeks to hours
        double result = converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS);
        assertEquals(168, result, 0.001);
    }
    @Test
    public void testConvertTime32() {
        //P32 - 1,2,3,5,7,9,11,12,17,18,20,22,24,25,32
        // From weeks to days
        double result = converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.DAYS);
        assertEquals(7, result, 0.001);
    }
    @Test
    public void testConvertTime33() {
        //P33 - 1,2,3,5,7,9,11,12,17,18,20,22,24,26,27,32
        // From weeks to weeks
        double result = converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.WEEKS);
        assertEquals(1, result, 0.001);
    }
    @Test
    public void testConvertTime34() {
        //P34 - 1,2,3,5,7,9,11,12,17,18,20,22,24,26,28,29,32
        // From weeks to months
        double result = converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MONTHS);
        assertEquals(0.23, result, 0.001);
    }
    @Test
    public void testConvertTime35() {
        //P35 - 1,2,3,5,7,9,11,12,17,18,20,22,24,26,28,30,31,32
        // From weeks to years
        double result = converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.YEARS);
        assertEquals(0.019165, result, 0.001);
    }
    @Test
    public void testConvertTime36() {
        //P36 - 1,2,3,5,7,9,11,13,14,17,18,19,32
        // From months to seconds
        double result = converter.convertTime(.1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.SECONDS);
        assertEquals(262980, result, 200);
    }
    @Test
    public void testConvertTime37() {
        //P37 - 1,2,3,5,7,9,11,13,14,17,18,20,21,32
        // From months to minutes
        double result = converter.convertTime(.1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MINUTES);
        assertEquals(4383, result, 10);
    }
    @Test
    public void testConvertTime38() {
        //P38 - 1,2,3,5,7,9,11,13,14,17,18,20,22,23,32
        // From months to hours
        double result = converter.convertTime(.1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS);
        assertEquals(73.05, result, 0.1);
    }
    @Test
    public void testConvertTime39() {
        //P39 - 1,2,3,5,7,9,11,13,14,17,18,20,22,24,25,32
        // From months to days
        double result = converter.convertTime(.1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.DAYS);
        assertEquals(3.044, result, 0.01);
    }
    @Test
    public void testConvertTime40() {
        //P40 - 1,2,3,5,7,9,11,13,14,17,18,20,22,24,26,27,32
        // From months to weeks
        double result = converter.convertTime(.1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.WEEKS);
        assertEquals(0.4348, result, 0.001);
    }
    @Test
    public void testConvertTime41() {
        //P41 - 1,2,3,5,7,9,11,13,14,17,18,20,22,24,26,28,29,32
        // From months to months
        double result = converter.convertTime(.1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MONTHS);
        assertEquals(0.1, result, 0.001);
    }
    @Test
    public void testConvertTime42() {
        //P42 - 1,2,3,5,7,9,11,13,14,17,18,20,22,24,26,28,30,31,32
        // From months to years
        double result = converter.convertTime(.1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.YEARS);
        assertEquals(0.008333, result, 0.001);
    }
    @Test
    public void testConvertTime43() {
        //P43 - 1,2,3,5,7,9,11,13,15,16,17,18,19,32
        // From years to seconds
        double result = converter.convertTime(0.05, Converter.TimeUnit.YEARS, Converter.TimeUnit.SECONDS);
        assertEquals(1577880, result, 1200);
    }
    @Test
    public void testConvertTime44() {
        //P44 - 1,2,3,5,7,9,11,13,15,16,17,18,20,21,32
        // From years to minutes
        double result = converter.convertTime(0.05, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES);
        assertEquals(26298, result, 100);
    }
    @Test
    public void testConvertTime45() {
        //P45 - 1,2,3,5,7,9,11,13,15,16,17,18,20,22,23,32
        // From years to hours
        double result = converter.convertTime(0.05, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS);
        assertEquals(438.3, result, 1);
    }
    @Test
    public void testConvertTime46() {
        //P46 - 1,2,3,5,7,9,11,13,15,16,17,18,20,22,24,25,32
        // From years to days
        double result = converter.convertTime(0.05, Converter.TimeUnit.YEARS, Converter.TimeUnit.DAYS);
        assertEquals(18.262, result, 0.1);
    }
    @Test
    public void testConvertTime47() {
        //P47 - 1,2,3,5,7,9,11,13,15,16,17,18,20,22,24,26,27,32
        // From years to weeks
        double result = converter.convertTime(0.05, Converter.TimeUnit.YEARS, Converter.TimeUnit.WEEKS);
        assertEquals(2.609, result, 0.01);
    }
    @Test
    public void testConvertTime48() {
        //P48 - 1,2,3,5,7,9,11,13,15,16,17,18,20,22,24,26,28,29,32
        // From years to months
        double result = converter.convertTime(0.05, Converter.TimeUnit.YEARS, Converter.TimeUnit.MONTHS);
        assertEquals(0.6, result, 0.001);
    }
    @Test
    public void testConvertTime49() {
        //P49 - 1,2,3,5,7,9,11,13,15,16,17,18,20,22,24,26,28,30,31,32
        // From years to years
        double result = converter.convertTime(0.05, Converter.TimeUnit.YEARS, Converter.TimeUnit.YEARS);
        assertEquals(0.05, result, 0.001);
    }
}
