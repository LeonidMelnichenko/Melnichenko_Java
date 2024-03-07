package Task_1;

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”
public class Main {
    public static void main(String[] args) {
        String input = Console.readNumberFromConsole();
        Double number = ParseFromStringToDouble.parser(input);
        TestNumber.testMethod(number);
    }
}