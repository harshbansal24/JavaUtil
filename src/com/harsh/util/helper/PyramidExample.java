package com.harsh.util.helper;

import java.util.Scanner;

public class PyramidExample {

	public PyramidExample() {
	
	}

	public static void main(String[] args)  {
//		pyramidOneTwoThree();
//		pyramidOneOneTwoOnetTwoThree();
//		pyramidOneOneTwoOneOneTwoThreeTwoOne();
//		pyramidNine8765432112345678Nine();
		pyramidNine89878987TillNine();
	}

	/**
	 *  9
                8 9 8
              7 8 9 8 7
            6 7 8 9 8 7 6
          5 6 7 8 9 8 7 6 5
        4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
	 */
	private static void pyramidNine89878987TillNine() {
		System.out.println("---HOW MANY ROWS YOU WANT TO PRINT ?---");
		Scanner sc = new Scanner(System.in);
		int nextInt = 9;//sc.nextInt();
		for(int i=nextInt;i>=1;i--){
			for (int j = 1; j <(i)*2; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <nextInt; j++) {
				System.out.print(j+" ");
			}
			for (int j = nextInt; j >= i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	/**
	 * 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 4 3 2 1
          1 2 3 4 3 2 1
            1 2 3 2 1
              1 2 1
                1
	 */
	private static void pyramidNine8765432112345678Nine() {
		System.out.println("---HOW MANY ROWS YOU WANT TO PRINT ?---");
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		for(int i=nextInt;i>=1;i--){
			for (int j = 1; j <=(nextInt- i)*2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(j+" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	/**
	 *  1
                1 2 1
              1 2 3 2 1
            1 2 3 4 3 2 1
          1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
	 */
	private static void pyramidOneOneTwoOneOneTwoThreeTwoOne() {
		System.out.println("---HOW MANY ROWS YOU WANT TO PRINT?---");
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		for (int i = 1; i < nextInt; i++) {
			for (int j = 1; j < (nextInt-i)*2; j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++){
				System.out.print(j+" ");
			}
			for(int j=i;j>0;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	/**
	 *  1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
	 */
	private static void pyramidOneOneTwoOnetTwoThree() {
		System.out.println("---HOW MANY ROWS YOU WANT TO PRINT?---");
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		 for (int i = 1; i <= nextInt; i++) {
			 for (int j = i; j < nextInt; j++) {
				 System.out.print(" ");	
			}
			 for (int j = 1; j <= i; j++) {
				 System.out.print(j+" ");	
			}
			System.out.println(); 
		 }
	}

	/**
	 * 1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
	 */
	private static void pyramidOneTwoThree() {
		System.out.println("---HOW MANY ROWS YOU WANT TO PRINT?---");
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		 for (int i = 1; i <= nextInt; i++) {
			 for (int j = nextInt; j > i/2; j--) {
				 System.out.print(" ");	
			}
			 for (int j = 0; j < i; j++) {
				 System.out.print(i+" ");	
			}
			System.out.println(); 
		 }
		 
		 int rowCount = 1;
		 for(int i=nextInt;i>0;i--){
			 for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			 for (int j = 1; j <=rowCount; j++) {
				System.out.print(rowCount+" ");
			}
			 rowCount++;
			 System.out.println();
		 }
	}
}
