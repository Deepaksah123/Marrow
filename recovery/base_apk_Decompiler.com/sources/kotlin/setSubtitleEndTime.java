package kotlin;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setSubtitleEndTime extends readScratch implements scaleTimecodeToUs {
    public static scaleTimecodeToUs write(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface instanceof scaleTimecodeToUs ? (scaleTimecodeToUs) iInterfaceQueryLocalInterface : new resetWriteSampleData(iBinder);
    }
}
