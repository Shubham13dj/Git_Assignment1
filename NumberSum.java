import java.util.Scanner;

public class NumberSum {
	public static void main ( String args[] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter three numbers :");
		int firstNo = sc.nextInt();
		int secondNo =  sc.nextInt();
		int thirdNo =  sc.nextInt();
		int smallest = firstNo;
        int largest = firstNo;
		   if (secondNo < smallest) {
            smallest = secondNo;
        }
        if (secondNo > largest) {
            largest = secondNo;
        }
        
        if (thirdNo < smallest) {
            smallest = thirdNo;
        }
        if (thirdNo > largest) {
            largest = thirdNo;
        }

        System.out.println("Smallest: " + (smallest + largest) );
	}
}