package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "p0", "", "p1", "p2", "Lo/addBeanSerializerModifier;", "AudioAttributesCompatParcelizer", "(FZZ)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class addSerializers {
    static /* synthetic */ long AudioAttributesCompatParcelizer$default(float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return AudioAttributesCompatParcelizer(f, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesCompatParcelizer(float f, boolean z, boolean z2) {
        long j = -1;
        return addBeanSerializerModifier.RemoteActionCompatParcelizer((((z ? 1L : 0L) | (z2 ? 2L : 0L)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f)) << 32));
    }
}
