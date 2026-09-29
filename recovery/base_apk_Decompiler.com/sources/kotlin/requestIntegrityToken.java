package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/requestIntegrityToken;", "", "<init>", "(Ljava/lang/String;I)V", "read", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class requestIntegrityToken {
    private static final /* synthetic */ requestIntegrityToken[] AudioAttributesCompatParcelizer;
    public static final requestIntegrityToken read = new requestIntegrityToken("UNSCROLLED", 0);
    public static final requestIntegrityToken RemoteActionCompatParcelizer = new requestIntegrityToken("UPWARD_SCROLLED", 1);
    public static final requestIntegrityToken IconCompatParcelizer = new requestIntegrityToken("DOWNWARD_SCROLLED", 2);

    private requestIntegrityToken(String str, int i) {
    }

    static {
        requestIntegrityToken[] requestintegritytokenArr = read();
        AudioAttributesCompatParcelizer = requestintegritytokenArr;
        getMagicModuleTimeline.IconCompatParcelizer(requestintegritytokenArr);
    }

    private static final /* synthetic */ requestIntegrityToken[] read() {
        return new requestIntegrityToken[]{read, RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static requestIntegrityToken valueOf(String str) {
        return (requestIntegrityToken) Enum.valueOf(requestIntegrityToken.class, str);
    }

    public static requestIntegrityToken[] values() {
        return (requestIntegrityToken[]) AudioAttributesCompatParcelizer.clone();
    }
}
