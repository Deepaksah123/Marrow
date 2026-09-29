package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f*\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0011\u0010\u0014"}, d2 = {"Lo/cancelLoad;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/ObjectWriterPrefetch;", "Lo/SwitchCompat;", "", "p0", "Lo/hasReferringProperties;", "p1", "p2", "<init>", "(Lo/SwitchCompat;Lo/SwitchCompat;Lo/SwitchCompat;)V", "Lo/bufferMapProperty;", "", "IconCompatParcelizer", "(Lo/bufferMapProperty;Ljava/lang/Object;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Lo/SwitchCompat;", "read", "()Lo/SwitchCompat;", "RemoteActionCompatParcelizer", "(Lo/SwitchCompat;)V", "MediaBrowserCompatCustomActionResultReceiver", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cancelLoad extends _handleOddName.IconCompatParcelizer implements ObjectWriterPrefetch {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private SwitchCompat<Float> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private SwitchCompat<hasReferringProperties> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private SwitchCompat<Float> AudioAttributesCompatParcelizer;

    @Override // kotlin.ObjectWriterPrefetch
    public final Object IconCompatParcelizer(bufferMapProperty buffermapproperty, Object obj) {
        return this;
    }

    public cancelLoad(SwitchCompat<Float> switchCompat, SwitchCompat<hasReferringProperties> switchCompat2, SwitchCompat<Float> switchCompat3) {
        this.IconCompatParcelizer = switchCompat;
        this.read = switchCompat2;
        this.AudioAttributesCompatParcelizer = switchCompat3;
    }

    public final void RemoteActionCompatParcelizer(SwitchCompat<Float> switchCompat) {
        this.IconCompatParcelizer = switchCompat;
    }

    public final SwitchCompat<Float> read() {
        return this.IconCompatParcelizer;
    }

    public final SwitchCompat<hasReferringProperties> MediaBrowserCompatCustomActionResultReceiver() {
        return this.read;
    }

    public final void write(SwitchCompat<hasReferringProperties> switchCompat) {
        this.read = switchCompat;
    }

    public final void read(SwitchCompat<Float> switchCompat) {
        this.AudioAttributesCompatParcelizer = switchCompat;
    }

    public final SwitchCompat<Float> write() {
        return this.AudioAttributesCompatParcelizer;
    }
}
