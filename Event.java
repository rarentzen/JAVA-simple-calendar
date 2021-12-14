
public class Event {
	private Date newdate;
	private int newstart;
	private int newend;
	private String newdescription;
	
	public Event (Date date, int start, int end, String description) throws IllegalArgumentException { 
		newdate = date;
		if (start > end)
			throw new IllegalArgumentException ("Start time cannot be after end time");
		if (start >= 0 && start <= 23)
			this.newstart = start;
		else
			throw new IllegalArgumentException ("Start time out of bounds");
		if (end >= 0 && end <= 23)
			this.newend = end;
		else
			throw new IllegalArgumentException ("End time out of bounds");
		newdescription = description;
	}

	public Date getNewdate() {
		return newdate;
	}

	public int getNewstart() {
		return newstart;
	}

	public int getNewend() {
		return newend;
	}

	public String getNewdescription() {
		return newdescription;
	}

	public void setNewdescription(String newdescription) {
		this.newdescription = newdescription;
	}
	
	public String toString() {
		return newdate.toString() + " " + this.newstart + "--" + this.newend + ":" + this.newdescription;
	}
	
	public boolean equals(Object obj) {
		Event otherevent = (Event)obj;
		if (otherevent.newstart == this.newstart && otherevent.newend == this.newend &&  this.newdescription == otherevent.newdescription && this.newdate == otherevent.getNewdate())
			return true;
		else
			return false;
	}

}
