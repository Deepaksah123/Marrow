package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b*\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\f\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000e\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\"\u0004\b\u0010\u0010\u0014"}, d2 = {"Lo/getExitTransition;", "Lo/ObjectWriterPrefetch;", "Lo/_handleOddName$IconCompatParcelizer;", "", "p0", "", "p1", "<init>", "(FZ)V", "Lo/bufferMapProperty;", "", "Lo/getText;", "AudioAttributesCompatParcelizer", "(Lo/bufferMapProperty;Ljava/lang/Object;)Lo/getText;", "RemoteActionCompatParcelizer", "F", "write", "(F)V", "IconCompatParcelizer", "Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getExitTransition extends _handleOddName.IconCompatParcelizer implements ObjectWriterPrefetch {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float AudioAttributesCompatParcelizer;

    public getExitTransition(float f, boolean z) {
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = z;
    }

    public final void write(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    public final void write(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // kotlin.ObjectWriterPrefetch
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getText IconCompatParcelizer(bufferMapProperty buffermapproperty, Object obj) {
        getText gettext = obj instanceof getText ? (getText) obj : null;
        if (gettext == null) {
            gettext = new getText(BitmapDescriptorFactory.HUE_RED, false, null, null, 15, null);
        }
        gettext.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        gettext.write(this.RemoteActionCompatParcelizer);
        return gettext;
    }
}
