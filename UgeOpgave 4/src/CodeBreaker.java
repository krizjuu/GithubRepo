public class CodeBreaker {
    public static void main(String[] args) {
        numberEncoder("Ben");
        numberDecoder("2 5 14");
        caesarEncoder("hello");
        caesarDecoder("khoor");
    }

    public static void numberEncoder(String s) {
        int asciiUpCase = 64;
        String text = s.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            int n = text.codePointAt(i) - asciiUpCase;
            if (i == text.length() - 1) {
                System.out.println(n);
            } else {
                System.out.print(n + " ");
            }
        }
    }

    public static void numberDecoder(String s) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        StringBuilder n = new StringBuilder();
        String[] c = s.split("\\s");
        for (String temp : c) {
            if (!temp.equals("")) {
                String[] c2 = temp.split("-");
                for (String temp2 : c2) {
                    int t = Integer.parseInt(temp2);
                    t = t - 1;
                    n.append(alphabet[t]);
                }
            }

        }
        System.out.println(n);
    }


    public static void caesarEncoder(String text) {
        StringBuffer result = new StringBuffer();
        int shift = 3;
        int asciiUpCase = 65;
        int asciiLoCase = 97;

        for (int i = 0; i < text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + shift - asciiUpCase) % 26 + asciiUpCase);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) + shift - asciiLoCase) % 26 + asciiLoCase);
                result.append(ch);
            }
        }
        System.out.println(result);
    }
    public static void caesarDecoder(String text) {
        StringBuffer result = new StringBuffer();
        int shift = 3;
        int asciiUpCase = 65;
        int asciiLoCase = 97;

        for (int i = 0; i < text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) - shift - asciiUpCase) % 26 + asciiUpCase);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) - shift - asciiLoCase) % 26 + asciiLoCase);
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}