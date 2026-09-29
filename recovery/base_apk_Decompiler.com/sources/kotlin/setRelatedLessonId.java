package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setRelatedLessonId {
    private final isMcq IconCompatParcelizer;
    private final String write;

    public String toString() {
        String strIconCompatParcelizer = IconCompatParcelizer();
        if (strIconCompatParcelizer.length() <= 0) {
            return this.write;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append(" (");
        sb.append(strIconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    private String IconCompatParcelizer() {
        return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
    }

    private isMcq RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
