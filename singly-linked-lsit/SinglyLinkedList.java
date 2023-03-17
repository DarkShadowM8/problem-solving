public class SinglyLinkedList{
	public static void main(String[] args){
		Node node = new Node();
		node.addNode("1");
		node.addNode("2");
		node.addNode("3");
		node.addNode("4");
		node.addNode("5");
		node.addNode("6");
		node.addNode("7");
		
		node.display();
		
		node.delete("10");
		
		node.display();
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
			while (check != null){
				System.out.println(check.data);
				check = check.next;
			}	
	}
	



}