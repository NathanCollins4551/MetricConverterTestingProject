import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RobustWorstCaseBVA {

    Converter converter = new Converter();

    // Test conversion from feet to inches (Robust Worst Case)
    @Test
    public void testFeetToInches_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals(12.0, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 12, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.INCHES);
        });
    }

    // Test conversion from feet to yards (Robust Worst Case)
    @Test
    public void testFeetToYards_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.FEET, Converter.LengthUnit.YARDS);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals(0.333333, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 3, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.YARDS);
        });
    }

    // Test conversion from feet to miles (Robust Worst Case)
    @Test
    public void testFeetToMiles_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.FEET, Converter.LengthUnit.MILES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals(0.000189394, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 5280, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.MILES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.MILES);
        });
    }

    // Test conversion from feet to millimeters (Robust Worst Case)
    @Test
    public void testFeetToMillimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.FEET, Converter.LengthUnit.MM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals(304.8, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 304.8, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.MM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.MM);
        });
    }

    // Test conversion from feet to centimeters (Robust Worst Case)
    @Test
    public void testFeetToCentimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.FEET, Converter.LengthUnit.CM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals(30.48, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 30.48, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.CM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.CM);
        });
    }

    // Test conversion from feet to meters (Robust Worst Case)
    @Test
    public void testFeetToMeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.FEET, Converter.LengthUnit.M);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals(0.3048, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.3048, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.M), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.M);
        });
    }

    // Test conversion from feet to kilometers (Robust Worst Case)
    @Test
    public void testFeetToKilometers_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.FEET, Converter.LengthUnit.KM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.FEET, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals(0.0003048, converter.convertLength(1, Converter.LengthUnit.FEET, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0003048, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.KM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.FEET, Converter.LengthUnit.KM);
        });
    }

    // Test conversion from yards to inches (Robust Worst Case)
    @Test
    public void testYardsToInches_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.YARDS, Converter.LengthUnit.INCHES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals(36.0, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 36, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.INCHES);
        });
    }

    // Test conversion from yards to feet (Robust Worst Case)
    @Test
    public void testYardsToFeet_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.YARDS, Converter.LengthUnit.FEET);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals(3.0, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.FEET), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.FEET);
        });
    }

    // Test conversion from yards to miles (Robust Worst Case)
    @Test
    public void testYardsToMiles_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.YARDS, Converter.LengthUnit.MILES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals(0.000568182, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 1760, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.MILES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.MILES);
        });
    }

    // Test conversion from yards to millimeters (Robust Worst Case)
    @Test
    public void testYardsToMillimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.YARDS, Converter.LengthUnit.MM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals(914.4, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 914.4, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.MM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.MM);
        });
    }

    // Test conversion from yards to centimeters (Robust Worst Case)
    @Test
    public void testYardsToCentimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals(91.44, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 91.44, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.CM);
        });
    }

    // Test conversion from yards to meters (Robust Worst Case)
    @Test
    public void testYardsToMeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.YARDS, Converter.LengthUnit.M);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals(0.9144, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.9144, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.M), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.M);
        });
    }

    // Test conversion from yards to kilometers (Robust Worst Case)
    @Test
    public void testYardsToKilometers_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.YARDS, Converter.LengthUnit.KM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.YARDS, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals(0.0009144, converter.convertLength(1, Converter.LengthUnit.YARDS, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0009144, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.KM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.YARDS, Converter.LengthUnit.KM);
        });
    }

    // Test conversion from miles to inches (Robust Worst Case)
    @Test
    public void testMilesToInches_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MILES, Converter.LengthUnit.INCHES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals(63360.0, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 63360, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.INCHES);
        });
    }

    // Test conversion from miles to feet (Robust Worst Case)
    @Test
    public void testMilesToFeet_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MILES, Converter.LengthUnit.FEET);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals(5280.0, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 5280, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.FEET), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.FEET);
        });
    }

    // Test conversion from miles to yards (Robust Worst Case)
    @Test
    public void testMilesToYards_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MILES, Converter.LengthUnit.YARDS);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals(1760.0, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1760, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.YARDS);
        });
    }

    // Test conversion from miles to millimeters (Robust Worst Case)
    @Test
    public void testMilesToMillimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MILES, Converter.LengthUnit.MM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals(1609344.0, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1609344, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.MM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.MM);
        });
    }

    // Test conversion from miles to centimeters (Robust Worst Case)
    @Test
    public void testMilesToCentimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MILES, Converter.LengthUnit.CM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals(160934.4, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 160934.4, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.CM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.CM);
        });
    }

    // Test conversion from miles to meters (Robust Worst Case)
    @Test
    public void testMilesToMeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MILES, Converter.LengthUnit.M);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals(1609.344, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1609.344, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.M), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.M);
        });
    }

    // Test conversion from miles to kilometers (Robust Worst Case)
    @Test
    public void testMilesToKilometers_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MILES, Converter.LengthUnit.KM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MILES, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals(1.609344, converter.convertLength(1, Converter.LengthUnit.MILES, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1.609344, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.KM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MILES, Converter.LengthUnit.KM);
        });
    }

    // Test conversion from millimeters to inches (Robust Worst Case)
    @Test
    public void testMillimetersToInches_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MM, Converter.LengthUnit.INCHES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals(0.0393701, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0393701, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.INCHES);
        });
    }

    // Test conversion from millimeters to feet (Robust Worst Case)
    @Test
    public void testMillimetersToFeet_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MM, Converter.LengthUnit.FEET);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals(0.00328084, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00328084, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.FEET), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.FEET);
        });
    }

    // Test conversion from millimeters to yards (Robust Worst Case)
    @Test
    public void testMillimetersToYards_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MM, Converter.LengthUnit.YARDS);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals(0.00109361, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00109361, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.YARDS);
        });
    }

    // Test conversion from millimeters to miles (Robust Worst Case)
    @Test
    public void testMillimetersToMiles_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MM, Converter.LengthUnit.MILES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals(0.000000621371, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000000621371, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.MILES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.MILES);
        });
    }

    // Test conversion from millimeters to centimeters (Robust Worst Case)
    @Test
    public void testMillimetersToCentimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MM, Converter.LengthUnit.CM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals(0.1, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.1, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.CM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.CM);
        });
    }

    // Test conversion from millimeters to meters (Robust Worst Case)
    @Test
    public void testMillimetersToMeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MM, Converter.LengthUnit.M);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals(0.001, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.001, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.M), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.M);
        });
    }

    // Test conversion from millimeters to kilometers (Robust Worst Case)
    @Test
    public void testMillimetersToKilometers_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.MM, Converter.LengthUnit.KM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.MM, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals(0.000001, converter.convertLength(1, Converter.LengthUnit.MM, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000001, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.KM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.MM, Converter.LengthUnit.KM);
        });
    }

    // Test conversion from centimeters to inches (Robust Worst Case)
    @Test
    public void testCentimetersToInches_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.CM, Converter.LengthUnit.INCHES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals(0.393701, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.393701, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.INCHES);
        });
    }

    // Test conversion from centimeters to feet (Robust Worst Case)
    @Test
    public void testCentimetersToFeet_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.CM, Converter.LengthUnit.FEET);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals(0.0328084, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0328084, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.FEET), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.FEET);
        });
    }

    // Test conversion from centimeters to yards (Robust Worst Case)
    @Test
    public void testCentimetersToYards_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals(0.0109361, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0109361, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.YARDS);
        });
    }

    // Test conversion from centimeters to miles (Robust Worst Case)
    @Test
    public void testCentimetersToMiles_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.CM, Converter.LengthUnit.MILES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals(0.00000621371, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00000621371, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.MILES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.MILES);
        });
    }

    // Test conversion from centimeters to millimeters (Robust Worst Case)
    @Test
    public void testCentimetersToMillimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.CM, Converter.LengthUnit.MM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals(10.0, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 10, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.MM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.MM);
        });
    }

    // Test conversion from centimeters to meters (Robust Worst Case)
    @Test
    public void testCentimetersToMeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.CM, Converter.LengthUnit.M);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals(0.01, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.01, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.M), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.M);
        });
    }

    // Test conversion from centimeters to kilometers (Robust Worst Case)
    @Test
    public void testCentimetersToKilometers_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.CM, Converter.LengthUnit.KM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.CM, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals(0.00001, converter.convertLength(1, Converter.LengthUnit.CM, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00001, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.KM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.CM, Converter.LengthUnit.KM);
        });
    }

    // Test conversion from meters to inches (Robust Worst Case)
    @Test
    public void testMetersToInches_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.M, Converter.LengthUnit.INCHES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals(39.3701, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 39.3701, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.INCHES);
        });
    }

    // Test conversion from meters to feet (Robust Worst Case)
    @Test
    public void testMetersToFeet_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.M, Converter.LengthUnit.FEET);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals(3.28084, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3.28084, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.FEET), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.FEET);
        });
    }

    // Test conversion from meters to yards (Robust Worst Case)
    @Test
    public void testMetersToYards_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.M, Converter.LengthUnit.YARDS);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals(1.09361, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1.09361, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.YARDS);
        });
    }

    // Test conversion from meters to miles (Robust Worst Case)
    @Test
    public void testMetersToMiles_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.M, Converter.LengthUnit.MILES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals(0.000621371, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000621371, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.MILES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.MILES);
        });
    }

    // Test conversion from meters to millimeters (Robust Worst Case)
    @Test
    public void testMetersToMillimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.M, Converter.LengthUnit.MM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals(1000.0, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.MM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.MM);
        });
    }

    // Test conversion from meters to centimeters (Robust Worst Case)
    @Test
    public void testMetersToCentimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.M, Converter.LengthUnit.CM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals(100.0, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 100, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.CM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.CM);
        });
    }

    // Test conversion from meters to kilometers (Robust Worst Case)
    @Test
    public void testMetersToKilometers_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.M, Converter.LengthUnit.KM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.M, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals(0.001, converter.convertLength(1, Converter.LengthUnit.M, Converter.LengthUnit.KM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.001, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.KM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.M, Converter.LengthUnit.KM);
        });
    }

    // Test conversion from kilometers to inches (Robust Worst Case)
    @Test
    public void testKilometersToInches_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals(39370.1, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 39370.1, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.INCHES);
        });
    }

    // Test conversion from kilometers to feet (Robust Worst Case)
    @Test
    public void testKilometersToFeet_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.KM, Converter.LengthUnit.FEET);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals(3280.84, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.FEET), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3280.84, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.FEET), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.FEET);
        });
    }

    // Test conversion from kilometers to yards (Robust Worst Case)
    @Test
    public void testKilometersToYards_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.KM, Converter.LengthUnit.YARDS);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals(1093.61, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1093.61, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.YARDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.YARDS);
        });
    }

    // Test conversion from kilometers to miles (Robust Worst Case)
    @Test
    public void testKilometersToMiles_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.KM, Converter.LengthUnit.MILES);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals(0.621371, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.MILES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.621371, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.MILES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.MILES);
        });
    }

    // Test conversion from kilometers to millimeters (Robust Worst Case)
    @Test
    public void testKilometersToMillimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.KM, Converter.LengthUnit.MM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals(1000000.0, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.MM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000000, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.MM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.MM);
        });
    }

    // Test conversion from kilometers to centimeters (Robust Worst Case)
    @Test
    public void testKilometersToCentimeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.KM, Converter.LengthUnit.CM);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals(100000.0, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.CM), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 100000, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.CM), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.CM);
        });
    }

    // Test conversion from kilometers to meters (Robust Worst Case)
    @Test
    public void testKilometersToMeters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(-1, Converter.LengthUnit.KM, Converter.LengthUnit.M);
        });
        Assert.assertEquals(0.0, converter.convertLength(0, Converter.LengthUnit.KM, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals(1000.0, converter.convertLength(1, Converter.LengthUnit.KM, Converter.LengthUnit.M), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertLength(Integer.MAX_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.M), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertLength(Integer.MIN_VALUE, Converter.LengthUnit.KM, Converter.LengthUnit.M);
        });
    }


    // Weigth Tests

    // Test conversion from pounds to ounces (Robust Worst Case)
    @Test
    public void testPoundsToOunces_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertEquals(16.0, converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 16, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.OUNCES);
        });
    }

    // Test conversion from pounds to milligrams (Robust Worst Case)
    @Test
    public void testPoundsToMilligrams_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG), 0.01);
        Assert.assertEquals(453592.0, converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 453592, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.MG);
        });
    }

    // Test conversion from pounds to grams (Robust Worst Case)
    @Test
    public void testPoundsToGrams_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G), 0.01);
        Assert.assertEquals(453.592, converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 453.592, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.G);
        });
    }

    // Test conversion from pounds to kilograms (Robust Worst Case)
    @Test
    public void testPoundsToKilograms_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG), 0.01);
        Assert.assertEquals(0.453592, converter.convertWeight(1, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.453592, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.POUNDS, Converter.WeightUnit.KG);
        });
    }

    // Test conversion from ounces to pounds (Robust Worst Case)
    @Test
    public void testOuncesToPounds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertEquals(0.0625, converter.convertWeight(1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 16, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.POUNDS);
        });
    }

    // Test conversion from ounces to milligrams (Robust Worst Case)
    @Test
    public void testOuncesToMilligrams_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.MG);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.OUNCES, Converter.WeightUnit.MG), 0.01);
        Assert.assertEquals(28349.5, converter.convertWeight(1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.MG), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 28349.5, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.MG), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.MG);
        });
    }

    // Test conversion from ounces to grams (Robust Worst Case)
    @Test
    public void testOuncesToGrams_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.G);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.OUNCES, Converter.WeightUnit.G), 0.01);
        Assert.assertEquals(28.3495, converter.convertWeight(1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.G), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 28.3495, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.G), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.G);
        });
    }

    // Test conversion from ounces to kilograms (Robust Worst Case)
    @Test
    public void testOuncesToKilograms_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.KG);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.OUNCES, Converter.WeightUnit.KG), 0.01);
        Assert.assertEquals(0.0283495, converter.convertWeight(1, Converter.WeightUnit.OUNCES, Converter.WeightUnit.KG), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0283495, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.KG), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.OUNCES, Converter.WeightUnit.KG);
        });
    }

    // Test conversion from grams to pounds (Robust Worst Case)
    @Test
    public void testGramsToPounds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.G, Converter.WeightUnit.POUNDS);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.G, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertEquals(0.00220462, converter.convertWeight(1, Converter.WeightUnit.G, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00220462, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.POUNDS);
        });
    }

    // Test conversion from grams to ounces (Robust Worst Case)
    @Test
    public void testGramsToOunces_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.G, Converter.WeightUnit.OUNCES);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.G, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertEquals(0.03527396, converter.convertWeight(1, Converter.WeightUnit.G, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.03527396, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.OUNCES);
        });
    }

    // Test conversion from grams to milligrams (Robust Worst Case)
    @Test
    public void testGramsToMilligrams_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.G, Converter.WeightUnit.MG);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.G, Converter.WeightUnit.MG), 0.01);
        Assert.assertEquals(1000.0, converter.convertWeight(1, Converter.WeightUnit.G, Converter.WeightUnit.MG), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.MG), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.MG);
        });
    }

    // Test conversion from grams to kilograms (Robust Worst Case)
    @Test
    public void testGramsToKilograms_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.G, Converter.WeightUnit.KG);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.G, Converter.WeightUnit.KG), 0.01);
        Assert.assertEquals(0.001, converter.convertWeight(1, Converter.WeightUnit.G, Converter.WeightUnit.KG), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.001, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.KG), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.G, Converter.WeightUnit.KG);
        });
    }


    // Test conversion from milligrams to pounds (Robust Worst Case)
    @Test
    public void testMilligramsToPounds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.MG, Converter.WeightUnit.POUNDS);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.MG, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertEquals(0.00000220462, converter.convertWeight(1, Converter.WeightUnit.MG, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00000220462, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.POUNDS);
        });
    }

    // Test conversion from milligrams to ounces (Robust Worst Case)
    @Test
    public void testMilligramsToOunces_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.MG, Converter.WeightUnit.OUNCES);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.MG, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertEquals(0.00003527396, converter.convertWeight(1, Converter.WeightUnit.MG, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00003527396, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.OUNCES);
        });
    }

    // Test conversion from milligrams to grams (Robust Worst Case)
    @Test
    public void testMilligramsToGrams_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.MG, Converter.WeightUnit.G);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.MG, Converter.WeightUnit.G), 0.01);
        Assert.assertEquals(0.001, converter.convertWeight(1, Converter.WeightUnit.MG, Converter.WeightUnit.G), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.001, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.G), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.G);
        });
    }

    // Test conversion from milligrams to kilograms (Robust Worst Case)
    @Test
    public void testMilligramsToKilograms_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.MG, Converter.WeightUnit.KG);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.MG, Converter.WeightUnit.KG), 0.01);
        Assert.assertEquals(0.000001, converter.convertWeight(1, Converter.WeightUnit.MG, Converter.WeightUnit.KG), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000001, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.KG), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.MG, Converter.WeightUnit.KG);
        });
    }

    // Test conversion from kilograms to pounds (Robust Worst Case)
    @Test
    public void testKilogramsToPounds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertEquals(2.20462, converter.convertWeight(1, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 2.20462, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.POUNDS);
        });
    }

    // Test conversion from kilograms to ounces (Robust Worst Case)
    @Test
    public void testKilogramsToOunces_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.KG, Converter.WeightUnit.OUNCES);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.KG, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertEquals(35.27396, converter.convertWeight(1, Converter.WeightUnit.KG, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 35.27396, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.OUNCES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.OUNCES);
        });
    }

    // Test conversion from kilograms to milligrams (Robust Worst Case)
    @Test
    public void testKilogramsToMilligrams_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.KG, Converter.WeightUnit.MG);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.KG, Converter.WeightUnit.MG), 0.01);
        Assert.assertEquals(1000000.0, converter.convertWeight(1, Converter.WeightUnit.KG, Converter.WeightUnit.MG), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000000, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.MG), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.MG);
        });
    }

    // Test conversion from kilograms to grams (Robust Worst Case)
    @Test
    public void testKilogramsToGrams_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(-1, Converter.WeightUnit.KG, Converter.WeightUnit.G);
        });
        Assert.assertEquals(0.0, converter.convertWeight(0, Converter.WeightUnit.KG, Converter.WeightUnit.G), 0.01);
        Assert.assertEquals(1000.0, converter.convertWeight(1, Converter.WeightUnit.KG, Converter.WeightUnit.G), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertWeight(Integer.MAX_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.G), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertWeight(Integer.MIN_VALUE, Converter.WeightUnit.KG, Converter.WeightUnit.G);
        });
    }


    // Volume tests

    // Test conversion from fluid ounces to liters (Robust Worst Case)
    @Test
    public void testFluidOuncesToLiters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals(0.0295735, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0295735, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.L);
        });
    }

    // Test conversion from fluid ounces to milliliters (Robust Worst Case)
    @Test
    public void testFluidOuncesToMilliliters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.ML);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals(29.5735, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 29.5735, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.ML), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.ML);
        });
    }

    // Test conversion from fluid ounces to pints (Robust Worst Case)
    @Test
    public void testFluidOuncesToPints_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.PINTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals(0.0625, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0625, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.PINTS);
        });
    }

    // Test conversion from fluid ounces to quarts (Robust Worst Case)
    @Test
    public void testFluidOuncesToQuarts_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.QUARTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals(0.03125, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.03125, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.QUARTS);
        });
    }

    // Test conversion from fluid ounces to gallons (Robust Worst Case)
    @Test
    public void testFluidOuncesToGallons_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.GALLONS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals(0.0078125, converter.convertVolume(1, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.0078125, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.FLUID_OUNCES, Converter.VolumeUnit.GALLONS);
        });
    }

    // Test conversion from pints to fluid ounces (Robust Worst Case)
    @Test
    public void testPintsToFluidOunces_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.FLUID_OUNCES);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals(16.0, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 16, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.FLUID_OUNCES);
        });
    }

    // Test conversion from pints to liters (Robust Worst Case)
    @Test
    public void testPintsToLiters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals(0.473176, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.473176, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.L);
        });
    }

    // Test conversion from pints to milliliters (Robust Worst Case)
    @Test
    public void testPintsToMilliliters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.ML);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals(473.176, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 473.176, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.ML), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.ML);
        });
    }

    // Test conversion from pints to quarts (Robust Worst Case)
    @Test
    public void testPintsToQuarts_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.QUARTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals(0.5, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.5, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.QUARTS);
        });
    }

    // Test conversion from pints to gallons (Robust Worst Case)
    @Test
    public void testPintsToGallons_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.GALLONS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals(0.125, converter.convertVolume(1, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.125, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.PINTS, Converter.VolumeUnit.GALLONS);
        });
    }

    // Test conversion from gallons to fluid ounces (Robust Worst Case)
    @Test
    public void testGallonsToFluidOunces_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.FLUID_OUNCES);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals(128.0, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 128, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.FLUID_OUNCES);
        });
    }

    // Test conversion from gallons to liters (Robust Worst Case)
    @Test
    public void testGallonsToLiters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals(3.78541, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3.78541, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.L);
        });
    }

    // Test conversion from gallons to milliliters (Robust Worst Case)
    @Test
    public void testGallonsToMilliliters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.ML);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals(3785.41, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3785.41, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.ML), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.ML);
        });
    }

    // Test conversion from gallons to pints (Robust Worst Case)
    @Test
    public void testGallonsToPints_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.PINTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals(8.0, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 8, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.PINTS);
        });
    }

    // Test conversion from gallons to quarts (Robust Worst Case)
    @Test
    public void testGallonsToQuarts_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.QUARTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals(4.0, converter.convertVolume(1, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 4, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.GALLONS, Converter.VolumeUnit.QUARTS);
        });
    }

    // Test conversion from quarts to fluid ounces (Robust Worst Case)
    @Test
    public void testQuartsToFluidOunces_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.FLUID_OUNCES);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals(32.0, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 32, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.FLUID_OUNCES);
        });
    }

    // Test conversion from quarts to liters (Robust Worst Case)
    @Test
    public void testQuartsToLiters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals(0.946353, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.946353, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.L);
        });
    }

    // Test conversion from quarts to milliliters (Robust Worst Case)
    @Test
    public void testQuartsToMilliliters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.ML);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals(946.353, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 946.353, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.ML), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.ML);
        });
    }

    // Test conversion from quarts to pints (Robust Worst Case)
    @Test
    public void testQuartsToPints_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.PINTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals(2.0, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 2, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.PINTS);
        });
    }

    // Test conversion from quarts to gallons (Robust Worst Case)
    @Test
    public void testQuartsToGallons_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.GALLONS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals(0.25, converter.convertVolume(1, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.25, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.QUARTS, Converter.VolumeUnit.GALLONS);
        });
    }

    // Test conversion from milliliters to fluid ounces (Robust Worst Case)
    @Test
    public void testMillilitersToFluidOunces_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.ML, Converter.VolumeUnit.FLUID_OUNCES);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals(0.033814, converter.convertVolume(1, Converter.VolumeUnit.ML, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.033814, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.FLUID_OUNCES);
        });
    }

    // Test conversion from milliliters to liters (Robust Worst Case)
    @Test
    public void testMillilitersToLiters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.ML, Converter.VolumeUnit.L);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals(0.001, converter.convertVolume(1, Converter.VolumeUnit.ML, Converter.VolumeUnit.L), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.001, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.L), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.L);
        });
    }

    // Test conversion from milliliters to pints (Robust Worst Case)
    @Test
    public void testMillilitersToPints_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.ML, Converter.VolumeUnit.PINTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals(0.00211338, converter.convertVolume(1, Converter.VolumeUnit.ML, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00211338, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.PINTS);
        });
    }

    // Test conversion from milliliters to quarts (Robust Worst Case)
    @Test
    public void testMillilitersToQuarts_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.ML, Converter.VolumeUnit.QUARTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals(0.00105669, converter.convertVolume(1, Converter.VolumeUnit.ML, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.00105669, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.QUARTS);
        });
    }

    // Test conversion from milliliters to gallons (Robust Worst Case)
    @Test
    public void testMillilitersToGallons_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.ML, Converter.VolumeUnit.GALLONS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.ML, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals(0.000264172, converter.convertVolume(1, Converter.VolumeUnit.ML, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.000264172, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.ML, Converter.VolumeUnit.GALLONS);
        });
    }

    // Test conversion from liters to fluid ounces (Robust Worst Case)
    @Test
    public void testLitersToFluidOunces_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals(33.814, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 33.814, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.FLUID_OUNCES);
        });
    }

    // Test conversion from liters to milliliters (Robust Worst Case)
    @Test
    public void testLitersToMilliliters_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.L, Converter.VolumeUnit.ML);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals(1000.0, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.ML), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1000, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.ML), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.ML);
        });
    }

    // Test conversion from liters to pints (Robust Worst Case)
    @Test
    public void testLitersToPints_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals(2.11338, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 2.11338, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.PINTS);
        });
    }

    // Test conversion from liters to quarts (Robust Worst Case)
    @Test
    public void testLitersToQuarts_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.L, Converter.VolumeUnit.QUARTS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals(1.05669, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1.05669, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.QUARTS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.QUARTS);
        });
    }

    // Test conversion from liters to gallons (Robust Worst Case)
    @Test
    public void testLitersToGallons_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(-1, Converter.VolumeUnit.L, Converter.VolumeUnit.GALLONS);
        });
        Assert.assertEquals(0.0, converter.convertVolume(0, Converter.VolumeUnit.L, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals(0.264172, converter.convertVolume(1, Converter.VolumeUnit.L, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 0.264172, converter.convertVolume(Integer.MAX_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.GALLONS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertVolume(Integer.MIN_VALUE, Converter.VolumeUnit.L, Converter.VolumeUnit.GALLONS);
        });
    }

    // Time conversions

    // Test conversion from seconds to minutes (Robust Worst Case)
    @Test
    public void testSecondsToMinutes_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MINUTES);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(60, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 60, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MINUTES);
        });
    }

    // Test conversion from seconds to hours (Robust Worst Case)
    @Test
    public void testSecondsToHours_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(3600, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 3600, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.HOURS);
        });
    }

    // Test conversion from seconds to days (Robust Worst Case)
    @Test
    public void testSecondsToDays_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.SECONDS, Converter.TimeUnit.DAYS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(86400, Converter.TimeUnit.SECONDS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 86400, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.DAYS);
        });
    }

    // Test conversion from seconds to weeks (Robust Worst Case)
    @Test
    public void testSecondsToWeeks_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.SECONDS, Converter.TimeUnit.WEEKS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(604800, Converter.TimeUnit.SECONDS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 604800, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.WEEKS);
        });
    }

    // Test conversion from seconds to months (Robust Worst Case)
    @Test
    public void testSecondsToMonths_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MONTHS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(2628000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 2628000, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.MONTHS);
        });
    }

    // Test conversion from seconds to years (Robust Worst Case)
    @Test
    public void testSecondsToYears_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(31536000, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 31536000, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.SECONDS, Converter.TimeUnit.YEARS);
        });
    }

    // Test conversion from minutes to seconds (Robust Worst Case)
    @Test
    public void testMinutesToSeconds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MINUTES, Converter.TimeUnit.SECONDS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals(60.0, converter.convertTime(1, Converter.TimeUnit.MINUTES, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 60, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.SECONDS);
        });
    }

    // Test conversion from minutes to hours (Robust Worst Case)
    @Test
    public void testMinutesToHours_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(60, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 60, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.HOURS);
        });
    }

    // Test conversion from minutes to days (Robust Worst Case)
    @Test
    public void testMinutesToDays_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MINUTES, Converter.TimeUnit.DAYS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(1440, Converter.TimeUnit.MINUTES, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 1440, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.DAYS);
        });
    }

    // Test conversion from minutes to weeks (Robust Worst Case)
    @Test
    public void testMinutesToWeeks_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MINUTES, Converter.TimeUnit.WEEKS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(10080, Converter.TimeUnit.MINUTES, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 10080, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.WEEKS);
        });
    }

    // Test conversion from minutes to months (Robust Worst Case)
    @Test
    public void testMinutesToMonths_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MONTHS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(43800, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 43800, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.MONTHS);
        });
    }

    // Test conversion from minutes to years (Robust Worst Case)
    @Test
    public void testMinutesToYears_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MINUTES, Converter.TimeUnit.YEARS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MINUTES, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(525600, Converter.TimeUnit.MINUTES, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 525600, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MINUTES, Converter.TimeUnit.YEARS);
        });
    }

    // Test conversion from hours to seconds (Robust Worst Case)
    @Test
    public void testHoursToSeconds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals(3600.0, converter.convertTime(1, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 3600, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.SECONDS);
        });
    }

    // Test conversion from hours to minutes (Robust Worst Case)
    @Test
    public void testHoursToMinutes_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals(60.0, converter.convertTime(1, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 60, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.MINUTES);
        });
    }

    // Test conversion from hours to days (Robust Worst Case)
    @Test
    public void testHoursToDays_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.HOURS, Converter.TimeUnit.DAYS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals(1.0, converter.convertTime(24, Converter.TimeUnit.HOURS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 24, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.DAYS);
        });
    }

    // Test conversion from hours to weeks (Robust Worst Case)
    @Test
    public void testHoursToWeeks_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.HOURS, Converter.TimeUnit.WEEKS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals(0.0416667, converter.convertTime(1, Converter.TimeUnit.HOURS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 168, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.WEEKS);
        });
    }

    // Test conversion from hours to months (Robust Worst Case)
    @Test
    public void testHoursToMonths_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.HOURS, Converter.TimeUnit.MONTHS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals(0.00136895, converter.convertTime(1, Converter.TimeUnit.HOURS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 730.001, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.MONTHS);
        });
    }

    // Test conversion from hours to years (Robust Worst Case)
    @Test
    public void testHoursToYears_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.HOURS, Converter.TimeUnit.YEARS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.HOURS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals(0.00011408, converter.convertTime(1, Converter.TimeUnit.HOURS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 8760, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.HOURS, Converter.TimeUnit.YEARS);
        });
    }

    // Test conversion from days to seconds (Robust Worst Case)
    @Test
    public void testDaysToSeconds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.DAYS, Converter.TimeUnit.SECONDS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals(86400.0, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 86400, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.SECONDS);
        });
    }

    // Test conversion from days to minutes (Robust Worst Case)
    @Test
    public void testDaysToMinutes_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.DAYS, Converter.TimeUnit.MINUTES);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals(1440.0, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 1440, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.MINUTES);
        });
    }

    // Test conversion from days to hours (Robust Worst Case)
    @Test
    public void testDaysToHours_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals(24.0, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 24, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.HOURS);
        });
    }

    // Test conversion from days to weeks (Robust Worst Case)
    @Test
    public void testDaysToWeeks_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.DAYS, Converter.TimeUnit.WEEKS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals(0.142857, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 7, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.WEEKS);
        });
    }

    // Test conversion from days to months (Robust Worst Case)
    @Test
    public void testDaysToMonths_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.DAYS, Converter.TimeUnit.MONTHS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals(0.0328767, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 30.4167, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.MONTHS);
        });
    }

    // Test conversion from days to years (Robust Worst Case)
    @Test
    public void testDaysToYears_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.DAYS, Converter.TimeUnit.YEARS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.DAYS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals(0.00273973, converter.convertTime(1, Converter.TimeUnit.DAYS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 365, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.DAYS, Converter.TimeUnit.YEARS);
        });
    }

    // Test conversion from weeks to seconds (Robust Worst Case)
    @Test
    public void testWeeksToSeconds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.SECONDS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals(604800.0, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 604800, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.SECONDS);
        });
    }

    // Test conversion from weeks to minutes (Robust Worst Case)
    @Test
    public void testWeeksToMinutes_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MINUTES);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals(10080.0, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 10080, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MINUTES);
        });
    }

    // Test conversion from weeks to hours (Robust Worst Case)
    @Test
    public void testWeeksToHours_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals(168.0, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 168, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.HOURS);
        });
    }

    // Test conversion from weeks to days (Robust Worst Case)
    @Test
    public void testWeeksToDays_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.DAYS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals(7.0, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 7, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.DAYS);
        });
    }

    // Test conversion from weeks to months (Robust Worst Case)
    @Test
    public void testWeeksToMonths_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MONTHS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals(0.230137, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 4.34524, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.MONTHS);
        });
    }

    // Test conversion from weeks to years (Robust Worst Case)
    @Test
    public void testWeeksToYears_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.YEARS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.WEEKS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals(0.0191781, converter.convertTime(1, Converter.TimeUnit.WEEKS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 52.1775, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.WEEKS, Converter.TimeUnit.YEARS);
        });
    }

    // Test conversion from months to seconds (Robust Worst Case)
    @Test
    public void testMonthsToSeconds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.SECONDS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals(2628000.0, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 2628000, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.SECONDS);
        });
    }

    // Test conversion from months to minutes (Robust Worst Case)
    @Test
    public void testMonthsToMinutes_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MINUTES);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals(43800.0, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 43800, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.MINUTES);
        });
    }

    // Test conversion from months to hours (Robust Worst Case)
    @Test
    public void testMonthsToHours_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals(730.001, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 730.001, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.HOURS);
        });
    }

    // Test conversion from months to days (Robust Worst Case)
    @Test
    public void testMonthsToDays_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.DAYS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals(30.4167, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 30.4167, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.DAYS);
        });
    }

    // Test conversion from months to weeks (Robust Worst Case)
    @Test
    public void testMonthsToWeeks_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.WEEKS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals(4.34524, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 4.34524, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.WEEKS);
        });
    }

    // Test conversion from months to years (Robust Worst Case)
    @Test
    public void testMonthsToYears_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.YEARS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.MONTHS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals(0.0833333, converter.convertTime(1, Converter.TimeUnit.MONTHS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 12, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.YEARS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.MONTHS, Converter.TimeUnit.YEARS);
        });
    }

    // Test conversion from years to seconds (Robust Worst Case)
    @Test
    public void testYearsToSeconds_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.YEARS, Converter.TimeUnit.SECONDS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals(31536000.0, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 31536000, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.SECONDS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.SECONDS);
        });
    }

    // Test conversion from years to minutes (Robust Worst Case)
    @Test
    public void testYearsToMinutes_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals(525600.0, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 525600, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.MINUTES);
        });
    }

    // Test conversion from years to hours (Robust Worst Case)
    @Test
    public void testYearsToHours_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals(8760.0, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 8760, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.HOURS);
        });
    }

    // Test conversion from years to days (Robust Worst Case)
    @Test
    public void testYearsToDays_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.YEARS, Converter.TimeUnit.DAYS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals(365.0, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE * 365, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.DAYS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.DAYS);
        });
    }

    // Test conversion from years to weeks (Robust Worst Case)
    @Test
    public void testYearsToWeeks_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.YEARS, Converter.TimeUnit.WEEKS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals(52.1775, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 52.1775, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.WEEKS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.WEEKS);
        });
    }

    // Test conversion from years to months (Robust Worst Case)
    @Test
    public void testYearsToMonths_RobustWorstCase() {
        // Valid and invalid boundary values combined
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(-1, Converter.TimeUnit.YEARS, Converter.TimeUnit.MONTHS);
        });
        Assert.assertEquals(0.0, converter.convertTime(0, Converter.TimeUnit.YEARS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals(12.0, converter.convertTime(1, Converter.TimeUnit.YEARS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertEquals((double) Integer.MAX_VALUE / 12, converter.convertTime(Integer.MAX_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.MONTHS), 0.01);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            converter.convertTime(Integer.MIN_VALUE, Converter.TimeUnit.YEARS, Converter.TimeUnit.MONTHS);
        });
    }

}
