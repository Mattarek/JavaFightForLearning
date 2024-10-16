public record PersonalNumber(String pesel) {
	private static final int[] MULTIPLIERS = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

	public PersonalNumber {
		if (pesel == null || pesel.length() != 11) {
			throw new IllegalArgumentException("Numer PESEL musi mieć dokładnie 11 znaków.");
		}

		if (!pesel.matches("\\d{11}")) {
			throw new IllegalArgumentException("Numer PESEL może zawierać tylko cyfry.");
		}

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			final int digit = Character.getNumericValue(pesel.charAt(i));
			sum += digit * MULTIPLIERS[i];
		}
		final int checksum = (10 - sum % 10) % 10;

		final int computedLastDigit = Character.getNumericValue(pesel.charAt(10));

		if (checksum != computedLastDigit) {
			throw new IllegalArgumentException("Nieprawidłowy numer PESEL.");
		}
	}
}


