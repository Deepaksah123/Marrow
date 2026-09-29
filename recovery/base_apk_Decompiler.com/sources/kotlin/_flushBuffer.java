package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/_flushBuffer;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _flushBuffer {
    private static final /* synthetic */ _flushBuffer[] read;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final _flushBuffer RemoteActionCompatParcelizer = new _flushBuffer("VIEW_APPEAR", 0);
    public static final _flushBuffer IconCompatParcelizer = new _flushBuffer("VIEW_DISAPPEAR", 1);

    private _flushBuffer(String str, int i) {
    }

    static {
        _flushBuffer[] _flushbufferArrIconCompatParcelizer = IconCompatParcelizer();
        read = _flushbufferArrIconCompatParcelizer;
        write = getMagicModuleTimeline.IconCompatParcelizer(_flushbufferArrIconCompatParcelizer);
    }

    private static final /* synthetic */ _flushBuffer[] IconCompatParcelizer() {
        return new _flushBuffer[]{RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static _flushBuffer valueOf(String str) {
        return (_flushBuffer) Enum.valueOf(_flushBuffer.class, str);
    }

    public static _flushBuffer[] values() {
        return (_flushBuffer[]) read.clone();
    }
}
