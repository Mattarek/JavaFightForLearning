import java.util.Objects;

public final class Professor extends Person {
	private final ProfessorsSpecialization professorSpecialization;
	private String title;

	public Professor(final String firstName, final String lastName, final int age, final String title, final int hp,
					 final ProfessorsSpecialization professorSpecialization, final PersonalNumber personalNumber) {
		super(firstName, lastName, age, hp, personalNumber);
		this.title = title;
		this.professorSpecialization = professorSpecialization;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
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
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final Professor professor = (Professor) o;
		return Objects.equals(title, professor.title);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(title);
	}
}
