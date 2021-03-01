package iTask1;

public interface iUser {

    String GetMethod();

    String GetIP();

    String GetId();

    String GetPassword();

    boolean tryLogin(String login, String password);

}
