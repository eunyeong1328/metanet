package kosa.mission5;

public class star {

	public static void main(String[] args) {
		int number = 5;
		
		for(int i=number; i>0; i--) {
//			System.out.print(" ");
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<number; j++) {
				System.out.println("*");
			}
//			System.out.println("*");
//			for(int j=i; j<i; j++) {
//				System.out.print("*");
//			}
//			for(int z=1; z<i; z++) {
//				System.out.println("*");
//			}
		}
	}
	
//	for(int i=5; i>0; i--) {
//	System.out.println(i);
//}

}
