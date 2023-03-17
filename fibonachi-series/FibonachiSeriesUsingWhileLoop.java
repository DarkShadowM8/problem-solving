public class FibonachiSeriesUsingWhileLoop{
    public static void main(String[] args){
	int num = Integer.parseInt(args[0]);
	if (num <= 1){
		System.out.print("0 1 1 ");
		return;
	}
	
	System.out.print("0 1 1 ");
	int previousPointer = 1, currentPointer = 1;

	while (previousPointer + currentPointer < num){
		System.out.print(previousPointer + currentPointer + " ");
		currentPointer = currentPointer + previousPointer;
		previousPointer = currentPointer - previousPointer;
	}
    }
}