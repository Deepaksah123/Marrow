package kotlin;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInClient {
    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    public static final void RemoteActionCompatParcelizer(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult, FragmentManager fragmentManager, final getModuleData<? super String, ? super String, ? super String, getShowPopup> getmoduledata, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(saveAccountLinkingTokenResult, "");
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        toMagicModuleMetaRepoModel.write(getmoduledata, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        saveAccountLinkingTokenResult.show(fragmentManager, "");
        fragmentManager.IconCompatParcelizer("dialog_key", saveAccountLinkingTokenResult, new _addFields() { // from class: o.getSignInIntent
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                SignInClient.IconCompatParcelizer(getmoduledata, getcreatedondatems, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getModuleData getmoduledata, getCreatedOnDateMs getcreatedondatems, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.containsKey("BUTTON_COUNTRY_CODE")) {
            String string = bundle.getString("BUTTON_COUNTRY_CODE");
            if (string == null) {
                string = "";
            }
            String string2 = bundle.getString("BUTTON_PHONE");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = bundle.getString("BUTTON_SLOT");
            getmoduledata.AudioAttributesCompatParcelizer(string, string2, string3 != null ? string3 : "");
        }
        if (bundle.getBoolean("on_error")) {
            getcreatedondatems.invoke();
        }
    }
}
