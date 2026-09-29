package kotlin;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class readUint {
    private static final getCurrentTrack RemoteActionCompatParcelizer = new getCurrentTrack("ReviewService");
    assertOutputInitialized AudioAttributesCompatParcelizer;
    private final String write;

    public readUint(Context context) {
        this.write = context.getPackageName();
        if (parseMsAcmCodecPrivate.read(context)) {
            this.AudioAttributesCompatParcelizer = new assertOutputInitialized(context, RemoteActionCompatParcelizer, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), parseVorbisCodecPrivate.AudioAttributesCompatParcelizer);
        }
    }

    public final Task IconCompatParcelizer() {
        getCurrentTrack getcurrenttrack = RemoteActionCompatParcelizer;
        getcurrenttrack.read("requestInAppReview (%s)", this.write);
        if (this.AudioAttributesCompatParcelizer == null) {
            getcurrenttrack.RemoteActionCompatParcelizer(new Object[0]);
            return Tasks.forException(new maybeSeekForCues());
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(new VarintReader(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
