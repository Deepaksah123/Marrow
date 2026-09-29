package kotlin;

import android.os.Bundle;
import com.google.firebase.messaging.RemoteMessage;
import com.marrow.data.models.custommodule.CustomModule;

/* JADX INFO: loaded from: classes4.dex */
public final class getFirstAdIndexToPlay implements isLivePostrollPlaceholder<RemoteMessage> {
    private final Bundle RemoteActionCompatParcelizer;

    public getFirstAdIndexToPlay(Bundle bundle) {
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.RemoteActionCompatParcelizer = bundle;
    }

    public final isLivePostrollPlaceholder<RemoteMessage> IconCompatParcelizer(RemoteMessage remoteMessage) {
        String str = "";
        toMagicModuleMetaRepoModel.write(remoteMessage, "");
        if (remoteMessage.AudioAttributesCompatParcelizer() != remoteMessage.write()) {
            int iWrite = remoteMessage.write();
            if (iWrite == 0) {
                str = "fcm_unknown";
            } else if (iWrite == 1) {
                str = "high";
            } else if (iWrite == 2) {
                str = CustomModule.DEFAULT_MODULE_OWNER;
            }
            this.RemoteActionCompatParcelizer.putString("wzrk_pn_prt", str);
        }
        return this;
    }

    @Override // kotlin.isLivePostrollPlaceholder
    public final Bundle IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
