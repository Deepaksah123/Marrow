package in.juspay.hypersmshandler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.Metadata;
import kotlin._parseBooleanPrimitive;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ+\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0011"}, d2 = {"Lin/juspay/hypersmshandler/SmsServices;", "", "Lin/juspay/hypersmshandler/SmsComponents;", "p0", "<init>", "(Lin/juspay/hypersmshandler/SmsComponents;)V", "", "createSMSConsent", "()V", "unregisterSmsConsent", "", "p1", "p2", "fetchSms", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lin/juspay/hypersmshandler/JuspayDuiHook;", "createSMSReceiver", "()Lin/juspay/hypersmshandler/JuspayDuiHook;", "createSmsReceiverForConsent", "createSendSMSReceiver", "createSmsRetriever", "createDeliveredSMSReceiver", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SmsServices {
    public static final Companion c = new Companion(0);
    public static final String d = "DENIED";
    public static final String e = "SmsServices";
    public final SmsComponents a;
    public SmsConsentHandler b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lin/juspay/hypersmshandler/SmsServices$Companion;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "LOG_TAG", "Ljava/lang/String;", "hyper-sms-handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public SmsServices(SmsComponents smsComponents) {
        toMagicModuleMetaRepoModel.write(smsComponents, "");
        this.a = smsComponents;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[Catch: JSONException -> 0x01a7, TRY_LEAVE, TryCatch #4 {JSONException -> 0x01a7, blocks: (B:19:0x0087, B:21:0x008e, B:18:0x0066), top: B:124:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0204  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r33, java.lang.String r34, java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersmshandler.SmsServices.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public final JuspayDuiHook createDeliveredSMSReceiver() {
        return new DeliverReceiver();
    }

    public final void createSMSConsent() {
        try {
            if (this.b == null && this.a.getContext().getPackageManager().checkPermission("android.permission.READ_SMS", "com.google.android.gms") == 0) {
                SmsConsentHandler smsConsentHandler = new SmsConsentHandler(this.a) { // from class: in.juspay.hypersmshandler.SmsServices.createSMSConsent.1
                    @Override // in.juspay.hypersmshandler.SmsConsentHandler
                    public final void a() {
                        SmsServices smsServices = SmsServices.this;
                        SmsConsentHandler smsConsentHandler2 = smsServices.b;
                        if (smsConsentHandler2 != null) {
                            smsConsentHandler2.c();
                        }
                        SmsServices$resetSmsConsentHandler$1 smsServices$resetSmsConsentHandler$1 = new SmsServices$resetSmsConsentHandler$1(smsServices, smsServices.a);
                        smsServices.b = smsServices$resetSmsConsentHandler$1;
                        smsServices$resetSmsConsentHandler$1.d = null;
                    }

                    @Override // in.juspay.hypersmshandler.SmsConsentHandler, android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        super.onReceive(context, intent);
                    }
                };
                this.b = smsConsentHandler;
                smsConsentHandler.d = null;
            }
        } catch (Exception e2) {
            Tracker tracker = this.a.getTracker();
            String str = e;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            tracker.trackAndLogException(str, LogCategory.LIFECYCLE, "hyper_sdk", "sms_consent", "Exception happened while initializing", e2);
        }
    }

    public final JuspayDuiHook createSMSReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
            intentFilter.setPriority(999);
            if (!a("android.permission.RECEIVE_SMS")) {
                return null;
            }
            SmsReceiver smsReceiver = new SmsReceiver(this);
            smsReceiver.b = intentFilter;
            return smsReceiver;
        } catch (Throwable th) {
            Tracker tracker = this.a.getTracker();
            String str = e;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            tracker.trackAndLogException(str, "action", LogSubCategory.Action.SYSTEM, "sms_receiver", "Failed to register SMS broadcast receiver (Ignoring)", th);
            return null;
        }
    }

    public final JuspayDuiHook createSendSMSReceiver() {
        return new SentReceiver(this.a);
    }

    public final JuspayDuiHook createSmsReceiverForConsent() {
        try {
            SmsReceiver smsReceiver = new SmsReceiver(this);
            smsReceiver.b = null;
            return smsReceiver;
        } catch (Exception e2) {
            Tracker tracker = this.a.getTracker();
            String str = e;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            tracker.trackAndLogException(str, LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, "sms_consent", "Failed to register SMS Consent", e2);
            return null;
        }
    }

    public final JuspayDuiHook createSmsRetriever() {
        return new SmsRetriever(this.a);
    }

    public final String fetchSms(String p0, String p1, String p2) {
        return a(p1, p0, p2);
    }

    public final void unregisterSmsConsent() {
        SmsConsentHandler smsConsentHandler = this.b;
        if (smsConsentHandler != null) {
            smsConsentHandler.c();
        }
        this.b = null;
    }

    public final boolean a(String str) {
        return _parseBooleanPrimitive.read(this.a.getContext(), str) == 0;
    }
}
