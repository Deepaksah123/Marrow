package kotlin;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
abstract class DefaultExtractorsFactoryExternalSyntheticLambda0<S> extends Fragment {
    protected final LinkedHashSet<setTsExtractorFlags<S>> write = new LinkedHashSet<>();

    DefaultExtractorsFactoryExternalSyntheticLambda0() {
    }

    boolean AudioAttributesCompatParcelizer(setTsExtractorFlags<S> settsextractorflags) {
        return this.write.add(settsextractorflags);
    }

    final void AudioAttributesImplApi26Parcelizer() {
        this.write.clear();
    }
}
