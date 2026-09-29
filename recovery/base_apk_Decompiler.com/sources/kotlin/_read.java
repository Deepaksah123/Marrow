package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class _read extends RuntimeException {
    public final int read;

    public _read(int i) {
        super(write(i));
        this.read = i;
    }

    private static String write(int i) {
        if (i == 1) {
            return "Player release timed out.";
        }
        if (i == 2) {
            return "Setting foreground mode timed out.";
        }
        if (i == 3) {
            return "Detaching surface timed out.";
        }
        return "Undefined timeout.";
    }
}
