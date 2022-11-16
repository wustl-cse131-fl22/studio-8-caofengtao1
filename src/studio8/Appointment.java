package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;

	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appointment a1 = new Appointment(new Date(11,16,2022,false),new Time(16,45,false));
		System.out.println(a1);
		Appointment a2 = new Appointment(new Date(11,16,2022,false),new Time(16,49,false));
		System.out.println(a1);
		HashSet<Appointment> calendar = new HashSet<Appointment>();
		calendar.add(a1);
		calendar.add(a2);
		
		System.out.println(calendar);

	}

}
