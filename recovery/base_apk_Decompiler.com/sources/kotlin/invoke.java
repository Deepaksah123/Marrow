package kotlin;

import android.view.KeyEvent;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.isVisible;
import kotlin.setOverriddenInsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u00025\u001cBM\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u0015*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 JU\u0010\u001c\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0004¢\u0006\u0004\b\u001c\u0010!J\u001f\u0010$\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\"2\u0006\u0010\f\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0015¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010'J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010'J\u000f\u0010\u001f\u001a\u00020\u0015H\u0004¢\u0006\u0004\b\u001f\u0010'J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010'J'\u0010$\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020/2\u0006\u0010\f\u001a\u00020#2\u0006\u0010\u000e\u001a\u000200H\u0016¢\u0006\u0004\b$\u00101J\u000f\u00102\u001a\u00020\u0015H\u0016¢\u0006\u0004\b2\u0010'J\u0015\u0010$\u001a\u00020\r2\u0006\u0010\n\u001a\u000203¢\u0006\u0004\b$\u00104J\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u000203H$¢\u0006\u0004\b\u001f\u00104J\u0017\u00105\u001a\u00020\r2\u0006\u0010\n\u001a\u000203H$¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u0015H\u0014¢\u0006\u0004\b6\u0010'J\u0015\u0010+\u001a\u00020\r2\u0006\u0010\n\u001a\u000203¢\u0006\u0004\b+\u00104J\u0011\u0010$\u001a\u00020\u0015*\u00020\u001e¢\u0006\u0004\b$\u0010 J\u0011\u00107\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b7\u00108J\u001f\u0010$\u001a\u00020\u00152\u0006\u0010\n\u001a\u0002092\u0006\u0010\f\u001a\u00020\rH\u0004¢\u0006\u0004\b$\u0010:J\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\n\u001a\u0002092\u0006\u0010\f\u001a\u00020\rH\u0004¢\u0006\u0004\b\u001c\u0010:J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\rH\u0004¢\u0006\u0004\b$\u0010,J\u001c\u0010\u001f\u001a\u00020\u0015*\u00020;2\u0006\u0010\n\u001a\u000209H\u0084@¢\u0006\u0004\b\u001f\u0010<J\u000f\u0010=\u001a\u00020\rH\u0002¢\u0006\u0004\b=\u0010\u001aJ\u000f\u0010>\u001a\u00020\u0015H\u0002¢\u0006\u0004\b>\u0010'J\u000f\u0010?\u001a\u00020\u0015H\u0002¢\u0006\u0004\b?\u0010'R\u0018\u00105\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r8\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\b$\u0010\u001aR0\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010I\u001a\u00020\r8\u0007X\u0087D¢\u0006\f\n\u0004\bP\u0010D\u001a\u0004\bO\u0010\u001aR\u0014\u0010M\u001a\u00020Q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010RR\u0018\u0010&\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010BR\u0018\u00107\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u00102\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010WR\u0018\u00106\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010*\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010\\R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020X0]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010^R\u0016\u0010`\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010_R\u0018\u0010@\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010ZR\u0018\u0010K\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010aR\u0018\u0010S\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010AR\u0016\u0010E\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010DR\u0018\u0010e\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010dR\u0011\u0010Y\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bf\u0010\u001aR\u0018\u0010P\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010hR\u001a\u0010G\u001a\u00020i8\u0017X\u0097\u0004¢\u0006\f\n\u0004\be\u0010j\u001a\u0004\bJ\u0010k"}, d2 = {"Lo/invoke;", "Lo/addAbstractTypeResolver;", "Lo/forRootType;", "Lo/objectIdGeneratorInstance;", "Lo/hasIndex;", "Lo/createForPropertyOverride;", "Lo/getLongMask;", "Lo/_prefetchRootDeserializer;", "Lo/_resolveAndValidateGeneric;", "Lo/hashCode;", "p0", "Lo/setParentLayoutDirection;", "p1", "", "p2", "p3", "", "p4", "Lo/keyDeserializers;", "p5", "Lkotlin/Function0;", "", "p6", "<init>", "(Lo/hashCode;Lo/setParentLayoutDirection;ZZLjava/lang/String;Lo/keyDeserializers;Lo/getCreatedOnDateMs;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "onSetCaptioningEnabled", "()Z", "Lo/handleWeirdStringValue;", "read", "()Lo/handleWeirdStringValue;", "Lo/getConfigOverride;", "IconCompatParcelizer", "(Lo/getConfigOverride;)V", "(Lo/hashCode;Lo/setParentLayoutDirection;ZZLjava/lang/String;Lo/keyDeserializers;Lo/getCreatedOnDateMs;)V", "Lo/DatabindContext;", "Lo/_shapeForToken;", "write", "(Lo/DatabindContext;Lo/_shapeForToken;)V", "MediaBrowserCompatCustomActionResultReceiver", "()V", "c_", "MediaMetadataCompat", "MediaDescriptionCompat", "AudioAttributesCompatParcelizer", "(Z)V", "onSetRepeatMode", "onSetShuffleMode", "Lo/DeserializationContext;", "Lo/getKey;", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "MediaBrowserCompatMediaItem", "Lo/constructType;", "(Landroid/view/KeyEvent;)Z", "RemoteActionCompatParcelizer", "RatingCompat", "MediaBrowserCompatSearchResultReceiver", "()Lo/getShowPopup;", "Lo/getReferencedType;", "(JZ)V", "Lo/RemoteActionCompat;", "(Lo/RemoteActionCompat;JLo/SampleVideos;)Ljava/lang/Object;", "onRewind", "onSetPlaybackSpeed", "onSetRating", "onCommand", "Lo/hashCode;", "Lo/setParentLayoutDirection;", "onPrepareFromSearch", "Z", "onAddQueueItem", "Ljava/lang/String;", "onMediaButtonEvent", "Lo/keyDeserializers;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/getCreatedOnDateMs;", "AudioAttributesImplApi26Parcelizer", "()Lo/getCreatedOnDateMs;", "AudioAttributesImplBaseParcelizer", "onFastForward", "Lo/getOnDensityChangedui;", "Lo/getOnDensityChangedui;", "onCustomAction", "onPause", "Lo/handleWeirdStringValue;", "Lo/Module;", "Lo/Module;", "Lo/setOverriddenInsets$read;", "onPlay", "Lo/setOverriddenInsets$read;", "Lo/isVisible$read;", "Lo/isVisible$read;", "Lo/ActivityChooserViewInnerLayout;", "Lo/ActivityChooserViewInnerLayout;", "J", "handleMediaPlayPauseIfPendingOnHandler", "Lo/getReferencedType;", "onPrepareFromMediaId", "Lo/invoke$RemoteActionCompatParcelizer;", "Lo/invoke$RemoteActionCompatParcelizer;", "onPlayFromMediaId", "l_", "Lo/setPassingYear;", "Lo/setPassingYear;", "", "Ljava/lang/Object;", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class invoke extends addAbstractTypeResolver implements forRootType, objectIdGeneratorInstance, hasIndex, createForPropertyOverride, getLongMask, _prefetchRootDeserializer, _resolveAndValidateGeneric {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;
    private final getOnDensityChangedui AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private isVisible.read MediaDescriptionCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private long handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private setPassingYear onFastForward;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private Module MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private setParentLayoutDirection read;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private getReferencedType MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer onPlayFromMediaId;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private setOverriddenInsets.read onCommand;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ActivityChooserViewInnerLayout<setOverriddenInsets.read> MediaMetadataCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private boolean onAddQueueItem;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private hashCode RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private setParentLayoutDirection MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private C0184keyDeserializers IconCompatParcelizer;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private handleWeirdStringValue MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private setOverriddenInsets.read RatingCompat;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final Object onMediaButtonEvent;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private hashCode onCustomAction;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int AudioAttributesCompatParcelizer = 8;

    @Override // kotlin.objectIdGeneratorInstance
    public final boolean AudioAttributesCompatParcelizer(KeyEvent p0) {
        return false;
    }

    public void IconCompatParcelizer(getConfigOverride getconfigoverride) {
    }

    protected abstract boolean IconCompatParcelizer(KeyEvent p0);

    protected void RatingCompat() {
    }

    protected abstract boolean RemoteActionCompatParcelizer(KeyEvent p0);

    @Override // kotlin.hasIndex
    /* JADX INFO: renamed from: l_ */
    public final boolean getRead() {
        return true;
    }

    public abstract handleWeirdStringValue read();

    private invoke(hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z, boolean z2, String str, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = hashcode;
        this.read = setparentlayoutdirection;
        this.write = z;
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = c0184keyDeserializers;
        this.MediaBrowserCompatItemReceiver = z2;
        this.AudioAttributesImplBaseParcelizer = getcreatedondatems;
        this.AudioAttributesImplApi26Parcelizer = new getOnDensityChangedui(hashcode, hashSeed.INSTANCE.RemoteActionCompatParcelizer(), new write(this), null);
        this.MediaMetadataCompat = setOnMenuItemClickListener.read();
        this.handleMediaPlayPauseIfPendingOnHandler = getReferencedType.INSTANCE.write();
        this.onCustomAction = this.RemoteActionCompatParcelizer;
        this.onAddQueueItem = onSetCaptioningEnabled();
        this.onMediaButtonEvent = INSTANCE;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    protected final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    protected final getCreatedOnDateMs<getShowPopup> AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class write extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<Boolean, getShowPopup> {
        public final void IconCompatParcelizer(boolean z) {
            ((invoke) this.AudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer(z);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Boolean bool) {
            IconCompatParcelizer(bool.booleanValue());
            return getShowPopup.INSTANCE;
        }

        write(Object obj) {
            super(1, obj, invoke.class, "AudioAttributesCompatParcelizer", "AudioAttributesCompatParcelizer(Z)V", 0);
        }
    }

    private final boolean onSetCaptioningEnabled() {
        return this.onCustomAction == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void read(kotlin.hashCode r3, kotlin.setParentLayoutDirection r4, boolean r5, boolean r6, java.lang.String r7, kotlin.C0184keyDeserializers r8, kotlin.getCreatedOnDateMs<kotlin.getShowPopup> r9) {
        /*
            r2 = this;
            o.hashCode r0 = r2.onCustomAction
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.IconCompatParcelizer()
            r2.onCustomAction = r3
            r2.RemoteActionCompatParcelizer = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            o.setParentLayoutDirection r0 = r2.read
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r4)
            if (r0 != 0) goto L1e
            r2.read = r4
            r3 = r1
        L1e:
            boolean r4 = r2.write
            if (r4 == r5) goto L2a
            r2.write = r5
            if (r5 == 0) goto L2b
            r2.MediaMetadataCompat()
            goto L2b
        L2a:
            r1 = r3
        L2b:
            boolean r3 = r2.MediaBrowserCompatItemReceiver
            if (r3 == r6) goto L4b
            if (r6 == 0) goto L39
            o.getOnDensityChangedui r3 = r2.AudioAttributesImplApi26Parcelizer
            o.Module r3 = (kotlin.Module) r3
            r2.AudioAttributesCompatParcelizer(r3)
            goto L43
        L39:
            o.getOnDensityChangedui r3 = r2.AudioAttributesImplApi26Parcelizer
            o.Module r3 = (kotlin.Module) r3
            r2.IconCompatParcelizer(r3)
            r2.IconCompatParcelizer()
        L43:
            r3 = r2
            o.hasIndex r3 = (kotlin.hasIndex) r3
            kotlin.getValueNulls.write(r3)
            r2.MediaBrowserCompatItemReceiver = r6
        L4b:
            java.lang.String r3 = r2.AudioAttributesCompatParcelizer
            boolean r3 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r3, r7)
            if (r3 != 0) goto L5b
            r2.AudioAttributesCompatParcelizer = r7
            r3 = r2
            o.hasIndex r3 = (kotlin.hasIndex) r3
            kotlin.getValueNulls.write(r3)
        L5b:
            o.keyDeserializers r3 = r2.IconCompatParcelizer
            boolean r3 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r3, r8)
            if (r3 != 0) goto L6b
            r2.IconCompatParcelizer = r8
            r3 = r2
            o.hasIndex r3 = (kotlin.hasIndex) r3
            kotlin.getValueNulls.write(r3)
        L6b:
            r2.AudioAttributesImplBaseParcelizer = r9
            boolean r3 = r2.onAddQueueItem
            boolean r4 = r2.onSetCaptioningEnabled()
            if (r3 == r4) goto L82
            boolean r3 = r2.onSetCaptioningEnabled()
            r2.onAddQueueItem = r3
            if (r3 != 0) goto L82
            o.Module r3 = r2.MediaBrowserCompatMediaItem
            if (r3 != 0) goto L82
            goto L84
        L82:
            if (r1 == 0) goto L87
        L84:
            r2.onSetRepeatMode()
        L87:
            o.getOnDensityChangedui r3 = r2.AudioAttributesImplApi26Parcelizer
            o.hashCode r2 = r2.RemoteActionCompatParcelizer
            r3.RemoteActionCompatParcelizer(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.invoke.read(o.hashCode, o.setParentLayoutDirection, boolean, boolean, java.lang.String, o.keyDeserializers, o.getCreatedOnDateMs):void");
    }

    @Override // kotlin._resolveAndValidateGeneric
    public void write(DatabindContext p0, _shapeForToken p1) {
        onSetShuffleMode();
        if (this.MediaBrowserCompatItemReceiver) {
            if (this.onPlayFromMediaId == null) {
                this.onPlayFromMediaId = new RemoteActionCompatParcelizer(this);
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onPlayFromMediaId;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0, p1, this.AudioAttributesImplBaseParcelizer);
            }
        }
    }

    @Override // kotlin._resolveAndValidateGeneric
    public void MediaBrowserCompatCustomActionResultReceiver() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onPlayFromMediaId;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        MediaMetadataCompat();
        if (!this.onAddQueueItem) {
            onSetShuffleMode();
        }
        if (this.MediaBrowserCompatItemReceiver) {
            AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    @Override // kotlin._prefetchRootDeserializer
    public void MediaMetadataCompat() {
        if (this.write) {
            _detectBindAndClose.read(this, new getCreatedOnDateMs() { // from class: o.AbstractComposeView
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return invoke.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(invoke invokeVar) {
        PopupLayout popupLayout = (PopupLayout) MappingJsonFactory.write(invokeVar, setResetBlock.read());
        if (!(popupLayout instanceof setParentLayoutDirection)) {
            getRootStableInsets.RemoteActionCompatParcelizer(getLocalSavedStateRegistryOwner.write(popupLayout));
        }
        setParentLayoutDirection setparentlayoutdirection = invokeVar.MediaBrowserCompatCustomActionResultReceiver;
        setParentLayoutDirection setparentlayoutdirection2 = (setParentLayoutDirection) popupLayout;
        invokeVar.MediaBrowserCompatCustomActionResultReceiver = setparentlayoutdirection2;
        if (setparentlayoutdirection != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setparentlayoutdirection2, setparentlayoutdirection)) {
            invokeVar.onSetRepeatMode();
        }
        return getShowPopup.INSTANCE;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        IconCompatParcelizer();
        if (this.onCustomAction == null) {
            this.RemoteActionCompatParcelizer = null;
        }
        Module module = this.MediaBrowserCompatMediaItem;
        if (module != null) {
            IconCompatParcelizer(module);
        }
        this.MediaBrowserCompatMediaItem = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void IconCompatParcelizer() {
        /*
            r15 = this;
            o.hashCode r0 = r15.RemoteActionCompatParcelizer
            if (r0 == 0) goto L7e
            o.setOverriddenInsets$read r1 = r15.RatingCompat
            if (r1 == 0) goto L12
            o.setOverriddenInsets$IconCompatParcelizer r2 = new o.setOverriddenInsets$IconCompatParcelizer
            r2.<init>(r1)
            o.isRound r2 = (kotlin.isRound) r2
            r0.read(r2)
        L12:
            o.setOverriddenInsets$read r1 = r15.onCommand
            if (r1 == 0) goto L20
            o.setOverriddenInsets$IconCompatParcelizer r2 = new o.setOverriddenInsets$IconCompatParcelizer
            r2.<init>(r1)
            o.isRound r2 = (kotlin.isRound) r2
            r0.read(r2)
        L20:
            o.isVisible$read r1 = r15.MediaDescriptionCompat
            if (r1 == 0) goto L2e
            o.isVisible$IconCompatParcelizer r2 = new o.isVisible$IconCompatParcelizer
            r2.<init>(r1)
            o.isRound r2 = (kotlin.isRound) r2
            r0.read(r2)
        L2e:
            o.ActivityChooserViewInnerLayout<o.setOverriddenInsets$read> r1 = r15.MediaMetadataCompat
            o.setOverflowIcon r1 = (kotlin.setOverflowIcon) r1
            java.lang.Object[] r2 = r1.MediaBrowserCompatCustomActionResultReceiver
            long[] r1 = r1.RemoteActionCompatParcelizer
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7e
            r4 = 0
            r5 = r4
        L3d:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L79
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L57:
            if (r10 >= r8) goto L77
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L73
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            o.setOverriddenInsets$read r11 = (o.setOverriddenInsets.read) r11
            o.setOverriddenInsets$IconCompatParcelizer r12 = new o.setOverriddenInsets$IconCompatParcelizer
            r12.<init>(r11)
            o.isRound r12 = (kotlin.isRound) r12
            r0.read(r12)
        L73:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L57
        L77:
            if (r8 != r9) goto L7e
        L79:
            if (r5 == r3) goto L7e
            int r5 = r5 + 1
            goto L3d
        L7e:
            r0 = 0
            r15.RatingCompat = r0
            r15.onCommand = r0
            r15.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r0
            r15.MediaDescriptionCompat = r0
            o.ActivityChooserViewInnerLayout<o.setOverriddenInsets$read> r15 = r15.MediaMetadataCompat
            r15.IconCompatParcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.invoke.IconCompatParcelizer():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            if (r18 == 0) goto L8
            r17.onSetShuffleMode()
            return
        L8:
            o.hashCode r1 = r0.RemoteActionCompatParcelizer
            r2 = 0
            if (r1 == 0) goto L74
            o.ActivityChooserViewInnerLayout<o.setOverriddenInsets$read> r1 = r0.MediaMetadataCompat
            o.setOverflowIcon r1 = (kotlin.setOverflowIcon) r1
            java.lang.Object[] r3 = r1.MediaBrowserCompatCustomActionResultReceiver
            long[] r1 = r1.RemoteActionCompatParcelizer
            int r4 = r1.length
            int r4 = r4 + (-2)
            r5 = 3
            if (r4 < 0) goto L62
            r6 = 0
            r7 = r6
        L1d:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5d
            int r10 = r7 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L37:
            if (r12 >= r10) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L57
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            o.setOverriddenInsets$read r13 = (o.setOverriddenInsets.read) r13
            o.TopUserCompanion r14 = r17.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            o.invoke$MediaBrowserCompatMediaItem r15 = new o.invoke$MediaBrowserCompatMediaItem
            r15.<init>(r13, r2)
            o.MagicModuleSubmissionRequestBody r15 = (kotlin.MagicModuleSubmissionRequestBody) r15
            kotlin.setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(r14, r2, r2, r15, r5)
        L57:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L37
        L5b:
            if (r10 != r11) goto L62
        L5d:
            if (r7 == r4) goto L62
            int r7 = r7 + 1
            goto L1d
        L62:
            o.setOverriddenInsets$read r1 = r0.onCommand
            if (r1 == 0) goto L74
            o.TopUserCompanion r3 = r17.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            o.invoke$RatingCompat r4 = new o.invoke$RatingCompat
            r4.<init>(r1, r2)
            o.MagicModuleSubmissionRequestBody r4 = (kotlin.MagicModuleSubmissionRequestBody) r4
            kotlin.setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(r3, r2, r2, r4, r5)
        L74:
            o.ActivityChooserViewInnerLayout<o.setOverriddenInsets$read> r1 = r0.MediaMetadataCompat
            r1.IconCompatParcelizer()
            r0.onCommand = r2
            r17.RatingCompat()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.invoke.AudioAttributesCompatParcelizer(boolean):void");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int RemoteActionCompatParcelizer;
        final /* synthetic */ setOverriddenInsets.read write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                hashCode hashcode = invoke.this.RemoteActionCompatParcelizer;
                if (hashcode != null) {
                    this.RemoteActionCompatParcelizer = 1;
                    if (hashcode.RemoteActionCompatParcelizer(new setOverriddenInsets.IconCompatParcelizer(this.write), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
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
        MediaBrowserCompatMediaItem(setOverriddenInsets.read readVar, SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(2, sampleVideos);
            this.write = readVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return invoke.this.new MediaBrowserCompatMediaItem(this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;
        final /* synthetic */ setOverriddenInsets.read read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                hashCode hashcode = invoke.this.RemoteActionCompatParcelizer;
                if (hashcode != null) {
                    this.IconCompatParcelizer = 1;
                    if (hashcode.RemoteActionCompatParcelizer(new setOverriddenInsets.IconCompatParcelizer(this.read), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
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
        RatingCompat(setOverriddenInsets.read readVar, SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
            this.read = readVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return invoke.this.new RatingCompat(this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onSetRepeatMode() {
        Module module = this.MediaBrowserCompatMediaItem;
        if (module == null && this.onAddQueueItem) {
            return;
        }
        if (module != null) {
            IconCompatParcelizer(module);
        }
        this.MediaBrowserCompatMediaItem = null;
        onSetShuffleMode();
    }

    private final void onSetShuffleMode() {
        if (this.MediaBrowserCompatMediaItem == null) {
            setParentLayoutDirection setparentlayoutdirection = this.write ? this.MediaBrowserCompatCustomActionResultReceiver : this.read;
            if (setparentlayoutdirection != null) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = isConsumed.RemoteActionCompatParcelizer();
                }
                this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
                hashCode hashcode = this.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.write(hashcode);
                Module module = setparentlayoutdirection.read(hashcode);
                AudioAttributesCompatParcelizer(module);
                this.MediaBrowserCompatMediaItem = module;
            }
        }
    }

    public void write(DeserializationContext p0, _shapeForToken p1, long p2) {
        handleWeirdStringValue handleweirdstringvalue;
        long j = SetterlessProperty.read(p2);
        long j2 = -1;
        this.handleMediaPlayPauseIfPendingOnHandler = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(hasReferringProperties.IconCompatParcelizer(j))) << 32) | (((long) Float.floatToRawIntBits(hasReferringProperties.AudioAttributesCompatParcelizer(j))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        onSetShuffleMode();
        if (this.MediaBrowserCompatItemReceiver && p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
            int mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver();
            if (constructCalendar.AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver, constructCalendar.INSTANCE.read())) {
                C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new onCommand(null), 3);
            } else if (constructCalendar.AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver, constructCalendar.INSTANCE.AudioAttributesCompatParcelizer())) {
                C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(null), 3);
            }
        }
        if (this.MediaBrowserCompatSearchResultReceiver == null && (handleweirdstringvalue = read()) != null) {
            this.MediaBrowserCompatSearchResultReceiver = (handleWeirdStringValue) AudioAttributesCompatParcelizer(handleweirdstringvalue);
        }
        handleWeirdStringValue handleweirdstringvalue2 = this.MediaBrowserCompatSearchResultReceiver;
        if (handleweirdstringvalue2 != null) {
            handleweirdstringvalue2.write(p0, p1, p2);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class onCommand extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.RemoteActionCompatParcelizer != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            invoke.this.onSetPlaybackSpeed();
            return getShowPopup.INSTANCE;
        }

        onCommand(SampleVideos<? super onCommand> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return invoke.this.new onCommand(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onCommand) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.read != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            invoke.this.onSetRating();
            return getShowPopup.INSTANCE;
        }

        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(SampleVideos<? super MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return invoke.this.new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public void MediaBrowserCompatMediaItem() {
        isVisible.read readVar;
        hashCode hashcode = this.RemoteActionCompatParcelizer;
        if (hashcode != null && (readVar = this.MediaDescriptionCompat) != null) {
            hashcode.read(new isVisible.IconCompatParcelizer(readVar));
        }
        this.MediaDescriptionCompat = null;
        handleWeirdStringValue handleweirdstringvalue = this.MediaBrowserCompatSearchResultReceiver;
        if (handleweirdstringvalue != null) {
            handleweirdstringvalue.MediaBrowserCompatMediaItem();
        }
    }

    @Override // kotlin.objectIdGeneratorInstance
    public final boolean write(KeyEvent p0) {
        boolean z;
        onSetShuffleMode();
        long jIconCompatParcelizer = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
        if (this.MediaBrowserCompatItemReceiver && getLocalSavedStateRegistryOwner.write(p0)) {
            if (this.MediaMetadataCompat.RemoteActionCompatParcelizer(jIconCompatParcelizer)) {
                z = false;
            } else {
                setOverriddenInsets.read readVar = new setOverriddenInsets.read(this.handleMediaPlayPauseIfPendingOnHandler, null);
                this.MediaMetadataCompat.IconCompatParcelizer(jIconCompatParcelizer, readVar);
                if (this.RemoteActionCompatParcelizer != null) {
                    C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new MediaBrowserCompatSearchResultReceiver(readVar, null), 3);
                }
                z = true;
            }
            return IconCompatParcelizer(p0) || z;
        }
        if (this.MediaBrowserCompatItemReceiver && getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer(p0)) {
            setOverriddenInsets.read readVarIconCompatParcelizer = this.MediaMetadataCompat.IconCompatParcelizer(jIconCompatParcelizer);
            if (readVarIconCompatParcelizer != null) {
                if (this.RemoteActionCompatParcelizer != null) {
                    C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new MediaMetadataCompat(readVarIconCompatParcelizer, null), 3);
                }
                RemoteActionCompatParcelizer(p0);
            }
            if (readVarIconCompatParcelizer != null) {
                return true;
            }
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setOverriddenInsets.read AudioAttributesCompatParcelizer;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                hashCode hashcode = invoke.this.RemoteActionCompatParcelizer;
                if (hashcode != null) {
                    this.write = 1;
                    if (hashcode.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
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
        MediaBrowserCompatSearchResultReceiver(setOverriddenInsets.read readVar, SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = readVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return invoke.this.new MediaBrowserCompatSearchResultReceiver(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setOverriddenInsets.read AudioAttributesCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                hashCode hashcode = invoke.this.RemoteActionCompatParcelizer;
                if (hashcode != null) {
                    this.read = 1;
                    if (hashcode.RemoteActionCompatParcelizer(new setOverriddenInsets.write(this.AudioAttributesCompatParcelizer), this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
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
        MediaMetadataCompat(setOverriddenInsets.read readVar, SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = readVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return invoke.this.new MediaMetadataCompat(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        C0184keyDeserializers c0184keyDeserializers = this.IconCompatParcelizer;
        if (c0184keyDeserializers != null) {
            toMagicModuleMetaRepoModel.write(c0184keyDeserializers);
            MapperBuilder.write(getconfigoverride, c0184keyDeserializers.getWrite());
        }
        MapperBuilder.MediaBrowserCompatItemReceiver(getconfigoverride, this.AudioAttributesCompatParcelizer, new getCreatedOnDateMs() { // from class: o.AndroidComposeView
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(invoke.AudioAttributesImplApi26Parcelizer(this.read));
            }
        });
        if (this.MediaBrowserCompatItemReceiver) {
            this.AudioAttributesImplApi26Parcelizer.write(getconfigoverride);
        } else {
            MapperBuilder.write(getconfigoverride);
        }
        IconCompatParcelizer(getconfigoverride);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi26Parcelizer(invoke invokeVar) {
        invokeVar.AudioAttributesImplBaseParcelizer.invoke();
        return true;
    }

    protected final getShowPopup MediaBrowserCompatSearchResultReceiver() {
        handleWeirdStringValue handleweirdstringvalue = this.MediaBrowserCompatSearchResultReceiver;
        if (handleweirdstringvalue == null) {
            return null;
        }
        handleweirdstringvalue.RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    protected final void write(long p0, boolean p1) {
        hashCode hashcode = this.RemoteActionCompatParcelizer;
        if (hashcode != null) {
            setOverriddenInsets.read readVar = new setOverriddenInsets.read(p0, null);
            if (!onRewind()) {
                if (p1) {
                    this.onCommand = readVar;
                } else {
                    this.RatingCompat = readVar;
                }
                C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new MediaDescriptionCompat(hashcode, readVar, null), 3);
                return;
            }
            this.onFastForward = C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new MediaBrowserCompatCustomActionResultReceiver(hashcode, readVar, p1, this, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ hashCode AudioAttributesCompatParcelizer;
        final /* synthetic */ boolean IconCompatParcelizer;
        final /* synthetic */ setOverriddenInsets.read RemoteActionCompatParcelizer;
        int read;
        final /* synthetic */ invoke write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            if (r6.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(r6.RemoteActionCompatParcelizer, r6) == r0) goto L21;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L42
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L30
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                long r4 = kotlin.setFrameRateFromParent.AudioAttributesCompatParcelizer()
                r7 = r6
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r6.read = r3
                java.lang.Object r7 = kotlin.setCountry.IconCompatParcelizer(r4, r7)
                if (r7 == r0) goto L58
            L30:
                o.hashCode r7 = r6.AudioAttributesCompatParcelizer
                o.setOverriddenInsets$read r1 = r6.RemoteActionCompatParcelizer
                o.isRound r1 = (kotlin.isRound) r1
                r3 = r6
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r6.read = r2
                java.lang.Object r7 = r7.RemoteActionCompatParcelizer(r1, r3)
                if (r7 != r0) goto L42
                goto L58
            L42:
                boolean r7 = r6.IconCompatParcelizer
                if (r7 == 0) goto L4e
                o.invoke r7 = r6.write
                o.setOverriddenInsets$read r6 = r6.RemoteActionCompatParcelizer
                kotlin.invoke.RemoteActionCompatParcelizer(r7, r6)
                goto L55
            L4e:
                o.invoke r7 = r6.write
                o.setOverriddenInsets$read r6 = r6.RemoteActionCompatParcelizer
                kotlin.invoke.IconCompatParcelizer(r7, r6)
            L55:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L58:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.invoke.MediaBrowserCompatCustomActionResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(hashCode hashcode, setOverriddenInsets.read readVar, boolean z, invoke invokeVar, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = hashcode;
            this.RemoteActionCompatParcelizer = readVar;
            this.IconCompatParcelizer = z;
            this.write = invokeVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaDescriptionCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ setOverriddenInsets.read AudioAttributesCompatParcelizer;
        final /* synthetic */ hashCode IconCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
        MediaDescriptionCompat(hashCode hashcode, setOverriddenInsets.read readVar, SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = hashcode;
            this.AudioAttributesCompatParcelizer = readVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaDescriptionCompat(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaDescriptionCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    protected final void read(long p0, boolean p1) {
        hashCode hashcode = this.RemoteActionCompatParcelizer;
        if (hashcode != null) {
            setPassingYear setpassingyear = this.onFastForward;
            if (setpassingyear != null && setpassingyear.read()) {
                setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
                C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new AudioAttributesImplBaseParcelizer(setpassingyear, p0, hashcode, null), 3);
            } else {
                setOverriddenInsets.read readVar = p1 ? this.onCommand : this.RatingCompat;
                if (readVar != null) {
                    C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new AudioAttributesImplApi26Parcelizer(readVar, hashcode, null), 3);
                }
            }
            if (p1) {
                this.onCommand = null;
            } else {
                this.RatingCompat = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ long IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        final /* synthetic */ setPassingYear read;
        final /* synthetic */ hashCode write;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        
            if (r7.write.RemoteActionCompatParcelizer(r1, r7) != r0) goto L19;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r7.AudioAttributesCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L2a
                if (r1 == r5) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L69
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1e:
                java.lang.Object r1 = r7.RemoteActionCompatParcelizer
                o.setOverriddenInsets$write r1 = (o.setOverriddenInsets.write) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L57
            L26:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L3a
            L2a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                o.setPassingYear r8 = r7.read
                r1 = r7
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r7.AudioAttributesCompatParcelizer = r5
                java.lang.Object r8 = r8.a_(r1)
                if (r8 == r0) goto L6c
            L3a:
                o.setOverriddenInsets$read r8 = new o.setOverriddenInsets$read
                long r5 = r7.IconCompatParcelizer
                r8.<init>(r5, r4)
                o.setOverriddenInsets$write r1 = new o.setOverriddenInsets$write
                r1.<init>(r8)
                o.hashCode r5 = r7.write
                o.isRound r8 = (kotlin.isRound) r8
                r6 = r7
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r7.RemoteActionCompatParcelizer = r1
                r7.AudioAttributesCompatParcelizer = r3
                java.lang.Object r8 = r5.RemoteActionCompatParcelizer(r8, r6)
                if (r8 == r0) goto L6c
            L57:
                o.hashCode r8 = r7.write
                o.isRound r1 = (kotlin.isRound) r1
                r3 = r7
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r7.RemoteActionCompatParcelizer = r4
                r7.AudioAttributesCompatParcelizer = r2
                java.lang.Object r7 = r8.RemoteActionCompatParcelizer(r1, r3)
                if (r7 != r0) goto L69
                goto L6c
            L69:
                o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
                return r7
            L6c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.invoke.AudioAttributesImplBaseParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(setPassingYear setpassingyear, long j, hashCode hashcode, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = setpassingyear;
            this.IconCompatParcelizer = j;
            this.write = hashcode;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesImplBaseParcelizer(this.read, this.IconCompatParcelizer, this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ hashCode AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        final /* synthetic */ setOverriddenInsets.read write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setOverriddenInsets.write writeVar = new setOverriddenInsets.write(this.write);
                this.IconCompatParcelizer = 1;
                if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(writeVar, this) == objIconCompatParcelizer) {
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
        AudioAttributesImplApi26Parcelizer(setOverriddenInsets.read readVar, hashCode hashcode, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = readVar;
            this.AudioAttributesCompatParcelizer = hashcode;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesImplApi26Parcelizer(this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    protected final void write(boolean p0) {
        final hashCode hashcode = this.RemoteActionCompatParcelizer;
        if (hashcode != null) {
            setPassingYear setpassingyear = this.onFastForward;
            if (setpassingyear != null && setpassingyear.read()) {
                setPassingYear setpassingyear2 = this.onFastForward;
                if (setpassingyear2 != null) {
                    setpassingyear2.RemoteActionCompatParcelizer((CancellationException) null);
                }
            } else {
                setOverriddenInsets.read readVar = p0 ? this.onCommand : this.RatingCompat;
                if (readVar != null) {
                    final setOverriddenInsets.IconCompatParcelizer iconCompatParcelizer = new setOverriddenInsets.IconCompatParcelizer(readVar);
                    setPassingYear setpassingyear3 = (setPassingYear) MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getIconCompatParcelizer().get(setPassingYear.b_);
                    C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new MediaBrowserCompatItemReceiver(hashcode, iconCompatParcelizer, setpassingyear3 != null ? setpassingyear3.RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.getShowLayoutBounds
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return invoke.read(hashcode, iconCompatParcelizer, (Throwable) obj);
                        }
                    }) : null, null), 3);
                }
            }
            if (p0) {
                this.onCommand = null;
            } else {
                this.RatingCompat = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(hashCode hashcode, setOverriddenInsets.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        hashcode.read(iconCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ hashCode IconCompatParcelizer;
        final /* synthetic */ setYearOfPassout read;
        final /* synthetic */ setOverriddenInsets.IconCompatParcelizer write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.write, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            setYearOfPassout setyearofpassout = this.read;
            if (setyearofpassout != null) {
                setyearofpassout.write();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(hashCode hashcode, setOverriddenInsets.IconCompatParcelizer iconCompatParcelizer, setYearOfPassout setyearofpassout, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = hashcode;
            this.write = iconCompatParcelizer;
            this.read = setyearofpassout;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, this.write, this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ hashCode AudioAttributesCompatParcelizer;
        private /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ invoke AudioAttributesImplBaseParcelizer;
        final /* synthetic */ RemoteActionCompat IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ long read;
        boolean write;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            int AudioAttributesCompatParcelizer;
            final /* synthetic */ long IconCompatParcelizer;
            final /* synthetic */ invoke RemoteActionCompatParcelizer;
            final /* synthetic */ hashCode read;
            Object write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                setOverriddenInsets.read readVar;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    if (this.RemoteActionCompatParcelizer.onRewind()) {
                        this.AudioAttributesCompatParcelizer = 1;
                        if (setCountry.IconCompatParcelizer(setFrameRateFromParent.AudioAttributesCompatParcelizer(), this) != objIconCompatParcelizer) {
                        }
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        readVar = (setOverriddenInsets.read) this.write;
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.RemoteActionCompatParcelizer.RatingCompat = readVar;
                        return getShowPopup.INSTANCE;
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                setOverriddenInsets.read readVar2 = new setOverriddenInsets.read(this.IconCompatParcelizer, null);
                this.write = readVar2;
                this.AudioAttributesCompatParcelizer = 2;
                if (this.read.RemoteActionCompatParcelizer(readVar2, this) != objIconCompatParcelizer) {
                    readVar = readVar2;
                    this.RemoteActionCompatParcelizer.RatingCompat = readVar;
                    return getShowPopup.INSTANCE;
                }
                return objIconCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IconCompatParcelizer(invoke invokeVar, long j, hashCode hashcode, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = invokeVar;
                this.IconCompatParcelizer = j;
                this.read = hashcode;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
        
            if (r14.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(r1, r14) != r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
        
            if (r3.RemoteActionCompatParcelizer(r15, r14) == r0) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.invoke.AudioAttributesImplApi21Parcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(RemoteActionCompat remoteActionCompat, long j, hashCode hashcode, invoke invokeVar, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = remoteActionCompat;
            this.read = j;
            this.AudioAttributesCompatParcelizer = hashcode;
            this.AudioAttributesImplBaseParcelizer = invokeVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = new AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer, sampleVideos);
            audioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer = obj;
            return audioAttributesImplApi21Parcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    protected final Object IconCompatParcelizer(RemoteActionCompat remoteActionCompat, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer;
        hashCode hashcode = this.RemoteActionCompatParcelizer;
        return (hashcode == null || (objIconCompatParcelizer = College.IconCompatParcelizer(new AudioAttributesImplApi21Parcelizer(remoteActionCompat, j, hashcode, this, null), sampleVideos)) != getYear.IconCompatParcelizer()) ? getShowPopup.INSTANCE : objIconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onRewind() {
        return getLocalSavedStateRegistryOwner.read(this) || setFrameRateFromParent.read(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetPlaybackSpeed() {
        if (this.MediaDescriptionCompat == null) {
            isVisible.read readVar = new isVisible.read();
            hashCode hashcode = this.RemoteActionCompatParcelizer;
            if (hashcode != null) {
                C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new AudioAttributesCompatParcelizer(hashcode, readVar, null), 3);
            }
            this.MediaDescriptionCompat = readVar;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ isVisible.read AudioAttributesCompatParcelizer;
        final /* synthetic */ hashCode IconCompatParcelizer;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
        AudioAttributesCompatParcelizer(hashCode hashcode, isVisible.read readVar, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = hashcode;
            this.AudioAttributesCompatParcelizer = readVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetRating() {
        isVisible.read readVar = this.MediaDescriptionCompat;
        if (readVar != null) {
            isVisible.IconCompatParcelizer iconCompatParcelizer = new isVisible.IconCompatParcelizer(readVar);
            hashCode hashcode = this.RemoteActionCompatParcelizer;
            if (hashcode != null) {
                C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new IconCompatParcelizer(hashcode, iconCompatParcelizer, null), 3);
            }
            this.MediaDescriptionCompat = null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ isVisible.IconCompatParcelizer AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ hashCode write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (this.write.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
        IconCompatParcelizer(hashCode hashcode, isVisible.IconCompatParcelizer iconCompatParcelizer, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = hashcode;
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.createForPropertyOverride
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public Object getIconCompatParcelizer() {
        return this.onMediaButtonEvent;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Lo/invoke$RemoteActionCompatParcelizer;", "", "Lo/invoke;", "p0", "<init>", "(Lo/invoke;)V", "Lo/DatabindContext;", "Lo/_shapeForToken;", "p1", "Lkotlin/Function0;", "", "p2", "RemoteActionCompatParcelizer", "(Lo/DatabindContext;Lo/_shapeForToken;Lo/getCreatedOnDateMs;)V", "AudioAttributesCompatParcelizer", "()V", "IconCompatParcelizer", "Lo/invoke;", "read", "Lo/_colonConcat;", "Lo/_colonConcat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final invoke read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private _colonConcat RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(invoke invokeVar) {
            this.read = invokeVar;
        }

        public final void RemoteActionCompatParcelizer(DatabindContext p0, _shapeForToken p1, getCreatedOnDateMs<getShowPopup> p2) {
            int i = 0;
            if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
                _colonConcat _colonconcat = this.RemoteActionCompatParcelizer;
                if (_colonconcat == null) {
                    List<_colonConcat> listIconCompatParcelizer = p0.IconCompatParcelizer();
                    int size = listIconCompatParcelizer.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (getLocalSavedStateRegistryOwner.IconCompatParcelizer(listIconCompatParcelizer.get(i2))) {
                            _colonConcat _colonconcat2 = p0.IconCompatParcelizer().get(0);
                            this.RemoteActionCompatParcelizer = _colonconcat2;
                            this.read.write(_colonconcat2.getIconCompatParcelizer(), true);
                            _colonconcat2.IconCompatParcelizer();
                            return;
                        }
                    }
                    return;
                }
                List<_colonConcat> listIconCompatParcelizer2 = p0.IconCompatParcelizer();
                int size2 = listIconCompatParcelizer2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (getLocalSavedStateRegistryOwner.MediaBrowserCompatCustomActionResultReceiver(listIconCompatParcelizer2.get(i3))) {
                        if (Math.abs(getReferencedType.IconCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer(p0.IconCompatParcelizer().get(0).getIconCompatParcelizer(), _colonconcat.getIconCompatParcelizer()))) > ((CoercionConfig) MappingJsonFactory.write(this.read, getDefaultNullValueSerializer.onAddQueueItem())).RemoteActionCompatParcelizer()) {
                            AudioAttributesCompatParcelizer();
                            return;
                        }
                        return;
                    }
                }
                List<_colonConcat> listIconCompatParcelizer3 = p0.IconCompatParcelizer();
                int size3 = listIconCompatParcelizer3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    if (!getLocalSavedStateRegistryOwner.RemoteActionCompatParcelizer(listIconCompatParcelizer3.get(i4))) {
                        List<_colonConcat> listIconCompatParcelizer4 = p0.IconCompatParcelizer();
                        int size4 = listIconCompatParcelizer4.size();
                        while (i < size4) {
                            if (listIconCompatParcelizer4.get(i).getMediaBrowserCompatCustomActionResultReceiver()) {
                                AudioAttributesCompatParcelizer();
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                }
                p0.IconCompatParcelizer().get(0).IconCompatParcelizer();
                this.read.read(_colonconcat.getIconCompatParcelizer(), true);
                p2.invoke();
                this.RemoteActionCompatParcelizer = null;
                return;
            }
            if (p1 != _shapeForToken.read || this.RemoteActionCompatParcelizer == null) {
                return;
            }
            List<_colonConcat> listIconCompatParcelizer5 = p0.IconCompatParcelizer();
            int size5 = listIconCompatParcelizer5.size();
            while (i < size5) {
                _colonConcat _colonconcat3 = listIconCompatParcelizer5.get(i);
                if (_colonconcat3.getMediaBrowserCompatCustomActionResultReceiver() && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_colonconcat3, this.RemoteActionCompatParcelizer)) {
                    AudioAttributesCompatParcelizer();
                    return;
                }
                i++;
            }
        }

        public final void AudioAttributesCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer != null) {
                this.RemoteActionCompatParcelizer = null;
                this.read.write(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.invoke$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/invoke$read;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ invoke(hashCode hashcode, setParentLayoutDirection setparentlayoutdirection, boolean z, boolean z2, String str, C0184keyDeserializers c0184keyDeserializers, getCreatedOnDateMs getcreatedondatems, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(hashcode, setparentlayoutdirection, z, z2, str, c0184keyDeserializers, getcreatedondatems);
    }
}
