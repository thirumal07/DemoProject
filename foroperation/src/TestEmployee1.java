
public class TestEmployee1 {

	public void printEmpObj(Employee1 emp) {

		String empPrintName1 = emp.getName();
		int empPrintAge1 = emp.getAge();

		System.out.println(empPrintName1);
		System.out.println(empPrintAge1);
		System.out.println();
	}

	public static void main(String[] args) {
		TestEmployee1 testEmpObj = new TestEmployee1();
		Employee1 empObj1 = new Employee1();
		Employee1 empObj2 = new Employee1();

		String empName = "Thiru";
		empObj1.setName(empName);
		int empAge = 24;
		empObj1.setAge(empAge);
		String empName1 = "James";
		empObj2.setName(empName1);
		int empAge1 = 42;
		empObj2.setAge(empAge1);
		testEmpObj.printEmpObj(empObj1);
		testEmpObj.printEmpObj(empObj2);

	}

}
