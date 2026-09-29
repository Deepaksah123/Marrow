package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J/\u0010#\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J=\u0010#\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b#\u0010%J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b#\u0010&J\u001d\u0010 \u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b \u0010'J\u001d\u0010 \u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b \u0010)R\u001a\u0010-\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b \u0010,R\u001a\u0010 \u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010#\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010+R\u0014\u00108\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00103R\u0014\u00106\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u00100\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0014\u00102\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010*\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010AR\u001a\u00109\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b=\u0010?\u001a\u0004\b#\u0010CR\u001a\u00104\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b*\u0010,R\u001a\u0010.\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\b.\u0010,R\u001a\u0010E\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bB\u0010,R\u001a\u0010G\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\b6\u0010,R\u0014\u0010H\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0016\u0010I\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010+R\u0016\u0010F\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010+R\u0016\u0010J\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010+R\u001a\u0010L\u001a\u00020K8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\b=\u0010CR$\u0010;\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00138\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\b-\u0010CR$\u00107\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bL\u0010+\u001a\u0004\b\u001e\u0010,R$\u0010D\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b8\u0010,R\"\u0010N\u001a\u00020\u00078\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bI\u00103\u001a\u0004\b9\u00105\"\u0004\b\u001e\u0010MR\u0018\u0010>\u001a\u00020\u0003*\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010OR\u0018\u0010Q\u001a\u00020\u0003*\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010P"}, d2 = {"Lo/createInternalPathIterator;", "Lo/onResumeFragments;", "Lo/addAudioOffloadListener;", "", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "Lo/tryToResolveUnresolved;", "p6", "p7", "p8", "", "Lo/_parser;", "p9", "Lo/hasReferringProperties;", "p10", "p11", "Lo/stopLoading;", "p12", "Lo/PropertyValueAny;", "p13", "p14", "p15", "<init>", "(ILjava/lang/Object;ZIIZLo/tryToResolveUnresolved;IILjava/util/List;JLjava/lang/Object;Lo/stopLoading;JIILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "IconCompatParcelizer", "(I)Ljava/lang/Object;", "read", "(I)J", "", "write", "(IIII)V", "(IIIIII)V", "(I)V", "(IZ)V", "Lo/_parser$IconCompatParcelizer;", "(Lo/_parser$IconCompatParcelizer;Z)V", "AudioAttributesImplApi26Parcelizer", "I", "()I", "AudioAttributesCompatParcelizer", "RatingCompat", "Ljava/lang/Object;", "MediaBrowserCompatItemReceiver", "()Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer", "Z", "MediaBrowserCompatSearchResultReceiver", "()Z", "MediaBrowserCompatCustomActionResultReceiver", "onPlayFromMediaId", "RemoteActionCompatParcelizer", "MediaDescriptionCompat", "Lo/tryToResolveUnresolved;", "onPause", "Ljava/util/List;", "AudioAttributesImplApi21Parcelizer", "onPrepareFromMediaId", "J", "MediaBrowserCompatMediaItem", "Lo/stopLoading;", "MediaMetadataCompat", "()J", "onMediaButtonEvent", "onCommand", "handleMediaPlayPauseIfPendingOnHandler", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onAddQueueItem", "onCustomAction", "onFastForward", "Lo/getKey;", "onPlay", "(Z)V", "onPlayFromSearch", "(J)I", "(Lo/_parser;)I", "onPrepareFromSearch"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class createInternalPathIterator implements onResumeFragments, addAudioOffloadListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final stopLoading<createInternalPathIterator> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final long MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Object MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private int onCustomAction;
    private final int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private long onPause;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final tryToResolveUnresolved MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int onCommand;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final Object read;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private int handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private int onFastForward;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private boolean onPlayFromSearch;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final long onPlay;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final List<_parser> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private int onPlayFromMediaId;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final long AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int onMediaButtonEvent;

    /* JADX WARN: Multi-variable type inference failed */
    private createInternalPathIterator(int i, Object obj, boolean z, int i2, int i3, boolean z2, tryToResolveUnresolved trytoresolveunresolved, int i4, int i5, List<? extends _parser> list, long j, Object obj2, stopLoading<createInternalPathIterator> stoploading, long j2, int i6, int i7) {
        long j3;
        this.AudioAttributesCompatParcelizer = i;
        this.read = obj;
        this.write = z;
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = trytoresolveunresolved;
        this.MediaBrowserCompatItemReceiver = i4;
        this.AudioAttributesImplBaseParcelizer = i5;
        this.AudioAttributesImplApi21Parcelizer = list;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.MediaBrowserCompatMediaItem = obj2;
        this.MediaMetadataCompat = stoploading;
        this.MediaDescriptionCompat = j2;
        this.MediaBrowserCompatSearchResultReceiver = i6;
        this.RatingCompat = i7;
        this.onCustomAction = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            _parser _parserVar = (_parser) list.get(i8);
            iMax = Math.max(iMax, getWrite() ? _parserVar.getRemoteActionCompatParcelizer() : _parserVar.getRead());
        }
        this.onCommand = iMax;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getQues.write(i3 + iMax, 0);
        if (getWrite()) {
            long j4 = -1;
            j3 = getKey.read((((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32))) & ((long) iMax)) | (((long) this.IconCompatParcelizer) << 32));
        } else {
            long j5 = -1;
            j3 = getKey.read((((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32))) & ((long) this.IconCompatParcelizer)) | (((long) iMax) << 32));
        }
        this.onPlay = j3;
        this.onPause = hasReferringProperties.INSTANCE.write();
        this.onPlayFromMediaId = -1;
        this.onMediaButtonEvent = -1;
    }

    @Override // kotlin.onResumeFragments, kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final Object getRead() {
        return this.read;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    @Override // kotlin.addAudioOffloadListener
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.addAudioOffloadListener
    public final int AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.size();
    }

    @Override // kotlin.addAudioOffloadListener
    public final Object IconCompatParcelizer(int p0) {
        return this.AudioAttributesImplApi21Parcelizer.get(p0).q_();
    }

    @Override // kotlin.onResumeFragments
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final long getOnPlay() {
        return this.onPlay;
    }

    @Override // kotlin.onResumeFragments
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getOnPause() {
        return this.onPause;
    }

    @Override // kotlin.onResumeFragments
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    @Override // kotlin.onResumeFragments
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    @Override // kotlin.addAudioOffloadListener
    public final long read(int p0) {
        return getOnPause();
    }

    @Override // kotlin.addAudioOffloadListener
    public final void IconCompatParcelizer(boolean z) {
        this.onPlayFromSearch = z;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    @Override // kotlin.addAudioOffloadListener
    public final void write(int p0, int p1, int p2, int p3) {
        write(p0, p1, p2, p3, -1, -1);
    }

    public final void write(int p0, int p1, int p2, int p3, int p4, int p5) {
        long j;
        this.onCustomAction = getWrite() ? p3 : p2;
        if (!getWrite()) {
            p2 = p3;
        }
        if (getWrite() && this.MediaBrowserCompatCustomActionResultReceiver == tryToResolveUnresolved.RemoteActionCompatParcelizer) {
            p1 = (p2 - p1) - this.IconCompatParcelizer;
        }
        if (getWrite()) {
            long j2 = -1;
            j = hasReferringProperties.read((((long) p1) << 32) | (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) p0)));
        } else {
            long j3 = -1;
            j = hasReferringProperties.read((((long) p1) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | (((long) p0) << 32));
        }
        this.onPause = j;
        this.onPlayFromMediaId = p4;
        this.onMediaButtonEvent = p5;
        this.handleMediaPlayPauseIfPendingOnHandler = -this.MediaBrowserCompatItemReceiver;
        this.onFastForward = this.onCustomAction + this.AudioAttributesImplBaseParcelizer;
    }

    public final void write(int p0) {
        this.onCustomAction = p0;
        this.onFastForward = p0 + this.AudioAttributesImplBaseParcelizer;
    }

    public final void read(int p0, boolean p1) {
        if (getOnPlayFromSearch()) {
            return;
        }
        long onPause = getOnPause();
        int iIconCompatParcelizer = getWrite() ? hasReferringProperties.IconCompatParcelizer(onPause) : hasReferringProperties.IconCompatParcelizer(onPause) + p0;
        boolean write = getWrite();
        int iAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(onPause);
        if (write) {
            iAudioAttributesCompatParcelizer += p0;
        }
        int i = 0;
        long j = -1;
        this.onPause = hasReferringProperties.read((((long) iIconCompatParcelizer) << 32) | (((long) iAudioAttributesCompatParcelizer) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        if (p1) {
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            int i2 = 0;
            while (i2 < iAudioAttributesImplBaseParcelizer) {
                onReset onresetWrite = this.MediaMetadataCompat.write(getRead(), i2);
                if (onresetWrite != null) {
                    long ratingCompat = onresetWrite.getRatingCompat();
                    int iIconCompatParcelizer2 = getWrite() ? hasReferringProperties.IconCompatParcelizer(ratingCompat) : Integer.valueOf(hasReferringProperties.IconCompatParcelizer(ratingCompat) + p0).intValue();
                    boolean write2 = getWrite();
                    int iAudioAttributesCompatParcelizer2 = hasReferringProperties.AudioAttributesCompatParcelizer(ratingCompat);
                    if (write2) {
                        iAudioAttributesCompatParcelizer2 = Integer.valueOf(iAudioAttributesCompatParcelizer2 + p0).intValue();
                    }
                    long j2 = ((long) i) << 32;
                    long j3 = -1;
                    onresetWrite.IconCompatParcelizer(hasReferringProperties.read((((j3 - ((j3 >> 63) << 32)) | j2) & ((long) iAudioAttributesCompatParcelizer2)) | (((long) iIconCompatParcelizer2) << 32)));
                }
                i2++;
                i = 0;
            }
        }
    }

    public final void read(_parser.IconCompatParcelizer p0, boolean p1) {
        hasAnyGetter mediaDescriptionCompat;
        int iAudioAttributesCompatParcelizer;
        if (this.onCustomAction == Integer.MIN_VALUE) {
            getRootStableInsets.RemoteActionCompatParcelizer("position() should be called first");
        }
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        for (int i = 0; i < iAudioAttributesImplBaseParcelizer; i++) {
            _parser _parserVar = this.AudioAttributesImplApi21Parcelizer.get(i);
            int iRemoteActionCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler - RemoteActionCompatParcelizer(_parserVar);
            int i2 = this.onFastForward;
            long onPause = getOnPause();
            onReset onresetWrite = this.MediaMetadataCompat.write(getRead(), i);
            if (onresetWrite != null) {
                if (p1) {
                    onresetWrite.write(onPause);
                } else {
                    long jAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(!hasReferringProperties.write(onresetWrite.getOnCommand(), onReset.INSTANCE.IconCompatParcelizer()) ? onresetWrite.getOnCommand() : onPause, onresetWrite.AudioAttributesImplApi21Parcelizer());
                    if ((read(onPause) <= iRemoteActionCompatParcelizer && read(jAudioAttributesCompatParcelizer) <= iRemoteActionCompatParcelizer) || (read(onPause) >= i2 && read(jAudioAttributesCompatParcelizer) >= i2)) {
                        onresetWrite.write();
                    }
                    onPause = jAudioAttributesCompatParcelizer;
                }
                mediaDescriptionCompat = onresetWrite.getMediaDescriptionCompat();
            } else {
                mediaDescriptionCompat = null;
            }
            if (this.RemoteActionCompatParcelizer) {
                int iIconCompatParcelizer = getWrite() ? hasReferringProperties.IconCompatParcelizer(onPause) : (this.onCustomAction - hasReferringProperties.IconCompatParcelizer(onPause)) - RemoteActionCompatParcelizer(_parserVar);
                if (getWrite()) {
                    iAudioAttributesCompatParcelizer = (this.onCustomAction - hasReferringProperties.AudioAttributesCompatParcelizer(onPause)) - RemoteActionCompatParcelizer(_parserVar);
                } else {
                    iAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(onPause);
                }
                long j = -1;
                onPause = hasReferringProperties.read((((long) iAudioAttributesCompatParcelizer) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) iIconCompatParcelizer) << 32));
            }
            long jAudioAttributesCompatParcelizer2 = hasReferringProperties.AudioAttributesCompatParcelizer(onPause, this.AudioAttributesImplApi26Parcelizer);
            if (!p1 && onresetWrite != null) {
                onresetWrite.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer2);
            }
            if (getWrite()) {
                if (mediaDescriptionCompat != null) {
                    _parser.IconCompatParcelizer.IconCompatParcelizer$default(p0, _parserVar, jAudioAttributesCompatParcelizer2, mediaDescriptionCompat, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
                } else {
                    _parser.IconCompatParcelizer.read$default(p0, _parserVar, jAudioAttributesCompatParcelizer2, BitmapDescriptorFactory.HUE_RED, (getAnswerMap) null, 6, (Object) null);
                }
            } else if (mediaDescriptionCompat != null) {
                _parser.IconCompatParcelizer.read$default(p0, _parserVar, jAudioAttributesCompatParcelizer2, mediaDescriptionCompat, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
            } else {
                _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(p0, _parserVar, jAudioAttributesCompatParcelizer2, BitmapDescriptorFactory.HUE_RED, (getAnswerMap) null, 6, (Object) null);
            }
        }
    }

    private final int read(long j) {
        return getWrite() ? hasReferringProperties.AudioAttributesCompatParcelizer(j) : hasReferringProperties.IconCompatParcelizer(j);
    }

    private final int RemoteActionCompatParcelizer(_parser _parserVar) {
        return getWrite() ? _parserVar.getRemoteActionCompatParcelizer() : _parserVar.getRead();
    }

    public /* synthetic */ createInternalPathIterator(int i, Object obj, boolean z, int i2, int i3, boolean z2, tryToResolveUnresolved trytoresolveunresolved, int i4, int i5, List list, long j, Object obj2, stopLoading stoploading, long j2, int i6, int i7, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, obj, z, i2, i3, z2, trytoresolveunresolved, i4, i5, list, j, obj2, stoploading, j2, i6, i7);
    }
}
