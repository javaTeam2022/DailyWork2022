package TreeSet;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("navya");
		set.add("saikumar");
		set.add("srinivasrao");
		set.add("anitha");
		System.out.println(set);
		System.out.println(set.descendingSet());
		System.out.println(set.headSet("navya",true));
		System.out.println(set.subSet("navya",true, "srinivasrao",false));
		System.out.println(set.tailSet("anitha", false));
	}

}
