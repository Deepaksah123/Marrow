package kotlin;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInCredential {
    public static final void read(signOut signout, FragmentManager fragmentManager, final getAnswerMap<? super String, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(signout, "");
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        signout.show(fragmentManager, "");
        fragmentManager.IconCompatParcelizer("dialog_key", signout, new _addFields() { // from class: o.getGoogleIdToken
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                SignInCredential.write(getanswermap, getcreatedondatems, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.containsKey("button_press")) {
            String string = bundle.getString("button_press");
            getanswermap.invoke(string != null ? string : "");
        }
        if (bundle.getBoolean("on_error")) {
            getcreatedondatems.invoke();
        }
    }
}
