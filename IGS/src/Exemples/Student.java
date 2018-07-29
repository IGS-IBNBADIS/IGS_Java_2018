package Exemples;

public class Student {
		String name;
		int age;
		boolean accepted;
		
		public Student(String name, int age, boolean accepted){
			this.name = name;
			this.age = age;
			this.accepted = accepted;
		}
		
		public String getName(){
			return name;
		}
		
		public void setName(String name){
			this.name = name;
		}
}
