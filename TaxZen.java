package pracCode;
import java.util.ArrayList;
import java.util.Scanner;

public class TaxZen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		ArrayList<String> operations = new ArrayList<>();
		System.out.println("Enter the user option");
		int option = 0;
		while(option!=3) {
			option = scn.nextInt();
			switch(option){
			case 1: 
				System.out.println("Enter the sub option");
				String subOptn = scn.next();
				if(subOptn.equals("a")) {
					operations.add("a");
					System.out.println("Enter the index where value is to be updated");
					int indx = scn.nextInt();
					System.out.println("Enter the value which is to be placed");
					int val = scn.nextInt();
					if(indx >= arr.length) {
						System.out.println("Enter the value within Range");
					} else {
						arr[indx] = val;
					}
					System.out.println("Array Updated");
					for(int i = 0; i < arr.length; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
				
				} else if(subOptn.equals("b")) {
					operations.add("b");
					System.out.println("Enter the value to be replaced");
					for(int i = 0; i < arr.length; i++) {
						arr[i] = scn.nextInt();
					}
					System.out.println("Value Replaced");
					for(int i = 0; i < arr.length; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
				} else if(subOptn.equals("c")) {
					break;
				}
				System.out.println("Enter Next Option");
				break;
				
			case 2:
				operations.add("2");
				System.out.println("Enter the Element to be searched");
				int elem = scn.nextInt();
				int indx = searchThisElement(elem , arr);
				if(indx==-1) {
					System.out.println("Element not found");
				} else {
					System.out.println("Element found at "+indx);
				}
				System.out.println();
				System.out.println("Enter Next Option");
				break;
			
			case 3:
				for(String str : operations) {
					if(str=="a") {
						System.out.println("Modified element of the array");
					} else if(str=="b") {
						System.out.println("Replaced all the element of the array");
					} else if(str=="c") {
						System.out.println("----");
					} else if(str=="2") {
						System.out.println("Searched an element from the array");
					}
				}
				option = 3;
				break;
			default : 
				System.out.print("wrong input!!!");
				break;
			
		}
		}
		

	}

	private static int searchThisElement(int elem , int arr[]) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++) {
			if(elem==arr[i]) {
				return i;
			}
		}
		return -1;
	}


}
