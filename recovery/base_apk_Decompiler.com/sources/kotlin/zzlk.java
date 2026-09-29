package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/zzlk;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzlk {
    private static final /* synthetic */ zzlk[] AudioAttributesCompatParcelizer;
    public static final zzlk RemoteActionCompatParcelizer = new zzlk("ALL", 0);
    public static final zzlk IconCompatParcelizer = new zzlk("CORRECT", 1);
    public static final zzlk write = new zzlk("WRONG", 2);
    public static final zzlk read = new zzlk("SKIPPED", 3);

    private zzlk(String str, int i) {
    }

    static {
        zzlk[] zzlkVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer = zzlkVarArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(zzlkVarArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ zzlk[] AudioAttributesCompatParcelizer() {
        return new zzlk[]{RemoteActionCompatParcelizer, IconCompatParcelizer, write, read};
    }

    public static zzlk valueOf(String str) {
        return (zzlk) Enum.valueOf(zzlk.class, str);
    }

    public static zzlk[] values() {
        return (zzlk[]) AudioAttributesCompatParcelizer.clone();
    }
}
