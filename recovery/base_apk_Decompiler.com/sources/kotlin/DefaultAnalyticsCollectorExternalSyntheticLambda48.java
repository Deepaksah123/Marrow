package kotlin;

import android.app.Activity;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda39;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda48 {
    private static final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);
    private static final Set<String> read = new HashSet();
    private static final Set<String> IconCompatParcelizer = new HashSet();

    static /* synthetic */ AtomicBoolean AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda48.class)) {
            return null;
        }
        try {
            return RemoteActionCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda48.class);
            return null;
        }
    }

    static /* synthetic */ void IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda48.class)) {
            return;
        }
        try {
            write();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda48.class);
        }
    }

    public static void read() {
        synchronized (DefaultAnalyticsCollectorExternalSyntheticLambda48.class) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda48.class)) {
                return;
            }
            try {
                lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda48.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            if (DefaultAnalyticsCollectorExternalSyntheticLambda48.AudioAttributesCompatParcelizer().get()) {
                                return;
                            }
                            DefaultAnalyticsCollectorExternalSyntheticLambda48.AudioAttributesCompatParcelizer().set(true);
                            DefaultAnalyticsCollectorExternalSyntheticLambda48.IconCompatParcelizer();
                        } catch (Throwable th) {
                            getMinWindowSequenceNumber.read(th, this);
                        }
                    }
                });
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda48.class);
            }
        }
    }

    private static void write() {
        String mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        File fileRemoteActionCompatParcelizer;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda48.class)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.write(), false);
            if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer == null || (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) == null) {
                return;
            }
            IconCompatParcelizer(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            if ((read.isEmpty() && IconCompatParcelizer.isEmpty()) || (fileRemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda39.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda39.AudioAttributesCompatParcelizer.MTML_APP_EVENT_PREDICTION)) == null) {
                return;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda5.read(fileRemoteActionCompatParcelizer);
            Activity activityAudioAttributesImplApi26Parcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda28.AudioAttributesImplApi26Parcelizer();
            if (activityAudioAttributesImplApi26Parcelizer != null) {
                write(activityAudioAttributesImplApi26Parcelizer);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda48.class);
        }
    }

    private static void IconCompatParcelizer(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda48.class)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                for (int i = 0; i < jSONArray.length(); i++) {
                    read.add(jSONArray.getString(i));
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    IconCompatParcelizer.add(jSONArray2.getString(i2));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda48.class);
        }
    }

    public static void write(Activity activity) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda48.class)) {
            return;
        }
        try {
            if (RemoteActionCompatParcelizer.get() && DefaultAnalyticsCollectorExternalSyntheticLambda5.IconCompatParcelizer() && (!read.isEmpty() || !IconCompatParcelizer.isEmpty())) {
                DefaultAnalyticsCollectorExternalSyntheticLambda50.AudioAttributesCompatParcelizer(activity);
            } else {
                DefaultAnalyticsCollectorExternalSyntheticLambda50.IconCompatParcelizer(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda48.class);
        }
    }

    static boolean RemoteActionCompatParcelizer(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda48.class)) {
            return false;
        }
        try {
            return read.contains(str);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda48.class);
            return false;
        }
    }

    static boolean AudioAttributesCompatParcelizer(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda48.class)) {
            return false;
        }
        try {
            return IconCompatParcelizer.contains(str);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda48.class);
            return false;
        }
    }
}
