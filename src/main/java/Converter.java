public class Converter {

    public double convertLength(double num, LengthUnit from, LengthUnit to){
        //it doesn't make sense to convert directly because that would have way to many direct conversion, we will convert to a base unit, feet , then convert from feet.
        //to follow along with control flow diagram look at comment numbers
        double base = 0;//1
        switch(from){//2
            case INCHES://3
                //4
                base = num/12;
                break;
            case FEET://5
                //6
                base = num;
                break;
            case YARDS://7
                //8
                base = num*3;
                break;
            case MILES://9
                //10
                base = num*5280;
                break;
            case MM://11
                //12
                base = num*0.00328084;
                break;
            case CM://13
                //14
                base = num*0.0328084;
                break;
            case M://15
                //16
                base = num*3.28084;
                break;
            case KM://17
                //18
                base = num*3280.84;
                break;
        }
        switch(to){//19
            case INCHES://20
                return base*12;//21
            case FEET://22
                return base;//23
            case YARDS://24
                return base/3;//25
            case MILES://26
                return base/5280;//27
            case MM://28
                return base*304.8;//29
            case CM://30
                return base*30.48;//31
            case M://32
                return base*0.3048;//33
            case KM://34
                return base*0.0003048;//35
        }
        return 0.0;//36
    }


    public double convertWeight(double num, WeightUnit from, WeightUnit to){
        // base unit = pounds , convert to pounds, then from pounds.
        double base = 0;//1
        switch(from){//2
            case POUNDS://3
                //4
                base = num;
                break;
            case OUNCES://5
                //6
                base = num/16;
                break;
            case MG://7
                //8
                base = num/453600;
                break;
            case G://9
                //10
                base = num/453.6;
                break;
            case KG://11
                //12
                base = num*2.205;
                break;
        }
        switch(to){//13
            case POUNDS://14
                return base;//15
            case OUNCES://16
                return base*16;//17
            case MG://18
                return base*453600;//19
            case G://20
                return base*453.6;//21
            case KG://22
                return base/2.205;//23
        }
        return 0.0;//24
    }

    public double convertVolume(double num, VolumeUnit from, VolumeUnit to){
        // base unit = Liters , convert to L, then from L.
        double base = 0;//1
        switch(from){//2
            case FLUID_OUNCES://3
                //4
                base = num*0.0295735;
                break;
            case PINTS://5
                //6
                base = num*0.473176;
                break;
            case QUARTS://7
                //8
                base = num*0.946353;
                break;
            case GALLONS://9
                //10
                base = num*3.78541;
                break;
            case ML://11
                //12
                base = num/1000;
                break;
            case L://13
                //14
                base = num;
                break;
        }
        switch(to){//15
            case FLUID_OUNCES://16
                return base*33.814;//17
            case PINTS://18
                return base*2.11338;//19
            case QUARTS://20
                return base*1.05669;//21
            case GALLONS://22
                return base*0.264172;//23
            case ML://24
                return base*1000;//25
            case L://26
                return base;//27
        }
        return 0.0;//28
    }

    public double convertTime(double num, TimeUnit from, TimeUnit to){
        // base unit = hours , convert to hours, then from hours.
        double base = 0;//1
        switch(from){//2
            case SECONDS://3
                //4
                base = num/3600;
                break;
            case MINUTES://5
                //6
                base = num/60;
                break;
            case HOURS://7
                //8
                base = num;
                break;
            case DAYS://9
                //10
                base = num*24;
                break;
            case WEEKS://11
                //12
                base = num*168;
                break;
            case MONTHS://13
                //14
                base = num*730;
                break;
            case YEARS://15
                //16
                base = num*8760;
                break;
        }
        switch(to){//17
            case SECONDS://18
                return base*3600;//19
            case MINUTES://20
                return base*60;//21
            case HOURS://22
                return base;//23
            case DAYS://24
                return base/24;//25
            case WEEKS://26
                return base/168;//27
            case MONTHS://28
                return base/730;//29
            case YEARS://30
                return base/8760;//31
        }
        return 0.0;//32
    }

    public enum LengthUnit{
        INCHES, FEET, YARDS, MILES,
        MM, CM, M, KM
    }
    public enum WeightUnit{
        POUNDS, OUNCES,
        MG, G, KG
    }
    public enum VolumeUnit{
        FLUID_OUNCES, PINTS, QUARTS, GALLONS,
        ML, L
    }
    public enum TimeUnit{
        SECONDS, MINUTES, HOURS, DAYS, WEEKS, MONTHS, YEARS
    }
}
