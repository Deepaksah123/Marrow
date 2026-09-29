package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.onReset;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u001c\"\u0004\b\u0013\u0010\u001dR$\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001a8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001c\"\u0004\b\u0010\u0010\u001dR$\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u001c\"\u0004\b\u000b\u0010\u001dR$\u0010%\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010$\"\u0004\b\u0011\u0010)R+\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010'\u001a\u0004\b\u001f\u0010$\"\u0004\b\u0015\u0010)R+\u0010*\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010'\u001a\u0004\b!\u0010$\"\u0004\b\u000b\u0010)R+\u0010&\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010'\u001a\u0004\b&\u0010$\"\u0004\b\u0013\u0010)R\"\u0010#\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b\u0016\u0010-\"\u0004\b\u0015\u0010.R\"\u0010!\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010,\u001a\u0004\b\u0013\u0010-\"\u0004\b\u0011\u0010.R(\u0010(\u001a\u0004\u0018\u00010/2\b\u0010\u0003\u001a\u0004\u0018\u00010/8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b%\u00101R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000203028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000206028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00105R+\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010'\u001a\u0004\b*\u0010-\"\u0004\b\u0010\u0010.R\"\u00104\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010,\u001a\u0004\b \u0010-\"\u0004\b\u000b\u0010."}, d2 = {"Lo/onReset;", "", "Lo/TopUserCompanion;", "p0", "Lo/buf;", "p1", "Lkotlin/Function0;", "", "p2", "<init>", "(Lo/TopUserCompanion;Lo/buf;Lo/getCreatedOnDateMs;)V", "write", "()V", "Lo/hasReferringProperties;", "", "(JZ)V", "read", "AudioAttributesCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "RemoteActionCompatParcelizer", "Lo/TopUserCompanion;", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/buf;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/getCreatedOnDateMs;", "Lo/SwitchCompat;", "", "Lo/SwitchCompat;", "(Lo/SwitchCompat;)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaMetadataCompat", "Z", "RatingCompat", "()Z", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatMediaItem", "Lo/InputAccessor;", "MediaDescriptionCompat", "(Z)V", "AudioAttributesImplApi21Parcelizer", "onAddQueueItem", "J", "()J", "(J)V", "Lo/hasAnyGetter;", "Lo/hasAnyGetter;", "()Lo/hasAnyGetter;", "Lo/LinearLayoutCompat;", "Lo/MenuPopupWindowMenuDropDownListView;", "onCommand", "Lo/LinearLayoutCompat;", "Lo/setHoverListener;", "onFastForward", "onCustomAction"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onReset {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final InputAccessor AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final buf read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private SwitchCompat<Float> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final InputAccessor AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final InputAccessor AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private SwitchCompat<hasReferringProperties> AudioAttributesCompatParcelizer;
    private hasAnyGetter MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private long onCommand;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final TopUserCompanion IconCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> write;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private long RatingCompat;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final LinearLayoutCompat<hasReferringProperties, MenuPopupWindowMenuDropDownListView> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final InputAccessor handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final LinearLayoutCompat<Float, setHoverListener> onAddQueueItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private SwitchCompat<Float> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int read = 8;
    private static final long IconCompatParcelizer = hasReferringProperties.read(9223372034707292159L);

    public onReset(TopUserCompanion topUserCompanion, buf bufVar, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.IconCompatParcelizer = topUserCompanion;
        this.read = bufVar;
        this.write = getcreatedondatems;
        Boolean bool = Boolean.FALSE;
        this.AudioAttributesImplApi26Parcelizer = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.AudioAttributesImplBaseParcelizer = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.AudioAttributesImplApi21Parcelizer = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        this.MediaBrowserCompatMediaItem = available.RemoteActionCompatParcelizer$default(bool, null, 2, null);
        long j = IconCompatParcelizer;
        this.RatingCompat = j;
        this.MediaMetadataCompat = hasReferringProperties.INSTANCE.write();
        this.MediaDescriptionCompat = bufVar != null ? bufVar.IconCompatParcelizer() : null;
        this.MediaBrowserCompatSearchResultReceiver = new LinearLayoutCompat<>(hasReferringProperties.write(hasReferringProperties.INSTANCE.write()), hitCount.read(hasReferringProperties.INSTANCE), null, null, 12, null);
        this.onAddQueueItem = new LinearLayoutCompat<>(Float.valueOf(1.0f), hitCount.RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1.INSTANCE), null, null, 12, null);
        this.handleMediaPlayPauseIfPendingOnHandler = available.RemoteActionCompatParcelizer$default(hasReferringProperties.write(hasReferringProperties.INSTANCE.write()), null, 2, null);
        this.onCommand = j;
    }

    public final void RemoteActionCompatParcelizer(SwitchCompat<Float> switchCompat) {
        this.RemoteActionCompatParcelizer = switchCompat;
    }

    public final void read(SwitchCompat<hasReferringProperties> switchCompat) {
        this.AudioAttributesCompatParcelizer = switchCompat;
    }

    public final void write(SwitchCompat<Float> switchCompat) {
        this.MediaBrowserCompatCustomActionResultReceiver = switchCompat;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean MediaDescriptionCompat() {
        return ((Boolean) this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesImplBaseParcelizer.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AudioAttributesImplBaseParcelizer() {
        return ((Boolean) this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(boolean z) {
        this.AudioAttributesImplApi21Parcelizer.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean MediaMetadataCompat() {
        return ((Boolean) this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatMediaItem.write(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean MediaBrowserCompatMediaItem() {
        return ((Boolean) this.MediaBrowserCompatMediaItem.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final long getRatingCompat() {
        return this.RatingCompat;
    }

    public final void IconCompatParcelizer(long j) {
        this.RatingCompat = j;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.MediaMetadataCompat = j;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final hasAnyGetter getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(long j) {
        this.handleMediaPlayPauseIfPendingOnHandler.write(hasReferringProperties.write(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long AudioAttributesImplApi21Parcelizer() {
        return ((hasReferringProperties) this.handleMediaPlayPauseIfPendingOnHandler.getRemoteActionCompatParcelizer()).getWrite();
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (onReset.this.MediaBrowserCompatSearchResultReceiver.read(hasReferringProperties.write(hasReferringProperties.INSTANCE.write()), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            onReset.this.read(hasReferringProperties.INSTANCE.write());
            onReset.this.AudioAttributesCompatParcelizer(false);
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return onReset.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void write() {
        if (MediaDescriptionCompat()) {
            C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, new MediaBrowserCompatCustomActionResultReceiver(null), 3);
        }
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final long getOnCommand() {
        return this.onCommand;
    }

    public final void write(long j) {
        this.onCommand = j;
    }

    public final void write(long p0, boolean p1) {
        SwitchCompat<hasReferringProperties> switchCompat = this.AudioAttributesCompatParcelizer;
        if (switchCompat == null) {
            return;
        }
        long jIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer(), p0);
        read(jIconCompatParcelizer);
        AudioAttributesCompatParcelizer(true);
        this.MediaBrowserCompatItemReceiver = p1;
        C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, new RemoteActionCompatParcelizer(switchCompat, jIconCompatParcelizer, null), 3);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ SwitchCompat<hasReferringProperties> IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;
        final /* synthetic */ long write;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
        
            if (kotlin.LinearLayoutCompat.AudioAttributesCompatParcelizer$default(r13.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver, kotlin.hasReferringProperties.write(r3), r1, null, new kotlin.rollbackContentChanged(r14, r3), r13, 4, null) != r0) goto L31;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r13.read
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.SdkPayloadData.IconCompatParcelizer(r14)     // Catch: java.util.concurrent.CancellationException -> Lbb
                goto Lb0
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L1b:
                java.lang.Object r1 = r13.RemoteActionCompatParcelizer
                o.SwitchCompat r1 = (kotlin.SwitchCompat) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r14)     // Catch: java.util.concurrent.CancellationException -> Lbb
                goto L6b
            L23:
                kotlin.SdkPayloadData.IconCompatParcelizer(r14)
                o.onReset r14 = kotlin.onReset.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.LinearLayoutCompat r14 = kotlin.onReset.IconCompatParcelizer(r14)     // Catch: java.util.concurrent.CancellationException -> Lbb
                boolean r14 = r14.MediaBrowserCompatItemReceiver()     // Catch: java.util.concurrent.CancellationException -> Lbb
                if (r14 == 0) goto L42
                o.SwitchCompat<o.hasReferringProperties> r14 = r13.IconCompatParcelizer     // Catch: java.util.concurrent.CancellationException -> Lbb
                boolean r1 = r14 instanceof kotlin.setNavigationOnClickListener     // Catch: java.util.concurrent.CancellationException -> Lbb
                if (r1 == 0) goto L3b
                o.setNavigationOnClickListener r14 = (kotlin.setNavigationOnClickListener) r14     // Catch: java.util.concurrent.CancellationException -> Lbb
                goto L3f
            L3b:
                o.setNavigationOnClickListener r14 = kotlin.startLoading.read()     // Catch: java.util.concurrent.CancellationException -> Lbb
            L3f:
                o.SwitchCompat r14 = (kotlin.SwitchCompat) r14     // Catch: java.util.concurrent.CancellationException -> Lbb
                goto L44
            L42:
                o.SwitchCompat<o.hasReferringProperties> r14 = r13.IconCompatParcelizer     // Catch: java.util.concurrent.CancellationException -> Lbb
            L44:
                r1 = r14
                o.onReset r14 = kotlin.onReset.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.LinearLayoutCompat r14 = kotlin.onReset.IconCompatParcelizer(r14)     // Catch: java.util.concurrent.CancellationException -> Lbb
                boolean r14 = r14.MediaBrowserCompatItemReceiver()     // Catch: java.util.concurrent.CancellationException -> Lbb
                if (r14 != 0) goto L74
                o.onReset r14 = kotlin.onReset.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.LinearLayoutCompat r14 = kotlin.onReset.IconCompatParcelizer(r14)     // Catch: java.util.concurrent.CancellationException -> Lbb
                long r4 = r13.write     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.hasReferringProperties r4 = kotlin.hasReferringProperties.write(r4)     // Catch: java.util.concurrent.CancellationException -> Lbb
                r5 = r13
                o.SampleVideos r5 = (kotlin.SampleVideos) r5     // Catch: java.util.concurrent.CancellationException -> Lbb
                r13.RemoteActionCompatParcelizer = r1     // Catch: java.util.concurrent.CancellationException -> Lbb
                r13.read = r3     // Catch: java.util.concurrent.CancellationException -> Lbb
                java.lang.Object r14 = r14.read(r4, r5)     // Catch: java.util.concurrent.CancellationException -> Lbb
                if (r14 != r0) goto L6b
                goto Laf
            L6b:
                o.onReset r14 = kotlin.onReset.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.getCreatedOnDateMs r14 = kotlin.onReset.AudioAttributesCompatParcelizer(r14)     // Catch: java.util.concurrent.CancellationException -> Lbb
                r14.invoke()     // Catch: java.util.concurrent.CancellationException -> Lbb
            L74:
                o.onReset r14 = kotlin.onReset.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.LinearLayoutCompat r14 = kotlin.onReset.IconCompatParcelizer(r14)     // Catch: java.util.concurrent.CancellationException -> Lbb
                java.lang.Object r14 = r14.MediaBrowserCompatCustomActionResultReceiver()     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.hasReferringProperties r14 = (kotlin.hasReferringProperties) r14     // Catch: java.util.concurrent.CancellationException -> Lbb
                long r3 = r14.getWrite()     // Catch: java.util.concurrent.CancellationException -> Lbb
                long r5 = r13.write     // Catch: java.util.concurrent.CancellationException -> Lbb
                long r3 = kotlin.hasReferringProperties.IconCompatParcelizer(r3, r5)     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.onReset r14 = kotlin.onReset.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.LinearLayoutCompat r5 = kotlin.onReset.IconCompatParcelizer(r14)     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.hasReferringProperties r6 = kotlin.hasReferringProperties.write(r3)     // Catch: java.util.concurrent.CancellationException -> Lbb
                r7 = r1
                o.setOrientation r7 = (kotlin.setOrientation) r7     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.onReset r14 = kotlin.onReset.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.rollbackContentChanged r9 = new o.rollbackContentChanged     // Catch: java.util.concurrent.CancellationException -> Lbb
                r9.<init>()     // Catch: java.util.concurrent.CancellationException -> Lbb
                r10 = r13
                o.SampleVideos r10 = (kotlin.SampleVideos) r10     // Catch: java.util.concurrent.CancellationException -> Lbb
                r14 = 0
                r13.RemoteActionCompatParcelizer = r14     // Catch: java.util.concurrent.CancellationException -> Lbb
                r13.read = r2     // Catch: java.util.concurrent.CancellationException -> Lbb
                r8 = 0
                r11 = 4
                r12 = 0
                java.lang.Object r14 = kotlin.LinearLayoutCompat.AudioAttributesCompatParcelizer$default(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.util.concurrent.CancellationException -> Lbb
                if (r14 != r0) goto Lb0
            Laf:
                return r0
            Lb0:
                o.onReset r14 = kotlin.onReset.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                r0 = 0
                kotlin.onReset.RemoteActionCompatParcelizer(r14, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
                o.onReset r13 = kotlin.onReset.this     // Catch: java.util.concurrent.CancellationException -> Lbb
                kotlin.onReset.write(r13, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
            Lbb:
                o.getShowPopup r13 = kotlin.getShowPopup.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onReset.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(onReset onreset, long j, LinearLayoutCompat linearLayoutCompat) {
            onreset.read(hasReferringProperties.IconCompatParcelizer(((hasReferringProperties) linearLayoutCompat.MediaBrowserCompatCustomActionResultReceiver()).getWrite(), j));
            onreset.write.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(SwitchCompat<hasReferringProperties> switchCompat, long j, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = switchCompat;
            this.write = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return onReset.this.new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void read() {
        hasAnyGetter hasanygetter = this.MediaDescriptionCompat;
        SwitchCompat<Float> switchCompat = this.RemoteActionCompatParcelizer;
        if (AudioAttributesImplBaseParcelizer() || switchCompat == null || hasanygetter == null) {
            if (MediaMetadataCompat()) {
                if (hasanygetter != null) {
                    hasanygetter.write(1.0f);
                }
                C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, new IconCompatParcelizer(null), 3);
                return;
            }
            return;
        }
        IconCompatParcelizer(true);
        boolean zMediaMetadataCompat = MediaMetadataCompat();
        if (!zMediaMetadataCompat) {
            hasanygetter.write(BitmapDescriptorFactory.HUE_RED);
        }
        C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, new read(!zMediaMetadataCompat, this, switchCompat, hasanygetter, null), 3);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (onReset.this.onAddQueueItem.read(QBankStatsResponse.write(1.0f), this) == objIconCompatParcelizer) {
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return onReset.this.new IconCompatParcelizer(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ onReset IconCompatParcelizer;
        final /* synthetic */ boolean RemoteActionCompatParcelizer;
        final /* synthetic */ SwitchCompat<Float> read;
        final /* synthetic */ hasAnyGetter write;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if (r13 == r0) goto L20;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r12.AudioAttributesCompatParcelizer
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)     // Catch: java.lang.Throwable -> L70
                goto L66
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)     // Catch: java.lang.Throwable -> L70
                goto L3d
            L1f:
                kotlin.SdkPayloadData.IconCompatParcelizer(r13)
                boolean r13 = r12.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L70
                if (r13 == 0) goto L3d
                o.onReset r13 = r12.IconCompatParcelizer     // Catch: java.lang.Throwable -> L70
                o.LinearLayoutCompat r13 = kotlin.onReset.read(r13)     // Catch: java.lang.Throwable -> L70
                r1 = 0
                java.lang.Float r1 = kotlin.QBankStatsResponse.write(r1)     // Catch: java.lang.Throwable -> L70
                r5 = r12
                o.SampleVideos r5 = (kotlin.SampleVideos) r5     // Catch: java.lang.Throwable -> L70
                r12.AudioAttributesCompatParcelizer = r4     // Catch: java.lang.Throwable -> L70
                java.lang.Object r13 = r13.read(r1, r5)     // Catch: java.lang.Throwable -> L70
                if (r13 != r0) goto L3d
                goto L65
            L3d:
                o.onReset r13 = r12.IconCompatParcelizer     // Catch: java.lang.Throwable -> L70
                o.LinearLayoutCompat r4 = kotlin.onReset.read(r13)     // Catch: java.lang.Throwable -> L70
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = kotlin.QBankStatsResponse.write(r13)     // Catch: java.lang.Throwable -> L70
                o.SwitchCompat<java.lang.Float> r13 = r12.read     // Catch: java.lang.Throwable -> L70
                r6 = r13
                o.setOrientation r6 = (kotlin.setOrientation) r6     // Catch: java.lang.Throwable -> L70
                o.hasAnyGetter r13 = r12.write     // Catch: java.lang.Throwable -> L70
                o.onReset r1 = r12.IconCompatParcelizer     // Catch: java.lang.Throwable -> L70
                o.onStartLoading r8 = new o.onStartLoading     // Catch: java.lang.Throwable -> L70
                r8.<init>()     // Catch: java.lang.Throwable -> L70
                r9 = r12
                o.SampleVideos r9 = (kotlin.SampleVideos) r9     // Catch: java.lang.Throwable -> L70
                r12.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Throwable -> L70
                r7 = 0
                r10 = 4
                r11 = 0
                java.lang.Object r13 = kotlin.LinearLayoutCompat.AudioAttributesCompatParcelizer$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L70
                if (r13 != r0) goto L66
            L65:
                return r0
            L66:
                o.LinearLayoutCompatLayoutParams r13 = (kotlin.LinearLayoutCompatLayoutParams) r13     // Catch: java.lang.Throwable -> L70
                o.onReset r12 = r12.IconCompatParcelizer
                kotlin.onReset.read(r12, r2)
                o.getShowPopup r12 = kotlin.getShowPopup.INSTANCE
                return r12
            L70:
                r13 = move-exception
                o.onReset r12 = r12.IconCompatParcelizer
                kotlin.onReset.read(r12, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onReset.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(hasAnyGetter hasanygetter, onReset onreset, LinearLayoutCompat linearLayoutCompat) {
            hasanygetter.write(((Number) linearLayoutCompat.MediaBrowserCompatCustomActionResultReceiver()).floatValue());
            onreset.write.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(boolean z, onReset onreset, SwitchCompat<Float> switchCompat, hasAnyGetter hasanygetter, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = z;
            this.IconCompatParcelizer = onreset;
            this.read = switchCompat;
            this.write = hasanygetter;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this.write, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        hasAnyGetter hasanygetter = this.MediaDescriptionCompat;
        SwitchCompat<Float> switchCompat = this.MediaBrowserCompatCustomActionResultReceiver;
        if (hasanygetter == null || MediaMetadataCompat() || switchCompat == null) {
            return;
        }
        write(true);
        C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, new write(switchCompat, hasanygetter, null), 3);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ hasAnyGetter IconCompatParcelizer;
        final /* synthetic */ SwitchCompat<Float> RemoteActionCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    LinearLayoutCompat linearLayoutCompat = onReset.this.onAddQueueItem;
                    Float fWrite = QBankStatsResponse.write(BitmapDescriptorFactory.HUE_RED);
                    SwitchCompat<Float> switchCompat = this.RemoteActionCompatParcelizer;
                    final hasAnyGetter hasanygetter = this.IconCompatParcelizer;
                    final onReset onreset = onReset.this;
                    this.read = 1;
                    if (LinearLayoutCompat.AudioAttributesCompatParcelizer$default(linearLayoutCompat, fWrite, switchCompat, null, new getAnswerMap() { // from class: o.reset
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj2) {
                            return onReset.write.read(hasanygetter, onreset, (LinearLayoutCompat) obj2);
                        }
                    }, this, 4, null) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                onReset.this.RemoteActionCompatParcelizer(true);
                onReset.this.write(false);
                return getShowPopup.INSTANCE;
            } catch (Throwable th) {
                onReset.this.write(false);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(hasAnyGetter hasanygetter, onReset onreset, LinearLayoutCompat linearLayoutCompat) {
            hasanygetter.write(((Number) linearLayoutCompat.MediaBrowserCompatCustomActionResultReceiver()).floatValue());
            onreset.write.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(SwitchCompat<Float> switchCompat, hasAnyGetter hasanygetter, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = switchCompat;
            this.IconCompatParcelizer = hasanygetter;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return onReset.this.new write(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        buf bufVar;
        if (MediaDescriptionCompat()) {
            AudioAttributesCompatParcelizer(false);
            C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, new AudioAttributesImplBaseParcelizer(null), 3);
        }
        if (AudioAttributesImplBaseParcelizer()) {
            IconCompatParcelizer(false);
            C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, new MediaBrowserCompatItemReceiver(null), 3);
        }
        if (MediaMetadataCompat()) {
            write(false);
            C0201setMcqCount.IconCompatParcelizer(this.IconCompatParcelizer, null, null, new AudioAttributesImplApi21Parcelizer(null), 3);
        }
        this.MediaBrowserCompatItemReceiver = false;
        read(hasReferringProperties.INSTANCE.write());
        this.RatingCompat = IconCompatParcelizer;
        hasAnyGetter hasanygetter = this.MediaDescriptionCompat;
        if (hasanygetter != null && (bufVar = this.read) != null) {
            bufVar.RemoteActionCompatParcelizer(hasanygetter);
        }
        this.MediaDescriptionCompat = null;
        this.RemoteActionCompatParcelizer = null;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.AudioAttributesCompatParcelizer = null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (onReset.this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(this) == objIconCompatParcelizer) {
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return onReset.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (onReset.this.onAddQueueItem.AudioAttributesCompatParcelizer(this) == objIconCompatParcelizer) {
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return onReset.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (onReset.this.onAddQueueItem.AudioAttributesCompatParcelizer(this) == objIconCompatParcelizer) {
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

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return onReset.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.onReset$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Lo/onReset$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/hasReferringProperties;", "IconCompatParcelizer", "J", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long IconCompatParcelizer() {
            return onReset.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
