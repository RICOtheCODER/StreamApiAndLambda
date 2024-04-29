package LambdaExpression;

interface printable{
    void print();
}

class Printer implements printable{

    @Override
    public void print() {
        System.out.println("Hello World");
    }
}

interface Scannable{
    public void scan(String filename);
}

interface Calculator{
    int operate(int a,int b);
}
interface StringLengthChecker{
    public int LengthFinder(String s);
}
interface NumberManipulator{
    public int findMax(int a,int b);
}
interface StringEmptyOrNot{
    public boolean empty(String s);

}

public class LambdaExpression {
    public static void main(String[] args) {


        printable printable1 = () -> System.out.println("Hello world");
        //Thi only works as printable has one Abstract method(Functional Interface)
        printable1.print();
        Scannable scan= (String filename) -> System.out.println("Scanning "+filename);
        scan.scan("MyFile.txt");
        //Lambda expression which takes argument from interface
        Calculator calculator= (a,b) -> {
            int sum=a+b;
            return sum;
        };
        Calculator calc =(a,b) -> a+b;
        //lambda becomes an int method
        int result=calc.operate(10,20);
        //System.out.println(result);
        StringLengthChecker stringLengthChecker= (s) -> s.length();
        int lengthOfString=stringLengthChecker.LengthFinder("HelloWorld");
        System.out.println(lengthOfString);
        //lambda expression to find the length of the string
        NumberManipulator numberManipulator=(a,b)-> Math.max(a,b);
        int maxNumber=numberManipulator.findMax(45,76);
        System.out.println(maxNumber);
        //Lambda to check if string is empty or not
        StringEmptyOrNot emptyOrNot= (s) -> {
             return s.isEmpty();
        };
        boolean b=emptyOrNot.empty("Welcome");
        System.out.println(b);
        //lambda to check if string is empty or not




    }
}
