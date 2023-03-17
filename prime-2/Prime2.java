public class Prime2{
	public static void main (String[] args){
		if (args.length == 2)
		{
			for (int i = Integer.parseInt(args[0]); i< Integer.parseInt(args[1]); i++){
				int prime = 1;
				for (int j = 2; j < i; j++){
					if ( i % j == 0){
						prime = 0;
						break;
					}
				}
				if (prime == 1){
					System.out.print(i + "	");
				}
			}
		}
		else{
			System.out.println("Please Enter 2 numbers only");
		}	
	}
}	