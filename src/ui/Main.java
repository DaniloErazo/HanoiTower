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
		Main.hanoiTower(3, 1, 3, 2);
		
		

	}
	
	public Main() {
		setTower(0);
		tower2=0;
		tower3=0;
	}
	
	public void repeatCase(int option) {
		
	}
	
	 
	public static void hanoiTower(int discos, int agujaOrigen,int agujaDestino, int agujaTemp){
		 // caso base -- sólo hay que mover un disco
		 //System.out.println(tower + " " + tower2 + " " + tower3);
		 if (discos == 1)
		 {
			 System.out.printf("%n%d --> %d", agujaOrigen, agujaDestino);
			 //System.out.println("\n");
			 System.out.println("here");
			 return;
		 }
		 
		 hanoiTower(discos - 1, agujaOrigen, agujaTemp, agujaDestino);
		
		 System.out.printf("%n%d --> %d", agujaOrigen, agujaDestino);
		 System.out.println("\n");
		
		 hanoiTower(discos - 1, agujaTemp, agujaDestino, agujaOrigen);
		
		 
		 //tower3=tower3+1;
	}

	public static void setTower(int t) {
		tower = t;
	}
	

}
