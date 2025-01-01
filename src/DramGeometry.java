import java.util.Scanner;

public class DramGeometry {
    public static void main(String[] args) {
        int choice = -1;
        int rect_width = 7, rect_height = 3;
        int triangle_side = 7;  // need an ODD number to draw isosceles triangle
        Scanner input = new Scanner(System.in);

        while (choice != 4) {
            System.out.print("
                    Menu:
                    1. Print the rectangle
                    2. Print the square triangles (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)
                    3. Print isosceles triangle
                    4. Exit + );


            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle:");
                    for (int i = 0; i < rect_height; i++) {
                        for (int j = 0; j < rect_width; j++) {
                            System.out.print("+");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangles:");
                    // corner is at top-left
                    for (int i = 0; i < triangle_side; i++) {
                        for (int j = 0; j < triangle_side - i; j++) {
                            System.out.print("+");
                        }
                        System.out.println();
                    }
                    // corner is at top-right
                    for (int i = 0; i < triangle_side; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < triangle_side - i; j++) {
                            System.out.print("+");
                        }
                        System.out.println();
                    }
                    // corner is at bottom-left
                    for (int i = 0; i < triangle_side; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("+");
                        }
                        System.out.println();
                    }
                    // corner is at bottom-right
                    for (int i = 0; i < triangle_side; i++) {
                        for (int j = 0; j < triangle_side - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("+");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i <= triangle_side / 2; i++) {
                        for (int j = 0; j < triangle_side / 2 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i * 2; j++) {
                            System.out.print("+");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}
