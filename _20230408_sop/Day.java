public class Day {
	private String work;

	void set(String work) {
		this.work = work;
	}

	String get() {
		return (work);
	}

	void show() {
		System.out.print(this.work != null ? "There is [" + this.get() + "]" : "Nothing");
	}
}
