package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	static BufferedWriter bw;
	static BufferedReader br;
	private static int tower=0;
	private static int tower2=0;
	private static int tower3=0;
	
	public static void main(String[] args) throws IOException {
	
		br = new BufferedReader(new FileReader("data/input.txt"));
		bw = new BufferedWriter(new FileWriter("data/output.txt"));
		
		int repetitions = Integer.parseInt(br.readLine());
		int n = 0;
		
		for(int i =0;i<repetitions;i++) {
			n = Integer.parseInt(br.readLine());
			bw.write(n + " " + 0 + " " + 0 + "\n");
			tower = n;
			tower2 = 0;
			tower3 = 0;
			solveTowers(n, 1, 3);
			bw.write("\n");
			}
		br.close();
		bw.close();
		

	}
	
	
	public static void solveTowers(int n, int start, int end) throws IOException {
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
	
	public static void printMove(int start, int end) throws IOException {
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
		bw.write(tower + " " + tower2 + " " + tower3 + "\n");
	}
	

}
