package byITacademyMPA.marathon.oct18;

public class VoiceNumberUtils {
    public String voiceNumber(int number) {
        return switch (number) {
            case 1: yield  "One";
            case 2: yield  "Two";
            case 3: yield  "Three";
            case 4: yield  "Four";
            case 5: yield  "Five";
            case 6: yield  "Six";
            case 7: yield  "Seven";
            case 8: yield  "Eight";
            case 9: yield  "Nine";
            default: yield  "Invalid number";
        };
    }
}
