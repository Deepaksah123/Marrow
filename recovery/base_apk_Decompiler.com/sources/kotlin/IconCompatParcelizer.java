package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class IconCompatParcelizer {
    private static final String AudioAttributesCompatParcelizer = "_COROUTINE";

    public static final String read() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement IconCompatParcelizer(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        StringBuilder sb = new StringBuilder();
        sb.append(AudioAttributesCompatParcelizer);
        sb.append('.');
        sb.append(str);
        return new StackTraceElement(sb.toString(), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
