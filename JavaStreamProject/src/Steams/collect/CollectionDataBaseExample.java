package Steams.collect;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import common.EmpDAO;
import common.Employee;

public class CollectionDataBaseExample {
	public static void main(String[] args) {
		// employee 테이블.
		// 입사일자 기준. 1990년대 입사한 사람들.
		// List 컬렉션에 저장.
		// job => ST_CLERK 인 사람들의 이름과 급여를 컬렉션에 저장.
		
		List<Employee> empList = EmpDAO.getEmpList();
		

		Map<String, Integer> map = null; // 데이터 범위를 줄이는 용도
		empList.stream().filter(e -> e.getHireDate().isBefore(LocalDate.of(2000, 1, 1)))
				.collect(Collectors.toMap(new Function<Employee, String>() {
					@Override
					public String apply(Employee t) {
						return t.getLastName();
					} 
				}, new Function<Employee, LocalDate>() {
					@Override
					public LocalDate apply(Employee t) {
						return t.getHireDate();
					}
				}));
		

	}
}
