package filter;

public class Items implements Comparable<Object> {

	private String item;
	private String name;
	
	public Items(String item, String name) {
		super();
		this.setItem(item);
		this.setName(name);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    @Override
    public String toString() {
        return item + " -- " + name;
    }

    public int compareTo(Object o) {
        Items other = (Items) o;
        return this.item.compareTo(other.item);
    }
}
