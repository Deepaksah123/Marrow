package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@GX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\b\u0010\u0010R.\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00118\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0014\u0010\u0016R$\u0010\u0014\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00188\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0019\"\u0004\b\u0012\u0010\u001aR0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u001d\"\u0004\b\u0012\u0010\u001eR$\u0010\u0012\u001a\u00020 2\u0006\u0010\r\u001a\u00020 8\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b!\u0010\"\"\u0004\b\u001f\u0010#R$\u0010\u0005\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00188\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b$\u0010\u0019\"\u0004\b\b\u0010\u001aR$\u0010!\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00188\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b%\u0010\u0019\"\u0004\b\u0017\u0010\u001aR.\u0010\u0006\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00118\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\b\u0010\u0016R$\u0010\u000e\u001a\u00020'2\u0006\u0010\r\u001a\u00020'8\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b(\u0010\"\"\u0004\b\u0017\u0010#R$\u0010+\u001a\u00020)2\u0006\u0010\r\u001a\u00020)8\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b*\u0010\"\"\u0004\b\u0014\u0010#R$\u0010-\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00188\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b,\u0010\u0019\"\u0004\b\u0014\u0010\u001aR$\u0010&\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00188\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b.\u0010\u0019\"\u0004\b!\u0010\u001aR$\u0010(\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00188\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b/\u0010\u0019\"\u0004\b\u001f\u0010\u001aR$\u00101\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00188\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b0\u0010\u0019\"\u0004\b+\u0010\u001aR\u0016\u0010$\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u00103R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u00103R\u0016\u0010%\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u00103R\u0018\u0010/\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00106R\u0014\u0010*\u001a\u0002078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0016\u0010,\u001a\u0002078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u00108R\u0018\u0010.\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0014\u0010:\u001a\u0002078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u00109R\u001b\u0010>\u001a\u00020;8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b1\u0010<\u001a\u0004\b\b\u0010="}, d2 = {"Lo/findJsonValueAccessor;", "Lo/getConstructorsWithMode;", "<init>", "()V", "", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "Lo/findSetterInfo;", "AudioAttributesCompatParcelizer", "(Lo/findSetterInfo;)V", "", "toString", "()Ljava/lang/String;", "p0", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "(Ljava/lang/String;)V", "Lo/Instantiatable;", "IconCompatParcelizer", "Lo/Instantiatable;", "write", "()Lo/Instantiatable;", "(Lo/Instantiatable;)V", "read", "", "F", "(F)V", "", "Lo/getBeanClass;", "Ljava/util/List;", "(Ljava/util/List;)V", "RemoteActionCompatParcelizer", "Lo/instance;", "AudioAttributesImplApi26Parcelizer", "I", "(I)V", "MediaBrowserCompatMediaItem", "onAddQueueItem", "MediaMetadataCompat", "Lo/findAutoDetectVisibility;", "RatingCompat", "Lo/findCreatorBinding;", "onCustomAction", "MediaBrowserCompatCustomActionResultReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaDescriptionCompat", "onPlayFromMediaId", "onCommand", "onPause", "MediaBrowserCompatSearchResultReceiver", "", "Z", "handleMediaPlayPauseIfPendingOnHandler", "Lo/findValueInstantiator;", "Lo/findValueInstantiator;", "Lo/removeSoftRefsClearedByGc;", "Lo/removeSoftRefsClearedByGc;", "()Lo/removeSoftRefsClearedByGc;", "onMediaButtonEvent", "Lo/setCurrentAndReturn;", "Lo/RenewEligible;", "()Lo/setCurrentAndReturn;", "onFastForward"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findJsonValueAccessor extends getConstructorsWithMode {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private List<? extends getBeanClass> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Instantiatable read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final removeSoftRefsClearedByGc onCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private float MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final RenewEligible onFastForward;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private float MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private Instantiatable AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc onPlayFromMediaId;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private findValueInstantiator onCommand;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private float RatingCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private float MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private float MediaMetadataCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private float write;

    public findJsonValueAccessor() {
        super(null);
        this.AudioAttributesCompatParcelizer = "";
        this.write = 1.0f;
        this.RemoteActionCompatParcelizer = getFactoryMethods.AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer = getFactoryMethods.read();
        this.MediaBrowserCompatItemReceiver = 1.0f;
        this.AudioAttributesImplBaseParcelizer = getFactoryMethods.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = getFactoryMethods.write();
        this.MediaDescriptionCompat = 4.0f;
        this.RatingCompat = 1.0f;
        this.MediaBrowserCompatMediaItem = true;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
        this.onCustomAction = removesoftrefsclearedbygcWrite;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = removesoftrefsclearedbygcWrite;
        this.onFastForward = getRenewExpiresOn.write(RenewEligibleCompanion.read, AnonymousClass5.write);
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        this.AudioAttributesCompatParcelizer = str;
        RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Instantiatable getRead() {
        return this.read;
    }

    public final void write(Instantiatable instantiatable) {
        this.read = instantiatable;
        RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(float f) {
        this.write = f;
        RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(List<? extends getBeanClass> list) {
        this.RemoteActionCompatParcelizer = list;
        this.MediaBrowserCompatMediaItem = true;
        RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.IconCompatParcelizer = i;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(i);
        RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.MediaBrowserCompatItemReceiver = f;
        RemoteActionCompatParcelizer();
    }

    public final void read(float f) {
        this.AudioAttributesImplApi26Parcelizer = f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Instantiatable getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void AudioAttributesCompatParcelizer(Instantiatable instantiatable) {
        this.AudioAttributesImplApi21Parcelizer = instantiatable;
        RemoteActionCompatParcelizer();
    }

    public final void read(int i) {
        this.AudioAttributesImplBaseParcelizer = i;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final void write(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final void write(float f) {
        this.MediaDescriptionCompat = f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesImplApi26Parcelizer(float f) {
        this.MediaMetadataCompat = f;
        this.onAddQueueItem = true;
        RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.RatingCompat = f;
        this.onAddQueueItem = true;
        RemoteActionCompatParcelizer();
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
        this.MediaBrowserCompatSearchResultReceiver = f;
        this.onAddQueueItem = true;
        RemoteActionCompatParcelizer();
    }

    private final removeSoftRefsClearedByGc AudioAttributesImplBaseParcelizer() {
        removeSoftRefsClearedByGc removesoftrefsclearedbygc = this.onPlayFromMediaId;
        if (removesoftrefsclearedbygc != null) {
            return removesoftrefsclearedbygc;
        }
        removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
        this.onPlayFromMediaId = removesoftrefsclearedbygcWrite;
        return removesoftrefsclearedbygcWrite;
    }

    /* JADX INFO: renamed from: o.findJsonValueAccessor$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/setCurrentAndReturn;", "AudioAttributesCompatParcelizer", "()Lo/setCurrentAndReturn;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<setCurrentAndReturn> {
        public static final AnonymousClass5 write = new AnonymousClass5();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final setCurrentAndReturn invoke() {
            return setCurrentSegmentLength.read();
        }

        AnonymousClass5() {
            super(0);
        }
    }

    private final setCurrentAndReturn AudioAttributesCompatParcelizer() {
        return (setCurrentAndReturn) this.onFastForward.RemoteActionCompatParcelizer();
    }

    private final void MediaBrowserCompatItemReceiver() {
        findProperties.write(this.RemoteActionCompatParcelizer, this.onCustomAction);
        AudioAttributesImplApi21Parcelizer();
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        if (this.MediaMetadataCompat == BitmapDescriptorFactory.HUE_RED && this.RatingCompat == 1.0f) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.onCustomAction;
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction)) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = writeIndentation.write();
        } else {
            int iWrite = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(iWrite);
        }
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(this.onCustomAction, false);
        float fRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
        float f = this.MediaMetadataCompat;
        float f2 = this.MediaBrowserCompatSearchResultReceiver;
        float f3 = ((f + f2) % 1.0f) * fRemoteActionCompatParcelizer;
        float f4 = ((this.RatingCompat + f2) % 1.0f) * fRemoteActionCompatParcelizer;
        if (f3 > f4) {
            removeSoftRefsClearedByGc removesoftrefsclearedbygcAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            removesoftrefsclearedbygcAudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer();
            AudioAttributesCompatParcelizer().read(f3, fRemoteActionCompatParcelizer, removesoftrefsclearedbygcAudioAttributesImplBaseParcelizer, true);
            removeSoftRefsClearedByGc.write$default(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, removesoftrefsclearedbygcAudioAttributesImplBaseParcelizer, 0L, 2, (Object) null);
            removesoftrefsclearedbygcAudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer();
            AudioAttributesCompatParcelizer().read(BitmapDescriptorFactory.HUE_RED, f4, removesoftrefsclearedbygcAudioAttributesImplBaseParcelizer, true);
            removeSoftRefsClearedByGc.write$default(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, removesoftrefsclearedbygcAudioAttributesImplBaseParcelizer, 0L, 2, (Object) null);
            return;
        }
        AudioAttributesCompatParcelizer().read(f3, f4, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, true);
    }

    @Override // kotlin.getConstructorsWithMode
    public final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo) {
        if (this.MediaBrowserCompatMediaItem) {
            MediaBrowserCompatItemReceiver();
        } else if (this.onAddQueueItem) {
            AudioAttributesImplApi21Parcelizer();
        }
        this.MediaBrowserCompatMediaItem = false;
        this.onAddQueueItem = false;
        Instantiatable instantiatable = this.read;
        if (instantiatable != null) {
            findSetterInfo.AudioAttributesCompatParcelizer$default(findsetterinfo, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, instantiatable, this.write, (findViews) null, (switchAndReturnNext) null, 0, 56, (Object) null);
        }
        Instantiatable instantiatable2 = this.AudioAttributesImplApi21Parcelizer;
        if (instantiatable2 != null) {
            findValueInstantiator findvalueinstantiator = this.onCommand;
            if (this.handleMediaPlayPauseIfPendingOnHandler || findvalueinstantiator == null) {
                findvalueinstantiator = new findValueInstantiator(this.AudioAttributesImplApi26Parcelizer, this.MediaDescriptionCompat, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, null, 16, null);
                this.onCommand = findvalueinstantiator;
                this.handleMediaPlayPauseIfPendingOnHandler = false;
            }
            findSetterInfo.AudioAttributesCompatParcelizer$default(findsetterinfo, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, instantiatable2, this.MediaBrowserCompatItemReceiver, findvalueinstantiator, (switchAndReturnNext) null, 0, 48, (Object) null);
        }
    }

    public final String toString() {
        return this.onCustomAction.toString();
    }
}
