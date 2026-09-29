package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u001aJ\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u0019\u0010\u001eR\u0017\u0010\u0019\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\"\u0010\u001c\u001a\u00020\u000e8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0017R$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0016\u001a\u00020.8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010*\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010%R\u0014\u0010&\u001a\u0002028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u00103R\u0014\u0010\u0018\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u00104R\u0014\u0010,\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00104R\u0016\u00106\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0014\u0010:\u001a\u0002078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020?8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010)R\u0014\u0010C\u001a\u00020B8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010)R\u001a\u0010 \u001a\u00020D8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020H8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010IR(\u0010F\u001a\u0004\u0018\u00010.2\b\u0010\u0004\u001a\u0004\u0018\u00010.8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b\u001c\u0010K\"\u0004\b\u001c\u0010LR \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00070M8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\b:\u0010OR\u0016\u0010\"\u001a\u0004\u0018\u00010P8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R"}, d2 = {"Lo/readerFor;", "Lo/isTypeOrSuperTypeOf;", "Lo/createDeserializationContext;", "Lo/_bindAndClose;", "p0", "<init>", "(Lo/_bindAndClose;)V", "Lo/weirdNumberException;", "", "IconCompatParcelizer", "(Lo/weirdNumberException;)I", "", "onRewind", "()V", "Lo/hasReferringProperties;", "", "p1", "Lkotlin/Function1;", "Lo/validateAppend;", "p2", "RemoteActionCompatParcelizer", "(JFLo/getAnswerMap;)V", "MediaBrowserCompatCustomActionResultReceiver", "(J)V", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "(I)I", "write", "read", "", "(Lo/readerFor;Z)J", "Lo/_bindAndClose;", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/_bindAndClose;", "onAddQueueItem", "()Lo/createDeserializationContext;", "onPlay", "()Z", "MediaBrowserCompatItemReceiver", "J", "onPrepare", "()J", "AudioAttributesImplBaseParcelizer", "", "AudioAttributesImplApi26Parcelizer", "Ljava/util/Map;", "Lo/withHandlersFrom;", "onMediaButtonEvent", "()Lo/withHandlersFrom;", "r_", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "()F", "onPlayFromMediaId", "MediaBrowserCompatMediaItem", "Lo/_assertNotNull;", "onPause", "()Lo/_assertNotNull;", "MediaMetadataCompat", "Lo/isAbstract;", "onFastForward", "()Lo/isAbstract;", "MediaBrowserCompatSearchResultReceiver", "Lo/getKey;", "onCustomAction", "RatingCompat", "Lo/PropertyValueAny;", "MediaDescriptionCompat", "Lo/withContentType;", "Lo/withContentType;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/withContentType;", "Lo/KeyDeserializer;", "()Lo/KeyDeserializer;", "onCommand", "Lo/withHandlersFrom;", "(Lo/withHandlersFrom;)V", "Lo/AlertDialogLayout;", "Lo/AlertDialogLayout;", "()Lo/AlertDialogLayout;", "", "q_", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class readerFor extends createDeserializationContext implements isTypeOrSuperTypeOf {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Map<weirdNumberException, Integer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _bindAndClose AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private withHandlersFrom MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private long read = hasReferringProperties.INSTANCE.write();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final withContentType handleMediaPlayPauseIfPendingOnHandler = new withContentType(this);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final AlertDialogLayout<weirdNumberException> onCustomAction = setSupportCompoundDrawablesTintList.IconCompatParcelizer();

    @Override // kotlin.createDeserializationContext, kotlin.getValueHandler
    public boolean r_() {
        return true;
    }

    public readerFor(_bindAndClose _bindandclose) {
        this.AudioAttributesCompatParcelizer = _bindandclose;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final _bindAndClose getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.createDeserializationContext
    public createDeserializationContext onAddQueueItem() {
        _bindAndClose read = this.AudioAttributesCompatParcelizer.getRead();
        return read != null ? read.getWrite() : null;
    }

    @Override // kotlin.createDeserializationContext
    public boolean onPlay() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null;
    }

    public void AudioAttributesImplBaseParcelizer(long j) {
        this.read = j;
    }

    @Override // kotlin.createDeserializationContext
    /* JADX INFO: renamed from: onPrepare, reason: from getter */
    public long getOnPrepareFromSearch() {
        return this.read;
    }

    @Override // kotlin.createDeserializationContext
    public withHandlersFrom onMediaButtonEvent() {
        withHandlersFrom withhandlersfrom = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (withhandlersfrom != null) {
            return withhandlersfrom;
        }
        reportWrongTokenException.write("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.getValueHandler
    /* JADX INFO: renamed from: read */
    public tryToResolveUnresolved getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public float getRead() {
        return this.AudioAttributesCompatParcelizer.getRead();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public float getIconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getIconCompatParcelizer();
    }

    @Override // kotlin.createDeserializationContext
    public createDeserializationContext onPlayFromMediaId() {
        _bindAndClose audioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        return audioAttributesImplApi26Parcelizer != null ? audioAttributesImplApi26Parcelizer.getWrite() : null;
    }

    @Override // kotlin.createDeserializationContext, kotlin.getSerializationConfig
    /* JADX INFO: renamed from: onPause */
    public _assertNotNull getIconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getIconCompatParcelizer();
    }

    @Override // kotlin.createDeserializationContext
    public isAbstract onFastForward() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final long onCustomAction() {
        long j = -1;
        return getKey.read((((long) getRead()) << 32) | (((long) getRemoteActionCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    public final long RatingCompat() {
        return getAudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final withContentType getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public KeyDeserializer MediaBrowserCompatItemReceiver() {
        KeyDeserializer keyDeserializerMediaBrowserCompatMediaItem = this.AudioAttributesCompatParcelizer.getIconCompatParcelizer().getAccessaddObserverForBackInvoker().MediaBrowserCompatMediaItem();
        toMagicModuleMetaRepoModel.write(keyDeserializerMediaBrowserCompatMediaItem);
        return keyDeserializerMediaBrowserCompatMediaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(withHandlersFrom withhandlersfrom) {
        Map<weirdNumberException, Integer> map;
        if (withhandlersfrom != null) {
            long j = -1;
            MediaBrowserCompatItemReceiver(getKey.read((((long) withhandlersfrom.getAudioAttributesCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) withhandlersfrom.getWrite()) << 32)));
        } else {
            MediaBrowserCompatItemReceiver(getKey.INSTANCE.RemoteActionCompatParcelizer());
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, withhandlersfrom) && withhandlersfrom != null && ((((map = this.RemoteActionCompatParcelizer) != null && !map.isEmpty()) || !withhandlersfrom.AudioAttributesImplApi26Parcelizer().isEmpty()) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(withhandlersfrom.AudioAttributesImplApi26Parcelizer(), this.RemoteActionCompatParcelizer))) {
            MediaBrowserCompatItemReceiver().getOnPause().AudioAttributesImplApi21Parcelizer();
            LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.RemoteActionCompatParcelizer = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(withhandlersfrom.AudioAttributesImplApi26Parcelizer());
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = withhandlersfrom;
    }

    protected final AlertDialogLayout<weirdNumberException> MediaMetadataCompat() {
        return this.onCustomAction;
    }

    public final int IconCompatParcelizer(weirdNumberException p0) {
        return this.onCustomAction.read(p0, Integer.MIN_VALUE);
    }

    @Override // kotlin.createDeserializationContext
    public void onRewind() {
        RemoteActionCompatParcelizer(getOnPrepareFromSearch(), BitmapDescriptorFactory.HUE_RED, null);
    }

    @Override // kotlin._parser
    public final void RemoteActionCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2) {
        MediaBrowserCompatCustomActionResultReceiver(p0);
        if (getRatingCompat()) {
            return;
        }
        RemoteActionCompatParcelizer();
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(long p0) {
        if (!hasReferringProperties.write(getOnPrepareFromSearch(), p0)) {
            AudioAttributesImplBaseParcelizer(p0);
            setPropertyNamingStrategy onPrepareFromMediaId = getIconCompatParcelizer().getAccessaddObserverForBackInvoker().getOnPrepareFromMediaId();
            if (onPrepareFromMediaId != null) {
                onPrepareFromMediaId.onPlayFromMediaId();
            }
            write(this.AudioAttributesCompatParcelizer);
        }
        if (getMediaBrowserCompatMediaItem()) {
            return;
        }
        write(onMediaButtonEvent());
    }

    public final void AudioAttributesImplApi21Parcelizer(long p0) {
        MediaBrowserCompatCustomActionResultReceiver(hasReferringProperties.AudioAttributesCompatParcelizer(p0, getAudioAttributesImplBaseParcelizer()));
    }

    protected void RemoteActionCompatParcelizer() {
        onMediaButtonEvent().onMediaButtonEvent();
    }

    @Override // kotlin.withStaticTyping, kotlin.hasHandlers
    /* JADX INFO: renamed from: q_ */
    public Object getOnPrepareFromUri() {
        return this.AudioAttributesCompatParcelizer.getOnPrepareFromUri();
    }

    public int AudioAttributesCompatParcelizer(int p0) {
        _bindAndClose read = this.AudioAttributesCompatParcelizer.getRead();
        toMagicModuleMetaRepoModel.write(read);
        readerFor audioAttributesCompatParcelizer = read.getWrite();
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
        return audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    public int write(int p0) {
        _bindAndClose read = this.AudioAttributesCompatParcelizer.getRead();
        toMagicModuleMetaRepoModel.write(read);
        readerFor audioAttributesCompatParcelizer = read.getWrite();
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
        return audioAttributesCompatParcelizer.write(p0);
    }

    public int read(int p0) {
        _bindAndClose read = this.AudioAttributesCompatParcelizer.getRead();
        toMagicModuleMetaRepoModel.write(read);
        readerFor audioAttributesCompatParcelizer = read.getWrite();
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
        return audioAttributesCompatParcelizer.read(p0);
    }

    public int IconCompatParcelizer(int p0) {
        _bindAndClose read = this.AudioAttributesCompatParcelizer.getRead();
        toMagicModuleMetaRepoModel.write(read);
        readerFor audioAttributesCompatParcelizer = read.getWrite();
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
        return audioAttributesCompatParcelizer.IconCompatParcelizer(p0);
    }

    public final long AudioAttributesCompatParcelizer(readerFor p0, boolean p1) {
        long jWrite = hasReferringProperties.INSTANCE.write();
        while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this, p0)) {
            if (!this.getMediaBrowserCompatItemReceiver() || !p1) {
                jWrite = hasReferringProperties.AudioAttributesCompatParcelizer(jWrite, this.getOnPrepareFromSearch());
            }
            _bindAndClose audioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer);
            this = audioAttributesImplApi26Parcelizer.getWrite();
            toMagicModuleMetaRepoModel.write(this);
        }
        return jWrite;
    }
}
