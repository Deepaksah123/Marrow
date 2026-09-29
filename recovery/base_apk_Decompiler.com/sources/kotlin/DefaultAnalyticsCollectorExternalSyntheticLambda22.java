package kotlin;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda22 {
    private final Class<?> AudioAttributesImplApi21Parcelizer;
    private final Class<?> AudioAttributesImplApi26Parcelizer;
    private final Context AudioAttributesImplBaseParcelizer;
    private final Method MediaBrowserCompatCustomActionResultReceiver;
    private final Object MediaBrowserCompatItemReceiver;
    private final Method MediaBrowserCompatMediaItem;
    private final Set<String> MediaBrowserCompatSearchResultReceiver = new CopyOnWriteArraySet();
    private final Method MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final Method MediaDescriptionCompat;
    private final Method MediaMetadataCompat;
    private final DefaultAnalyticsCollectorExternalSyntheticLambda25 RatingCompat;
    private final Method handleMediaPlayPauseIfPendingOnHandler;
    private final Class<?> onAddQueueItem;
    private final Class<?> onCommand;
    private final Class<?> onCustomAction;
    private final Method onPause;
    private final Class<?> onPlay;
    private final Class<?> onPlayFromMediaId;
    private static final AtomicBoolean IconCompatParcelizer = new AtomicBoolean(false);
    private static DefaultAnalyticsCollectorExternalSyntheticLambda22 RemoteActionCompatParcelizer = null;
    public static final AtomicBoolean write = new AtomicBoolean(false);
    public static final Map<String, JSONObject> read = new ConcurrentHashMap();
    public static final Map<String, JSONObject> AudioAttributesCompatParcelizer = new ConcurrentHashMap();

    static class RemoteActionCompatParcelizer implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    static /* synthetic */ Context AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22 defaultAnalyticsCollectorExternalSyntheticLambda22) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda22.AudioAttributesImplBaseParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
            return null;
        }
    }

    static /* synthetic */ Method AudioAttributesImplApi26Parcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22 defaultAnalyticsCollectorExternalSyntheticLambda22) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda22.MediaBrowserCompatMediaItem;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
            return null;
        }
    }

    static /* synthetic */ Set IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22 defaultAnalyticsCollectorExternalSyntheticLambda22) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda22.MediaBrowserCompatSearchResultReceiver;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
            return null;
        }
    }

    static /* synthetic */ Class RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22 defaultAnalyticsCollectorExternalSyntheticLambda22) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda22.AudioAttributesImplApi21Parcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
            return null;
        }
    }

    static /* synthetic */ Class read(DefaultAnalyticsCollectorExternalSyntheticLambda22 defaultAnalyticsCollectorExternalSyntheticLambda22) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda22.onPlayFromMediaId;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
            return null;
        }
    }

    static /* synthetic */ void read(DefaultAnalyticsCollectorExternalSyntheticLambda22 defaultAnalyticsCollectorExternalSyntheticLambda22, String str, List list, Runnable runnable) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
            return;
        }
        try {
            defaultAnalyticsCollectorExternalSyntheticLambda22.read(str, list, runnable);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
        }
    }

    static /* synthetic */ Method write(DefaultAnalyticsCollectorExternalSyntheticLambda22 defaultAnalyticsCollectorExternalSyntheticLambda22) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda22.MediaMetadataCompat;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
            return null;
        }
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda22(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, DefaultAnalyticsCollectorExternalSyntheticLambda25 defaultAnalyticsCollectorExternalSyntheticLambda25) {
        this.AudioAttributesImplBaseParcelizer = context;
        this.MediaBrowserCompatItemReceiver = obj;
        this.AudioAttributesImplApi26Parcelizer = cls;
        this.onCommand = cls2;
        this.onAddQueueItem = cls3;
        this.onPlayFromMediaId = cls4;
        this.AudioAttributesImplApi21Parcelizer = cls5;
        this.onPlay = cls6;
        this.onCustomAction = cls7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = method;
        this.MediaDescriptionCompat = method2;
        this.MediaBrowserCompatCustomActionResultReceiver = method3;
        this.MediaBrowserCompatMediaItem = method4;
        this.MediaMetadataCompat = method5;
        this.onPause = method6;
        this.handleMediaPlayPauseIfPendingOnHandler = method7;
        this.RatingCompat = defaultAnalyticsCollectorExternalSyntheticLambda25;
    }

    public static DefaultAnalyticsCollectorExternalSyntheticLambda22 read(Context context) {
        synchronized (DefaultAnalyticsCollectorExternalSyntheticLambda22.class) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
                return null;
            }
            try {
                AtomicBoolean atomicBoolean = IconCompatParcelizer;
                if (atomicBoolean.get()) {
                    return RemoteActionCompatParcelizer;
                }
                AudioAttributesCompatParcelizer(context);
                atomicBoolean.set(true);
                return RemoteActionCompatParcelizer;
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
                return null;
            }
        }
    }

    private static void AudioAttributesCompatParcelizer(Context context) {
        Object objIconCompatParcelizer;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda25 defaultAnalyticsCollectorExternalSyntheticLambda25Write = DefaultAnalyticsCollectorExternalSyntheticLambda25.write();
            if (defaultAnalyticsCollectorExternalSyntheticLambda25Write != null) {
                Class<?> clsAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.BillingClient");
                Class<?> clsAudioAttributesCompatParcelizer2 = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.Purchase");
                Class<?> clsAudioAttributesCompatParcelizer3 = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.Purchase$PurchasesResult");
                Class<?> clsAudioAttributesCompatParcelizer4 = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.SkuDetails");
                Class<?> clsAudioAttributesCompatParcelizer5 = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.PurchaseHistoryRecord");
                Class<?> clsAudioAttributesCompatParcelizer6 = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.SkuDetailsResponseListener");
                Class<?> clsAudioAttributesCompatParcelizer7 = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.PurchaseHistoryResponseListener");
                if (clsAudioAttributesCompatParcelizer == null || clsAudioAttributesCompatParcelizer3 == null || clsAudioAttributesCompatParcelizer2 == null || clsAudioAttributesCompatParcelizer4 == null || clsAudioAttributesCompatParcelizer6 == null || clsAudioAttributesCompatParcelizer5 == null || clsAudioAttributesCompatParcelizer7 == null) {
                    return;
                }
                Method methodWrite = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, "queryPurchases", String.class);
                Method methodWrite2 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer3, "getPurchasesList", new Class[0]);
                Method methodWrite3 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer2, "getOriginalJson", new Class[0]);
                Method methodWrite4 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer4, "getOriginalJson", new Class[0]);
                Method methodWrite5 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer5, "getOriginalJson", new Class[0]);
                Method methodWrite6 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, "querySkuDetailsAsync", defaultAnalyticsCollectorExternalSyntheticLambda25Write.read(), clsAudioAttributesCompatParcelizer6);
                Method methodWrite7 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, "queryPurchaseHistoryAsync", String.class, clsAudioAttributesCompatParcelizer7);
                if (methodWrite == null || methodWrite2 == null || methodWrite3 == null || methodWrite4 == null || methodWrite5 == null || methodWrite6 == null || methodWrite7 == null || (objIconCompatParcelizer = IconCompatParcelizer(context, clsAudioAttributesCompatParcelizer)) == null) {
                    return;
                }
                DefaultAnalyticsCollectorExternalSyntheticLambda22 defaultAnalyticsCollectorExternalSyntheticLambda22 = new DefaultAnalyticsCollectorExternalSyntheticLambda22(context, objIconCompatParcelizer, clsAudioAttributesCompatParcelizer, clsAudioAttributesCompatParcelizer3, clsAudioAttributesCompatParcelizer2, clsAudioAttributesCompatParcelizer4, clsAudioAttributesCompatParcelizer5, clsAudioAttributesCompatParcelizer6, clsAudioAttributesCompatParcelizer7, methodWrite, methodWrite2, methodWrite3, methodWrite4, methodWrite5, methodWrite6, methodWrite7, defaultAnalyticsCollectorExternalSyntheticLambda25Write);
                RemoteActionCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda22;
                defaultAnalyticsCollectorExternalSyntheticLambda22.AudioAttributesCompatParcelizer();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
        }
    }

    private static Object IconCompatParcelizer(Context context, Class<?> cls) {
        Object objWrite;
        Object objWrite2;
        Object objWrite3;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.class)) {
            return null;
        }
        try {
            Class<?> clsAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsAudioAttributesCompatParcelizer2 = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsAudioAttributesCompatParcelizer != null && clsAudioAttributesCompatParcelizer2 != null) {
                Method methodWrite = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(cls, "newBuilder", Context.class);
                Method methodWrite2 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, "enablePendingPurchases", new Class[0]);
                Method methodWrite3 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, "setListener", clsAudioAttributesCompatParcelizer2);
                Method methodWrite4 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, "build", new Class[0]);
                if (methodWrite == null || methodWrite2 == null || methodWrite3 == null || methodWrite4 == null || (objWrite = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(cls, methodWrite, null, context)) == null || (objWrite2 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, methodWrite3, objWrite, Proxy.newProxyInstance(clsAudioAttributesCompatParcelizer2.getClassLoader(), new Class[]{clsAudioAttributesCompatParcelizer2}, new RemoteActionCompatParcelizer()))) == null || (objWrite3 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, methodWrite2, objWrite2, new Object[0])) == null) {
                    return null;
                }
                return DefaultAnalyticsCollectorExternalSyntheticLambda26.write(clsAudioAttributesCompatParcelizer, methodWrite4, objWrite3, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda22.class);
            return null;
        }
    }

    public final void IconCompatParcelizer(String str, final Runnable runnable) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            RemoteActionCompatParcelizer(str, new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda22.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        DefaultAnalyticsCollectorExternalSyntheticLambda22.read(DefaultAnalyticsCollectorExternalSyntheticLambda22.this, "inapp", new ArrayList(DefaultAnalyticsCollectorExternalSyntheticLambda22.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.this)), runnable);
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    public final void AudioAttributesCompatParcelizer(String str, Runnable runnable) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            Object objWrite = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.onCommand, this.MediaDescriptionCompat, DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.AudioAttributesImplApi26Parcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaBrowserCompatItemReceiver, "inapp"), new Object[0]);
            if (objWrite instanceof List) {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) objWrite).iterator();
                    while (it.hasNext()) {
                        Object objWrite2 = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.onAddQueueItem, this.MediaBrowserCompatCustomActionResultReceiver, it.next(), new Object[0]);
                        if (objWrite2 instanceof String) {
                            JSONObject jSONObject = new JSONObject((String) objWrite2);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                arrayList.add(string);
                                read.put(string, jSONObject);
                            }
                        }
                    }
                    read(str, arrayList, runnable);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void read(String str, List<String> list, Runnable runnable) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.AudioAttributesImplApi26Parcelizer, this.onPause, this.MediaBrowserCompatItemReceiver, this.RatingCompat.write(str, list), Proxy.newProxyInstance(this.onPlay.getClassLoader(), new Class[]{this.onPlay}, new AudioAttributesCompatParcelizer(runnable)));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void RemoteActionCompatParcelizer(String str, Runnable runnable) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.AudioAttributesImplApi26Parcelizer, this.handleMediaPlayPauseIfPendingOnHandler, this.MediaBrowserCompatItemReceiver, str, Proxy.newProxyInstance(this.onCustomAction.getClassLoader(), new Class[]{this.onCustomAction}, new IconCompatParcelizer(runnable)));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void AudioAttributesCompatParcelizer() {
        Method methodWrite;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            Class<?> clsAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda26.AudioAttributesCompatParcelizer("com.android.billingclient.api.BillingClientStateListener");
            if (clsAudioAttributesCompatParcelizer != null && (methodWrite = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.AudioAttributesImplApi26Parcelizer, "startConnection", clsAudioAttributesCompatParcelizer)) != null) {
                DefaultAnalyticsCollectorExternalSyntheticLambda26.write(this.AudioAttributesImplApi26Parcelizer, methodWrite, this.MediaBrowserCompatItemReceiver, Proxy.newProxyInstance(clsAudioAttributesCompatParcelizer.getClassLoader(), new Class[]{clsAudioAttributesCompatParcelizer}, new write()));
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    static class write implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onBillingSetupFinished")) {
                DefaultAnalyticsCollectorExternalSyntheticLambda22.write.set(true);
                return null;
            }
            if (!method.getName().endsWith("onBillingServiceDisconnected")) {
                return null;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda22.write.set(false);
            return null;
        }
    }

    class IconCompatParcelizer implements InvocationHandler {
        private Runnable write;

        public IconCompatParcelizer(Runnable runnable) {
            this.write = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (!method.getName().equals("onPurchaseHistoryResponse")) {
                return null;
            }
            Object obj2 = objArr[1];
            if (!(obj2 instanceof List)) {
                return null;
            }
            AudioAttributesCompatParcelizer((List) obj2);
            return null;
        }

        private void AudioAttributesCompatParcelizer(List<?> list) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object objWrite = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(DefaultAnalyticsCollectorExternalSyntheticLambda22.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.this), DefaultAnalyticsCollectorExternalSyntheticLambda22.write(DefaultAnalyticsCollectorExternalSyntheticLambda22.this), it.next(), new Object[0]);
                    if (objWrite instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) objWrite);
                        jSONObject.put("packageName", DefaultAnalyticsCollectorExternalSyntheticLambda22.AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.this).getPackageName());
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            DefaultAnalyticsCollectorExternalSyntheticLambda22.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.this).add(string);
                            DefaultAnalyticsCollectorExternalSyntheticLambda22.read.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.write.run();
        }
    }

    class AudioAttributesCompatParcelizer implements InvocationHandler {
        private Runnable IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(Runnable runnable) {
            this.IconCompatParcelizer = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (!method.getName().equals("onSkuDetailsResponse")) {
                return null;
            }
            Object obj2 = objArr[1];
            if (!(obj2 instanceof List)) {
                return null;
            }
            IconCompatParcelizer((List) obj2);
            return null;
        }

        private void IconCompatParcelizer(List<?> list) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object objWrite = DefaultAnalyticsCollectorExternalSyntheticLambda26.write(DefaultAnalyticsCollectorExternalSyntheticLambda22.read(DefaultAnalyticsCollectorExternalSyntheticLambda22.this), DefaultAnalyticsCollectorExternalSyntheticLambda22.AudioAttributesImplApi26Parcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda22.this), it.next(), new Object[0]);
                    if (objWrite instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) objWrite);
                        if (jSONObject.has("productId")) {
                            DefaultAnalyticsCollectorExternalSyntheticLambda22.AudioAttributesCompatParcelizer.put(jSONObject.getString("productId"), jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.IconCompatParcelizer.run();
        }
    }
}
