import java.util.ArrayList;

public class Z11_ArrayList {

	public static void main(String[] args) {
		
		//ArrayList = A resizable Array
		//            Elements can be added and removed after compilation phase
		//            store reference data types
		
		//We cannot change length of array once created in a Java but ArrayList can be changed
		//which means ArrayList uses reference data types Which gives access to some useful methods
		//unlike Arrays which is primitive data types
		
		
		ArrayList<String> food = new ArrayList();
		
		food.add("pizza");
		food.add("hotdog");
		food.add("hamburger");
		
		//food.set(1, "Sushi");
		//food.remove(2);
		//food.clear();
		
		//System.out.println(food);
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		
		

	}

}
