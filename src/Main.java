import java.util.Scanner;

public class Main {

    public static double pi = Math.PI;
    public static double radius;

    public static void main(String[] args) { // This is the main method. What ever is in here gets executed.

        boolean validation = true; // I use this to make sure the program loops

        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Please enter the radius: ");
                radius = in.nextDouble();
                validation = false;
            } catch (Exception e) {
                System.out.println("Please try again..");
            }
        }
        while (validation == true);

        validation = true;

        int choice; // variable

    do {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("1) Find the area\n\n2) Find the circumference");
            choice = in.nextInt();

            if (choice == 1 || choice == 2) {
                switch (choice) {
                    case 1:
                        System.out.println("The area of the circle is: " + Area(radius));
                        System.exit(0); // Program ends with status code 0 which means everything went fine.
                    case 2:
                        System.out.println("The circumference of the circle is: " + Circumference(radius));
                        System.exit(0); // Program ends with status code 0 which means everything went fine.
                }


            } else {
                System.out.println("Please enter 1 or 2..");
                validation = true;
            }

        } catch (Exception e) {
            System.out.println("An error has occured..");
            validation = true;
        }
    }while (validation == true);


    }

        private static double Area(double r) { // This is a method (function) which works out the area.

        double r2 = r*r;  // This is basically r squared

        return r2 * pi; // This returns pi x r squared
    }


    private static double Circumference(double r) { // This is a method (function) which works out the circumference.

        return 2 * pi * r; // This returns 2 x pi x radius
    }
}
