package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.getCurrentTrackSelections;
import kotlin.parseDigitsRecursive;
import kotlin.setSharedElementReturnTransition;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00102\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u000e\u0010\u001cJ\"\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0018\u0010\fJ)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000b\u0010\u001eJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u000e\u0010\u001fJ\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010!R\u001a\u0010\u000e\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010\u000b\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001d8\u0000@BX\u0081\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0014\u0010\u001a\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010/\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b2\u00100R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0011\u00102\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b+\u00106R\u001a\u0010;\u001a\u0002078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R$\u0010&\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00178\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020@8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010AR\u0014\u0010+\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u00108\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0000@BX\u0081\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010ER\u0016\u0010F\u001a\u00020\r8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u0018\u0010'R\"\u00104\u001a\u0004\u0018\u00010G2\b\u0010\u0003\u001a\u0004\u0018\u00010G8\u0000@BX\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u001a\u0010$\u001a\u00020I8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\u00020N8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b/\u0010O\u001a\u0004\b\u0018\u0010PR \u0010L\u001a\b\u0012\u0004\u0012\u00020S0R8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010T\u001a\u0004\bF\u0010UR\u001a\u0010Y\u001a\u00020V8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b2\u0010W\u001a\u0004\b\u001a\u0010XR\u001a\u0010\"\u001a\u00020Z8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b>\u0010[\u001a\u0004\b4\u0010\\R\u0014\u0010-\u001a\u00020]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010J\u001a\u00020`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010aR\u001a\u0010^\u001a\u00020b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bL\u0010c\u001a\u0004\bY\u0010dR\u0015\u0010>\u001a\u00020e8AX\u0080\u0084\u0002¢\u0006\u0006\u001a\u0004\b&\u0010fR\u001a\u0010<\u001a\u00020g8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bY\u00105\u001a\u0004\bB\u0010hR\u0014\u0010i\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010)R+\u0010C\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bB\u00105\u001a\u0004\b\u0015\u0010)\"\u0004\b\u0018\u0010jR+\u0010k\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bF\u00105\u001a\u0004\b\u000e\u0010)\"\u0004\b\u001a\u0010jR\u001a\u0010l\u001a\u00020g8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\bQ\u0010hR\u0014\u0010m\u001a\u00020\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010?R\u0014\u0010p\u001a\u00020n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010o"}, d2 = {"Lo/setSharedElementReturnTransition;", "Lo/getNoBackupFilesDir;", "", "p0", "p1", "Lo/setHasOptionsMenu;", "p2", "<init>", "(IILo/setHasOptionsMenu;)V", "(II)V", "", "IconCompatParcelizer", "(IILo/SampleVideos;)Ljava/lang/Object;", "", "read", "(IIZ)V", "Lo/Flow;", "Lkotlin/Function2;", "Lo/checkSelfPermission;", "Lo/SampleVideos;", "", "AudioAttributesCompatParcelizer", "(Lo/Flow;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "", "RemoteActionCompatParcelizer", "(F)F", "write", "Lo/requireParentFragment;", "(FLo/requireParentFragment;)V", "Lo/setEnterTransition;", "(Lo/setEnterTransition;ZZ)V", "(Lo/setEnterTransition;)V", "Lo/performStart;", "(Lo/performStart;I)I", "onFastForward", "Lo/setHasOptionsMenu;", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/setHasOptionsMenu;", "MediaBrowserCompatMediaItem", "Z", "AudioAttributesImplBaseParcelizer", "()Z", "Lo/setEnterTransition;", "MediaDescriptionCompat", "Lo/setPopDirection;", "onPause", "Lo/setPopDirection;", "AudioAttributesImplApi21Parcelizer", "()I", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "Lo/InputAccessor;", "onCustomAction", "Lo/InputAccessor;", "()Lo/requireParentFragment;", "Lo/hashCode;", "RatingCompat", "Lo/hashCode;", "()Lo/hashCode;", "AudioAttributesImplApi26Parcelizer", "onPrepare", "F", "onMediaButtonEvent", "()F", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "MediaMetadataCompat", "onPlayFromSearch", "Lo/getNoBackupFilesDir;", "I", "MediaBrowserCompatSearchResultReceiver", "Lo/getPathReference;", "Lo/getPathReference;", "Lo/getLocalizedMessage;", "onPlay", "Lo/getLocalizedMessage;", "onCommand", "()Lo/getLocalizedMessage;", "Lo/isLoadInBackgroundCanceled;", "Lo/isLoadInBackgroundCanceled;", "()Lo/isLoadInBackgroundCanceled;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/stopLoading;", "Lo/setAllowReturnTransitionOverlap;", "Lo/stopLoading;", "()Lo/stopLoading;", "Lo/deliverCancellation;", "Lo/deliverCancellation;", "()Lo/deliverCancellation;", "onAddQueueItem", "Lo/getCurrentTrackSelections;", "Lo/getCurrentTrackSelections;", "()Lo/getCurrentTrackSelections;", "Lo/setExitTransition;", "onPlayFromMediaId", "Lo/setExitTransition;", "Lo/setSharedElementReturnTransition$RemoteActionCompatParcelizer;", "Lo/setSharedElementReturnTransition$RemoteActionCompatParcelizer;", "Lo/getAudioComponent;", "Lo/getAudioComponent;", "()Lo/getAudioComponent;", "Lo/newEncryptedObject;", "()Lo/newEncryptedObject;", "Lo/setAuxEffectInfo;", "()Lo/InputAccessor;", "onPlayFromUri", "(Z)V", "onPrepareFromSearch", "onPrepareFromMediaId", "onRemoveQueueItemAt", "Lo/getAudioFormat;", "Lo/getAudioFormat;", "onRewind"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setSharedElementReturnTransition implements getNoBackupFilesDir {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public setEnterTransition IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final isLoadInBackgroundCanceled MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getAudioFormat onRewind;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final RemoteActionCompatParcelizer onPlay;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public getPathReference onCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final deliverCancellation onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final InputAccessor onPrepareFromSearch;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final InputAccessor<getShowPopup> onPrepareFromMediaId;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final InputAccessor onPlayFromSearch;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final hashCode AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public boolean MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final stopLoading<setAllowReturnTransitionOverlap> onCommand;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final InputAccessor<getShowPopup> onPrepare;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final getAudioComponent onPlayFromMediaId;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final InputAccessor<setEnterTransition> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final setHasOptionsMenu read;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final getCurrentTrackSelections onFastForward;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final setPopDirection write;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final getLocalizedMessage handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final setExitTransition onPause;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final getNoBackupFilesDir MediaDescriptionCompat;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private float MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public int RatingCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final parseManyDecDigits<setSharedElementReturnTransition, ?> MediaBrowserCompatCustomActionResultReceiver = squarePointwise.IconCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.setReturnTransition
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return setSharedElementReturnTransition.IconCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (setSharedElementReturnTransition) obj2);
        }
    }, new getAnswerMap() { // from class: o.setSharedElementEnterTransition
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return setSharedElementReturnTransition.IconCompatParcelizer((List) obj);
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int write;

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return setSharedElementReturnTransition.this.AudioAttributesCompatParcelizer(null, null, this);
        }
    }

    public setSharedElementReturnTransition(final int i, int i2, setHasOptionsMenu sethasoptionsmenu) {
        this.read = sethasoptionsmenu;
        setPopDirection setpopdirection = new setPopDirection(i, i2);
        this.write = setpopdirection;
        this.AudioAttributesImplBaseParcelizer = _qbuf.RemoteActionCompatParcelizer(shouldShowRequestPermissionRationale.AudioAttributesCompatParcelizer, _qbuf.AudioAttributesCompatParcelizer());
        this.AudioAttributesImplApi26Parcelizer = isConsumed.RemoteActionCompatParcelizer();
        this.MediaDescriptionCompat = C0193obtainAndCheckReceiverPermission.IconCompatParcelizer(new getAnswerMap() { // from class: o.setRetainInstance
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Float.valueOf(setSharedElementReturnTransition.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, ((Float) obj).floatValue()));
            }
        });
        this.MediaBrowserCompatSearchResultReceiver = true;
        this.handleMediaPlayPauseIfPendingOnHandler = new IconCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new isLoadInBackgroundCanceled();
        this.onCommand = new stopLoading<>();
        this.onAddQueueItem = new deliverCancellation();
        this.onFastForward = new getCurrentTrackSelections(sethasoptionsmenu.RemoteActionCompatParcelizer(), new getAnswerMap() { // from class: o.setSharedElementNames
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setSharedElementReturnTransition.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, i, (setForegroundMode) obj);
            }
        });
        this.onPause = new AudioAttributesCompatParcelizer();
        this.onPlay = new RemoteActionCompatParcelizer();
        this.onPlayFromMediaId = new getAudioComponent();
        setpopdirection.getRead();
        this.onPrepare = setAuxEffectInfo.AudioAttributesCompatParcelizer(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.onPlayFromSearch = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.onPrepareFromSearch = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.onPrepareFromMediaId = setAuxEffectInfo.AudioAttributesCompatParcelizer(null, 1, null);
        this.onRewind = new getAudioFormat();
    }

    public /* synthetic */ setSharedElementReturnTransition(int i, int i2, setHasOptionsMenu sethasoptionsmenu, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? setExitSharedElementCallback.RemoteActionCompatParcelizer$default(0, 1, null) : sethasoptionsmenu);
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final setHasOptionsMenu getRead() {
        return this.read;
    }

    public setSharedElementReturnTransition(int i, int i2) {
        this(i, i2, setExitSharedElementCallback.RemoteActionCompatParcelizer$default(0, 1, null));
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.write.read();
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.write.IconCompatParcelizer();
    }

    public final requireParentFragment MediaDescriptionCompat() {
        return this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final hashCode getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final float getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final bufferMapProperty MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer().getAudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AudioAttributesCompatParcelizer(setSharedElementReturnTransition setsharedelementreturntransition, float f) {
        return -setsharedelementreturntransition.write(-f);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setSharedElementReturnTransition$IconCompatParcelizer;", "Lo/getLocalizedMessage;", "Lo/getPathReference;", "p0", "", "IconCompatParcelizer", "(Lo/getPathReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements getLocalizedMessage {
        IconCompatParcelizer() {
        }

        @Override // kotlin.getLocalizedMessage
        public final void IconCompatParcelizer(getPathReference p0) {
            setSharedElementReturnTransition.this.onCustomAction = p0;
        }
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final getLocalizedMessage getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final isLoadInBackgroundCanceled getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final stopLoading<setAllowReturnTransitionOverlap> MediaBrowserCompatSearchResultReceiver() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final deliverCancellation getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final getCurrentTrackSelections getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(setSharedElementReturnTransition setsharedelementreturntransition, int i, setForegroundMode setforegroundmode) {
        setHasOptionsMenu sethasoptionsmenu = setsharedelementreturntransition.read;
        parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
        parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
        companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, companion.read(parsedigitsrecursiveIconCompatParcelizer), parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null);
        sethasoptionsmenu.read(setforegroundmode, i);
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setSharedElementReturnTransition$AudioAttributesCompatParcelizer;", "Lo/setExitTransition;", "", "p0", "Lkotlin/Function1;", "Lo/setInitialSavedState;", "", "p1", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "read", "(ILo/getAnswerMap;)Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements setExitTransition {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.setExitTransition
        public final getCurrentTrackSelections.RemoteActionCompatParcelizer read(final int p0, final getAnswerMap<? super setInitialSavedState, getShowPopup> p1) {
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            setSharedElementReturnTransition setsharedelementreturntransition = setSharedElementReturnTransition.this;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                final setEnterTransition setentertransition = (setEnterTransition) setsharedelementreturntransition.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer();
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                return setSharedElementReturnTransition.this.getOnFastForward().IconCompatParcelizer(p0, setentertransition.getAudioAttributesImplBaseParcelizer(), setSharedElementReturnTransition.this.RemoteActionCompatParcelizer, new getAnswerMap() { // from class: o.setTargetFragment
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setSharedElementReturnTransition.AudioAttributesCompatParcelizer.read(p1, p0, setentertransition, (getCurrentTrackSelections.write) obj);
                    }
                });
            } catch (Throwable th) {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(getAnswerMap getanswermap, int i, setEnterTransition setentertransition, getCurrentTrackSelections.write writeVar) {
            long jAudioAttributesCompatParcelizer;
            if (getanswermap != null) {
                int iRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer();
                int i2 = 0;
                for (int i3 = 0; i3 < iRemoteActionCompatParcelizer; i3++) {
                    if (setentertransition.getOnAddQueueItem() == superDispatchKeyEvent.write) {
                        long j = -1;
                        jAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer(i3) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                    } else {
                        jAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer(i3) >> 32;
                    }
                    i2 += (int) jAudioAttributesCompatParcelizer;
                }
                getanswermap.invoke(new setFocusedView(i, i2));
            }
            return getShowPopup.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0001"}, d2 = {"Lo/setSharedElementReturnTransition$RemoteActionCompatParcelizer;", "Lo/setPaddingTop;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements setPaddingTop {
        RemoteActionCompatParcelizer() {
        }
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final getAudioComponent getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    public final newEncryptedObject MediaBrowserCompatMediaItem() {
        return this.write.getRead().getRemoteActionCompatParcelizer();
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ int IconCompatParcelizer;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.read != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            setSharedElementReturnTransition.this.read(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, true);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(int i, int i2, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setSharedElementReturnTransition.this.new MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(checkSelfPermission checkselfpermission, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(checkselfpermission, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static /* synthetic */ Object IconCompatParcelizer$default(setSharedElementReturnTransition setsharedelementreturntransition, int i, int i2, SampleVideos sampleVideos, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return setsharedelementreturntransition.IconCompatParcelizer(i, i2, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    public final Object IconCompatParcelizer(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer$default = getNoBackupFilesDir.AudioAttributesCompatParcelizer$default(this, null, new MediaBrowserCompatCustomActionResultReceiver(i, i2, null), sampleVideos, 1, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public final InputAccessor<getShowPopup> MediaMetadataCompat() {
        return this.onPrepare;
    }

    public final void read(int p0, int p1, boolean p2) {
        if (this.write.read() != p0 || this.write.IconCompatParcelizer() != p1) {
            this.onCommand.read();
            Object obj = this.read;
            onCancelLoad oncancelload = obj instanceof onCancelLoad ? (onCancelLoad) obj : null;
            if (oncancelload != null) {
                oncancelload.read();
            }
        }
        this.write.RemoteActionCompatParcelizer(p0, p1);
        if (p2) {
            getPathReference getpathreference = this.onCustomAction;
            if (getpathreference != null) {
                getpathreference.MediaBrowserCompatSearchResultReceiver();
                return;
            }
            return;
        }
        setAuxEffectInfo.AudioAttributesCompatParcelizer(this.onPrepare);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r5.AudioAttributesCompatParcelizer(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.getNoBackupFilesDir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.Flow r6, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.checkSelfPermission, ? super kotlin.SampleVideos<? super kotlin.getShowPopup>, ? extends java.lang.Object> r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof o.setSharedElementReturnTransition.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L14
            r0 = r8
            o.setSharedElementReturnTransition$MediaBrowserCompatItemReceiver r0 = (o.setSharedElementReturnTransition.MediaBrowserCompatItemReceiver) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.write
            int r8 = r8 + r2
            r0.write = r8
            goto L19
        L14:
            o.setSharedElementReturnTransition$MediaBrowserCompatItemReceiver r0 = new o.setSharedElementReturnTransition$MediaBrowserCompatItemReceiver
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L6f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
            r7 = r6
            o.MagicModuleSubmissionRequestBody r7 = (kotlin.MagicModuleSubmissionRequestBody) r7
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            o.Flow r6 = (kotlin.Flow) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L5f
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.InputAccessor<o.setEnterTransition> r8 = r5.AudioAttributesImplBaseParcelizer
            java.lang.Object r8 = r8.getRemoteActionCompatParcelizer()
            o.setEnterTransition r2 = kotlin.shouldShowRequestPermissionRationale.AudioAttributesCompatParcelizer()
            if (r8 != r2) goto L5f
            o.isLoadInBackgroundCanceled r8 = r5.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            r0.RemoteActionCompatParcelizer = r6
            r0.AudioAttributesCompatParcelizer = r7
            r0.write = r4
            java.lang.Object r8 = r8.RemoteActionCompatParcelizer(r0)
            if (r8 == r1) goto L6e
        L5f:
            o.getNoBackupFilesDir r5 = r5.MediaDescriptionCompat
            r8 = 0
            r0.RemoteActionCompatParcelizer = r8
            r0.AudioAttributesCompatParcelizer = r8
            r0.write = r3
            java.lang.Object r5 = r5.AudioAttributesCompatParcelizer(r6, r7, r0)
            if (r5 != r1) goto L6f
        L6e:
            return r1
        L6f:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSharedElementReturnTransition.AudioAttributesCompatParcelizer(o.Flow, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.getNoBackupFilesDir
    public final float RemoteActionCompatParcelizer(float p0) {
        return this.MediaDescriptionCompat.RemoteActionCompatParcelizer(p0);
    }

    @Override // kotlin.getNoBackupFilesDir
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer();
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        this.onPlayFromSearch.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getNoBackupFilesDir
    public final boolean AudioAttributesCompatParcelizer() {
        return ((Boolean) this.onPlayFromSearch.getRemoteActionCompatParcelizer()).booleanValue();
    }

    private void write(boolean z) {
        this.onPrepareFromSearch.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getNoBackupFilesDir
    public final boolean read() {
        return ((Boolean) this.onPrepareFromSearch.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final InputAccessor<getShowPopup> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onPrepareFromMediaId;
    }

    public final float write(float p0) {
        setEnterTransition setentertransition;
        if ((p0 < BitmapDescriptorFactory.HUE_RED && !AudioAttributesCompatParcelizer()) || (p0 > BitmapDescriptorFactory.HUE_RED && !read())) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (Math.abs(this.MediaBrowserCompatMediaItem) > 0.5f) {
            getRootStableInsets.AudioAttributesCompatParcelizer("entered drag with non-zero pending scroll");
        }
        this.RemoteActionCompatParcelizer = true;
        float f = this.MediaBrowserCompatMediaItem + p0;
        this.MediaBrowserCompatMediaItem = f;
        if (Math.abs(f) > 0.5f) {
            float f2 = this.MediaBrowserCompatMediaItem;
            int iRound = Math.round(f2);
            setEnterTransition setentertransitionAudioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(iRound, !this.AudioAttributesCompatParcelizer);
            if (setentertransitionAudioAttributesCompatParcelizer != null && (setentertransition = this.IconCompatParcelizer) != null) {
                setEnterTransition setentertransitionAudioAttributesCompatParcelizer2 = setentertransition != null ? setentertransition.AudioAttributesCompatParcelizer(iRound, true) : null;
                if (setentertransitionAudioAttributesCompatParcelizer2 != null) {
                    this.IconCompatParcelizer = setentertransitionAudioAttributesCompatParcelizer2;
                } else {
                    setentertransitionAudioAttributesCompatParcelizer = null;
                }
            }
            if (setentertransitionAudioAttributesCompatParcelizer != null) {
                IconCompatParcelizer(setentertransitionAudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer, true);
                setAuxEffectInfo.AudioAttributesCompatParcelizer(this.onPrepareFromMediaId);
                read(f2 - this.MediaBrowserCompatMediaItem, setentertransitionAudioAttributesCompatParcelizer);
            } else {
                getPathReference getpathreference = this.onCustomAction;
                if (getpathreference != null) {
                    getpathreference.MediaBrowserCompatSearchResultReceiver();
                }
                read(f2 - this.MediaBrowserCompatMediaItem, MediaDescriptionCompat());
            }
        }
        if (Math.abs(this.MediaBrowserCompatMediaItem) <= 0.5f) {
            return p0;
        }
        float f3 = this.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
        return p0 - f3;
    }

    private final void read(float p0, requireParentFragment p1) {
        if (this.MediaBrowserCompatSearchResultReceiver) {
            this.read.read(this.onPause, p0, p1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ Object IconCompatParcelizer;
        final /* synthetic */ int RemoteActionCompatParcelizer;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                checkSelfPermission checkselfpermission = (checkSelfPermission) this.IconCompatParcelizer;
                this.write = 1;
                if (getDeviceComponent.RemoteActionCompatParcelizer(setPostOnViewCreatedAlpha.IconCompatParcelizer(setSharedElementReturnTransition.this, checkselfpermission), this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, 100, setSharedElementReturnTransition.this.MediaBrowserCompatCustomActionResultReceiver(), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(int i, int i2, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = setSharedElementReturnTransition.this.new write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
            writeVar.IconCompatParcelizer = obj;
            return writeVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(checkSelfPermission checkselfpermission, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(checkselfpermission, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer$default(setSharedElementReturnTransition setsharedelementreturntransition, int i, int i2, SampleVideos sampleVideos, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return setsharedelementreturntransition.RemoteActionCompatParcelizer(i, i2, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    public final Object RemoteActionCompatParcelizer(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer$default = getNoBackupFilesDir.AudioAttributesCompatParcelizer$default(this, null, new write(i, i2, null), sampleVideos, 1, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public static /* synthetic */ void IconCompatParcelizer$default(setSharedElementReturnTransition setsharedelementreturntransition, setEnterTransition setentertransition, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        setsharedelementreturntransition.IconCompatParcelizer(setentertransition, z, z2);
    }

    public final void IconCompatParcelizer(setEnterTransition p0, boolean p1, boolean p2) {
        setAllowReturnTransitionOverlap setallowreturntransitionoverlapOnCommand;
        this.onFastForward.write(p0.AudioAttributesImplBaseParcelizer().size());
        if (!p1 && this.AudioAttributesCompatParcelizer) {
            this.IconCompatParcelizer = p0;
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                if (this.onRewind.read() && (setallowreturntransitionoverlapOnCommand = p0.getRead()) != null && setallowreturntransitionoverlapOnCommand.getIconCompatParcelizer() == this.write.read() && p0.getIconCompatParcelizer() == this.write.IconCompatParcelizer()) {
                    this.onRewind.RemoteActionCompatParcelizer();
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                return;
            } finally {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
            }
        }
        if (p1) {
            this.AudioAttributesCompatParcelizer = true;
        }
        write(p0.MediaBrowserCompatSearchResultReceiver());
        RemoteActionCompatParcelizer(p0.getAudioAttributesCompatParcelizer());
        this.MediaBrowserCompatMediaItem -= p0.getWrite();
        this.AudioAttributesImplBaseParcelizer.write(p0);
        if (p2) {
            this.write.AudioAttributesCompatParcelizer(p0.getIconCompatParcelizer());
        } else {
            read(p0);
            this.write.read(p0);
            if (this.MediaBrowserCompatSearchResultReceiver) {
                this.read.write(this.onPause, p0);
            }
        }
        if (p1) {
            this.onRewind.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatCustomActionResultReceiver(), p0.getAudioAttributesImplApi21Parcelizer(), p0.getAudioAttributesImplApi26Parcelizer());
        }
        this.RatingCompat++;
    }

    private final void read(setEnterTransition p0) {
        setAllowReturnTransitionOverlap setallowreturntransitionoverlap = (setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) p0.AudioAttributesImplBaseParcelizer());
        setAllowReturnTransitionOverlap setallowreturntransitionoverlap2 = (setAllowReturnTransitionOverlap) IntermediateLoginResponseBody.MediaMetadataCompat((List) p0.AudioAttributesImplBaseParcelizer());
        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("firstVisibleItem:index", setallowreturntransitionoverlap != null ? setallowreturntransitionoverlap.getIconCompatParcelizer() : -1L);
        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("lastVisibleItem:index", setallowreturntransitionoverlap2 != null ? setallowreturntransitionoverlap2.getIconCompatParcelizer() : -1L);
    }

    public final float onPlayFromMediaId() {
        return this.onRewind.AudioAttributesCompatParcelizer();
    }

    public final int RemoteActionCompatParcelizer(performStart p0, int p1) {
        return this.write.RemoteActionCompatParcelizer(p0, p1);
    }

    /* JADX INFO: renamed from: o.setSharedElementReturnTransition$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/setSharedElementReturnTransition$read;", "", "<init>", "()V", "Lo/parseManyDecDigits;", "Lo/setSharedElementReturnTransition;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/parseManyDecDigits;", "read", "()Lo/parseManyDecDigits;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final parseManyDecDigits<setSharedElementReturnTransition, ?> read() {
            return setSharedElementReturnTransition.MediaBrowserCompatCustomActionResultReceiver;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List IconCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, setSharedElementReturnTransition setsharedelementreturntransition) {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{Integer.valueOf(setsharedelementreturntransition.AudioAttributesImplApi21Parcelizer()), Integer.valueOf(setsharedelementreturntransition.MediaBrowserCompatItemReceiver())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setSharedElementReturnTransition IconCompatParcelizer(List list) {
        return new setSharedElementReturnTransition(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public setSharedElementReturnTransition() {
        this(0, 0, null, 7, null);
    }
}
