package kotlin;

import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.data.test.remote.model.RankPairModel;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0086\b\u0018\u00002\u00020\u0001Bµ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\b\b\u0002\u0010\"\u001a\u00020\u0015\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$\u0012\b\b\u0002\u0010&\u001a\u00020\u0006\u0012\b\b\u0002\u0010'\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0(\u0012\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0(\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0$\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020,0$\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020/0$\u0012\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001a\u00105\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010>\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010:R\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010:R\u001a\u0010D\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\bC\u0010:R\u001a\u0010I\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010K\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010F\u001a\u0004\bJ\u0010HR\u0014\u0010M\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010FR\u001a\u0010=\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010N\u001a\u0004\bD\u00108R\u001a\u0010P\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010N\u001a\u0004\b>\u00108R\u001a\u0010R\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bM\u00108R\u001a\u0010U\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u00108R\u001a\u0010@\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010N\u001a\u0004\bW\u00108R\u001a\u0010C\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010N\u001a\u0004\bY\u00108R\u001a\u0010T\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010N\u001a\u0004\bR\u00108R\u001a\u0010Y\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\bP\u0010]R\u001a\u0010W\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010\\\u001a\u0004\bU\u0010]R\u001a\u0010b\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\bI\u0010aR\u0014\u0010L\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010FR\u0014\u0010J\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010FR\u0014\u0010E\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u0016\u0010G\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010cR\u0014\u0010d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010NR\u0014\u0010e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010NR\u0014\u0010_\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010NR\u0014\u0010f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010NR\u0014\u0010O\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010NR\u0014\u0010Q\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010NR\u0014\u0010g\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010NR\u0014\u0010^\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010`R\u0014\u0010Z\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010NR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010iR\u0014\u0010[\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010FR\u001a\u0010?\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010F\u001a\u0004\bE\u0010HR&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bb\u0010lR&\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010k\u001a\u0004\bA\u0010lR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020,0$8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010iR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020,0$8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010iR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020/0$8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010iR\u001a\u0010h\u001a\u0002018\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010n\u001a\u0004\bK\u0010o"}, d2 = {"Lo/SignInClientImpl;", "", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "", "p13", "p14", "", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "", "p29", "p30", "p31", "", "Lo/onProviderInstalled;", "p32", "p33", "Lo/uncaughtException;", "p34", "p35", "Lcom/marrow2/data/test/remote/model/RankPairModel;", "p36", "Lo/installIfNeededAsync;", "p37", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZIIIIIIIDDJZZZLjava/lang/Integer;IIIIIIIJILjava/util/List;ZZLjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lo/installIfNeededAsync;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "onPlayFromSearch", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "read", "onRemoveQueueItem", "MediaBrowserCompatMediaItem", "RemoteActionCompatParcelizer", "onSeekTo", "RatingCompat", "write", "onCommand", "Z", "handleMediaPlayPauseIfPendingOnHandler", "()Z", "AudioAttributesCompatParcelizer", "onCustomAction", "IconCompatParcelizer", "onAddQueueItem", "MediaBrowserCompatItemReceiver", "I", "onMediaButtonEvent", "MediaBrowserCompatCustomActionResultReceiver", "onPrepareFromSearch", "AudioAttributesImplApi21Parcelizer", "onSetRepeatMode", "MediaMetadataCompat", "AudioAttributesImplBaseParcelizer", "onRewind", "MediaBrowserCompatSearchResultReceiver", "onRemoveQueueItemAt", "MediaDescriptionCompat", "onPlayFromUri", "onPrepareFromUri", "D", "()D", "onPrepare", "onPlayFromMediaId", "J", "()J", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Ljava/lang/Integer;", "onPlay", "onPause", "onFastForward", "onPrepareFromMediaId", "onSetRating", "Ljava/util/List;", "onSetShuffleMode", "Ljava/util/Map;", "()Ljava/util/Map;", "onSetCaptioningEnabled", "Lo/installIfNeededAsync;", "()Lo/installIfNeededAsync;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignInClientImpl {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int onPlayFromUri;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int onMediaButtonEvent;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int onPlay;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int onPrepareFromSearch;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Map<String, onProviderInstalled> onRemoveQueueItemAt;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final installIfNeededAsync onSetRating;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final Integer handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final boolean onAddQueueItem;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final boolean onRemoveQueueItem;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final int onPause;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final List<uncaughtException> onSetCaptioningEnabled;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final boolean onCustomAction;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<uncaughtException> onRewind;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final boolean onCommand;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final boolean onPrepareFromUri;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final List<RankPairModel> onSetShuffleMode;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final int onPrepareFromMediaId;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final int MediaMetadataCompat;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final double MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final List<String> onPlayFromSearch;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final double MediaDescriptionCompat;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private final long onPrepare;

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private final Map<String, onProviderInstalled> onSeekTo;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int onFastForward;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int onPlayFromMediaId;
    private static final byte[] $$c = {TarConstants.LF_CHR, -90, -19, 114};
    private static final int $$f = 111;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {10, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 13, 109, 13, 4, -3, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, 2, -15, -26, 0, -11};
    private static final int $$e = 137;
    private static final byte[] $$a = {123, -91, -44, 22, -15, 8, -16, 1, 4, 3, TarConstants.LF_BLK, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, 61, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, 27, -39, -11, 7, -23, 19, TarConstants.LF_LINK, -64, 9, -15, 5, TarConstants.LF_CONTIG, -40, -22, -12, 11, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
    private static final int $$b = 109;
    private static int onSkipToNext = 0;
    private static int setSessionImpl = 1;
    private static long onSetPlaybackSpeed = 1031205823562672981L;
    private static int onSetCaptioningEnabled = -136981212;
    private static char onStop = 54564;
    private static long onSkipToPrevious = 3137277896485933908L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r7 = r7 + 103
            byte[] r1 = kotlin.SignInClientImpl.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SignInClientImpl.$$g(short, int, int):java.lang.String");
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i4 | i3);
        int i8 = i5 | i7;
        int i9 = (~(i3 | (~i5))) | i4;
        int i10 = i4 + i5 + i2 + ((-1932811043) * i6) + (1521317780 * i);
        int i11 = i10 * i10;
        int i12 = ((i4 * (-919556932)) - 154402816) + ((-919556932) * i5) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i2) + ((-2098724864) * i6) + ((-1398800384) * i) + ((-1444151296) * i11);
        int i13 = (i4 * 1794637580) + 2133191799 + (i5 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i2 * 1794637741) + (i6 * (-1844343719)) + (i * (-1188939004)) + (i11 * (-394526720));
        int i14 = i12 + (i13 * i13 * 821297152);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : write(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.SignInClientImpl.$$a
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r9 = r9 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r8 = r9
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-2)
            int r8 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SignInClientImpl.b(short, int, short, java.lang.Object[]):void");
    }

    private static void c(byte b, int i, int i2, Object[] objArr) {
        byte[] bArr = $$d;
        int i3 = 114 - i;
        int i4 = i2 + 4;
        byte[] bArr2 = new byte[b + 3];
        int i5 = b + 2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + (-i4);
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4;
            i3 += -bArr[i4];
            i4 = i8 + 1;
            i6 = i7;
        }
    }

    private SignInClientImpl(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, double d, double d2, long j, boolean z4, boolean z5, boolean z6, Integer num, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j2, int i15, List<String> list, boolean z7, boolean z8, Map<String, onProviderInstalled> map, Map<String, onProviderInstalled> map2, List<uncaughtException> list2, List<uncaughtException> list3, List<RankPairModel> list4, installIfNeededAsync installifneededasync) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(list4, "");
        toMagicModuleMetaRepoModel.write(installifneededasync, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.AudioAttributesImplBaseParcelizer = i4;
        this.MediaBrowserCompatMediaItem = i5;
        this.RatingCompat = i6;
        this.MediaMetadataCompat = i7;
        this.MediaDescriptionCompat = d;
        this.MediaBrowserCompatSearchResultReceiver = d2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j;
        this.onAddQueueItem = z4;
        this.onCustomAction = z5;
        this.onCommand = z6;
        this.handleMediaPlayPauseIfPendingOnHandler = num;
        this.onPlay = i8;
        this.onPause = i9;
        this.onPlayFromMediaId = i10;
        this.onFastForward = i11;
        this.onMediaButtonEvent = i12;
        this.onPrepareFromSearch = i13;
        this.onPrepareFromMediaId = i14;
        this.onPrepare = j2;
        this.onPlayFromUri = i15;
        this.onPlayFromSearch = list;
        this.onPrepareFromUri = z7;
        this.onRemoveQueueItem = z8;
        this.onSeekTo = map;
        this.onRemoveQueueItemAt = map2;
        this.onRewind = list2;
        this.onSetCaptioningEnabled = list3;
        this.onSetShuffleMode = list4;
        this.onSetRating = installifneededasync;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SignInClientImpl(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, double d, double d2, long j, boolean z4, boolean z5, boolean z6, Integer num, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j2, int i15, List list, boolean z7, boolean z8, Map map, Map map2, List list2, List list3, List list4, installIfNeededAsync installifneededasync, int i16, int i17, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        String str4;
        boolean z9;
        int i18;
        int i19;
        int i20;
        double d3;
        int i21;
        boolean z10;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z11;
        List listRemoteActionCompatParcelizer;
        Map map3;
        boolean z12;
        List listRemoteActionCompatParcelizer2;
        String str5 = (i16 & 1) != 0 ? "" : str;
        if ((i16 & 2) != 0) {
            int i31 = onSkipToNext + 117;
            setSessionImpl = i31 % 128;
            if (i31 % 2 == 0) {
                throw null;
            }
            str4 = "";
        } else {
            str4 = str2;
        }
        String str6 = (i16 & 4) == 0 ? str3 : "";
        boolean z13 = (i16 & 8) != 0 ? false : z;
        boolean z14 = true;
        if ((i16 & 16) != 0) {
            int i32 = onSkipToNext + 53;
            setSessionImpl = i32 % 128;
            int i33 = i32 % 2;
            z9 = true;
        } else {
            z9 = z2;
        }
        if ((i16 & 32) != 0) {
            int i34 = onSkipToNext + 61;
            setSessionImpl = i34 % 128;
            if (i34 % 2 == 0) {
                z14 = false;
            }
        } else {
            z14 = z3;
        }
        if ((i16 & 64) != 0) {
            int i35 = setSessionImpl + 79;
            onSkipToNext = i35 % 128;
            int i36 = i35 % 2;
            i18 = 0;
        } else {
            i18 = i;
        }
        int i37 = (i16 & 128) != 0 ? 0 : i2;
        int i38 = (i16 & 256) != 0 ? 0 : i3;
        if ((i16 & 512) != 0) {
            int i39 = 2 % 2;
            i19 = 0;
        } else {
            i19 = i4;
        }
        if ((i16 & 1024) != 0) {
            int i40 = 2 % 2;
            i20 = 0;
        } else {
            i20 = i5;
        }
        int i41 = (i16 & 2048) != 0 ? 0 : i6;
        int i42 = (i16 & 4096) != 0 ? 0 : i7;
        double d4 = 0.0d;
        if ((i16 & 8192) != 0) {
            int i43 = 2 % 2;
            d3 = 0.0d;
        } else {
            d3 = d;
        }
        if ((i16 & 16384) != 0) {
            int i44 = onSkipToNext + 67;
            i21 = i42;
            setSessionImpl = i44 % 128;
            if (i44 % 2 == 0) {
                d4 = 1.0d;
            }
        } else {
            i21 = i42;
            d4 = d2;
        }
        long j3 = 0;
        long j4 = (32768 & i16) != 0 ? 0L : j;
        boolean z15 = (65536 & i16) != 0 ? false : z4;
        boolean z16 = (131072 & i16) != 0 ? false : z5;
        boolean z17 = (i16 & 262144) != 0 ? false : z6;
        Integer num2 = (i16 & 524288) != 0 ? null : num;
        int i45 = (i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 0 : i8;
        int i46 = (i16 & 2097152) != 0 ? 0 : i9;
        if ((i16 & 4194304) != 0) {
            int i47 = onSkipToNext + 17;
            z10 = z16;
            setSessionImpl = i47 % 128;
            int i48 = i47 % 2;
            i22 = 0;
        } else {
            z10 = z16;
            i22 = i10;
        }
        int i49 = (8388608 & i16) != 0 ? 0 : i11;
        if ((i16 & BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            i24 = i49;
            int i50 = setSessionImpl + 87;
            i23 = i22;
            onSkipToNext = i50 % 128;
            i25 = 2;
            int i51 = i50 % 2;
            int i52 = 2 % 2;
            i26 = 0;
        } else {
            i23 = i22;
            i24 = i49;
            i25 = 2;
            i26 = i12;
        }
        int i53 = (i16 & 33554432) != 0 ? 0 : i13;
        if ((i16 & 67108864) != 0) {
            int i54 = i25 % i25;
            i27 = 0;
        } else {
            i27 = i14;
        }
        if ((i16 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            i28 = i27;
            int i55 = onSkipToNext + 81;
            i29 = i26;
            setSessionImpl = i55 % 128;
            int i56 = i55 % 2;
        } else {
            i28 = i27;
            i29 = i26;
            j3 = j2;
        }
        int i57 = (268435456 & i16) != 0 ? 0 : i15;
        if ((536870912 & i16) != 0) {
            int i58 = onSkipToNext + 67;
            i30 = i57;
            setSessionImpl = i58 % 128;
            if (i58 % 2 == 0) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                z11 = false;
                int i59 = 60 / 0;
            } else {
                z11 = false;
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
        } else {
            i30 = i57;
            z11 = false;
            listRemoteActionCompatParcelizer = list;
        }
        boolean z18 = (1073741824 & i16) != 0 ? z11 : z7;
        z11 = (i16 & Integer.MIN_VALUE) == 0 ? z8 : z11;
        Map map4 = (i17 & 1) != 0 ? VideoTimelineResponseBody.read() : map;
        Map map5 = (i17 & 2) != 0 ? VideoTimelineResponseBody.read() : map2;
        List listRemoteActionCompatParcelizer3 = (i17 & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2;
        List listRemoteActionCompatParcelizer4 = (i17 & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3;
        if ((i17 & 16) != 0) {
            map3 = map4;
            int i60 = setSessionImpl + 103;
            z12 = z18;
            onSkipToNext = i60 % 128;
            int i61 = i60 % 2;
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            map3 = map4;
            z12 = z18;
            listRemoteActionCompatParcelizer2 = list4;
        }
        this(str5, str4, str6, z13, z9, z14, i18, i37, i38, i19, i20, i41, i21, d3, d4, j4, z15, z10, z17, num2, i45, i46, i23, i24, i29, i53, i28, j3, i30, listRemoteActionCompatParcelizer, z12, z11, map3, map5, listRemoteActionCompatParcelizer3, listRemoteActionCompatParcelizer4, listRemoteActionCompatParcelizer2, (i17 & 32) != 0 ? new installIfNeededAsync(0, null, null, null, 15, null) : installifneededasync);
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = setSessionImpl + 39;
        int i3 = i2 % 128;
        onSkipToNext = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.read;
        int i4 = i3 + 27;
        setSessionImpl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        SignInClientImpl signInClientImpl = (SignInClientImpl) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext + 79;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        String str = signInClientImpl.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RatingCompat() {
        int i = 2 % 2;
        int i2 = setSessionImpl + 37;
        onSkipToNext = i2 % 128;
        if (i2 % 2 == 0) {
            return this.write;
        }
        throw null;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = onSkipToNext + 35;
        int i3 = i2 % 128;
        setSessionImpl = i3;
        int i4 = i2 % 2;
        boolean z = this.AudioAttributesCompatParcelizer;
        int i5 = i3 + 43;
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onCustomAction() {
        int i = 2 % 2;
        int i2 = setSessionImpl + 71;
        int i3 = i2 % 128;
        onSkipToNext = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.IconCompatParcelizer;
        int i4 = i3 + 113;
        setSessionImpl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return z;
    }

    public final int write() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 + 99;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.AudioAttributesImplApi26Parcelizer;
        int i6 = i2 + 31;
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 + 93;
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i6 = i2 + 1;
        onSkipToNext = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = setSessionImpl + 25;
        int i3 = i2 % 128;
        onSkipToNext = i3;
        int i4 = i2 % 2;
        int i5 = this.AudioAttributesImplApi21Parcelizer;
        if (i4 != 0) {
            int i6 = 92 / 0;
        }
        int i7 = i3 + 59;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    public final int MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = setSessionImpl + 125;
        onSkipToNext = i2 % 128;
        if (i2 % 2 == 0) {
            return this.AudioAttributesImplBaseParcelizer;
        }
        throw null;
    }

    public final int MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 + 57;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.MediaBrowserCompatMediaItem;
        if (i4 == 0) {
            int i6 = 21 / 0;
        }
        int i7 = i2 + 33;
        setSessionImpl = i7 % 128;
        if (i7 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        SignInClientImpl signInClientImpl = (SignInClientImpl) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl + 25;
        int i3 = i2 % 128;
        onSkipToNext = i3;
        int i4 = i2 % 2;
        int i5 = signInClientImpl.RatingCompat;
        int i6 = i3 + 39;
        setSessionImpl = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        int i7 = 82 / 0;
        return Integer.valueOf(i5);
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        SignInClientImpl signInClientImpl = (SignInClientImpl) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext + 93;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        int i4 = signInClientImpl.MediaMetadataCompat;
        if (i3 != 0) {
            return Integer.valueOf(i4);
        }
        throw null;
    }

    public final double MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 + 63;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        double d = this.MediaDescriptionCompat;
        int i5 = i2 + 109;
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        SignInClientImpl signInClientImpl = (SignInClientImpl) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext + 111;
        setSessionImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return Double.valueOf(signInClientImpl.MediaBrowserCompatSearchResultReceiver);
        }
        double d = signInClientImpl.MediaBrowserCompatSearchResultReceiver;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 + 109;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        long j = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i5 = i2 + 123;
        setSessionImpl = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final boolean onCommand() {
        int i = 2 % 2;
        int i2 = setSessionImpl + 51;
        int i3 = i2 % 128;
        onSkipToNext = i3;
        int i4 = i2 % 2;
        boolean z = this.onRemoveQueueItem;
        if (i4 != 0) {
            int i5 = 32 / 0;
        }
        int i6 = i3 + 13;
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public final Map<String, onProviderInstalled> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 + 61;
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        Map<String, onProviderInstalled> map = this.onSeekTo;
        if (i4 != 0) {
            int i5 = 78 / 0;
        }
        int i6 = i2 + 123;
        onSkipToNext = i6 % 128;
        if (i6 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final Map<String, onProviderInstalled> RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onSkipToNext + 93;
        setSessionImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onRemoveQueueItemAt;
        }
        throw null;
    }

    public final installIfNeededAsync IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 + 101;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        installIfNeededAsync installifneededasync = this.onSetRating;
        if (i4 == 0) {
            int i5 = 47 / 0;
        }
        int i6 = i2 + 17;
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        return installifneededasync;
    }

    private static void d(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(onSkipToPrevious ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 97;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(onSkipToPrevious)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Process.myTid() >> 22), TextUtils.getCapsMode("", 0, 0) + 12424, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 1868 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 10, 1983509525, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i6 = $11 + 67;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i3 = $10 + 51;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 22748 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 2721 - (ViewConfiguration.getScrollBarSize() >> 8), 38 - ExpandableListView.getPackedPositionGroup(0L), 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0', 0) + 15714, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.getDefaultSize(0, 0) + 40976), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6122, (Process.myTid() >> 22) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (onSetPlaybackSpeed ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) onSetCaptioningEnabled) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) onStop) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                            int i5 = $10 + 15;
                            $11 = i5 % 128;
                            int i6 = i5 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public SignInClientImpl() {
        this(null, null, null, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0.0d, 0.0d, 0L, false, false, false, null, 0, 0, 0, 0, 0, 0, 0, 0L, 0, null, false, false, null, null, null, null, null, null, -1, 63, null);
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SignInClientImpl)) {
            int i2 = setSessionImpl + 15;
            onSkipToNext = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SignInClientImpl signInClientImpl = (SignInClientImpl) p0;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) signInClientImpl.read)) {
            int i4 = setSessionImpl + 125;
            onSkipToNext = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) signInClientImpl.RemoteActionCompatParcelizer) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) signInClientImpl.write) || this.AudioAttributesCompatParcelizer != signInClientImpl.AudioAttributesCompatParcelizer || this.IconCompatParcelizer != signInClientImpl.IconCompatParcelizer || this.MediaBrowserCompatItemReceiver != signInClientImpl.MediaBrowserCompatItemReceiver || this.AudioAttributesImplApi26Parcelizer != signInClientImpl.AudioAttributesImplApi26Parcelizer || this.MediaBrowserCompatCustomActionResultReceiver != signInClientImpl.MediaBrowserCompatCustomActionResultReceiver || this.AudioAttributesImplApi21Parcelizer != signInClientImpl.AudioAttributesImplApi21Parcelizer || this.AudioAttributesImplBaseParcelizer != signInClientImpl.AudioAttributesImplBaseParcelizer || this.MediaBrowserCompatMediaItem != signInClientImpl.MediaBrowserCompatMediaItem || this.RatingCompat != signInClientImpl.RatingCompat || this.MediaMetadataCompat != signInClientImpl.MediaMetadataCompat || Double.compare(this.MediaDescriptionCompat, signInClientImpl.MediaDescriptionCompat) != 0 || Double.compare(this.MediaBrowserCompatSearchResultReceiver, signInClientImpl.MediaBrowserCompatSearchResultReceiver) != 0) {
            return false;
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != signInClientImpl.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            int i5 = setSessionImpl + 97;
            onSkipToNext = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.onAddQueueItem != signInClientImpl.onAddQueueItem) {
            int i6 = onSkipToNext + 5;
            setSessionImpl = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onCustomAction != signInClientImpl.onCustomAction || this.onCommand != signInClientImpl.onCommand) {
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, signInClientImpl.handleMediaPlayPauseIfPendingOnHandler)) {
            int i8 = onSkipToNext + 103;
            setSessionImpl = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.onPlay != signInClientImpl.onPlay || this.onPause != signInClientImpl.onPause || this.onPlayFromMediaId != signInClientImpl.onPlayFromMediaId) {
            return false;
        }
        if (this.onFastForward != signInClientImpl.onFastForward) {
            int i10 = onSkipToNext + 13;
            setSessionImpl = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.onMediaButtonEvent != signInClientImpl.onMediaButtonEvent || this.onPrepareFromSearch != signInClientImpl.onPrepareFromSearch || this.onPrepareFromMediaId != signInClientImpl.onPrepareFromMediaId) {
            return false;
        }
        if (this.onPrepare != signInClientImpl.onPrepare) {
            int i12 = setSessionImpl + 43;
            onSkipToNext = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.onPlayFromUri != signInClientImpl.onPlayFromUri || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlayFromSearch, signInClientImpl.onPlayFromSearch) || this.onPrepareFromUri != signInClientImpl.onPrepareFromUri || this.onRemoveQueueItem != signInClientImpl.onRemoveQueueItem || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSeekTo, signInClientImpl.onSeekTo)) {
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onRemoveQueueItemAt, signInClientImpl.onRemoveQueueItemAt)) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onRewind, signInClientImpl.onRewind) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetCaptioningEnabled, signInClientImpl.onSetCaptioningEnabled) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetShuffleMode, signInClientImpl.onSetShuffleMode) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetRating, signInClientImpl.onSetRating);
        }
        int i14 = onSkipToNext + 65;
        setSessionImpl = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public final double AudioAttributesImplBaseParcelizer() {
        int iAudioAttributesCompatParcelizer = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        return ((Double) RemoteActionCompatParcelizer(UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, new Object[]{this}, iAudioAttributesCompatParcelizer, -1124483743, 1124483746, iAudioAttributesCompatParcelizer3)).doubleValue();
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        int iAudioAttributesCompatParcelizer = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        return ((Integer) RemoteActionCompatParcelizer(UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, new Object[]{this}, iAudioAttributesCompatParcelizer, 1809665756, -1809665756, iAudioAttributesCompatParcelizer3)).intValue();
    }

    public final String MediaBrowserCompatMediaItem() {
        int iAudioAttributesCompatParcelizer = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, new Object[]{this}, iAudioAttributesCompatParcelizer, -654757630, 654757632, iAudioAttributesCompatParcelizer3);
    }

    public final int MediaDescriptionCompat() {
        int iAudioAttributesCompatParcelizer = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer();
        return ((Integer) RemoteActionCompatParcelizer(UtilExternalSyntheticLambda1.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, new Object[]{this}, iAudioAttributesCompatParcelizer, 1857231529, -1857231528, iAudioAttributesCompatParcelizer3)).intValue();
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onSkipToNext + 7;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode4 = this.write.hashCode();
        int iHashCode5 = Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode6 = Boolean.hashCode(this.IconCompatParcelizer);
        int iHashCode7 = Boolean.hashCode(this.MediaBrowserCompatItemReceiver);
        int iHashCode8 = Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode9 = Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode10 = Integer.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode11 = Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode12 = Integer.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode13 = Integer.hashCode(this.RatingCompat);
        int iHashCode14 = Integer.hashCode(this.MediaMetadataCompat);
        int iHashCode15 = Double.hashCode(this.MediaDescriptionCompat);
        int iHashCode16 = Double.hashCode(this.MediaBrowserCompatSearchResultReceiver);
        int iHashCode17 = Long.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        int iHashCode18 = Boolean.hashCode(this.onAddQueueItem);
        int iHashCode19 = Boolean.hashCode(this.onCustomAction);
        int iHashCode20 = Boolean.hashCode(this.onCommand);
        Integer num = this.handleMediaPlayPauseIfPendingOnHandler;
        if (num == null) {
            int i4 = onSkipToNext + 63;
            setSessionImpl = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode21 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode) * 31) + Integer.hashCode(this.onPlay)) * 31) + Integer.hashCode(this.onPause)) * 31) + Integer.hashCode(this.onPlayFromMediaId)) * 31) + Integer.hashCode(this.onFastForward)) * 31) + Integer.hashCode(this.onMediaButtonEvent)) * 31) + Integer.hashCode(this.onPrepareFromSearch)) * 31) + Integer.hashCode(this.onPrepareFromMediaId)) * 31) + Long.hashCode(this.onPrepare)) * 31) + Integer.hashCode(this.onPlayFromUri)) * 31) + this.onPlayFromSearch.hashCode()) * 31) + Boolean.hashCode(this.onPrepareFromUri)) * 31) + Boolean.hashCode(this.onRemoveQueueItem)) * 31) + this.onSeekTo.hashCode()) * 31) + this.onRemoveQueueItemAt.hashCode()) * 31) + this.onRewind.hashCode()) * 31) + this.onSetCaptioningEnabled.hashCode()) * 31) + this.onSetShuffleMode.hashCode()) * 31) + this.onSetRating.hashCode();
        int i6 = onSkipToNext + 9;
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode21;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.read;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.write;
        boolean z = this.AudioAttributesCompatParcelizer;
        boolean z2 = this.IconCompatParcelizer;
        boolean z3 = this.MediaBrowserCompatItemReceiver;
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i4 = this.AudioAttributesImplApi21Parcelizer;
        int i5 = this.AudioAttributesImplBaseParcelizer;
        int i6 = this.MediaBrowserCompatMediaItem;
        int i7 = this.RatingCompat;
        int i8 = this.MediaMetadataCompat;
        double d = this.MediaDescriptionCompat;
        double d2 = this.MediaBrowserCompatSearchResultReceiver;
        long j = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        boolean z4 = this.onAddQueueItem;
        boolean z5 = this.onCustomAction;
        boolean z6 = this.onCommand;
        Integer num = this.handleMediaPlayPauseIfPendingOnHandler;
        int i9 = this.onPlay;
        int i10 = this.onPause;
        int i11 = this.onPlayFromMediaId;
        int i12 = this.onFastForward;
        int i13 = this.onMediaButtonEvent;
        int i14 = this.onPrepareFromSearch;
        int i15 = this.onPrepareFromMediaId;
        long j2 = this.onPrepare;
        int i16 = this.onPlayFromUri;
        List<String> list = this.onPlayFromSearch;
        boolean z7 = this.onPrepareFromUri;
        boolean z8 = this.onRemoveQueueItem;
        Map<String, onProviderInstalled> map = this.onSeekTo;
        Map<String, onProviderInstalled> map2 = this.onRemoveQueueItemAt;
        List<uncaughtException> list2 = this.onRewind;
        List<uncaughtException> list3 = this.onSetCaptioningEnabled;
        List<RankPairModel> list4 = this.onSetShuffleMode;
        installIfNeededAsync installifneededasync = this.onSetRating;
        StringBuilder sb = new StringBuilder("SignInClientImpl(read=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(", write=");
        sb.append(str3);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z);
        sb.append(", IconCompatParcelizer=");
        sb.append(z2);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(z3);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(i2);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i3);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i4);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i5);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(i6);
        sb.append(", RatingCompat=");
        sb.append(i7);
        sb.append(", MediaMetadataCompat=");
        sb.append(i8);
        sb.append(", MediaDescriptionCompat=");
        sb.append(d);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(d2);
        sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
        sb.append(j);
        sb.append(", onAddQueueItem=");
        sb.append(z4);
        sb.append(", onCustomAction=");
        sb.append(z5);
        sb.append(", onCommand=");
        sb.append(z6);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(num);
        sb.append(", onPlay=");
        sb.append(i9);
        sb.append(", onPause=");
        sb.append(i10);
        sb.append(", onPlayFromMediaId=");
        sb.append(i11);
        sb.append(", onFastForward=");
        sb.append(i12);
        sb.append(", onMediaButtonEvent=");
        sb.append(i13);
        sb.append(", onPrepareFromSearch=");
        sb.append(i14);
        sb.append(", onPrepareFromMediaId=");
        sb.append(i15);
        sb.append(", onPrepare=");
        sb.append(j2);
        sb.append(", onPlayFromUri=");
        sb.append(i16);
        sb.append(", onPlayFromSearch=");
        sb.append(list);
        sb.append(", onPrepareFromUri=");
        sb.append(z7);
        sb.append(", onRemoveQueueItem=");
        sb.append(z8);
        sb.append(", onSeekTo=");
        sb.append(map);
        sb.append(", onRemoveQueueItemAt=");
        sb.append(map2);
        sb.append(", onRewind=");
        sb.append(list2);
        sb.append(", onSetCaptioningEnabled=");
        sb.append(list3);
        sb.append(", onSetShuffleMode=");
        sb.append(list4);
        sb.append(", onSetRating=");
        sb.append(installifneededasync);
        sb.append(")");
        String string = sb.toString();
        int i17 = setSessionImpl + 39;
        onSkipToNext = i17 % 128;
        int i18 = i17 % 2;
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0e82 A[Catch: Exception -> 0x0eb7, all -> 0x0f10, IOException -> 0x0f14, TryCatch #4 {Exception -> 0x0eb7, blocks: (B:78:0x093c, B:164:0x0e67, B:166:0x0e69, B:168:0x0e70, B:169:0x0e71, B:177:0x0e7b, B:179:0x0e82, B:180:0x0e83, B:186:0x0e8e, B:188:0x0e94, B:189:0x0e95, B:192:0x0e9e, B:194:0x0ea4, B:195:0x0ea5), top: B:305:0x093c }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e83 A[Catch: Exception -> 0x0eb7, all -> 0x0f10, IOException -> 0x0f14, TryCatch #4 {Exception -> 0x0eb7, blocks: (B:78:0x093c, B:164:0x0e67, B:166:0x0e69, B:168:0x0e70, B:169:0x0e71, B:177:0x0e7b, B:179:0x0e82, B:180:0x0e83, B:186:0x0e8e, B:188:0x0e94, B:189:0x0e95, B:192:0x0e9e, B:194:0x0ea4, B:195:0x0ea5), top: B:305:0x093c }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0e94 A[Catch: Exception -> 0x0eb7, all -> 0x0f10, IOException -> 0x0f14, TryCatch #4 {Exception -> 0x0eb7, blocks: (B:78:0x093c, B:164:0x0e67, B:166:0x0e69, B:168:0x0e70, B:169:0x0e71, B:177:0x0e7b, B:179:0x0e82, B:180:0x0e83, B:186:0x0e8e, B:188:0x0e94, B:189:0x0e95, B:192:0x0e9e, B:194:0x0ea4, B:195:0x0ea5), top: B:305:0x093c }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0e95 A[Catch: Exception -> 0x0eb7, all -> 0x0f10, IOException -> 0x0f14, TryCatch #4 {Exception -> 0x0eb7, blocks: (B:78:0x093c, B:164:0x0e67, B:166:0x0e69, B:168:0x0e70, B:169:0x0e71, B:177:0x0e7b, B:179:0x0e82, B:180:0x0e83, B:186:0x0e8e, B:188:0x0e94, B:189:0x0e95, B:192:0x0e9e, B:194:0x0ea4, B:195:0x0ea5), top: B:305:0x093c }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1493 A[PHI: r1 r2
      0x1493: PHI (r1v7 int) = (r1v4 int), (r1v4 int), (r1v13 int) binds: [B:218:0x107e, B:220:0x10dd, B:371:0x1493] A[DONT_GENERATE, DONT_INLINE]
      0x1493: PHI (r2v14 java.lang.String[]) = (r2v11 java.lang.String[]), (r2v11 java.lang.String[]), (r2v22 java.lang.String[]) binds: [B:218:0x107e, B:220:0x10dd, B:371:0x1493] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05b6 A[PHI: r2 r5
      0x05b6: PHI (r2v58 int) = (r2v57 int), (r2v134 int) binds: [B:23:0x0461, B:360:0x05b6] A[DONT_GENERATE, DONT_INLINE]
      0x05b6: PHI (r5v44 java.lang.Object) = (r5v43 java.lang.Object), (r5v197 java.lang.Object) binds: [B:23:0x0461, B:360:0x05b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] write(android.content.Context r48, int r49, int r50, int r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 8450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SignInClientImpl.write(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
