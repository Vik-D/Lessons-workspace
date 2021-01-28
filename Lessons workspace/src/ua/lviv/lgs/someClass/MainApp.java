package ua.lviv.lgs.someClass;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		
		Set <Mood> moods = new HashSet<Mood>();
		
		moods.add(new Mood("радість", 6));
		moods.add(new Mood("занепокоєння", 4));
		moods.add(new Mood("сум", 3));
		moods.add(new Mood("здивування", 8));
		moods.add(new Mood("спокій", 9));
		moods.add(new Mood("розчарування", 5));
		moods.add(new Mood("байдужість", 2));
		
		
//		Iterator<Mood> iterator = moods.iterator();
//		while(iterator.hasNext()) {
//			Mood next = iterator.next();
//			System.out.println(next);
//			
//		}
		
		Collections.sort(moods);
	
		
// -------------------------------------------------------------------	
	}

}
