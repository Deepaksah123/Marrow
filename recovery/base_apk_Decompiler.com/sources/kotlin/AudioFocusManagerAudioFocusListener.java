package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AudioFocusManagerAudioFocusListener implements setAudioAttributes {
    private final setAudioAttributes AudioAttributesCompatParcelizer;
    private final Object RemoteActionCompatParcelizer;

    public AudioFocusManagerAudioFocusListener(setAudioAttributes setaudioattributes) {
        toMagicModuleMetaRepoModel.write(setaudioattributes, "");
        this.AudioAttributesCompatParcelizer = setaudioattributes;
        this.RemoteActionCompatParcelizer = new Object();
    }

    @Override // kotlin.setAudioAttributes
    public final lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener IconCompatParcelizer(CProjection cProjection) {
        lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(cProjection, "");
        synchronized (this.RemoteActionCompatParcelizer) {
            lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(cProjection);
        }
        return lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerIconCompatParcelizer;
    }

    @Override // kotlin.setAudioAttributes
    public final lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener RemoteActionCompatParcelizer(CProjection cProjection) {
        lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(cProjection, "");
        synchronized (this.RemoteActionCompatParcelizer) {
            lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(cProjection);
        }
        return lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer;
    }

    @Override // kotlin.setAudioAttributes
    public final List<lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> write(String str) {
        List<lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener> listWrite;
        toMagicModuleMetaRepoModel.write(str, "");
        synchronized (this.RemoteActionCompatParcelizer) {
            listWrite = this.AudioAttributesCompatParcelizer.write(str);
        }
        return listWrite;
    }

    @Override // kotlin.setAudioAttributes
    public final boolean read(CProjection cProjection) {
        boolean z;
        toMagicModuleMetaRepoModel.write(cProjection, "");
        synchronized (this.RemoteActionCompatParcelizer) {
            z = this.AudioAttributesCompatParcelizer.read(cProjection);
        }
        return z;
    }
}
