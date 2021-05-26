import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {
    public static void main(String[] args) {

        String pinCode = "400088";
        String patternNum = "^[0-9]{6}$";
        System.out.println( pinCode+ " : " +checkpattern(pinCode,patternNum));
        String pinCode1 = "A400088";
        String patternNum1 = "(^[0-9]{6})";
        System.out.println( pinCode1+ " : " +checkpattern(pinCode1,patternNum1));


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