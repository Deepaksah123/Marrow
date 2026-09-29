package kotlin;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class hasReadingPeriodFinishedReading implements handlePlaybackParameters {
    @Override // kotlin.handlePlaybackParameters
    public final handlePositionDiscontinuity write(Context context) {
        if (context == null || setEncoderPadding.AudioAttributesCompatParcelizer(context) != BitmapDescriptorFactory.HUE_RED) {
            return handlePositionDiscontinuity.STANDARD_MOTION;
        }
        return handlePositionDiscontinuity.REDUCED_MOTION;
    }
}
