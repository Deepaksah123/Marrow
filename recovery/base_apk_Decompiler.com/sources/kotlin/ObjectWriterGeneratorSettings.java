package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/ObjectWriterGeneratorSettings;", "Lo/createDummyDeserializationContext;", "Lo/withHandlersFrom;", "p0", "Lo/createDeserializationContext;", "p1", "<init>", "(Lo/withHandlersFrom;Lo/createDeserializationContext;)V", "write", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "()Lo/withHandlersFrom;", "(Lo/withHandlersFrom;)V", "read", "Lo/createDeserializationContext;", "RemoteActionCompatParcelizer", "()Lo/createDeserializationContext;", "IconCompatParcelizer", "", "onRemoveQueueItem", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ObjectWriterGeneratorSettings implements createDummyDeserializationContext {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final createDeserializationContext IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private withHandlersFrom read;

    public ObjectWriterGeneratorSettings(withHandlersFrom withhandlersfrom, createDeserializationContext createdeserializationcontext) {
        this.read = withhandlersfrom;
        this.IconCompatParcelizer = createdeserializationcontext;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final withHandlersFrom getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final createDeserializationContext getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void write(withHandlersFrom withhandlersfrom) {
        this.read = withhandlersfrom;
    }

    @Override // kotlin.createDummyDeserializationContext
    public final boolean onRemoveQueueItem() {
        return this.IconCompatParcelizer.onFastForward().MediaBrowserCompatItemReceiver();
    }
}
