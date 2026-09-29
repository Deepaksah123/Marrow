package kotlin;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class samplesHaveSupplementalData implements isCodecSupported {
    private final readUint read;
    private final Handler write = new Handler(Looper.getMainLooper());

    public samplesHaveSupplementalData(readUint readuint) {
        this.read = readuint;
    }

    @Override // kotlin.isCodecSupported
    public final Task<ReviewInfo> AudioAttributesCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    @Override // kotlin.isCodecSupported
    public final Task<Void> RemoteActionCompatParcelizer(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.read()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) assertInTrackEntry.class);
        intent.putExtra("confirmation_intent", reviewInfo.RemoteActionCompatParcelizer());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this.write, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }
}
