package ui;

import java.util.Scanner;

public class Main {
	
	public Scanner sc = new Scanner(System.in);
	
	private static int tower;
	private static int tower2;
	private static int tower3;
	
	public static void main(String[] args) {
		
		Main ppal = new Main();
		Main.setTower(3);
		System.out.println(tower + " " + tower2 + " " + tower3);
		Main.solveTowers(3, 1, 3);
		

	}
	
	public Main() {
		setTower(0);
		tower2=0;
		tower3=0;
	}
	
	public void repeatCase(int option) {
		
	}
	
	 

	public static void setTower(int t) {
		tower = t;
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
