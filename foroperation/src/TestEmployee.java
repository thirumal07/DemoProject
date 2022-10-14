
public class TestEmployee {

	public Employee inputEmployee(String name, int age, String email, int height) {
		Employee empObj = new Employee();
		empObj.name = name;
		empObj.age = age;
		empObj.email = email;
		empObj.height = height;
		return empObj;
	}

	public static void main(String[] args) {
		TestEmployee testEmpObj = new TestEmployee();
		// Employee empSampleObj = new Employee();
		Employee empSampleObj = testEmpObj.inputEmployee("Dinesh", 45, "dinesh@gmail.com", 167);
		Employee empSampleObj1 = testEmpObj.inputEmployee("Amar", 33, "amar@gmail.com", 174);
		Employee empSampleObj2 = testEmpObj.inputEmployee("Micheal", 44, "micheal@gmail", 155);
		Employee empSampleObj3 = testEmpObj.inputEmployee("Maxwell", 29, "maxwell@gmail.com", 177);

		testEmpObj.printEmployee(empSampleObj);
		testEmpObj.printEmployee(empSampleObj1);
		testEmpObj.printEmployee(empSampleObj2);
		testEmpObj.printEmployee(empSampleObj3);
	}

	public void printEmployee(Employee objDetails) {

		System.out.println("Name : " + objDetails.name);
		System.out.println("Age : " + objDetails.age);
		System.out.println("Email : " + objDetails.email);
		System.out.println("Height :" + objDetails.height);
		System.out.println();
	}

}

//Employee empDetails = new Employee();
//empDetails.name = "thiru";
//empDetails.age = 27;
//empDetails.email = "thiru@gmail.com";
//empDetails.height = 170;
//
//Employee empDetails1 = new Employee();
//empDetails1.name = "kamal";
//empDetails1.age = 45;
//empDetails1.email = "kamal@gmail.com";
//empDetails1.height = 180;
//
//Employee empDetails2 = new Employee();
//empDetails2.name = "shahid";
//empDetails2.age = 45;
//empDetails2.email = "shahid@gmail.com";
//empDetails2.height = 180;

//	Employee employeeArr[] = { empDetails, empDetails1, empDetails2 };for(
//
//		int i = 0;i<employeeArr.length;i++){
//		System.out.println(employeeArr[i].name);
//		  System.out.println(employeeArr[i].age);
//		  System.out.println(employeeArr[i].email);
//		  System.out.println(employeeArr[i].height); 
//		  }
//	
//	 Employee employeeArr[] = new Employee[3]; employeeArr[0]=empDetails;
//	  employeeArr[1]=empDetails1; employeeArr[2]=empDetails2;
//	  System.out.println(employeeArr[0].email);
