package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;

/* JADX INFO: loaded from: classes.dex */
public interface lambdaupdateStateAndInformListeners54 {
    void AudioAttributesCompatParcelizer(CTInAppNotification cTInAppNotification, Bundle bundle);

    Bundle RemoteActionCompatParcelizer(CTInAppNotification cTInAppNotification, CTInAppAction cTInAppAction, String str, Bundle bundle, Context context);

    Bundle read(CTInAppNotification cTInAppNotification, CTInAppNotificationButton cTInAppNotificationButton, Context context);

    void read(CTInAppNotification cTInAppNotification, Bundle bundle);
}
