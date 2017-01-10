package tests;

// This class was create just to provide some format to output information on the console.

public class Inform {
	
	public Inform(String type) {
		System.out.println("====================== " + type + " =========================");		
	}
	
	public Inform(String message, String type) {
		System.out.println("====================== " + type + " =========================");
		System.out.println(message);
		System.out.println("=======================================================");		
	}

	public void show(String message) {
		System.out.println(message);
		System.out.println("=======================================================");		
	}
	
	public void show(String message, String type) {
		System.out.println("====================== " + type + " =========================");
		System.out.println(message);
		System.out.println("=======================================================");
	}	
	
}
