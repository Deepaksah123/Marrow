package kotlin;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0001\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0001\u0010\t\u001a)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/_handleOddName;", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;)Lo/_handleOddName;", "Lo/_handleOddName$IconCompatParcelizer;", "Landroid/view/View;", "RemoteActionCompatParcelizer", "(Lo/_handleOddName$IconCompatParcelizer;)Landroid/view/View;", "p0", "", "(Landroid/view/View;Landroid/view/View;)Z", "Lo/nukeSymbols;", "p1", "p2", "Landroid/graphics/Rect;", "IconCompatParcelizer", "(Lo/nukeSymbols;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _createWithMerge {
    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname) {
        return createRoot.read(_handleoddname.AudioAttributesCompatParcelizer(_shouldMerge.INSTANCE)).AudioAttributesCompatParcelizer(_fromBigDecimal.INSTANCE).AudioAttributesCompatParcelizer(BaseNodeDeserializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View RemoteActionCompatParcelizer(_handleOddName.IconCompatParcelizer iconCompatParcelizer) {
        View viewOnSetCaptioningEnabled = collectLongDefaults.AudioAttributesImplApi26Parcelizer(iconCompatParcelizer.getRead()).onSetCaptioningEnabled();
        if (viewOnSetCaptioningEnabled != null) {
            return viewOnSetCaptioningEnabled;
        }
        throw new IllegalStateException("Could not fetch interop view".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect IconCompatParcelizer(nukeSymbols nukesymbols, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        WritableTypeIdInclusion writableTypeIdInclusionWrite = nukesymbols.write();
        if (writableTypeIdInclusionWrite == null) {
            return null;
        }
        int audioAttributesCompatParcelizer = (int) writableTypeIdInclusionWrite.getAudioAttributesCompatParcelizer();
        int i = iArr[0];
        int i2 = iArr2[0];
        int remoteActionCompatParcelizer = (int) writableTypeIdInclusionWrite.getRemoteActionCompatParcelizer();
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int write = (int) writableTypeIdInclusionWrite.getWrite();
        int i5 = iArr[0];
        return new Rect((audioAttributesCompatParcelizer + i) - i2, (remoteActionCompatParcelizer + i3) - i4, (write + i5) - iArr2[0], (((int) writableTypeIdInclusionWrite.getIconCompatParcelizer()) + iArr[1]) - iArr2[1]);
    }
}
