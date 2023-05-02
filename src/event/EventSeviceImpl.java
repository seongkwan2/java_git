package event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EventSeviceImpl implements EventSevice {
	
	
	String[] events = {"과일 세일", "소고기 세일", "생선 세일", 
			"전자제품 세일", "라면 세일", "짜장면 세일", 
			"피자 세일", "치킨 세일", "족발 세일", 
			"세일", "삼겹살 세일", "새우 세일"};
	
	EventDTO eDTO = new EventDTO(events);
	
	@Override
	public void EventView() {
		
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("M");
		int month = Integer.parseInt(s.format(d));
		
		System.out.println("=== " + month + "월 달의 이벤트 ===");
		System.out.println(month + "월달의 이벤트는 >>>" + events[month - 1] + "<<< 입니다.");
		System.out.println();
	}


	@Override
	public void AllEventView() {
		System.out.println("전체 이벤트 입니다.");

		
		for(int i=0; i < eDTO.getEvents().length; i++) {
			System.out.println((i+1) + "월달의 이벤트는 " + eDTO.getEvents()[i] + "입니다.");
		}
	}


}












