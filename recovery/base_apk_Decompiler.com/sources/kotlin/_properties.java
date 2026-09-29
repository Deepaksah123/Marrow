package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/_properties;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _properties {
    private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesCompatParcelizer;
    private static final /* synthetic */ _properties[] read;
    public static final _properties RemoteActionCompatParcelizer = new _properties("Ltr", 0);
    public static final _properties IconCompatParcelizer = new _properties("Rtl", 1);

    private _properties(String str, int i) {
    }

    static {
        _properties[] _propertiesVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        read = _propertiesVarArrAudioAttributesCompatParcelizer;
        AudioAttributesCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(_propertiesVarArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ _properties[] AudioAttributesCompatParcelizer() {
        return new _properties[]{RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static _properties valueOf(String str) {
        return (_properties) Enum.valueOf(_properties.class, str);
    }

    public static _properties[] values() {
        return (_properties[]) read.clone();
    }
}
