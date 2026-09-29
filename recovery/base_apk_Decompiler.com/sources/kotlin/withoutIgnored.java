package kotlin;

import android.os.Bundle;
import kotlin.POJOPropertyBuilder5;
import kotlin.VisibilityChecker;
import kotlin.anyIgnorals;
import kotlin.setOnChartValueSelectedListener;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes.dex */
public final class withoutIgnored {
    public static final withFieldVisibility.read<TypeResolutionContext> AudioAttributesCompatParcelizer;
    public static final withFieldVisibility.read<PieChart> read;
    public static final withFieldVisibility.read<Bundle> write;

    public static final class AudioAttributesCompatParcelizer implements withFieldVisibility.read<TypeResolutionContext> {
    }

    public static final class RemoteActionCompatParcelizer implements withFieldVisibility.read<Bundle> {
    }

    public static final class read implements withFieldVisibility.read<PieChart> {
    }

    public static final <T extends PieChart & TypeResolutionContext> void IconCompatParcelizer(T t) {
        toMagicModuleMetaRepoModel.write(t, "");
        hasGetter hasgetter = (hasGetter) t;
        anyIgnorals.write audioAttributesImplApi26Parcelizer = hasgetter.getLifecycle().getAudioAttributesImplApi26Parcelizer();
        if (audioAttributesImplApi26Parcelizer != anyIgnorals.write.IconCompatParcelizer && audioAttributesImplApi26Parcelizer != anyIgnorals.write.read) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.getSavedStateRegistry().IconCompatParcelizer("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            withoutNonVisible withoutnonvisible = new withoutNonVisible(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().IconCompatParcelizer("androidx.lifecycle.internal.SavedStateHandlesProvider", withoutnonvisible);
            hasgetter.getLifecycle().IconCompatParcelizer(new POJOPropertyBuilder4(withoutnonvisible));
        }
    }

    private static final POJOPropertyBuilder5 write(PieChart pieChart, TypeResolutionContext typeResolutionContext, String str, Bundle bundle) {
        withoutNonVisible withoutnonvisibleWrite = write(pieChart);
        POJOPropertyBuilderMemberIterator pOJOPropertyBuilderMemberIteratorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(typeResolutionContext);
        POJOPropertyBuilder5 pOJOPropertyBuilder5 = pOJOPropertyBuilderMemberIteratorRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().get(str);
        if (pOJOPropertyBuilder5 != null) {
            return pOJOPropertyBuilder5;
        }
        POJOPropertyBuilder5.Companion companion = POJOPropertyBuilder5.INSTANCE;
        POJOPropertyBuilder5 pOJOPropertyBuilder5IconCompatParcelizer = POJOPropertyBuilder5.Companion.IconCompatParcelizer(withoutnonvisibleWrite.write(str), bundle);
        pOJOPropertyBuilderMemberIteratorRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().put(str, pOJOPropertyBuilder5IconCompatParcelizer);
        return pOJOPropertyBuilder5IconCompatParcelizer;
    }

    public static final POJOPropertyBuilder5 AudioAttributesCompatParcelizer(withFieldVisibility withfieldvisibility) {
        toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
        PieChart pieChart = (PieChart) withfieldvisibility.read(read);
        if (pieChart == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        TypeResolutionContext typeResolutionContext = (TypeResolutionContext) withfieldvisibility.read(AudioAttributesCompatParcelizer);
        if (typeResolutionContext == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) withfieldvisibility.read(write);
        String str = (String) withfieldvisibility.read(VisibilityChecker.IconCompatParcelizer);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        return write(pieChart, typeResolutionContext, str, bundle);
    }

    public static final POJOPropertyBuilderMemberIterator RemoteActionCompatParcelizer(TypeResolutionContext typeResolutionContext) {
        toMagicModuleMetaRepoModel.write(typeResolutionContext, "");
        VisibilityChecker.Companion companion = VisibilityChecker.INSTANCE;
        return (POJOPropertyBuilderMemberIterator) VisibilityChecker.Companion.IconCompatParcelizer(typeResolutionContext, new IconCompatParcelizer(), null, 4).write("androidx.lifecycle.internal.SavedStateHandlesVM", toMagicModuleMetaDataUcModel.write(POJOPropertyBuilderMemberIterator.class));
    }

    public static final class IconCompatParcelizer implements VisibilityChecker.RemoteActionCompatParcelizer {
        IconCompatParcelizer() {
        }

        @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
        public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(isHdPlaybackError<T> ishdplaybackerror, withFieldVisibility withfieldvisibility) {
            toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
            toMagicModuleMetaRepoModel.write(withfieldvisibility, "");
            return new POJOPropertyBuilderMemberIterator();
        }
    }

    private static withoutNonVisible write(PieChart pieChart) {
        toMagicModuleMetaRepoModel.write(pieChart, "");
        setOnChartValueSelectedListener.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = pieChart.getSavedStateRegistry().IconCompatParcelizer("androidx.lifecycle.internal.SavedStateHandlesProvider");
        withoutNonVisible withoutnonvisible = audioAttributesCompatParcelizerIconCompatParcelizer instanceof withoutNonVisible ? (withoutNonVisible) audioAttributesCompatParcelizerIconCompatParcelizer : null;
        if (withoutnonvisible != null) {
            return withoutnonvisible;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    static {
        withFieldVisibility.Companion companion = withFieldVisibility.INSTANCE;
        read = new read();
        withFieldVisibility.Companion companion2 = withFieldVisibility.INSTANCE;
        AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        withFieldVisibility.Companion companion3 = withFieldVisibility.INSTANCE;
        write = new RemoteActionCompatParcelizer();
    }
}
