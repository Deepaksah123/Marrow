package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0015X\u0094D¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/isCurrentStreamFinal;", "Lo/getStream;", "Lo/getLastResetPositionUs;", "Lo/onStreamChanged;", "p0", "<init>", "(Lo/onStreamChanged;)V", "Lo/CVideoChangeFrameRateStrategy;", "", "write", "(Lo/CVideoChangeFrameRateStrategy;)Z", "read", "(Lo/getLastResetPositionUs;)Z", "", "I", "AudioAttributesCompatParcelizer", "()I", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class isCurrentStreamFinal extends getStream<getLastResetPositionUs> {
    private static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    @Override // kotlin.getStream
    public final /* synthetic */ boolean write(getLastResetPositionUs getlastresetpositionus) {
        return read(getlastresetpositionus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isCurrentStreamFinal(onStreamChanged<getLastResetPositionUs> onstreamchanged) {
        super(onstreamchanged);
        toMagicModuleMetaRepoModel.write(onstreamchanged, "");
        this.IconCompatParcelizer = 7;
    }

    @Override // kotlin.getStream
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    protected final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.isSourceReady
    public final boolean write(CVideoChangeFrameRateStrategy p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() == ia.read;
    }

    private static boolean read(getLastResetPositionUs p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (p0.AudioAttributesCompatParcelizer() && p0.write() && !p0.read()) ? false : true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/isCurrentStreamFinal$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(n.write("NetworkNotRoamingCtrlr"), "");
    }
}
