public class Main {
	public static void main(final String[] args) {
		final PersonalNumber personalNumberStudent = new PersonalNumber("81100216357");
		final PersonalNumber personalNumberProfessor = new PersonalNumber("92071314764");
		final Student student = new Student("John", "Doe", 20, 100, 2137, personalNumberStudent);
		final Professor professor = new Professor("Kenny.", "Smith", 45, "Professor", 100,
				ProfessorsSpecialization.LITERATURE, personalNumberProfessor);

		System.out.println(professor.getProfessorSpecialization());
		System.out.println("Walka zaczyna się!");

		while (student.getHp() > 0 && professor.getHp() > 0) {
			System.out.println("--- Tura studenta ---");
			final int studentAttack = student.attack();
			professor.setHp(professor.getHp() - studentAttack);
			System.out.println(student.getFirstName() + " atakuje "
					+ professor.getFirstName() + professor.getLastName()
					+ "a" + " za " + studentAttack + " obrażeń.");
			System.out.println("HP profesora: " + professor.getHp());

			if (professor.getHp() <= 0) {
				System.out.println("\n" + professor.getFirstName() + professor.getLastName()
						+ " został pokonany! " + student.getFirstName() + " wygrywa!");
				break;
			}

			System.out.println("--- Tura profesora ---");
			final int professorAttack = professor.attack();
			student.setHp(student.getHp() - professorAttack); //
			System.out.println(professor.getFirstName() + professor.getLastName()
					+ " atakuje " + student.getFirstName() + " za " + professorAttack
					+ " obrażeń."
			);
			System.out.println("HP studenta: " + student.getHp());

			if (student.getHp() <= 0) {
				System.out.println("\n" + student.getFirstName() + " został pokonany! " + professor.getFirstName() + " wygrywa!");
				break;
			}
		}
	}
}
