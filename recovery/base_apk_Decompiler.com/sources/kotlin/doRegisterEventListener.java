package kotlin;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes3.dex */
public final class doRegisterEventListener {
    public static final void IconCompatParcelizer(final createClientSettingsBuilder createclientsettingsbuilder, FragmentManager fragmentManager, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(createclientsettingsbuilder, "");
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        createclientsettingsbuilder.show(fragmentManager, "");
        fragmentManager.IconCompatParcelizer("dialog_key", createclientsettingsbuilder, new _addFields() { // from class: o.doBestEffortWrite
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                doRegisterEventListener.AudioAttributesCompatParcelizer(createclientsettingsbuilder, getcreatedondatems, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(createClientSettingsBuilder createclientsettingsbuilder, getCreatedOnDateMs getcreatedondatems, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        createclientsettingsbuilder.IconCompatParcelizer().cancel();
        if (bundle.getBoolean("primary_button_click")) {
            getcreatedondatems.invoke();
        }
    }
}
