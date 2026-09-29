package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonAvailableCommandsChanged33<T> {
    private T AudioAttributesCompatParcelizer;
    private String IconCompatParcelizer;
    private final lambdaonAudioAttributesChanged55 RemoteActionCompatParcelizer;
    private String read;
    private String write;

    public final void read() {
        synchronized (this) {
            throw new NullPointerException();
        }
    }

    public final String toString() {
        if ("file".equals(this.IconCompatParcelizer)) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Var(");
        sb.append(this.write);
        sb.append(",");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    final String RemoteActionCompatParcelizer() {
        if ("file".equals(this.IconCompatParcelizer)) {
            return this.read;
        }
        return null;
    }
}
