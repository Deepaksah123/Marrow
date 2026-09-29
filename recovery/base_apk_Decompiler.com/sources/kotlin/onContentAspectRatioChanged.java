package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/onContentAspectRatioChanged;", "", "<init>", "(Ljava/lang/String;I)V", "write", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onContentAspectRatioChanged {
    private static final /* synthetic */ onContentAspectRatioChanged[] RemoteActionCompatParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount read;
    public static final onContentAspectRatioChanged write = new onContentAspectRatioChanged("Cursor", 0);
    public static final onContentAspectRatioChanged IconCompatParcelizer = new onContentAspectRatioChanged("SelectionStart", 1);
    public static final onContentAspectRatioChanged AudioAttributesCompatParcelizer = new onContentAspectRatioChanged("SelectionEnd", 2);

    private onContentAspectRatioChanged(String str, int i) {
    }

    static {
        onContentAspectRatioChanged[] oncontentaspectratiochangedArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer = oncontentaspectratiochangedArrAudioAttributesCompatParcelizer;
        read = getMagicModuleTimeline.IconCompatParcelizer(oncontentaspectratiochangedArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ onContentAspectRatioChanged[] AudioAttributesCompatParcelizer() {
        return new onContentAspectRatioChanged[]{write, IconCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static onContentAspectRatioChanged valueOf(String str) {
        return (onContentAspectRatioChanged) Enum.valueOf(onContentAspectRatioChanged.class, str);
    }

    public static onContentAspectRatioChanged[] values() {
        return (onContentAspectRatioChanged[]) RemoteActionCompatParcelizer.clone();
    }
}
