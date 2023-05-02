package main;

import java.util.Scanner;

import event.EventSeviceImpl;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.println("1.회원이동 2.이벤트이동");
			try {
				num = input.nextInt();
			} catch (Exception e) {
				input.nextLine();
			}
			switch(num) {
			case 1 : break;
			case 2 : 
				EventSeviceImpl event = new EventSeviceImpl();
				event.EventView();
				break;
			case 3 : break;
			}
		}
		
	}
}
