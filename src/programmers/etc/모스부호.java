package programmers.etc;

import java.util.Map;

public class 모스부호 {
    public static final Map<String, Character> MORSE_MAP = Map.ofEntries(
            Map.entry(".-", 'a'), Map.entry("-...", 'b'), Map.entry("-.-.", 'c'), Map.entry("-..", 'd'),
            Map.entry(".", 'e'), Map.entry("..-.", 'f'), Map.entry("--.", 'g'), Map.entry("....", 'h'),
            Map.entry("..", 'i'), Map.entry(".---", 'j'), Map.entry("-.-", 'k'), Map.entry(".-..", 'l'),
            Map.entry("--", 'm'), Map.entry("-.", 'n'), Map.entry("---", 'o'), Map.entry(".--.", 'p'),
            Map.entry("--.-", 'q'), Map.entry(".-.", 'r'), Map.entry("...", 's'), Map.entry("-", 't'),
            Map.entry("..-", 'u'), Map.entry("...-", 'v'), Map.entry(".--", 'w'), Map.entry("-..-", 'x'),
            Map.entry("-.--", 'y'), Map.entry("--..", 'z'));

    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
        System.out.println(solution(".--. -.-- - .... --- -."));
    }

    public static String solution(String letter) {
        String[] letters = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : letters) {
            sb.append(MORSE_MAP.get(s));
        }
        return sb.toString();
    }
}
