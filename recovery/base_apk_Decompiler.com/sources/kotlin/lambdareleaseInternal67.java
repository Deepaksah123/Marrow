package kotlin;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class lambdareleaseInternal67 {
    private static SharedPreferences AudioAttributesCompatParcelizer;
    private static AtomicBoolean IconCompatParcelizer = new AtomicBoolean(false);
    private static final ConcurrentHashMap<String, String> read = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> write = new ConcurrentHashMap<>();

    static /* synthetic */ void AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
            return;
        }
        try {
            AudioAttributesImplApi26Parcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
        }
    }

    static /* synthetic */ SharedPreferences RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
            return null;
        }
        try {
            return AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
            return null;
        }
    }

    static /* synthetic */ AtomicBoolean write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
            return null;
        }
        try {
            return IconCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
            return null;
        }
    }

    static void read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
            return;
        }
        try {
            if (IconCompatParcelizer.get()) {
                return;
            }
            AudioAttributesImplApi26Parcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
        }
    }

    private static void read(final String str, final String str2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
            return;
        }
        try {
            lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.lambdareleaseInternal67.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        if (!lambdareleaseInternal67.write().get()) {
                            lambdareleaseInternal67.AudioAttributesCompatParcelizer();
                        }
                        lambdareleaseInternal67.RemoteActionCompatParcelizer().edit().putString(str, str2).apply();
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
        }
    }

    public static String IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
            return null;
        }
        try {
            if (!IconCompatParcelizer.get()) {
                AudioAttributesImplApi26Parcelizer();
            }
            HashMap map = new HashMap();
            map.putAll(read);
            map.putAll(MediaBrowserCompatCustomActionResultReceiver());
            return DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(map);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
            return null;
        }
    }

    private static Map<String, String> MediaBrowserCompatCustomActionResultReceiver() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set<String> setRemoteActionCompatParcelizer = lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.RemoteActionCompatParcelizer();
            for (String str : write.keySet()) {
                if (setRemoteActionCompatParcelizer.contains(str)) {
                    map.put(str, write.get(str));
                }
            }
            return map;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
            return null;
        }
    }

    private static void AudioAttributesImplApi26Parcelizer() {
        synchronized (lambdareleaseInternal67.class) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
                return;
            }
            try {
                if (IconCompatParcelizer.get()) {
                    return;
                }
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());
                AudioAttributesCompatParcelizer = defaultSharedPreferences;
                String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                String string2 = AudioAttributesCompatParcelizer.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                read.putAll(DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(string));
                write.putAll(DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(string2));
                IconCompatParcelizer.set(true);
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
            }
        }
    }

    static void AudioAttributesCompatParcelizer(Map<String, String> map) {
        String[] strArrSplit;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
            return;
        }
        try {
            if (!IconCompatParcelizer.get()) {
                AudioAttributesImplApi26Parcelizer();
            }
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                String strRemoteActionCompatParcelizer = DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(IconCompatParcelizer(key, map.get(key).trim()));
                ConcurrentHashMap<String, String> concurrentHashMap = write;
                if (concurrentHashMap.containsKey(key)) {
                    String str = concurrentHashMap.get(key);
                    if (str != null) {
                        strArrSplit = str.split(",");
                    } else {
                        strArrSplit = new String[0];
                    }
                    HashSet hashSet = new HashSet(Arrays.asList(strArrSplit));
                    if (hashSet.contains(strRemoteActionCompatParcelizer)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArrSplit.length == 0) {
                        sb.append(strRemoteActionCompatParcelizer);
                    } else if (strArrSplit.length < 5) {
                        sb.append(str);
                        sb.append(",");
                        sb.append(strRemoteActionCompatParcelizer);
                    } else {
                        for (int i = 1; i < 5; i++) {
                            sb.append(strArrSplit[i]);
                            sb.append(",");
                        }
                        sb.append(strRemoteActionCompatParcelizer);
                        hashSet.remove(strArrSplit[0]);
                    }
                    write.put(key, sb.toString());
                } else {
                    concurrentHashMap.put(key, strRemoteActionCompatParcelizer);
                }
            }
            read("com.facebook.appevents.UserDataStore.internalUserData", DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(write));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
        }
    }

    private static String IconCompatParcelizer(String str, String str2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdareleaseInternal67.class)) {
            return null;
        }
        try {
            String lowerCase = str2.trim().toLowerCase();
            if ("em".equals(str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return "";
                }
            } else {
                if ("ph".equals(str)) {
                    return lowerCase.replaceAll("[^0-9]", "");
                }
                if ("ge".equals(str)) {
                    String strSubstring = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : "";
                    return ("f".equals(strSubstring) || "m".equals(strSubstring)) ? strSubstring : "";
                }
            }
            return lowerCase;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdareleaseInternal67.class);
            return null;
        }
    }
}
