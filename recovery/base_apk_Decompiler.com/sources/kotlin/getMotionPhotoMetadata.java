package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
final class getMotionPhotoMetadata extends BroadcastReceiver {
    private /* synthetic */ advancePeekPositionToNextSegment read;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.read.read(context, intent);
    }
}
