package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/zzjc;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzjc {
    private static final /* synthetic */ zzjc[] read;
    public static final zzjc IconCompatParcelizer = new zzjc("REVIEW_WITH_SCROLL", 0);
    public static final zzjc RemoteActionCompatParcelizer = new zzjc("REVIEW_WITHOUT_SCROLL", 1);
    public static final zzjc write = new zzjc("REVIEW_QBANK_WITH_NAVIGATION", 2);

    private zzjc(String str, int i) {
    }

    static {
        zzjc[] zzjcVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        read = zzjcVarArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(zzjcVarArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ zzjc[] AudioAttributesCompatParcelizer() {
        return new zzjc[]{IconCompatParcelizer, RemoteActionCompatParcelizer, write};
    }

    public static zzjc valueOf(String str) {
        return (zzjc) Enum.valueOf(zzjc.class, str);
    }

    public static zzjc[] values() {
        return (zzjc[]) read.clone();
    }
}
