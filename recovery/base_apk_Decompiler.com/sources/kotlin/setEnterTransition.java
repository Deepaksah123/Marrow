package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010)\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010 \u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00105\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00106\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u0014\u0010;\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\u001a\u0010*\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010%\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010E\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010B\u001a\u0004\bC\u0010DR \u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bE\u0010HR\u001a\u0010C\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\b6\u0010-R\u001a\u0010=\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b;\u0010-R\u001a\u00100\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b5\u0010-R\u001a\u00103\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bI\u00101R\u001a\u0010F\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\b)\u0010KR\u001a\u0010I\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b \u0010-R\u001a\u0010,\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\bE\u0010+\u001a\u0004\b.\u0010-R\u0011\u0010@\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b9\u00101R\u0014\u0010'\u001a\u00020L8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010DR\u0014\u0010:\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010-R \u0010P\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00050M8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010OR\u0014\u0010Q\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010-R\"\u0010U\u001a\u0010\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\"\u0018\u00010R8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010TR\u0014\u0010#\u001a\u00020\u00058\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010-"}, d2 = {"Lo/setEnterTransition;", "Lo/requireParentFragment;", "Lo/withHandlersFrom;", "Lo/setAllowReturnTransitionOverlap;", "p0", "", "p1", "", "p2", "", "p3", "p4", "p5", "p6", "Lo/TopUserCompanion;", "p7", "Lo/bufferMapProperty;", "p8", "Lo/PropertyValueAny;", "p9", "", "p10", "p11", "p12", "p13", "p14", "Lo/superDispatchKeyEvent;", "p15", "p16", "p17", "<init>", "(Lo/setAllowReturnTransitionOverlap;IZFLo/withHandlersFrom;FZLo/TopUserCompanion;Lo/bufferMapProperty;JLjava/util/List;IIIZLo/superDispatchKeyEvent;IILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "(IZ)Lo/setEnterTransition;", "", "onMediaButtonEvent", "()V", "AudioAttributesImplApi21Parcelizer", "Lo/setAllowReturnTransitionOverlap;", "onCommand", "()Lo/setAllowReturnTransitionOverlap;", "read", "AudioAttributesImplApi26Parcelizer", "I", "handleMediaPlayPauseIfPendingOnHandler", "()I", "IconCompatParcelizer", "Z", "MediaMetadataCompat", "()Z", "F", "MediaBrowserCompatMediaItem", "()F", "write", "MediaBrowserCompatCustomActionResultReceiver", "Lo/withHandlersFrom;", "RemoteActionCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "onPlayFromMediaId", "MediaBrowserCompatItemReceiver", "Lo/TopUserCompanion;", "MediaDescriptionCompat", "()Lo/TopUserCompanion;", "Lo/bufferMapProperty;", "onCustomAction", "()Lo/bufferMapProperty;", "J", "RatingCompat", "()J", "AudioAttributesImplBaseParcelizer", "onAddQueueItem", "Ljava/util/List;", "()Ljava/util/List;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/superDispatchKeyEvent;", "()Lo/superDispatchKeyEvent;", "Lo/getKey;", "", "Lo/weirdNumberException;", "()Ljava/util/Map;", "onPause", "onFastForward", "Lkotlin/Function1;", "Lo/JsonNode;", "()Lo/getAnswerMap;", "onPlay"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setEnterTransition implements requireParentFragment, withHandlersFrom {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setAllowReturnTransitionOverlap read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final withHandlersFrom RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final bufferMapProperty AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final float MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final int MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final superDispatchKeyEvent onAddQueueItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final List<setAllowReturnTransitionOverlap> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final TopUserCompanion AudioAttributesImplApi26Parcelizer;

    private setEnterTransition(setAllowReturnTransitionOverlap setallowreturntransitionoverlap, int i, boolean z, float f, withHandlersFrom withhandlersfrom, float f2, boolean z2, TopUserCompanion topUserCompanion, bufferMapProperty buffermapproperty, long j, List<setAllowReturnTransitionOverlap> list, int i2, int i3, int i4, boolean z3, superDispatchKeyEvent superdispatchkeyevent, int i5, int i6) {
        this.read = setallowreturntransitionoverlap;
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = z;
        this.write = f;
        this.RemoteActionCompatParcelizer = withhandlersfrom;
        this.MediaBrowserCompatCustomActionResultReceiver = f2;
        this.MediaBrowserCompatItemReceiver = z2;
        this.AudioAttributesImplApi26Parcelizer = topUserCompanion;
        this.AudioAttributesImplApi21Parcelizer = buffermapproperty;
        this.AudioAttributesImplBaseParcelizer = j;
        this.MediaBrowserCompatSearchResultReceiver = list;
        this.RatingCompat = i2;
        this.MediaDescriptionCompat = i3;
        this.MediaMetadataCompat = i4;
        this.MediaBrowserCompatMediaItem = z3;
        this.onAddQueueItem = superdispatchkeyevent;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5;
        this.handleMediaPlayPauseIfPendingOnHandler = i6;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final setAllowReturnTransitionOverlap getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final float getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final TopUserCompanion getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final bufferMapProperty getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final long getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.requireParentFragment
    public final List<setAllowReturnTransitionOverlap> AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.requireParentFragment
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    @Override // kotlin.requireParentFragment
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.requireParentFragment
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.requireParentFragment
    /* JADX INFO: renamed from: read, reason: from getter */
    public final superDispatchKeyEvent getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    @Override // kotlin.requireParentFragment
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.requireParentFragment
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        setAllowReturnTransitionOverlap setallowreturntransitionoverlap = this.read;
        return ((setallowreturntransitionoverlap == null || setallowreturntransitionoverlap.getIconCompatParcelizer() == 0) && this.IconCompatParcelizer == 0) ? false : true;
    }

    @Override // kotlin.requireParentFragment
    public final long AudioAttributesImplApi21Parcelizer() {
        long j = -1;
        return getKey.read((((long) getAudioAttributesCompatParcelizer()) << 32) | (((long) getRead()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    @Override // kotlin.requireParentFragment
    public final int RemoteActionCompatParcelizer() {
        return -getRatingCompat();
    }

    public final setEnterTransition AudioAttributesCompatParcelizer(int p0, boolean p1) {
        setAllowReturnTransitionOverlap setallowreturntransitionoverlap;
        if (this.MediaBrowserCompatItemReceiver || AudioAttributesImplBaseParcelizer().isEmpty() || (setallowreturntransitionoverlap = this.read) == null) {
            return null;
        }
        int mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = setallowreturntransitionoverlap.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        int i = this.IconCompatParcelizer - p0;
        if (i < 0 || i >= mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return null;
        }
        setAllowReturnTransitionOverlap setallowreturntransitionoverlap2 = (setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.RatingCompat((List) AudioAttributesImplBaseParcelizer());
        setAllowReturnTransitionOverlap setallowreturntransitionoverlap3 = (setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) AudioAttributesImplBaseParcelizer());
        if (setallowreturntransitionoverlap2.getOnPause() || setallowreturntransitionoverlap3.getOnPause()) {
            return null;
        }
        if (p0 < 0) {
            if (Math.min((setallowreturntransitionoverlap2.getOnCommand() + setallowreturntransitionoverlap2.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) - getRatingCompat(), (setallowreturntransitionoverlap3.getOnCommand() + setallowreturntransitionoverlap3.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) - getMediaDescriptionCompat()) <= (-p0)) {
                return null;
            }
        } else if (Math.min(getRatingCompat() - setallowreturntransitionoverlap2.getOnCommand(), getMediaDescriptionCompat() - setallowreturntransitionoverlap3.getOnCommand()) <= p0) {
            return null;
        }
        List<setAllowReturnTransitionOverlap> listAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        int size = listAudioAttributesImplBaseParcelizer.size();
        for (int i2 = 0; i2 < size; i2++) {
            listAudioAttributesImplBaseParcelizer.get(i2).write(p0, p1);
        }
        return new setEnterTransition(this.read, this.IconCompatParcelizer - p0, this.AudioAttributesCompatParcelizer || p0 > 0, p0, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer(), getRatingCompat(), getMediaDescriptionCompat(), getMediaMetadataCompat(), getMediaBrowserCompatMediaItem(), getOnAddQueueItem(), getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), getHandleMediaPlayPauseIfPendingOnHandler(), null);
    }

    public /* synthetic */ setEnterTransition(setAllowReturnTransitionOverlap setallowreturntransitionoverlap, int i, boolean z, float f, withHandlersFrom withhandlersfrom, float f2, boolean z2, TopUserCompanion topUserCompanion, bufferMapProperty buffermapproperty, long j, List list, int i2, int i3, int i4, boolean z3, superDispatchKeyEvent superdispatchkeyevent, int i5, int i6, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setallowreturntransitionoverlap, i, z, f, withhandlersfrom, f2, z2, topUserCompanion, buffermapproperty, j, list, i2, i3, i4, z3, superdispatchkeyevent, i5, i6);
    }

    @Override // kotlin.withHandlersFrom
    public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.withHandlersFrom
    /* JADX INFO: renamed from: onAddQueueItem */
    public final int getRead() {
        return this.RemoteActionCompatParcelizer.getRead();
    }

    @Override // kotlin.withHandlersFrom
    public final getAnswerMap<JsonNode, getShowPopup> onPause() {
        return this.RemoteActionCompatParcelizer.onPause();
    }

    @Override // kotlin.withHandlersFrom
    /* JADX INFO: renamed from: onFastForward */
    public final int getAudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.withHandlersFrom
    public final void onMediaButtonEvent() {
        this.RemoteActionCompatParcelizer.onMediaButtonEvent();
    }
}
