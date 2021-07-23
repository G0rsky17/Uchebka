package feelgood;


public class Main {

	public static void main(String[] args) {

		Animal dog = new Animal();
		dog.setWeight(45);
		System.out.println(dog.getWeight());
		
		Animal cat = new Animal();
		cat.setWeight(5);
		System.out.println(cat.getWeight());
		
		Compare comparator = new Compare();
		//System.out.println(comparator.compareWeight(dog, cat));
		
		PrintResult p = new PrintResult();
		p.printRes();
	}
}
