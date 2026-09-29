package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JI\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/performDestroy;", "", "Lo/_handleOddName;", "Lo/SwitchCompat;", "", "p0", "Lo/hasReferringProperties;", "p1", "p2", "read", "(Lo/_handleOddName;Lo/SwitchCompat;Lo/SwitchCompat;Lo/SwitchCompat;)Lo/_handleOddName;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface performDestroy {
    default _handleOddName read(_handleOddName _handleoddname, SwitchCompat<Float> switchCompat, SwitchCompat<hasReferringProperties> switchCompat2, SwitchCompat<Float> switchCompat3) {
        return _handleoddname;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ _handleOddName read$default(performDestroy performdestroy, _handleOddName _handleoddname, SwitchCompat switchCompat, SwitchCompat switchCompat2, SwitchCompat switchCompat3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
        }
        if ((i & 1) != 0) {
            switchCompat = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            switchCompat2 = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, hasReferringProperties.write(setInvalidated.RemoteActionCompatParcelizer(hasReferringProperties.INSTANCE)), 1, null);
        }
        if ((i & 4) != 0) {
            switchCompat3 = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null);
        }
        return performdestroy.read(_handleoddname, switchCompat, switchCompat2, switchCompat3);
    }
}
