package in.juspay.hypersmshandler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001:\u0001\u0002"}, d2 = {"Lin/juspay/hypersmshandler/SmsConsentHandler;", "Landroid/content/BroadcastReceiver;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SmsConsentHandler extends BroadcastReceiver {
    public static final ExecutorService e;
    public final SmsComponents a;
    public Intent b;
    public final Context c;
    public Runnable d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lin/juspay/hypersmshandler/SmsConsentHandler$Companion;", "", "()V", "LOG_TAG", "", "smsConsentPool", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "hyper-sms-handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        e = Executors.newSingleThreadExecutor();
    }

    public SmsConsentHandler(SmsComponents smsComponents) {
        toMagicModuleMetaRepoModel.write(smsComponents, "");
        this.a = smsComponents;
        this.c = smsComponents.getContext();
        e.execute(new Runnable() { // from class: in.juspay.hypersmshandler.SmsConsentHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SmsConsentHandler.a(this.f$0);
            }
        });
    }

    public static final void a(SmsConsentHandler smsConsentHandler) {
        toMagicModuleMetaRepoModel.write(smsConsentHandler, "");
        smsConsentHandler.b();
        IntentFilter intentFilter = new IntentFilter(com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION);
        if (Build.VERSION.SDK_INT >= 33) {
            smsConsentHandler.c.registerReceiver(smsConsentHandler, intentFilter, 2);
        } else {
            smsConsentHandler.c.registerReceiver(smsConsentHandler, intentFilter);
        }
    }

    public abstract void a();

    public final void b() {
        final Tracker tracker = this.a.getTracker();
        Task<Void> taskStartSmsUserConsent = com.google.android.gms.auth.api.phone.SmsRetriever.getClient(this.c).startSmsUserConsent(null);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taskStartSmsUserConsent, "");
        final SmsConsentHandler$startListener$1 smsConsentHandler$startListener$1 = new SmsConsentHandler$startListener$1(tracker);
        taskStartSmsUserConsent.addOnSuccessListener(new OnSuccessListener() { // from class: in.juspay.hypersmshandler.SmsConsentHandler$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                SmsConsentHandler.a(smsConsentHandler$startListener$1, obj);
            }
        });
        taskStartSmsUserConsent.addOnFailureListener(new OnFailureListener() { // from class: in.juspay.hypersmshandler.SmsConsentHandler$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                SmsConsentHandler.a(tracker, exc);
            }
        });
    }

    public final void c() {
        e.execute(new Runnable() { // from class: in.juspay.hypersmshandler.SmsConsentHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SmsConsentHandler.b(this.f$0);
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(intent, "");
        try {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION, (Object) intent.getAction()) && (extras = intent.getExtras()) != null) {
                Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                int statusCode = status != null ? status.getStatusCode() : 16;
                if (statusCode != 0) {
                    if (statusCode == 15) {
                        a();
                    }
                } else {
                    this.b = (Intent) extras.getParcelable(com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_CONSENT_INTENT);
                    Runnable runnable = this.d;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        } catch (Exception e2) {
            this.a.getTracker().trackAndLogException("SmsConsentHandler", LogCategory.LIFECYCLE, LogSubCategory.Action.SYSTEM, "broadcast_receiver", "SmsConsentHandler onReceive exception", e2);
        }
    }

    public static final void a(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        getanswermap.invoke(obj);
    }

    public static final void a(Tracker tracker, Exception exc) {
        toMagicModuleMetaRepoModel.write(tracker, "");
        toMagicModuleMetaRepoModel.write(exc, "");
        tracker.trackAndLogException("SmsConsentHandler", LogCategory.API_CALL, LogSubCategory.ApiCall.SDK, "sms_consent", "SmsConsent listener failed to start", exc);
    }

    public static final void b(SmsConsentHandler smsConsentHandler) {
        toMagicModuleMetaRepoModel.write(smsConsentHandler, "");
        try {
            smsConsentHandler.c.unregisterReceiver(smsConsentHandler);
        } catch (Exception unused) {
        }
    }
}
