import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lengthConversion.input();
        String choice;

        System.out.println("Select your starting unit: ");
        System.out.println("1. Millimeters");
        System.out.println("2. Centimeters");
        System.out.println("3. Metres");
        System.out.println("4. Kilometers");
        System.out.println("5. Inches");
        System.out.println("6. Feet");
        System.out.println("7. Yards");
        System.out.println("8. Miles");
        System.out.println("9. Nautical Miles");
        System.out.println("10. Quit");
        choice = scanner.nextLine();

    }
    
    private void lengthConversion() {
        double millimeters;
        double centimeters;
        double metres;
        double kilometers;
        double inch;
        double feet;
        double yard;
        double mile;
    }

    private void areaConversion() {
        double squareMeters;
        double squareKilometers;
        double squareMiles;
        double squareYards;
        double squareFeet;
        double squareInches;
    }

    private void massConversion() {
        double grams;
        double kilograms;
        double tonnes;
        double ounces;
        double pounds;
        double stones;
        double ukHundredWeight;
        double ukLongTon;
    }
} 