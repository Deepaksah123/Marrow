package kotlin;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.JavaBigIntegerFromCharSequence;
import kotlin.Metadata;
import kotlin.getSetterUnchecked;
import kotlin.setRenderer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0011\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0002J\u0011\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096\u0001J\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\u001d\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\"0!H\u0096\u0001J!\u0010#\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryWrapper;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/savedstate/SavedStateRegistryOwner;", TtmlNode.RUBY_BASE, "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", LogCategory.LIFECYCLE, "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle", "()Landroidx/lifecycle/LifecycleRegistry;", "_lifecycle", "getOrInitLifecycle", "controller", "Landroidx/savedstate/SavedStateRegistryController;", "getController", "()Landroidx/savedstate/SavedStateRegistryController;", "_controller", "getOrInitController", "savedState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "canBeSaved", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "consumeRestored", "key", "", "performSave", "", "", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "Lkotlin/Function0;", "runtime-saveable"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class skipZeroes implements JavaBigIntegerFromCharSequence, PieChart {
    private setRenderer AudioAttributesCompatParcelizer;
    private final /* synthetic */ JavaBigIntegerFromCharSequence read;
    private getSetterUnchecked write;

    public skipZeroes(JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence) {
        this.read = javaBigIntegerFromCharSequence;
        Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objAudioAttributesCompatParcelizer instanceof Bundle ? (Bundle) objAudioAttributesCompatParcelizer : null;
        if (bundle != null) {
            write(bundle);
        }
        read("androidx.savedstate.SavedStateRegistry", new getCreatedOnDateMs() { // from class: o.parseHexDigits
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return skipZeroes.write(this.read);
            }
        });
    }

    @Override // kotlin.hasGetter
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final getSetterUnchecked getLifecycle() {
        return RemoteActionCompatParcelizer();
    }

    private final getSetterUnchecked RemoteActionCompatParcelizer() {
        getSetterUnchecked getsetterunchecked = this.write;
        if (getsetterunchecked != null) {
            return getsetterunchecked;
        }
        getSetterUnchecked.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getSetterUnchecked.read;
        getSetterUnchecked getsetteruncheckedRemoteActionCompatParcelizer = getSetterUnchecked.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
        this.write = getsetteruncheckedRemoteActionCompatParcelizer;
        return getsetteruncheckedRemoteActionCompatParcelizer;
    }

    private final setRenderer IconCompatParcelizer() {
        return write((Bundle) null);
    }

    private final setRenderer write(Bundle bundle) {
        setRenderer setrenderer = this.AudioAttributesCompatParcelizer;
        if (setrenderer != null) {
            return setrenderer;
        }
        setRenderer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setRenderer.AudioAttributesCompatParcelizer;
        setRenderer setrendererRemoteActionCompatParcelizer = setRenderer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
        this.AudioAttributesCompatParcelizer = setrendererRemoteActionCompatParcelizer;
        setrendererRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(bundle);
        return setrendererRemoteActionCompatParcelizer;
    }

    @Override // kotlin.PieChart
    public final setOnChartValueSelectedListener getSavedStateRegistry() {
        return IconCompatParcelizer().getRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(skipZeroes skipzeroes) {
        Pair[] pairArr;
        setRenderer setrenderer = skipzeroes.AudioAttributesCompatParcelizer;
        if (setrenderer == null) {
            return null;
        }
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
        setDrawOrder.AudioAttributesCompatParcelizer(bundleWrite);
        setrenderer.RemoteActionCompatParcelizer(bundleWrite);
        if (setUnbindEnabled.write(setUnbindEnabled.RemoteActionCompatParcelizer(bundleWrite))) {
            return null;
        }
        return bundleWrite;
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final boolean AudioAttributesCompatParcelizer(Object obj) {
        return this.read.AudioAttributesCompatParcelizer(obj);
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final Object AudioAttributesCompatParcelizer(String str) {
        return this.read.AudioAttributesCompatParcelizer(str);
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final Map<String, List<Object>> read() {
        return this.read.read();
    }

    @Override // kotlin.JavaBigIntegerFromCharSequence
    public final JavaBigIntegerFromCharSequence.read read(String str, getCreatedOnDateMs<? extends Object> getcreatedondatems) {
        return this.read.read(str, getcreatedondatems);
    }
}
