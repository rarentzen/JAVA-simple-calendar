
public class Calendar {
	static final int MAXEVENTS = 4;
	Event[] events;
	int numEvents;
	
	public Calendar() {
		numEvents = 0;
		events = new Event[MAXEVENTS];
	}
	
	public boolean addEvent(Event e) {
		if (numEvents == MAXEVENTS)
			return false;
		else
		for (int i=0; i<events.length; i++) {
			if (events[i] == null) {
				events[i] = e;
				break;
			}
		}
			numEvents++;
			return true;
	}
	
	public int findEvent(Event e) {
		int index = -1;
		for (int i=0; i<events.length; i++) {
			if (events[i] != null) {
			if (events[i].equals(e)) {
					index = i;
					break;
			}
			}
		}
		return index;
	}
	
	public Boolean removeEvent(Event e) {
		int removeIndex = findEvent(e);
		if (removeIndex != -1 ) {
			events[removeIndex] = null;
			numEvents--;
			return true;
		}
		else
			return false;
		
	}
	
	public void dump() {
		for (int i=0; i<events.length; i++) {
			if (events[i] == null)
				System.out.print("");
			else 
				System.out.println(events[i].toString());
		}
	}
}
