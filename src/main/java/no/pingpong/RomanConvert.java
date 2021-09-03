package no.pingpong;

public class RomanConvert {

    public static String toRomanLessThan11(int number) {
        String romanString = "";
        if(number == 4) {
            romanString += "IV";
            return romanString;
        }else if(number == 5){
            romanString += "V";
            return romanString;
        } else if(number > 5 && number <9) {
            romanString += "V";
            number -= 5;
        }else if (number == 9){
            romanString += "IX";
            return romanString;
        } else if( number == 10) {
            romanString += "X";
            return romanString;
        }
        for (int i = 0; i < number; i++) {
            romanString += "I";
        }
            return romanString;
    }

    public static String toRomanMoreThan10(int number){
        String romanString = "";
        if(number < 40){

            while (number > 10) {
                    romanString += "X";
                    number -= 10;
            }
            romanString += toRomanLessThan11(number);
        }
            return romanString;
    }





}
