package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t*\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\f\u0010\u0006"}, d2 = {"Lo/setStyle;", "Lo/ObjectWriterPrefetch;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_skipWSOrEnd$write;", "p0", "<init>", "(Lo/_skipWSOrEnd$write;)V", "Lo/bufferMapProperty;", "", "Lo/getText;", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;Ljava/lang/Object;)Lo/getText;", "write", "Lo/_skipWSOrEnd$write;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setStyle extends _handleOddName.IconCompatParcelizer implements ObjectWriterPrefetch {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private _skipWSOrEnd.write IconCompatParcelizer;

    public setStyle(_skipWSOrEnd.write writeVar) {
        this.IconCompatParcelizer = writeVar;
    }

    public final void write(_skipWSOrEnd.write writeVar) {
        this.IconCompatParcelizer = writeVar;
    }

    @Override // kotlin.ObjectWriterPrefetch
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getText IconCompatParcelizer(bufferMapProperty buffermapproperty, Object obj) {
        getText gettext = obj instanceof getText ? (getText) obj : null;
        if (gettext == null) {
            gettext = new getText(BitmapDescriptorFactory.HUE_RED, false, null, null, 15, null);
        }
        gettext.read(BackStackState.INSTANCE.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
        return gettext;
    }
}
