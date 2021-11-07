package moviedata;
import java.sql.*;
public class movies {   
	  public static void main(String[] args) {    
	    try{  
	      //establishing connection
	      Class.forName("org.sqlite.JDBC");	 
	      //Creating database
	      String url="jdbc:sqlite:movies.db";
	      Connection con=DriverManager.getConnection(url);	      
	      if(con!=null){	        
	        System.out.println("Database created");
	        Statement stmt=con.createStatement();
	        //creating table
	        int n=stmt.executeUpdate("create table Movies(MovieId int primary key, Name text, Actor text, Actress text, Director text, YearOfRelease int)");
	        System.out.println("Table created");   
	        //inserting data into the table
	        //Athadu movie data
	        PreparedStatement pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,1);
	        pstmt.setString(2,"Athadu");
	        pstmt.setString(3,"Maheshbabu");
	        pstmt.setString(4,"Trisha");
	        pstmt.setString(5,"Trivikram");
	        pstmt.setInt(6,2005);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //Murari movie data
	        pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,2);
	        pstmt.setString(2,"Murari");
	        pstmt.setString(3,"Maheshbabu");
	        pstmt.setString(4,"Nayanatara");
	        pstmt.setString(5,"Rajamouli");
	        pstmt.setInt(6,2001);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //Bahubali movie data
	        pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,3);
	        pstmt.setString(2,"Bahubali");
	        pstmt.setString(3,"Prabhas");
	        pstmt.setString(4,"Anushka");
	        pstmt.setString(5,"Rajamouli");
	        pstmt.setInt(6,2018);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //Sarileru nikevaru movie data
	        pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,4);
	        pstmt.setString(2,"SarileruNikevaru");
	        pstmt.setString(3,"Maheshbabu");
	        pstmt.setString(4,"Rashmika");
	        pstmt.setString(5,"Anil ravipudi");
	        pstmt.setInt(6,2020);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //janta jarage movie data
	        pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,5);
	        pstmt.setString(2,"Janata garage");
	        pstmt.setString(3,"Jnr.NTR");
	        pstmt.setString(4,"Samantha");
	        pstmt.setString(5,"Koratala Siva");
	        pstmt.setInt(6,2016);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //Temper movie data
	        pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,6);
	        pstmt.setString(2,"Temper");
	        pstmt.setString(3,"Jnr.NTR");
	        pstmt.setString(4,"Kajal");
	        pstmt.setString(5,"Puri Jaganadh");
	        pstmt.setInt(6,2015);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //Theri movie data
	        pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,7);
	        pstmt.setString(2,"Theri");
	        pstmt.setString(3,"Viay");
	        pstmt.setString(4,"Samantha");
	        pstmt.setString(5,"Atlee Kumar");
	        pstmt.setInt(6,2016);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //majili movie data
	        pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,8);
	        pstmt.setString(2,"Majili");
	        pstmt.setString(3,"Naga Chaitanya");
	        pstmt.setString(4,"Samantha");
	        pstmt.setString(5,"Shiva Nirvana");
	        pstmt.setInt(6,2019);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //lovestory movie data
	        pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,9);
	        pstmt.setString(2,"LoveStory");
	        pstmt.setString(3,"NagaChaitanya");
	        pstmt.setString(4,"Saipallavi");
	        pstmt.setString(5,"Shekar Kammula");
	        pstmt.setInt(6,2021);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //premam movie data
	        pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
	        pstmt.setInt(1,10);
	        pstmt.setString(2,"Premam");
	        pstmt.setString(3,"NagaChaitanya");
	        pstmt.setString(4,"Madonna");
	        pstmt.setString(5,"Chandoo");
	        pstmt.setInt(6,2016);
	        n=pstmt.executeUpdate();
	        System.out.println(n +" record entered");
	        //Displaying all movies without condition
	        pstmt=con.prepareStatement("select * from Movies");
	        ResultSet rs=pstmt.executeQuery();
	        while(rs.next()){
	          System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
	        }    
	        //displaying movies of ator maheshbabu
	        pstmt=con.prepareStatement("select * from Movies where Actor='Maheshbabu'");
	        rs=pstmt.executeQuery();
	        while(rs.next()){
	          System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
	        }
	        //displaying movies of actress samantha
	        pstmt=con.prepareStatement("select * from Movies where Actress='Samantha'");
	        rs=pstmt.executeQuery();
	        while(rs.next()){
	          System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
	        }
	        //closing the connection
	        con.close();

	            }
	    }
	    
	    catch(Exception e){
	      System.out.println(e);
	      }

	    }
}
