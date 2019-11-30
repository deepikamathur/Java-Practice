package CompositionExercise;

public class Author {

	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		if (this.gender != 'm' && this.gender != 'f') {
			System.out.println("Invalid gender type");
			return '0';
		}

		else
			return this.gender;
	}

	public String toString() {
		StringBuffer s1 = new StringBuffer();
		s1.append("name: ").append(this.name).append("\temail: ").append(this.email).append("\tgender: ")
				.append(getGender());

		return s1.toString();
	}

}
