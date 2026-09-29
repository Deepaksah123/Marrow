package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonMaxSeekToPreviousPositionChanged47 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(intent, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", (Object) intent.getAction()) && lambdaonMediaMetadataChanged48.onAddQueueItem()) {
            lambdaonLoadError26.INSTANCE.read().IconCompatParcelizer();
        }
    }
}
