package feelgood;

public class Compare {
	public int compareWeight(Animal value1, Animal value2) {
		int delta;
		delta = value1.getWeight() - value2.getWeight();
		return delta;
	}
}
