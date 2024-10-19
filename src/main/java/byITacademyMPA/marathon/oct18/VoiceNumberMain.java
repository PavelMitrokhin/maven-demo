package byITacademyMPA.marathon.oct18;

public class VoiceNumberMain {
    public static void main(String[] args) {
        int number = 12;
        String numberAsAString= "";
        VoiceNumberUtils voiceNumberUtils = new VoiceNumberUtils();
        numberAsAString = voiceNumberUtils.voiceNumber(number);
        System.out.println(numberAsAString);
    }
}
