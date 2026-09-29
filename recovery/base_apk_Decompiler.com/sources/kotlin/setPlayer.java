package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\t\u001a5\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\r\"\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/setUnplayedColor;", "p0", "Lo/setShowFastForwardButton;", "AudioAttributesCompatParcelizer", "(Lo/setUnplayedColor;)Lo/setShowFastForwardButton;", "Lo/assignParameter;", "RemoteActionCompatParcelizer", "(F)Lo/setShowFastForwardButton;", "", "(I)Lo/setShowFastForwardButton;", "p1", "p2", "p3", "(FFFF)Lo/setShowFastForwardButton;", "Lo/setShowFastForwardButton;", "IconCompatParcelizer", "()Lo/setShowFastForwardButton;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setPlayer {
    private static final setShowFastForwardButton RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(50);

    public static final setShowFastForwardButton IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static final setShowFastForwardButton AudioAttributesCompatParcelizer(setUnplayedColor setunplayedcolor) {
        return new setShowFastForwardButton(setunplayedcolor, setunplayedcolor, setunplayedcolor, setunplayedcolor);
    }

    public static final setShowFastForwardButton RemoteActionCompatParcelizer(float f) {
        return AudioAttributesCompatParcelizer(LegacyPlayerControlView.IconCompatParcelizer(f));
    }

    public static final setShowFastForwardButton RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer(LegacyPlayerControlView.RemoteActionCompatParcelizer(i));
    }

    public static final setShowFastForwardButton AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
        return new setShowFastForwardButton(LegacyPlayerControlView.IconCompatParcelizer(f), LegacyPlayerControlView.IconCompatParcelizer(f2), LegacyPlayerControlView.IconCompatParcelizer(f3), LegacyPlayerControlView.IconCompatParcelizer(f4));
    }

    public static /* synthetic */ setShowFastForwardButton AudioAttributesCompatParcelizer$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 2) != 0) {
            f2 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 4) != 0) {
            f3 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        if ((i & 8) != 0) {
            f4 = assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        }
        return AudioAttributesCompatParcelizer(f, f2, f3, f4);
    }
}
