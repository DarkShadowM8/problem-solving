/**
*	~~Main class from where the code will execute
*	~~this class has 2 methods "main", "add" and "parsingInt"
**/

public class ReallyBigNumberMath{
	/**
	*	~~main method intializing a singlyLinkedList and adding two nodes with string of number 
	*	that will be used for addition.
	**/
	public static void main(String[] args){
		Node node = new Node();
		node.addNode("18753285");
		node.addNode("2383275");
		node.display();
	}
	/**
	*	~~add method have two String type parameters
	*	~~add method work on the given arguments print the sum
	**/
	public static void add(String num_1, String num_2){
		//	declaring 3 array of int type 
		// 2 arrays for num_1 and num_2 and third array is for the sum of the num_1 and num_2
		int[] arr_1;
		int[] arr_2;
		int[] result;
		
		// as if we sum two numbers we placed the greater number in length on top of the other 
		// for the same concept this condition is checking which number should be 
		// on top of the other this logic will always store the number with greater length in arr_1
		// then it will parse the String into Integer
		if (num_1.length() > num_2.length())
		{
			arr_1 = new int[num_1.length()];
			arr_1 = parsingInt(arr_1, num_1);
			arr_2 = new int[num_2.length()];
			arr_2 = parsingInt(arr_2, num_2);
		}
		else{
			
			arr_1 = new int[num_2.length()];
			arr_1 = parsingInt(arr_1, num_2);
			arr_2 = new int[num_1.length()];
			arr_2 = parsingInt(arr_2, num_1);
		}
		
		// As if we add 2 numbers of any length there's a possibility that the length of the 
		// sum/result can be +1 of the length of the number with greater in length.
		result = new int[arr_1.length + 1];
		
		// if after the calculation the length of the result is same as the num_1 length
		// saving 0 in the index 0 as if a number start with 0 it does not change the value.
		result[0] = 0;
		
		// as addition start from right to left intializing 2 iterators to start adding from the
		// last index of arr_1 and arr_2.
		// loop will run till the index of the number with greater length does not reach to the right
		// most index 0.
		for (int i = arr_1.length - 1, j = arr_2.length - 1; i >= 0; i-- , j--){
			// if the index of the number with smaller length reach to the right most index 0
			// then ignore the calculation and just save the remaing index of the number with greater length
			if (j >= 0){
				// condition to check if there's a carry
				if (arr_1[i] + arr_2[j] >= 10){
					
					if (arr_1[i-1] != 0){
						result[i+1] =  (arr_1[i] + arr_2[j]) % 10;
						arr_1[i-1] += (arr_1[i] + arr_2[j]) / 10;
					}
					else{
						result[i+1] =  (arr_1[i] + arr_2[j]) % 10;
						result[i] =  (arr_1[i] + arr_2[j]) / 10;
					}
				}
				else{
					result[i + 1] = arr_1[i] + arr_2[j];
				}
			}
			else{
				result[i+1] = arr_1[i];
			}
		}
		// intializing iterator for while loop.
		// condition is for if the 0 index of the result is 0 which does not affect the value
		// then iterator should start from 1.
		int i = 0;
		if (result[0] == 0){
			i = 1;
		}
		while(i < result.length){
			
			System.out.print(result[i]);
			i++;
		}
	}
	
	// method for parsing int
	public static int[] parsingInt(int[] arr, String str){
		for (int i = 0; i < arr.length ; i++){
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		return arr;
	}
}
	/**
	*	Node class for singlyLinkedList
	**/
	class Node{
		public String data;
		public Node next;

		Node(){}
		Node(String data){
			this.data = data;
		}

		public Node head = null;
		public Node tail = null;

		// method to add a node with String parameter 
		public void addNode(String data){
			Node newNode = new Node(data);

			if (head == null){
				head = newNode;
				tail = newNode;
			}

			else{
				tail.next = newNode;
				tail = newNode;
			}
		}
		
		// method to delete a node
		public void delete(String data){
		System.out.println("Delete method Invoked!!!");
			Node check = head;
			if (head == null){
				System.out.println("no Data found!!!");
				return;
			}
			
			if (check.data.equals(data)){
				System.out.println("First Node");
				head = check.next;
			}
				
			while (check.next != null){
				if (check.next.data.equals(data)){
					check.next = check.next.next;
				}
				
				check = check.next;
			}
		}
		
		// method to display here calling the add method by passing two nodes data
		public void display(){
			Node check = head;
			ReallyBigNumberMath.add(head.data, head.next.data);
			
		}	
	}
	



