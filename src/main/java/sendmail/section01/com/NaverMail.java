package sendmail.section01.com;

public class NaverMail extends  MessagePlatform{
    private final String email;

    public NaverMail(String email) {
        this.email = email;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("네이버로 보냅니다  " + email + ": " + message);
    }
}

