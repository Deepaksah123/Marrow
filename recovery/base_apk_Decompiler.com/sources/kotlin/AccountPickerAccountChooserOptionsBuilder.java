package kotlin;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountPickerAccountChooserOptionsBuilder {
    public static final void AudioAttributesCompatParcelizer(zzC zzc, FragmentManager fragmentManager, final getAnswerMap<? super Integer, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(zzc, "");
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        zzc.show(fragmentManager, "RatingFeedbackBottomSheet");
        fragmentManager.IconCompatParcelizer("rating", zzc, new _addFields() { // from class: o.setAlwaysShowAccountPicker
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                AccountPickerAccountChooserOptionsBuilder.AudioAttributesCompatParcelizer(getanswermap, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(getAnswerMap getanswermap, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        getanswermap.invoke(Integer.valueOf(bundle.getInt("rating")));
    }
}
