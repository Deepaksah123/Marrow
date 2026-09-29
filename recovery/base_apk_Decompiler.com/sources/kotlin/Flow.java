package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/Flow;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Flow {
    private static final /* synthetic */ Flow[] RemoteActionCompatParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final Flow read = new Flow("Default", 0);
    public static final Flow AudioAttributesCompatParcelizer = new Flow("UserInput", 1);
    public static final Flow IconCompatParcelizer = new Flow("PreventUserInput", 2);

    private Flow(String str, int i) {
    }

    static {
        Flow[] flowArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer = flowArrAudioAttributesCompatParcelizer;
        write = getMagicModuleTimeline.IconCompatParcelizer(flowArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ Flow[] AudioAttributesCompatParcelizer() {
        return new Flow[]{read, AudioAttributesCompatParcelizer, IconCompatParcelizer};
    }

    public static Flow valueOf(String str) {
        return (Flow) Enum.valueOf(Flow.class, str);
    }

    public static Flow[] values() {
        return (Flow[]) RemoteActionCompatParcelizer.clone();
    }
}
