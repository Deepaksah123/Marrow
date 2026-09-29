package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/_writeFieldName;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _writeFieldName {
    private static final /* synthetic */ _writeFieldName[] AudioAttributesImplBaseParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final _writeFieldName AudioAttributesCompatParcelizer = new _writeFieldName("None", 0);
    public static final _writeFieldName IconCompatParcelizer = new _writeFieldName("Cancelled", 1);
    public static final _writeFieldName RemoteActionCompatParcelizer = new _writeFieldName("Redirected", 2);
    public static final _writeFieldName read = new _writeFieldName("RedirectCancelled", 3);

    private _writeFieldName(String str, int i) {
    }

    static {
        _writeFieldName[] _writefieldnameArrIconCompatParcelizer = IconCompatParcelizer();
        AudioAttributesImplBaseParcelizer = _writefieldnameArrIconCompatParcelizer;
        write = getMagicModuleTimeline.IconCompatParcelizer(_writefieldnameArrIconCompatParcelizer);
    }

    private static final /* synthetic */ _writeFieldName[] IconCompatParcelizer() {
        return new _writeFieldName[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, RemoteActionCompatParcelizer, read};
    }

    public static _writeFieldName valueOf(String str) {
        return (_writeFieldName) Enum.valueOf(_writeFieldName.class, str);
    }

    public static _writeFieldName[] values() {
        return (_writeFieldName[]) AudioAttributesImplBaseParcelizer.clone();
    }
}
