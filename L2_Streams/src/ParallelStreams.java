import java.util.Arrays;
import java.util.List;

public class ParallelStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(3,5,1,6,8,9,2);

		//arr.parallelStream().forEach(System.out::print);
		arr.parallelStream().forEachOrdered(System.out::print);

	}

}
