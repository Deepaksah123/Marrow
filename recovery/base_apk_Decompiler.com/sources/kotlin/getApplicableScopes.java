package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/getApplicableScopes;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getApplicableScopes {
    public static final getApplicableScopes IconCompatParcelizer = new getApplicableScopes("INLINE", 0);
    public static final getApplicableScopes RemoteActionCompatParcelizer = new getApplicableScopes("FULLSCREEN", 1);
    private static final /* synthetic */ getApplicableScopes[] write;

    static {
        getApplicableScopes[] getapplicablescopesArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        write = getapplicablescopesArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getapplicablescopesArrRemoteActionCompatParcelizer);
    }

    private getApplicableScopes(String str, int i) {
    }

    private static final /* synthetic */ getApplicableScopes[] RemoteActionCompatParcelizer() {
        return new getApplicableScopes[]{IconCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static getApplicableScopes valueOf(String str) {
        return (getApplicableScopes) Enum.valueOf(getApplicableScopes.class, str);
    }

    public static getApplicableScopes[] values() {
        return (getApplicableScopes[]) write.clone();
    }
}
