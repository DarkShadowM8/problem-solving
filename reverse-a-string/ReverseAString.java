public class ReverseAString{
	/**
	*	this is the main method with the business logic to reverse a String
	*	@param args is the parameter used for user Input String that will be 
	*	reversed.
	*	return Nothing
	**/
	public static void main(String[] args){
		/**
		*	Initializing a variable (reverseString) of type String
		*	to save the reverse of the given string 
		**/
		String reverseString = "";

		/**	
		*	Variable i is an iterator for while loop with an intial value
		*	of user input string's array length minus 1 as in java index start
		*	with 0
		**/
		int i = args.length - 1;

		/** 
		*	the condition of while loop is if the iterator is not less than 0
		*	as the length of a string can't be less than 0.
		*	using nested loop as it is an array of string.
		*	In body of for loop the variable reverseString is concatinating every
		* 	single character of the String args.
		*	And iterator i is decrementing in every iteration.
		**/
		while (i >= 0){
			for (int j = args[i].length() - 1; j >= 0 ; j--){
				reverseString += args[i].charAt(j);
			}
			//System.out.println(i + "	" + args[i].length());
			//reverseString += args[i];
			i--;
		}

		System.out.println(reverseString);
	}
}