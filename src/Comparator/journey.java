package Comparator;

import java.util.Comparator;

public class journey implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) {
		if(s1.journey==s2.journey)
		{
			return 0;
		}else if(s1.journey>s2.journey)
		return 1;
		else return -1;
		
	}
	
	
	
	
}
