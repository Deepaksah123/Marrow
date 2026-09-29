package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u00020\u00128\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010\u0015"}, d2 = {"Lo/setGlobalDuplicateFilteringDefault;", "", "Lo/CoercionConfig;", "p0", "<init>", "(Lo/CoercionConfig;)V", "Lo/DeserializationContext;", "", "AudioAttributesCompatParcelizer", "(Lo/DeserializationContext;)V", "Lo/getArrayBuilders;", "p1", "", "IconCompatParcelizer", "(Lo/getArrayBuilders;Lo/getArrayBuilders;)Z", "write", "Lo/CoercionConfig;", "RemoteActionCompatParcelizer", "", "I", "()I", "Lo/getArrayBuilders;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setGlobalDuplicateFilteringDefault {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public getArrayBuilders read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final CoercionConfig RemoteActionCompatParcelizer;

    public setGlobalDuplicateFilteringDefault(CoercionConfig coercionConfig) {
        this.RemoteActionCompatParcelizer = coercionConfig;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(DeserializationContext p0) {
        getArrayBuilders getarraybuilders = this.read;
        getArrayBuilders getarraybuilders2 = p0.AudioAttributesCompatParcelizer().get(0);
        if (getarraybuilders != null && IconCompatParcelizer(getarraybuilders, getarraybuilders2) && AudioAttributesCompatParcelizer(getarraybuilders, getarraybuilders2)) {
            this.AudioAttributesCompatParcelizer++;
        } else {
            this.AudioAttributesCompatParcelizer = 1;
        }
        this.read = getarraybuilders2;
    }

    public final boolean IconCompatParcelizer(getArrayBuilders p0, getArrayBuilders p1) {
        return p1.getWrite() - p0.getWrite() < this.RemoteActionCompatParcelizer.read();
    }

    public final boolean AudioAttributesCompatParcelizer(getArrayBuilders p0, getArrayBuilders p1) {
        return onAttachedToRecyclerViewInternal.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, p0, p1);
    }
}
