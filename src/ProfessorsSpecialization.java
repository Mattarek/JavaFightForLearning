public enum ProfessorsSpecialization {
	COMPUTER_SCIENCE("Informatyka"),
	MATHEMATICS("Matematyka"),
	PHYSICS("Fizyka"),
	CHEMISTRY("Chemia"),
	BIOLOGY("Biologia"),
	ECONOMICS("Ekonomia"),
	LITERATURE("Literatura"),
	HISTORY("Historia"),
	PHILOSOPHY("Filozofia"),
	PSYCHOLOGY("Psychologia"),
	ENGINEERING("Inżynieria"),
	MEDICINE("Medycyna"),
	LAW("Prawo"),
	ART("Sztuka"),
	SOCIOLOGY("Socjologia"),
	POLITICAL_SCIENCE("Nauki polityczne"),
	LINGUISTICS("Językoznawstwo"),
	ENVIRONMENTAL_SCIENCE("Nauki o środowisku");

	private final String name;

	ProfessorsSpecialization(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}