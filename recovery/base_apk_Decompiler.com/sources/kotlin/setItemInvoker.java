package kotlin;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class setItemInvoker {
    public static void AudioAttributesCompatParcelizer(View view, CharSequence charSequence) {
        AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(view, charSequence);
    }

    static class AudioAttributesCompatParcelizer {
        static void RemoteActionCompatParcelizer(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }
}
