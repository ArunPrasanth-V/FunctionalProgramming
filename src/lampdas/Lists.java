package lampdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class lists
{
	public static void main(String[] args)
	 {
		List<Integer> work=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		work.stream()
		.filter(e->e%2==0)
		.map(e->e*2)
		.findFirst();
	 }
}
