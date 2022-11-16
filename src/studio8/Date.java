package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int date;
	private int year;
	private boolean isHoliday;
	
	


    public Date(int month, int date, int year, boolean isHoliday) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
		this.isHoliday = isHoliday;
	}



	@Override
	public String toString() {
		return "Date [month=" + month + ", date=" + date + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}









	public static void main(String[] args) {
		Date a=new Date(11, 16, 2022, false);
		Date b=new Date(11, 16, 2022, false);
		Date c=new Date(11, 16, 2023, false);
		Date d=new Date(11, 17, 2022, false);
		Date e=new Date(11, 16, 2022, true);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(a);
		list.add(b);
		list.add(a);
		
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(a);
		set.add(b);
		set.add(a);
		System.out.println(set);

    }



	@Override
	public int hashCode() {
		return Objects.hash(date, isHoliday, month, year);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return date == other.date && isHoliday == other.isHoliday && month == other.month && year == other.year;
	}

}
