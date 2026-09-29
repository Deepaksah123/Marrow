package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/setMixInAnnotations;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setMixInAnnotations {
    private static final /* synthetic */ setMixInAnnotations[] MediaBrowserCompatCustomActionResultReceiver;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final setMixInAnnotations AudioAttributesCompatParcelizer = new setMixInAnnotations("LookaheadMeasurement", 0);
    public static final setMixInAnnotations IconCompatParcelizer = new setMixInAnnotations("LookaheadPlacement", 1);
    public static final setMixInAnnotations read = new setMixInAnnotations("Measurement", 2);
    public static final setMixInAnnotations RemoteActionCompatParcelizer = new setMixInAnnotations("Placement", 3);

    private setMixInAnnotations(String str, int i) {
    }

    static {
        setMixInAnnotations[] setmixinannotationsArr = read();
        MediaBrowserCompatCustomActionResultReceiver = setmixinannotationsArr;
        write = getMagicModuleTimeline.IconCompatParcelizer(setmixinannotationsArr);
    }

    private static final /* synthetic */ setMixInAnnotations[] read() {
        return new setMixInAnnotations[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, read, RemoteActionCompatParcelizer};
    }

    public static setMixInAnnotations valueOf(String str) {
        return (setMixInAnnotations) Enum.valueOf(setMixInAnnotations.class, str);
    }

    public static setMixInAnnotations[] values() {
        return (setMixInAnnotations[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
