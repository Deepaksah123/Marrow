package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class TrimmingAudioProcessor extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final TrimmingAudioProcessor write = new TrimmingAudioProcessor();

    public TrimmingAudioProcessor() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return writeOggIdHeaderPage.read.write();
    }
}
