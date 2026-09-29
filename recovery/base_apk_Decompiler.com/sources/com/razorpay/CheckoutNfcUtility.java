package com.razorpay;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import com.razorpay.nfc.CardData;
import com.razorpay.nfc.NfcHelper;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002$%B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0004J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/razorpay/CheckoutNfcUtility;", "Landroid/nfc/NfcAdapter$ReaderCallback;", "()V", "checkoutNfcResponse", "Lcom/razorpay/CheckoutNfcUtility$CheckoutNfcResponse;", "getCheckoutNfcResponse$checkout_release", "()Lcom/razorpay/CheckoutNfcUtility$CheckoutNfcResponse;", "setCheckoutNfcResponse$checkout_release", "(Lcom/razorpay/CheckoutNfcUtility$CheckoutNfcResponse;)V", "isScanRequested", "", "nfcAdapter", "Landroid/nfc/NfcAdapter;", "nfcHelper", "Lcom/razorpay/nfc/NfcHelper;", "nfcStateReceiver", "Landroid/content/BroadcastReceiver;", "pendingNfcResponse", "cleanup", "", "activity", "Landroid/app/Activity;", "disableReaderMode", "enableReaderMode", "initAdapter", "Lcom/razorpay/CheckoutNfcUtility$NfcHardwareStates;", "initDefaultAdapter", "nfcResponse", "onTagDiscovered", "tag", "Landroid/nfc/Tag;", "openNfcSettings", "registerNfcStateListener", "resumeReaderModeIfActive", "setPendingNfcResponse", "unregisterNfcStateListener", "CheckoutNfcResponse", "NfcHardwareStates", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CheckoutNfcUtility implements NfcAdapter.ReaderCallback {
    private static CheckoutNfcResponse checkoutNfcResponse;
    private static boolean isScanRequested;
    private static NfcAdapter nfcAdapter;
    private static BroadcastReceiver nfcStateReceiver;
    private static CheckoutNfcResponse pendingNfcResponse;
    public static final CheckoutNfcUtility INSTANCE = new CheckoutNfcUtility();
    public static NfcHelper nfcHelper = new NfcHelper();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/razorpay/CheckoutNfcUtility$CheckoutNfcResponse;", "", "Lorg/json/JSONObject;", "p0", "", "onFailed", "(Lorg/json/JSONObject;)V", "onResponse"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface CheckoutNfcResponse {
        void onFailed(JSONObject p0);

        void onResponse(JSONObject p0);
    }

    private CheckoutNfcUtility() {
    }

    public final CheckoutNfcResponse getCheckoutNfcResponse$checkout_release() {
        return checkoutNfcResponse;
    }

    public final void setCheckoutNfcResponse$checkout_release(CheckoutNfcResponse checkoutNfcResponse2) {
        checkoutNfcResponse = checkoutNfcResponse2;
    }

    public final void setPendingNfcResponse(CheckoutNfcResponse nfcResponse) {
        toMagicModuleMetaRepoModel.write(nfcResponse, "");
        pendingNfcResponse = nfcResponse;
    }

    public final CheckoutNfcUtility$O$$$__o0Oo initAdapter(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        if (nfcAdapter != null) {
            return CheckoutNfcUtility$O$$$__o0Oo.NFC_ENABLED;
        }
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
        if (defaultAdapter == null) {
            return CheckoutNfcUtility$O$$$__o0Oo.NFC_HARDWARE_ABSENT;
        }
        if (!defaultAdapter.isEnabled()) {
            return CheckoutNfcUtility$O$$$__o0Oo.NFC_DISABLED;
        }
        nfcAdapter = defaultAdapter;
        return CheckoutNfcUtility$O$$$__o0Oo.NFC_ENABLED;
    }

    public final void initDefaultAdapter(Activity activity, CheckoutNfcResponse nfcResponse) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(nfcResponse, "");
        isScanRequested = true;
        checkoutNfcResponse = nfcResponse;
        if (nfcAdapter == null) {
            nfcAdapter = NfcAdapter.getDefaultAdapter(activity);
            enableReaderMode(activity);
        } else {
            enableReaderMode(activity);
        }
    }

    public final void enableReaderMode(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        NfcAdapter nfcAdapter2 = nfcAdapter;
        if (nfcAdapter2 == null || nfcAdapter2 == null) {
            return;
        }
        nfcAdapter2.enableReaderMode(activity, this, TarConstants.PREFIXLEN_XSTAR, null);
    }

    public final void disableReaderMode(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        try {
            NfcAdapter nfcAdapter2 = nfcAdapter;
            if (nfcAdapter2 != null) {
                nfcAdapter2.disableReaderMode(activity);
            }
        } catch (Exception unused) {
        } finally {
            nfcAdapter = null;
        }
    }

    public final void resumeReaderModeIfActive(Activity activity) {
        CheckoutNfcResponse checkoutNfcResponse2;
        toMagicModuleMetaRepoModel.write(activity, "");
        if (!isScanRequested || (checkoutNfcResponse2 = checkoutNfcResponse) == null) {
            return;
        }
        initDefaultAdapter(activity, checkoutNfcResponse2);
    }

    public final void cleanup(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        isScanRequested = false;
        disableReaderMode(activity);
        unregisterNfcStateListener(activity);
    }

    public final void openNfcSettings(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        activity.startActivity(new Intent("android.settings.NFC_SETTINGS"));
    }

    public final void registerNfcStateListener(final Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.razorpay.CheckoutNfcUtility.registerNfcStateListener.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context p0, Intent p1) {
                toMagicModuleMetaRepoModel.write(p0, "");
                toMagicModuleMetaRepoModel.write(p1, "");
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p1.getAction(), (Object) "android.nfc.action.ADAPTER_STATE_CHANGED") && p1.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1) == 3) {
                    CheckoutNfcResponse checkoutNfcResponse2 = CheckoutNfcUtility.pendingNfcResponse;
                    if (checkoutNfcResponse2 != null) {
                        CheckoutNfcUtility.INSTANCE.initDefaultAdapter(activity, checkoutNfcResponse2);
                    }
                    CheckoutNfcUtility.INSTANCE.unregisterNfcStateListener(activity);
                }
            }
        };
        nfcStateReceiver = broadcastReceiver;
        activity.registerReceiver(broadcastReceiver, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
    }

    public final void unregisterNfcStateListener(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        BroadcastReceiver broadcastReceiver = nfcStateReceiver;
        if (broadcastReceiver != null) {
            try {
                activity.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused) {
            }
            nfcStateReceiver = null;
        }
        pendingNfcResponse = null;
    }

    @Override // android.nfc.NfcAdapter.ReaderCallback
    public final void onTagDiscovered(Tag tag) throws JSONException, IOException {
        CardData cardDataStartCardScanner = nfcHelper.startCardScanner(tag);
        if (cardDataStartCardScanner != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pan", cardDataStartCardScanner.getPan());
            String expiry = cardDataStartCardScanner.getExpiry();
            if (expiry != null && expiry.length() >= 4) {
                String strSubstring = expiry.substring(0, 2);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                jSONObject.put("expiry_year", strSubstring);
                String strSubstring2 = expiry.substring(2, 4);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
                jSONObject.put("expiry_month", strSubstring2);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("provider", "NFC_SCAN_PROVIDER");
            jSONObject2.put("status", "success");
            jSONObject2.put("data", jSONObject);
            CheckoutNfcResponse checkoutNfcResponse2 = checkoutNfcResponse;
            if (checkoutNfcResponse2 != null) {
                checkoutNfcResponse2.onResponse(jSONObject2);
                return;
            }
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("provider", "NFC_SCAN_PROVIDER");
        jSONObject4.put("status", "error");
        jSONObject4.put("data", jSONObject3);
        CheckoutNfcResponse checkoutNfcResponse3 = checkoutNfcResponse;
        if (checkoutNfcResponse3 != null) {
            checkoutNfcResponse3.onFailed(jSONObject4);
        }
    }
}
