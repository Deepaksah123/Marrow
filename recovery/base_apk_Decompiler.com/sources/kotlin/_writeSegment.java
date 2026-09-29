package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/_handleOddName;", "Lo/assignParameter;", "p0", "Lo/findAndAddVirtualProperties;", "p1", "", "p2", "Lo/switchToNext;", "p3", "p4", "IconCompatParcelizer", "(Lo/_handleOddName;FLo/findAndAddVirtualProperties;ZJJ)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _writeSegment {
    public static /* synthetic */ _handleOddName IconCompatParcelizer$default(_handleOddName _handleoddname, float f, findAndAddVirtualProperties findandaddvirtualproperties, boolean z, long j, long j2, int i, Object obj) {
        boolean z2;
        findAndAddVirtualProperties findandaddvirtualproperties2 = (i & 2) != 0 ? parseVersion.read() : findandaddvirtualproperties;
        if ((i & 4) != 0) {
            z2 = assignParameter.write(f, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) > 0;
        } else {
            z2 = z;
        }
        return IconCompatParcelizer(_handleoddname, f, findandaddvirtualproperties2, z2, (i & 8) != 0 ? contentsAsArray.AudioAttributesCompatParcelizer() : j, (i & 16) != 0 ? contentsAsArray.AudioAttributesCompatParcelizer() : j2);
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, float f, findAndAddVirtualProperties findandaddvirtualproperties, boolean z, long j, long j2) {
        return (assignParameter.write(f, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)) > 0 || z) ? _handleoddname.AudioAttributesCompatParcelizer(new _writeString2(f, findandaddvirtualproperties, z, j, j2, null)) : _handleoddname;
    }
}
