package kotlin;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInPassword {
    public static final void IconCompatParcelizer(getPublicKeyCredential getpublickeycredential, FragmentManager fragmentManager, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getpublickeycredential, "");
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        getpublickeycredential.show(fragmentManager, "");
        fragmentManager.IconCompatParcelizer("dialog_key", getpublickeycredential, new _addFields() { // from class: o.getProfilePictureUri
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                SignInPassword.write(getcreatedondatems, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getCreatedOnDateMs getcreatedondatems, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("button_press")) {
            getcreatedondatems.invoke();
        }
    }
}
