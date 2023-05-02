package event;

public class EventDTO {
	private String[] events;
	
	
	public EventDTO(String[] events) {
		this.events = events;
	}
	
	public String[] getEvents() {
		return events;
	}

	public void setEvents(String[] events) {
		this.events = events;
	}
	
	
}
