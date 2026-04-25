import java.util.Scanner;

public class App {
  public static void print(String t){ // to print strings
  	System.out.print(t);
	}

  public static void printN(int t){ // to print numbers
    System.out.println(t);
	}

    public static void simpleCalculator(){
        Scanner scan = new Scanner(System.in);    
				int n2 = 0;
                int result = 0;
                print("Type in your first number: ");
                result = scan.nextInt();
        while (true){
			print("Insert a valid selector (+, -, *, /): ");
			String selector = scan.nextLine();
            if (selector.equals("end")){
				print("Calculator closed.");
                break;
            } else {
				if (selector.equals("+")) {
                    System.out.println("Your current number is: " + result);
                    print("Type in the second value: ");
                    n2 = scan.nextInt();
                    System.out.println("The result is: "  + (result + n2));
                    result += n2;
                } else if (selector.equals("-")) {
					System.out.println("Your current number is: " + result);
                    print("Type in the second value: ");
                    n2 = scan.nextInt();
                    System.out.println("The result is: "  + (result - n2));
                    result -= n2;
				} else if (selector.equals("*")) {
					System.out.println("Your current number is: " + result);
                    print("Type in the second value: ");
                    n2 = scan.nextInt();
                    System.out.println("The result is: "  + (result * n2));
                    result *= n2;
				}  else if (selector.equals("/")) {
					System.out.println("Your current number is: " + result);
                    print("Type in the second value: ");
                    n2 = scan.nextInt();
                    System.out.println("The result is: "  + (result / n2));
                    result /= n2;
				} else {
					print("A proper selector is to be typed in");
				}
            }
        }
        scan.close();
    }

    public static void main(String[] args) throws Exception {
        simpleCalculator();
    }
}
