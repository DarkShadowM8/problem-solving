public class ReallyBigNumberMath{
	public static void main(String[] args){
		Node node = new Node();
		node.addNode("18753285");
		node.addNode("2383275");
		node.display();
	}
	
	public static void add(String num_1, String num_2){
		int[] arr_1;
		int[] arr_2;
		int[] result;
		if (num_1.length() > num_2.length())
		{
			arr_1 = new int[num_1.length()];
			arr_1 = parseingInt(arr_1, num_1);
			arr_2 = new int[num_2.length()];
			arr_2 = parseingInt(arr_2, num_2);
		}
		else{
			
			arr_1 = new int[num_2.length()];
			arr_1 = parseingInt(arr_1, num_2);
			arr_2 = new int[num_1.length()];
			arr_2 = parseingInt(arr_2, num_1);
		}
		
		
		result = new int[arr_1.length + 1];
		result[0] = 0;
		for (int i = arr_1.length - 1, j = arr_2.length - 1; i >= 0; i-- , j--){
			if (j >= 0){
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
		int i = 0;
		if (result[0] == 0){
			i = 1;
		}
		while(i < result.length){
			
			System.out.print(result[i]);
			i++;
		}
	}
	
	public static int[] parseingInt(int[] arr, String str){
		for (int i = 0; i < arr.length ; i++){
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		return arr;
	}
}
	class Node{
		public String data;
		public Node next;

		Node(){}
		Node(String data){
			this.data = data;
		}

		public Node head = null;
		public Node tail = null;

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

		public void display(){
			Node check = head;
			ReallyBigNumberMath.add(head.data, head.next.data);
			
		}	
	}
	



