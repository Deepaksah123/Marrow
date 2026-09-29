package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "p0", "p1", "p2", "p3", "Lo/withNulls;", "IconCompatParcelizer", "(IIII)J", "Lo/assignParameter;", "Lo/addKeyDeserializers;", "RemoteActionCompatParcelizer", "(FFFF)Lo/addKeyDeserializers;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PropertyMetadataMergeInfo {
    public static /* synthetic */ long IconCompatParcelizer$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return IconCompatParcelizer(i, i2, i3, i4);
    }

    public static final addKeyDeserializers RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
        return new addKeyDeserializers(f, f2, f3, f4, true, null);
    }

    public static final long IconCompatParcelizer(int i, int i2, int i3, int i4) {
        if (i < 0 || i >= 32768) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("Start must be in the range of 0 .. 32767");
        }
        if (i2 < 0 || i2 >= 32768) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("Top must be in the range of 0 .. 32767");
        }
        if (i3 < 0 || i3 >= 32768) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("End must be in the range of 0 .. 32767");
        }
        if (i4 < 0 || i4 >= 32768) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("Bottom must be in the range of 0 .. 32767");
        }
        return withNulls.IconCompatParcelizer(withNulls.INSTANCE.IconCompatParcelizer(i, i2, i3, i4, true));
    }
}
