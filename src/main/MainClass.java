package main;

import java.util.Scanner;

import login.Login;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		Login l = new Login();
		
		while(true) {
			System.out.println("1.로그인 기능");
			System.out.println("2.회원 기능");
			System.out.println("3.게시판 기능");
			num = input.nextInt();
			switch(num) {
			case 1:
				l.login();
				break;
			case 2:
				break;
			case 3:
				break;
			}
			
		}
		
	}
}