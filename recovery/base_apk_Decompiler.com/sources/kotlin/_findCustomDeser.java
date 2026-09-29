package kotlin;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class _findCustomDeser {

    public interface AudioAttributesCompatParcelizer {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean read(View view, KeyEvent keyEvent) {
        return InvalidTypeIdException.write(view, keyEvent);
    }

    public static boolean IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, KeyEvent keyEvent) {
        if (audioAttributesCompatParcelizer == null) {
            return false;
        }
        return audioAttributesCompatParcelizer.superDispatchKeyEvent(keyEvent);
    }
}
