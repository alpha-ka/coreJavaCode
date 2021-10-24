package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraysMethod {
	public static void main(String args[]) {
		int intArr[] = { 10, 20, 15, 22, 35 };

		System.out.println("------------Arrays.aslist()--------------");
		// To convert the elements as List
		System.out.println("Integer Array as List: " + Arrays.asList(intArr));
		System.out.println("" + Arrays.toString(intArr));

		System.out.println("------------Arrays.sort()--------------");
		Arrays.sort(intArr);
		System.out.println("------------Arrays.toString()--------------");

		System.out.println("" + Arrays.toString(intArr));
		
		int intArr2[] = { 10, 15, 22, 10, 7 };
		System.out.println("------------Arrays.parallelsort()--------------");
		Arrays.parallelSort(intArr2);
		System.out.println("------------Arrays.toString()--------------");

		System.out.println("" + Arrays.toString(intArr2));

		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArr, 10)));

		System.out.println("------------Arrays with binary search--------------");
		int intKey = 22;
//Print the key and corresponding index
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

		System.out.println(Arrays.binarySearch(intArr, 1, 3, intKey));

		int intArr1[] = { 10, 15, 22 };

		System.out.println();

		System.out.println("------------Arrays with Streams--------------");

		System.out.println("------------Array from primitive to Wrapper class--------------");
		Integer n[] = Arrays.stream(intArr).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(n));
		System.out.println("------------Array to list--------------");
		List<Integer> list = Arrays.stream(intArr).boxed().collect(Collectors.toList());
		System.out.println(list.toString());

		System.out.println("------------Arrays with Streams sum--------------");
		System.out.println(Arrays.stream(intArr).sum());
		System.out.println("------------Arrays with Streams count--------------");
		System.out.println(Arrays.stream(intArr).count());

		System.out.println("------------Arrays with Streams distinct--------------");

		Arrays.stream(intArr2).distinct().forEach(i -> System.out.println(i));
		System.out.println("------------Arrays with Streams average--------------");
		System.out.println(Arrays.stream(intArr2).average());

	}

}
