package in.juspay.hypersmshandler;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0001"}, d2 = {"Lin/juspay/hypersmshandler/SmsServices$resetSmsConsentHandler$1;", "Lin/juspay/hypersmshandler/SmsConsentHandler;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SmsServices$resetSmsConsentHandler$1 extends SmsConsentHandler {
    public final /* synthetic */ SmsServices f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsServices$resetSmsConsentHandler$1(SmsServices smsServices, SmsComponents smsComponents) {
        super(smsComponents);
        this.f = smsServices;
    }

    @Override // in.juspay.hypersmshandler.SmsConsentHandler
    public final void a() {
        SmsServices smsServices = this.f;
        SmsConsentHandler smsConsentHandler = smsServices.b;
        if (smsConsentHandler != null) {
            smsConsentHandler.c();
        }
        SmsServices$resetSmsConsentHandler$1 smsServices$resetSmsConsentHandler$1 = new SmsServices$resetSmsConsentHandler$1(smsServices, smsServices.a);
        smsServices.b = smsServices$resetSmsConsentHandler$1;
        smsServices$resetSmsConsentHandler$1.d = null;
    }

    @Override // in.juspay.hypersmshandler.SmsConsentHandler, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
