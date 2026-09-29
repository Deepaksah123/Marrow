package kotlin;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.zza;

/* JADX INFO: loaded from: classes3.dex */
final class parseUnsignedVarintLength extends assembleVarint {
    private String AudioAttributesCompatParcelizer;

    parseUnsignedVarintLength(readUint readuint, TaskCompletionSource taskCompletionSource, String str) {
        super(readuint, new getCurrentTrack("OnRequestInstallCallback"), taskCompletionSource);
        this.AudioAttributesCompatParcelizer = str;
    }

    @Override // kotlin.assembleVarint, kotlin.writeToOutput
    public final void RemoteActionCompatParcelizer(Bundle bundle) throws RemoteException {
        super.RemoteActionCompatParcelizer(bundle);
        this.IconCompatParcelizer.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
