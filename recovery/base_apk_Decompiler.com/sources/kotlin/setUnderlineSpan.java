package kotlin;

import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;

/* JADX INFO: loaded from: classes3.dex */
public final class setUnderlineSpan {

    public interface IconCompatParcelizer {
    }

    public static MediaSessionConnector read(MediaSessionCompat mediaSessionCompat, IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(mediaSessionCompat, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        return new MediaSessionConnector(mediaSessionCompat);
    }
}
