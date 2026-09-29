package kotlin;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class onRendererCapabilitiesChanged extends getStream<getLastResetPositionUs> {
    private final int write;

    @Override // kotlin.getStream
    public final /* bridge */ /* synthetic */ boolean write(getLastResetPositionUs getlastresetpositionus) {
        return write2(getlastresetpositionus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onRendererCapabilitiesChanged(onStreamChanged<getLastResetPositionUs> onstreamchanged) {
        super(onstreamchanged);
        toMagicModuleMetaRepoModel.write(onstreamchanged, "");
        this.write = 7;
    }

    @Override // kotlin.getStream
    protected final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.isSourceReady
    public final boolean write(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        ia audioAttributesCompatParcelizer = cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer != ia.AudioAttributesImplBaseParcelizer) {
            return Build.VERSION.SDK_INT >= 30 && audioAttributesCompatParcelizer == ia.IconCompatParcelizer;
        }
        return true;
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static boolean write2(getLastResetPositionUs getlastresetpositionus) {
        toMagicModuleMetaRepoModel.write(getlastresetpositionus, "");
        return !getlastresetpositionus.AudioAttributesCompatParcelizer() || getlastresetpositionus.RemoteActionCompatParcelizer() || getlastresetpositionus.read();
    }
}
