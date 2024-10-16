import java.util.Objects;
import java.util.Random;

public abstract class Person {
	private static final Random random = new Random();
	protected String firstName;
	protected String lastName;
	protected int age;
	protected int hp;
	protected PersonalNumber personalNumber;

	public Person(final String firstName, final String lastName, final int age, final int hp,
				  final PersonalNumber personalNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.hp = hp;
		this.personalNumber = personalNumber; // Używamy przekazanego obiektu bez tworzenia nowego
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
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof final Person person)) {
			return false;
		}
		return age == person.age
				&& hp == person.hp
				&& Objects.equals(firstName, person.firstName)
				&& Objects.equals(lastName, person.lastName)
				&& Objects.equals(personalNumber, person.personalNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, age, hp, personalNumber);
	}

	@Override
	public String toString() {
		return "Person{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", hp=" + hp +
				", personalNumber=" + personalNumber +
				'}';
	}
}