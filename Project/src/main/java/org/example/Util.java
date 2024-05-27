package org.example;

public class Util {
    public static String toTitleCase(String strIn) {
        if (strIn == null || strIn.isEmpty()) {
            return strIn;
        }

        int idx = 0;
        int nextIdx = strIn.indexOf(' ');

        String strOut = "";

        while (true) {
            strOut += strIn.substring(idx, idx + 1).toUpperCase();

            if (nextIdx != -1) {
                strOut += strIn.substring(idx + 1, nextIdx).toLowerCase() + " ";
            } else {
                strOut += strIn.substring(idx + 1).toLowerCase();
            }

            idx = nextIdx;
            if (idx == -1) {
                break;
            }
            nextIdx = strIn.indexOf(' ', ++idx);
        }
        return strOut;
    }
}
