import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SymTest {

	public static void main(String str[]) {
		// new SymTest().primeNumber("28", "48");
		// new SymTest().primeNumber("100", "500");
		// System.out.println("ouput" + new SymTest().bstelement(3));
		// System.out.println("ouput -> " + new SymTest().seq("abcdeazb"));
		// System.out.println("ouput -> " + new SymTest().seq("temperature"));
		System.out.println("ouput -> " + new SymTest().seq("abafgahjk"));
		// 3 +2+2*2+3*3
		// 3+4+4+9=

	}

	public int seq(String str) {
		int count = 0;
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		for (char c : charArray) {
			if (!set.contains(c)) {
				set.add(c);

				count++;
			} else {
				// count++;
			}
		}
		return count;
	}

	public int bstelement(int n) {
		int count = 0;
		int i = 0;
		int lastIndex = 0;
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(3);
		array.add(3);
		array.add(5);
		array.add(6);
		array.add(7);
		for (int j = 0; j < array.size(); j++) {
			System.out.println(j);
			if (array.get(j) != lastIndex) {
				System.out.println(array.get(j) + " " + lastIndex);
				count++;
				if (count == n) {
					break;
				}
			}
		}

		return count;
	}

	public int primeNumber(String startIndex, String endIndex) {
		int start = Integer.parseInt(startIndex);
		int end = Integer.parseInt(endIndex);
		int count = 0;
		for (int i = start; i <= end; i++) {
			double sqrt = Math.sqrt(Double.parseDouble(String.valueOf(i)));
			System.out.println("square root" + sqrt);
			for (double j = 0; j < sqrt; j++) {
				System.out.println(j / sqrt);
				if (j / sqrt != 0) {
					System.out.println("Inside -> " + j);
					count++;
				}
			}
		}

		return count;
	}
}
