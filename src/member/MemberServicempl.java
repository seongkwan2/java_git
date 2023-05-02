package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServicempl implements MemberService {
	
	Scanner input = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<>();
	boolean bool = true;

	@Override
	public void memberAdd() {
		System.out.println("회원 저장 기능");
		String userinput=null;
		
		while(bool) {
			System.out.println("1.회원 확인 2.회원 생성");
			System.out.println("선택");
			int num=input.nextInt();
			switch (num) {
			case 1 : 
				System.out.println("이름 입력: ");
				userinput = input.next();
				if(userinput.equals(arr)) {
					arr.add(userinput);
				}else {
					System.out.println("회원 생성 필요");
				}
					
				break;
			case 2 : 
				for (int i=0; i<arr.size(); i++ ) {
					System.out.println("이름 입력: ");
					userinput = input.next();
					if(!userinput.equals(arr)) {
						arr.add(userinput);
						System.out.println("회원 확인"); 
					}else {
						System.out.println("회원 정보 없음");
					}
				}
				
				System.out.println("회원 생성");
				break;
			
			}
			
		}
		
		
	}

	@Override
	public void memberView() {
		System.out.println("전체 회원 수");
		int memberSize = arr.size();
		System.out.println(memberSize);
		
	}
	
	

}
