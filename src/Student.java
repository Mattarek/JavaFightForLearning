public final class Student extends Person {
	public Student( String firstName, String lastName, int age, int hp ) {
		super(firstName, lastName, age, hp);
	}

	@Override
	public boolean equals( Object o ) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;

		Student student = (Student)o;
		return hp == student.hp;
	}

	@Override
	public int hashCode() {
		return hp;
	}

	@Override
	public String toString() {
		return "Student{}";
	}
}
