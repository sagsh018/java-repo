import org.apache.commons.lang3.StringUtils;

// So notice that we have imported the StringUtils class from one of the open source apache library

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(StringUtils.capitalize("hello world"));
    }
}