package kotlin;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    private static volatile n AudioAttributesCompatParcelizer = null;
    private static final int IconCompatParcelizer = 20;
    private static final Object read = new Object();

    public static void IconCompatParcelizer(n nVar) {
        synchronized (read) {
            if (AudioAttributesCompatParcelizer == null) {
                AudioAttributesCompatParcelizer = nVar;
            }
        }
    }

    public static String write(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = IconCompatParcelizer;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static n write() {
        n nVar;
        synchronized (read) {
            if (AudioAttributesCompatParcelizer == null) {
                AudioAttributesCompatParcelizer = new write(3);
            }
            nVar = AudioAttributesCompatParcelizer;
        }
        return nVar;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class write extends n {
        private final int read;

        public write(int i) {
            this.read = i;
        }
    }
}
