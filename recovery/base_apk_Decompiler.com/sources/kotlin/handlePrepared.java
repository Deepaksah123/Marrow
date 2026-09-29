package kotlin;

import android.content.Context;
import kotlin.getStartPositionRendererTime;

/* JADX INFO: loaded from: classes2.dex */
public final class handlePrepared implements getRendererOffset {
    @Override // kotlin.getRendererOffset
    public final getStartPositionRendererTime read(Context context, getStartPositionRendererTime.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (_isNaN.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            return new selectTracks(context, audioAttributesCompatParcelizer);
        }
        return new MediaPeriodInfo();
    }
}
