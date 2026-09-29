package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/_includeScalar;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _includeScalar {
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ _includeScalar[] MediaBrowserCompatItemReceiver;
    public static final _includeScalar RemoteActionCompatParcelizer = new _includeScalar("IGNORED", 0);
    public static final _includeScalar AudioAttributesCompatParcelizer = new _includeScalar("SCHEDULED", 1);
    public static final _includeScalar read = new _includeScalar("DEFERRED", 2);
    public static final _includeScalar write = new _includeScalar("IMMINENT", 3);

    private _includeScalar(String str, int i) {
    }

    static {
        _includeScalar[] _includescalarArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        MediaBrowserCompatItemReceiver = _includescalarArrRemoteActionCompatParcelizer;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(_includescalarArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ _includeScalar[] RemoteActionCompatParcelizer() {
        return new _includeScalar[]{RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, read, write};
    }

    public static _includeScalar valueOf(String str) {
        return (_includeScalar) Enum.valueOf(_includeScalar.class, str);
    }

    public static _includeScalar[] values() {
        return (_includeScalar[]) MediaBrowserCompatItemReceiver.clone();
    }
}
