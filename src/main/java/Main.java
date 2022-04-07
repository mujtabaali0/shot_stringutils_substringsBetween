import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String text = "{hello educative}, {hello educative}";
        String open = "{";
        String close = "}";
        System.out.printf("StringUtils.substringsBetween('%s', '%s'. '%s') = '%s'\n", text, open, close, Arrays.toString(StringUtils.substringsBetween(text, open, close)));
    }
}