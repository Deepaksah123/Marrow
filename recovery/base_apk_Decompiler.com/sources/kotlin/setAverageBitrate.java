package kotlin;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class setAverageBitrate implements onAudioSinkError {
    private static final Set<String> read = new HashSet();

    @Override // kotlin.onAudioSinkError
    public final void write(String str) {
        AudioAttributesCompatParcelizer();
    }

    private static void AudioAttributesCompatParcelizer() {
        boolean z = ExoPlayerImplExternalSyntheticLambda18.IconCompatParcelizer;
    }

    @Override // kotlin.onAudioSinkError
    public final void read(String str) {
        IconCompatParcelizer(str);
    }

    @Override // kotlin.onAudioSinkError
    public final void IconCompatParcelizer(String str) {
        Set<String> set = read;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }

    @Override // kotlin.onAudioSinkError
    public final void IconCompatParcelizer() {
        boolean z = ExoPlayerImplExternalSyntheticLambda18.IconCompatParcelizer;
    }
}
