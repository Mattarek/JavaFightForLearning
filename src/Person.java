import java.util.Objects;
import java.util.Random;

public abstract class Person {
	protected String firstName;
	protected String lastName;
	protected int age;
	protected int hp;

	Random random = new Random();

	public Person( String firstName, String lastName, int age, int hp ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.hp = hp;
	}

	public void makeSomeVoice() {
		System.out.println(firstName + " " + lastName + " krzyczy.");
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp( int newHp ) {
		this.hp = newHp;
	}

	public int attack() {
		final int randomNumber = 5 + random.nextInt(11);
		return randomNumber;
	}

	@Override
	public String toString() {
		return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", hp=" + hp + ", random=" + random + '}';
	}

	@Override
	public boolean equals( Object o ) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;

		Person person = (Person)o;
		return age == person.age && hp == person.hp && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(random, person.random);
	}

	@Override
	public int hashCode() {
		int result = Objects.hashCode(firstName);
		result = 31 * result + Objects.hashCode(lastName);
		result = 31 * result + age;
		result = 31 * result + hp;
		result = 31 * result + Objects.hashCode(random);
		return result;
	}
}
