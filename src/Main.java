public class Main {
	public static void main( String[] args ) {
		Student student = new Student("John", "Doe", 20, 100);
		Professor professor = new Professor("Dr.", "Smith", 45, "Professor", 100);

		System.out.println("Walka zaczyna się!");

		while ( student.getHp() > 0 && professor.getHp() > 0 ) {
			System.out.println("--- Tura studenta ---");
			int studentAttack = student.attack();
			professor.setHp(professor.getHp() - studentAttack);
			System.out.println(student.getFirstName() + " atakuje " + professor.getFirstName() + professor.getLastName() + "a" + " za " + studentAttack + " obrażeń.");
			System.out.println("HP profesora: " + professor.getHp());

			if ( professor.getHp() <= 0 ) {
				System.out.println("\n" + professor.getFirstName() + professor.getLastName() + " został pokonany! " + student.getFirstName() + " wygrywa!");
				break;
			}

			System.out.println("--- Tura profesora ---");
			int professorAttack = professor.attack();
			student.setHp(student.getHp() - professorAttack); //
			System.out.println(professor.getFirstName() + professor.getLastName() + " atakuje " + student.getFirstName() + " za " + professorAttack + " obrażeń.");
			System.out.println("HP studenta: " + student.getHp());

			if ( student.getHp() <= 0 ) {
				System.out.println("\n" + student.getFirstName() + " został pokonany! " + professor.getFirstName() + " wygrywa!");
				break;
			}
		}
	}
}
