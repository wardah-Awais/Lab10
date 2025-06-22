package tasks;

	public class calculator {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public static void main(String[] args) {
	    	calculator calc = new calculator();
	        System.out.println("Addition: " + calc.add(10, 5));
	        System.out.println("Subtraction: " + calc.subtract(10, 5));
	    }

}
