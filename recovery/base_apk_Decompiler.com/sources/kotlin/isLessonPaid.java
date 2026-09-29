package kotlin;

/* JADX INFO: loaded from: classes.dex */
public enum isLessonPaid implements VideoDeleteRecord<Object> {
    INSTANCE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER;

    @Override // kotlin.toLSModel
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // kotlin.toLSModel
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
    }

    @Override // kotlin.toLSModel
    public final Object read() throws Exception {
        return null;
    }

    @Override // kotlin.isShown
    public final int write(int i) {
        return i & 2;
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return this == INSTANCE;
    }

    public static void write(getUpdates<?> getupdates) {
        getupdates.AudioAttributesCompatParcelizer(INSTANCE);
        getupdates.aI_();
    }

    @Override // kotlin.toLSModel
    public final boolean RemoteActionCompatParcelizer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
