public class Student{
	String name,city;
  String age;
	static int m;
	void printData() {
		System.out.println(" Student Name = "+name);
		System.out.println(" Student City = "+city);
		System.out.println(" Student Age ="+age);
		
	}
}
class Stest {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="Insa";
		s1.city="kanyakumari";
		s1.age="23";
		s2.name="Nabeel";
		s2.city="mumbai";
		s2.age="21";
		s2.printData();
		s1.printData();
		s1.m=20;
		s2.m=22;
		Student.m=27;
		System.out.println("s1.m = "+s1.m);
		System.out.println("s2.m = "+s2.m);
		System.out.println("Student.m = "+Student.m);
		
	}

}
