package kotlin;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda51;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonSurfaceSizeChanged22 {
    private final HashMap<lambdaonSkipSilenceEnabledChanged53, lambdaonVideoSizeChanged56> IconCompatParcelizer = new HashMap<>();

    public final void read(lambdaonVolumeChanged12 lambdaonvolumechanged12) {
        synchronized (this) {
            if (lambdaonvolumechanged12 == null) {
                return;
            }
            for (lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53 : lambdaonvolumechanged12.IconCompatParcelizer()) {
                lambdaonVideoSizeChanged56 lambdaonvideosizechanged56AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(lambdaonskipsilenceenabledchanged53);
                if (lambdaonvideosizechanged56AudioAttributesCompatParcelizer != null) {
                    List<lambdaonUpstreamDiscarded27> listWrite = lambdaonvolumechanged12.write(lambdaonskipsilenceenabledchanged53);
                    if (listWrite == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    Iterator<lambdaonUpstreamDiscarded27> it = listWrite.iterator();
                    while (it.hasNext()) {
                        lambdaonvideosizechanged56AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(it.next());
                    }
                }
            }
        }
    }

    public final void IconCompatParcelizer(lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53, lambdaonUpstreamDiscarded27 lambdaonupstreamdiscarded27) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(lambdaonskipsilenceenabledchanged53, "");
            toMagicModuleMetaRepoModel.write(lambdaonupstreamdiscarded27, "");
            lambdaonVideoSizeChanged56 lambdaonvideosizechanged56AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(lambdaonskipsilenceenabledchanged53);
            if (lambdaonvideosizechanged56AudioAttributesCompatParcelizer != null) {
                lambdaonvideosizechanged56AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(lambdaonupstreamdiscarded27);
            }
        }
    }

    public final Set<lambdaonSkipSilenceEnabledChanged53> IconCompatParcelizer() {
        Set<lambdaonSkipSilenceEnabledChanged53> setKeySet;
        synchronized (this) {
            setKeySet = this.IconCompatParcelizer.keySet();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setKeySet, "");
        }
        return setKeySet;
    }

    public final lambdaonVideoSizeChanged56 IconCompatParcelizer(lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53) {
        lambdaonVideoSizeChanged56 lambdaonvideosizechanged56;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(lambdaonskipsilenceenabledchanged53, "");
            lambdaonvideosizechanged56 = this.IconCompatParcelizer.get(lambdaonskipsilenceenabledchanged53);
        }
        return lambdaonvideosizechanged56;
    }

    public final int read() {
        int iAudioAttributesCompatParcelizer;
        synchronized (this) {
            Iterator<lambdaonVideoSizeChanged56> it = this.IconCompatParcelizer.values().iterator();
            iAudioAttributesCompatParcelizer = 0;
            while (it.hasNext()) {
                iAudioAttributesCompatParcelizer += it.next().AudioAttributesCompatParcelizer();
            }
        }
        return iAudioAttributesCompatParcelizer;
    }

    private final lambdaonVideoSizeChanged56 AudioAttributesCompatParcelizer(lambdaonSkipSilenceEnabledChanged53 lambdaonskipsilenceenabledchanged53) {
        synchronized (this) {
            lambdaonVideoSizeChanged56 lambdaonvideosizechanged56 = this.IconCompatParcelizer.get(lambdaonskipsilenceenabledchanged53);
            if (lambdaonvideosizechanged56 == null) {
                Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
                DefaultAnalyticsCollectorExternalSyntheticLambda51.Companion companion = DefaultAnalyticsCollectorExternalSyntheticLambda51.INSTANCE;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
                DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51AudioAttributesCompatParcelizer = companion.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer);
                if (defaultAnalyticsCollectorExternalSyntheticLambda51AudioAttributesCompatParcelizer != null) {
                    String strIconCompatParcelizer = lambdaonVideoDisabled18.IconCompatParcelizer(contextAudioAttributesCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strIconCompatParcelizer, "");
                    lambdaonvideosizechanged56 = new lambdaonVideoSizeChanged56(defaultAnalyticsCollectorExternalSyntheticLambda51AudioAttributesCompatParcelizer, strIconCompatParcelizer);
                } else {
                    lambdaonvideosizechanged56 = null;
                }
            }
            if (lambdaonvideosizechanged56 == null) {
                return null;
            }
            this.IconCompatParcelizer.put(lambdaonskipsilenceenabledchanged53, lambdaonvideosizechanged56);
            return lambdaonvideosizechanged56;
        }
    }
}
