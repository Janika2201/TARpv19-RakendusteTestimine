package ee.tthk.tarpv19.jv;

import java.util.Arrays;

public class FizzBuzz {
private int[] numbers;
public String [] getNumbers() {
	numbers = new int[100];
	for (int i = 0; i< numbers.length; i++) {
		numbers[i]=i+1;
	}
	return (String []) Arrays.stream(numbers).mapToObj(Integer::toString).toArray();
}

}
