package Task_3;

import java.util.List;
import java.util.stream.Collectors;

public class TestNumbers {
    public static void testMethod(List<Integer> array){
        List<Integer> sortedArray = array.stream().filter(a -> a%3 == 0).collect(Collectors.toList());
        if(sortedArray.size() == 0){
            System.out.println("В массиве нет чисел кратных трем");
        }else {
            sortedArray.forEach(num -> System.out.println(num));
            }
        }
    }
