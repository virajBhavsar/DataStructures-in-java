package dataStructures;

public class Display {
	static void display(int arr[]) {
		System.out.println();
		System.out.print("     ");

		for(int i =0;i<arr.length;i++){
			
			if(i==arr.length - 1) {
				if(arr[i] == 0) {
					System.out.print(" _ ");
				}else {
					System.out.print(" " + arr[i] + " ");					
				}
			}else {
				if(arr[i] == 0) {
					System.out.print(" _ ");
				}else {
				System.out.print(" " + arr[i]  + "  ");
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------------------------------");
	}
}
