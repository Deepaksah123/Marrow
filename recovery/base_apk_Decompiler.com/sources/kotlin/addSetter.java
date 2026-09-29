package kotlin;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.anyIgnorals;
import kotlin.setOnChartValueSelectedListener;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/addSetter;", "", "<init>", "()V", "Lo/setOnChartValueSelectedListener;", "p0", "Lo/anyIgnorals;", "p1", "", "p2", "Landroid/os/Bundle;", "p3", "Lo/withoutNext;", "RemoteActionCompatParcelizer", "(Lo/setOnChartValueSelectedListener;Lo/anyIgnorals;Ljava/lang/String;Landroid/os/Bundle;)Lo/withoutNext;", "Lo/POJOPropertyBuilderWithMember;", "", "read", "(Lo/POJOPropertyBuilderWithMember;Lo/setOnChartValueSelectedListener;Lo/anyIgnorals;)V", "AudioAttributesCompatParcelizer", "(Lo/setOnChartValueSelectedListener;Lo/anyIgnorals;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addSetter {
    public static final addSetter INSTANCE = new addSetter();

    private addSetter() {
    }

    @getMagicModuleMeta
    public static final withoutNext RemoteActionCompatParcelizer(setOnChartValueSelectedListener p0, anyIgnorals p1, String p2, Bundle p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write((Object) p2);
        Bundle bundleRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer(p2);
        POJOPropertyBuilder5.Companion companion = POJOPropertyBuilder5.INSTANCE;
        withoutNext withoutnext = new withoutNext(p2, POJOPropertyBuilder5.Companion.IconCompatParcelizer(bundleRemoteActionCompatParcelizer, p3));
        withoutnext.RemoteActionCompatParcelizer(p0, p1);
        AudioAttributesCompatParcelizer(p0, p1);
        return withoutnext;
    }

    @getMagicModuleMeta
    public static final void read(POJOPropertyBuilderWithMember p0, setOnChartValueSelectedListener p1, anyIgnorals p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        withoutNext withoutnext = (withoutNext) p0.IconCompatParcelizer("androidx.lifecycle.savedstate.vm.tag");
        if (withoutnext == null || withoutnext.read()) {
            return;
        }
        withoutnext.RemoteActionCompatParcelizer(p1, p2);
        AudioAttributesCompatParcelizer(p1, p2);
    }

    private static void AudioAttributesCompatParcelizer(setOnChartValueSelectedListener p0, anyIgnorals p1) {
        anyIgnorals.write audioAttributesImplApi26Parcelizer = p1.getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer == anyIgnorals.write.IconCompatParcelizer || audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(anyIgnorals.write.RemoteActionCompatParcelizer)) {
            p0.write(RemoteActionCompatParcelizer.class);
        } else {
            p1.IconCompatParcelizer(new read(p1, p0));
        }
    }

    public static final class read implements findAccess {
        final /* synthetic */ setOnChartValueSelectedListener read;
        final /* synthetic */ anyIgnorals write;

        read(anyIgnorals anyignorals, setOnChartValueSelectedListener setonchartvalueselectedlistener) {
            this.write = anyignorals;
            this.read = setonchartvalueselectedlistener;
        }

        @Override // kotlin.findAccess
        public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
            toMagicModuleMetaRepoModel.write(hasgetter, "");
            toMagicModuleMetaRepoModel.write(readVar, "");
            if (readVar == anyIgnorals.read.ON_START) {
                this.write.AudioAttributesCompatParcelizer(this);
                this.read.write(RemoteActionCompatParcelizer.class);
            }
        }
    }

    public static final class RemoteActionCompatParcelizer implements setOnChartValueSelectedListener.write {
        @Override // o.setOnChartValueSelectedListener.write
        public final void IconCompatParcelizer(PieChart pieChart) {
            toMagicModuleMetaRepoModel.write(pieChart, "");
            if (!(pieChart instanceof TypeResolutionContext)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(String.valueOf(pieChart)).toString());
            }
            hasMixIns viewModelStore = ((TypeResolutionContext) pieChart).getViewModelStore();
            setOnChartValueSelectedListener savedStateRegistry = pieChart.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.AudioAttributesCompatParcelizer().iterator();
            while (it.hasNext()) {
                POJOPropertyBuilderWithMember pOJOPropertyBuilderWithMemberRemoteActionCompatParcelizer = viewModelStore.RemoteActionCompatParcelizer(it.next());
                if (pOJOPropertyBuilderWithMemberRemoteActionCompatParcelizer != null) {
                    addSetter.read(pOJOPropertyBuilderWithMemberRemoteActionCompatParcelizer, savedStateRegistry, pieChart.getLifecycle());
                }
            }
            if (viewModelStore.AudioAttributesCompatParcelizer().isEmpty()) {
                return;
            }
            savedStateRegistry.write(RemoteActionCompatParcelizer.class);
        }
    }
}
