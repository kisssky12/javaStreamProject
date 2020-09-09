package Steams.Intermediate;


import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

enum Gender { //열거형 타입
	MALE, FEMALE;
}

public class Employee {

		String name;
		Gender gender;
		LocalDate dateOfBirth;
		double income;
		
		public Employee(String name, Gender gender, LocalDate dateOfBirth, double income) {
			super();
			this.name = name;
			this.gender = gender;
			this.dateOfBirth = dateOfBirth;
			this.income = income;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public double getIncome() {
			return income;
		}
		public void setIncome(double income) {
			this.income = income;
		}
		
		public boolean isMale() {
			return this.gender == Gender.MALE;
		}
		public boolean isFemale() {
			return this.gender == Gender.FEMALE;
		}
		@Override
		public String toString() {
			String str = String.format("(%s, %s, %s, %.2f)", name, gender, dateOfBirth, income);
			return "Employee [name=" + name + ", dateOfBirth=" + dateOfBirth + ", income=" + income + "]";
		}
		
		public static List<Employee> employees() {
			Employee e1 = new Employee("Hong", Gender.MALE, LocalDate.of(1991, Month.JANUARY, 1), 2343.0);
			Employee e2 = new Employee("Kim", Gender.FEMALE, LocalDate.of(1992, Month.AUGUST, 15), 7583.0);
			Employee e3 = new Employee("Park", Gender.FEMALE, LocalDate.of(1993, Month.MAY, 28), 3023.0);
			Employee e4 = new Employee("Choi", Gender.MALE, LocalDate.of(1994, Month.MARCH, 11), 9541.0);
			Employee e5 = new Employee("Ahn", Gender.FEMALE, LocalDate.of(1995, Month.APRIL, 3), 4256.0);
			Employee e6 = new Employee("Yun", Gender.MALE, LocalDate.of(1996, Month.DECEMBER, 5), 8425.0);
			List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6);
			return employees;
		}
}
