//Oleksandra Chebotar
//C00325201
//Lab2 OOSD
import java.util.Scanner;

public class Q3Final {
    public static class Rectangle {
//Variables                
        private float length;
        private float width;
//Constructor
        public Rectangle() {
            setLength(1.0f);
            setWidth(1.0f);
        }
//Getters and Setters
        public float getLength() {
            return length;
        }
        public void setLength(float length) {
            if (length >0.0 && length<= 40.0) {
                this.length=length;  
            }
            else {
                System.out.println("Length must be between 0.0 and 40.0");
            }
        }
        public float getWidth() {
            return width;
        }

        public void setWidth(float width) {
            if (width >0.0 && width <= 40.0) {
                this.width = width;
            }
            else {
                System.out.println("Width must be between 0.0 and 40.0");
            }
        }

        public void printRectangle() {
            int rows = Math.round(length);
            int cols = Math.round(width);

            if (rows <= 0 || cols <= 0) {
                System.out.println("Rectangle dimensions must be greater than zero.");
                return;
            }

            String border = "*";
            for (int i = 1; i < cols; i++) {
                border += "*";
            }

            for (int i = 0; i < rows; i++) {
                if (i == 0 || i == rows - 1) {
                    System.out.println(border);
                } else {
                    String middle = "*";
                    if (cols > 2) {
                        for (int j = 1; j < cols - 1; j++) {
                            middle += " ";
                        }
                        middle += "*";
                    } else if (cols == 2) {
                        middle = "**";
                    }
                    System.out.println(middle);
                }
            }
        }

        @Override
        public String toString() {
            return "Rectangle[length=" + length + ", width=" + width + "]";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        float length;
        float width;

        while (true) {
            System.out.print("Enter length (0 < length <= 40): ");
            if (scanner.hasNextFloat()) {
                length = scanner.nextFloat();
                if (length > 0.0f && length <= 40.0f) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid length! Try again.");
        }

        while (true) {
            System.out.print("Enter width (0 < width <= 40): ");
            if (scanner.hasNextFloat()) {
                width = scanner.nextFloat();
                if (width > 0.0f && width <= 40.0f) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid width! Try again.");
        }

        rect.setLength(length);
        rect.setWidth(width);

        System.out.println("Rectangle info: " + rect);
        System.out.println("Your rectangle:");
        rect.printRectangle();
        scanner.close();
    }
}
