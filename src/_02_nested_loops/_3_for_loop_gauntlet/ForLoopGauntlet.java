package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
	
	public static void main(String[] args) {

////		1. Display all numbers from 0 to 100
//		for(int i = 0; i < 101; i++) {
//			System.out.println(i);
//		}
//		
////		2. Display all numbers from 100 to 0
//		for(int i = 100; i >= 0; i--) {
//			System.out.println(i);
//		}
//		
////		3. Display all even numbers from 2 to 100
//		for(int i = 2; i <= 100; i++) {
//			if(i%2 == 0) {
//				System.out.println(i);
//			}
//		}
//		
////		4. Display all odd numbers from 1 to 99
//		for(int i = 1; i < 100; i++) {
//			if(i%2 == 1) {
//					System.out.println(i);
//			}
//		}
//		
////		5. Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
//
//		for(int i = 1; i <= 500; i++) {
//			System.out.print(i);
//			if(i%2 == 0) {
//				System.out.print(" even");
//			} else {
//				System.out.print(" odd");
//			}
//			System.out.println();
//		}
		
////		6. Display all multiples of 7 from 0 to 777.
//
//		for(int i = 0; i <= 777; i++) {
//			if(i%7 == 0) {
//				System.out.println(i);
//			}
//		}
		
//		7. Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person)
		for(int year = 2006; year <= 2024; year++) {
			int age = year - 2006;
			System.out.println("In " + year + ", I was " + age + " years old.");
		}
		
	}
	
}	