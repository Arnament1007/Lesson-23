import java.util.Optional;
import java.util.regex.Pattern;

public class Helper {

    public Optional<String> Check(String string, String email){

        Pattern pattern =
                Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+" +
                        "(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");

        if (string.trim().isEmpty() && !string.equals(email)){
            return Optional.empty();
        }else if (string.equals(pattern) && string.equals(email)){
            return Optional.of(string);
        }

        return
    }
}
