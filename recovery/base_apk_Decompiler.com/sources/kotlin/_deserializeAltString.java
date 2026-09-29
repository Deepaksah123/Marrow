package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/_deserializeAltString;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _deserializeAltString {
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ _deserializeAltString[] RemoteActionCompatParcelizer;
    public static final _deserializeAltString read = new _deserializeAltString("Inherit", 0);
    public static final _deserializeAltString AudioAttributesCompatParcelizer = new _deserializeAltString("SecureOn", 1);
    public static final _deserializeAltString write = new _deserializeAltString("SecureOff", 2);

    private _deserializeAltString(String str, int i) {
    }

    static {
        _deserializeAltString[] _deserializealtstringArrIconCompatParcelizer = IconCompatParcelizer();
        RemoteActionCompatParcelizer = _deserializealtstringArrIconCompatParcelizer;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(_deserializealtstringArrIconCompatParcelizer);
    }

    private static final /* synthetic */ _deserializeAltString[] IconCompatParcelizer() {
        return new _deserializeAltString[]{read, AudioAttributesCompatParcelizer, write};
    }

    public static _deserializeAltString valueOf(String str) {
        return (_deserializeAltString) Enum.valueOf(_deserializeAltString.class, str);
    }

    public static _deserializeAltString[] values() {
        return (_deserializeAltString[]) RemoteActionCompatParcelizer.clone();
    }
}
