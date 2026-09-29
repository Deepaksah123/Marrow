package kotlin;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes5.dex */
public final class checkAndReadBlockSizeSamples extends onRequestPermissionsResult {
    public checkAndReadBlockSizeSamples(Context context) {
        super(context);
    }

    @Override // kotlin.onRequestPermissionsResult, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = (onRetainNonConfigurationInstance) write(i, i2, i3, charSequence);
        checkAndReadFirstSampleNumber checkandreadfirstsamplenumber = new checkAndReadFirstSampleNumber(IconCompatParcelizer(), this, onretainnonconfigurationinstance);
        onretainnonconfigurationinstance.RemoteActionCompatParcelizer(checkandreadfirstsamplenumber);
        return checkandreadfirstsamplenumber;
    }
}
