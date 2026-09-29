package kotlin;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;

/* JADX INFO: loaded from: classes3.dex */
public interface isCodecSupported {
    Task<ReviewInfo> AudioAttributesCompatParcelizer();

    Task<Void> RemoteActionCompatParcelizer(Activity activity, ReviewInfo reviewInfo);
}
