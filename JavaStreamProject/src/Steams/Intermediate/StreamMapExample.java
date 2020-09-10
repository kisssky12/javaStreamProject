package Steams.Intermediate;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import common.EmpDAO;
import common.Employee;
public class StreamMapExample {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Employee> employees = EmpDAO.getEmpList();
		Stream<Employee> emp = employees.stream();
		
		// salary가 10000 이상인 사원들 출력.
//		LocalDate date = LocalDate.of(2020, 5, 1);
//		LocalDate.parse("2010-05-05", DateTimeFormatter.ISO_DATE); //문자열 -> 데이트타입. 
		//2020-05-01 
//		date.format(DateTimeFormatter.ISO_DATE); // 데이트타입 -> 문자열.
		System.out.println(employees);
		
		emp.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				
				return t.getHireDate().getYear() < 1995 ;
			}
			
		}).forEach(new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
//				System.out.println(t.getLastName() + ", " + t.getHireDate());
				System.out.println(t);
			}
			
		});
		
		System.out.println("======");
		
		emp.filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getEmployeeId() < 50;
			}
			
		}).forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee t) {
				System.out.println(t);
			}
			
		});
		
		//.stream().filter(e -> e.getEmployeeId() > 50)
//		.forEach(s ->System.out.println(s.getEmployeeId()));
//
//		System.out.println("==============");
//		
//		employees.stream().filter(e -> e.getSalary() > 10000)
//		.forEach(System.out::println);
//		
//		System.out.println("==============");
//		
//		Optional<Integer> result = employees.stream().flatMap(new Function<Employee, Stream<Integer>>() {
//			@Override
//			public Stream<Integer> apply(Employee t) {
//				return Stream.of(t.getSalary());
//			}
//			
//		}).reduce(new BinaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				System.out.println(t + ", " + u);
//				return t.intValue();
//			}
//			
//		});
//		System.out.println("min 값: " + result.get());
		
	}
}
