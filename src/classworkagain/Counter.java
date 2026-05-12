package classworkagain;

public class Counter {

	static int count = 0;
	
	public Counter(int count) {
		Counter.count = count++;
	}
	
	void destroy() {
		Counter.count--;
	}
}
