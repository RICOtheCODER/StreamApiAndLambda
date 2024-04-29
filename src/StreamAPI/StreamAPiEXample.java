package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPiEXample {
    public static void main(String[] args) {


        List<Integer> nums=List.of(2,3,-4,5,6,-7,7);
        //filter -find alll positive numbers
        nums.stream().filter(e ->e>0).forEach(e-> System.out.println(e));
        //map--- operation for changing
        nums.stream().filter(e->e >0).map(e->e*2).forEach(e-> System.out.println(e));
        List<Integer> list1=nums.stream().filter(e->e >0).map(e->e*2).collect(Collectors.toList());

        //This is caled stream Method chaining
        //suddenly steeam cannot be stopped
        //..A termial Operation has to be issued to stop the stream either
        //......convert to list or print it
        //Short circuit terminal methods === findfirst
    }
}
