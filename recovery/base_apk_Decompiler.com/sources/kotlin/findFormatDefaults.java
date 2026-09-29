package kotlin;

import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public class findFormatDefaults {
    private final Object IconCompatParcelizer;

    private findFormatDefaults(AutofillId autofillId) {
        this.IconCompatParcelizer = autofillId;
    }

    public static findFormatDefaults read(AutofillId autofillId) {
        return new findFormatDefaults(autofillId);
    }

    public AutofillId AudioAttributesCompatParcelizer() {
        return (AutofillId) this.IconCompatParcelizer;
    }
}
