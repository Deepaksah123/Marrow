package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/access100;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class access100 {
    private static final /* synthetic */ access100[] read;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final access100 AudioAttributesCompatParcelizer = new access100("Vertical", 0);
    public static final access100 RemoteActionCompatParcelizer = new access100("Horizontal", 1);
    public static final access100 IconCompatParcelizer = new access100("Both", 2);

    private access100(String str, int i) {
    }

    static {
        access100[] access100VarArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        read = access100VarArrRemoteActionCompatParcelizer;
        write = getMagicModuleTimeline.IconCompatParcelizer(access100VarArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ access100[] RemoteActionCompatParcelizer() {
        return new access100[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static access100 valueOf(String str) {
        return (access100) Enum.valueOf(access100.class, str);
    }

    public static access100[] values() {
        return (access100[]) read.clone();
    }
}
