package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean is12;
	
	

	public Time(int hour, int minute, boolean is12) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.is12 = is12;
	}


/**
 * 
 */
	public String toString() {
		if (is12) {
			if (hour<=12) {
				return hour + " : " + minute;
			}
			else {
				return hour-12 + " : " + minute;
			}
		}
		else {
			return hour + " : " + minute;
		}
		
	}






	@Override
public int hashCode() {
	return Objects.hash(hour, minute);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Time other = (Time) obj;
	return hour == other.hour && minute == other.minute;
}


	public static void main(String[] args) {
		Time a=new Time(16, 23, true);
		Time b= new Time(16, 24, false);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
 
    	
    }

}