package hospital1;


import javax.print.Doc;

public class Doctor {
	private int id;
	private String name;
	private String surname;

	public Doctor(String name, String surname, int id) {
		this.id = id;
		this.surname = surname;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return name + " " + surname;
	}


}
