package DAO;

public class DaoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao dao=new StudentDaoImpl();
		for(Student stud:dao.getAllStudents()) {
			System.out.println("Student roll no is-"+stud.getRollno()+" name is-"+stud.getName());
		}
		
		

	}

}
