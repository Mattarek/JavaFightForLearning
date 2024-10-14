import java.util.ArrayList;
import java.util.List;

public class ProfessorsGroup {
	private final int MAX_STUDENTS = 25;
	private final List<Student> students = new ArrayList<>();
	private Professor professor;

	public ProfessorsGroup(final Professor professor) {
		this.professor = professor;
	}

	public void addStudent(final Student student) {
		if (students.size() < MAX_STUDENTS) {
			students.add(student);
		}
		throw new IllegalArgumentException("Group is full. You can't add more than " + MAX_STUDENTS);
	}

	public void removeStudent(final Student student) {
		students.remove(student);
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(final Professor professor) {
		this.professor = professor;
	}

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "Group{" + "leader=" + professor + ", students=" + students + '}';
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final ProfessorsGroup that = (ProfessorsGroup) o;
		return MAX_STUDENTS == that.MAX_STUDENTS && professor.equals(that.professor) && students.equals(that.students);
	}

	@Override
	public int hashCode() {
		int result = MAX_STUDENTS;
		result = 31 * result + professor.hashCode();
		result = 31 * result + students.hashCode();
		return result;
	}
}
