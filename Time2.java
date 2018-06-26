public class Time2 {
	private int hour; 
	private int minute;
	private int second;
	
	public Time2() {
		this(0, 0, 0);
	}
	
	public Time2(int hour) {
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public Time2(int h, int m, int s) {
		if (h < 0 || h >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if(m < 0 || m >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		
		if(s < 0 || s >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
	
	public int getTotalSeconds() { // convert the hours and minutes to seconds and add to total number of seconds.
		return 3600 * hour + 60 * minute + second;
	}	
	
	public Time2(Time2 time) {
		//this(time.getHour(), time.getMinute(), time.getSecond());
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if(minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		
		if(second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// validate and set hour
	public void setHour(int a) {
		if (a < 0 || a >= 24) 
			throw new IllegalArgumentException("hour must be 0-23");
		this.hour = a;
	} 
	// validate and set minute
	public void setMinute(int minute) {
		if (minute < 0 && minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		this.minute = minute;
	} 
	// validate and set second
	public void setSecond(int second) {
		if (second >= 0 && second < 60)
			throw new IllegalArgumentException("second must be 0-59");
		this.second = second;
	} 
	
	// getter methods
	// get hour value
	public int getHour() {
		return hour;
	}
	// get minute
	public int getMinute() { 
		return minute; 
	}
	// get second value
	public int getSecond() { 
		return second; 
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	// convert to String in universal-time format
	public String toString() {
		return String.format("%d:%02d:%02d %s", 
			((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), 
			getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}	
}