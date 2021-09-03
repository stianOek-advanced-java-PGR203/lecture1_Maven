package no.pingpong;

public class RomanConvert {

    public static String toRoman(int number) {
        String romanString = "";
        if(number == 4) {
            romanString += "IV";
            return romanString;
        }
        for (int i = 0; i < number; i++) {
            romanString += "I";
        }
            return romanString;
    }


}
