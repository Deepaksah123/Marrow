package kotlin;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes3.dex */
public final class getBrowserClient {
    public static /* synthetic */ void IconCompatParcelizer(getAutofillClient getautofillclient, FragmentManager fragmentManager, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i) {
        if ((i & 2) != 0) {
            getcreatedondatems = new getCreatedOnDateMs() { // from class: o.SmsRetriever
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return getBrowserClient.RemoteActionCompatParcelizer();
                }
            };
        }
        if ((i & 4) != 0) {
            getcreatedondatems2 = new getCreatedOnDateMs() { // from class: o.SmsRetrieverClient
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return getBrowserClient.IconCompatParcelizer();
                }
            };
        }
        write(getautofillclient, fragmentManager, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer() {
        return getShowPopup.INSTANCE;
    }

    @getRenewGrpId
    public static final void write(getAutofillClient getautofillclient, FragmentManager fragmentManager, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
        toMagicModuleMetaRepoModel.write(getautofillclient, "");
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        getautofillclient.show(fragmentManager, "");
        fragmentManager.IconCompatParcelizer(SmsRetrieverStatusCodes.AudioAttributesCompatParcelizer.getWrite(), getautofillclient, new _addFields() { // from class: o.AuthApiStatusCodes
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                getBrowserClient.AudioAttributesCompatParcelizer(getcreatedondatems, getcreatedondatems2, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, String str, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (bundle.getBoolean("positive_key_press")) {
            getcreatedondatems.invoke();
        }
        if (bundle.getBoolean("negative_key_press")) {
            getcreatedondatems2.invoke();
        }
    }
}
