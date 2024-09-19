# sendmailto
 다형성과제<br>
 메일보내기로 디스코드/네이버/구글 로 메일을 보내는 다형성으로 만들려고 한다.<br>   






G-mail : whdudtjr0@gmail.com<br>
Naver : dse113@naver.com<br>
Discord : youngseok0129_58520<br>




다형성을 사용하여 공통 인터페이스인 `MessagePlatform`을 만들었고, 이를 기반으로 Gmail, Naver Mail, Discord 메시지 클래스를 구현한다.

사용 방법
java

MessagePlatform gmail = new Gmail();
gmail.sendMessage("whdudtjr0@gmail.com", "Hello from Gmail!");

MessagePlatform naver = new NaverMail();
naver.sendMessage("dse113@naver.com", "Hello from Naver!");

MessagePlatform discord = new Discord();
discord.sendMessage("youngseok0129_58520", "Hello from Discord!");
