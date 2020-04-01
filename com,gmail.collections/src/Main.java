import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		
//		List<Integer> list = new ArrayList<>();
//		
//		list.add(4);
//		list.add(14);
//		list.add(24);
//		list.add(34);
//		list.add(44);	
//		System.out.println(list);
//		
//		list.set(2, 45);	
//		System.out.println(list);
//		
//		int position = list.indexOf(14);
//		System.out.println(position);
//		
//		
//		list.add(2, 46);
//		System.out.println(list);
//		
//		list.remove(0);
//		System.out.println(list);
//		
//		for(int i = 0; i <list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		Iterator<Integer> itr = list.iterator();
//		
//		for(;itr.hasNext();) {
//			System.out.println(itr.next());
//		}
		
		ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
		
		deq.push(100);
		deq.push(55);
		deq.push(33);
		deq.push(1);
		
		for(;deq.peek()!=null;) {
			System.out.println(deq.pop());
		}
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(34);
		ts.add(31);
		ts.add(12);
		ts.add(5);
		
		System.out.println(ts);
	}

}
