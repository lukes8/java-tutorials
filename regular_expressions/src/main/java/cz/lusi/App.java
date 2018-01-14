package cz.lusi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lusi
 */
public class App 
{
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9.-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_NAME_TEXT_REGEX =
            Pattern.compile("^[a-zA-Z]+(\\s*\\w*)*\\(\\w+\\)$", Pattern.CASE_INSENSITIVE);

    public static void main( String[] args )
    {
        if (validateEmail("example@example.com")) {
            System.out.println("Yeah, your entered email is valid!");
        } else {
            System.out.println("Unfortunately, your entered email is not valid!");
        }

        if (validateName("Alexander Abran (ALEB)")) {
            System.out.println("Yeah, your entered name with abbrevitation is valid!");
        } else {
            System.out.println("Unfortunately, you must enter name in valid format: Name (abbrevitation)!");
        }

    }

    public static boolean validateEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
        return matcher.find();
    }

    public static boolean validateName(String name) {
        Matcher matcher = VALID_NAME_TEXT_REGEX.matcher(name);
        return matcher.find();
    }
}
