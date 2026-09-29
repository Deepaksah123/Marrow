package kotlin;

import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
public final class getDecryptionDataProvider {
    public static final boolean AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition) {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        try {
            resetCurrentSelectedPosition resetcurrentselectedposition2 = new resetCurrentSelectedPosition();
            resetcurrentselectedposition.write(resetcurrentselectedposition2, 0L, getQues.AudioAttributesCompatParcelizer(resetcurrentselectedposition.getSize(), 64L));
            int i = 0;
            while (i < 16) {
                i++;
                if (resetcurrentselectedposition2.MediaBrowserCompatCustomActionResultReceiver()) {
                    return true;
                }
                int iOnFastForward = resetcurrentselectedposition2.onFastForward();
                if (Character.isISOControl(iOnFastForward) && !Character.isWhitespace(iOnFastForward)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
