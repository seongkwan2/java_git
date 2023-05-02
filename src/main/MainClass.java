package main;

import java.util.Scanner;

import event.EventSeviceImpl;
import member.MemberService;
import member.MemberServicempl;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		MemberService mem = new MemberServicempl();
		
		while(true) {
			System.out.println("1.회원이동 2.이벤트이동 3.고객센터");
			try {
				num = input.nextInt();
			} catch (Exception e) {
				input.nextLine();
			}
			switch(num) {
		    case 1 : System.out.println("1.회원등록 2.회원보기");
			 		 num = input.nextInt();
			 		 switch(num) {
			 		 case 1 : mem.memberAdd(); 
			 			 break;
			 		 case 2 : mem.memberView();
			 			 break;
			 		 }
			 		 break;
			case 2 : System.out.println("1.이달의 이벤트 보기 2.전체 이벤트 보기");
			 	 	 num = input.nextInt();
			 	 	 EventSeviceImpl event = new EventSeviceImpl();
			 	 	 switch(num) {
			 	 	 case 1 :
			 	 		 event.EventView();
			 	 		 break;
			 	 	 case 2 : 
			 	 		 event.AllEventView();
			 	 		 break;
			 	 	 }
				break;
			case 3 : System.out.println("1.불만등록 2.불만보기");
			 		 num = input.nextInt();
			 		switch(num) {
			 	 	 case 1 : break;
			 	 	 case 2 : break;
			 	 	 }
				break;

			}
		}
	}
}
