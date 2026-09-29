package com.razorpay;

import android.app.Activity;

/* JADX INFO: renamed from: com.razorpay.$$O_$, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
class C$$O_$ {
    public static String versionKey = "magic_version";
    private String O$$$__o0Oo;
    Activity activity;

    C$$O_$(Activity activity) {
        this.activity = activity;
    }

    void checkForUpdates() {
        Owl.get(_Oo_O_$.getInstance().getMagicVersionUrl(), new Callback() { // from class: com.razorpay.$$O_$.1
            @Override // com.razorpay.Callback
            public void run(ResponseObject responseObject) {
                if (responseObject.getResponseResult() != null) {
                    try {
                        String versionFromJsonString = BaseUtils.getVersionFromJsonString(responseObject.getResponseResult(), C$$O_$.versionKey);
                        if (BaseUtils.getLocalVersion(C$$O_$.this.activity, C$$O_$.versionKey).equals(versionFromJsonString)) {
                            return;
                        }
                        C$$O_$.this.O$$$__o0Oo(versionFromJsonString);
                    } catch (Exception unused) {
                        AnalyticsUtil.reportError(getClass().getName(), "S1", "Could not extract version from server json");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O$$$__o0Oo(final String str) {
        Owl.get(_Oo_O_$.getInstance().getMagicJsUrl(), new Callback() { // from class: com.razorpay.$$O_$.2
            @Override // com.razorpay.Callback
            public void run(ResponseObject responseObject) {
                String strDecryptFile;
                if (responseObject.getResponseResult() == null || (strDecryptFile = BaseUtils.decryptFile(responseObject.getResponseResult())) == null) {
                    return;
                }
                if (BaseUtils.storeFileInInternal(C$$O_$.this.activity, BaseUtils.getVersionedAssetName(str, _Oo_O_$.getInstance().getMagicJsFileName()), responseObject.getResponseResult())) {
                    C$$O_$.this.O$$$__o0Oo = strDecryptFile;
                    BaseUtils.updateLocalVersion(C$$O_$.this.activity, C$$O_$.versionKey, str);
                }
            }
        });
    }

    String getMagicJs() {
        if (this.O$$$__o0Oo == null) {
            if (BaseUtils.getLocalVersion(this.activity, versionKey).equals(BaseUtils.getVersionFromJsonString(_Oo_O_$.getVersionJSON(), versionKey))) {
                this.O$$$__o0Oo = _Oo_O_$.getMagicJs();
            } else {
                try {
                    this.O$$$__o0Oo = BaseUtils.getFileFromInternal(this.activity, _Oo_O_$.getInstance().getMagicJsFileName(), versionKey);
                } catch (Exception unused) {
                    this.O$$$__o0Oo = _Oo_O_$.getMagicJs();
                }
            }
        }
        return this.O$$$__o0Oo;
    }
}
