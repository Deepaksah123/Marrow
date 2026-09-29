package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/resetWithShared;", "", "RemoteActionCompatParcelizer", "([F)I", "Lo/hasReferringProperties;", "", "write", "(J)Z", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class shouldSortPropertiesAlphabetically {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(long j) {
        return !hasReferringProperties.write(j, hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == BitmapDescriptorFactory.HUE_RED && fArr[2] == BitmapDescriptorFactory.HUE_RED && fArr[4] == BitmapDescriptorFactory.HUE_RED && fArr[5] == 1.0f && fArr[6] == BitmapDescriptorFactory.HUE_RED && fArr[8] == BitmapDescriptorFactory.HUE_RED && fArr[9] == BitmapDescriptorFactory.HUE_RED && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == BitmapDescriptorFactory.HUE_RED && fArr[13] == BitmapDescriptorFactory.HUE_RED && fArr[14] == BitmapDescriptorFactory.HUE_RED && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }
}
