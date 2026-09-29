package kotlin;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes4.dex */
public final class getDurationMs implements hasPlayedAdGroup {
    private final TimelinePeriod AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private final CleverTapInstanceConfig read;
    private RendererState write;

    public getDurationMs(TimelinePeriod timelinePeriod, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.IconCompatParcelizer = context;
        this.read = cleverTapInstanceConfig;
        this.AudioAttributesCompatParcelizer = timelinePeriod;
        this.write = RendererState.IconCompatParcelizer(context);
    }

    @Override // kotlin.hasPlayedAdGroup
    public final getAdsId RemoteActionCompatParcelizer() {
        return getAdGroupIndexAfterPositionUs.IconCompatParcelizer;
    }

    @Override // kotlin.hasPlayedAdGroup
    public final boolean write() {
        try {
            if (!generateEventTime.IconCompatParcelizer(this.IconCompatParcelizer)) {
                this.read.read("PushProvider", "FCMGoogle Play services is currently unavailable.");
                return false;
            }
            if (!TextUtils.isEmpty(read())) {
                return true;
            }
            this.read.read("PushProvider", "FCMThe FCM sender ID is not set. Unable to register for FCM.");
            return false;
        } catch (Throwable th) {
            this.read.IconCompatParcelizer("PushProvider", "FCMUnable to register with FCM.", th);
            return false;
        }
    }

    @Override // kotlin.hasPlayedAdGroup
    public final boolean IconCompatParcelizer() {
        return generateEventTime.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    @Override // kotlin.hasPlayedAdGroup
    public final void AudioAttributesCompatParcelizer() {
        try {
            this.read.read("PushProvider", "FCMRequesting FCM token using googleservices.json");
            needsDisableAdaptationWorkaround.RemoteActionCompatParcelizer().IconCompatParcelizer().addOnCompleteListener(new OnCompleteListener<String>() { // from class: o.getDurationMs.2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task<String> task) {
                    if (!task.isSuccessful()) {
                        getDurationMs.this.read.IconCompatParcelizer("PushProvider", "FCMFCM token using googleservices.json failed", task.getException());
                        getDurationMs.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(null, getDurationMs.this.RemoteActionCompatParcelizer());
                    } else {
                        String result = task.getResult() != null ? task.getResult() : null;
                        getDurationMs.this.read.read("PushProvider", "FCMFCM token using googleservices.json - ".concat(String.valueOf(result)));
                        getDurationMs.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(result, getDurationMs.this.RemoteActionCompatParcelizer());
                    }
                }
            });
        } catch (Throwable th) {
            this.read.IconCompatParcelizer("PushProvider", "FCMError requesting FCM token", th);
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(null, RemoteActionCompatParcelizer());
        }
    }

    private static String read() {
        return FirebaseApp.write().read().IconCompatParcelizer();
    }
}
