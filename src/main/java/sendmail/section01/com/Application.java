package sendmail.section01.com;

public class Application {
    public static void main(String[] args) {

        MessagePlatform gmail = new Gmail("whdudtjr0@gmail.com");
        MessagePlatform naver = new NaverMail("dse113@naver.com");
        MessagePlatform discord = new Discord("youngseok0129_58520");


        sendMessage(gmail, "지메일로 보냅니다");
        sendMessage(naver, "네이버로 보냅니다");
        sendMessage(discord, "디스코드로 보냅니다");
    }


    public static void sendMessage(MessagePlatform platform, String message) {
        platform.sendMessage(message);
    }
}

