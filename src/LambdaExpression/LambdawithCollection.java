package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LambdawithCollection {
    public static void main(String[] args) {

        List<String> list=List.of("Javed","Lokesh","karan","Mohit");
        List<String> list1=new ArrayList<>(List.of("Javed","Lokesh","karan","Mohit"));
        List<String> list2=new ArrayList<>(List.of("Javed","Lokesh","karan","Mohit"));
        list1.forEach(s -> s.toUpperCase());
        list1.forEach(s -> System.out.println(s));
        Map<String,Integer> namesMap=Map.of("Javed",1,"Lokesh",2,"karan",3,"Mohit",4);

//        for(String str:list){
//            System.out.println(str);
//        }

        list.forEach(a -> {
                    System.out.println(a.toUpperCase());
                });
        //lambdafor for each method(Consumer)
        namesMap.forEach((k,v) -> System.out.println(k+" EmpNo "+v));
        //Lambda for Map(Biconsumer)

        for (int i=0;i<list2.size();i++){
            String name= namesMap.keySet().toString();
            list2.add(name.toUpperCase());

        } //try this using lambda #Task1
 //Local variables cannot be modified/updated inside lambda expression
        //However only te static or global variables can be modified inside lambda

    }
}
