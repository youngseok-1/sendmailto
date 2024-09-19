package sendmail.section01.com;

public class  Gmail  extends MessagePlatform{
    private final String email;

    public Gmail(String email) {
        this.email = email;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("지메일로 보냅니다 " + email + ": " + message);
    }
}
