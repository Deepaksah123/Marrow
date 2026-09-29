package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJi\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u0010\u001e\u001a\u0004\u0018\u0001038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b,\u00108R+\u0010;\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00109\u001a\u0004\b'\u0010\f\"\u0004\b\u001e\u0010:R+\u00106\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020<8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00109\u001a\u0004\b>\u0010?\"\u0004\b2\u0010@R\u0018\u0010*\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010BR(\u0010C\u001a\u0004\u0018\u00010A2\b\u0010\u0003\u001a\u0004\u0018\u00010A8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\b2\u0010ER\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00109R(\u0010>\u001a\u0004\u0018\u00010G2\b\u0010\u0003\u001a\u0004\u0018\u00010G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010H\"\u0004\b$\u0010IR\u001e\u0010=\u001a\u0004\u0018\u00010\r8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR+\u00100\u001a\u00020N2\u0006\u0010\u0003\u001a\u00020N8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b'\u00109\u001a\u0004\b$\u0010O\"\u0004\b2\u0010PR+\u0010(\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u00109\u001a\u0004\bR\u0010\f\"\u0004\b*\u0010:R+\u0010U\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bS\u00109\u001a\u0004\bT\u0010\f\"\u0004\b6\u0010:R+\u0010.\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bL\u00109\u001a\u0004\bV\u0010\f\"\u0004\b;\u0010:R+\u0010%\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u00109\u001a\u0004\b%\u0010\f\"\u0004\b'\u0010:R$\u0010X\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b6\u0010W\u001a\u0004\b \u0010\fR+\u0010R\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00109\u001a\u0004\bQ\u0010\f\"\u0004\b2\u0010:R\u0014\u0010V\u001a\u00020Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010ZR+\u0010Q\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b,\u00109\u001a\u0004\b,\u0010\f\"\u0004\b,\u0010:R+\u0010L\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bC\u00109\u001a\u0004\b;\u0010\f\"\u0004\b$\u0010:R\"\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010[R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010[\u001a\u0004\b(\u0010\\R&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00160\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010[\u001a\u0004\bU\u0010\\R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\n0\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010[\u001a\u0004\b=\u0010\\R\u001a\u0010a\u001a\u00020^8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010_\u001a\u0004\b\u001e\u0010`R\u001c\u0010S\u001a\u00020\u001c8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\"\u0010b\u001a\u0004\bX\u0010cR+\u0010J\u001a\u00020d2\u0006\u0010\u0003\u001a\u00020d8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bT\u00109\u001a\u0004\b.\u0010c\"\u0004\b,\u0010eR+\u0010f\u001a\u00020d2\u0006\u0010\u0003\u001a\u00020d8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b2\u0010c\"\u0004\b$\u0010e"}, d2 = {"Lo/setImageDisplayMode;", "", "Lo/WebViewSubtitleOutput;", "p0", "Lo/escapesFor;", "p1", "Lo/BaseSettings;", "p2", "<init>", "(Lo/WebViewSubtitleOutput;Lo/escapesFor;Lo/BaseSettings;)V", "", "onMediaButtonEvent", "()Z", "Lo/AbstractDeserializer;", "Lo/deserializeWithObjectId;", "p3", "Lo/bufferMapProperty;", "p4", "Lo/_reportMissingSetter$write;", "p5", "Lkotlin/Function1;", "Lo/hasValueTypeDeserializer;", "", "p6", "Lo/setErrorMessageProvider;", "p7", "Lo/_resizeAndFindOffsetForAdd;", "p8", "Lo/switchToNext;", "p9", "RemoteActionCompatParcelizer", "(Lo/AbstractDeserializer;Lo/AbstractDeserializer;Lo/deserializeWithObjectId;ZLo/bufferMapProperty;Lo/_reportMissingSetter$write;Lo/getAnswerMap;Lo/setErrorMessageProvider;Lo/_resizeAndFindOffsetForAdd;J)V", "onPrepareFromMediaId", "Lo/WebViewSubtitleOutput;", "onPlay", "()Lo/WebViewSubtitleOutput;", "IconCompatParcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/escapesFor;", "AudioAttributesCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "Lo/BaseSettings;", "AudioAttributesImplBaseParcelizer", "()Lo/BaseSettings;", "read", "Lo/DeserializersBase;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/DeserializersBase;", "MediaBrowserCompatMediaItem", "()Lo/DeserializersBase;", "write", "Lo/fillInStackTrace;", "AudioAttributesImplApi26Parcelizer", "Lo/fillInStackTrace;", "AudioAttributesImplApi21Parcelizer", "()Lo/fillInStackTrace;", "(Lo/fillInStackTrace;)V", "Lo/InputAccessor;", "(Z)V", "MediaBrowserCompatItemReceiver", "Lo/assignParameter;", "MediaDescriptionCompat", "MediaMetadataCompat", "()F", "(F)V", "Lo/isAbstract;", "Lo/isAbstract;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/isAbstract;", "(Lo/isAbstract;)V", "Lo/InputAccessor;", "Lo/hasStableIds;", "()Lo/hasStableIds;", "(Lo/hasStableIds;)V", "onPlayFromSearch", "Lo/AbstractDeserializer;", "onPlayFromMediaId", "()Lo/AbstractDeserializer;", "Lo/lambdaonImageAvailable1androidxmedia3uiPlayerView;", "()Lo/lambdaonImageAvailable1androidxmedia3uiPlayerView;", "(Lo/lambdaonImageAvailable1androidxmedia3uiPlayerView;)V", "onPause", "onAddQueueItem", "onPlayFromUri", "onFastForward", "RatingCompat", "onCustomAction", "Z", "onCommand", "Lo/setCustomErrorMessage;", "Lo/setCustomErrorMessage;", "Lo/getAnswerMap;", "()Lo/getAnswerMap;", "Lo/ResolvableDeserializer;", "Lo/releaseBuffers;", "Lo/releaseBuffers;", "()Lo/releaseBuffers;", "onPrepareFromSearch", "J", "()J", "Lo/findProperty;", "(J)V", "onPrepare"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setImageDisplayMode {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean onCommand;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private fillInStackTrace RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final releaseBuffers onPrepareFromSearch;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private isAbstract AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final InputAccessor onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final InputAccessor onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final InputAccessor<hasStableIds> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final BaseSettings read;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final escapesFor AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final InputAccessor AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final getAnswerMap<ResolvableDeserializer, getShowPopup> onPlay;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setCustomErrorMessage onCustomAction;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor onPrepare;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final DeserializersBase write = new DeserializersBase();

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final getAnswerMap<ResolvableDeserializer, Boolean> onPrepareFromMediaId;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> onFastForward;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final getAnswerMap<hasValueTypeDeserializer, getShowPopup> onMediaButtonEvent;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final InputAccessor onPlayFromSearch;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final InputAccessor MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private long onPlayFromUri;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final InputAccessor handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private AbstractDeserializer MediaDescriptionCompat;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final InputAccessor RatingCompat;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private WebViewSubtitleOutput IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final InputAccessor onPause;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatItemReceiver;

    public setImageDisplayMode(WebViewSubtitleOutput webViewSubtitleOutput, escapesFor escapesfor, BaseSettings baseSettings) {
        this.IconCompatParcelizer = webViewSubtitleOutput;
        this.AudioAttributesCompatParcelizer = escapesfor;
        this.read = baseSettings;
        Boolean bool = Boolean.FALSE;
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.AudioAttributesImplApi21Parcelizer = available.RemoteActionCompatParcelizer$default(assignParameter.read(assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED)), null, 2, null);
        this.AudioAttributesImplApi26Parcelizer = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.MediaBrowserCompatMediaItem = available.RemoteActionCompatParcelizer$default(lambdaonImageAvailable1androidxmedia3uiPlayerView.IconCompatParcelizer, null, 2, null);
        this.MediaBrowserCompatSearchResultReceiver = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.RatingCompat = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.handleMediaPlayPauseIfPendingOnHandler = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.onCommand = true;
        this.onAddQueueItem = available.RemoteActionCompatParcelizer$default(Boolean.TRUE, null, 2, null);
        this.onCustomAction = new setCustomErrorMessage(baseSettings);
        this.onPause = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.onPlayFromMediaId = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.onFastForward = new getAnswerMap() { // from class: o.setFullscreenButtonClickListener
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setImageDisplayMode.AudioAttributesCompatParcelizer((hasValueTypeDeserializer) obj);
            }
        };
        this.onMediaButtonEvent = new getAnswerMap() { // from class: o.setUseController
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setImageDisplayMode.read(this.IconCompatParcelizer, (hasValueTypeDeserializer) obj);
            }
        };
        this.onPlay = new getAnswerMap() { // from class: o.setUseArtwork
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setImageDisplayMode.read(this.AudioAttributesCompatParcelizer, (ResolvableDeserializer) obj);
            }
        };
        this.onPrepareFromMediaId = new getAnswerMap() { // from class: o.SubtitleView
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(setImageDisplayMode.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (ResolvableDeserializer) obj));
            }
        };
        this.onPrepareFromSearch = fromInitial.AudioAttributesCompatParcelizer();
        this.onPlayFromUri = switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
        this.onPlayFromSearch = available.RemoteActionCompatParcelizer$default(findProperty.AudioAttributesCompatParcelizer(findProperty.INSTANCE.AudioAttributesCompatParcelizer()), null, 2, null);
        this.onPrepare = available.RemoteActionCompatParcelizer$default(findProperty.AudioAttributesCompatParcelizer(findProperty.INSTANCE.AudioAttributesCompatParcelizer()), null, 2, null);
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final WebViewSubtitleOutput getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final BaseSettings getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final DeserializersBase getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final fillInStackTrace getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(fillInStackTrace fillinstacktrace) {
        this.RemoteActionCompatParcelizer = fillinstacktrace;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AudioAttributesCompatParcelizer() {
        return ((Boolean) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float MediaMetadataCompat() {
        return ((assignParameter) this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer()).getRemoteActionCompatParcelizer();
    }

    public final void write(float f) {
        this.AudioAttributesImplApi21Parcelizer.write(assignParameter.read(f));
    }

    public final isAbstract MediaBrowserCompatCustomActionResultReceiver() {
        isAbstract isabstract = this.AudioAttributesImplBaseParcelizer;
        if (isabstract == null || !isabstract.MediaBrowserCompatItemReceiver()) {
            return null;
        }
        return isabstract;
    }

    public final void write(isAbstract isabstract) {
        this.AudioAttributesImplBaseParcelizer = isabstract;
    }

    public final hasStableIds AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(hasStableIds hasstableids) {
        this.AudioAttributesImplApi26Parcelizer.write(hasstableids);
        this.onCommand = false;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final AbstractDeserializer getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lambdaonImageAvailable1androidxmedia3uiPlayerView IconCompatParcelizer() {
        return (lambdaonImageAvailable1androidxmedia3uiPlayerView) this.MediaBrowserCompatMediaItem.getRemoteActionCompatParcelizer();
    }

    public final void write(lambdaonImageAvailable1androidxmedia3uiPlayerView lambdaonimageavailable1androidxmedia3uiplayerview) {
        this.MediaBrowserCompatMediaItem.write(lambdaonimageavailable1androidxmedia3uiplayerview);
    }

    public final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onAddQueueItem() {
        return ((Boolean) this.MediaBrowserCompatSearchResultReceiver.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.RatingCompat.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onFastForward() {
        return ((Boolean) this.RatingCompat.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void MediaBrowserCompatItemReceiver(boolean z) {
        this.handleMediaPlayPauseIfPendingOnHandler.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCustomAction() {
        return ((Boolean) this.handleMediaPlayPauseIfPendingOnHandler.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return ((Boolean) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
    public final boolean getOnCommand() {
        return this.onCommand;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onPause() {
        return ((Boolean) this.onAddQueueItem.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void write(boolean z) {
        this.onAddQueueItem.write(Boolean.valueOf(z));
    }

    public final void read(boolean z) {
        this.onPause.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean read() {
        return ((Boolean) this.onPause.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void IconCompatParcelizer(boolean z) {
        this.onPlayFromMediaId.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean MediaBrowserCompatItemReceiver() {
        return ((Boolean) this.onPlayFromMediaId.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(hasValueTypeDeserializer hasvaluetypedeserializer) {
        return getShowPopup.INSTANCE;
    }

    public final getAnswerMap<hasValueTypeDeserializer, getShowPopup> MediaBrowserCompatSearchResultReceiver() {
        return this.onMediaButtonEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setImageDisplayMode setimagedisplaymode, hasValueTypeDeserializer hasvaluetypedeserializer) {
        String strAudioAttributesCompatParcelizer = hasvaluetypedeserializer.AudioAttributesCompatParcelizer();
        AbstractDeserializer abstractDeserializer = setimagedisplaymode.MediaDescriptionCompat;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strAudioAttributesCompatParcelizer, (Object) (abstractDeserializer != null ? abstractDeserializer.getIconCompatParcelizer() : null))) {
            setimagedisplaymode.write(lambdaonImageAvailable1androidxmedia3uiPlayerView.IconCompatParcelizer);
            if (setimagedisplaymode.MediaBrowserCompatItemReceiver()) {
                setimagedisplaymode.IconCompatParcelizer(false);
            } else {
                setimagedisplaymode.read(false);
            }
        }
        setimagedisplaymode.read(findProperty.INSTANCE.AudioAttributesCompatParcelizer());
        setimagedisplaymode.IconCompatParcelizer(findProperty.INSTANCE.AudioAttributesCompatParcelizer());
        setimagedisplaymode.onFastForward.invoke(hasvaluetypedeserializer);
        setimagedisplaymode.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    public final getAnswerMap<ResolvableDeserializer, getShowPopup> RatingCompat() {
        return this.onPlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setImageDisplayMode setimagedisplaymode, ResolvableDeserializer resolvableDeserializer) {
        setimagedisplaymode.onCustomAction.AudioAttributesCompatParcelizer(resolvableDeserializer.getAudioAttributesCompatParcelizer());
        return getShowPopup.INSTANCE;
    }

    public final getAnswerMap<ResolvableDeserializer, Boolean> MediaDescriptionCompat() {
        return this.onPrepareFromMediaId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(setImageDisplayMode setimagedisplaymode, ResolvableDeserializer resolvableDeserializer) {
        return setimagedisplaymode.onCustomAction.AudioAttributesCompatParcelizer(resolvableDeserializer.getAudioAttributesCompatParcelizer());
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final releaseBuffers getOnPrepareFromSearch() {
        return this.onPrepareFromSearch;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final long getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long handleMediaPlayPauseIfPendingOnHandler() {
        return ((findProperty) this.onPlayFromSearch.getRemoteActionCompatParcelizer()).getIconCompatParcelizer();
    }

    public final void read(long j) {
        this.onPlayFromSearch.write(findProperty.AudioAttributesCompatParcelizer(j));
    }

    public final void IconCompatParcelizer(long j) {
        this.onPrepare.write(findProperty.AudioAttributesCompatParcelizer(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long write() {
        return ((findProperty) this.onPrepare.getRemoteActionCompatParcelizer()).getIconCompatParcelizer();
    }

    public final boolean onMediaButtonEvent() {
        return (findProperty.write(handleMediaPlayPauseIfPendingOnHandler()) && findProperty.write(write())) ? false : true;
    }

    public final void RemoteActionCompatParcelizer(AbstractDeserializer p0, AbstractDeserializer p1, deserializeWithObjectId p2, boolean p3, bufferMapProperty p4, _reportMissingSetter.write p5, getAnswerMap<? super hasValueTypeDeserializer, getShowPopup> p6, setErrorMessageProvider p7, _resizeAndFindOffsetForAdd p8, long p9) {
        this.onFastForward = p6;
        this.onPlayFromUri = p9;
        setCustomErrorMessage setcustomerrormessage = this.onCustomAction;
        setcustomerrormessage.write(p7);
        setcustomerrormessage.AudioAttributesCompatParcelizer(p8);
        this.MediaDescriptionCompat = p0;
        WebViewSubtitleOutput webViewSubtitleOutput = MediaRouteExpandCollapseButton.read(this.IconCompatParcelizer, p1, p2, p4, p5, (448 & 32) != 0 ? true : p3, (448 & 64) != 0 ? paramName.INSTANCE.RemoteActionCompatParcelizer() : 0, (448 & 128) != 0 ? Integer.MAX_VALUE : 0, (448 & 256) != 0 ? 1 : 0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        if (this.IconCompatParcelizer != webViewSubtitleOutput) {
            this.onCommand = true;
        }
        this.IconCompatParcelizer = webViewSubtitleOutput;
    }
}
