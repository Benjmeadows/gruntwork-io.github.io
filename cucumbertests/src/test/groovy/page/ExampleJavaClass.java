package page;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExampleJavaClass {
	
	public static void main(String[] args) {
		List mylist = Arrays.asList(1,2,"Lars","4");
		Iterator itr= mylist.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
