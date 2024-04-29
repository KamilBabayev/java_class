package less04;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        String[] vovels = {"a", "e", "i", "o", "u"};
        String message = "( FE: Salam, Necesen ? ) --> 5";

        System.out.println(GetVovels(message, vovels));
    }

    public static String GetVovels(String text, String[] vovels) {
        int vovelsCount = 0;
        for (int i = 0; i < vovels.length; i++) {
            if (text.contains(vovels[i])) {
                vovelsCount++;
            }
        }

        int index = 0;
        String[] existingVovels = new String[vovelsCount];
        for (int i = 0; i < vovelsCount; i++) {
            if (text.contains(vovels[i])) {
                existingVovels[index++] = vovels[i];
            }
        }
        return text + " contains vovels " + Arrays.toString(existingVovels);
    }
}
