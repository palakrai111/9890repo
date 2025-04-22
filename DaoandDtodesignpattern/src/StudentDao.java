import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements StudentDaoInt {
	Connection con2;

	StudentDao(Connection con2) {
		this.con2 = con2;
	}

	@Override
	public int addStudent(Studentdto s) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			String q = "insert into student values(?,?,?)";
			PreparedStatement ps = con2.prepareStatement(q);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());
			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<Studentdto> getAllStudents() {
		// TODO Auto-generated method stub

		List<Studentdto> l = new ArrayList<Studentdto>();
		Studentdto s1 = null;
		try {

			String q = "select * from student";
			PreparedStatement ps = con2.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int i = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				s1 = new Studentdto(i, name, email);
				l.add(s1);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public Studentdto searchStudent(int id) {
		// TODO Auto-generated method stub
		Studentdto s2 = null;

		try {

			String q = "select * from student where id = ?";
			PreparedStatement ps;
			ps = con2.prepareStatement(q);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int i = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				s2 = new Studentdto(i, name, email);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s2;
	}

}
