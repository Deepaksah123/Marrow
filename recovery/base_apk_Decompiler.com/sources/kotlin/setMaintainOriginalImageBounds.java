package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/deserializeFromNumber;", "p0", "", "p1", "", "p2", "p3", "Lo/getReferencedType;", "RemoteActionCompatParcelizer", "(Lo/deserializeFromNumber;IZZ)J", "", "AudioAttributesCompatParcelizer", "(Lo/deserializeFromNumber;IZZ)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setMaintainOriginalImageBounds {
    public static final long RemoteActionCompatParcelizer(deserializeFromNumber deserializefromnumber, int i, boolean z, boolean z2) {
        int iAudioAttributesCompatParcelizer = deserializefromnumber.AudioAttributesCompatParcelizer(i);
        if (iAudioAttributesCompatParcelizer >= deserializefromnumber.AudioAttributesImplBaseParcelizer()) {
            return getReferencedType.INSTANCE.read();
        }
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(getQues.read(AudioAttributesCompatParcelizer(deserializefromnumber, i, z, z2), BitmapDescriptorFactory.HUE_RED, (int) (deserializefromnumber.getRead() >> 32)))) << 32) | (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits(getQues.read(deserializefromnumber.read(iAudioAttributesCompatParcelizer), BitmapDescriptorFactory.HUE_RED, (int) deserializefromnumber.getRead())))));
    }

    public static final float AudioAttributesCompatParcelizer(deserializeFromNumber deserializefromnumber, int i, boolean z, boolean z2) {
        return deserializefromnumber.RemoteActionCompatParcelizer(i, deserializefromnumber.RemoteActionCompatParcelizer(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == deserializefromnumber.AudioAttributesImplApi21Parcelizer(i));
    }
}
