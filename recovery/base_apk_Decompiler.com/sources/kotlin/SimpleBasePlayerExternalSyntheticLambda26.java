package kotlin;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SimpleBasePlayerExternalSyntheticLambda26 implements MagicModuleSubmissionRequestBody {
    public static int IconCompatParcelizer;
    public static int write;

    public static int AudioAttributesCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 8287714;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        write = i3;
        return i3;
    }

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final Object invoke(Object obj, Object obj2) {
        return SimpleBasePlayerExternalSyntheticLambda29.write((_verifyEndArrayForSingle) obj, (ViewGroup.MarginLayoutParams) obj2);
    }
}
