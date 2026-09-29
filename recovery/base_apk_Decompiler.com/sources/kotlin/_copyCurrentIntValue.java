package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/_copyCurrentIntValue;", "", "<init>", "(Ljava/lang/String;I)V", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _copyCurrentIntValue {
    private static final /* synthetic */ getMagicModuleSavedMcqCount RemoteActionCompatParcelizer;
    private static final /* synthetic */ _copyCurrentIntValue[] write;
    public static final _copyCurrentIntValue read = new _copyCurrentIntValue("Filled", 0);
    public static final _copyCurrentIntValue IconCompatParcelizer = new _copyCurrentIntValue("Outlined", 1);

    private _copyCurrentIntValue(String str, int i) {
    }

    static {
        _copyCurrentIntValue[] _copycurrentintvalueArrWrite = write();
        write = _copycurrentintvalueArrWrite;
        RemoteActionCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(_copycurrentintvalueArrWrite);
    }

    private static final /* synthetic */ _copyCurrentIntValue[] write() {
        return new _copyCurrentIntValue[]{read, IconCompatParcelizer};
    }

    public static _copyCurrentIntValue valueOf(String str) {
        return (_copyCurrentIntValue) Enum.valueOf(_copyCurrentIntValue.class, str);
    }

    public static _copyCurrentIntValue[] values() {
        return (_copyCurrentIntValue[]) write.clone();
    }
}
