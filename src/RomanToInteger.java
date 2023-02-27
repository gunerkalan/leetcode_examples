import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();
        int sum = romanToInteger.romanToInt("MCMXCIV");
        System.out.println(sum);
    }

    public int romanToInt(String s){
        char[] chars = s.toCharArray();

        int total=0;
        int last =0;
        int current;

        for(int i= chars.length-1; i>=0; i--){
            current = convertCharToInt(chars[i]);

            if(last>current){
                total-= current;
                last = current;
                continue;
            }

            total += current;
            last = current;
        }

        return total;
    }

    private int convertCharToInt(char c){
        int i;
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
