import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {
    public static void main(String[] args) {

        String pinCode = "400088";
        String patternNum = "^[0-9]{6}$";
        System.out.println( pinCode+ " : " +checkpattern(pinCode,patternNum));
        String pinCode1 = "A400088";
        String patternNum1 = "(^[0-9]{1})";
        System.out.println( pinCode1+ " : " +checkpattern(pinCode1,patternNum1));
        String pinCode2 = "400088B";
        String patternNum2 = "($[0-9]{1})";
        System.out.println( pinCode2+ " : " +checkpattern(pinCode2,patternNum2));
        String pinCode3 = "400 088";
        String patternNum3 = "([0-9]{3})";
        System.out.println( pinCode3+ " : " +checkpattern(pinCode3,patternNum3));


    }
    public static boolean checkpattern(String pinCode,String patternNum){
        Pattern pattern = Pattern.compile(patternNum);
        Matcher matcher = pattern.matcher(pinCode);
        if (matcher.find()) {
            return true;
        }
    return false;
    }
}