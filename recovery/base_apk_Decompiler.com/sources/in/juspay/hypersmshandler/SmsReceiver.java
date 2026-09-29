package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersmshandler.SmsServices;
import kotlin.Metadata;
import kotlin.ThemeAlphaConstantsKt;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004"}, d2 = {"Lin/juspay/hypersmshandler/SmsReceiver;", "Landroid/content/BroadcastReceiver;", "Lin/juspay/hypersmshandler/JuspayDuiHook;", "Lin/juspay/hypersmshandler/OnResultHook;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SmsReceiver extends BroadcastReceiver implements JuspayDuiHook, OnResultHook {
    public static final String d;
    public final SmsServices a;
    public IntentFilter b;
    public final Tracker c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lin/juspay/hypersmshandler/SmsReceiver$Companion;", "", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "SMS_CONSENT_REQUEST", "", "hyper-sms-handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        d = "SmsReceiver";
    }

    public SmsReceiver(SmsServices smsServices) {
        toMagicModuleMetaRepoModel.write(smsServices, "");
        this.a = smsServices;
        this.c = smsServices.a.getTracker();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Intent r11) throws org.json.JSONException {
        /*
            r10 = this;
            android.os.Bundle r11 = r11.getExtras()
            if (r11 == 0) goto L98
            java.lang.String r0 = "pdus"
            java.lang.Object r11 = r11.get(r0)
            boolean r0 = r11 instanceof java.lang.Object[]
            if (r0 == 0) goto L13
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            goto L14
        L13:
            r11 = 0
        L14:
            r0 = 0
            if (r11 != 0) goto L19
            byte[][] r11 = new byte[r0][]
        L19:
            int r1 = r11.length
            android.telephony.SmsMessage[] r2 = new android.telephony.SmsMessage[r1]
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
        L21:
            java.lang.String r4 = ""
            if (r0 >= r1) goto L80
            r5 = r11[r0]
            kotlin.toMagicModuleMetaRepoModel.read(r5, r4)
            byte[] r5 = (byte[]) r5
            android.telephony.SmsMessage r5 = android.telephony.SmsMessage.createFromPdu(r5)
            java.lang.String r6 = r5.getOriginatingAddress()
            if (r6 == 0) goto L46
            java.util.Locale r7 = java.util.Locale.getDefault()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r7, r4)
            java.lang.String r6 = r6.toUpperCase(r7)
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r6, r4)
            if (r6 != 0) goto L47
        L46:
            r6 = r4
        L47:
            java.lang.String r7 = r5.getMessageBody()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r7, r4)
            java.util.Locale r8 = java.util.Locale.getDefault()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8, r4)
            java.lang.String r7 = r7.toUpperCase(r8)
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r7, r4)
            long r8 = r5.getTimestampMillis()
            r2[r0] = r5
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "from"
            r4.put(r5, r6)
            java.lang.String r5 = "body"
            r4.put(r5, r7)
            java.lang.String r5 = "time"
            java.lang.String r6 = java.lang.String.valueOf(r8)
            r4.put(r5, r6)
            r3.put(r4)
            int r0 = r0 + 1
            goto L21
        L80:
            int r11 = r3.length()
            if (r11 <= 0) goto L98
            in.juspay.hypersmshandler.SmsServices r10 = r10.a
            in.juspay.hypersmshandler.SmsComponents r10 = r10.a
            in.juspay.hypersmshandler.SmsEventInterface r10 = r10.getSmsEventInterface()
            java.lang.String r11 = r3.toString()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r11, r4)
            r10.onSmsReceiverEvent(r11)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersmshandler.SmsReceiver.a(android.content.Intent):void");
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void attach(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        if (this.b != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                this.a.a.getContext().registerReceiver(this, this.b, 2);
                return;
            } else {
                this.a.a.getContext().registerReceiver(this, this.b);
                return;
            }
        }
        SmsServices smsServices = this.a;
        final SmsConsentHandler smsConsentHandler = smsServices.b;
        if (smsConsentHandler == null) {
            this.c.trackAction(LogSubCategory.Action.SYSTEM, "error", "sms_receiver", "missing", "SmsConsentHandler");
            return;
        }
        Intent intent = smsConsentHandler.b;
        if (intent != null) {
            smsServices.a.getSmsEventInterface().onSmsConsentEvent(intent, 11, null);
        }
        smsConsentHandler.d = new Runnable() { // from class: in.juspay.hypersmshandler.SmsReceiver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SmsReceiver.a(this.f$0, smsConsentHandler);
            }
        };
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void detach(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        try {
            if (this.b != null) {
                this.a.a.getContext().unregisterReceiver(this);
                return;
            }
            SmsConsentHandler smsConsentHandler = this.a.b;
            if (smsConsentHandler != null) {
                smsConsentHandler.d = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final String execute(Activity activity, String str, JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(activity, "");
        if (jSONObject != null) {
            try {
                if (jSONObject.has("smsReadStartTime")) {
                    return this.a.a(null, jSONObject.getString("smsReadStartTime"), null);
                }
            } catch (JSONException e) {
                Tracker tracker = this.c;
                String str2 = d;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                tracker.trackAndLogException(str2, "action", LogSubCategory.Action.SYSTEM, "broadcast_receiver", "Exception while trying to read sms from Inbox: ", e);
                return ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI;
            }
        }
        return this.a.a(null, String.valueOf(System.currentTimeMillis() - 60000), null);
    }

    @Override // in.juspay.hypersmshandler.OnResultHook
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            return false;
        }
        SmsServices smsServices = this.a;
        SmsConsentHandler smsConsentHandler = smsServices.b;
        if (smsConsentHandler != null) {
            smsConsentHandler.c();
        }
        SmsServices$resetSmsConsentHandler$1 smsServices$resetSmsConsentHandler$1 = new SmsServices$resetSmsConsentHandler$1(smsServices, smsServices.a);
        smsServices.b = smsServices$resetSmsConsentHandler$1;
        smsServices$resetSmsConsentHandler$1.d = null;
        if (intent == null) {
            SmsEventInterface smsEventInterface = this.a.a.getSmsEventInterface();
            SmsServices.Companion companion = SmsServices.c;
            smsEventInterface.onActivityResultEvent(SmsServices.d);
            return true;
        }
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra(com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_SMS_MESSAGE);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", "UNKNOWN_BANK");
                jSONObject.put("body", stringExtra);
                jSONObject.put("time", String.valueOf(System.currentTimeMillis()));
                this.a.a.getSmsEventInterface().onActivityResultEvent(jSONObject.toString());
                this.c.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, "broadcast_receiver", Labels.Android.ON_ACTIVITY_RESULT, "Response sent back to microapp");
            } catch (JSONException e) {
                SmsEventInterface smsEventInterface2 = this.a.a.getSmsEventInterface();
                SmsServices.Companion companion2 = SmsServices.c;
                smsEventInterface2.onActivityResultEvent(SmsServices.d);
                Tracker tracker = this.c;
                String str = d;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                tracker.trackAndLogException(str, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, "sms_consent", "JSON Exception", e);
            }
        } else if (i2 == 0) {
            this.c.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, "broadcast_receiver", Labels.Android.ON_ACTIVITY_RESULT, "User denied SMS consent");
            this.a.a.getSmsEventInterface().onActivityResultEvent("DENIED");
        }
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(intent, "");
        try {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "android.provider.Telephony.SMS_RECEIVED", (Object) intent.getAction())) {
                a(intent);
            }
        } catch (Exception e) {
            Tracker tracker = this.c;
            String str = d;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            tracker.trackAndLogException(str, "action", LogSubCategory.Action.SYSTEM, "broadcast_receiver", "Failed to receive sms", e);
        }
    }

    public static final void a(SmsReceiver smsReceiver, SmsConsentHandler smsConsentHandler) {
        toMagicModuleMetaRepoModel.write(smsReceiver, "");
        Intent intent = smsConsentHandler.b;
        if (intent != null) {
            smsReceiver.a.a.getSmsEventInterface().onSmsConsentEvent(intent, 11, null);
        }
    }
}
