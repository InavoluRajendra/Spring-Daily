package DAO;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
	
	List<Student> students;
	public StudentDaoImpl() {
		students=new ArrayList<Student>();
		Student student1=new Student("Akash",1);
		Student student2=new Student("nihal",2);
		students.add(student1);
		students.add(student2);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int rollno) {
		// TODO Auto-generated method stub
		return students.get(rollno);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		students.get(student.getRollno()).setName(student.getName());
		System.out.println("Student:Roll no"+student.getRollno()+"updated");

	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub

	}

}
