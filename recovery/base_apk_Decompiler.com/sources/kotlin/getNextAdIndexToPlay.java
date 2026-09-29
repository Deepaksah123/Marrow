package kotlin;

import android.os.Bundle;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getNextAdIndexToPlay implements setContentBufferedPositionMs<RemoteMessage> {
    @Override // kotlin.setContentBufferedPositionMs
    public final /* synthetic */ Bundle AudioAttributesCompatParcelizer(RemoteMessage remoteMessage) {
        return write(remoteMessage);
    }

    public static Bundle write(RemoteMessage remoteMessage) {
        try {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : remoteMessage.IconCompatParcelizer().entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            return bundle;
        } catch (Throwable th) {
            th.printStackTrace();
            RendererWakeupListener.AudioAttributesImplApi26Parcelizer();
            return null;
        }
    }
}
