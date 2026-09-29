package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/onDisplayInfoChanged;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class onDisplayInfoChanged {
    private static final /* synthetic */ onDisplayInfoChanged[] RemoteActionCompatParcelizer;
    public static final onDisplayInfoChanged read = new onDisplayInfoChanged("TYPE_NOT_BOOKMARKED", 0);
    public static final onDisplayInfoChanged AudioAttributesCompatParcelizer = new onDisplayInfoChanged("TYPE_NORMAL", 1);
    public static final onDisplayInfoChanged IconCompatParcelizer = new onDisplayInfoChanged("TYPE_STAR", 2);
    public static final onDisplayInfoChanged write = new onDisplayInfoChanged("TYPE_QUESTION", 3);

    private onDisplayInfoChanged(String str, int i) {
    }

    static {
        onDisplayInfoChanged[] ondisplayinfochangedArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer = ondisplayinfochangedArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(ondisplayinfochangedArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ onDisplayInfoChanged[] AudioAttributesCompatParcelizer() {
        return new onDisplayInfoChanged[]{read, AudioAttributesCompatParcelizer, IconCompatParcelizer, write};
    }

    public static onDisplayInfoChanged valueOf(String str) {
        return (onDisplayInfoChanged) Enum.valueOf(onDisplayInfoChanged.class, str);
    }

    public static onDisplayInfoChanged[] values() {
        return (onDisplayInfoChanged[]) RemoteActionCompatParcelizer.clone();
    }
}
