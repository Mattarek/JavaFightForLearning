import java.util.Objects;

public final class Professor extends Person {
	private final ProfessorsSpecialization professorSpecialization;
	private String title;

	public Professor( String firstName, String lastName, int age, String title, int hp, ProfessorsSpecialization professorSpecialization ) {
		super(firstName, lastName, age, hp);
		this.title = title;
		this.professorSpecialization = professorSpecialization;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle( String title ) {
		this.title = title;
	}

	public ProfessorsSpecialization getProfessorSpecialization() {
		return professorSpecialization;
	}

	@Override
	public String toString() {
		return "Professor{" + "title='" + title + '\'' + '}';
	}

	@Override
	public boolean equals( Object o ) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;

		Professor professor = (Professor)o;
		return Objects.equals(title, professor.title);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(title);
	}
}
