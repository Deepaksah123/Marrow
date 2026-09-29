package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/_shapeForToken;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _shapeForToken {
    private static final /* synthetic */ _shapeForToken[] RemoteActionCompatParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final _shapeForToken IconCompatParcelizer = new _shapeForToken("Initial", 0);
    public static final _shapeForToken AudioAttributesCompatParcelizer = new _shapeForToken("Main", 1);
    public static final _shapeForToken read = new _shapeForToken("Final", 2);

    private _shapeForToken(String str, int i) {
    }

    static {
        _shapeForToken[] _shapefortokenArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer = _shapefortokenArrRemoteActionCompatParcelizer;
        write = getMagicModuleTimeline.IconCompatParcelizer(_shapefortokenArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ _shapeForToken[] RemoteActionCompatParcelizer() {
        return new _shapeForToken[]{IconCompatParcelizer, AudioAttributesCompatParcelizer, read};
    }

    public static _shapeForToken valueOf(String str) {
        return (_shapeForToken) Enum.valueOf(_shapeForToken.class, str);
    }

    public static _shapeForToken[] values() {
        return (_shapeForToken[]) RemoteActionCompatParcelizer.clone();
    }
}
