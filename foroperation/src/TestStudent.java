
public class TestStudent {

	public static void main(String[] args) {
		Student objStud = new Student();
		
		String name1 = objStud.getName();
		System.out.println(name1);
		
		objStud.setName("Aarav");
		String name = objStud.getName();
		System.out.println(name);

		objStud.setAge(23); 
		int age = objStud.getAge();
		System.out.println(age);

		objStud.setEmail("aarav@gmail.com");
		String email = objStud.getEmail();
		System.out.println(email);

	}
}
