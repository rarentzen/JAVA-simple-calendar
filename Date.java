
public class Date implements Comparable<Date> {
	private int newyear;
	private int newmonth;
	private int newday;
	
	
	public Date(int year, int month, int day) throws IllegalArgumentException {
		if (year >= 2014 && year <= 2020)
			this.newyear = year;
		else
			throw new IllegalArgumentException ("Year out of bounds");
		if (month >= 1 && month <= 12)
			this.newmonth = month;
		else
			throw new IllegalArgumentException ("Month out of bounds");
		if (day >= 1 && day <= 31)
			this.newday = day;
		else
			throw new IllegalArgumentException ("Day out of bounds");
	}
	
	
	public int getYear() {
		return newyear;
	}


	public int getMonth() {
		return newmonth;
	}


	public int getDay() {
		return newday;
	}
	
	public boolean equals(Object obj) {
		Date otherdate = (Date)obj;
		if (otherdate.newyear == this.newyear && otherdate.newday == this.newday && otherdate.newmonth == this.newmonth)
			return true;
		else
			return false;
	}


	public int compareTo(Date otherDate) {
		int result;				
		
        if (this.newyear < otherDate.newyear)	
            result = -1;				
        else if (this.newyear == otherDate.newyear && this.newmonth < otherDate.newmonth)	
            result = -1;
        else if (this.newyear == otherDate.newyear && this.newmonth == otherDate.newmonth && this.newday < otherDate.newday)	
            result = -1;
        else if (this.newyear == otherDate.newyear && this.newmonth == otherDate.newmonth && this.newday == otherDate.newday)
            result = 0;
        else
        	result = 1;
        return result;	
	}
	
	
	public String toString() {
		return newmonth + "/" + newday + "/" + newyear;
	}
	}
