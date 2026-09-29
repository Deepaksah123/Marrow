package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/setShowFastForwardButton;", "Lo/setPlayedColor;", "Lo/setUnplayedColor;", "p0", "p1", "p2", "p3", "<init>", "(Lo/setUnplayedColor;Lo/setUnplayedColor;Lo/setUnplayedColor;Lo/setUnplayedColor;)V", "Lo/calloc;", "", "p4", "Lo/tryToResolveUnresolved;", "p5", "Lo/resetWithString;", "AudioAttributesCompatParcelizer", "(JFFFFLo/tryToResolveUnresolved;)Lo/resetWithString;", "write", "(Lo/setUnplayedColor;Lo/setUnplayedColor;Lo/setUnplayedColor;Lo/setUnplayedColor;)Lo/setShowFastForwardButton;", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setShowFastForwardButton extends setPlayedColor {
    public setShowFastForwardButton(setUnplayedColor setunplayedcolor, setUnplayedColor setunplayedcolor2, setUnplayedColor setunplayedcolor3, setUnplayedColor setunplayedcolor4) {
        super(setunplayedcolor, setunplayedcolor2, setunplayedcolor3, setunplayedcolor4);
    }

    @Override // kotlin.setPlayedColor
    public final resetWithString AudioAttributesCompatParcelizer(long p0, float p1, float p2, float p3, float p4, tryToResolveUnresolved p5) {
        if (p1 + p2 + p3 + p4 == BitmapDescriptorFactory.HUE_RED) {
            return new resetWithString.read(allocCharBuffer.IconCompatParcelizer(p0));
        }
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer = allocCharBuffer.IconCompatParcelizer(p0);
        float f = p5 == tryToResolveUnresolved.write ? p1 : p2;
        long j = -1;
        long jAudioAttributesCompatParcelizer = TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        float f2 = p5 != tryToResolveUnresolved.write ? p1 : p2;
        long j2 = -1;
        long jAudioAttributesCompatParcelizer2 = TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f2)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f2)) << 32));
        float f3 = p5 == tryToResolveUnresolved.write ? p3 : p4;
        long j3 = -1;
        long jAudioAttributesCompatParcelizer3 = TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f3)) & ((j3 - ((j3 >> 63) << 32)) | (((long) 0) << 32))) | (((long) Float.floatToRawIntBits(f3)) << 32));
        float f4 = p5 != tryToResolveUnresolved.write ? p3 : p4;
        long j4 = -1;
        return new resetWithString.RemoteActionCompatParcelizer(allocByteBuffer.RemoteActionCompatParcelizer(writableTypeIdInclusionIconCompatParcelizer, jAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer2, jAudioAttributesCompatParcelizer3, TypeReference.AudioAttributesCompatParcelizer((((j4 - ((j4 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(f4))) | (((long) Float.floatToRawIntBits(f4)) << 32))));
    }

    @Override // kotlin.setPlayedColor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final setShowFastForwardButton read(setUnplayedColor p0, setUnplayedColor p1, setUnplayedColor p2, setUnplayedColor p3) {
        return new setShowFastForwardButton(p0, p1, p2, p3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerShape(topStart = ");
        sb.append(getAudioAttributesCompatParcelizer());
        sb.append(", topEnd = ");
        sb.append(getWrite());
        sb.append(", bottomEnd = ");
        sb.append(getRead());
        sb.append(", bottomStart = ");
        sb.append(getIconCompatParcelizer());
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setShowFastForwardButton)) {
            return false;
        }
        setShowFastForwardButton setshowfastforwardbutton = (setShowFastForwardButton) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer(), setshowfastforwardbutton.getAudioAttributesCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getWrite(), setshowfastforwardbutton.getWrite()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getRead(), setshowfastforwardbutton.getRead()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getIconCompatParcelizer(), setshowfastforwardbutton.getIconCompatParcelizer());
    }

    public final int hashCode() {
        int iHashCode = getAudioAttributesCompatParcelizer().hashCode();
        return (((((iHashCode * 31) + getWrite().hashCode()) * 31) + getRead().hashCode()) * 31) + getIconCompatParcelizer().hashCode();
    }
}
