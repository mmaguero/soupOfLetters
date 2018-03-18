package soup.letters;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.HashMap;

public class Solution {
	
	/*
	 * 
	 * */

	public static void main(String[] args) throws IOException {

		System.out.println(
				Solution.writeMessage("this is my especial message", "THIS IS MY MESSAGE AS ANY OTHER OR ESPECIAL"));

	}

	public static boolean writeMessage(String myMessage, String myBowl) {

		if (myBowl == null || myMessage == null || myBowl.isEmpty() || myMessage.isEmpty())
			throw new InvalidParameterException("myBowl and myMessage must have a value...");
		else {
			myMessage = myMessage.toUpperCase();
			myBowl = myBowl.toUpperCase();
		}

		HashMap<Character, Integer> countMap = new HashMap<>();
		Integer count = 0;

		for (char c : myMessage.replaceAll("\\s", "").toCharArray()) {
			count = countMap.get(c);
			if (null == count)
				count = 0;
			countMap.put(c, count + 1);
		}

		int i = 0;
		char character;
		int myBowlLength = myBowl.length();
		int countMapSize = countMap.size();

		while (i < myBowlLength && countMapSize > 0) {

			character = myBowl.charAt(i);
			count = countMap.get(character);

			if (null != count && count > 1)
				countMap.replace(character, count - 1);
			else
				countMap.remove(character);

			i++;
		}

		return countMap.size() == 0;

	}
}
