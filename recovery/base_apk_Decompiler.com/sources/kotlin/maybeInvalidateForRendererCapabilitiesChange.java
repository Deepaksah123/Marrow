package kotlin;

import android.os.Process;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class maybeInvalidateForRendererCapabilitiesChange implements View.OnClickListener {
    public static int AudioAttributesCompatParcelizer;
    public static int write;
    private /* synthetic */ normalizeUndeterminedLanguageToNull read;

    public /* synthetic */ maybeInvalidateForRendererCapabilitiesChange(normalizeUndeterminedLanguageToNull normalizeundeterminedlanguagetonull) {
        this.read = normalizeundeterminedlanguagetonull;
    }

    public static int write() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 5930500;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        write = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        normalizeUndeterminedLanguageToNull.write(this.read);
    }
}
