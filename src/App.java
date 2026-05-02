import java.util.Scanner;

public class App {
  public static void print(String t){ // to print strings
  	System.out.print(t);
	}

  public static void printN(int t){ // to print numbers
    System.out.println(t);
	}

public static int secondValue(int res, Scanner scan){  // This function helps not to repeat the same code more than once
    System.out.println("Your current value is: " + res);
    print("Type in the second value: ");
    int num = scan.nextInt();
        scan.nextLine();
        return num;
}

public static void simpleCalculator(){
    Scanner scan = new Scanner(System.in);    
		int n2 = 0;
        int result = 0; // By requering the first number before getting into the loop "while", the rest of the program can be run in the same way and there's no need to aks for it anymore
        print("Type in your first number: ");
        result = scan.nextInt();
        scan.nextLine(); // It is always a good practice to add this line after using "nextInt()" so it does not throw an extra line at you while running the program
    while (true){
		print("Insert a valid selector (+, -, *, /): ");
		String selector = scan.nextLine();
        if (selector.equals("end")){
			print("Calculator closed.");
            break;
        } else {
			if (selector.equals("+")) {
                n2 = secondValue(result, scan); // It is good summaring all the code on lines 12 through 18 in just one
                System.out.println("The result is: "  + (result += n2)); // (+=) This is the reason why you can loop through the code almost infinitely
            } else if (selector.equals("-")) {
				n2 = secondValue(result, scan);
                System.out.println("The result is: "  + (result -= n2));
			} else if (selector.equals("*")) {
				n2 = secondValue(result, scan);
                System.out.println("The result is: "  + (result *= n2));
			}  else if (selector.equals("/")) {
				n2 = secondValue(result, scan);
                System.out.println("The result is: "  + (result /= n2));
			} else {
				print("A proper selector is to be typed in \n"); // I must admit I do not know how to check whether what is being typed in is an integer or not, so I only check for the selector
			}
        }
    }
    scan.close();
}

    public static void main(String[] args) throws Exception {
        simpleCalculator();
    }
}
