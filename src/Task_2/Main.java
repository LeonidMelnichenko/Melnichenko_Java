package Task_2;
// Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
// если нет, то вывести "Нет такого имени"
public class Main {
    public static void main(String[] args) {
        String input = Console.readNameFromConsole();
        TestName.testMethod(input);
    }
}
