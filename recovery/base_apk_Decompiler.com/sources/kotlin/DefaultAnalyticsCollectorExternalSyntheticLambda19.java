package kotlin;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda19 {
    private static Application.ActivityLifecycleCallbacks AudioAttributesCompatParcelizer;
    private static ServiceConnection AudioAttributesImplApi26Parcelizer;
    private static Object IconCompatParcelizer;
    private static Intent write;
    private static final AtomicBoolean AudioAttributesImplApi21Parcelizer = new AtomicBoolean(false);
    private static Boolean RemoteActionCompatParcelizer = null;
    private static Boolean read = null;

    public static void RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer();
        if (RemoteActionCompatParcelizer.booleanValue() && DefaultAnalyticsCollectorExternalSyntheticLambda31.write()) {
            write();
        }
    }

    private static void AudioAttributesCompatParcelizer() {
        if (RemoteActionCompatParcelizer != null) {
            return;
        }
        try {
            Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
            RemoteActionCompatParcelizer = Boolean.TRUE;
            try {
                Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                read = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                read = Boolean.FALSE;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda21.IconCompatParcelizer();
            write = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
            AudioAttributesImplApi26Parcelizer = new ServiceConnection() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda19.1
                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    Object unused2 = DefaultAnalyticsCollectorExternalSyntheticLambda19.IconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda21.RemoteActionCompatParcelizer(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer(), iBinder);
                }
            };
            AudioAttributesCompatParcelizer = new Application.ActivityLifecycleCallbacks() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda19.3
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    try {
                        lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda19.3.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                    return;
                                }
                                try {
                                    Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
                                    DefaultAnalyticsCollectorExternalSyntheticLambda19.RemoteActionCompatParcelizer(contextAudioAttributesCompatParcelizer, DefaultAnalyticsCollectorExternalSyntheticLambda21.IconCompatParcelizer(contextAudioAttributesCompatParcelizer, DefaultAnalyticsCollectorExternalSyntheticLambda19.IconCompatParcelizer), false);
                                    DefaultAnalyticsCollectorExternalSyntheticLambda19.RemoteActionCompatParcelizer(contextAudioAttributesCompatParcelizer, DefaultAnalyticsCollectorExternalSyntheticLambda21.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, DefaultAnalyticsCollectorExternalSyntheticLambda19.IconCompatParcelizer), true);
                                } catch (Throwable th) {
                                    getMinWindowSequenceNumber.read(th, this);
                                }
                            }
                        });
                    } catch (Exception unused2) {
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    try {
                        if (DefaultAnalyticsCollectorExternalSyntheticLambda19.read.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                            lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda19.3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                        return;
                                    }
                                    try {
                                        Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
                                        ArrayList<String> arrayListIconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda21.IconCompatParcelizer(contextAudioAttributesCompatParcelizer, DefaultAnalyticsCollectorExternalSyntheticLambda19.IconCompatParcelizer);
                                        if (arrayListIconCompatParcelizer.isEmpty()) {
                                            arrayListIconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda21.read(contextAudioAttributesCompatParcelizer, DefaultAnalyticsCollectorExternalSyntheticLambda19.IconCompatParcelizer);
                                        }
                                        DefaultAnalyticsCollectorExternalSyntheticLambda19.RemoteActionCompatParcelizer(contextAudioAttributesCompatParcelizer, arrayListIconCompatParcelizer, false);
                                    } catch (Throwable th) {
                                        getMinWindowSequenceNumber.read(th, this);
                                    }
                                }
                            });
                        }
                    } catch (Exception unused2) {
                    }
                }
            };
        } catch (ClassNotFoundException unused2) {
            RemoteActionCompatParcelizer = Boolean.FALSE;
        }
    }

    private static void write() {
        if (AudioAttributesImplApi21Parcelizer.compareAndSet(false, true)) {
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            if (contextAudioAttributesCompatParcelizer instanceof Application) {
                ((Application) contextAudioAttributesCompatParcelizer).registerActivityLifecycleCallbacks(AudioAttributesCompatParcelizer);
                contextAudioAttributesCompatParcelizer.bindService(write, AudioAttributesImplApi26Parcelizer, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(Context context, ArrayList<String> arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            try {
                String string = new JSONObject(str).getString("productId");
                map.put(string, str);
                arrayList2.add(string);
            } catch (JSONException unused) {
            }
        }
        for (Map.Entry<String, String> entry : DefaultAnalyticsCollectorExternalSyntheticLambda21.read(context, arrayList2, IconCompatParcelizer, z).entrySet()) {
            DefaultAnalyticsCollectorExternalSyntheticLambda31.read((String) map.get(entry.getKey()), entry.getValue(), z);
        }
    }
}
