package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÙ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b(\u0010)R\u0019\u0010.\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00106\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010*\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u00109R\u0014\u0010/\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u001a\u0010;\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010E\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010C\u001a\u0004\b>\u0010DR\u0014\u0010F\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00100R8\u0010J\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010G\u001a\u0004\bH\u0010IR \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010GR \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00190\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b;\u0010MR\u001a\u00104\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\bE\u00102R\u001a\u00108\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bN\u00100\u001a\u0004\bF\u00102R\u001a\u0010K\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bH\u00100\u001a\u0004\b:\u00102R\u001a\u0010,\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\bJ\u00103\u001a\u0004\bN\u00105R\u001a\u0010H\u001a\u00020\u001f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bA\u0010O\u001a\u0004\b6\u0010PR\u001a\u00101\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b=\u00102R\u001a\u0010N\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bF\u00100\u001a\u0004\b%\u00102R\u0011\u0010Q\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bJ\u00105R\u0014\u0010?\u001a\u00020R8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010SR\u0014\u0010T\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u00102R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u00050U8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010WR\u0014\u0010X\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u00102R\"\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020'\u0018\u00010\u00138WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010IR\u0014\u0010[\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u00102"}, d2 = {"Lo/destroyInternalPathIterator;", "Lo/FragmentManagerState;", "Lo/withHandlersFrom;", "Lo/PathIteratorPreApi34Impl;", "p0", "", "p1", "", "p2", "", "p3", "p4", "p5", "p6", "Lo/TopUserCompanion;", "p7", "Lo/bufferMapProperty;", "p8", "p9", "Lkotlin/Function1;", "", "Lo/getSubscriptionExpiresOn;", "Lo/PropertyValueAny;", "p10", "p11", "Lo/createInternalPathIterator;", "p12", "p13", "p14", "p15", "p16", "Lo/superDispatchKeyEvent;", "p17", "p18", "p19", "<init>", "(Lo/PathIteratorPreApi34Impl;IZFLo/withHandlersFrom;FZLo/TopUserCompanion;Lo/bufferMapProperty;ILo/getAnswerMap;Lo/getAnswerMap;Ljava/util/List;IIIZLo/superDispatchKeyEvent;II)V", "AudioAttributesCompatParcelizer", "(IZ)Lo/destroyInternalPathIterator;", "", "onMediaButtonEvent", "()V", "MediaBrowserCompatItemReceiver", "Lo/PathIteratorPreApi34Impl;", "onCommand", "()Lo/PathIteratorPreApi34Impl;", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "I", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()I", "Z", "MediaDescriptionCompat", "()Z", "RemoteActionCompatParcelizer", "F", "MediaBrowserCompatMediaItem", "()F", "write", "AudioAttributesImplApi21Parcelizer", "Lo/withHandlersFrom;", "read", "MediaMetadataCompat", "onPlayFromMediaId", "Lo/TopUserCompanion;", "RatingCompat", "()Lo/TopUserCompanion;", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getAnswerMap;", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/getAnswerMap;", "MediaBrowserCompatSearchResultReceiver", "onAddQueueItem", "Ljava/util/List;", "()Ljava/util/List;", "onCustomAction", "Lo/superDispatchKeyEvent;", "()Lo/superDispatchKeyEvent;", "onFastForward", "Lo/getKey;", "()J", "onPlay", "", "Lo/weirdNumberException;", "()Ljava/util/Map;", "onPause", "Lo/JsonNode;", "onPrepareFromMediaId", "onPrepareFromSearch"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class destroyInternalPathIterator implements FragmentManagerState, withHandlersFrom {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final withHandlersFrom read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<Integer, Integer> RatingCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int onCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final PathIteratorPreApi34Impl IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getAnswerMap<Integer, List<Pair<Integer, PropertyValueAny>>> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final boolean onCommand;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final float MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final superDispatchKeyEvent handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final int onAddQueueItem;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final List<createInternalPathIterator> MediaMetadataCompat;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final bufferMapProperty AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final TopUserCompanion AudioAttributesImplApi21Parcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public destroyInternalPathIterator(PathIteratorPreApi34Impl pathIteratorPreApi34Impl, int i, boolean z, float f, withHandlersFrom withhandlersfrom, float f2, boolean z2, TopUserCompanion topUserCompanion, bufferMapProperty buffermapproperty, int i2, getAnswerMap<? super Integer, ? extends List<Pair<Integer, PropertyValueAny>>> getanswermap, getAnswerMap<? super Integer, Integer> getanswermap2, List<createInternalPathIterator> list, int i3, int i4, int i5, boolean z3, superDispatchKeyEvent superdispatchkeyevent, int i6, int i7) {
        this.IconCompatParcelizer = pathIteratorPreApi34Impl;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = z;
        this.write = f;
        this.read = withhandlersfrom;
        this.MediaBrowserCompatItemReceiver = f2;
        this.AudioAttributesImplApi26Parcelizer = z2;
        this.AudioAttributesImplApi21Parcelizer = topUserCompanion;
        this.AudioAttributesImplBaseParcelizer = buffermapproperty;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.MediaBrowserCompatSearchResultReceiver = getanswermap;
        this.RatingCompat = getanswermap2;
        this.MediaMetadataCompat = list;
        this.MediaDescriptionCompat = i3;
        this.MediaBrowserCompatMediaItem = i4;
        this.onAddQueueItem = i5;
        this.onCommand = z3;
        this.handleMediaPlayPauseIfPendingOnHandler = superdispatchkeyevent;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i6;
        this.onCustomAction = i7;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final PathIteratorPreApi34Impl getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final float getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final TopUserCompanion getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final bufferMapProperty getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final getAnswerMap<Integer, List<Pair<Integer, PropertyValueAny>>> handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.FragmentManagerState
    public final List<createInternalPathIterator> AudioAttributesImplApi21Parcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.FragmentManagerState
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.FragmentManagerState
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.FragmentManagerState
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final boolean getOnCommand() {
        return this.onCommand;
    }

    @Override // kotlin.FragmentManagerState
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final superDispatchKeyEvent getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    @Override // kotlin.FragmentManagerState
    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.FragmentManagerState
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getOnCustomAction() {
        return this.onCustomAction;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        PathIteratorPreApi34Impl pathIteratorPreApi34Impl = this.IconCompatParcelizer;
        return ((pathIteratorPreApi34Impl == null || pathIteratorPreApi34Impl.getIconCompatParcelizer() == 0) && this.AudioAttributesCompatParcelizer == 0) ? false : true;
    }

    @Override // kotlin.FragmentManagerState
    public final long MediaBrowserCompatItemReceiver() {
        long j = -1;
        return getKey.read((((long) getIconCompatParcelizer()) << 32) | (((long) getRead()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    @Override // kotlin.FragmentManagerState
    public final int IconCompatParcelizer() {
        return -getMediaDescriptionCompat();
    }

    public final destroyInternalPathIterator AudioAttributesCompatParcelizer(int p0, boolean p1) {
        PathIteratorPreApi34Impl pathIteratorPreApi34Impl;
        if (this.AudioAttributesImplApi26Parcelizer || AudioAttributesImplApi21Parcelizer().isEmpty() || (pathIteratorPreApi34Impl = this.IconCompatParcelizer) == null) {
            return null;
        }
        int mediaBrowserCompatItemReceiver = pathIteratorPreApi34Impl.getMediaBrowserCompatItemReceiver();
        int i = this.AudioAttributesCompatParcelizer - p0;
        if (i < 0 || i >= mediaBrowserCompatItemReceiver) {
            return null;
        }
        createInternalPathIterator createinternalpathiterator = (createInternalPathIterator) IntermediateLoginResponseBody.RatingCompat((List) AudioAttributesImplApi21Parcelizer());
        createInternalPathIterator createinternalpathiterator2 = (createInternalPathIterator) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) AudioAttributesImplApi21Parcelizer());
        if (createinternalpathiterator.getOnPlayFromSearch() || createinternalpathiterator2.getOnPlayFromSearch()) {
            return null;
        }
        if (p0 < 0) {
            if (Math.min((onPopulateAccessibilityEvent.AudioAttributesCompatParcelizer(createinternalpathiterator, getHandleMediaPlayPauseIfPendingOnHandler()) + createinternalpathiterator.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) - getMediaDescriptionCompat(), (onPopulateAccessibilityEvent.AudioAttributesCompatParcelizer(createinternalpathiterator2, getHandleMediaPlayPauseIfPendingOnHandler()) + createinternalpathiterator2.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) - getMediaBrowserCompatMediaItem()) <= (-p0)) {
                return null;
            }
        } else if (Math.min(getMediaDescriptionCompat() - onPopulateAccessibilityEvent.AudioAttributesCompatParcelizer(createinternalpathiterator, getHandleMediaPlayPauseIfPendingOnHandler()), getMediaBrowserCompatMediaItem() - onPopulateAccessibilityEvent.AudioAttributesCompatParcelizer(createinternalpathiterator2, getHandleMediaPlayPauseIfPendingOnHandler())) <= p0) {
            return null;
        }
        List<createInternalPathIterator> listAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        int size = listAudioAttributesImplApi21Parcelizer.size();
        for (int i2 = 0; i2 < size; i2++) {
            listAudioAttributesImplApi21Parcelizer.get(i2).read(p0, p1);
        }
        return new destroyInternalPathIterator(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer - p0, this.RemoteActionCompatParcelizer || p0 > 0, p0, this.read, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatSearchResultReceiver, this.RatingCompat, AudioAttributesImplApi21Parcelizer(), getMediaDescriptionCompat(), getMediaBrowserCompatMediaItem(), getOnAddQueueItem(), getOnCommand(), getHandleMediaPlayPauseIfPendingOnHandler(), getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), getOnCustomAction());
    }

    @Override // kotlin.withHandlersFrom
    public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
        return this.read.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.withHandlersFrom
    /* JADX INFO: renamed from: onAddQueueItem */
    public final int getRead() {
        return this.read.getRead();
    }

    @Override // kotlin.withHandlersFrom
    public final getAnswerMap<JsonNode, getShowPopup> onPause() {
        return this.read.onPause();
    }

    @Override // kotlin.withHandlersFrom
    /* JADX INFO: renamed from: onFastForward */
    public final int getIconCompatParcelizer() {
        return this.read.getIconCompatParcelizer();
    }

    @Override // kotlin.withHandlersFrom
    public final void onMediaButtonEvent() {
        this.read.onMediaButtonEvent();
    }
}
