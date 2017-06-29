package tutorial24.springmvc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import tutorial24.springmvc.model.EmployeeAddress;

public class AppDAOImpl implements AppDAO {

	private DataSource dataSource;
	public AppDAOImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public List<EmployeeAddress> listAddresses() {
		
		String sql = "select * from TESTSCHEMA.employee_address";
		List<EmployeeAddress> listAddresses = new ArrayList<>();
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				EmployeeAddress empAdd = new EmployeeAddress(
						rs.getString("city_name"),
						rs.getString("state_name"),
						rs.getString("street_name"),
						rs.getInt("emp_id"),
						rs.getInt("pin_code")
						);
				listAddresses.add(empAdd);
			}
			rs.close();
			ps.close();
			return listAddresses;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
