package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin._parser;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\"\u0010)J\u001d\u0010\u001f\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010+R\u001a\u0010\u001f\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b'\u0010.R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u0010$\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\"\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u00102R\u0014\u00106\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010-R\u0014\u0010,\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0014\u00101\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010-R\u0014\u0010B\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010:\u001a\u00020\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b<\u0010C\u001a\u0004\b<\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\u0006\n\u0004\b'\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010FR\u001a\u00103\u001a\u00020\u001b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010A\u001a\u0004\b\"\u0010HR$\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bI\u0010-\u001a\u0004\b$\u0010.R\u001a\u0010K\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bJ\u0010-\u001a\u0004\b5\u0010.R\u001a\u0010L\u001a\u00020\u00038\u0017X\u0097D¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b,\u0010.R\u001a\u0010N\u001a\u00020\u00038\u0017X\u0097D¢\u0006\f\n\u0004\bM\u0010-\u001a\u0004\bE\u0010.R\u001a\u0010I\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\b6\u0010.R\u001a\u0010J\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b\u001f\u0010.R\"\u0010=\u001a\u00020\b8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bL\u00102\u001a\u0004\b>\u00104\"\u0004\b\u001f\u0010OR\u0016\u0010?\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010-R\u0016\u00108\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010-R\u0016\u0010M\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010-R\u0014\u0010R\u001a\u00020P8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010QR\u0014\u0010@\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0018\u0010T\u001a\u00020\u0003*\u00020\u00148CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010SR\u0018\u0010V\u001a\u00020\u0003*\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010U"}, d2 = {"Lo/setAllowReturnTransitionOverlap;", "Lo/performPrimaryNavigationFragmentChanged;", "Lo/addAudioOffloadListener;", "", "p0", "", "Lo/_parser;", "p1", "", "p2", "Lo/_skipWSOrEnd$write;", "p3", "Lo/_skipWSOrEnd$read;", "p4", "Lo/tryToResolveUnresolved;", "p5", "p6", "p7", "p8", "p9", "Lo/hasReferringProperties;", "p10", "", "p11", "p12", "Lo/stopLoading;", "p13", "Lo/PropertyValueAny;", "p14", "<init>", "(ILjava/util/List;ZLo/_skipWSOrEnd$write;Lo/_skipWSOrEnd$read;Lo/tryToResolveUnresolved;ZIIIJLjava/lang/Object;Ljava/lang/Object;Lo/stopLoading;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "IconCompatParcelizer", "(I)Ljava/lang/Object;", "", "write", "(IIII)V", "AudioAttributesCompatParcelizer", "(III)V", "(I)V", "read", "(I)J", "(IZ)V", "Lo/_parser$IconCompatParcelizer;", "(Lo/_parser$IconCompatParcelizer;Z)V", "AudioAttributesImplApi26Parcelizer", "I", "()I", "onCommand", "Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "Z", "MediaBrowserCompatSearchResultReceiver", "()Z", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/_skipWSOrEnd$write;", "onPlayFromMediaId", "Lo/_skipWSOrEnd$read;", "MediaMetadataCompat", "Lo/tryToResolveUnresolved;", "MediaBrowserCompatItemReceiver", "onPause", "AudioAttributesImplApi21Parcelizer", "onFastForward", "onPlayFromSearch", "J", "MediaDescriptionCompat", "Ljava/lang/Object;", "()Ljava/lang/Object;", "RatingCompat", "Lo/stopLoading;", "MediaBrowserCompatMediaItem", "()J", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onPlay", "onAddQueueItem", "onCustomAction", "onMediaButtonEvent", "handleMediaPlayPauseIfPendingOnHandler", "(Z)V", "", "[I", "onPrepareFromMediaId", "(J)I", "onPrepareFromSearch", "(Lo/_parser;)I", "onPrepare"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setAllowReturnTransitionOverlap implements performPrimaryNavigationFragmentChanged, addAudioOffloadListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final stopLoading<setAllowReturnTransitionOverlap> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int onPlay;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final _skipWSOrEnd.write AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Object MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final int onCustomAction;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private int onCommand;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private int onFastForward;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final tryToResolveUnresolved MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int onMediaButtonEvent;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final int[] onPrepareFromMediaId;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private int onPlayFromMediaId;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final List<_parser> read;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private boolean onPause;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final int handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final int onAddQueueItem;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final _skipWSOrEnd.read write;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final long MediaDescriptionCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Object RatingCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long MediaBrowserCompatSearchResultReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    private setAllowReturnTransitionOverlap(int i, List<? extends _parser> list, boolean z, _skipWSOrEnd.write writeVar, _skipWSOrEnd.read readVar, tryToResolveUnresolved trytoresolveunresolved, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, stopLoading<setAllowReturnTransitionOverlap> stoploading, long j2) {
        this.IconCompatParcelizer = i;
        this.read = list;
        this.RemoteActionCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = writeVar;
        this.write = readVar;
        this.MediaBrowserCompatItemReceiver = trytoresolveunresolved;
        this.AudioAttributesImplApi21Parcelizer = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.AudioAttributesImplApi26Parcelizer = i3;
        this.AudioAttributesImplBaseParcelizer = i4;
        this.MediaDescriptionCompat = j;
        this.MediaMetadataCompat = obj;
        this.RatingCompat = obj2;
        this.MediaBrowserCompatMediaItem = stoploading;
        this.MediaBrowserCompatSearchResultReceiver = j2;
        this.handleMediaPlayPauseIfPendingOnHandler = 1;
        this.onFastForward = Integer.MIN_VALUE;
        int size = list.size();
        int remoteActionCompatParcelizer = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            _parser _parserVar = (_parser) list.get(i5);
            remoteActionCompatParcelizer += getRemoteActionCompatParcelizer() ? _parserVar.getRemoteActionCompatParcelizer() : _parserVar.getRead();
            iMax = Math.max(iMax, !getRemoteActionCompatParcelizer() ? _parserVar.getRemoteActionCompatParcelizer() : _parserVar.getRead());
        }
        this.onAddQueueItem = remoteActionCompatParcelizer;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getQues.write(getOnAddQueueItem() + this.AudioAttributesImplBaseParcelizer, 0);
        this.onPlay = iMax;
        this.onPrepareFromMediaId = new int[this.read.size() << 1];
    }

    @Override // kotlin.performPrimaryNavigationFragmentChanged, kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final Object getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.performPrimaryNavigationFragmentChanged
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    @Override // kotlin.performPrimaryNavigationFragmentChanged
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getOnCustomAction() {
        return this.onCustomAction;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final int getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getOnPlay() {
        return this.onPlay;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getOnPause() {
        return this.onPause;
    }

    @Override // kotlin.addAudioOffloadListener
    public final void IconCompatParcelizer(boolean z) {
        this.onPause = z;
    }

    @Override // kotlin.addAudioOffloadListener
    public final int AudioAttributesImplBaseParcelizer() {
        return this.read.size();
    }

    @Override // kotlin.addAudioOffloadListener
    public final Object IconCompatParcelizer(int p0) {
        return this.read.get(p0).q_();
    }

    @Override // kotlin.addAudioOffloadListener
    public final void write(int p0, int p1, int p2, int p3) {
        AudioAttributesCompatParcelizer(p0, p2, p3);
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1, int p2) {
        int read;
        this.onCommand = p0;
        this.onFastForward = getRemoteActionCompatParcelizer() ? p2 : p1;
        List<_parser> list = this.read;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            _parser _parserVar = list.get(i);
            int i2 = i << 1;
            if (getRemoteActionCompatParcelizer()) {
                int[] iArr = this.onPrepareFromMediaId;
                _skipWSOrEnd.write writeVar = this.AudioAttributesCompatParcelizer;
                if (writeVar != null) {
                    iArr[i2] = writeVar.IconCompatParcelizer(_parserVar.getRead(), p1, this.MediaBrowserCompatItemReceiver);
                    this.onPrepareFromMediaId[i2 + 1] = p0;
                    read = _parserVar.getRemoteActionCompatParcelizer();
                } else {
                    getRootStableInsets.read("null horizontalAlignment when isVertical == true");
                    throw new PlanDetailsCreator();
                }
            } else {
                int[] iArr2 = this.onPrepareFromMediaId;
                iArr2[i2] = p0;
                _skipWSOrEnd.read readVar = this.write;
                if (readVar != null) {
                    iArr2[i2 + 1] = readVar.read(_parserVar.getRemoteActionCompatParcelizer(), p2);
                    read = _parserVar.getRead();
                } else {
                    getRootStableInsets.read("null verticalAlignment when isVertical == false");
                    throw new PlanDetailsCreator();
                }
            }
            p0 += read;
        }
        this.onPlayFromMediaId = -this.MediaBrowserCompatCustomActionResultReceiver;
        this.onMediaButtonEvent = this.onFastForward + this.AudioAttributesImplApi26Parcelizer;
    }

    public final void write(int p0) {
        this.onFastForward = p0;
        this.onMediaButtonEvent = p0 + this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.addAudioOffloadListener
    public final long read(int p0) {
        if (p0 == 0 && AudioAttributesImplBaseParcelizer() == 0) {
            boolean remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
            int onCommand = getOnCommand();
            if (!remoteActionCompatParcelizer) {
                return hasReferringProperties.read(((long) onCommand) << 32);
            }
            long j = -1;
            return hasReferringProperties.read(((long) onCommand) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))));
        }
        int[] iArr = this.onPrepareFromMediaId;
        int i = p0 << 1;
        long j2 = -1;
        return hasReferringProperties.read((((long) iArr[i + 1]) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) iArr[i]) << 32));
    }

    public final void write(int p0, boolean p1) {
        int iIntValue;
        int iAudioAttributesCompatParcelizer;
        if (getOnPause()) {
            return;
        }
        this.onCommand = getOnCommand() + p0;
        int length = this.onPrepareFromMediaId.length;
        for (int i = 0; i < length; i++) {
            int i2 = i & 1;
            if ((getRemoteActionCompatParcelizer() && i2 != 0) || (!getRemoteActionCompatParcelizer() && i2 == 0)) {
                int[] iArr = this.onPrepareFromMediaId;
                iArr[i] = iArr[i] + p0;
            }
        }
        if (p1) {
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            for (int i3 = 0; i3 < iAudioAttributesImplBaseParcelizer; i3++) {
                onReset onresetWrite = this.MediaBrowserCompatMediaItem.write(getMediaMetadataCompat(), i3);
                if (onresetWrite != null) {
                    long ratingCompat = onresetWrite.getRatingCompat();
                    if (getRemoteActionCompatParcelizer()) {
                        iIntValue = hasReferringProperties.IconCompatParcelizer(ratingCompat);
                        iAudioAttributesCompatParcelizer = Integer.valueOf(hasReferringProperties.AudioAttributesCompatParcelizer(ratingCompat) + p0).intValue();
                    } else {
                        iIntValue = Integer.valueOf(hasReferringProperties.IconCompatParcelizer(ratingCompat) + p0).intValue();
                        iAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(ratingCompat);
                    }
                    long j = -1;
                    onresetWrite.IconCompatParcelizer(hasReferringProperties.read((((long) iIntValue) << 32) | (((long) iAudioAttributesCompatParcelizer) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
                }
            }
        }
    }

    public final void IconCompatParcelizer(_parser.IconCompatParcelizer p0, boolean p1) {
        hasAnyGetter mediaDescriptionCompat;
        int i;
        hasAnyGetter hasanygetter;
        int i2;
        long jAudioAttributesCompatParcelizer;
        if (this.onFastForward == Integer.MIN_VALUE) {
            getRootStableInsets.RemoteActionCompatParcelizer("position() should be called first");
        }
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        int i3 = 0;
        int i4 = 0;
        while (i4 < iAudioAttributesImplBaseParcelizer) {
            _parser _parserVar = this.read.get(i4);
            int iAudioAttributesCompatParcelizer = this.onPlayFromMediaId - AudioAttributesCompatParcelizer(_parserVar);
            int i5 = this.onMediaButtonEvent;
            long onCommand = read(i4);
            onReset onresetWrite = this.MediaBrowserCompatMediaItem.write(getMediaMetadataCompat(), i4);
            if (onresetWrite != null) {
                if (p1) {
                    onresetWrite.write(onCommand);
                } else {
                    if (!hasReferringProperties.write(onresetWrite.getOnCommand(), onReset.INSTANCE.IconCompatParcelizer())) {
                        onCommand = onresetWrite.getOnCommand();
                    }
                    long jAudioAttributesCompatParcelizer2 = hasReferringProperties.AudioAttributesCompatParcelizer(onCommand, onresetWrite.AudioAttributesImplApi21Parcelizer());
                    if ((read(onCommand) <= iAudioAttributesCompatParcelizer && read(jAudioAttributesCompatParcelizer2) <= iAudioAttributesCompatParcelizer) || (read(onCommand) >= i5 && read(jAudioAttributesCompatParcelizer2) >= i5)) {
                        onresetWrite.write();
                    }
                    onCommand = jAudioAttributesCompatParcelizer2;
                }
                mediaDescriptionCompat = onresetWrite.getMediaDescriptionCompat();
            } else {
                mediaDescriptionCompat = null;
            }
            if (this.AudioAttributesImplApi21Parcelizer) {
                if (getRemoteActionCompatParcelizer()) {
                    int iIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(onCommand);
                    i = i4;
                    hasanygetter = mediaDescriptionCompat;
                    long j = ((long) i3) << 32;
                    long j2 = -1;
                    jAudioAttributesCompatParcelizer = ((j | (j2 - ((j2 >> 63) << 32))) & ((long) ((this.onFastForward - hasReferringProperties.AudioAttributesCompatParcelizer(onCommand)) - AudioAttributesCompatParcelizer(_parserVar)))) | (((long) iIconCompatParcelizer) << 32);
                    i2 = 0;
                } else {
                    i = i4;
                    hasanygetter = mediaDescriptionCompat;
                    int iIconCompatParcelizer2 = hasReferringProperties.IconCompatParcelizer(onCommand);
                    int i6 = this.onFastForward;
                    long jAudioAttributesCompatParcelizer3 = ((long) ((i6 - iIconCompatParcelizer2) - AudioAttributesCompatParcelizer(_parserVar))) << 32;
                    i2 = 0;
                    long j3 = -1;
                    jAudioAttributesCompatParcelizer = jAudioAttributesCompatParcelizer3 | (((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & ((long) hasReferringProperties.AudioAttributesCompatParcelizer(onCommand)));
                }
                onCommand = hasReferringProperties.read(jAudioAttributesCompatParcelizer);
            } else {
                i = i4;
                hasanygetter = mediaDescriptionCompat;
                i2 = i3;
            }
            long jAudioAttributesCompatParcelizer4 = hasReferringProperties.AudioAttributesCompatParcelizer(onCommand, this.MediaDescriptionCompat);
            if (!p1 && onresetWrite != null) {
                onresetWrite.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer4);
            }
            if (getRemoteActionCompatParcelizer()) {
                if (hasanygetter != null) {
                    _parser.IconCompatParcelizer.IconCompatParcelizer$default(p0, _parserVar, jAudioAttributesCompatParcelizer4, hasanygetter, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
                } else {
                    _parser.IconCompatParcelizer.read$default(p0, _parserVar, jAudioAttributesCompatParcelizer4, BitmapDescriptorFactory.HUE_RED, (getAnswerMap) null, 6, (Object) null);
                }
            } else if (hasanygetter != null) {
                _parser.IconCompatParcelizer.read$default(p0, _parserVar, jAudioAttributesCompatParcelizer4, hasanygetter, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            } else {
                _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(p0, _parserVar, jAudioAttributesCompatParcelizer4, BitmapDescriptorFactory.HUE_RED, (getAnswerMap) null, 6, (Object) null);
            }
            i4 = i + 1;
            i3 = i2;
        }
    }

    private final int read(long j) {
        return getRemoteActionCompatParcelizer() ? hasReferringProperties.AudioAttributesCompatParcelizer(j) : hasReferringProperties.IconCompatParcelizer(j);
    }

    private final int AudioAttributesCompatParcelizer(_parser _parserVar) {
        return getRemoteActionCompatParcelizer() ? _parserVar.getRemoteActionCompatParcelizer() : _parserVar.getRead();
    }

    public /* synthetic */ setAllowReturnTransitionOverlap(int i, List list, boolean z, _skipWSOrEnd.write writeVar, _skipWSOrEnd.read readVar, tryToResolveUnresolved trytoresolveunresolved, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, stopLoading stoploading, long j2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, list, z, writeVar, readVar, trytoresolveunresolved, z2, i2, i3, i4, j, obj, obj2, stoploading, j2);
    }
}
