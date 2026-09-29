package kotlin;

import android.media.MediaCodec;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.MediaDrmCallbackException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.io.EOFException;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomModuleQuotaResponseBody {
    private static final write AudioAttributesCompatParcelizer;
    private static final write AudioAttributesImplApi21Parcelizer;
    private static final write AudioAttributesImplApi26Parcelizer;
    private static final write AudioAttributesImplBaseParcelizer;
    private static final write IconCompatParcelizer;
    private static final write MediaBrowserCompatCustomActionResultReceiver;
    private static final write MediaBrowserCompatItemReceiver;
    private static final write MediaBrowserCompatMediaItem;
    private static final write MediaBrowserCompatSearchResultReceiver;
    private static final write MediaDescriptionCompat;
    private static final write MediaMetadataCompat;
    private static final write RatingCompat;
    private static final write[] RemoteActionCompatParcelizer;
    private static final write onAddQueueItem;
    private static final write read;
    private static final write write;

    interface write {
        boolean write(Throwable th);
    }

    public static int AudioAttributesCompatParcelizer(Throwable th, ResponseErrorException responseErrorException, boolean z) {
        if (parseDescriptor.read(th)) {
            return 1603;
        }
        if (RatingCompat(th)) {
            return 1601;
        }
        if (AudioAttributesImplApi26Parcelizer(th)) {
            return 1602;
        }
        if (responseErrorException != null) {
            return 1610;
        }
        return z ? 1606 : 1607;
    }

    static {
        write writeVar = new write() { // from class: o.CustomModuleResponseBody
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onCustomAction(th);
            }
        };
        RatingCompat = writeVar;
        write writeVar2 = new write() { // from class: o.BuyNowPromoResponse
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onCommand(th);
            }
        };
        onAddQueueItem = writeVar2;
        write writeVar3 = new write() { // from class: o.setAnswer
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onPlayFromMediaId(th);
            }
        };
        MediaDescriptionCompat = writeVar3;
        write writeVar4 = new write() { // from class: o.getLabelText
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onFastForward(th);
            }
        };
        write = writeVar4;
        AudioAttributesCompatParcelizer = new write() { // from class: o.RatingResponseBody
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onPrepareFromSearch(th);
            }
        };
        write writeVar5 = new write() { // from class: o.CustomModuleResponseBodyCompanion
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onPlayFromSearch(th);
            }
        };
        read = writeVar5;
        write writeVar6 = new write() { // from class: o.FirebaseSyncResponse
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onPrepare(th);
            }
        };
        IconCompatParcelizer = writeVar6;
        write writeVar7 = new write() { // from class: o.getOffer_text
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onPlayFromUri(th);
            }
        };
        AudioAttributesImplApi26Parcelizer = writeVar7;
        write writeVar8 = new write() { // from class: o.getPlanGroupId
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onPrepareFromMediaId(th);
            }
        };
        MediaBrowserCompatItemReceiver = writeVar8;
        MediaMetadataCompat = new write() { // from class: o.getMarquee_text
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onSeekTo(th);
            }
        };
        write writeVar9 = new write() { // from class: o.BuynowBannerResponse
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(th);
            }
        };
        AudioAttributesImplBaseParcelizer = writeVar9;
        write writeVar10 = new write() { // from class: o.FirebaseSyncResponseData
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onAddQueueItem(th);
            }
        };
        MediaBrowserCompatSearchResultReceiver = writeVar10;
        write writeVar11 = new write() { // from class: o.NotesResponse
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.handleMediaPlayPauseIfPendingOnHandler(th);
            }
        };
        AudioAttributesImplApi21Parcelizer = writeVar11;
        new write() { // from class: o.CMMarkCompleteResponseBody
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onMediaButtonEvent(th);
            }
        };
        MediaBrowserCompatMediaItem = new write() { // from class: o.SecurityResponseBody
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onPause(th);
            }
        };
        MediaBrowserCompatCustomActionResultReceiver = new write() { // from class: o.getCustomModule
            @Override // o.CustomModuleQuotaResponseBody.write
            public final boolean write(Throwable th) {
                return CustomModuleQuotaResponseBody.onPlay(th);
            }
        };
        RemoteActionCompatParcelizer = new write[]{writeVar, writeVar2, writeVar3, writeVar5, writeVar4, writeVar6, writeVar7, writeVar8, writeVar9, writeVar10, writeVar11};
    }

    static /* synthetic */ boolean onCustomAction(Throwable th) {
        return (th instanceof UnsupportedDrmException) && ((UnsupportedDrmException) th).reason == 2;
    }

    static /* synthetic */ boolean onCommand(Throwable th) {
        String message;
        return th instanceof UnsupportedDrmException ? ((UnsupportedDrmException) th).reason == 1 : (th instanceof DrmSession.DrmSessionException) && (message = th.getMessage()) != null && message.contains("DRM vendor-defined error");
    }

    static /* synthetic */ boolean onPlayFromMediaId(Throwable th) {
        return th instanceof IllegalStateException;
    }

    static /* synthetic */ boolean onFastForward(Throwable th) {
        String message;
        return (th instanceof MediaCodec.CodecException) && (message = th.getMessage()) != null && message.contains("0xffffffff");
    }

    static /* synthetic */ boolean onPrepareFromSearch(Throwable th) {
        String message;
        return (th instanceof MediaCodec.CodecException) && (message = th.getMessage()) != null && message.contains("0x80000000");
    }

    static /* synthetic */ boolean onPlayFromSearch(Throwable th) {
        String message;
        return (th instanceof MediaCodec.CodecException) && (message = th.getMessage()) != null && message.contains("0xfffffff4");
    }

    static /* synthetic */ boolean onPrepare(Throwable th) {
        return th instanceof MediaCodec.CodecException;
    }

    static /* synthetic */ boolean onPlayFromUri(Throwable th) {
        String message;
        return (th instanceof MediaCodec.CryptoException) && (message = th.getMessage()) != null && message.contains("Unknown error");
    }

    static /* synthetic */ boolean onPrepareFromMediaId(Throwable th) {
        return th instanceof MediaCodec.CryptoException;
    }

    static /* synthetic */ boolean onSeekTo(Throwable th) {
        boolean z = th instanceof IllegalStateException;
        Throwable cause = z ? th.getCause() : null;
        String message = cause != null ? cause.getMessage() : null;
        return z && cause != null && message != null && message.contains("MediaDrm is null");
    }

    static /* synthetic */ boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Throwable th) {
        return th instanceof MediaCodecRenderer.DecoderInitializationException;
    }

    static /* synthetic */ boolean onAddQueueItem(Throwable th) {
        return th instanceof FileNotFoundException;
    }

    static /* synthetic */ boolean handleMediaPlayPauseIfPendingOnHandler(Throwable th) {
        return th instanceof EOFException;
    }

    static /* synthetic */ boolean onMediaButtonEvent(Throwable th) {
        return th instanceof ExoTimeoutException;
    }

    static /* synthetic */ boolean onPause(Throwable th) {
        return (th instanceof ExoPlaybackException) && th.getCause() != null && th.getCause().getMessage() != null && th.getCause().getMessage().contains("L3 Initialized. Trying L1");
    }

    static /* synthetic */ boolean onPlay(Throwable th) {
        int i;
        while (th != null) {
            if (th instanceof MediaDrmCallbackException) {
                Throwable cause = th.getCause();
                if ((cause instanceof HttpDataSource.InvalidResponseCodeException) && ((i = ((HttpDataSource.InvalidResponseCodeException) cause).responseCode) == 500 || i == 401 || i == 403)) {
                    return true;
                }
            }
            th = th.getCause();
        }
        return false;
    }

    public static Throwable write(Throwable th) {
        Throwable cause = null;
        int i = 0;
        for (Throwable cause2 = th; cause2 != null && i < 4; cause2 = cause2.getCause()) {
            for (write writeVar : RemoteActionCompatParcelizer) {
                if (writeVar.write(cause2)) {
                    return cause2;
                }
            }
            if (cause2 instanceof ExoPlaybackException) {
                cause = cause2.getCause();
            }
            i++;
        }
        return cause != null ? cause : th;
    }

    private static boolean write(Throwable th, write writeVar) {
        int i = 0;
        while (th != null && i < 4) {
            if (writeVar.write(th)) {
                return true;
            }
            i++;
            th = th.getCause();
        }
        return false;
    }

    public static boolean AudioAttributesImplApi26Parcelizer(Throwable th) {
        return write(th, onAddQueueItem);
    }

    public static boolean MediaBrowserCompatItemReceiver(Throwable th) {
        return write(th, RatingCompat);
    }

    public static boolean MediaDescriptionCompat(Throwable th) {
        return write(th, MediaBrowserCompatSearchResultReceiver);
    }

    public static boolean MediaBrowserCompatMediaItem(Throwable th) {
        return write(th, AudioAttributesImplApi21Parcelizer);
    }

    public static boolean MediaMetadataCompat(Throwable th) {
        return write(th, MediaDescriptionCompat);
    }

    public static boolean read(Throwable th) {
        return write(th, read);
    }

    public static boolean IconCompatParcelizer(Throwable th) {
        return write(th, write);
    }

    public static boolean RemoteActionCompatParcelizer(Throwable th) {
        return write(th, AudioAttributesCompatParcelizer);
    }

    public static boolean AudioAttributesCompatParcelizer(Throwable th) {
        return write(th, IconCompatParcelizer);
    }

    public static boolean MediaBrowserCompatCustomActionResultReceiver(Throwable th) {
        return write(th, AudioAttributesImplApi26Parcelizer);
    }

    public static boolean AudioAttributesImplBaseParcelizer(Throwable th) {
        return write(th, MediaBrowserCompatItemReceiver);
    }

    public static boolean AudioAttributesImplApi21Parcelizer(Throwable th) {
        return write(th, AudioAttributesImplBaseParcelizer);
    }

    public static boolean MediaBrowserCompatSearchResultReceiver(Throwable th) {
        return write(th, MediaMetadataCompat);
    }

    public static boolean RatingCompat(Throwable th) {
        return getIconUrl.IconCompatParcelizer(th, "General DRM error");
    }

    public static boolean AudioAttributesCompatParcelizer(ExoPlaybackException exoPlaybackException) {
        return write(exoPlaybackException, MediaBrowserCompatMediaItem);
    }

    public static boolean write(ExoPlaybackException exoPlaybackException) {
        return write(exoPlaybackException, MediaBrowserCompatCustomActionResultReceiver);
    }
}
