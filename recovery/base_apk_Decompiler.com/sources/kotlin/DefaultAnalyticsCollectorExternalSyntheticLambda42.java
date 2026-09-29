package kotlin;

import android.os.Bundle;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda45;
import kotlin.Metadata;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda42;", "", "<init>", "()V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$RemoteActionCompatParcelizer;", "p0", "", "p1", "", "Lo/lambdaonUpstreamDiscarded27;", "p2", "Landroid/os/Bundle;", "read", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda45$RemoteActionCompatParcelizer;Ljava/lang/String;Ljava/util/List;)Landroid/os/Bundle;", "Lorg/json/JSONArray;", "RemoteActionCompatParcelizer", "(Ljava/util/List;Ljava/lang/String;)Lorg/json/JSONArray;", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Z", "IconCompatParcelizer", "Ljava/lang/String;", "write"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda42 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda42 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda42();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final String write;

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("RemoteServiceWrapper", "");
        write = "RemoteServiceWrapper";
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda42() {
    }

    @getMagicModuleMeta
    public static final Bundle read(DefaultAnalyticsCollectorExternalSyntheticLambda45.RemoteActionCompatParcelizer p0, String p1, List<lambdaonUpstreamDiscarded27> p2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda42.class)) {
            return null;
        }
        try {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Bundle bundle = new Bundle();
            bundle.putString("event", p0.toString());
            bundle.putString("app_id", p1);
            if (DefaultAnalyticsCollectorExternalSyntheticLambda45.RemoteActionCompatParcelizer.CUSTOM_APP_EVENTS == p0) {
                JSONArray jSONArrayRemoteActionCompatParcelizer = INSTANCE.RemoteActionCompatParcelizer(p2, p1);
                if (jSONArrayRemoteActionCompatParcelizer.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", jSONArrayRemoteActionCompatParcelizer.toString());
            }
            return bundle;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda42.class);
            return null;
        }
    }

    private final JSONArray RemoteActionCompatParcelizer(List<lambdaonUpstreamDiscarded27> p0, String p1) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<lambdaonUpstreamDiscarded27> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) p0);
            DefaultAnalyticsCollectorExternalSyntheticLambda20.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver);
            boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p1);
            for (lambdaonUpstreamDiscarded27 lambdaonupstreamdiscarded27 : listMediaBrowserCompatItemReceiver) {
                if (lambdaonupstreamdiscarded27.AudioAttributesCompatParcelizer()) {
                    if (!lambdaonupstreamdiscarded27.getAudioAttributesCompatParcelizer() || (lambdaonupstreamdiscarded27.getAudioAttributesCompatParcelizer() && zAudioAttributesCompatParcelizer)) {
                        jSONArray.put(lambdaonupstreamdiscarded27.getRemoteActionCompatParcelizer());
                    }
                } else {
                    Objects.toString(lambdaonupstreamdiscarded27);
                    DefaultAnalyticsCollectorMediaPeriodQueueTracker.AudioAttributesImplApi26Parcelizer();
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    private final boolean AudioAttributesCompatParcelizer(String p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return false;
        }
        try {
            DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(p0, false);
            if (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer != null) {
                return defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getOnCommand();
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return false;
        }
    }
}
