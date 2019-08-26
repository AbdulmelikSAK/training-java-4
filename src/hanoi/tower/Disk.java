package hanoi.tower;

public class Disk {
	private int size;
	public Peg peg;
	public Disk(int size) {
		if (size < 1) {
			throw new IllegalArgumentException("Illegal size");
		}
		this.size = size;
	}
	public int size() {
    return size;
	}
	
	public int getsize() {
		return size;
	}
}
