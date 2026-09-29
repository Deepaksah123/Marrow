package kotlin;

import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ConfigOverrides implements UTF8StreamJsonParser {
    private final Object AudioAttributesCompatParcelizer;
    private final View write;

    public static ConfigOverrides write(ContentCaptureSession contentCaptureSession, View view) {
        return new ConfigOverrides(contentCaptureSession, view);
    }

    private ConfigOverrides(ContentCaptureSession contentCaptureSession, View view) {
        this.AudioAttributesCompatParcelizer = contentCaptureSession;
        this.write = view;
    }

    @Override // kotlin.UTF8StreamJsonParser
    public AutofillId AudioAttributesCompatParcelizer(long j) {
        return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((ContentCaptureSession) this.AudioAttributesCompatParcelizer, ((findFormatDefaults) Objects.requireNonNull(getDefaultInclusion.write(this.write))).AudioAttributesCompatParcelizer(), j);
    }

    @Override // kotlin.UTF8StreamJsonParser
    public findOverride RemoteActionCompatParcelizer(AutofillId autofillId, long j) {
        return findOverride.IconCompatParcelizer(RemoteActionCompatParcelizer.write((ContentCaptureSession) this.AudioAttributesCompatParcelizer, autofillId, j));
    }

    @Override // kotlin.UTF8StreamJsonParser
    public void RemoteActionCompatParcelizer(ViewStructure viewStructure) {
        RemoteActionCompatParcelizer.IconCompatParcelizer((ContentCaptureSession) this.AudioAttributesCompatParcelizer, viewStructure);
    }

    @Override // kotlin.UTF8StreamJsonParser
    public void write(AutofillId autofillId) {
        RemoteActionCompatParcelizer.IconCompatParcelizer((ContentCaptureSession) this.AudioAttributesCompatParcelizer, autofillId);
    }

    @Override // kotlin.UTF8StreamJsonParser
    public void read() {
        RemoteActionCompatParcelizer.IconCompatParcelizer((ContentCaptureSession) this.AudioAttributesCompatParcelizer, ((findFormatDefaults) Objects.requireNonNull(getDefaultInclusion.write(this.write))).AudioAttributesCompatParcelizer(), new long[]{Long.MIN_VALUE});
    }

    @Override // kotlin.UTF8StreamJsonParser
    public void read(AutofillId autofillId, CharSequence charSequence) {
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((ContentCaptureSession) this.AudioAttributesCompatParcelizer, autofillId, charSequence);
    }

    static class RemoteActionCompatParcelizer {
        static void IconCompatParcelizer(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        static void IconCompatParcelizer(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        static void IconCompatParcelizer(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static ViewStructure write(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        static AutofillId AudioAttributesCompatParcelizer(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static void AudioAttributesCompatParcelizer(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }
    }
}
