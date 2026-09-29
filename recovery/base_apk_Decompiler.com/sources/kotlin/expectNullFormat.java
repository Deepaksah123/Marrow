package kotlin;

import android.media.session.MediaSessionManager;
import kotlin.expectIntegerFormat;

/* JADX INFO: loaded from: classes2.dex */
class expectNullFormat extends expectArrayFormat {

    static final class IconCompatParcelizer extends expectIntegerFormat.write {
        final MediaSessionManager.RemoteUserInfo write;

        IconCompatParcelizer(String str, int i, int i2) {
            super(str, i, i2);
            this.write = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }
    }
}
