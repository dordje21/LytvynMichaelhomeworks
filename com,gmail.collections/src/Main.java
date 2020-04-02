import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(14);
		list.add(24);
		list.add(34);
		list.add(44);	
		System.out.println(list);
		
		Collections.shuffle(list);
		
		System.out.println(list);
		
		
		List<Integer> listTwo = new ArrayList<>();
		
		listTwo.add(42);
		listTwo.add(124);
		listTwo.add(24);
		listTwo.add(224);
		listTwo.add(424);	
		
		int fr = Collections.frequency(listTwo, 24);
		
		System.out.println(listTwo + " сколько 24 в listTwo = " + fr);
		
		boolean dis = Collections.disjoint(list, listTwo);
		System.out.println(dis);
		
		list.set(2, 45);	
		System.out.println(list);
		
		int position = list.indexOf(14);
		System.out.println(position);
		
		
		list.add(2, 46);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<Integer> itr = list.iterator();
		
		for(;itr.hasNext();) {
			System.out.println(itr.next());
		}
		
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
		
		TreeSet<UsbDriver> tstwo = new TreeSet<UsbDriver>(new UsbComparator());
		
		tstwo.add(new UsbDriver(8, "Kingston"));
		tstwo.add(new UsbDriver(16, "Apach"));
		tstwo.add(new UsbDriver(4, "Transend"));
		
		Iterator<UsbDriver> itertwo = tstwo.iterator();
		
		for(;itertwo.hasNext();) {
			System.out.println(itertwo.next());
		}
		
		Map<Integer, String> number = new HashMap<Integer, String>();
		
		number.put(1, "one");
		number.put(2, "two");
		number.put(3, "three");
		
		System.out.println(number);
		
		String value= number.get(3);
		System.out.println(value);
		
		System.out.println(number.get(2));
		
		number.put(5, "five");
		System.out.println(number);
		
		String delete = number.remove(3);
		System.out.println(delete);
		System.out.println(number);
	}

}
