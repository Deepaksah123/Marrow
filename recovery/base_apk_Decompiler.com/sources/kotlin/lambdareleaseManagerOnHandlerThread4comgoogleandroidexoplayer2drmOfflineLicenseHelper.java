package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import kotlin.ExoMediaDrmProvider;

/* JADX INFO: loaded from: classes5.dex */
public class lambdareleaseManagerOnHandlerThread4comgoogleandroidexoplayer2drmOfflineLicenseHelper extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        addLaUrlAttributeIfMissing.AudioAttributesCompatParcelizer(context);
        ExoMediaDrmProvider.RemoteActionCompatParcelizer remoteActionCompatParcelizer = ExoMediaDrmProvider.read().write(queryParameter).read(markSeekOperationFinished.RemoteActionCompatParcelizer(iIntValue));
        if (queryParameter2 != null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(Base64.decode(queryParameter2, 0));
        }
        addLaUrlAttributeIfMissing.AudioAttributesCompatParcelizer().IconCompatParcelizer().write(remoteActionCompatParcelizer.RemoteActionCompatParcelizer(), i, new Runnable() { // from class: o.lambdaacquireFirstSessionOnHandlerThread3comgoogleandroidexoplayer2drmOfflineLicenseHelper
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
