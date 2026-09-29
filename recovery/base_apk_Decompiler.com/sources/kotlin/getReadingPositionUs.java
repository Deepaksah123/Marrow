package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getReadingPositionUs extends getStream<Boolean> {
    private final int write;

    private static boolean RemoteActionCompatParcelizer(boolean z) {
        return !z;
    }

    @Override // kotlin.getStream
    public final /* synthetic */ boolean write(Boolean bool) {
        return RemoteActionCompatParcelizer(bool.booleanValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getReadingPositionUs(onStreamChanged<Boolean> onstreamchanged) {
        super(onstreamchanged);
        toMagicModuleMetaRepoModel.write(onstreamchanged, "");
        this.write = 6;
    }

    @Override // kotlin.getStream
    protected final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.isSourceReady
    public final boolean write(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        return cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer.getWrite();
    }
}
