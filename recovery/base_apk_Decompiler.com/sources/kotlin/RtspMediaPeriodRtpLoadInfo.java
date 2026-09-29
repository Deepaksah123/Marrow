package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMediaPeriodRtpLoadInfo extends RtspMediaPeriodListener {
    private FirebaseAnalytics RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtspMediaPeriodRtpLoadInfo(Context context) {
        super(updateLoadingFinished.RemoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.write(context, "");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(firebaseAnalytics, "");
        this.RemoteActionCompatParcelizer = firebaseAnalytics;
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void AudioAttributesCompatParcelizer(String str, Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.RemoteActionCompatParcelizer.logEvent(str, AudioAttributesCompatParcelizer(map));
        resumeLoad resumeload = resumeLoad.IconCompatParcelizer;
        RtspMediaPeriodSampleStreamImpl.write(str);
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void write(Map<String, ? extends Object> map, Map<updateLoadingFinished, ? extends List<String>> map2) {
        List<String> list;
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        if (!map2.isEmpty() && (list = map2.get(updateLoadingFinished.RemoteActionCompatParcelizer)) != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                List<String> list2 = map2.get(updateLoadingFinished.RemoteActionCompatParcelizer);
                toMagicModuleMetaRepoModel.write(list2);
                if (!list2.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            map = linkedHashMap;
        }
        for (Map.Entry<String, ? extends Object> entry2 : map.entrySet()) {
            this.RemoteActionCompatParcelizer.setUserProperty(entry2.getKey(), entry2.getValue().toString());
        }
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void AudioAttributesCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        FirebaseAnalytics firebaseAnalytics = this.RemoteActionCompatParcelizer;
        Bundle bundle = new Bundle();
        bundle.putString("screen_name", str);
        bundle.putString("screen_class", str2);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        firebaseAnalytics.logEvent("screen_view", bundle);
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer.setUserId(str);
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.setUserId(null);
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer(Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
    }
}
