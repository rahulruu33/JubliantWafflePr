package testPackage;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
/*    Use Java 8 stream,
    Input, list of String {"Jon", "dow", "pwc"}
    output, single string "Jon dow pwc"*/

    public void testMethod(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Jon");
        stringList.add("dow");
        stringList.add("pwc");

        String concatenatedString = stringList.stream().collect(Collectors.joining( " "));
        System.out.println(concatenatedString);

        LinkedList<String> stringList1 = new LinkedList<>();
        stringList1.add("aab");
        stringList1.add("hello");
        stringList1.add("you");
        stringList1.add("xcc");


//        stringList1.stream().map(str-> new StringUtils(str))

        LinkedList<String> stringList2 = new LinkedList<>();
        for(String string :stringList1 ){
            String reversed = new StringBuilder(string).reverse().toString();
            stringList2.add(reversed);
        }


    }

    /*Input
["aab", "hello", "you", "xcc"]

output
["ccx", "uoy", "olleh", "baa"]*/


}
