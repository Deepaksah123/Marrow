package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u001b\u0010\u0002\u001a\u00020\b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0005\u0010\u0012\u001a!\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0002\u0010\u0015"}, d2 = {"Lo/getArrayBuilders;", "", "write", "(Lo/getArrayBuilders;)Z", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/getReferencedType;", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/getArrayBuilders;)J", "AudioAttributesImplApi26Parcelizer", "p0", "(Lo/getArrayBuilders;Z)J", "", "IconCompatParcelizer", "(Lo/getArrayBuilders;)V", "Lo/getKey;", "(Lo/getArrayBuilders;J)Z", "Lo/calloc;", "p1", "(Lo/getArrayBuilders;JJ)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class bufferAsCopyOfValue {
    public static final boolean write(getArrayBuilders getarraybuilders) {
        return (getarraybuilders.MediaDescriptionCompat() || getarraybuilders.getAudioAttributesImplApi26Parcelizer() || !getarraybuilders.getRemoteActionCompatParcelizer()) ? false : true;
    }

    public static final boolean read(getArrayBuilders getarraybuilders) {
        return !getarraybuilders.getAudioAttributesImplApi26Parcelizer() && getarraybuilders.getRemoteActionCompatParcelizer();
    }

    public static final boolean RemoteActionCompatParcelizer(getArrayBuilders getarraybuilders) {
        return (getarraybuilders.MediaDescriptionCompat() || !getarraybuilders.getAudioAttributesImplApi26Parcelizer() || getarraybuilders.getRemoteActionCompatParcelizer()) ? false : true;
    }

    public static final boolean AudioAttributesCompatParcelizer(getArrayBuilders getarraybuilders) {
        return getarraybuilders.getAudioAttributesImplApi26Parcelizer() && !getarraybuilders.getRemoteActionCompatParcelizer();
    }

    public static final boolean AudioAttributesImplApi21Parcelizer(getArrayBuilders getarraybuilders) {
        return !getReferencedType.IconCompatParcelizer(write(getarraybuilders, true), getReferencedType.INSTANCE.write());
    }

    public static final long MediaBrowserCompatCustomActionResultReceiver(getArrayBuilders getarraybuilders) {
        return write(getarraybuilders, false);
    }

    public static final long AudioAttributesImplApi26Parcelizer(getArrayBuilders getarraybuilders) {
        return write(getarraybuilders, true);
    }

    private static final long write(getArrayBuilders getarraybuilders, boolean z) {
        return (z || !getarraybuilders.MediaDescriptionCompat()) ? getReferencedType.AudioAttributesCompatParcelizer(getarraybuilders.getRead(), getarraybuilders.getAudioAttributesImplBaseParcelizer()) : getReferencedType.INSTANCE.write();
    }

    @getRenewGrpId
    public static final void IconCompatParcelizer(getArrayBuilders getarraybuilders) {
        getarraybuilders.RemoteActionCompatParcelizer();
    }

    @getRenewGrpId
    public static final boolean RemoteActionCompatParcelizer(getArrayBuilders getarraybuilders, long j) {
        long read = getarraybuilders.getRead();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (read >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) read);
        int i = (int) (j >> 32);
        int i2 = (int) j;
        boolean z = fIntBitsToFloat < BitmapDescriptorFactory.HUE_RED;
        boolean z2 = fIntBitsToFloat > ((float) i);
        return z2 | z | (fIntBitsToFloat2 < BitmapDescriptorFactory.HUE_RED) | (fIntBitsToFloat2 > ((float) i2));
    }

    public static final boolean write(getArrayBuilders getarraybuilders, long j, long j2) {
        boolean z = handleWeirdNumberValue.read(getarraybuilders.getMediaBrowserCompatItemReceiver(), handleWeirdNumberValue.INSTANCE.AudioAttributesCompatParcelizer());
        long read = getarraybuilders.getRead();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (read >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) read);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = z ? 1.0f : 0.0f;
        float f2 = fIntBitsToFloat3 * f;
        float f3 = (int) (j >> 32);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) j2) * f;
        float f4 = (int) j;
        boolean z2 = fIntBitsToFloat < (-f2);
        return (fIntBitsToFloat > f3 + f2) | z2 | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > f4 + fIntBitsToFloat4);
    }
}
