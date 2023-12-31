package mysql.ex05_world;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class cityDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	public cityDao() {
		try {
			Properties props =new Properties();
			InputStream is =new FileInputStream("D:\\JavaWorkspace\\Java\\src\\mysql\\mysql.properties");
			props.load(is);
			is.close();

			host =props.getProperty("host");
			user =props.getProperty("user");
			password =props.getProperty("password");
			database =props.getProperty("database");
			port =props.getProperty("port");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection myConnection() {
		Connection conn =null;
		try {
			String connStr ="jdbc:mysql://"+host+":"+port+"/"+database;
			conn =DriverManager.getConnection(connStr,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

	public City getCityById(int id) {
		Connection conn =myConnection();
		String sql ="select * from city where id=?";
		City city =new City();
		try {
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			// sekect 실행
			ResultSet rs =pstmt.executeQuery();
			while (rs.next()) {
				city.setId(rs.getInt(1));
				city.setName(rs.getString(2));
				city.setCountrycode(rs.getString(3));
				city.setDistrict(rs.getString(4));
				city.setPopulation(rs.getInt(5));
			}
			rs.close();pstmt.close();conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return city;
	}

	public City getCityByNmae(String name) {
		Connection conn =myConnection();
		String sql ="select * from city where name=?";
		City city =new City();
		try {
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, name);

			// sekect 실행
			ResultSet rs =pstmt.executeQuery();
			while (rs.next()) {
				city.setId(rs.getInt(1));
				city.setName(rs.getString(2));
				city.setCountrycode(rs.getString(3));
				city.setDistrict(rs.getString(4));
				city.setPopulation(rs.getInt(5));
			}
			rs.close();pstmt.close();conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return city;
	}

	// 리스트 
	public List<City> getCityList(String countryCode,int num){
		List<City> list =new ArrayList<City>();
		Connection conn =myConnection();
		try {
			String sql ="select * from city where countrycode=? Limit ?";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, countryCode);
			pstmt.setInt(2,num );

			ResultSet rs =pstmt.executeQuery();
			while (rs.next()) {
				City city =new City(rs.getInt(1),rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getInt(5));
				list.add(city);

			}
			rs.close();pstmt.close();conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void insertCity (City city) {
		Connection conn =myConnection();
		try {
			
			String sql ="insert into city values(default,?,?,?,?)";
			// 파라메터 세팅
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, city.getName());
			pstmt.setString(2, city.getCountrycode());
			pstmt.setString(3, city.getDistrict());
			pstmt.setInt(4, city.getPopulation());
			pstmt.executeUpdate();
			
			pstmt.close();conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateCity (City city) {
		Connection conn =myConnection();
		try {
			
			String sql = "update city set name=?, countrycode=?, district=?, population=? where id=?";
			// 파라메터 세팅
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, city.getName());
			pstmt.setString(2, city.getCountrycode());
			pstmt.setString(3, city.getDistrict());
			pstmt.setInt(4, city.getPopulation());
			pstmt.setInt(5, city.getId());
			pstmt.executeUpdate();
			
			pstmt.close();conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCity(int id) {
		Connection conn =myConnection();
		try {
			
			String sql = "delete from city where id=?";
			// 파라메터 세팅
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
			pstmt.close();conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
