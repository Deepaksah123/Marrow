package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lo/isAbstract;", "Lo/WritableTypeIdInclusion;", "read", "(Lo/isAbstract;)Lo/WritableTypeIdInclusion;", "Lo/getReferencedType;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/WritableTypeIdInclusion;J)Z", "RemoteActionCompatParcelizer", "Lo/WritableTypeIdInclusion;", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setItemSpacingDp {
    private static final WritableTypeIdInclusion RemoteActionCompatParcelizer = new WritableTypeIdInclusion(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final WritableTypeIdInclusion read(isAbstract isabstract) {
        WritableTypeIdInclusion writableTypeIdInclusionAudioAttributesCompatParcelizer$default = hasRawClass.AudioAttributesCompatParcelizer$default(isabstract, false, 1, null);
        return BufferRecycler.IconCompatParcelizer(isabstract.AudioAttributesImplBaseParcelizer(writableTypeIdInclusionAudioAttributesCompatParcelizer$default.AudioAttributesImplBaseParcelizer()), isabstract.AudioAttributesImplBaseParcelizer(writableTypeIdInclusionAudioAttributesCompatParcelizer$default.AudioAttributesCompatParcelizer()));
    }

    public static final boolean AudioAttributesCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, long j) {
        float audioAttributesCompatParcelizer = writableTypeIdInclusion.getAudioAttributesCompatParcelizer();
        float write = writableTypeIdInclusion.getWrite();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (audioAttributesCompatParcelizer > fIntBitsToFloat || fIntBitsToFloat > write) {
            return false;
        }
        float remoteActionCompatParcelizer = writableTypeIdInclusion.getRemoteActionCompatParcelizer();
        float iconCompatParcelizer = writableTypeIdInclusion.getIconCompatParcelizer();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
        return remoteActionCompatParcelizer <= fIntBitsToFloat2 && fIntBitsToFloat2 <= iconCompatParcelizer;
    }
}
