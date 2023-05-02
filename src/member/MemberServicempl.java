package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServicempl implements MemberService {
	
	Scanner input = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<>();
	boolean bool = true;

	@Override
	public void memberAdd() {

		String userinput=null;
		System.out.println("이름 입력: ");
		userinput = input.next();
		arr.add(userinput);
		System.out.println("회원 생성 완료");
			
			}
	
		

	@Override
	public void memberView() {
		System.out.println("회원 보기");	
		if(arr==null) {
			System.out.println("회원 생성 필요");
		}else {
			int memberSize = arr.size();
			System.out.println(arr);
			System.out.println("전체 회원 수 : "+memberSize);
		}
		
		
		
		
	}
	
	

}
