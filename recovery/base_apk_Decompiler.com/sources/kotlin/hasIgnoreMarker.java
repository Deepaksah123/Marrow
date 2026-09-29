package kotlin;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u001cH\u0016¢\u0006\u0004\b\u0017\u0010\u001fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b\u0017\u0010!J\u000f\u0010\u000f\u001a\u00020\"H\u0016¢\u0006\u0004\b\u000f\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010*R\u0014\u0010\u0014\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u00100\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R*\u0010B\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010?\u001a\u0004\b6\u0010@\"\u0004\b$\u0010AR*\u0010G\u001a\u00020C2\u0006\u0010\u0003\u001a\u00020C8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010D\u001a\u0004\b\u0017\u0010E\"\u0004\b\u000f\u0010FR.\u0010M\u001a\u0004\u0018\u00010H2\b\u0010\u0003\u001a\u0004\u0018\u00010H8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bG\u0010K\"\u0004\b\u000f\u0010LR$\u00107\u001a\u00020N2\u0006\u0010\u0003\u001a\u00020N8\u0016@WX\u0097\u000e¢\u0006\f\n\u0004\bO\u0010-\"\u0004\b\u000f\u0010PR*\u0010Q\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\bI\u0010@\"\u0004\b;\u0010AR*\u0010I\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b)\u0010?\u001a\u0004\bQ\u0010@\"\u0004\bG\u0010AR*\u00109\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bR\u0010?\u001a\u0004\b<\u0010@\"\u0004\b.\u0010AR*\u0010,\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bS\u0010?\u001a\u0004\bO\u0010@\"\u0004\bB\u0010AR*\u0010U\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bT\u0010?\u001a\u0004\b2\u0010@\"\u0004\b0\u0010AR*\u00102\u001a\u00020V2\u0006\u0010\u0003\u001a\u00020V8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010-\u001a\u0004\b\u0014\u0010W\"\u0004\b\u0014\u0010PR*\u0010O\u001a\u00020V2\u0006\u0010\u0003\u001a\u00020V8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010-\u001a\u0004\bU\u0010W\"\u0004\b$\u0010PR*\u0010<\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010?\u001a\u0004\b9\u0010@\"\u0004\b\u0017\u0010AR*\u0010)\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bX\u0010?\u001a\u0004\b7\u0010@\"\u0004\b\u000f\u0010AR*\u0010X\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b&\u0010?\u001a\u0004\bM\u0010@\"\u0004\b6\u0010AR*\u0010\u000b\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b6\u0010?\u001a\u0004\b0\u0010@\"\u0004\b\u0014\u0010AR*\u0010+\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020(8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b;\u0010=\u001a\u0004\bX\u0010*\"\u0004\b\u0014\u0010YR\u0016\u0010&\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010=R\u0016\u0010\u0011\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010=R.\u00105\u001a\u0004\u0018\u00010Z2\b\u0010\u0003\u001a\u0004\u0018\u00010Z8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bU\u0010[\u001a\u0004\bB\u0010\\\"\u0004\b6\u0010]R*\u0010S\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bM\u0010D\u001a\u0004\b;\u0010E\"\u0004\b\u0014\u0010FR\u001c\u0010R\u001a\u00020(8\u0016@\u0017X\u0097\u000e¢\u0006\f\n\u0004\bQ\u0010=\"\u0004\b$\u0010YR\u0014\u0010T\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*"}, d2 = {"Lo/hasIgnoreMarker;", "Lo/hasAsKey;", "", "p0", "Lo/createFlattened;", "p1", "Lo/findRenameByField;", "p2", "<init>", "(JLo/createFlattened;Lo/findRenameByField;)V", "", "onPause", "()V", "Landroid/graphics/RenderNode;", "Lo/hasAnySetter;", "IconCompatParcelizer", "(Landroid/graphics/RenderNode;I)V", "onPrepareFromMediaId", "", "Lo/getKey;", "write", "(IIJ)V", "Landroid/graphics/Outline;", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Outline;J)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "Lo/hasAnyGetter;", "Lkotlin/Function1;", "Lo/findSetterInfo;", "p3", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;Lo/hasAnyGetter;Lo/getAnswerMap;)V", "Lo/JsonParserDelegate;", "(Lo/JsonParserDelegate;)V", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "read", "Landroid/graphics/Paint;", "onPlay", "()Landroid/graphics/Paint;", "", "onMediaButtonEvent", "()Z", "onPlayFromMediaId", "onCustomAction", "J", "AudioAttributesImplApi26Parcelizer", "Lo/createFlattened;", "AudioAttributesImplApi21Parcelizer", "Lo/findRenameByField;", "handleMediaPlayPauseIfPendingOnHandler", "Landroid/graphics/RenderNode;", "Lo/calloc;", "onPlayFromSearch", "RemoteActionCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "Landroid/graphics/Paint;", "RatingCompat", "Landroid/graphics/Matrix;", "AudioAttributesImplBaseParcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Z", "", "F", "()F", "(F)V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/createInstance;", "I", "()I", "(I)V", "MediaBrowserCompatItemReceiver", "Lo/switchAndReturnNext;", "MediaDescriptionCompat", "Lo/switchAndReturnNext;", "()Lo/switchAndReturnNext;", "(Lo/switchAndReturnNext;)V", "MediaMetadataCompat", "Lo/getReferencedType;", "onAddQueueItem", "(J)V", "MediaBrowserCompatMediaItem", "onPrepareFromSearch", "onPrepare", "onPlayFromUri", "onCommand", "Lo/switchToNext;", "()J", "onFastForward", "(Z)V", "Lo/parseVersionPart;", "Lo/parseVersionPart;", "()Lo/parseVersionPart;", "(Lo/parseVersionPart;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasIgnoreMarker implements hasAsKey {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final findRenameByField read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final createFlattened AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean onPlayFromMediaId;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private long handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean onPrepareFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean onPlay;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean onPrepareFromSearch;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private Paint AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private switchAndReturnNext MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private int onPrepare;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private Matrix AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float onPause;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final RenderNode IconCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private long MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private parseVersionPart onPlayFromSearch;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private float onMediaButtonEvent;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private float MediaDescriptionCompat;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private float onFastForward;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private float MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private float onCommand;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private float onCustomAction;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private long onAddQueueItem;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private float RatingCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    public hasIgnoreMarker(long j, createFlattened createflattened, findRenameByField findrenamebyfield) {
        this.write = j;
        this.AudioAttributesCompatParcelizer = createflattened;
        this.read = findrenamebyfield;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.IconCompatParcelizer = renderNode;
        this.RemoteActionCompatParcelizer = calloc.INSTANCE.AudioAttributesCompatParcelizer();
        renderNode.setClipToBounds(false);
        IconCompatParcelizer(renderNode, hasAnySetter.INSTANCE.write());
        this.MediaBrowserCompatCustomActionResultReceiver = 1.0f;
        this.MediaBrowserCompatItemReceiver = createInstance.INSTANCE.onPrepare();
        this.MediaBrowserCompatSearchResultReceiver = getReferencedType.INSTANCE.read();
        this.MediaBrowserCompatMediaItem = 1.0f;
        this.MediaDescriptionCompat = 1.0f;
        this.handleMediaPlayPauseIfPendingOnHandler = switchToNext.INSTANCE.AudioAttributesCompatParcelizer();
        this.onAddQueueItem = switchToNext.INSTANCE.AudioAttributesCompatParcelizer();
        this.onPause = 8.0f;
        this.onPrepare = hasAnySetter.INSTANCE.write();
        this.onPrepareFromSearch = true;
    }

    public /* synthetic */ hasIgnoreMarker(long j, createFlattened createflattened, findRenameByField findrenamebyfield, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, (i & 2) != 0 ? new createFlattened() : createflattened, (i & 4) != 0 ? new findRenameByField() : findrenamebyfield);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.hasAsKey
    public final void read(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        this.IconCompatParcelizer.setAlpha(f);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.hasAsKey
    public final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompatItemReceiver = i;
        onPlay().setBlendMode(byteBufferLength.IconCompatParcelizer(i));
        onPrepareFromMediaId();
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final switchAndReturnNext getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.hasAsKey
    public final void IconCompatParcelizer(switchAndReturnNext switchandreturnnext) {
        this.MediaMetadataCompat = switchandreturnnext;
        onPlay().setColorFilter(switchandreturnnext != null ? releaseCharBuffer.RemoteActionCompatParcelizer(switchandreturnnext) : null);
        onPrepareFromMediaId();
    }

    @Override // kotlin.hasAsKey
    public final void IconCompatParcelizer(long j) {
        this.MediaBrowserCompatSearchResultReceiver = j;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.IconCompatParcelizer.resetPivot();
        } else {
            this.IconCompatParcelizer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.IconCompatParcelizer.setPivotY(Float.intBitsToFloat((int) j));
        }
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final float getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.hasAsKey
    public final void AudioAttributesImplBaseParcelizer(float f) {
        this.MediaBrowserCompatMediaItem = f;
        this.IconCompatParcelizer.setScaleX(f);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final float getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.hasAsKey
    public final void MediaBrowserCompatItemReceiver(float f) {
        this.MediaDescriptionCompat = f;
        this.IconCompatParcelizer.setScaleY(f);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final float getRatingCompat() {
        return this.RatingCompat;
    }

    @Override // kotlin.hasAsKey
    public final void AudioAttributesImplApi26Parcelizer(float f) {
        this.RatingCompat = f;
        this.IconCompatParcelizer.setTranslationX(f);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final float getOnCustomAction() {
        return this.onCustomAction;
    }

    @Override // kotlin.hasAsKey
    public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
        this.onCustomAction = f;
        this.IconCompatParcelizer.setTranslationY(f);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final float getOnCommand() {
        return this.onCommand;
    }

    @Override // kotlin.hasAsKey
    public final void AudioAttributesImplApi21Parcelizer(float f) {
        this.onCommand = f;
        this.IconCompatParcelizer.setElevation(f);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    @Override // kotlin.hasAsKey
    public final void write(long j) {
        this.handleMediaPlayPauseIfPendingOnHandler = j;
        this.IconCompatParcelizer.setAmbientShadowColor(RequestPayload.IconCompatParcelizer(j));
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final long getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    @Override // kotlin.hasAsKey
    public final void read(long j) {
        this.onAddQueueItem = j;
        this.IconCompatParcelizer.setSpotShadowColor(RequestPayload.IconCompatParcelizer(j));
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final float getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.hasAsKey
    public final void AudioAttributesCompatParcelizer(float f) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f;
        this.IconCompatParcelizer.setRotationX(f);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final float getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    @Override // kotlin.hasAsKey
    public final void IconCompatParcelizer(float f) {
        this.onMediaButtonEvent = f;
        this.IconCompatParcelizer.setRotationY(f);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final float getOnFastForward() {
        return this.onFastForward;
    }

    @Override // kotlin.hasAsKey
    public final void RemoteActionCompatParcelizer(float f) {
        this.onFastForward = f;
        this.IconCompatParcelizer.setRotationZ(f);
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final float getOnPause() {
        return this.onPause;
    }

    @Override // kotlin.hasAsKey
    public final void write(float f) {
        this.onPause = f;
        this.IconCompatParcelizer.setCameraDistance(f);
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final boolean getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    @Override // kotlin.hasAsKey
    public final void write(boolean z) {
        this.onPlayFromMediaId = z;
        onPause();
    }

    private final void onPause() {
        boolean z = false;
        boolean z2 = getOnPlayFromMediaId() && !this.AudioAttributesImplApi21Parcelizer;
        if (getOnPlayFromMediaId() && this.AudioAttributesImplApi21Parcelizer) {
            z = true;
        }
        if (z2 != this.onPlay) {
            this.onPlay = z2;
            this.IconCompatParcelizer.setClipToBounds(z2);
        }
        if (z != this.onPrepareFromMediaId) {
            this.onPrepareFromMediaId = z;
            this.IconCompatParcelizer.setClipToOutline(z);
        }
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final parseVersionPart getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    @Override // kotlin.hasAsKey
    public final void RemoteActionCompatParcelizer(parseVersionPart parseversionpart) {
        this.onPlayFromSearch = parseversionpart;
        if (Build.VERSION.SDK_INT >= 31) {
            isTypeId.INSTANCE.read(this.IconCompatParcelizer, parseversionpart);
        }
    }

    @Override // kotlin.hasAsKey
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getOnPrepare() {
        return this.onPrepare;
    }

    @Override // kotlin.hasAsKey
    public final void write(int i) {
        this.onPrepare = i;
        onPrepareFromMediaId();
    }

    private final void IconCompatParcelizer(RenderNode renderNode, int i) {
        if (hasAnySetter.read(i, hasAnySetter.INSTANCE.AudioAttributesCompatParcelizer())) {
            renderNode.setUseCompositingLayer(true, this.AudioAttributesImplApi26Parcelizer);
            renderNode.setHasOverlappingRendering(true);
        } else if (hasAnySetter.read(i, hasAnySetter.INSTANCE.read())) {
            renderNode.setUseCompositingLayer(false, this.AudioAttributesImplApi26Parcelizer);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.AudioAttributesImplApi26Parcelizer);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void onPrepareFromMediaId() {
        if (onMediaButtonEvent()) {
            IconCompatParcelizer(this.IconCompatParcelizer, hasAnySetter.INSTANCE.AudioAttributesCompatParcelizer());
        } else {
            IconCompatParcelizer(this.IconCompatParcelizer, getOnPrepare());
        }
    }

    @Override // kotlin.hasAsKey
    public final void write(int p0, int p1, long p2) {
        long j = -1;
        this.IconCompatParcelizer.setPosition(p0, p1, ((int) (p2 >> 32)) + p0, ((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & p2)) + p1);
        this.RemoteActionCompatParcelizer = SetterlessProperty.AudioAttributesCompatParcelizer(p2);
    }

    @Override // kotlin.hasAsKey
    public final void AudioAttributesCompatParcelizer(Outline p0, long p1) {
        this.IconCompatParcelizer.setOutline(p0);
        this.AudioAttributesImplApi21Parcelizer = p0 != null;
        onPause();
    }

    @Override // kotlin.hasAsKey
    public final void read(boolean z) {
        this.onPrepareFromSearch = z;
    }

    @Override // kotlin.hasAsKey
    public final void AudioAttributesCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1, hasAnyGetter p2, getAnswerMap<? super findSetterInfo, getShowPopup> p3) {
        RecordingCanvas recordingCanvasBeginRecording = this.IconCompatParcelizer.beginRecording();
        try {
            createFlattened createflattened = this.AudioAttributesCompatParcelizer;
            Canvas canvas = createflattened.getIconCompatParcelizer().getRead();
            createflattened.getIconCompatParcelizer().write(recordingCanvasBeginRecording);
            charBufferLength iconCompatParcelizer = createflattened.getIconCompatParcelizer();
            findSerializationTyping iconCompatParcelizer2 = this.read.getIconCompatParcelizer();
            iconCompatParcelizer2.AudioAttributesCompatParcelizer(p0);
            iconCompatParcelizer2.AudioAttributesCompatParcelizer(p1);
            iconCompatParcelizer2.write(p2);
            iconCompatParcelizer2.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            iconCompatParcelizer2.AudioAttributesCompatParcelizer(iconCompatParcelizer);
            p3.invoke(this.read);
            createflattened.getIconCompatParcelizer().write(canvas);
            this.IconCompatParcelizer.endRecording();
            read(false);
        } catch (Throwable th) {
            this.IconCompatParcelizer.endRecording();
            throw th;
        }
    }

    @Override // kotlin.hasAsKey
    public final void AudioAttributesCompatParcelizer(JsonParserDelegate p0) {
        balloc.RemoteActionCompatParcelizer(p0).drawRenderNode(this.IconCompatParcelizer);
    }

    @Override // kotlin.hasAsKey
    public final Matrix IconCompatParcelizer() {
        Matrix matrix = this.AudioAttributesImplBaseParcelizer;
        if (matrix == null) {
            matrix = new Matrix();
            this.AudioAttributesImplBaseParcelizer = matrix;
        }
        this.IconCompatParcelizer.getMatrix(matrix);
        return matrix;
    }

    @Override // kotlin.hasAsKey
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer.hasDisplayList();
    }

    @Override // kotlin.hasAsKey
    public final void read() {
        this.IconCompatParcelizer.discardDisplayList();
    }

    private final Paint onPlay() {
        Paint paint = this.AudioAttributesImplApi26Parcelizer;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.AudioAttributesImplApi26Parcelizer = paint2;
        return paint2;
    }

    private final boolean onMediaButtonEvent() {
        return hasAnySetter.read(getOnPrepare(), hasAnySetter.INSTANCE.AudioAttributesCompatParcelizer()) || onPlayFromMediaId() || getOnPlayFromSearch() != null;
    }

    private final boolean onPlayFromMediaId() {
        return (createInstance.IconCompatParcelizer(getMediaBrowserCompatItemReceiver(), createInstance.INSTANCE.onPrepare()) && getMediaMetadataCompat() == null) ? false : true;
    }
}
