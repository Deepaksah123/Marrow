package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/clearPrefixFlags;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class clearPrefixFlags {
    private static final /* synthetic */ clearPrefixFlags[] write;
    public static final clearPrefixFlags RemoteActionCompatParcelizer = new clearPrefixFlags("NORMAL", 0);
    public static final clearPrefixFlags read = new clearPrefixFlags("RIGHT", 1);
    public static final clearPrefixFlags AudioAttributesCompatParcelizer = new clearPrefixFlags("WRONG", 2);

    private clearPrefixFlags(String str, int i) {
    }

    static {
        clearPrefixFlags[] clearprefixflagsArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        write = clearprefixflagsArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(clearprefixflagsArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ clearPrefixFlags[] AudioAttributesCompatParcelizer() {
        return new clearPrefixFlags[]{RemoteActionCompatParcelizer, read, AudioAttributesCompatParcelizer};
    }

    public static clearPrefixFlags valueOf(String str) {
        return (clearPrefixFlags) Enum.valueOf(clearPrefixFlags.class, str);
    }

    public static clearPrefixFlags[] values() {
        return (clearPrefixFlags[]) write.clone();
    }
}
