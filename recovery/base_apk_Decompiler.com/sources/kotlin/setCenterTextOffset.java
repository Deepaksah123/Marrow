package kotlin;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.anyIgnorals;
import kotlin.setOnChartValueSelectedListener;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u001e\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0006\u0010\u001f\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0010H\u0007J\u0010\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u000fJ\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000fH\u0007J\b\u0010%\u001a\u00020\u0006H\u0007J\u001f\u0010&\u001a\u00020\u00062\u000e\u0010'\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0001¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u00062\n\u0010+\u001a\u00060\u0014j\u0002`\u0015H\u0001¢\u0006\u0004\b,\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R \u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00128G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Landroidx/savedstate/internal/SavedStateRegistryImpl;", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "onAttach", "Lkotlin/Function0;", "", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;Lkotlin/jvm/functions/Function0;)V", "getOnAttach$savedstate_release", "()Lkotlin/jvm/functions/Function0;", "lock", "Landroidx/savedstate/internal/SynchronizedObject;", "keyToProviders", "", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "attached", "", "restoredState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "Landroid/os/Bundle;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isRestored", "()Z", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "consumeRestoredStateForKey", "key", "(Ljava/lang/String;)Landroid/os/Bundle;", "registerSavedStateProvider", "provider", "getSavedStateProvider", "unregisterSavedStateProvider", "performAttach", "performRestore", "savedState", "performRestore$savedstate_release", "(Landroid/os/Bundle;)V", "performSave", "outBundle", "performSave$savedstate_release", "Companion", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setCenterTextOffset {
    private static final read write = new read(null);
    private final Map<String, setOnChartValueSelectedListener.AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
    private final PieChart AudioAttributesImplApi21Parcelizer;
    private final setCenterTextSizePixels AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private final getCreatedOnDateMs<getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
    private Bundle MediaBrowserCompatItemReceiver;
    private boolean RemoteActionCompatParcelizer;
    private boolean read;

    public setCenterTextOffset(PieChart pieChart, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(pieChart, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.AudioAttributesImplApi21Parcelizer = pieChart;
        this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems;
        this.AudioAttributesImplBaseParcelizer = new setCenterTextSizePixels();
        this.AudioAttributesCompatParcelizer = new LinkedHashMap();
        this.read = true;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final Bundle RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (!this.IconCompatParcelizer) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state".toString());
        }
        Bundle bundle = this.MediaBrowserCompatItemReceiver;
        if (bundle == null) {
            return null;
        }
        Bundle bundleRemoteActionCompatParcelizer = setUnbindEnabled.RemoteActionCompatParcelizer(bundle);
        Bundle bundle2 = setUnbindEnabled.RemoteActionCompatParcelizer(bundleRemoteActionCompatParcelizer, str) ? setUnbindEnabled.read(bundleRemoteActionCompatParcelizer, str) : null;
        setDrawOrder.AudioAttributesCompatParcelizer(setDrawOrder.AudioAttributesCompatParcelizer(bundle), str);
        if (setUnbindEnabled.write(setUnbindEnabled.RemoteActionCompatParcelizer(bundle))) {
            this.MediaBrowserCompatItemReceiver = null;
        }
        return bundle2;
    }

    public final void RemoteActionCompatParcelizer(String str, setOnChartValueSelectedListener.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            if (!this.AudioAttributesCompatParcelizer.containsKey(str)) {
                this.AudioAttributesCompatParcelizer.put(str, audioAttributesCompatParcelizer);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
            }
        }
    }

    public final setOnChartValueSelectedListener.AudioAttributesCompatParcelizer IconCompatParcelizer(String str) {
        setOnChartValueSelectedListener.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(str, "");
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            Iterator it = this.AudioAttributesCompatParcelizer.entrySet().iterator();
            do {
                audioAttributesCompatParcelizer = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                setOnChartValueSelectedListener.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (setOnChartValueSelectedListener.AudioAttributesCompatParcelizer) entry.getValue();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) str)) {
                    audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                }
            } while (audioAttributesCompatParcelizer == null);
        }
        return audioAttributesCompatParcelizer;
    }

    public final void write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        synchronized (this.AudioAttributesImplBaseParcelizer) {
        }
    }

    public final void read() {
        if (this.AudioAttributesImplApi21Parcelizer.getLifecycle().getAudioAttributesImplApi26Parcelizer() != anyIgnorals.write.IconCompatParcelizer) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        if (this.RemoteActionCompatParcelizer) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        this.MediaBrowserCompatCustomActionResultReceiver.invoke();
        this.AudioAttributesImplApi21Parcelizer.getLifecycle().IconCompatParcelizer(new findAccess() { // from class: o.setCenterTextColor
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                setCenterTextOffset.IconCompatParcelizer(this.read, hasgetter, readVar);
            }
        });
        this.RemoteActionCompatParcelizer = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(setCenterTextOffset setcentertextoffset, hasGetter hasgetter, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        if (readVar == anyIgnorals.read.ON_START) {
            setcentertextoffset.read = true;
        } else if (readVar == anyIgnorals.read.ON_STOP) {
            setcentertextoffset.read = false;
        }
    }

    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        if (!this.RemoteActionCompatParcelizer) {
            read();
        }
        if (this.AudioAttributesImplApi21Parcelizer.getLifecycle().getAudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(anyIgnorals.write.RemoteActionCompatParcelizer)) {
            StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            sb.append(this.AudioAttributesImplApi21Parcelizer.getLifecycle().getAudioAttributesImplApi26Parcelizer());
            throw new IllegalStateException(sb.toString().toString());
        }
        if (this.IconCompatParcelizer) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        Bundle bundle2 = null;
        if (bundle != null) {
            Bundle bundleRemoteActionCompatParcelizer = setUnbindEnabled.RemoteActionCompatParcelizer(bundle);
            if (setUnbindEnabled.RemoteActionCompatParcelizer(bundleRemoteActionCompatParcelizer, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundle2 = setUnbindEnabled.read(bundleRemoteActionCompatParcelizer, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.MediaBrowserCompatItemReceiver = bundle2;
        this.IconCompatParcelizer = true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setCenterTextOffset$read;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final void AudioAttributesCompatParcelizer(Bundle bundle) {
        Pair[] pairArr;
        toMagicModuleMetaRepoModel.write(bundle, "");
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
        Bundle bundle2 = this.MediaBrowserCompatItemReceiver;
        if (bundle2 != null) {
            setDrawOrder.AudioAttributesCompatParcelizer(bundleAudioAttributesCompatParcelizer, bundle2);
        }
        synchronized (this.AudioAttributesImplBaseParcelizer) {
            for (Map.Entry entry2 : this.AudioAttributesCompatParcelizer.entrySet()) {
                setDrawOrder.IconCompatParcelizer(bundleAudioAttributesCompatParcelizer, (String) entry2.getKey(), ((setOnChartValueSelectedListener.AudioAttributesCompatParcelizer) entry2.getValue()).read());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        if (setUnbindEnabled.write(setUnbindEnabled.RemoteActionCompatParcelizer(bundleWrite))) {
            return;
        }
        setDrawOrder.IconCompatParcelizer(setDrawOrder.AudioAttributesCompatParcelizer(bundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleWrite);
    }
}
