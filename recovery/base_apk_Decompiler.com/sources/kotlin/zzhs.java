package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lo/zzhs;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "write", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzhs {
    private static final /* synthetic */ zzhs[] AudioAttributesImplApi26Parcelizer;
    public static final zzhs IconCompatParcelizer = new zzhs("TEST", 0);
    public static final zzhs write = new zzhs("QBANK", 1);
    public static final zzhs AudioAttributesImplBaseParcelizer = new zzhs("TEST_INICET", 2);
    public static final zzhs RemoteActionCompatParcelizer = new zzhs("BOOKMARK", 3);
    public static final zzhs read = new zzhs("CUSTOM_MODULE", 4);
    public static final zzhs AudioAttributesCompatParcelizer = new zzhs("PEARL", 5);

    private zzhs(String str, int i) {
    }

    static {
        zzhs[] zzhsVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesImplApi26Parcelizer = zzhsVarArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(zzhsVarArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ zzhs[] AudioAttributesCompatParcelizer() {
        return new zzhs[]{IconCompatParcelizer, write, AudioAttributesImplBaseParcelizer, RemoteActionCompatParcelizer, read, AudioAttributesCompatParcelizer};
    }

    public static zzhs valueOf(String str) {
        return (zzhs) Enum.valueOf(zzhs.class, str);
    }

    public static zzhs[] values() {
        return (zzhs[]) AudioAttributesImplApi26Parcelizer.clone();
    }
}
