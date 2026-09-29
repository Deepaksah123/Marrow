package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007j\u0002\b\bj\u0002\b\u0006j\u0002\b\nj\u0002\b\t"}, d2 = {"Lo/_addSymbol;", "Lo/CharsToNameCanonicalizer;", "", "<init>", "(Ljava/lang/String;I)V", "", "write", "()Z", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _addSymbol implements CharsToNameCanonicalizer {
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ _addSymbol[] MediaBrowserCompatCustomActionResultReceiver;
    public static final _addSymbol RemoteActionCompatParcelizer = new _addSymbol("Active", 0);
    public static final _addSymbol write = new _addSymbol("ActiveParent", 1);
    public static final _addSymbol read = new _addSymbol("Captured", 2);
    public static final _addSymbol AudioAttributesCompatParcelizer = new _addSymbol("Inactive", 3);

    private _addSymbol(String str, int i) {
    }

    static {
        _addSymbol[] _addsymbolArr = read();
        MediaBrowserCompatCustomActionResultReceiver = _addsymbolArr;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(_addsymbolArr);
    }

    @Override // kotlin.CharsToNameCanonicalizer
    public final boolean write() {
        int i = _addSymbol$IconCompatParcelizer$WhenMappings.AudioAttributesCompatParcelizer[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new RenewEligibleCreator();
    }

    @Override // kotlin.CharsToNameCanonicalizer
    public final boolean RemoteActionCompatParcelizer() {
        int i = _addSymbol$IconCompatParcelizer$WhenMappings.AudioAttributesCompatParcelizer[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw new RenewEligibleCreator();
    }

    private static final /* synthetic */ _addSymbol[] read() {
        return new _addSymbol[]{RemoteActionCompatParcelizer, write, read, AudioAttributesCompatParcelizer};
    }

    public static _addSymbol valueOf(String str) {
        return (_addSymbol) Enum.valueOf(_addSymbol.class, str);
    }

    public static _addSymbol[] values() {
        return (_addSymbol[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
