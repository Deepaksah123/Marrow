package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import in.juspay.hypersmshandler.SmsEventInterface;
import in.juspay.hypersmshandler.SmsRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003"}, d2 = {"Lin/juspay/hypersmshandler/SmsRetriever;", "Landroid/content/BroadcastReceiver;", "Lin/juspay/hypersmshandler/JuspayDuiHook;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SmsRetriever extends BroadcastReceiver implements JuspayDuiHook {
    public static final ExecutorService e;
    public final SmsComponents a;
    public JSONArray b;
    public boolean c;
    public final Context d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lin/juspay/hypersmshandler/SmsRetriever$Companion;", "", "()V", "smsConsentPool", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "hyper-sms-handler_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public SmsRetriever(SmsComponents smsComponents) {
        toMagicModuleMetaRepoModel.write(smsComponents, "");
        this.a = smsComponents;
        this.b = new JSONArray();
        this.d = smsComponents.getContext();
    }

    public static final void a(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        getanswermap.invoke(obj);
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void attach(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        SmsRetrieverClient client = com.google.android.gms.auth.api.phone.SmsRetriever.getClient(this.d);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(client, "");
        Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(taskStartSmsRetriever, "");
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(activity, this);
        taskStartSmsRetriever.addOnSuccessListener(new OnSuccessListener() { // from class: in.juspay.hypersmshandler.SmsRetriever$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                SmsRetriever.a(anonymousClass1, obj);
            }
        });
        taskStartSmsRetriever.addOnFailureListener(new OnFailureListener() { // from class: in.juspay.hypersmshandler.SmsRetriever$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                SmsRetriever.a(this.f$0, exc);
            }
        });
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void detach(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        e.execute(new Runnable() { // from class: in.juspay.hypersmshandler.SmsRetriever$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                SmsRetriever.a(this.f$0);
            }
        });
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final String execute(Activity activity, String str, JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(activity, "");
        if (str == null) {
            return "FAILURE";
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "getOtp")) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "cancel") ? "SUCCESS" : "FAILURE";
        }
        if (this.b.length() == 0) {
            if (this.c) {
                this.a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_EXECUTE, "TIMEOUT");
            }
            return "SUCCESS";
        }
        SmsEventInterface smsEventInterface = this.a.getSmsEventInterface();
        SmsEventInterface.RetrieverEvents retrieverEvents = SmsEventInterface.RetrieverEvents.ON_EXECUTE;
        String string = this.b.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        smsEventInterface.onSmsRetrieverEvent(retrieverEvents, string);
        this.b = new JSONArray();
        return "SUCCESS";
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(intent, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION, (Object) intent.getAction()) || (extras = intent.getExtras()) == null) {
            return;
        }
        Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
        String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_ORIGINATING_ADDRESS");
        int statusCode = status != null ? status.getStatusCode() : 16;
        if (statusCode != 0) {
            if (statusCode == 15) {
                this.c = true;
                this.a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_RECEIVE, "TIMEOUT");
                return;
            }
            return;
        }
        String str = (String) extras.get(com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_SMS_MESSAGE);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", "UNKNOWN_BANK");
            jSONObject.put("body", str);
            jSONObject.put("time", String.valueOf(System.currentTimeMillis()));
            jSONObject.put("senderId", string);
        } catch (Exception unused) {
        }
        this.b.put(jSONObject);
        SmsEventInterface smsEventInterface = this.a.getSmsEventInterface();
        SmsEventInterface.RetrieverEvents retrieverEvents = SmsEventInterface.RetrieverEvents.ON_RECEIVE;
        String string2 = this.b.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        smsEventInterface.onSmsRetrieverEvent(retrieverEvents, string2);
        this.b = new JSONArray();
    }

    /* JADX INFO: renamed from: in.juspay.hypersmshandler.SmsRetriever$attach$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<Void, getShowPopup> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ SmsRetriever b;

        public final void a() {
            ExecutorService executorService = SmsRetriever.e;
            final Activity activity = this.a;
            final SmsRetriever smsRetriever = this.b;
            executorService.execute(new Runnable() { // from class: in.juspay.hypersmshandler.SmsRetriever$attach$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SmsRetriever.AnonymousClass1.a(activity, smsRetriever);
                }
            });
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Void r1) {
            a();
            return getShowPopup.INSTANCE;
        }

        public static final void a(Activity activity, SmsRetriever smsRetriever) {
            toMagicModuleMetaRepoModel.write(activity, "");
            toMagicModuleMetaRepoModel.write(smsRetriever, "");
            IntentFilter intentFilter = new IntentFilter(com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION);
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (Build.VERSION.SDK_INT >= 33) {
                activity.registerReceiver(smsRetriever, intentFilter, 2);
            } else {
                activity.registerReceiver(smsRetriever, intentFilter);
            }
            smsRetriever.a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_ATTACH, "SUCCESS");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, SmsRetriever smsRetriever) {
            super(1);
            this.a = activity;
            this.b = smsRetriever;
        }
    }

    public static final void a(SmsRetriever smsRetriever, Exception exc) {
        toMagicModuleMetaRepoModel.write(smsRetriever, "");
        toMagicModuleMetaRepoModel.write(exc, "");
        smsRetriever.a.getSmsEventInterface().onSmsRetrieverEvent(SmsEventInterface.RetrieverEvents.ON_ATTACH, "FAILURE");
    }

    public static final void a(SmsRetriever smsRetriever) {
        toMagicModuleMetaRepoModel.write(smsRetriever, "");
        try {
            smsRetriever.d.unregisterReceiver(smsRetriever);
        } catch (IllegalArgumentException unused) {
        }
    }
}
