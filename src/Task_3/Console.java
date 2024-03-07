package Task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Console {
    public static List<Integer> readArrayFromConsole(){
        System.out.println("Введите числовой массив");
        List<Integer> numericArray = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean bool = true;
        while (bool){
            String str = null;
            try {
                str = reader.readLine();
                int numbers = Integer.parseInt(str);
                numericArray.add(numbers);
            }catch (NumberFormatException | IOException ex){
                bool = false;
            }
        }
        return numericArray;
    }
}
