package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	public static List<Employee> getEmpList() throws SQLException{
		Connection conn = ConnectionDB.getDB();
		
		String sql = "select * from employees";
		List<Employee> list = new ArrayList<>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
	 Employee employee = new Employee(rs.getInt("employee_Id"), 
			 						  rs.getString("first_Name"), 
			 						  rs.getString("last_Name"),
			 						  rs.getString("email"), 
			 						  rs.getDate("hire_Date").toLocalDate(),
			 						  rs.getString("job_Id"),
			 						  rs.getInt("salary"));
				list.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
//public static List<Employee> getEmpList() {
//
//	String sql = "select * from employees";
//	PreparedStatement empt = conn.prepareStatement(sql);
//	ResultSet rs = empt.executeQuery();
//	while (rs.next()) {
//		Employee employee = new Employee(rs.getInt("employeeId"), 
//										 rs.getString("firstName"),
//										 rs.getString("lastName"), 
//										 rs.getString("email"), 
//										 rs.getDate("hireDate").toLocalDate(),
//										 rs.getString("jobId"), 
//										 rs.getInt("salary"));
//		list.add(employee);
//	}
//	return list;
//}
//}