package Studentdatabase;

public class Studentdatabaseapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentapp stu=new Studentapp();
		stu.enroll();
		stu.payments();
		System.out.println(stu.toString());
	}

}
