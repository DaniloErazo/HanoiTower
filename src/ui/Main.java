package ui;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	private static int tower;
	private static int tower2;
	private static int tower3;
	
	public static void main(String[] args) {
		tower=0;
		tower2=0;
		tower3=0;
		
		int repetitions = sc.nextInt();
		sc.nextLine();
		int[] cases = new int[repetitions];
		int n;
		
		for(int i=0; i<repetitions; i++) {
			n=sc.nextInt();
			sc.nextLine();
			cases[i]=n;
		}
		
		for (int i = 0; i < cases.length; i++) {
			n = cases[i];
			tower = n;
			tower2 = 0;
			tower3 = 0;
			System.out.println(n + " " + 0 + " " + 0 );
			solveTowers(n, 1, 3);
			System.out.println("\n");
		}
		
		

	}
	
	
	public static void solveTowers(int n, int start, int end) {
		if(n==1) {
			printMove(start, end);
		}else {
			int aux = 6 - (start+end);
			//move from 1 to aux
			solveTowers(n-1, start, aux);
			printMove(start, end);
			
			//move from aux to 3 rod
			
			solveTowers(n-1, aux, end);

		}
	}
	
	public static void printMove(int start, int end) {
		//System.out.println(start + " --> " + end);
		if(start==1) {
			tower=tower-1;
		}else if(start==2) {
			tower2=tower2-1;
		}else if(start==3) {
			tower3=tower3-1;
		}
		
		if(end==1) {
			tower=tower+1;
		}else if(end==2) {
			tower2=tower2+1;
		}else {
			tower3=tower3+1;
		}
		System.out.println(tower + " " + tower2 + " " + tower3 );
	}
	

}
