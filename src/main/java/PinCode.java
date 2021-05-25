import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {
    public static void main(String[] args) {
        String pinCode = "400088";
        String patternNum = "^[0-9]{6}$";
        Pattern pattern = Pattern.compile(patternNum);
        Matcher matcher = pattern.matcher(pinCode);
        if (matcher.find()){
            System.out.println("valid");
        }
    }
}
