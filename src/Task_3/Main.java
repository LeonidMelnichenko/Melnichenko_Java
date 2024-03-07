package Task_3;

import java.util.ArrayList;
import java.util.List;

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
public class Main {
    public static void main(String[] args) {
        List<Integer> numericArray = new ArrayList<>();
        numericArray = Console.readArrayFromConsole();
        TestNumbers.testMethod(numericArray);
    }
}
