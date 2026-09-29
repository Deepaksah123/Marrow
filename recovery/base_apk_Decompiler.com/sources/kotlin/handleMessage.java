package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class handleMessage extends getStream<Boolean> {
    private final int AudioAttributesCompatParcelizer;

    private static boolean RemoteActionCompatParcelizer(boolean z) {
        return !z;
    }

    @Override // kotlin.getStream
    public final /* synthetic */ boolean write(Boolean bool) {
        return RemoteActionCompatParcelizer(bool.booleanValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleMessage(onRelease onrelease) {
        super(onrelease);
        toMagicModuleMetaRepoModel.write(onrelease, "");
        this.AudioAttributesCompatParcelizer = 5;
    }

    @Override // kotlin.getStream
    protected final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.isSourceReady
    public final boolean write(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        return cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer();
    }
}
