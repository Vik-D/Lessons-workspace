package ua.lviv.lgs.someClass;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		
		Set <Mood> moods = new HashSet<Mood>();
		
		moods.add(new Mood("������", 6));
		moods.add(new Mood("�����������", 4));
		moods.add(new Mood("���", 3));
		moods.add(new Mood("����������", 8));
		moods.add(new Mood("�����", 9));
		moods.add(new Mood("������������", 5));
		moods.add(new Mood("���������", 2));
		
		
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
