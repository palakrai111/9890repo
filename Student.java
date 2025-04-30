package in.sp.backend;

public class Student {
	
	int id;
	String name;
	static String clgname = "abc";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.id = 101;
		s1.name = "palak";
		System.out.println(s1.id + " " + s1.name + ""+s1.clgname);
		Student s2 = new Student();
		s2.id = 102;
		s2.name = "nayan";
		System.out.println(s2.id + " " + s2.name + " " + s2.clgname);

	}

}
