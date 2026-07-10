import java.sql.*;



public class MyFirstJDBCApplication {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo";
		String user="root";
		String password="Sumit@123";
		
		
		String query = "insert into student(id,name) values(3,'Sumit')  ";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url,user,password);
			Statement st=c.createStatement();
			int count =st.executeUpdate(query);
			
			System.out.println("Number of the rows affected by this query "+count);
			st.close();
			c.close();
			System.out.println("Connection closed ");
			
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC Driver not found "+ e.getMessage());
			
		}catch(SQLException e) {
			System.out.println("SQL Error "+e.getMessage());
		}

	}

}
