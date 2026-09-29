package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\n"}, d2 = {"Lo/handleClearVideoOutput;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handleClearVideoOutput {
    private static final /* synthetic */ handleClearVideoOutput[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;
    public static final handleClearVideoOutput write = new handleClearVideoOutput("TEMPLATE", 0, "template");
    public static final handleClearVideoOutput RemoteActionCompatParcelizer = new handleClearVideoOutput("FUNCTION", 1, "function");

    private handleClearVideoOutput(String str, int i, String str2) {
        this.RemoteActionCompatParcelizer = str2;
    }

    static {
        handleClearVideoOutput[] handleclearvideooutputArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer = handleclearvideooutputArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(handleclearvideooutputArrAudioAttributesCompatParcelizer);
        INSTANCE = new Companion(null);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.RemoteActionCompatParcelizer;
    }

    public static handleClearVideoOutput valueOf(String str) {
        return (handleClearVideoOutput) Enum.valueOf(handleClearVideoOutput.class, str);
    }

    public static handleClearVideoOutput[] values() {
        return (handleClearVideoOutput[]) AudioAttributesCompatParcelizer.clone();
    }

    private static final /* synthetic */ handleClearVideoOutput[] AudioAttributesCompatParcelizer() {
        return new handleClearVideoOutput[]{write, RemoteActionCompatParcelizer};
    }
}
