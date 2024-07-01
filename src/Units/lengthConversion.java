import java.util.Scanner;
package Units;

public class lengthConversion {
    double millimeters;
    double centimeters;
    double metres;
    double kilometers;
    double inch;
    double feet;
    double yard;
    double mile;

    public static void inputs() {
        Scanner scanner = new Scanner(System.in);
        
        String selection = "";
        
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
        selection = scanner.nextLine();

        if (selection.equalsIgnoreCase("Millimeters") || selection.equalsIgnoreCase("millimeters")
        || selection.equalsIgnoreCase("mm") || selection.equalsIgnoreCase("MM")) {
            
        }
    }
}
