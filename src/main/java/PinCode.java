import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {
    public static void main(String[] args) {
        String pinCode = "400088";
        String patternNum = "^[0-9]{6}$";
        if( checkpattern(pinCode,patternNum)) {
            System.out.println("valid");
            return;
        }
        System.out.println("invalid");
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
