package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/getTypeHandler;", "", "<init>", "(Ljava/lang/String;I)V", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTypeHandler {
    private static final /* synthetic */ getTypeHandler[] RemoteActionCompatParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final getTypeHandler read = new getTypeHandler("Width", 0);
    public static final getTypeHandler IconCompatParcelizer = new getTypeHandler("Height", 1);

    private getTypeHandler(String str, int i) {
    }

    static {
        getTypeHandler[] gettypehandlerArr = read();
        RemoteActionCompatParcelizer = gettypehandlerArr;
        write = getMagicModuleTimeline.IconCompatParcelizer(gettypehandlerArr);
    }

    private static final /* synthetic */ getTypeHandler[] read() {
        return new getTypeHandler[]{read, IconCompatParcelizer};
    }

    public static getTypeHandler valueOf(String str) {
        return (getTypeHandler) Enum.valueOf(getTypeHandler.class, str);
    }

    public static getTypeHandler[] values() {
        return (getTypeHandler[]) RemoteActionCompatParcelizer.clone();
    }
}
