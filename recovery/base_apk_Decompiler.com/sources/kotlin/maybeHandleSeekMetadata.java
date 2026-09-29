package kotlin;

/* JADX INFO: loaded from: classes5.dex */
final class maybeHandleSeekMetadata extends getSeekFrameHeader {
    private final maybeReadSeekFrame write;

    maybeHandleSeekMetadata(maybeReadSeekFrame maybereadseekframe, int i) {
        super(maybereadseekframe.size(), i);
        this.write = maybereadseekframe;
    }

    @Override // kotlin.getSeekFrameHeader
    protected final Object read(int i) {
        return this.write.get(i);
    }
}
