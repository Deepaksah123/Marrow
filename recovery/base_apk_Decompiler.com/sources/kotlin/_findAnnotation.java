package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B©\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J#\u0010)\u001a\u00020(*\u00020%2\u0006\u0010\u0005\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020\"*\u00020.H\u0016¢\u0006\u0004\b/\u00100R\"\u0010/\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010)\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010;\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b)\u00104\"\u0004\b)\u00106R\"\u0010:\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00102\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\"\u0010B\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00102\u001a\u0004\b@\u00104\"\u0004\bA\u00106R\"\u0010E\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u00102\u001a\u0004\bD\u00104\"\u0004\bE\u00106R\"\u00109\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u00102\u001a\u0004\bC\u00104\"\u0004\b:\u00106R\"\u0010A\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u00102\u001a\u0004\bH\u00104\"\u0004\b/\u00106R\"\u00105\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u00102\u001a\u0004\bJ\u00104\"\u0004\bB\u00106R\"\u0010>\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b>\u00104\"\u0004\b;\u00106R\"\u00101\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\b/\u0010OR\"\u0010F\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\b:\u0010TR\"\u0010X\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010U\u001a\u0004\b5\u0010V\"\u0004\b;\u0010WR$\u0010G\u001a\u0004\u0018\u00010\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010Y\u001a\u0004\b1\u0010Z\"\u0004\b)\u0010[R\"\u0010I\u001a\u00020\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010L\u001a\u0004\b/\u0010N\"\u0004\b:\u0010OR\"\u0010P\u001a\u00020\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010L\u001a\u0004\b]\u0010N\"\u0004\bB\u0010OR\"\u00107\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010^\u001a\u0004\bG\u0010_\"\u0004\b:\u0010`R\"\u0010C\u001a\u00020\u001c8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010^\u001a\u0004\b9\u0010_\"\u0004\bB\u0010`R$\u0010K\u001a\u0004\u0018\u00010\u001e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010a\u001a\u0004\bI\u0010b\"\u0004\b;\u0010cR\u0014\u0010\\\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010VR\u001a\u0010e\u001a\u00020\u00138\u0017X\u0097D¢\u0006\f\n\u0004\b>\u0010U\u001a\u0004\bd\u0010VR\"\u0010<\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\"0f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010h"}, d2 = {"Lo/_findAnnotation;", "Lo/_initForReading;", "Lo/hasIndex;", "Lo/_handleOddName$IconCompatParcelizer;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "Lo/findCreatorAnnotation;", "p10", "Lo/findAndAddVirtualProperties;", "p11", "", "p12", "Lo/parseVersionPart;", "p13", "Lo/switchToNext;", "p14", "p15", "Lo/Separators;", "p16", "Lo/createInstance;", "p17", "Lo/switchAndReturnNext;", "p18", "<init>", "(FFFFFFFFFFJLo/findAndAddVirtualProperties;ZLo/parseVersionPart;JJIILo/switchAndReturnNext;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "onSkipToQueueItem", "()V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "", "toString", "()Ljava/lang/String;", "Lo/getConfigOverride;", "write", "(Lo/getConfigOverride;)V", "MediaBrowserCompatMediaItem", "F", "onRewind", "()F", "MediaBrowserCompatItemReceiver", "(F)V", "onCommand", "onSetRepeatMode", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "onPlay", "onSkipToNext", "MediaBrowserCompatCustomActionResultReceiver", "onMediaButtonEvent", "onStop", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer", "onCustomAction", "onSetRating", "AudioAttributesImplBaseParcelizer", "MediaDescriptionCompat", "MediaMetadataCompat", "onSeekTo", "RatingCompat", "onRemoveQueueItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "J", "onSetPlaybackSpeed", "()J", "(J)V", "handleMediaPlayPauseIfPendingOnHandler", "Lo/findAndAddVirtualProperties;", "onSetCaptioningEnabled", "()Lo/findAndAddVirtualProperties;", "(Lo/findAndAddVirtualProperties;)V", "Z", "()Z", "(Z)V", "MediaBrowserCompatSearchResultReceiver", "Lo/parseVersionPart;", "()Lo/parseVersionPart;", "(Lo/parseVersionPart;)V", "onAddQueueItem", "onSetShuffleMode", "I", "()I", "(I)V", "Lo/switchAndReturnNext;", "()Lo/switchAndReturnNext;", "(Lo/switchAndReturnNext;)V", "j_", "onPause", "Lkotlin/Function1;", "Lo/validateAppend;", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _findAnnotation extends _handleOddName.IconCompatParcelizer implements _initForReading, hasIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private parseVersionPart MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private switchAndReturnNext MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super validateAppend, getShowPopup> onPlay;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private long RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean onPause;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int onCommand;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private float write;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private long MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private float AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private float MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int onCustomAction;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private findAndAddVirtualProperties MediaDescriptionCompat;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private long handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private float read;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private float IconCompatParcelizer;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private float MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean MediaBrowserCompatSearchResultReceiver;

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return false;
    }

    private _findAnnotation(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, findAndAddVirtualProperties findandaddvirtualproperties, boolean z, parseVersionPart parseversionpart, long j2, long j3, int i, int i2, switchAndReturnNext switchandreturnnext) {
        this.write = f;
        this.read = f2;
        this.RemoteActionCompatParcelizer = f3;
        this.AudioAttributesCompatParcelizer = f4;
        this.IconCompatParcelizer = f5;
        this.AudioAttributesImplBaseParcelizer = f6;
        this.AudioAttributesImplApi26Parcelizer = f7;
        this.AudioAttributesImplApi21Parcelizer = f8;
        this.MediaBrowserCompatItemReceiver = f9;
        this.MediaBrowserCompatCustomActionResultReceiver = f10;
        this.MediaBrowserCompatMediaItem = j;
        this.MediaDescriptionCompat = findandaddvirtualproperties;
        this.MediaBrowserCompatSearchResultReceiver = z;
        this.MediaMetadataCompat = parseversionpart;
        this.RatingCompat = j2;
        this.handleMediaPlayPauseIfPendingOnHandler = j3;
        this.onCommand = i;
        this.onCustomAction = i2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = switchandreturnnext;
        this.onPlay = new AnonymousClass1();
    }

    public final void MediaBrowserCompatItemReceiver(float f) {
        this.write = f;
    }

    /* JADX INFO: renamed from: onRewind, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    public final void AudioAttributesImplApi26Parcelizer(float f) {
        this.read = f;
    }

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    /* JADX INFO: renamed from: onSkipToNext, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesImplApi21Parcelizer(float f) {
        this.IconCompatParcelizer = f;
    }

    /* JADX INFO: renamed from: onStop, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesImplBaseParcelizer(float f) {
        this.AudioAttributesImplBaseParcelizer = f;
    }

    /* JADX INFO: renamed from: onSetRating, reason: from getter */
    public final float getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.AudioAttributesImplApi26Parcelizer = f;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final float getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: onSeekTo, reason: from getter */
    public final float getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void write(float f) {
        this.AudioAttributesImplApi21Parcelizer = f;
    }

    public final void IconCompatParcelizer(float f) {
        this.MediaBrowserCompatItemReceiver = f;
    }

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from getter */
    public final float getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final float getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = f;
    }

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from getter */
    public final long getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void write(long j) {
        this.MediaBrowserCompatMediaItem = j;
    }

    public final void AudioAttributesCompatParcelizer(findAndAddVirtualProperties findandaddvirtualproperties) {
        this.MediaDescriptionCompat = findandaddvirtualproperties;
    }

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from getter */
    public final findAndAddVirtualProperties getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver = z;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final parseVersionPart getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final void read(parseVersionPart parseversionpart) {
        this.MediaMetadataCompat = parseversionpart;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.RatingCompat = j;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getRatingCompat() {
        return this.RatingCompat;
    }

    public final void IconCompatParcelizer(long j) {
        this.handleMediaPlayPauseIfPendingOnHandler = j;
    }

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from getter */
    public final long getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.onCommand = i;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getOnCustomAction() {
        return this.onCustomAction;
    }

    public final void IconCompatParcelizer(int i) {
        this.onCustomAction = i;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final switchAndReturnNext getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final void RemoteActionCompatParcelizer(switchAndReturnNext switchandreturnnext) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = switchandreturnnext;
    }

    @Override // kotlin.hasIndex
    /* JADX INFO: renamed from: j_, reason: from getter */
    public final boolean getOnPause() {
        return this.onPause;
    }

    /* JADX INFO: renamed from: o._findAnnotation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/validateAppend;", "", "write", "(Lo/validateAppend;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<validateAppend, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(validateAppend validateappend) {
            write(validateappend);
            return getShowPopup.INSTANCE;
        }

        public final void write(validateAppend validateappend) {
            validateappend.MediaBrowserCompatSearchResultReceiver(_findAnnotation.this.getWrite());
            validateappend.MediaDescriptionCompat(_findAnnotation.this.getRead());
            validateappend.MediaBrowserCompatItemReceiver(_findAnnotation.this.getRemoteActionCompatParcelizer());
            validateappend.MediaBrowserCompatMediaItem(_findAnnotation.this.getAudioAttributesCompatParcelizer());
            validateappend.MediaMetadataCompat(_findAnnotation.this.getIconCompatParcelizer());
            validateappend.RatingCompat(_findAnnotation.this.getAudioAttributesImplBaseParcelizer());
            validateappend.AudioAttributesImplApi26Parcelizer(_findAnnotation.this.getAudioAttributesImplApi26Parcelizer());
            validateappend.MediaBrowserCompatCustomActionResultReceiver(_findAnnotation.this.getAudioAttributesImplApi21Parcelizer());
            validateappend.AudioAttributesImplBaseParcelizer(_findAnnotation.this.getMediaBrowserCompatItemReceiver());
            validateappend.AudioAttributesImplApi21Parcelizer(_findAnnotation.this.getMediaBrowserCompatCustomActionResultReceiver());
            validateappend.MediaBrowserCompatCustomActionResultReceiver(_findAnnotation.this.getMediaBrowserCompatMediaItem());
            validateappend.write(_findAnnotation.this.getMediaDescriptionCompat());
            validateappend.IconCompatParcelizer(_findAnnotation.this.getMediaBrowserCompatSearchResultReceiver());
            validateappend.IconCompatParcelizer(_findAnnotation.this.getMediaMetadataCompat());
            validateappend.AudioAttributesImplApi21Parcelizer(_findAnnotation.this.getRatingCompat());
            validateappend.AudioAttributesImplApi26Parcelizer(_findAnnotation.this.getHandleMediaPlayPauseIfPendingOnHandler());
            validateappend.IconCompatParcelizer(_findAnnotation.this.getOnCommand());
            validateappend.write(_findAnnotation.this.getOnCustomAction());
            validateappend.read(_findAnnotation.this.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        }

        AnonymousClass1() {
            super(1);
        }
    }

    public final void onSkipToQueueItem() {
        _newReader.AudioAttributesCompatParcelizer(this, this.onPlay);
    }

    /* JADX INFO: renamed from: o._findAnnotation$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "AudioAttributesCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ _parser $write;
        final /* synthetic */ _findAnnotation read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            AudioAttributesCompatParcelizer(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser.IconCompatParcelizer.read$default(iconCompatParcelizer, this.$write, 0, 0, BitmapDescriptorFactory.HUE_RED, this.read.onPlay, 4, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(_parser _parserVar, _findAnnotation _findannotation) {
            super(1);
            this.$write = _parserVar;
            this.read = _findannotation;
        }
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        _parser _parserVarWrite = istypeorsupertypeof.write(j);
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, _parserVarWrite.getRead(), _parserVarWrite.getRemoteActionCompatParcelizer(), null, new AnonymousClass5(_parserVarWrite, this), 4, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.write);
        sb.append(", scaleY=");
        sb.append(this.read);
        sb.append(", alpha = ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", translationX=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", translationY=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", shadowElevation=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", rotationX=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", rotationY=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", rotationZ=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", cameraDistance=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", transformOrigin=");
        sb.append((Object) findCreatorAnnotation.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatMediaItem));
        sb.append(", shape=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", clip=");
        sb.append(this.MediaBrowserCompatSearchResultReceiver);
        sb.append(", renderEffect=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", ambientShadowColor=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.RatingCompat));
        sb.append(", spotShadowColor=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.handleMediaPlayPauseIfPendingOnHandler));
        sb.append(", compositingStrategy=");
        sb.append((Object) Separators.RemoteActionCompatParcelizer(this.onCommand));
        sb.append(", blendMode=");
        sb.append((Object) createInstance.read(this.onCustomAction));
        sb.append(", colorFilter=");
        sb.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        if (_verifyNoLeadingZeroes.RatingCompat && this.MediaBrowserCompatSearchResultReceiver) {
            MapperBuilder.IconCompatParcelizer(getconfigoverride, this.MediaDescriptionCompat);
        }
    }

    public /* synthetic */ _findAnnotation(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, findAndAddVirtualProperties findandaddvirtualproperties, boolean z, parseVersionPart parseversionpart, long j2, long j3, int i, int i2, switchAndReturnNext switchandreturnnext, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, findandaddvirtualproperties, z, parseversionpart, j2, j3, i, i2, switchandreturnnext);
    }
}
