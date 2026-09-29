package kotlin;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.setRenderer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0007J\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u000ej\u0002`\u000fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "impl", "Landroidx/savedstate/internal/SavedStateRegistryImpl;", "<init>", "(Landroidx/savedstate/internal/SavedStateRegistryImpl;)V", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "performAttach", "", "performRestore", "savedState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "performSave", "outBundle", "Companion", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setRenderer {
    public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private final setCenterTextOffset RemoteActionCompatParcelizer;
    private final setOnChartValueSelectedListener read;

    private setRenderer(setCenterTextOffset setcentertextoffset) {
        this.RemoteActionCompatParcelizer = setcentertextoffset;
        this.read = new setOnChartValueSelectedListener(setcentertextoffset);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final setOnChartValueSelectedListener getRead() {
        return this.read;
    }

    public final void write() {
        this.RemoteActionCompatParcelizer.read();
    }

    public final void AudioAttributesCompatParcelizer(Bundle bundle) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(bundle);
    }

    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(bundle);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setRenderer$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/PieChart;", "p0", "Lo/setRenderer;", "RemoteActionCompatParcelizer", "(Lo/PieChart;)Lo/setRenderer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static setRenderer RemoteActionCompatParcelizer(final PieChart p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new setRenderer(new setCenterTextOffset(p0, new getCreatedOnDateMs() { // from class: o.HorizontalBarChart
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return setRenderer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
                }
            }), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(PieChart pieChart) {
            pieChart.getLifecycle().IconCompatParcelizer(new setNoDataText(pieChart));
            return getShowPopup.INSTANCE;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ setRenderer(setCenterTextOffset setcentertextoffset, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setcentertextoffset);
    }

    @getMagicModuleMeta
    public static final setRenderer AudioAttributesCompatParcelizer(PieChart pieChart) {
        return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(pieChart);
    }
}
