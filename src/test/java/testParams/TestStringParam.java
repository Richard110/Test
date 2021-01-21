package testParams;

public class TestStringParam {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("ab");
        change(x);
        System.out.println(x);
        String str = "ab";
        change(str);
//        https://www.programcreek.com/2013/09/string-is-passed-by-reference-in-java/
        System.out.println(str);
    }

    public static void change(StringBuilder x) {
        x.delete(0, 2).append("cd");
    }

    public static void change(String x) {
        x = "cd";
    }
}
