package dataStructures;

import java.util.Scanner;

public class CircularQueue{
	static Scanner scan = new Scanner(System.in);

	static int pointer = 0;
	static int popointer = 0;

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
			if(arr[0] == 0) {
				pointer = 0;
				finalPush(arr);
			}else {
				System.out.print("     ");

				System.out.println("overflow");
			}
		}else {
			finalPush(arr);
			if(pointer == arr.length) {
				if(arr[0] == 0) {
					pointer = 0;
				}
			}
		}
		Display.display(arr);

	}
	static void finalPush(int arr[]) {
		System.out.print("     ");
		System.out.print("enter value: ");
		int val = scan.nextInt();
		arr[pointer] = val;
		pointer++;
	}
	
	
	static void pop(int arr[]) {
		while(arr[popointer] == 0) {
			if(arr[popointer] == 0) {
				if(popointer >= arr.length - 1) {
					popointer = 0;
					System.out.print("     ");
					System.out.println("underflow");
					break;
				}else {
					popointer++;
				}
			}
	}
		if(arr[popointer] != 0) {
		finalPop(arr);
			if(popointer == pointer) {
				pointer = 0; 
				popointer = 0;
			}
		}
		Display.display(arr);	

}
	
	static void finalPop(int arr[]) {
		arr[popointer] = 0;
		if(popointer >= arr.length - 1) {
			popointer = 0;
		}else {
			popointer++;
		}
		}

}
