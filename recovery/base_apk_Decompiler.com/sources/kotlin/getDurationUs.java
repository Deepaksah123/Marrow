package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.RemoteMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class getDurationUs {
    private final setContentBufferedPositionMs<RemoteMessage> write;

    public getDurationUs() {
        this(new getNextAdIndexToPlay());
    }

    private getDurationUs(setContentBufferedPositionMs<RemoteMessage> setcontentbufferedpositionms) {
        this.write = setcontentbufferedpositionms;
    }

    public final boolean RemoteActionCompatParcelizer(Context context, RemoteMessage remoteMessage) {
        Bundle bundleAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(remoteMessage);
        if (bundleAudioAttributesCompatParcelizer == null) {
            return false;
        }
        return getAdGroupCount.IconCompatParcelizer().RemoteActionCompatParcelizer(context, new getFirstAdIndexToPlay(bundleAudioAttributesCompatParcelizer).IconCompatParcelizer(remoteMessage).IconCompatParcelizer(), "FCM");
    }
}
