package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "<init>", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isShimmerVisible {
    public static final isShimmerVisible IconCompatParcelizer = new isShimmerVisible();

    private isShimmerVisible() {
    }

    public final onDetachedFromWindow write(float f, float f2, float f3, float f4, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = assignParameter.IconCompatParcelizer(6.0f);
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = assignParameter.IconCompatParcelizer(12.0f);
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = assignParameter.IconCompatParcelizer(8.0f);
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = assignParameter.IconCompatParcelizer(8.0f);
        }
        float f8 = f4;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(380403812, i, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f5)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f6)) || (i & 48) == 32;
        boolean z3 = (((i & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f7)) || (i & RendererCapabilities.MODE_SUPPORT_MASK) == 256;
        boolean z4 = (((i & 7168) ^ 3072) > 2048 && _handleunrecognizedcharacterescape.IconCompatParcelizer(f8)) || (i & 3072) == 2048;
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z | z2 | z3 | z4) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new Shimmer(f5, f6, f7, f8, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        Shimmer shimmer = (Shimmer) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return shimmer;
    }
}
