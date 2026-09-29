package kotlin;

import android.content.Context;
import android.text.TextUtils;
import com.marrow.R;
import kotlin.Metadata;
import kotlin.getBitrateEstimate;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/updateRepeatModeButton;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "write", "(Landroid/content/Context;)Z", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)I", "(Landroid/content/Context;)I", "", "p1", "RemoteActionCompatParcelizer", "(IJ)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class updateRepeatModeButton {
    public static final updateRepeatModeButton INSTANCE = new updateRepeatModeButton();

    private updateRepeatModeButton() {
    }

    @getMagicModuleMeta
    public static final boolean write(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @getMagicModuleMeta
    public static final int AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.length() == 0) {
            return 0;
        }
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(p0, "+")) {
            p0 = p0.substring(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(p0, "");
        }
        String str = p0;
        if (str.length() == 0 || !TextUtils.isDigitsOnly(str)) {
            return 0;
        }
        return Integer.parseInt(p0);
    }

    public static int AudioAttributesCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strRemoteActionCompatParcelizer = updateButton.RemoteActionCompatParcelizer(p0);
        String[] stringArray = p0.getResources().getStringArray(R.array.CountryCodes);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stringArray, "");
        for (String str : stringArray) {
            toMagicModuleMetaRepoModel.write((Object) str);
            String[] strArr = (String[]) new newYearNameItem(",").read(str).toArray(new String[0]);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strArr[1], (Object) strRemoteActionCompatParcelizer)) {
                Integer numValueOf = Integer.valueOf(strArr[0]);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(numValueOf, "");
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    @getMagicModuleMeta
    public static final boolean RemoteActionCompatParcelizer(int p0, long p1) {
        return getSelectedIndex.IconCompatParcelizer().AudioAttributesCompatParcelizer(new getBitrateEstimate.read().AudioAttributesCompatParcelizer(p0).RemoteActionCompatParcelizer(p1));
    }
}
