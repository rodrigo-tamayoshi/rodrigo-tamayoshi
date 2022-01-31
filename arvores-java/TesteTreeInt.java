package uscs;

public class TesteTreeInt {

	public static void main(String[] args) {

		Node_Int no_5 = new Node_Int(5);
		Node_Int no_4 = new Node_Int(4);
		Node_Int no_3 = new Node_Int(3);
		Node_Int no_7 = new Node_Int(7);
		Node_Int no_1 = new Node_Int(1);
		Node_Int no_2 = new Node_Int(2);
		Node_Int no_8 = new Node_Int(8);
		Node_Int no_0 = new Node_Int(0);
		Node_Int no_6 = new Node_Int(6);
		Node_Int no_21 = new Node_Int(21);
		Node_Int no_12 = new Node_Int(12);

		no_5.parent = null;
		no_5.firstChild = no_4;
		no_5.next = null;

		no_4.parent = no_5;
		no_4.firstChild = no_1;
		no_4.next = no_3;
		no_4.item = 10;

		no_3.parent = no_5;
		no_3.firstChild = no_8;
		no_3.next = no_7;
		no_3.item = 4;

		no_7.parent = no_5;
		no_7.firstChild = no_0;
		no_7.next = null;
		no_7.item = 8;

		no_1.parent = no_4;
		no_1.firstChild = null;
		no_1.next = no_2;

		no_2.parent = no_4;
		no_2.firstChild = null;
		no_2.next = null;

		no_8.parent = no_3;
		no_8.firstChild = no_21;
		no_8.next = null;

		no_0.parent = no_7;
		no_0.firstChild = null;
		no_0.next = no_6;

		no_6.parent = no_7;
		no_6.firstChild = null;
		no_6.next = null;

		no_21.parent = no_8;
		no_21.firstChild = null;
		no_21.next = no_12;

		no_12.parent = no_8;
		no_12.firstChild = null;
		no_12.next = null;



		
		
		System.out.println("Antes");
		no_5.PreOrder();
		no_5.TriplicaValores();
		System.out.println("Depois");
		no_5.PreOrder();
		
	}

}
