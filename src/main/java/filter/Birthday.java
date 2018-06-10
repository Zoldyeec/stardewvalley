package filter;

public class Birthday implements Comparable<Object> {

	private String name;
	private String birthday;
	private int day;
	
	public Birthday(String name, String birthday, int day) {
		super();
		this.setName(name);
		this.setBirthday(birthday);
		this.setDay(day);
	}

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
    @Override
    public String toString() {
        return name + " -- " + birthday;
    }

    public int compareTo(Object o) {
        Birthday other = (Birthday) o;
        return this.name.compareTo(other.name);
    }

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
}
