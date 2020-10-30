import java.util.Scanner;
public class myMain {
    public static void apCalculation(){ // my method for area AND perimeter calculation.

        /* I have combined task 3 and 4 into one Method.
         * That's why I'm not calling my Method "calculateRectArea".
         */

        Scanner sc = new Scanner(System.in); // sc - is the name of my Scanner.

        int width, height, sumArea, sumPerimeter; // my variables for width, height, area and perimeter.

        // here are my inputs.
        System.out.println("type in your width: ");
        width = sc.nextInt();
        System.out.println("type in your height: ");
        height = sc.nextInt();

        // here are my calculations and conditions.
        if(width < 0){ // Negative numbers for Calculations of Area and Perimeter would not make sense.
            System.out.println("You can only calculate this with positive numbers "+ width +" is negative.");
        } else if(height < 0){  // Negative numbers for Calculations of Area and Perimeter would not make sense.
            System.out.println("You can only calculate this with positive numbers "+ height +" is negative.");
        } else if(width == height){ // Square Area and Perimeter
            sumArea = width * width; // it would not matter in this case, if I would've used width * height.
            sumPerimeter = width * 4;
            System.out.println("The Area is: "+ sumArea +" cm² "+"| The Perimeter is: "+ sumPerimeter +" cm");
        } else{ // Rectangle Area and Perimeter
            sumArea = width * height;
            sumPerimeter = (width + height) * 2; // this is for perimeter of a rectangle and not necessary.
            System.out.println("The Area is: "+ sumArea +" cm² "+"| The Perimeter is: "+ sumPerimeter +" cm");
        }
    }

    public static void main(String[] args) { // this is my main Method.

        for(int i = 0; i < 6; i++){ // repeats the method six times. As task 5 asks for min. 6 examples.
            System.out.println(i + 1+". calculation");
            apCalculation();
            System.out.println();
        }

        /* Ive tried saving my data in an array, but i could not get it to work.
         * So I gave up on that but id love to know how to do that.
         */

    }
}
