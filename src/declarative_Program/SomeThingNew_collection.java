package declarative_Program;

import java.util.List;
import java.util.stream.Collectors;

import static declarative_Program.Gender.*;

public class SomeThingNew_collection 
{
	public static void main(String[] args) 
	{
		List<Person> people=List.of(
				new Person("arun",
						MALE),
				new Person("kishore",MALE),
				new Person("Aruna",FEMALE),
				new Person("Kirthana",FEMALE),
				new Person("Vimal",MALE),
				new Person("Vimala",FEMALE)
				);
	
//		people
//		.stream()
//		.filter(person ->FEMALE.equals(person.gender))
//	    .collect(Collectors.toList())
//	    .forEach(System.out::println);
		
		List<Person> female=people
				.stream()
				.filter(person ->FEMALE.equals(person.gender))
			    .collect(Collectors.toList());
		
		female.forEach(System.out::println);
		
	} 
	static class Person
	{
		private final String name;
		private final Gender gender;
		
		Person(String name, Gender gender)
		{
			this.name=name;
			this.gender=gender;
			
		}
	
		public String toString() 
		{
			return "person {"
		            +"Name = '"
					+name
					+'\''
		            +".Gender="
					+gender
		            +'}';
		}
	}

}