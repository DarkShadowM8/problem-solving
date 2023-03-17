public class FibonachiSeriesUsingForLoop{
    public static void main(String[] args){
	int num = Integer.parseInt(args[0]);
	if (num <= 1){
		System.out.print("0 1 1 ");
		return;
	}
	System.out.print("0 1 1 ");
	int currentPointer = 1;
	for (int previousPointer = 1; previousPointer + currentPointer < num; previousPointer = currentPointer - previousPointer){
		System.out.print(previousPointer + currentPointer + " ");
		currentPointer += previousPointer;
	}
    }
}