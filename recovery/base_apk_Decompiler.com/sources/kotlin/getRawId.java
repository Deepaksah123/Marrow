package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getRawId;", "", "<init>", "(Ljava/lang/String;I)V", "write", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getRawId {
    private static final /* synthetic */ getRawId[] AudioAttributesCompatParcelizer;
    public static final getRawId write = new getRawId("DRAWER_MENU", 0);
    public static final getRawId read = new getRawId("PROFILE_LANDING", 1);
    public static final getRawId IconCompatParcelizer = new getRawId("PROFILE_EDIT", 2);

    private getRawId(String str, int i) {
    }

    static {
        getRawId[] getrawidArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer = getrawidArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getrawidArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ getRawId[] RemoteActionCompatParcelizer() {
        return new getRawId[]{write, read, IconCompatParcelizer};
    }

    public static getRawId valueOf(String str) {
        return (getRawId) Enum.valueOf(getRawId.class, str);
    }

    public static getRawId[] values() {
        return (getRawId[]) AudioAttributesCompatParcelizer.clone();
    }
}
