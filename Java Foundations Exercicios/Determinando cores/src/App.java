import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color code: ");
        int colorCode = input.nextInt();

        if (colorCode >= 380 && colorCode < 450) {
            System.out.println("The color is Violet");
        } else if (colorCode >= 450 && colorCode < 495) {
            System.out.println("The color is Blue");
        } else if (colorCode >= 495 && colorCode < 570) {
            System.out.println("The color is Green");
        } else if (colorCode >= 570 && colorCode < 590) {
            System.out.println("The color is Yellow");
        } else if (colorCode >= 590 && colorCode < 620) {
            System.out.println("The color is Orange");
        } else if (colorCode >= 620 && colorCode <= 750) {
            System.out.println("The color is Red");
        } else {
            System.out.println("The colorCode is not within the visible spectrum");
        }

        input.close();
    }
}
