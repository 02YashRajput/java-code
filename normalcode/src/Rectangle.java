import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input line containing length and breadth separated by a space
        String input = scanner.nextLine();

        // Split the input line to get length and breadth as separate strings
        String[] dimensions = input.split(" ");

        // Convert the strings to integers
        int length = Integer.parseInt(dimensions[0]);
        int breadth = Integer.parseInt(dimensions[1]);

        // Calculate the area and perimeter
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        // Print the area and perimeter in the same line
        System.out.println(area + " " + perimeter);

        // Close the scanner
        scanner.close();
    }
}

