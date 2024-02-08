package poly.ex.sender;

public class SendMain {
    public static void main(String[] args) {
        // 다음 코드를 참고하여 클래스 완성하기
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
