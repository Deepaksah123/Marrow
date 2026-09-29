package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onPositionReset extends getStream<Boolean> {
    private final int IconCompatParcelizer;

    private static boolean write(boolean z) {
        return !z;
    }

    @Override // kotlin.getStream
    public final /* bridge */ /* synthetic */ boolean write(Boolean bool) {
        return write(bool.booleanValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onPositionReset(onStreamChanged<Boolean> onstreamchanged) {
        super(onstreamchanged);
        toMagicModuleMetaRepoModel.write(onstreamchanged, "");
        this.IconCompatParcelizer = 9;
    }

    @Override // kotlin.getStream
    protected final int AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.isSourceReady
    public final boolean write(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        return cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
    }
}
