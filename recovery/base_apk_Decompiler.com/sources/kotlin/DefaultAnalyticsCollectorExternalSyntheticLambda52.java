package kotlin;

import android.os.Bundle;
import android.view.View;
import com.facebook.GraphRequest;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda39;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda52 implements View.OnClickListener {
    private static final Set<Integer> RemoteActionCompatParcelizer = new HashSet();
    private String AudioAttributesCompatParcelizer;
    private WeakReference<View> IconCompatParcelizer;
    private WeakReference<View> read;
    private View.OnClickListener write;

    static /* synthetic */ void IconCompatParcelizer(String str, String str2, float[] fArr) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda52.class)) {
            return;
        }
        try {
            RemoteActionCompatParcelizer(str, str2, fArr);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda52.class);
        }
    }

    static /* synthetic */ String write(DefaultAnalyticsCollectorExternalSyntheticLambda52 defaultAnalyticsCollectorExternalSyntheticLambda52) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda52.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda52.AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda52.class);
            return null;
        }
    }

    static void RemoteActionCompatParcelizer(View view, View view2, String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda52.class)) {
            return;
        }
        try {
            int iHashCode = view.hashCode();
            Set<Integer> set = RemoteActionCompatParcelizer;
            if (set.contains(Integer.valueOf(iHashCode))) {
                return;
            }
            DefaultAnalyticsCollectorExternalSyntheticLambda17.read(view, new DefaultAnalyticsCollectorExternalSyntheticLambda52(view, view2, str));
            set.add(Integer.valueOf(iHashCode));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda52.class);
        }
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda52(View view, View view2, String str) {
        this.write = DefaultAnalyticsCollectorExternalSyntheticLambda17.read(view);
        this.read = new WeakReference<>(view);
        this.IconCompatParcelizer = new WeakReference<>(view2);
        this.AudioAttributesCompatParcelizer = str.toLowerCase().replace("activity", "");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.write;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private void IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            View view = this.IconCompatParcelizer.get();
            View view2 = this.read.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strWrite = DefaultAnalyticsCollectorExternalSyntheticLambda49.write(view2);
                String strRemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda46.RemoteActionCompatParcelizer(view2, strWrite);
                if (strRemoteActionCompatParcelizer == null || read(strRemoteActionCompatParcelizer, strWrite)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("view", DefaultAnalyticsCollectorExternalSyntheticLambda49.IconCompatParcelizer(view, view2));
                jSONObject.put("screenname", this.AudioAttributesCompatParcelizer);
                write(strRemoteActionCompatParcelizer, strWrite, jSONObject);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private static boolean read(String str, final String str2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda52.class)) {
            return false;
        }
        try {
            final String strWrite = DefaultAnalyticsCollectorExternalSyntheticLambda46.write(str);
            if (strWrite == null) {
                return false;
            }
            if (strWrite.equals("other")) {
                return true;
            }
            DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda52.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        DefaultAnalyticsCollectorExternalSyntheticLambda52.IconCompatParcelizer(strWrite, str2, new float[0]);
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda52.class);
            return false;
        }
    }

    private void write(final String str, final String str2, final JSONObject jSONObject) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return;
        }
        try {
            DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda52.5
                @Override // java.lang.Runnable
                public final void run() {
                    String[] strArr;
                    if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                        return;
                    }
                    try {
                        String lowerCase = DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).toLowerCase();
                        float[] fArrRemoteActionCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda5.RemoteActionCompatParcelizer(jSONObject, lowerCase);
                        String strIconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda5.IconCompatParcelizer(str2, DefaultAnalyticsCollectorExternalSyntheticLambda52.write(DefaultAnalyticsCollectorExternalSyntheticLambda52.this), lowerCase);
                        if (fArrRemoteActionCompatParcelizer == null || (strArr = DefaultAnalyticsCollectorExternalSyntheticLambda39.read(DefaultAnalyticsCollectorExternalSyntheticLambda39.AudioAttributesCompatParcelizer.MTML_APP_EVENT_PREDICTION, new float[][]{fArrRemoteActionCompatParcelizer}, new String[]{strIconCompatParcelizer})) == null) {
                            return;
                        }
                        String str3 = strArr[0];
                        DefaultAnalyticsCollectorExternalSyntheticLambda46.AudioAttributesCompatParcelizer(str, str3);
                        if (str3.equals("other")) {
                            return;
                        }
                        DefaultAnalyticsCollectorExternalSyntheticLambda52.IconCompatParcelizer(str3, str2, fArrRemoteActionCompatParcelizer);
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        getMinWindowSequenceNumber.read(th, this);
                    }
                }
            });
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    private static void RemoteActionCompatParcelizer(String str, String str2, float[] fArr) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda52.class)) {
            return;
        }
        try {
            if (DefaultAnalyticsCollectorExternalSyntheticLambda48.RemoteActionCompatParcelizer(str)) {
                new lambdaonVideoFrameProcessingOffset20(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer()).IconCompatParcelizer(str, str2);
            } else if (DefaultAnalyticsCollectorExternalSyntheticLambda48.AudioAttributesCompatParcelizer(str)) {
                read(str, str2, fArr);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda52.class);
        }
    }

    private static void read(String str, String str2, float[] fArr) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda52.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : fArr) {
                    sb.append(f);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString(TtmlNode.TAG_METADATA, jSONObject.toString());
                GraphRequest graphRequestIconCompatParcelizer = GraphRequest.IconCompatParcelizer(null, String.format(Locale.US, "%s/suggested_events", lambdaonMediaMetadataChanged48.write()), null, null);
                graphRequestIconCompatParcelizer.read(bundle);
                graphRequestIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda52.class);
        }
    }
}
