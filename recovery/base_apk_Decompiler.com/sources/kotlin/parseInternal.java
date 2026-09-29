package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class parseInternal extends advancePeekPositionToNextSegment {
    public parseInternal(Context context) {
        super(new JpegExtractor("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // kotlin.advancePeekPositionToNextSegment
    public final void read(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.RemoteActionCompatParcelizer.read("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.RemoteActionCompatParcelizer.read("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.RemoteActionCompatParcelizer.read("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        assertInCues assertincuesIconCompatParcelizer = assertInCues.IconCompatParcelizer(intent, this.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer.read("ListenerRegistryBroadcastReceiver.onReceive: %s", assertincuesIconCompatParcelizer);
        write(assertincuesIconCompatParcelizer);
    }
}
