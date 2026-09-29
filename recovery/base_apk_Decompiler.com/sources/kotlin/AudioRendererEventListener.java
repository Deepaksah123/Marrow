package kotlin;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioRendererEventListener extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRendererEventListener(Context context) {
        super(1);
        this.RemoteActionCompatParcelizer = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        Object systemService = this.RemoteActionCompatParcelizer.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }
}
