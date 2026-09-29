package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda3;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\r\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0014J7\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0018R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0!8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\"R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0016\u0010$\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lo/lambdaonVideoSizeChanged56;", "", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;", "p0", "", "p1", "<init>", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;Ljava/lang/String;)V", "Lo/lambdaonUpstreamDiscarded27;", "", "AudioAttributesCompatParcelizer", "(Lo/lambdaonUpstreamDiscarded27;)V", "", "IconCompatParcelizer", "(Z)V", "Lcom/facebook/GraphRequest;", "Landroid/content/Context;", "p2", "p3", "", "(Lcom/facebook/GraphRequest;Landroid/content/Context;ZZ)I", "Lorg/json/JSONArray;", "p4", "(Lcom/facebook/GraphRequest;Landroid/content/Context;ILorg/json/JSONArray;Z)V", "()I", "read", "", "Ljava/util/List;", "write", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;", "", "()Ljava/util/List;", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "I"}, k = 1, mv = {1, 4, 0})
public final class lambdaonVideoSizeChanged56 {
    private static final String AudioAttributesCompatParcelizer;
    private static final int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<lambdaonUpstreamDiscarded27> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final DefaultAnalyticsCollectorExternalSyntheticLambda51 AudioAttributesCompatParcelizer;
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<lambdaonUpstreamDiscarded27> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    public lambdaonVideoSizeChanged56(DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51, String str) {
        toMagicModuleMetaRepoModel.write(defaultAnalyticsCollectorExternalSyntheticLambda51, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda51;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = new ArrayList();
        this.AudioAttributesImplApi26Parcelizer = new ArrayList();
    }

    public final void AudioAttributesCompatParcelizer(lambdaonUpstreamDiscarded27 p0) {
        synchronized (this) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            try {
                toMagicModuleMetaRepoModel.write(p0, "");
                if (this.IconCompatParcelizer.size() + this.AudioAttributesImplApi26Parcelizer.size() >= IconCompatParcelizer) {
                    this.AudioAttributesImplBaseParcelizer++;
                } else {
                    this.IconCompatParcelizer.add(p0);
                }
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
            }
        }
    }

    public final int AudioAttributesCompatParcelizer() {
        synchronized (this) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return 0;
            }
            try {
                return this.IconCompatParcelizer.size();
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
                return 0;
            }
        }
    }

    public final void IconCompatParcelizer(boolean p0) {
        synchronized (this) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            if (p0) {
                try {
                    this.IconCompatParcelizer.addAll(this.AudioAttributesImplApi26Parcelizer);
                    this.AudioAttributesImplApi26Parcelizer.clear();
                    this.AudioAttributesImplBaseParcelizer = 0;
                    return;
                } catch (Throwable th) {
                    getMinWindowSequenceNumber.read(th, this);
                    return;
                }
            }
            this.AudioAttributesImplApi26Parcelizer.clear();
            this.AudioAttributesImplBaseParcelizer = 0;
            return;
        }
    }

    public final int IconCompatParcelizer(GraphRequest p0, Context p1, boolean p2, boolean p3) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return 0;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            synchronized (this) {
                try {
                    int i = this.AudioAttributesImplBaseParcelizer;
                    DefaultAnalyticsCollectorExternalSyntheticLambda20.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
                    this.AudioAttributesImplApi26Parcelizer.addAll(this.IconCompatParcelizer);
                    this.IconCompatParcelizer.clear();
                    JSONArray jSONArray = new JSONArray();
                    for (lambdaonUpstreamDiscarded27 lambdaonupstreamdiscarded27 : this.AudioAttributesImplApi26Parcelizer) {
                        if (lambdaonupstreamdiscarded27.AudioAttributesCompatParcelizer()) {
                            if (p2 || !lambdaonupstreamdiscarded27.getAudioAttributesCompatParcelizer()) {
                                jSONArray.put(lambdaonupstreamdiscarded27.getRemoteActionCompatParcelizer());
                            }
                        } else {
                            Objects.toString(lambdaonupstreamdiscarded27);
                            DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesImplApi26Parcelizer();
                        }
                    }
                    if (jSONArray.length() == 0) {
                        return 0;
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    IconCompatParcelizer(p0, p1, i, jSONArray, p3);
                    return jSONArray.length();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            getMinWindowSequenceNumber.read(th2, this);
            return 0;
        }
    }

    public final List<lambdaonUpstreamDiscarded27> write() {
        synchronized (this) {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return null;
            }
            try {
                List<lambdaonUpstreamDiscarded27> list = this.IconCompatParcelizer;
                this.IconCompatParcelizer = new ArrayList();
                return list;
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, this);
                return null;
            }
        }
    }

    private final void IconCompatParcelizer(GraphRequest p0, Context p1, int p2, JSONArray p3, boolean p4) {
        JSONObject jSONObject;
        try {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            try {
                jSONObject = DefaultAnalyticsCollectorExternalSyntheticLambda3.read(DefaultAnalyticsCollectorExternalSyntheticLambda3.RemoteActionCompatParcelizer.CUSTOM_APP_EVENTS, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, p4, p1);
                if (this.AudioAttributesImplBaseParcelizer > 0) {
                    jSONObject.put("num_skipped_events", p2);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            p0.read(jSONObject);
            Bundle mediaBrowserCompatMediaItem = p0.getMediaBrowserCompatMediaItem();
            String string = p3.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            mediaBrowserCompatMediaItem.putString("custom_events", string);
            p0.IconCompatParcelizer((Object) string);
            p0.read(mediaBrowserCompatMediaItem);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
        }
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("SessionEventsState", "");
        AudioAttributesCompatParcelizer = "SessionEventsState";
        IconCompatParcelizer = 1000;
    }
}
