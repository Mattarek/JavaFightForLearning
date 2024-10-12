public final class Student extends Person {
	private final int indexNumber;

	public Student( String firstName, String lastName, int age, int hp, int indexNumber ) {
		super(firstName, lastName, age, hp);
		this.indexNumber = indexNumber;
	}

	@Override
	public String toString() {
		return "Student{" + "firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\'' + ", age=" + getAge() + ", hp=" + getHp() + '}';
	}

	@Override
	public boolean equals( Object o ) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;
		if ( !super.equals(o) ) return false;

		Student student = (Student)o;
		return indexNumber == student.indexNumber;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + indexNumber;
		return result;
	}
}
