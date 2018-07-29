package Exemples;
public class School {
	Student moh = new Student("nom",19,true);
	Student[] students = new Student[3];
	
	public void initStudents(){
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student("n",1,true);
			System.out.println(students[i].age);
		}
	}
	
}
