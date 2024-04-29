package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiBasics {
    static List<String> names=List.of("Harsh Kumar","Virat Kohli","Mahendra Singh Dhoni","Akash","Karan Chopra");
    //input names
  //  List<String> shortNames=getShortNames( names);

    public static List<String> getShortNames(List<String> names) {
        List<String> shortNames=new ArrayList<>();
        for (String s:names) {
            String str[] = s.split(" ");
            String shortN = "";
            if (str.length >1 ) {
                for (String temp : str) {
                    shortN = shortN + temp.charAt(0);
                }
                shortNames.add(shortN);
            }
        }
        return shortNames;
    }
    public static List<String> getValidNames(List<String> names){
        List<String > validNames=new ArrayList<>();
        for (String str:names){
            String[] validN=str.split(" ");
            if(validN.length > 1){
                validNames.add(str);
            }
        }
        return validNames;
    }


    //return shortformof names
//    List<String> validNames=getValidNames(List<String> names);
//
//    public List<String> getValidNames(List<String> names) {
//    }

    //the length of ech string sghould be atleast 2
    //rahul kumar sahu ----- examples
//    String allNames=getAllNames(names);
    //should return all names seperated by comma
    //H.K , M.S.D,....Akash should not be there
//    public List<String > getAllNames(List<String> names){
//
//    }
    public static void main(String[] args) {
        List<String> shortNames=getShortNames( names);
        System.out.println(shortNames);
        List<String> validNames=getValidNames(names);
        System.out.println(validNames);
        String allNames=getAllNames(shortNames);
        //1st method replacement
        names.stream().filter(name->name.strip().contains(" "));
                //stream converts to stream from list
        //filter is a interfcae with one method
        //during modification map is used
        //during selection only Filter is used
//        String output=names.stream().filter(name->name.strip().contains(" "))
//                .map(name -> {
//                   StringBuilder sb=new StringBuilder();
//                   for (String str :name.split(" ")){
//                       sb.append(str.charAt(0));
//                   }
//                   return sb.toString();
//                }).collect(Collectors.joining(","));
//         //Refer Later
        String output2=names.stream().filter(name->name.strip().contains(" "))
                .map(name ->name.split(" ")[0])
                .collect(Collectors.joining(","));
        System.out.println(output2);

    }

    public static String getAllNames(List<String> shortNames) {
        String shorty="";
        for(String str : shortNames){
            shorty=str+",";
        }
       // shorty.r
        return shorty;
        //add , at the end
    }
}
