package Task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public static String readNameFromConsole(){
        System.out.println("Ввведие ваше имя:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try{
            str = reader.readLine();
        }catch (IOException ex)  {
            throw new RuntimeException(ex);
        }
        return str;
    }
}
