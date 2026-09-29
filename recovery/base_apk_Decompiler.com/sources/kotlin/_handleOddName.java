package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000b\u0010\u000eJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H¦\u0004¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/_handleOddName;", "", "R", "p0", "Lkotlin/Function2;", "Lo/_handleOddName$RemoteActionCompatParcelizer;", "p1", "read", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "RemoteActionCompatParcelizer", "(Lo/getAnswerMap;)Z", "write", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;)Lo/_handleOddName;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _handleOddName {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.write;

    boolean RemoteActionCompatParcelizer(getAnswerMap<? super RemoteActionCompatParcelizer, Boolean> p0);

    <R> R read(R p0, MagicModuleSubmissionRequestBody<? super R, ? super RemoteActionCompatParcelizer, ? extends R> p1);

    boolean write(getAnswerMap<? super RemoteActionCompatParcelizer, Boolean> p0);

    default _handleOddName AudioAttributesCompatParcelizer(_handleOddName p0) {
        return p0 == INSTANCE ? this : new _skipYAMLComment(this, p0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\t2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/_handleOddName$RemoteActionCompatParcelizer;", "Lo/_handleOddName;", "R", "p0", "Lkotlin/Function2;", "p1", "read", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "RemoteActionCompatParcelizer", "(Lo/getAnswerMap;)Z", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer extends _handleOddName {
        @Override // kotlin._handleOddName
        default <R> R read(R p0, MagicModuleSubmissionRequestBody<? super R, ? super RemoteActionCompatParcelizer, ? extends R> p1) {
            return p1.invoke(p0, this);
        }

        @Override // kotlin._handleOddName
        default boolean RemoteActionCompatParcelizer(getAnswerMap<? super RemoteActionCompatParcelizer, Boolean> p0) {
            return p0.invoke(this).booleanValue();
        }

        @Override // kotlin._handleOddName
        default boolean write(getAnswerMap<? super RemoteActionCompatParcelizer, Boolean> p0) {
            return p0.invoke(this).booleanValue();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0007\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00008\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b\u0013\u0010%R\"\u0010\u0007\u001a\u00020 8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b&\u0010%R$\u0010\u0015\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b(\u0010\u0018\"\u0004\b\u0007\u0010\u0014R$\u0010*\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b)\u0010\u0018\"\u0004\b\u001c\u0010\u0014R$\u0010!\u001a\u0004\u0018\u00010+8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b\u001c\u00100R(\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R\"\u00109\u001a\u0002058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b4\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u000f\u001a\u0002058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u00106\u001a\u0004\b;\u00108\"\u0004\b4\u0010:R\u0016\u0010<\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u0016\u0010,\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u00106R$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u0013\u0010>\"\u0004\b\u001f\u0010\u0012R$\u0010=\u001a\u0002052\u0006\u0010\u0005\u001a\u0002058\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b*\u00106\u001a\u0004\b?\u00108R\u0014\u0010\u001d\u001a\u0002058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u00108"}, d2 = {"Lo/_handleOddName$IconCompatParcelizer;", "Lo/Module;", "<init>", "()V", "Lo/_bindAndClose;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/_bindAndClose;)V", "onPlayFromUri", "onRemoveQueueItemAt", "onPrepareFromUri", "onPrepare", "onPrepareFromSearch", "c_", "MediaDescriptionCompat", "p_", "Lkotlin/Function0;", "(Lo/getCreatedOnDateMs;)V", "read", "(Lo/_handleOddName$IconCompatParcelizer;)V", "MediaBrowserCompatItemReceiver", "Lo/_handleOddName$IconCompatParcelizer;", "onFastForward", "()Lo/_handleOddName$IconCompatParcelizer;", "Lo/TopUserCompanion;", "MediaMetadataCompat", "Lo/TopUserCompanion;", "AudioAttributesCompatParcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/TopUserCompanion;", "IconCompatParcelizer", "", "MediaBrowserCompatCustomActionResultReceiver", "I", "onMediaButtonEvent", "()I", "(I)V", "write", "onCommand", "onPause", "onAddQueueItem", "AudioAttributesImplBaseParcelizer", "Lo/_jsonNodeType;", "MediaBrowserCompatMediaItem", "Lo/_jsonNodeType;", "onPlayFromMediaId", "()Lo/_jsonNodeType;", "(Lo/_jsonNodeType;)V", "Lo/_bindAndClose;", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/_bindAndClose;", "AudioAttributesImplApi21Parcelizer", "", "Z", "onPlay", "()Z", "AudioAttributesImplApi26Parcelizer", "(Z)V", "onPlayFromSearch", "MediaBrowserCompatSearchResultReceiver", "RatingCompat", "Lo/getCreatedOnDateMs;", "onPrepareFromMediaId"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class IconCompatParcelizer implements Module {
        public static final int MediaBrowserCompatSearchResultReceiver = 8;

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private IconCompatParcelizer AudioAttributesImplBaseParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private boolean AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private boolean MediaBrowserCompatSearchResultReceiver;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private boolean RatingCompat;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private int write;

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
        private _jsonNodeType MediaBrowserCompatCustomActionResultReceiver;

        /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
        private boolean MediaDescriptionCompat;

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private IconCompatParcelizer MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
        private TopUserCompanion AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
        private boolean MediaBrowserCompatMediaItem;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private _bindAndClose AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private getCreatedOnDateMs<getShowPopup> MediaMetadataCompat;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private IconCompatParcelizer read = this;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private int RemoteActionCompatParcelizer = -1;

        public boolean AudioAttributesImplBaseParcelizer() {
            return true;
        }

        public void MediaDescriptionCompat() {
        }

        public void c_() {
        }

        public void p_() {
        }

        @Override // kotlin.Module
        /* JADX INFO: renamed from: onFastForward, reason: from getter */
        public final IconCompatParcelizer getRead() {
            return this.read;
        }

        public final TopUserCompanion MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            TopUserCompanion topUserCompanion = this.AudioAttributesCompatParcelizer;
            if (topUserCompanion != null) {
                return topUserCompanion;
            }
            IconCompatParcelizer iconCompatParcelizer = this;
            TopUserCompanion topUserCompanionAudioAttributesCompatParcelizer = College.AudioAttributesCompatParcelizer(collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer).getCoroutineContext().plus(getUserConfig.RemoteActionCompatParcelizer((setPassingYear) collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer).getCoroutineContext().get(setPassingYear.b_))));
            this.AudioAttributesCompatParcelizer = topUserCompanionAudioAttributesCompatParcelizer;
            return topUserCompanionAudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
        public final int getWrite() {
            return this.write;
        }

        public final void read(int i) {
            this.write = i;
        }

        /* JADX INFO: renamed from: onCommand, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void write(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        public final void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompatItemReceiver = iconCompatParcelizer;
        }

        /* JADX INFO: renamed from: onPause, reason: from getter */
        public final IconCompatParcelizer getMediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer;
        }

        /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
        public final IconCompatParcelizer getAudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(_jsonNodeType _jsonnodetype) {
            this.MediaBrowserCompatCustomActionResultReceiver = _jsonnodetype;
        }

        /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
        public final _jsonNodeType getMediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
        public final _bindAndClose getAudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final void AudioAttributesImplApi26Parcelizer(boolean z) {
            this.AudioAttributesImplApi26Parcelizer = z;
        }

        /* JADX INFO: renamed from: onPlay, reason: from getter */
        public final boolean getAudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final void AudioAttributesImplApi21Parcelizer(boolean z) {
            this.MediaDescriptionCompat = z;
        }

        /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
        public final boolean getMediaDescriptionCompat() {
            return this.MediaDescriptionCompat;
        }

        public final void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.MediaMetadataCompat = getcreatedondatems;
        }

        /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
        public final boolean getRatingCompat() {
            return this.RatingCompat;
        }

        public void RemoteActionCompatParcelizer(_bindAndClose p0) {
            this.AudioAttributesImplApi21Parcelizer = p0;
        }

        public void onPlayFromUri() {
            if (this.RatingCompat) {
                reportWrongTokenException.read("node attached multiple times");
            }
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                reportWrongTokenException.read("attach invoked on a node without a coordinator");
            }
            this.RatingCompat = true;
            this.MediaBrowserCompatSearchResultReceiver = true;
        }

        public void onRemoveQueueItemAt() {
            if (!this.RatingCompat) {
                reportWrongTokenException.read("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.MediaBrowserCompatSearchResultReceiver) {
                reportWrongTokenException.read("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.MediaBrowserCompatSearchResultReceiver = false;
            c_();
            this.MediaBrowserCompatMediaItem = true;
        }

        public void onPrepareFromUri() {
            if (!this.RatingCompat) {
                reportWrongTokenException.read("node detached multiple times");
            }
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                reportWrongTokenException.read("detach invoked on a node without a coordinator");
            }
            if (!this.MediaBrowserCompatMediaItem) {
                reportWrongTokenException.read("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.MediaBrowserCompatMediaItem = false;
            getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.MediaMetadataCompat;
            if (getcreatedondatems != null) {
                getcreatedondatems.invoke();
            }
            MediaDescriptionCompat();
        }

        public void onPrepare() {
            if (!this.RatingCompat) {
                reportWrongTokenException.read("Cannot detach a node that is not attached");
            }
            if (this.MediaBrowserCompatSearchResultReceiver) {
                reportWrongTokenException.read("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.MediaBrowserCompatMediaItem) {
                reportWrongTokenException.read("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.RatingCompat = false;
            TopUserCompanion topUserCompanion = this.AudioAttributesCompatParcelizer;
            if (topUserCompanion != null) {
                College.AudioAttributesCompatParcelizer(topUserCompanion, new _handleInvalidNumberStart());
                this.AudioAttributesCompatParcelizer = null;
            }
        }

        public void onPrepareFromSearch() {
            if (!this.RatingCompat) {
                reportWrongTokenException.read("reset() called on an unattached node");
            }
            p_();
        }

        public final void RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
            collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(this).IconCompatParcelizer(p0);
        }

        public void read(IconCompatParcelizer p0) {
            this.read = p0;
        }
    }

    /* JADX INFO: renamed from: o._handleOddName$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/_handleOddName$AudioAttributesCompatParcelizer;", "Lo/_handleOddName;", "<init>", "()V", "R", "p0", "Lkotlin/Function2;", "Lo/_handleOddName$RemoteActionCompatParcelizer;", "p1", "read", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "RemoteActionCompatParcelizer", "(Lo/getAnswerMap;)Z", "write", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;)Lo/_handleOddName;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements _handleOddName {
        static final /* synthetic */ Companion write = new Companion();

        @Override // kotlin._handleOddName
        public final _handleOddName AudioAttributesCompatParcelizer(_handleOddName p0) {
            return p0;
        }

        @Override // kotlin._handleOddName
        public final boolean RemoteActionCompatParcelizer(getAnswerMap<? super RemoteActionCompatParcelizer, Boolean> p0) {
            return false;
        }

        @Override // kotlin._handleOddName
        public final <R> R read(R p0, MagicModuleSubmissionRequestBody<? super R, ? super RemoteActionCompatParcelizer, ? extends R> p1) {
            return p0;
        }

        @Override // kotlin._handleOddName
        public final boolean write(getAnswerMap<? super RemoteActionCompatParcelizer, Boolean> p0) {
            return true;
        }

        private Companion() {
        }

        public final String toString() {
            return "Modifier";
        }
    }
}
