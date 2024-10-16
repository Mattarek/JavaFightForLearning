public final class Student extends Person {
	private final int indexNumber;

	public Student(final String firstName, final String lastName, final int age, final int hp, final int indexNumber, final PersonalNumber personalNumber) {
		super(firstName, lastName, age, hp, personalNumber);
		this.indexNumber = indexNumber;
	}

	@Override
	public String toString() {
		return "Student{" + "firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\'' + ", age=" + getAge() + ", hp=" + getHp() + '}';
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}

		final Student student = (Student) o;
		return indexNumber == student.indexNumber;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + indexNumber;
		return result;
	}
}
