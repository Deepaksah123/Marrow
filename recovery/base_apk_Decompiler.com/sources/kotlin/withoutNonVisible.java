package kotlin;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.setOnChartValueSelectedListener;

/* JADX INFO: loaded from: classes2.dex */
public final class withoutNonVisible implements setOnChartValueSelectedListener.AudioAttributesCompatParcelizer {
    private boolean AudioAttributesCompatParcelizer;
    private final setOnChartValueSelectedListener IconCompatParcelizer;
    private final RenewEligible RemoteActionCompatParcelizer;
    private Bundle read;

    public withoutNonVisible(setOnChartValueSelectedListener setonchartvalueselectedlistener, final TypeResolutionContext typeResolutionContext) {
        toMagicModuleMetaRepoModel.write(setonchartvalueselectedlistener, "");
        toMagicModuleMetaRepoModel.write(typeResolutionContext, "");
        this.IconCompatParcelizer = setonchartvalueselectedlistener;
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.withValue
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return withoutNonVisible.RemoteActionCompatParcelizer(typeResolutionContext);
            }
        });
    }

    private final POJOPropertyBuilderMemberIterator AudioAttributesCompatParcelizer() {
        return (POJOPropertyBuilderMemberIterator) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final POJOPropertyBuilderMemberIterator RemoteActionCompatParcelizer(TypeResolutionContext typeResolutionContext) {
        return withoutIgnored.RemoteActionCompatParcelizer(typeResolutionContext);
    }

    public final void write() {
        Pair[] pairArr;
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        Bundle bundleRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map map = VideoTimelineResponseBody.read();
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(setAction.write((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleWrite = _getIndexResolver.write((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleAudioAttributesCompatParcelizer = setDrawOrder.AudioAttributesCompatParcelizer(bundleWrite);
        Bundle bundle = this.read;
        if (bundle != null) {
            setDrawOrder.AudioAttributesCompatParcelizer(bundleAudioAttributesCompatParcelizer, bundle);
        }
        if (bundleRemoteActionCompatParcelizer != null) {
            setDrawOrder.AudioAttributesCompatParcelizer(bundleAudioAttributesCompatParcelizer, bundleRemoteActionCompatParcelizer);
        }
        this.read = bundleWrite;
        this.AudioAttributesCompatParcelizer = true;
        AudioAttributesCompatParcelizer();
    }

    public final Bundle write(String str) {
        Pair[] pairArr;
        toMagicModuleMetaRepoModel.write(str, "");
        write();
        Bundle bundle = this.read;
        if (bundle == null || !setUnbindEnabled.RemoteActionCompatParcelizer(setUnbindEnabled.RemoteActionCompatParcelizer(bundle), str)) {
            return null;
        }
        Bundle bundleAudioAttributesCompatParcelizer = setUnbindEnabled.AudioAttributesCompatParcelizer(setUnbindEnabled.RemoteActionCompatParcelizer(bundle), str);
        if (bundleAudioAttributesCompatParcelizer == null) {
            Map map = VideoTimelineResponseBody.read();
            if (map.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(setAction.write((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleAudioAttributesCompatParcelizer = _getIndexResolver.write((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            setDrawOrder.AudioAttributesCompatParcelizer(bundleAudioAttributesCompatParcelizer);
        }
        setDrawOrder.AudioAttributesCompatParcelizer(setDrawOrder.AudioAttributesCompatParcelizer(bundle), str);
        if (setUnbindEnabled.write(setUnbindEnabled.RemoteActionCompatParcelizer(bundle))) {
            this.read = null;
        }
        return bundleAudioAttributesCompatParcelizer;
    }

    @Override // o.setOnChartValueSelectedListener.AudioAttributesCompatParcelizer
    public final Bundle read() {
        Pair[] pairArr;
        Map map = VideoTimelineResponseBody.read();
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(setAction.write((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleWrite = _getIndexResolver.write((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleAudioAttributesCompatParcelizer = setDrawOrder.AudioAttributesCompatParcelizer(bundleWrite);
        Bundle bundle = this.read;
        if (bundle != null) {
            setDrawOrder.AudioAttributesCompatParcelizer(bundleAudioAttributesCompatParcelizer, bundle);
        }
        for (Map.Entry<String, POJOPropertyBuilder5> entry2 : AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().entrySet()) {
            String key = entry2.getKey();
            Bundle bundle2 = entry2.getValue().IconCompatParcelizer().read();
            if (!setUnbindEnabled.write(setUnbindEnabled.RemoteActionCompatParcelizer(bundle2))) {
                setDrawOrder.IconCompatParcelizer(bundleAudioAttributesCompatParcelizer, key, bundle2);
            }
        }
        this.AudioAttributesCompatParcelizer = false;
        return bundleWrite;
    }
}
