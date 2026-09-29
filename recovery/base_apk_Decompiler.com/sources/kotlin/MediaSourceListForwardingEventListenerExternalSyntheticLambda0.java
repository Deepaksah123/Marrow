package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSourceListForwardingEventListenerExternalSyntheticLambda0 implements setAdPositionMs {
    @Override // kotlin.setAdPositionMs
    public final boolean IconCompatParcelizer(Context context, Bundle bundle, int i) {
        String string = bundle.getString("actionId");
        String string2 = bundle.getString("pt_dismiss_on_click");
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) bundle.getParcelable(PaymentConstants.Category.CONFIG);
        if (string2 == null || !string2.equalsIgnoreCase("true")) {
            return false;
        }
        if (string != null && string.contains("remind")) {
            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(context, cleverTapInstanceConfig, bundle);
        }
        MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(context, i);
        return true;
    }

    @Override // kotlin.setCurrentAd
    public final boolean RemoteActionCompatParcelizer(Context context, Bundle bundle, String str) {
        try {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
            ((PlayerTimelineChangeReason) Objects.requireNonNull(PlayerTimelineChangeReason.write(context, getAdState.RemoteActionCompatParcelizer(bundle)))).write(new MediaSourceListForwardingEventListenerExternalSyntheticLambda4(context, bundle), context, bundle);
            return true;
        } catch (Throwable unused) {
            onDrmSessionAcquired.read();
            return true;
        }
    }
}
