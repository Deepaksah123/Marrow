package kotlin;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;

/* JADX INFO: loaded from: classes3.dex */
public final class outputPendingSampleMetadata {
    public static final boolean write = true;
    private static final int[] RemoteActionCompatParcelizer = {R.attr.state_pressed};
    private static final int[] read = {R.attr.state_hovered, R.attr.state_focused};
    private static final int[] AudioAttributesCompatParcelizer = {R.attr.state_focused};
    private static final int[] IconCompatParcelizer = {R.attr.state_hovered};
    private static final int[] AudioAttributesImplBaseParcelizer = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] MediaBrowserCompatCustomActionResultReceiver = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
    private static final int[] MediaBrowserCompatItemReceiver = {R.attr.state_selected, R.attr.state_focused};
    private static final int[] AudioAttributesImplApi26Parcelizer = {R.attr.state_selected, R.attr.state_hovered};
    private static final int[] AudioAttributesImplApi21Parcelizer = {R.attr.state_selected};

    public static ColorStateList read(ColorStateList colorStateList) {
        if (write) {
            int[] iArr = AudioAttributesImplApi21Parcelizer;
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(colorStateList, AudioAttributesImplBaseParcelizer);
            int[] iArr2 = AudioAttributesCompatParcelizer;
            return new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iAudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer(colorStateList, iArr2), AudioAttributesCompatParcelizer(colorStateList, RemoteActionCompatParcelizer)});
        }
        int[] iArr3 = AudioAttributesImplBaseParcelizer;
        int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(colorStateList, iArr3);
        int[] iArr4 = MediaBrowserCompatCustomActionResultReceiver;
        int iAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(colorStateList, iArr4);
        int[] iArr5 = MediaBrowserCompatItemReceiver;
        int iAudioAttributesCompatParcelizer4 = AudioAttributesCompatParcelizer(colorStateList, iArr5);
        int[] iArr6 = AudioAttributesImplApi26Parcelizer;
        int iAudioAttributesCompatParcelizer5 = AudioAttributesCompatParcelizer(colorStateList, iArr6);
        int[] iArr7 = AudioAttributesImplApi21Parcelizer;
        int[] iArr8 = RemoteActionCompatParcelizer;
        int iAudioAttributesCompatParcelizer6 = AudioAttributesCompatParcelizer(colorStateList, iArr8);
        int[] iArr9 = read;
        int iAudioAttributesCompatParcelizer7 = AudioAttributesCompatParcelizer(colorStateList, iArr9);
        int[] iArr10 = AudioAttributesCompatParcelizer;
        int iAudioAttributesCompatParcelizer8 = AudioAttributesCompatParcelizer(colorStateList, iArr10);
        int[] iArr11 = IconCompatParcelizer;
        return new ColorStateList(new int[][]{iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, StateSet.NOTHING}, new int[]{iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer4, iAudioAttributesCompatParcelizer5, 0, iAudioAttributesCompatParcelizer6, iAudioAttributesCompatParcelizer7, iAudioAttributesCompatParcelizer8, AudioAttributesCompatParcelizer(colorStateList, iArr11), 0});
    }

    public static ColorStateList RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static boolean read(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    private static int AudioAttributesCompatParcelizer(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return write ? IconCompatParcelizer(colorForState) : colorForState;
    }

    private static int IconCompatParcelizer(int i) {
        return _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i, Math.min(Color.alpha(i) << 1, 255));
    }
}
