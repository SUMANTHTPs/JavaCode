


public class Maths {

	public static void repeatingString(String s, int count) {
		// int i=0,j=0,k=0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ABCD";
        StringBuilder builder = new StringBuilder(input);
        String reverse = builder.reverse().toString();
        String pattern = input + reverse.substring(1);
        int repeatCount = 10;
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(pattern);
        for (int i = 0; i < repeatCount; i++) {
            resultBuilder.append(pattern.substring(1));
        }
        String output = resultBuilder.toString();
        System.out.println(output);
	}
}
