import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapStreamExample {

	public static void main(String[] args) {
		
		
		List<Integer> arr = Arrays.asList(3,5,1,6,8,9,2);
		
		List<Integer> square = arr.stream().map(x->x*x).sorted()
				.collect(Collectors.toList());
		
		int c= arr.stream().map(k->k*k).filter(x-> x%2==0).reduce(10,(count,i) -> count+i);
		
		
		arr.stream().filter(x-> x%2==0).map(k->k*k).forEach(y-> System.out.println(y));
		
		
		System.out.println(c);
		
		System.out.println(square);
		System.out.println(arr);
		
		
		
		
	}
}
