package kotlin;

import android.os.Process;
import com.marrow2.ui.video.landing.VideoLandingViewModel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setEndIconDrawable implements MagicModuleSubmissionRequestBody {
    public static int AudioAttributesCompatParcelizer;
    public static int IconCompatParcelizer;
    private /* synthetic */ VideoLandingViewModel RemoteActionCompatParcelizer;

    public /* synthetic */ setEndIconDrawable(VideoLandingViewModel videoLandingViewModel) {
        this.RemoteActionCompatParcelizer = videoLandingViewModel;
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 5914196;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int iMyTid = Process.myTid();
        AudioAttributesCompatParcelizer = iMyTid;
        return iMyTid;
    }

    @Override // kotlin.MagicModuleSubmissionRequestBody
    public final Object invoke(Object obj, Object obj2) {
        return VideoLandingViewModel.onPrepare(this.RemoteActionCompatParcelizer, (String) obj2);
    }
}
