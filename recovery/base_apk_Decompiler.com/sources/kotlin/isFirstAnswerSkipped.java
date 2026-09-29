package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public enum isFirstAnswerSkipped {
    NO_ARGUMENTS((boolean) (0 == true ? 1 : 0), 3),
    UNLESS_EMPTY((boolean) (1 == true ? 1 : 0), 2),
    ALWAYS_PARENTHESIZED(true, true);

    private final boolean IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;

    /* synthetic */ isFirstAnswerSkipped(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false);
    }

    isFirstAnswerSkipped(boolean z, boolean z2) {
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = z2;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }
}
