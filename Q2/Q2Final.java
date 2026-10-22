
//Oleksandra Chebotar
//C00325201
//Lab2 OOSD
public class Q2Final {
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

        public float getArea() {
            return length * width;
        }

        public float getPerimeter() {
            return 2 * (length + width);
        }

        @Override
        public String toString() {
            return "Rectangle[length=" + length + ", width=" + width + "]";
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        System.out.println("Default rectangle: " + rect);

        rect.setLength(5.0f);
        rect.setWidth(10.0f);
        System.out.println("After setting values: " + rect);
        System.out.println("Length getter: " + rect.getLength());
        System.out.println("Width getter: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        Rectangle testRect = new Rectangle();
        try {
            testRect.setLength(0.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid length test: " + e.getMessage());
        }

        try {
            testRect.setWidth(45.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid width test: " + e.getMessage());
        }

        testRect.setLength(15.5f);
        testRect.setWidth(25.5f);
        System.out.println("Final rectangle: " + testRect);
        System.out.println("Final area: " + testRect.getArea());
        System.out.println("Final perimeter: " + testRect.getPerimeter());
    }
}
