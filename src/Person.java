import java.util.Objects;
import java.util.Random;

public abstract class Person {
	private static final Random random = new Random();
	protected String firstName;
	protected String lastName;
	protected int age;
	protected int hp;

	public Person(final String firstName, final String lastName, final int age, final int hp) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.hp = hp;
	}

	public void makeSomeVoice() {
		System.out.printf(firstName + " " + lastName + " krzyczy.");
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

	public void setHp(final int newHp) {
		hp = newHp;
	}

	public int attack() {
		return 5 + random.nextInt(11);
	}

	@Override
	public String toString() {
		return "Person{" + "firstName='"
				+ firstName + '\''
				+ ", lastName='"
				+ lastName
				+ '\'' + ", age=" + age + ", hp=" + hp
				+ ", random=" + random + '}';
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final Person person = (Person) o;
		return age == person.age && hp == person.hp
				&& Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName)
				&& Objects.equals(random, random);
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
