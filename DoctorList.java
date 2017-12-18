package hospital1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DoctorList {

	Map<Integer, Doctor> mapa = new TreeMap<>();

	public void addDoctors() {
	/*	Doctor[] doctors = {
				new Doctor("Grzegorz", "Urbanski", 9001),
				new Doctor("Marlena", "Urbanska", 9109),
				new Doctor("Grzegorz1", "Urbanski1", 9002)
		};

		for (Doctor doctor : doctors) {
			mapa.put(doctor.getId(), doctor);
		}*/
		System.out.print("Imie lekarza: ");
		Scanner readName = new Scanner(System.in);
		String name = readName.nextLine();

		System.out.print("Nazwisko lekarza: ");
		Scanner readSurname = new Scanner(System.in);
		String surname = readSurname.nextLine();

		System.out.print("ID lekarza: ");
		Scanner readId = new Scanner(System.in);
		int id = readId.nextInt();

		Doctor doctor = new Doctor(name, surname, id);

		mapa.put(doctor.getId(), doctor);
	}

	public void seeDoctor() {

		System.out.println(mapa);
	}

	public void removeDoctor() {
		System.out.println("Podaj ID lekarza ktorego chcesz usunac: ");
		Scanner removeDoctor = new Scanner(System.in);
		int id = removeDoctor.nextInt();
		mapa.remove(id);
	}

	public void choice() {
		int licznik = 0;
		while (licznik == 0) {
			System.out.println("Co chcesz zrobic?");
			System.out.println("1.Dodac lekarza.");
			System.out.println("2.Usunac lekarza");
			System.out.println("3.Pokaz liste lekarzy.");
			System.out.println("4.Zakończ ");
			System.out.println("");
			System.out.println("Podaj liczbe (1-4): ");

			int read;
			Scanner write1 = new Scanner(System.in);
			read = write1.nextInt();

			if (read == 1) {
				addDoctors();
				System.out.println("Dodano lekarza");

			} else if (read == 2) {
				removeDoctor();
				System.out.println("Usunieto lekarza");

			} else if (read == 3) {
				System.out.println("Lista lekarzy:");
				seeDoctor();
			} else if (read == 4) {
				System.out.println("Zakonczono");
				break;
			}

		}
	}
}
