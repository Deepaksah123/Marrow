package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getReferencedType;", "Lo/WritableTypeIdInclusion;", "p0", "AudioAttributesCompatParcelizer", "(JLo/WritableTypeIdInclusion;)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class notifyDataSetChanged {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesCompatParcelizer(long j, WritableTypeIdInclusion writableTypeIdInclusion) {
        float write;
        float iconCompatParcelizer;
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) < writableTypeIdInclusion.getAudioAttributesCompatParcelizer()) {
            write = writableTypeIdInclusion.getAudioAttributesCompatParcelizer();
        } else {
            write = Float.intBitsToFloat(i) > writableTypeIdInclusion.getWrite() ? writableTypeIdInclusion.getWrite() : Float.intBitsToFloat(i);
        }
        int i2 = (int) j;
        if (Float.intBitsToFloat(i2) < writableTypeIdInclusion.getRemoteActionCompatParcelizer()) {
            iconCompatParcelizer = writableTypeIdInclusion.getRemoteActionCompatParcelizer();
        } else {
            iconCompatParcelizer = Float.intBitsToFloat(i2) > writableTypeIdInclusion.getIconCompatParcelizer() ? writableTypeIdInclusion.getIconCompatParcelizer() : Float.intBitsToFloat(i2);
        }
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(write)) << 32) | (((long) Float.floatToRawIntBits(iconCompatParcelizer)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }
}
