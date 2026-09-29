package kotlin;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public class getDefaultInclusion {
    public static void IconCompatParcelizer(View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            IconCompatParcelizer.IconCompatParcelizer(view, i);
        }
    }

    public static UTF8StreamJsonParser IconCompatParcelizer(View view) {
        ContentCaptureSession contentCaptureSessionIconCompatParcelizer = RemoteActionCompatParcelizer.IconCompatParcelizer(view);
        if (contentCaptureSessionIconCompatParcelizer == null) {
            return null;
        }
        return ConfigOverrides.write(contentCaptureSessionIconCompatParcelizer, view);
    }

    public static findFormatDefaults write(View view) {
        return findFormatDefaults.read(AudioAttributesCompatParcelizer.read(view));
    }

    static class AudioAttributesCompatParcelizer {
        public static AutofillId read(View view) {
            return view.getAutofillId();
        }
    }

    static class RemoteActionCompatParcelizer {
        static ContentCaptureSession IconCompatParcelizer(View view) {
            return view.getContentCaptureSession();
        }
    }

    static class IconCompatParcelizer {
        static void IconCompatParcelizer(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }
}
