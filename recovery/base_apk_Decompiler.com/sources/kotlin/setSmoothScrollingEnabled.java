package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u0000*\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u000e\u0010\u0010R\"\u0010\u000b\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u000e\u0010\u0015"}, d2 = {"Lo/setSmoothScrollingEnabled;", "Lo/ObjectWriterPrefetch;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_skipWSOrEnd;", "p0", "", "p1", "<init>", "(Lo/_skipWSOrEnd;Z)V", "Lo/bufferMapProperty;", "", "read", "(Lo/bufferMapProperty;Ljava/lang/Object;)Lo/setSmoothScrollingEnabled;", "Lo/_skipWSOrEnd;", "write", "()Lo/_skipWSOrEnd;", "(Lo/_skipWSOrEnd;)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Z", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setSmoothScrollingEnabled extends _handleOddName.IconCompatParcelizer implements ObjectWriterPrefetch {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private _skipWSOrEnd AudioAttributesCompatParcelizer;

    @Override // kotlin.ObjectWriterPrefetch
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final setSmoothScrollingEnabled IconCompatParcelizer(bufferMapProperty buffermapproperty, Object obj) {
        return this;
    }

    public setSmoothScrollingEnabled(_skipWSOrEnd _skipwsorend, boolean z) {
        this.AudioAttributesCompatParcelizer = _skipwsorend;
        this.read = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final _skipWSOrEnd getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(_skipWSOrEnd _skipwsorend) {
        this.AudioAttributesCompatParcelizer = _skipwsorend;
    }

    public final void write(boolean z) {
        this.read = z;
    }
}
