package nev;

public class TestMain {

	public static void main(String[] args) {

		Teacher person = () -> "Öğrencilere Ders Anlatıyorum";
		Student student = () -> "Ders Calisiyorum";
		
		System.out.println(student.iAmWorking());
	}

}
