package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class createMediaSource {
    private static final int IconCompatParcelizer = read();

    private static int read() {
        return write(System.getProperty("java.version"));
    }

    private static int write(String str) {
        int iIconCompatParcelizer = IconCompatParcelizer(str);
        if (iIconCompatParcelizer == -1) {
            iIconCompatParcelizer = AudioAttributesCompatParcelizer(str);
        }
        if (iIconCompatParcelizer == -1) {
            return 6;
        }
        return iIconCompatParcelizer;
    }

    private static int IconCompatParcelizer(String str) {
        try {
            String[] strArrSplit = str.split("[._]");
            int i = Integer.parseInt(strArrSplit[0]);
            return (i != 1 || strArrSplit.length <= 1) ? i : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int AudioAttributesCompatParcelizer(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer >= 9;
    }
}
