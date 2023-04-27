package main;

import java.util.Scanner;

import board.BoardService;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		BoardService bo = new BoardService();
		while(true) {
			System.out.println("1.로그인 기능");
			System.out.println("2.회원 기능");
			System.out.println("3.게시판 기능");
			num = input.nextInt();
			switch(num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				bo.board();
				break;
			}
			
		}
		
	}
}
