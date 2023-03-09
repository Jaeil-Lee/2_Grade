package teamCreation;

import java.util.HashMap;

public class Team {

	public static void main(String[] args) {

		// 
		HashMap<String, Integer> ageMap = new HashMap<String, Integer>();
		ageMap.put("Alice", 25);
		ageMap.put("Bob", 30);
		ageMap.put("Charlie", 35);

		//  
		int aliceAge = ageMap.get("Alice"); // 25
		int bobAge = ageMap.get("Bob"); // 30

		System.out.println(aliceAge);
		System.out.println(bobAge);
		
	}

}
