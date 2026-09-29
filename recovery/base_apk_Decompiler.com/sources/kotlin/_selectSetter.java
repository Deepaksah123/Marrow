package kotlin;

import android.os.Bundle;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes2.dex */
@getRenewGrpId
public abstract class _selectSetter extends VisibilityChecker.IconCompatParcelizer implements VisibilityChecker.RemoteActionCompatParcelizer {
    private Bundle AudioAttributesCompatParcelizer;
    private anyIgnorals IconCompatParcelizer;
    private setOnChartValueSelectedListener write;

    protected abstract <T extends POJOPropertyBuilderWithMember> T read(String str, Class<T> cls, POJOPropertyBuilder5 pOJOPropertyBuilder5);

    public _selectSetter() {
    }

    public _selectSetter(PieChart pieChart, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(pieChart, "");
        this.write = pieChart.getSavedStateRegistry();
        this.IconCompatParcelizer = pieChart.getLifecycle();
        this.AudioAttributesCompatParcelizer = bundle;
    }

    @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
    public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(Class<T> cls, withFieldVisibility withfieldvisibility) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
        String str = (String) withfieldvisibility.read(VisibilityChecker.read.write);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (this.write != null) {
            return (T) IconCompatParcelizer(str, cls);
        }
        return (T) read(str, cls, withoutIgnored.AudioAttributesCompatParcelizer(withfieldvisibility));
    }

    private final <T extends POJOPropertyBuilderWithMember> T IconCompatParcelizer(String str, Class<T> cls) {
        setOnChartValueSelectedListener setonchartvalueselectedlistener = this.write;
        toMagicModuleMetaRepoModel.write(setonchartvalueselectedlistener);
        anyIgnorals anyignorals = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(anyignorals);
        withoutNext withoutnextRemoteActionCompatParcelizer = addSetter.RemoteActionCompatParcelizer(setonchartvalueselectedlistener, anyignorals, str, this.AudioAttributesCompatParcelizer);
        T t = (T) read(str, cls, withoutnextRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        t.AudioAttributesCompatParcelizer("androidx.lifecycle.savedstate.vm.tag", withoutnextRemoteActionCompatParcelizer);
        return t;
    }

    @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
    public final <T extends POJOPropertyBuilderWithMember> T read(Class<T> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.IconCompatParcelizer == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        return (T) IconCompatParcelizer(canonicalName, cls);
    }

    @Override // o.VisibilityChecker.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(POJOPropertyBuilderWithMember pOJOPropertyBuilderWithMember) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilderWithMember, "");
        setOnChartValueSelectedListener setonchartvalueselectedlistener = this.write;
        if (setonchartvalueselectedlistener != null) {
            toMagicModuleMetaRepoModel.write(setonchartvalueselectedlistener);
            anyIgnorals anyignorals = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(anyignorals);
            addSetter.read(pOJOPropertyBuilderWithMember, setonchartvalueselectedlistener, anyignorals);
        }
    }
}
