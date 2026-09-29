package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.getCurrentTrackSelections;
import kotlin.onActivityPostCreated;
import kotlin.parseDigitsRecursive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00102\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011H\u0096@¢\u0006\u0004\b\u000e\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0017\u0010\u001bJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\u001dJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\u001fR\u001a\u0010\u0019\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010\u000b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001c8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0019\u0010*R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0014\u0010/\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b(\u00100R\u0011\u00102\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b2\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u001c038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u00104R\u0011\u0010&\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010(\u001a\u0002088\u0001X\u0081\u0004¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b+\u0010:R$\u0010+\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b \u0010=R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010A\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0000@BX\u0081\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0016\u00106\u001a\u00020\r8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b/\u0010%R\"\u0010D\u001a\u0004\u0018\u00010B2\b\u0010\u0003\u001a\u0004\u0018\u00010B8\u0000@BX\u0081\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010CR\u001a\u0010J\u001a\u00020E8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010N\u001a\u00020K8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b&\u0010L\u001a\u0004\b\u000b\u0010MR \u0010H\u001a\b\u0012\u0004\u0012\u00020P0O8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\b$\u0010SR\u001a\u0010\"\u001a\u00020T8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u0010U\u001a\u0004\b5\u0010VR\u001a\u0010Q\u001a\u00020W8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bJ\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010 \u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010_R\u001a\u0010-\u001a\u00020`8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bN\u0010a\u001a\u0004\bN\u0010bR\u0015\u0010X\u001a\u00020c8AX\u0080\u0084\u0002¢\u0006\u0006\u001a\u0004\bD\u0010dR\u001a\u0010F\u001a\u00020e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bQ\u0010fR\u001a\u0010>\u001a\u00020e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bJ\u00104\u001a\u0004\bA\u0010fR\u0014\u0010g\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010'R+\u0010i\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bD\u00104\u001a\u0004\b\u000e\u0010'\"\u0004\b/\u0010hR+\u0010j\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bA\u00104\u001a\u0004\b/\u0010'\"\u0004\b\u000e\u0010hR\u0014\u0010;\u001a\u00020k8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010lR\u0014\u0010m\u001a\u00020\u00168AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010="}, d2 = {"Lo/onActivityPostCreated;", "Lo/getNoBackupFilesDir;", "", "p0", "p1", "Lo/internalPathIteratorSize;", "p2", "<init>", "(IILo/internalPathIteratorSize;)V", "(II)V", "", "write", "(IILo/SampleVideos;)Ljava/lang/Object;", "", "AudioAttributesCompatParcelizer", "(IIZ)V", "Lo/Flow;", "Lkotlin/Function2;", "Lo/checkSelfPermission;", "Lo/SampleVideos;", "", "(Lo/Flow;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "", "RemoteActionCompatParcelizer", "(F)F", "IconCompatParcelizer", "Lo/FragmentManagerState;", "(FLo/FragmentManagerState;)V", "Lo/destroyInternalPathIterator;", "(Lo/destroyInternalPathIterator;ZZ)V", "Lo/onPostResume;", "(Lo/onPostResume;I)I", "onPlayFromMediaId", "Lo/internalPathIteratorSize;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/internalPathIteratorSize;", "MediaBrowserCompatSearchResultReceiver", "Z", "MediaBrowserCompatItemReceiver", "()Z", "AudioAttributesImplBaseParcelizer", "Lo/destroyInternalPathIterator;", "()Lo/destroyInternalPathIterator;", "MediaMetadataCompat", "Lo/Space;", "onMediaButtonEvent", "Lo/Space;", "read", "()I", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/InputAccessor;", "Lo/InputAccessor;", "AudioAttributesImplApi21Parcelizer", "RatingCompat", "()Lo/FragmentManagerState;", "Lo/hashCode;", "Lo/hashCode;", "()Lo/hashCode;", "onPlayFromSearch", "F", "()F", "onPlayFromUri", "Lo/getNoBackupFilesDir;", "I", "MediaDescriptionCompat", "Lo/getPathReference;", "Lo/getPathReference;", "MediaBrowserCompatMediaItem", "Lo/getLocalizedMessage;", "onPlay", "Lo/getLocalizedMessage;", "onCommand", "()Lo/getLocalizedMessage;", "onAddQueueItem", "Lo/isLoadInBackgroundCanceled;", "Lo/isLoadInBackgroundCanceled;", "()Lo/isLoadInBackgroundCanceled;", "onCustomAction", "Lo/stopLoading;", "Lo/createInternalPathIterator;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/stopLoading;", "()Lo/stopLoading;", "Lo/deliverCancellation;", "Lo/deliverCancellation;", "()Lo/deliverCancellation;", "Lo/getCurrentTrackSelections;", "onFastForward", "Lo/getCurrentTrackSelections;", "()Lo/getCurrentTrackSelections;", "Lo/internalPathIteratorNext;", "onPause", "Lo/internalPathIteratorNext;", "Lo/onActivityPostCreated$RemoteActionCompatParcelizer;", "Lo/onActivityPostCreated$RemoteActionCompatParcelizer;", "Lo/getAudioComponent;", "Lo/getAudioComponent;", "()Lo/getAudioComponent;", "Lo/newEncryptedObject;", "()Lo/newEncryptedObject;", "Lo/setAuxEffectInfo;", "()Lo/InputAccessor;", "onPrepareFromSearch", "(Z)V", "onPrepareFromMediaId", "onPrepare", "Lo/getAudioFormat;", "Lo/getAudioFormat;", "onPrepareFromUri"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onActivityPostCreated implements getNoBackupFilesDir {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public int MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final deliverCancellation MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getAudioFormat onPlayFromSearch;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private destroyInternalPathIterator write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final RemoteActionCompatParcelizer onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final isLoadInBackgroundCanceled onCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final InputAccessor onPrepareFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final InputAccessor<destroyInternalPathIterator> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final InputAccessor onPrepare;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final hashCode AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public getPathReference MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final stopLoading<createInternalPathIterator> onCommand;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final InputAccessor<getShowPopup> onPlayFromUri;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final InputAccessor<getShowPopup> onPlay;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final getAudioComponent onMediaButtonEvent;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final getCurrentTrackSelections handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final Space read;
    private final internalPathIteratorNext onPause;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final getLocalizedMessage onAddQueueItem;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final internalPathIteratorSize IconCompatParcelizer;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private float MediaMetadataCompat;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final getNoBackupFilesDir MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public boolean RatingCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final parseManyDecDigits<onActivityPostCreated, ?> IconCompatParcelizer = squarePointwise.IconCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.onActivitySaveInstanceState
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return onActivityPostCreated.write((JavaDoubleBitsFromCharSequence) obj, (onActivityPostCreated) obj2);
        }
    }, new getAnswerMap() { // from class: o.onActivityPreDestroyed
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return onActivityPostCreated.IconCompatParcelizer((List) obj);
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return onActivityPostCreated.this.AudioAttributesCompatParcelizer((Flow) null, (MagicModuleSubmissionRequestBody<? super checkSelfPermission, ? super SampleVideos<? super getShowPopup>, ? extends Object>) null, this);
        }
    }

    public onActivityPostCreated(final int i, int i2, internalPathIteratorSize internalpathiteratorsize) {
        this.IconCompatParcelizer = internalpathiteratorsize;
        Space space = new Space(i, i2);
        this.read = space;
        this.AudioAttributesImplApi21Parcelizer = _qbuf.RemoteActionCompatParcelizer(onActivityPrePaused.IconCompatParcelizer, _qbuf.AudioAttributesCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer = isConsumed.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = C0193obtainAndCheckReceiverPermission.IconCompatParcelizer(new getAnswerMap() { // from class: o.onActivityPostResumed
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Float.valueOf(onActivityPostCreated.write(this.AudioAttributesCompatParcelizer, ((Float) obj).floatValue()));
            }
        });
        this.RatingCompat = true;
        this.onAddQueueItem = new AudioAttributesCompatParcelizer();
        this.onCustomAction = new isLoadInBackgroundCanceled();
        this.onCommand = new stopLoading<>();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new deliverCancellation();
        this.handleMediaPlayPauseIfPendingOnHandler = new getCurrentTrackSelections(internalpathiteratorsize.write(), new getAnswerMap() { // from class: o.onActivityPaused
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return onActivityPostCreated.read(this.write, i, (setForegroundMode) obj);
            }
        });
        this.onPause = new read();
        this.onPlayFromMediaId = new RemoteActionCompatParcelizer();
        this.onMediaButtonEvent = new getAudioComponent();
        space.getIconCompatParcelizer();
        this.onPlay = setAuxEffectInfo.AudioAttributesCompatParcelizer(null, 1, null);
        this.onPlayFromUri = setAuxEffectInfo.AudioAttributesCompatParcelizer(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.onPrepareFromMediaId = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.onPrepare = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.onPlayFromSearch = new getAudioFormat();
    }

    public /* synthetic */ onActivityPostCreated(int i, int i2, internalPathIteratorSize internalpathiteratorsize, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? internalPathIteratorPeek.write$default(0, 1, null) : internalpathiteratorsize);
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final internalPathIteratorSize getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public onActivityPostCreated(int i, int i2) {
        this(i, i2, internalPathIteratorPeek.write$default(0, 1, null));
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final destroyInternalPathIterator getWrite() {
        return this.write;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    public final FragmentManagerState RatingCompat() {
        return this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final hashCode getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final float getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float write(onActivityPostCreated onactivitypostcreated, float f) {
        return -onactivitypostcreated.IconCompatParcelizer(-f);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/onActivityPostCreated$AudioAttributesCompatParcelizer;", "Lo/getLocalizedMessage;", "Lo/getPathReference;", "p0", "", "IconCompatParcelizer", "(Lo/getPathReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements getLocalizedMessage {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.getLocalizedMessage
        public final void IconCompatParcelizer(getPathReference p0) {
            onActivityPostCreated.this.MediaBrowserCompatMediaItem = p0;
        }
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final getLocalizedMessage getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final isLoadInBackgroundCanceled getOnCustomAction() {
        return this.onCustomAction;
    }

    public final stopLoading<createInternalPathIterator> MediaBrowserCompatSearchResultReceiver() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final deliverCancellation getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final getCurrentTrackSelections getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(onActivityPostCreated onactivitypostcreated, int i, setForegroundMode setforegroundmode) {
        internalPathIteratorSize internalpathiteratorsize = onactivitypostcreated.IconCompatParcelizer;
        parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
        parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
        companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, companion.read(parsedigitsrecursiveIconCompatParcelizer), parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null);
        internalpathiteratorsize.AudioAttributesCompatParcelizer(setforegroundmode, i);
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/onActivityPostCreated$read;", "Lo/internalPathIteratorNext;", "", "p0", "", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "write", "(I)Ljava/util/List;", "Lkotlin/Function1;", "Lo/internalPathIteratorRawSize;", "", "p1", "read", "(ILo/getAnswerMap;)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements internalPathIteratorNext {
        read() {
        }

        @Override // kotlin.internalPathIteratorNext
        public final List<getCurrentTrackSelections.RemoteActionCompatParcelizer> write(int p0) {
            return read(p0, null);
        }

        public final List<getCurrentTrackSelections.RemoteActionCompatParcelizer> read(final int p0, final getAnswerMap<? super internalPathIteratorRawSize, getShowPopup> p1) {
            destroyInternalPathIterator write;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = p1 == null ? null : new ArrayList();
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            onActivityPostCreated onactivitypostcreated = onActivityPostCreated.this;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                if (!onactivitypostcreated.getRemoteActionCompatParcelizer()) {
                    write = (destroyInternalPathIterator) onactivitypostcreated.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
                } else {
                    write = onactivitypostcreated.getWrite();
                }
                final destroyInternalPathIterator destroyinternalpathiterator = write;
                if (destroyinternalpathiterator != null) {
                    final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
                    iconCompatParcelizer.AudioAttributesCompatParcelizer = 1;
                    List<Pair<Integer, PropertyValueAny>> listInvoke = destroyinternalpathiterator.handleMediaPlayPauseIfPendingOnHandler().invoke(Integer.valueOf(p0));
                    int size = listInvoke.size();
                    int i = 0;
                    while (i < size) {
                        Pair<Integer, PropertyValueAny> pair = listInvoke.get(i);
                        final ArrayList arrayList3 = arrayList2;
                        final List<Pair<Integer, PropertyValueAny>> list = listInvoke;
                        arrayList.add(onactivitypostcreated.getHandleMediaPlayPauseIfPendingOnHandler().IconCompatParcelizer(pair.write().intValue(), pair.IconCompatParcelizer().getRead(), onactivitypostcreated.AudioAttributesCompatParcelizer, new getAnswerMap() { // from class: o.onActivityPreStopped
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return onActivityPostCreated.read.RemoteActionCompatParcelizer(arrayList3, iconCompatParcelizer, list, p1, p0, destroyinternalpathiterator, (getCurrentTrackSelections.write) obj);
                            }
                        }));
                        i++;
                        size = size;
                        listInvoke = listInvoke;
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                return arrayList;
            } finally {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(List list, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, List list2, getAnswerMap getanswermap, int i, destroyInternalPathIterator destroyinternalpathiterator, getCurrentTrackSelections.write writeVar) {
            long jAudioAttributesCompatParcelizer;
            int iRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer();
            int i2 = 0;
            for (int i3 = 0; i3 < iRemoteActionCompatParcelizer; i3++) {
                if (destroyinternalpathiterator.getHandleMediaPlayPauseIfPendingOnHandler() == superDispatchKeyEvent.write) {
                    long j = -1;
                    jAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer(i3) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                } else {
                    jAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer(i3) >> 32;
                }
                i2 += (int) jAudioAttributesCompatParcelizer;
            }
            if (list != null) {
                list.add(Integer.valueOf(i2));
            }
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer != list2.size()) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer++;
            } else if (getanswermap != null && list != null) {
                getanswermap.invoke(new WorkerFactoryModule(i, list));
            }
            return getShowPopup.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0001"}, d2 = {"Lo/onActivityPostCreated$RemoteActionCompatParcelizer;", "Lo/setPaddingTop;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements setPaddingTop {
        RemoteActionCompatParcelizer() {
        }
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final getAudioComponent getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    public final newEncryptedObject MediaBrowserCompatMediaItem() {
        return this.read.getIconCompatParcelizer().getRemoteActionCompatParcelizer();
    }

    public final InputAccessor<getShowPopup> handleMediaPlayPauseIfPendingOnHandler() {
        return this.onPlay;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<checkSelfPermission, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        final /* synthetic */ int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.IconCompatParcelizer != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            onActivityPostCreated.this.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, true);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(int i, int i2, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return onActivityPostCreated.this.new AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(checkSelfPermission checkselfpermission, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(checkselfpermission, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static /* synthetic */ Object write$default(onActivityPostCreated onactivitypostcreated, int i, int i2, SampleVideos sampleVideos, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return onactivitypostcreated.write(i, i2, sampleVideos);
    }

    public final Object write(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer$default = getNoBackupFilesDir.AudioAttributesCompatParcelizer$default(this, null, new AudioAttributesImplApi21Parcelizer(i, i2, null), sampleVideos, 1, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    public final InputAccessor<getShowPopup> MediaDescriptionCompat() {
        return this.onPlayFromUri;
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1, boolean p2) {
        if (this.read.IconCompatParcelizer() != p0 || this.read.AudioAttributesCompatParcelizer() != p1) {
            this.onCommand.read();
            Object obj = this.IconCompatParcelizer;
            onCancelLoad oncancelload = obj instanceof onCancelLoad ? (onCancelLoad) obj : null;
            if (oncancelload != null) {
                oncancelload.read();
            }
        }
        this.read.IconCompatParcelizer(p0, p1);
        if (p2) {
            getPathReference getpathreference = this.MediaBrowserCompatMediaItem;
            if (getpathreference != null) {
                getpathreference.MediaBrowserCompatSearchResultReceiver();
                return;
            }
            return;
        }
        setAuxEffectInfo.AudioAttributesCompatParcelizer(this.onPlayFromUri);
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
            boolean r0 = r8 instanceof o.onActivityPostCreated.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.onActivityPostCreated$IconCompatParcelizer r0 = (o.onActivityPostCreated.IconCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.read
            int r8 = r8 + r2
            r0.read = r8
            goto L19
        L14:
            o.onActivityPostCreated$IconCompatParcelizer r0 = new o.onActivityPostCreated$IconCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
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
            java.lang.Object r6 = r0.write
            o.Flow r6 = (kotlin.Flow) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            goto L5f
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.InputAccessor<o.destroyInternalPathIterator> r8 = r5.AudioAttributesImplApi21Parcelizer
            java.lang.Object r8 = r8.getRemoteActionCompatParcelizer()
            o.destroyInternalPathIterator r2 = kotlin.onActivityPrePaused.IconCompatParcelizer()
            if (r8 != r2) goto L5f
            o.isLoadInBackgroundCanceled r8 = r5.onCustomAction
            r0.write = r6
            r0.AudioAttributesCompatParcelizer = r7
            r0.read = r4
            java.lang.Object r8 = r8.RemoteActionCompatParcelizer(r0)
            if (r8 == r1) goto L6e
        L5f:
            o.getNoBackupFilesDir r5 = r5.MediaBrowserCompatSearchResultReceiver
            r8 = 0
            r0.write = r8
            r0.AudioAttributesCompatParcelizer = r8
            r0.read = r3
            java.lang.Object r5 = r5.AudioAttributesCompatParcelizer(r6, r7, r0)
            if (r5 != r1) goto L6f
        L6e:
            return r1
        L6f:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onActivityPostCreated.AudioAttributesCompatParcelizer(o.Flow, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.getNoBackupFilesDir
    public final float RemoteActionCompatParcelizer(float p0) {
        return this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(p0);
    }

    @Override // kotlin.getNoBackupFilesDir
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer();
    }

    private void read(boolean z) {
        this.onPrepareFromMediaId.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getNoBackupFilesDir
    public final boolean AudioAttributesCompatParcelizer() {
        return ((Boolean) this.onPrepareFromMediaId.getRemoteActionCompatParcelizer()).booleanValue();
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        this.onPrepare.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getNoBackupFilesDir
    public final boolean read() {
        return ((Boolean) this.onPrepare.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final float IconCompatParcelizer(float p0) {
        destroyInternalPathIterator destroyinternalpathiterator;
        if ((p0 < BitmapDescriptorFactory.HUE_RED && !AudioAttributesCompatParcelizer()) || (p0 > BitmapDescriptorFactory.HUE_RED && !read())) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (Math.abs(this.MediaMetadataCompat) > 0.5f) {
            getRootStableInsets.AudioAttributesCompatParcelizer("entered drag with non-zero pending scroll");
        }
        float f = this.MediaMetadataCompat + p0;
        this.MediaMetadataCompat = f;
        if (Math.abs(f) > 0.5f) {
            float f2 = this.MediaMetadataCompat;
            int iRemoteActionCompatParcelizer = getOnline.RemoteActionCompatParcelizer(f2);
            destroyInternalPathIterator destroyinternalpathiteratorAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, !this.RemoteActionCompatParcelizer);
            if (destroyinternalpathiteratorAudioAttributesCompatParcelizer != null && (destroyinternalpathiterator = this.write) != null) {
                destroyInternalPathIterator destroyinternalpathiteratorAudioAttributesCompatParcelizer2 = destroyinternalpathiterator != null ? destroyinternalpathiterator.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, true) : null;
                if (destroyinternalpathiteratorAudioAttributesCompatParcelizer2 != null) {
                    this.write = destroyinternalpathiteratorAudioAttributesCompatParcelizer2;
                } else {
                    destroyinternalpathiteratorAudioAttributesCompatParcelizer = null;
                }
            }
            if (destroyinternalpathiteratorAudioAttributesCompatParcelizer != null) {
                RemoteActionCompatParcelizer(destroyinternalpathiteratorAudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, true);
                setAuxEffectInfo.AudioAttributesCompatParcelizer(this.onPlay);
                RemoteActionCompatParcelizer(f2 - this.MediaMetadataCompat, destroyinternalpathiteratorAudioAttributesCompatParcelizer);
            } else {
                getPathReference getpathreference = this.MediaBrowserCompatMediaItem;
                if (getpathreference != null) {
                    getpathreference.MediaBrowserCompatSearchResultReceiver();
                }
                RemoteActionCompatParcelizer(f2 - this.MediaMetadataCompat, RatingCompat());
            }
        }
        if (Math.abs(this.MediaMetadataCompat) <= 0.5f) {
            return p0;
        }
        float f3 = this.MediaMetadataCompat;
        this.MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
        return p0 - f3;
    }

    private final void RemoteActionCompatParcelizer(float p0, FragmentManagerState p1) {
        if (this.RatingCompat) {
            this.IconCompatParcelizer.write(this.onPause, p0, p1);
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(onActivityPostCreated onactivitypostcreated, destroyInternalPathIterator destroyinternalpathiterator, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        onactivitypostcreated.RemoteActionCompatParcelizer(destroyinternalpathiterator, z, z2);
    }

    public final void RemoteActionCompatParcelizer(destroyInternalPathIterator p0, boolean p1, boolean p2) {
        this.handleMediaPlayPauseIfPendingOnHandler.write(p0.AudioAttributesImplApi21Parcelizer().size());
        if (!p1 && this.RemoteActionCompatParcelizer) {
            this.write = p0;
            return;
        }
        if (p1) {
            this.RemoteActionCompatParcelizer = true;
        }
        this.MediaMetadataCompat -= p0.getWrite();
        this.AudioAttributesImplApi21Parcelizer.write(p0);
        AudioAttributesCompatParcelizer(p0.MediaBrowserCompatSearchResultReceiver());
        read(p0.getRemoteActionCompatParcelizer());
        if (p2) {
            this.read.IconCompatParcelizer(p0.getAudioAttributesCompatParcelizer());
        } else {
            this.read.AudioAttributesCompatParcelizer(p0);
            if (this.RatingCompat) {
                this.IconCompatParcelizer.write(this.onPause, p0);
            }
        }
        if (p1) {
            this.onPlayFromSearch.AudioAttributesCompatParcelizer(p0.getMediaBrowserCompatItemReceiver(), p0.getAudioAttributesImplBaseParcelizer(), p0.getAudioAttributesImplApi21Parcelizer());
        }
        this.MediaDescriptionCompat++;
    }

    public final float onPause() {
        return this.onPlayFromSearch.AudioAttributesCompatParcelizer();
    }

    public final int write(onPostResume p0, int p1) {
        return this.read.write(p0, p1);
    }

    /* JADX INFO: renamed from: o.onActivityPostCreated$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/onActivityPostCreated$write;", "", "<init>", "()V", "Lo/parseManyDecDigits;", "Lo/onActivityPostCreated;", "IconCompatParcelizer", "Lo/parseManyDecDigits;", "RemoteActionCompatParcelizer", "()Lo/parseManyDecDigits;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final parseManyDecDigits<onActivityPostCreated, ?> RemoteActionCompatParcelizer() {
            return onActivityPostCreated.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List write(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, onActivityPostCreated onactivitypostcreated) {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{Integer.valueOf(onactivitypostcreated.AudioAttributesImplBaseParcelizer()), Integer.valueOf(onactivitypostcreated.MediaBrowserCompatCustomActionResultReceiver())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final onActivityPostCreated IconCompatParcelizer(List list) {
        return new onActivityPostCreated(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public onActivityPostCreated() {
        this(0, 0, null, 7, null);
    }
}
