package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/readerFor;", "write", "(Lo/readerFor;)Lo/readerFor;", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class withContentTypeHandler {
    public static final readerFor write(readerFor readerfor) {
        _assertNotNull iconCompatParcelizer = readerfor.getIconCompatParcelizer();
        while (true) {
            _assertNotNull _assertnotnull_init_lambda4 = iconCompatParcelizer._init_lambda4();
            if ((_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.getMediaBrowserCompatSearchResultReceiver() : null) != null) {
                _assertNotNull _assertnotnull_init_lambda42 = iconCompatParcelizer._init_lambda4();
                _assertNotNull mediaBrowserCompatSearchResultReceiver = _assertnotnull_init_lambda42 != null ? _assertnotnull_init_lambda42.getMediaBrowserCompatSearchResultReceiver() : null;
                toMagicModuleMetaRepoModel.write(mediaBrowserCompatSearchResultReceiver);
                if (mediaBrowserCompatSearchResultReceiver.getMediaBrowserCompatItemReceiver()) {
                    iconCompatParcelizer = iconCompatParcelizer._init_lambda4();
                    toMagicModuleMetaRepoModel.write(iconCompatParcelizer);
                } else {
                    _assertNotNull _assertnotnull_init_lambda43 = iconCompatParcelizer._init_lambda4();
                    toMagicModuleMetaRepoModel.write(_assertnotnull_init_lambda43);
                    iconCompatParcelizer = _assertnotnull_init_lambda43.getMediaBrowserCompatSearchResultReceiver();
                    toMagicModuleMetaRepoModel.write(iconCompatParcelizer);
                }
            } else {
                readerFor write = iconCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().getWrite();
                toMagicModuleMetaRepoModel.write(write);
                return write;
            }
        }
    }
}
