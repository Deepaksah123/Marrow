package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0011\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b\b\u0010\f"}, d2 = {"Lo/lambdaonDownstreamFormatChanged28;", "", "<init>", "()V", "", "IconCompatParcelizer", "()Z", "RemoteActionCompatParcelizer", "read", "Z", "AudioAttributesCompatParcelizer", "Lo/lambdaonDrmSessionReleased66;", "Lo/lambdaonDrmSessionReleased66;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaonDownstreamFormatChanged28 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final boolean IconCompatParcelizer;
    public static final lambdaonDownstreamFormatChanged28 INSTANCE = new lambdaonDownstreamFormatChanged28();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final boolean read;
    private static final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final lambdaonDrmSessionReleased66 write;

    private lambdaonDownstreamFormatChanged28() {
    }

    static {
        lambdaonDrmSessionReleased66 lambdaondrmsessionreleased66;
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        read = zRemoteActionCompatParcelizer;
        boolean z = read();
        RemoteActionCompatParcelizer = z;
        IconCompatParcelizer = IconCompatParcelizer();
        if (z) {
            lambdaondrmsessionreleased66 = lambdaonDrmSessionReleased66.write;
        } else if (zRemoteActionCompatParcelizer) {
            lambdaondrmsessionreleased66 = lambdaonDrmSessionReleased66.AudioAttributesCompatParcelizer;
        } else {
            lambdaondrmsessionreleased66 = lambdaonDrmSessionReleased66.IconCompatParcelizer;
        }
        write = lambdaondrmsessionreleased66;
    }

    private static boolean IconCompatParcelizer() {
        boolean z = RemoteActionCompatParcelizer;
        if (!z && !read) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        }
        return read || z;
    }

    private static boolean RemoteActionCompatParcelizer() {
        Iterator it = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"com.google.android.exoplayer2.ExoPlayer", "com.google.android.exoplayer2.source.hls.HlsMediaSource", "com.google.android.exoplayer2.ui.StyledPlayerView"}).iterator();
        while (it.hasNext()) {
            try {
                Class.forName((String) it.next());
            } catch (Throwable unused) {
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                return false;
            }
        }
        RendererWakeupListener.MediaBrowserCompatItemReceiver();
        return true;
    }

    private static boolean read() {
        Iterator it = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"androidx.media3.exoplayer.ExoPlayer", "androidx.media3.exoplayer.hls.HlsMediaSource", "androidx.media3.ui.PlayerView"}).iterator();
        while (it.hasNext()) {
            try {
                Class.forName((String) it.next());
            } catch (Throwable unused) {
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                return false;
            }
        }
        RendererWakeupListener.MediaBrowserCompatItemReceiver();
        return true;
    }
}
