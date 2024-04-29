package LambdaExpression;

public class StringManagement {
    static String doApply(String str, StringOperation operation) {

        return operation.operate(str);
    }

    public static void main(String[] args) {
        var stringUpper = doApply("Hello", s -> s.toUpperCase());
        var stringLower = doApply("Hello world", s -> s.toLowerCase());
        var strReverse = doApply("Hello world", s ->
        {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        });
        System.out.println(stringLower);
        System.out.println(stringUpper);
        System.out.println(strReverse);
    }
}
interface StringOperation{

    String operate(String str);
}
