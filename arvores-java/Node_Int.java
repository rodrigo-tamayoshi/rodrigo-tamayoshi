package uscs;

public class Node_Int {

	Integer item;
	Node_Int parent;
	Node_Int firstChild;
	Node_Int next;

	public Node_Int(Integer dado) {
		this.item = dado;
		this.firstChild = null;
		this.parent = null;
		this.next = null;
	}

	public void imprimeFilhos() {
		if (this.firstChild == null) {
			System.out.println("Nó sem filhos...");
		} else {
			Node_Int trab = this.firstChild;
			while (trab != null) {
				System.out.println(trab.item);
				trab = trab.next;
			}
		}
	}

	public void imprimeMinFilho() {
		if (this.firstChild == null) {
			System.out.println("Nó sem filhos...");
		} else {
			Node_Int trab = this.firstChild;
			int minimo = trab.item + 1;
			while (trab != null) {
				if (trab.item <= minimo) {
					minimo = trab.item;
				}
				trab = trab.next;
			}
			System.out.println(minimo);
		}
	}

	public void imprimeMediaFilhos() {
		if (this.firstChild == null) {
			System.out.println("Nó sem filhos...");
		} else {
			Node_Int trab = this.firstChild;
			float media = 0;
			int contador = 0;
			while (trab != null) {
				media += trab.item;
				trab = trab.next;
				contador++;
			}
			System.out.println(media / contador);
		}
	}

	public Node_Int Pai() {
		if (this.parent == null)
			return null;
		else
			return this.parent;
	}

	public void imprimePai() {
		if (this.parent == null) {
			System.out.println("Nó raiz! Nada para ser impresso");
		} else {
			System.out.println(this.parent.item);
		}
	}

	public boolean EhInterno() {
		if (this.firstChild != null) {
			return true;
		} else {
			return false;
		}

	}

	public void ImprimeFilhosFolhas() {
		if (this.firstChild == null) {
			System.out.println("Nó sem filhos...");
		} else {
			Node_Int trab = this.firstChild;
			while (trab != null) {
				if (!trab.EhInterno())
					System.out.println(trab.item);

				trab = trab.next;
			}
		}

	}

	public void DobraFilhos() {
		if (this.firstChild == null) {
			System.out.println("Nó sem filhos...");
		} else {
			Node_Int trab = this.firstChild;
			while (trab != null) {
				trab.item = 2 * (trab.item);
				trab = trab.next;
			}
		}

	}

	public void PreOrder() {
		System.out.println(this.item);

		Node_Int trab = this.firstChild;

		while (trab != null) {
			trab.PreOrder();
			trab = trab.next;
		}

	}

	public void DobraPai() {
		if (this.parent == null) {
			System.out.println("Nó raiz! Nada para ser dobrado");
		} else {
			this.parent.item = (this.parent.item) * 2;
		}
	}

	public void Soma5() {

		Node_Int pai = this.parent;

		if (pai == null) {
			this.item = this.item + 5;
		}
		Node_Int trab = this.firstChild;
		while (trab != null) {

			trab.item = trab.item + 5;
			trab.Soma5();
			trab = trab.next;

		}

	}

	public void Soma10() {

		Node_Int pai = this.parent;

		if (pai == null) {
			this.item = this.item + 10;
		}
		Node_Int trab = this.firstChild;
		while (trab != null) {

			trab.item = trab.item + 10;
			trab.Soma10();
			trab = trab.next;

		}

	}

	public void TriplicaValores() {

		Node_Int trab = this.firstChild;
		while (trab != null) {

			trab.item = trab.item * 3;
			trab.TriplicaValores();
			trab = trab.next;

		}

	}

}
