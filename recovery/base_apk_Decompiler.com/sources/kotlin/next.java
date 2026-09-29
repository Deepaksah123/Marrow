package kotlin;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes2.dex */
public final class next extends VisibilityChecker.IconCompatParcelizer implements VisibilityChecker.RemoteActionCompatParcelizer {
    private anyIgnorals AudioAttributesCompatParcelizer;
    private setOnChartValueSelectedListener AudioAttributesImplBaseParcelizer;
    private final VisibilityChecker.RemoteActionCompatParcelizer IconCompatParcelizer;
    private Application RemoteActionCompatParcelizer;
    private Bundle write;

    public next() {
        this.IconCompatParcelizer = new VisibilityChecker.AudioAttributesCompatParcelizer();
    }

    public next(Application application, PieChart pieChart, Bundle bundle) {
        VisibilityChecker.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(pieChart, "");
        this.AudioAttributesImplBaseParcelizer = pieChart.getSavedStateRegistry();
        this.AudioAttributesCompatParcelizer = pieChart.getLifecycle();
        this.write = bundle;
        this.RemoteActionCompatParcelizer = application;
        if (application != null) {
            VisibilityChecker.AudioAttributesCompatParcelizer.Companion companion = VisibilityChecker.AudioAttributesCompatParcelizer.INSTANCE;
            audioAttributesCompatParcelizer = VisibilityChecker.AudioAttributesCompatParcelizer.Companion.read(application);
        } else {
            audioAttributesCompatParcelizer = new VisibilityChecker.AudioAttributesCompatParcelizer();
        }
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
    }

    @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
    public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(isHdPlaybackError<T> ishdplaybackerror, withFieldVisibility withfieldvisibility) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
        return (T) AudioAttributesCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerror), withfieldvisibility);
    }

    @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
    public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(Class<T> cls, withFieldVisibility withfieldvisibility) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
        String str = (String) withfieldvisibility.read(VisibilityChecker.IconCompatParcelizer);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (withfieldvisibility.read(withoutIgnored.read) != null && withfieldvisibility.read(withoutIgnored.AudioAttributesCompatParcelizer) != null) {
            Application application = (Application) withfieldvisibility.read(VisibilityChecker.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
            boolean zIsAssignableFrom = addAll.class.isAssignableFrom(cls);
            Constructor constructorWrite = (!zIsAssignableFrom || application == null) ? hasNext.write(cls, hasNext.IconCompatParcelizer) : hasNext.write(cls, hasNext.RemoteActionCompatParcelizer);
            if (constructorWrite == null) {
                return (T) this.IconCompatParcelizer.AudioAttributesCompatParcelizer(cls, withfieldvisibility);
            }
            if (zIsAssignableFrom && application != null) {
                return (T) hasNext.read(cls, constructorWrite, application, withoutIgnored.AudioAttributesCompatParcelizer(withfieldvisibility));
            }
            return (T) hasNext.read(cls, constructorWrite, withoutIgnored.AudioAttributesCompatParcelizer(withfieldvisibility));
        }
        if (this.AudioAttributesCompatParcelizer != null) {
            return (T) write(str, cls);
        }
        throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
    }

    private <T extends POJOPropertyBuilderWithMember> T write(String str, Class<T> cls) {
        T t;
        Application application;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(cls, "");
        anyIgnorals anyignorals = this.AudioAttributesCompatParcelizer;
        if (anyignorals == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = addAll.class.isAssignableFrom(cls);
        Constructor constructorWrite = (!zIsAssignableFrom || this.RemoteActionCompatParcelizer == null) ? hasNext.write(cls, hasNext.IconCompatParcelizer) : hasNext.write(cls, hasNext.RemoteActionCompatParcelizer);
        if (constructorWrite == null) {
            if (this.RemoteActionCompatParcelizer != null) {
                return (T) this.IconCompatParcelizer.read(cls);
            }
            VisibilityChecker.read.Companion companion = VisibilityChecker.read.INSTANCE;
            return (T) VisibilityChecker.read.Companion.read().read(cls);
        }
        setOnChartValueSelectedListener setonchartvalueselectedlistener = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(setonchartvalueselectedlistener);
        withoutNext withoutnextRemoteActionCompatParcelizer = addSetter.RemoteActionCompatParcelizer(setonchartvalueselectedlistener, anyignorals, str, this.write);
        if (zIsAssignableFrom && (application = this.RemoteActionCompatParcelizer) != null) {
            toMagicModuleMetaRepoModel.write(application);
            t = (T) hasNext.read(cls, constructorWrite, application, withoutnextRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        } else {
            t = (T) hasNext.read(cls, constructorWrite, withoutnextRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        }
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
        return (T) write(canonicalName, cls);
    }

    @Override // o.VisibilityChecker.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(POJOPropertyBuilderWithMember pOJOPropertyBuilderWithMember) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilderWithMember, "");
        if (this.AudioAttributesCompatParcelizer != null) {
            setOnChartValueSelectedListener setonchartvalueselectedlistener = this.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.write(setonchartvalueselectedlistener);
            anyIgnorals anyignorals = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(anyignorals);
            addSetter.read(pOJOPropertyBuilderWithMember, setonchartvalueselectedlistener, anyignorals);
        }
    }
}
