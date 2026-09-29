package kotlin;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotatedClassCreators {
    @Deprecated
    public static void read(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }

    public static void read(PopupWindow popupWindow, boolean z) {
        AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(popupWindow, z);
    }

    public static void RemoteActionCompatParcelizer(PopupWindow popupWindow, int i) {
        AudioAttributesCompatParcelizer.read(popupWindow, i);
    }

    static class AudioAttributesCompatParcelizer {
        static void AudioAttributesCompatParcelizer(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        static void read(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }
}
