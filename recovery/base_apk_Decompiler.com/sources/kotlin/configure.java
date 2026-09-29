package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_assertNotNull;", "", "write", "(Lo/_assertNotNull;)Z", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class configure {
    public static final boolean write(_assertNotNull _assertnotnull) {
        if (_assertnotnull.getMediaBrowserCompatSearchResultReceiver() == null) {
            return false;
        }
        _assertNotNull _assertnotnull_init_lambda4 = _assertnotnull._init_lambda4();
        return (_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.getMediaBrowserCompatSearchResultReceiver() : null) == null || _assertnotnull.getAccessaddObserverForBackInvoker().getAudioAttributesImplBaseParcelizer();
    }
}
