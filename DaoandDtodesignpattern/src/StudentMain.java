import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
           Connection con = Dbcon.dbcon();
           StudentDao ob = new StudentDao(con);
           Studentdto stu1 = new Studentdto(105,"xyzl","xyz@");
           int x= ob.addStudent(stu1);
           System.out.println("done");
           System.out.println("list");
           List<Studentdto> l = ob.getAllStudents();
           for(Studentdto x1 : l)
           {
        	 System.out.println(x1.id + " " + x1.name + " "+x1.email);  
           }
           System.out.println("serach by id");
           Studentdto s2= ob.searchStudent(101);
           System.out.println(s2.email + " " + s2.name);
           
           
	}

}
