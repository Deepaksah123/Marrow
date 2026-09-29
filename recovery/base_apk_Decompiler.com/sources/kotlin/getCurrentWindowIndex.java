package kotlin;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes2.dex */
public interface getCurrentWindowIndex {
    void AudioAttributesCompatParcelizer(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, WorkerParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void write(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, int i);

    default void AudioAttributesCompatParcelizer(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener) {
        toMagicModuleMetaRepoModel.write(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, "");
        AudioAttributesCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, null);
    }

    default void read(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener) {
        toMagicModuleMetaRepoModel.write(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, "");
        write(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, -512);
    }

    default void RemoteActionCompatParcelizer(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, int i) {
        toMagicModuleMetaRepoModel.write(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, "");
        write(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, i);
    }
}
