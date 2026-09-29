package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/setDividerPadding;", "", "<init>", "(Ljava/lang/String;I)V", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setDividerPadding {
    private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesCompatParcelizer;
    private static final /* synthetic */ setDividerPadding[] RemoteActionCompatParcelizer;
    public static final setDividerPadding read = new setDividerPadding("BoundReached", 0);
    public static final setDividerPadding write = new setDividerPadding("Finished", 1);

    private setDividerPadding(String str, int i) {
    }

    static {
        setDividerPadding[] setdividerpaddingArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer = setdividerpaddingArrAudioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(setdividerpaddingArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ setDividerPadding[] AudioAttributesCompatParcelizer() {
        return new setDividerPadding[]{read, write};
    }

    public static setDividerPadding valueOf(String str) {
        return (setDividerPadding) Enum.valueOf(setDividerPadding.class, str);
    }

    public static setDividerPadding[] values() {
        return (setDividerPadding[]) RemoteActionCompatParcelizer.clone();
    }
}
