package sendmail.section01.com;

public class Discord extends MessagePlatform{
    private final String username;

    public Discord(String username) {
        this.username = username;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("디스코드로 보냅니다.  " + username + ": " + message);
    }
}
