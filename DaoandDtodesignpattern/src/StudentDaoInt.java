import java.util.List;

public interface StudentDaoInt
{
   public int addStudent(Studentdto s);
  public  List<Studentdto> getAllStudents();
  public Studentdto searchStudent(int id);
   
}
