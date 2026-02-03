package homework_8;

public class ScopeTest {

	public void testScopes() {
		int x = 10;
		if (x > 5) {
		    int y = x * 2;
		    System.out.println("y = " + y);
		}
		System.out.println("x = " + x);
		System.out.println("y = ???");
	}
}
