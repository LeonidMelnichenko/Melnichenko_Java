package Task_1;

public class ParseFromStringToDouble {
    public static Double parser(String inputString) {
        Double number = null;
        try {
            if (inputString.contains(","))
                inputString = inputString.replace(",", ".");
            number = Double.parseDouble(inputString);
        } catch (NumberFormatException ex) {
            System.out.println("Incorrectly !!! Enter the number");
        }
        return number;
    }
}
