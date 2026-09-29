package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioCapabilitiesReceiverAudioDeviceCallbackV23 extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCapabilitiesReceiverAudioDeviceCallbackV23(Context context) {
        super(1);
        this.write = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        Object systemService = this.write.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }
}
