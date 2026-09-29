package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/setAllGesturesEnabled;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setAllGesturesEnabled {
    private static final /* synthetic */ setAllGesturesEnabled[] IconCompatParcelizer;
    public static final setAllGesturesEnabled AudioAttributesCompatParcelizer = new setAllGesturesEnabled("EMAIL", 0);
    public static final setAllGesturesEnabled write = new setAllGesturesEnabled("WHATSAPP", 1);
    public static final setAllGesturesEnabled RemoteActionCompatParcelizer = new setAllGesturesEnabled("OTHERS", 2);

    private setAllGesturesEnabled(String str, int i) {
    }

    static {
        setAllGesturesEnabled[] setallgesturesenabledArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        IconCompatParcelizer = setallgesturesenabledArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(setallgesturesenabledArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ setAllGesturesEnabled[] AudioAttributesCompatParcelizer() {
        return new setAllGesturesEnabled[]{AudioAttributesCompatParcelizer, write, RemoteActionCompatParcelizer};
    }

    public static setAllGesturesEnabled valueOf(String str) {
        return (setAllGesturesEnabled) Enum.valueOf(setAllGesturesEnabled.class, str);
    }

    public static setAllGesturesEnabled[] values() {
        return (setAllGesturesEnabled[]) IconCompatParcelizer.clone();
    }
}
