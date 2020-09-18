package dataStructures;


import java.util.Scanner;

public class stack {
	static Scanner scan = new Scanner(System.in);

	static int pointer = 0;
	
	public static void main(String []args) {
		int a[] = new int[setSize()];
		program(a);
		
		
	}
	
	static void program(int a[]) {
		int x;
		
		do {
			System.out.println();
		System.out.println("************************************************************");
		System.out.println("*   1.push                                                 *");
		System.out.println("*   2.pop                                                  *");
		System.out.println("*   3.display                                              *");
		System.out.println("*   4.exit                                                 *");
		System.out.println("************************************************************");
		System.out.println();
		System.out.print("select option : ");
		x = scan.nextInt();
		
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println();
		
		switch(x){
			case 1:
				System.out.print("  ");
				System.out.println("push operation -->");
				System.out.println();
				System.out.println();
				push(a);
				break;
			case 2:
				System.out.print("  ");
				System.out.println("pop operation -->");
				System.out.println();				
				pop(a);
				break;
			case 3:
				Display.display(a);
				break;
			case 4:
				System.out.println("exited.........");
				break;
		}
		}while(x != 4);
	}
	
	static int setSize() {
		int x;
		System.out.print("set size : ");
		x = scan.nextInt();
		return x;
	}
	
	
	static void push(int arr[]) {
		if(pointer == arr.length) {
			System.out.println();
			System.out.print("     ");
			System.out.println("overflow");
		}else {
			System.out.print("     ");
			System.out.print("enter value : ");
			int val = scan.nextInt(); 
			arr[pointer] = val;
			System.out.println();
			System.out.print("     ");
			System.out.println(val + " pushed at index " + pointer);
			pointer++;
		}
		Display.display(arr);

	}
	
	
	static void pop(int arr[]) {

		if(arr[0] == 0) {
			System.out.println();
			System.out.print("     ");
			System.out.println("underflow");
		}else {
			if(pointer == 0) {
			//don't decrease  if it's first index
			}else {
		pointer--;
		}	
			System.out.println();
			System.out.print("     ");
			System.out.println(arr[pointer] + " deleted at index " + pointer);
			arr[pointer] = 0;
						
		}
		
		Display.display(arr);
	}

}
