package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        /*
        speaker.volume = 200;  // volume이 100을 넘어버리게 되어버림 -> 외부 접근을 막아야 함
                               // private 설정으로 값 변경 불가
        */
        speaker.showVolume();
    }
}
