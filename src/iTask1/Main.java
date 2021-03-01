package iTask1;

public class Main {

    public static void main(String[] args) {
	User user001 = new User("Kat","od555","08998888",
            "wifi","000.000.000.000","Kat","123");
        User user007 = new User("Kat","od555","08998888",
                "wifi","000.000.000.100","Kat","123");

	System.out.println(user001.tryLogin("Kat","123"));

	System.out.println(user001.tryLogin(user007.getId(),user007.getPassword()));



	System.out.println(user001.equals(user007));
    }
}
