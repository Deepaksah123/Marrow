package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000e*\u00020\u00068UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000f"}, d2 = {"Lo/_writeValueAndClose;", "Lo/properties;", "Lo/KeyDeserializer;", "p0", "<init>", "(Lo/KeyDeserializer;)V", "Lo/_bindAndClose;", "Lo/weirdNumberException;", "", "write", "(Lo/_bindAndClose;Lo/weirdNumberException;)I", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "(Lo/_bindAndClose;J)J", "", "(Lo/_bindAndClose;)Ljava/util/Map;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _writeValueAndClose extends properties {
    public _writeValueAndClose(KeyDeserializer keyDeserializer) {
        super(keyDeserializer, null);
    }

    @Override // kotlin.properties
    protected final Map<weirdNumberException, Integer> AudioAttributesCompatParcelizer(_bindAndClose _bindandclose) {
        return _bindandclose.onMediaButtonEvent().AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.properties
    protected final int write(_bindAndClose _bindandclose, weirdNumberException weirdnumberexception) {
        return _bindandclose.AudioAttributesCompatParcelizer(weirdnumberexception);
    }

    @Override // kotlin.properties
    protected final long AudioAttributesCompatParcelizer(_bindAndClose _bindandclose, long j) {
        return _bindAndClose.read$default(_bindandclose, j, false, 2, null);
    }
}
