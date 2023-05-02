package serviceCenter;

import java.util.Scanner;

public class ServiceCenterImpl implements ServiceCenter {
	complaintDTO cDto = new complaintDTO();
	Scanner input = new Scanner(System.in);
	@Override
	public void complaintAdd() {
		System.out.println("불만사항 : ");
		String s = input.next();
		cDto.setSs(s);
		System.out.println("불만사항이 등록되었습니다");
	}

	@Override
	public void complaintView() {
		System.out.println("=================================");
		System.out.println("\t 불만사항 목록");
		System.out.println("=================================");
		if(cDto.getSs().size() == 0) {
			System.out.println("등록된 불만사항이 없습니다");
		}else {
			for(int i = 0; i < cDto.getSs().size(); i++) {
			System.out.println((i+1)+ "." + cDto.getSs().get(i));
		}
		}
		
	}
	
	
	
	
}
