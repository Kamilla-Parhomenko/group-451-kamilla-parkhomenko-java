package homework_4;

public class Calculator {

	static int sum(int a, int b) {
		return a + b;
	}
	
//	static double avg(double ...numbers) {
//		
//	}
	
	void pmax(int ...values) {
		int max = values[0];
        for (int i=1; i<values.length; i++) {
            if (values[i]>max) {
                max = values[i];
            }
        }
        
        System.out.println(max);
	}
}
