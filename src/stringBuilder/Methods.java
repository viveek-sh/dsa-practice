package stringBuilder;

import java.util.Arrays;

public class Methods {
    static void main() {
        String name = "Vivek";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());

        String hello = "Hello World This is Vivek";
        System.out.println(Arrays.toString(hello.split(" ")));

        StringBuilder chars = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'  + i);
            chars.append(ch);
        }
        System.out.println(chars);
        System.out.println(chars.reverse());
    }
}
