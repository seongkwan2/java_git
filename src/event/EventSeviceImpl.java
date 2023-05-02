package event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EventSeviceImpl implements EventSevice {

	@Override
	public void EventView() {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("M");
		String s_t = s.format(d);
		
		System.out.println("===이달의 이벤트 보기===");
		System.out.println("이번달은 "+s_t+"월 입니다.");
		if(equals(s_t)) {
			System.out.println("123");
		}
		
		
	}

	@Override
	public void AllEventView() {
		
	

	}
}
