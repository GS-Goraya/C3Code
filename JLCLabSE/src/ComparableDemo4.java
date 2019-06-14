import java.util.*;

public class ComparableDemo4 {
	public static void main(String[] args) {
		employee1 e1 = new employee1("nag", 100);
		employee1 e2 = new employee1("balaiah", 200);
		employee1 e3 = new employee1("chiru", 50);
		employee1 e4 = new employee1("venki", 150);
		employee1 e5 = new employee1("nag", 100);
		ArrayList t1 = new ArrayList<>();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println("Without Sorting Operation" + t1);
		Collections.sort(t1, new MyComparator5());
		System.out.println("After sorting list of Employees based on name" + t1);
		Collections.sort(t1, new MyComparatorID());
		System.out.println("After sorting list of Employees based on id" + t1);
	}
}

class employee1 {
	String name;
	int eid;
	employee1(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	public String toString() {
		return name + "---" + eid;
	}
}
class MyComparator5 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		employee1 e1 = (employee1) obj1;
		employee1 e2 = (employee1) obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}

class MyComparatorID implements Comparator {
	public int compare(Object obj1, Object obj2) {
		employee1 e1 = (employee1) obj1;
		employee1 e2 = (employee1) obj2;

		int eid1 = e1.eid;
		int eid2 = e2.eid;
		if (eid1 < eid2) {
			return +1;
		} else if (eid1 > eid2) {
			return -1;
		} else {
			return 0;
		}
	}
}
