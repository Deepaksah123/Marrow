package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonCues52 {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final Context MediaBrowserCompatCustomActionResultReceiver;
    private final setIsPlaceholder RemoteActionCompatParcelizer;
    private final Map<String, Object> AudioAttributesImplBaseParcelizer = new HashMap();
    private final Map<String, lambdaonAvailableCommandsChanged33<?>> MediaBrowserCompatItemReceiver = new ConcurrentHashMap();
    private final Map<String, String> read = new HashMap();
    private Object AudioAttributesImplApi21Parcelizer = null;
    private Runnable IconCompatParcelizer = null;
    private Map<String, Object> write = new HashMap();

    public lambdaonCues52(CleverTapInstanceConfig cleverTapInstanceConfig, Context context, setIsPlaceholder setisplaceholder) {
        this.MediaBrowserCompatCustomActionResultReceiver = context;
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.RemoteActionCompatParcelizer = setisplaceholder;
    }

    private static void IconCompatParcelizer(String str) {
        RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
    }

    private static void read(String str, Throwable th) {
        RendererWakeupListener.AudioAttributesImplApi26Parcelizer();
    }

    private void write(String str) {
        StringBuilder sb = new StringBuilder("storeDataInCache() called with: data = [");
        sb.append(str);
        sb.append("]");
        IconCompatParcelizer(sb.toString());
        try {
            RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, "variablesKey"), str);
        } catch (Throwable th) {
            read("storeDataInCache failed", th);
        }
    }

    private String write() {
        String strWrite = RendererCapabilitiesFormatSupport.write(this.MediaBrowserCompatCustomActionResultReceiver, RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, "variablesKey"), "{}");
        IconCompatParcelizer("VarCache loaded cache data:\n".concat(String.valueOf(strWrite)));
        return strWrite;
    }

    public final void read(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        synchronized (this) {
            try {
                Map<String, Object> mapAudioAttributesCompatParcelizer = lambdaonAudioSessionIdChanged54.AudioAttributesCompatParcelizer(write());
                HashMap<String, lambdaonAvailableCommandsChanged33<?>> map = new HashMap<>(this.MediaBrowserCompatItemReceiver);
                AudioAttributesCompatParcelizer(mapAudioAttributesCompatParcelizer, map);
                read(map, getcreatedondatems);
            } catch (Exception e) {
                read("Could not load variable diffs.\n", e);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        synchronized (this) {
            read(getcreatedondatems);
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void IconCompatParcelizer(Map<String, Object> map, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        synchronized (this) {
            HashMap<String, lambdaonAvailableCommandsChanged33<?>> map2 = new HashMap<>(this.MediaBrowserCompatItemReceiver);
            AudioAttributesCompatParcelizer(map, map2);
            read(map2, getcreatedondatems);
            RemoteActionCompatParcelizer();
            AudioAttributesImplApi21Parcelizer();
        }
    }

    private void RemoteActionCompatParcelizer() {
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer).read().read("VarCache#saveDiffsAsync", new Callable() { // from class: o.lambdaonBandwidthSample60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.write.AudioAttributesCompatParcelizer();
            }
        });
    }

    final /* synthetic */ Void AudioAttributesCompatParcelizer() throws Exception {
        read();
        return null;
    }

    private void read() {
        IconCompatParcelizer("saveDiffs() called");
        write(lambdaonAudioSessionIdChanged54.read(this.write));
    }

    private void AudioAttributesCompatParcelizer(Map<String, Object> map, HashMap<String, lambdaonAvailableCommandsChanged33<?>> map2) {
        StringBuilder sb = new StringBuilder("applyVariableDiffs() called with: diffs = [");
        sb.append(map);
        sb.append("]");
        IconCompatParcelizer(sb.toString());
        if (map != null) {
            this.write = map;
            this.AudioAttributesImplApi21Parcelizer = lambdaonAudioDisabled9.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, map);
            StringBuilder sb2 = new StringBuilder("applyVariableDiffs: updated value of merged=[");
            sb2.append(this.AudioAttributesImplApi21Parcelizer);
            sb2.append("]");
            IconCompatParcelizer(sb2.toString());
            Iterator<Map.Entry<String, lambdaonAvailableCommandsChanged33<?>>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                lambdaonAvailableCommandsChanged33<?> lambdaonavailablecommandschanged33 = this.MediaBrowserCompatItemReceiver.get(it.next().getKey());
                if (lambdaonavailablecommandschanged33 != null) {
                    lambdaonavailablecommandschanged33.read();
                }
            }
        }
    }

    private void read(HashMap<String, lambdaonAvailableCommandsChanged33<?>> map, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        if (map.isEmpty()) {
            IconCompatParcelizer("There are no variables registered by the client. Not downloading files & posting global callbacks");
            return;
        }
        StringBuilder sb = new StringBuilder("Skipped these file vars cause urls are not present :\n");
        StringBuilder sb2 = new StringBuilder("Adding these files to download :\n");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, lambdaonAvailableCommandsChanged33<?>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            lambdaonAvailableCommandsChanged33<?> lambdaonavailablecommandschanged33 = this.MediaBrowserCompatItemReceiver.get(key);
            if (lambdaonavailablecommandschanged33 != null && lambdaonavailablecommandschanged33.write().equals("file")) {
                String strRemoteActionCompatParcelizer = lambdaonavailablecommandschanged33.RemoteActionCompatParcelizer();
                if (strRemoteActionCompatParcelizer != null) {
                    if (!SimpleBasePlayerExternalSyntheticLambda6.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver()).AudioAttributesImplBaseParcelizer(strRemoteActionCompatParcelizer)) {
                        arrayList.add(new Pair(strRemoteActionCompatParcelizer, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer));
                        sb2.append(key);
                        sb2.append(" : ");
                        sb2.append(strRemoteActionCompatParcelizer);
                        sb2.append("\n");
                    }
                } else {
                    sb.append(key);
                    sb.append("\n");
                }
            }
        }
        IconCompatParcelizer(sb.toString());
        IconCompatParcelizer(sb2.toString());
        if (arrayList.isEmpty()) {
            getcreatedondatems.invoke();
        } else {
            this.RemoteActionCompatParcelizer.write(arrayList, new lambdaonAudioUnderrun7(getcreatedondatems));
        }
    }

    static /* synthetic */ getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        synchronized (this) {
            Runnable runnable = this.IconCompatParcelizer;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void IconCompatParcelizer() {
        synchronized (this) {
            IconCompatParcelizer("Clear user content in VarCache");
            HashMap<String, lambdaonAvailableCommandsChanged33<?>> map = new HashMap<>(this.MediaBrowserCompatItemReceiver);
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                this.MediaBrowserCompatItemReceiver.get(it.next());
            }
            AudioAttributesCompatParcelizer(new HashMap(), map);
            RemoteActionCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer(Runnable runnable) {
        synchronized (this) {
            this.IconCompatParcelizer = runnable;
        }
    }
}
