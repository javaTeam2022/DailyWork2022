package queueInterface;

class PriorityQueueGaudges implements Comparable<PriorityQueueGaudges> {

	String name, model;
	int itemPrice;

	PriorityQueueGaudges(String name, String model, int itemPrice) {
		this.name = name;
		this.model = model;
		this.itemPrice = itemPrice;

	}

	public int compareTo(PriorityQueueGaudges pqg) {
		if (2999 < pqg.itemPrice) {
			System.out.println(model + " " + " Price " + itemPrice);

		}
		return 1;

	}

	@Override
	public String toString() {
		return "[name=" + name + ", model=" + model + ", itemPrice=" + itemPrice + "]";
	}

}
