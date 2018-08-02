import java.sql.*;

import javax.swing.table.DefaultTableModel;

public class DbConnect {
	static  Connection c = null;
    static Statement stmt = null;
  public static void main( String args[] ) {
     
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:dataBase.db");
         System.out.println("Opened database successfully");
         
         stmt = c.createStatement();
         
         // Creating Table
        String sql = "CREATE TABLE IF NOT EXISTS PRODUITS " +
                        "(ID INT PRIMARY KEY     NOT NULL," +
                        " NAME           TEXT    NOT NULL, " + 
                        " CATEGORY            TEXT     NOT NULL, " + 
                        " CODE        INT(50), " + 
                        " PRIX         REAL)"; 
         stmt.executeUpdate(sql);
         
         // insert into the database
         sql = "INSERT INTO PRODUITS (ID,NAME,CATEGORY,CODE,PRIX) " +
               "VALUES (3, 'Paul', 32, 'California', 20000.00 );"; 
         stmt.executeUpdate(sql);
         System.out.println("Records created successfully");  
         
         // update record in the database
         sql = "UPDATE PRODUITS set PRIX = 25000.00 where ID=1;";
         stmt.executeUpdate(sql);
        
         // delete a record in the database
         sql = "DELETE from PRODUITS where ID=2;";
         stmt.executeUpdate(sql);
         
         // Show the table records
         ResultSet rs = stmt.executeQuery( "SELECT * FROM PRODUITS;" );
         
         while ( rs.next() ) {
            int id = rs.getInt("id");
            String  name = rs.getString("NAME");
            int category  = rs.getInt("CATEGORY");
            String  code = rs.getString("CODE");
            float prix = rs.getFloat("PRIX");
            
            System.out.println( "ID = " + id );
            System.out.println( "NAME = " + name );
            System.out.println( "AGE = " + category );
            System.out.println( "CODE = " + code );
            System.out.println( "PRIX = " + prix );
            System.out.println();
         }
         
         rs.close();
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
   }
  
  static void fillTable(DefaultTableModel model, String tableName){
	 
	  if(model.getRowCount() >= 1){
		  //this code cleans the table
		do{
			model.removeRow(0);
		}while(model.getRowCount() > 0);
	  }
	  
	  try {
		  ResultSet rs = stmt.executeQuery("SELECT * FROM "+ tableName);
		 while ( rs.next() ) {
	            String  name = rs.getString("NAME");
	            int category  = rs.getInt("CATEGORY");
	            String  code = rs.getString("CODE");
	            float prix = rs.getFloat("PRIX");
	            Object[] a = {name,category,code,prix};
	            model.addRow(a);
		 }
	  	} catch (SQLException e) {
	  		e.printStackTrace();
	  		}
	
  }
  
  static void createConnection() throws SQLException{

      try {
		Class.forName("org.sqlite.JDBC");
		c = DriverManager.getConnection("jdbc:sqlite:test.db");
	      System.out.println("Opened database successfully");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
      
  }
  static void createTable(String name){
	  try {
		stmt = c.createStatement();
      // Creating Table
		String sql = "CREATE TABLE IF NOT EXISTS " + name + " " +
                     "(ID INT PRIMARY KEY     NOT NULL," +
                     " NAME           TEXT    NOT NULL, " + 
                     " CATEGORY            TEXT     NOT NULL, " + 
                     " CODE        INT(50), " + 
                     " PRIX         REAL)"; 
      stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  static void addProduct(DefaultTableModel model,String tableName,String name, String category, String code, String prix){
	    try {
	    	String sql = "INSERT INTO "+ tableName + " (ID,NAME,CATEGORY,CODE,PRIX) " +
	              "VALUES ("+(model.getRowCount())+", '"+name+"','"+category+"',"+code+","+prix+");"; 
			stmt.executeUpdate(sql);
			fillTable(model, tableName);
	    }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     }
  static void deleteProduct(DefaultTableModel model,String tableName,String name){
	  try {
	    	String sql = "DELETE FROM "+ tableName+" WHERE NAME = '"+ name+"';"; 
			stmt.executeUpdate(sql);
			fillTable(model, tableName);
	    }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
  }
  static void updateProduct(DefaultTableModel model,String tableName,int column, int row, String champ){
	  try {
		    String name = model.getColumnName(column);
		    String sql = "";
		    System.out.println(row);
		    ResultSet rs = stmt.executeQuery( "SELECT * FROM prd;" );
	         
	         while ( rs.next() ) {
	            int id = rs.getInt("id");
	            String  name1 = rs.getString("NAME");
	            int category  = rs.getInt("CATEGORY");
	            String  code = rs.getString("CODE");
	            float prix = rs.getFloat("PRIX");
	            
	            System.out.println( "ID = " + id );
	            System.out.println( "NAME = " + name1 );
	            System.out.println( "AGE = " + category );
	            System.out.println( "CODE = " + code );
	            System.out.println( "PRIX = " + prix );
	            System.out.println();
	         }
	    	if(column < 2) sql = "UPDATE "+tableName+" SET "+name+"= '"+champ+"' WHERE ID="+(row+1)+";"; 
	    	else if(column > 4) sql = "UPDATE "+tableName+" SET "+name+"= "+champ+" WHERE ID="+(row+1)+";"; 
			stmt.executeUpdate(sql);
			fillTable(model, tableName);
	    }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
  }
}
  
