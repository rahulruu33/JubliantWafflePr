package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass3 {

    public void testMethod(){
//
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
////        List<Integer> evenNums =numberList.stream().filter(num -> num / 2 == 0).collect(Collectors.toList());
////        Thread t1 = new Thread(())

        int [] intArray = {1,23, 32, 34, 56};
        Arrays.sort(intArray);
        int[] destArray = new int[intArray.length];
        int minValue = Integer.MIN_VALUE;
//        for(int i : intArray){
//            if(i>minValue){
//                minValue = i;
//            }
//        }
        for(int i=0 ; i<intArray.length ;i++ ){
            for(int j=i+1 ; j<intArray.length ; j++){
                if(intArray[j]>intArray[i]){

                }
            }
        }

    }













}
