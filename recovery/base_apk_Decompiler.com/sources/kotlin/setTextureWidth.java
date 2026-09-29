package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CancellationException;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.setTextureWidth;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001aB9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0012\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u00162\b\b\u0002\u0010\u0006\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\u001dJ\u001f\u0010\u0012\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020 H\u0002¢\u0006\u0004\b\u0012\u0010#J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0013J'\u0010$\u001a\u00020\t*\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u001c2\b\b\u0002\u0010\b\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010%J'\u0010\u0012\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020 H\u0002¢\u0006\u0004\b\u0012\u0010'J\u001c\u0010\u001a\u001a\u00020(*\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001cH\u0082\u0002¢\u0006\u0004\b\u001a\u0010)J\u001c\u0010$\u001a\u00020(*\u00020*2\u0006\u0010\u0006\u001a\u00020*H\u0082\u0002¢\u0006\u0004\b$\u0010)J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0017\u0010+R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00101R\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00102R\u001a\u00104\u001a\u00020\t8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\b/\u00103R\u0014\u0010\u0014\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u00106R\u0018\u0010,\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00100R\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R$\u00109\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u001c8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b\u0017\u0010;R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00100"}, d2 = {"Lo/setTextureWidth;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/SpliceCommand;", "Lo/getLongMask;", "Lo/_writeCloseable;", "Lo/superDispatchKeyEvent;", "p0", "Lo/registerReceiver;", "p1", "", "p2", "Lo/MotionTelltales;", "p3", "Lkotlin/Function0;", "Lo/WritableTypeIdInclusion;", "p4", "<init>", "(Lo/superDispatchKeyEvent;Lo/registerReceiver;ZLo/MotionTelltales;Lo/getCreatedOnDateMs;)V", "read", "(Lo/WritableTypeIdInclusion;)Lo/WritableTypeIdInclusion;", "AudioAttributesImplApi21Parcelizer", "()Lo/MotionTelltales;", "", "write", "(Lo/getCreatedOnDateMs;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/isAbstract;", "AudioAttributesCompatParcelizer", "(Lo/isAbstract;)V", "Lo/getKey;", "(J)V", "MediaBrowserCompatItemReceiver", "()Lo/WritableTypeIdInclusion;", "Lo/hasReferringProperties;", "IconCompatParcelizer", "", "(Lo/MotionTelltales;J)F", "RemoteActionCompatParcelizer", "(Lo/WritableTypeIdInclusion;JJ)Z", "Lo/getReferencedType;", "(Lo/WritableTypeIdInclusion;JJ)J", "", "(JJ)I", "Lo/calloc;", "(Lo/superDispatchKeyEvent;ZLo/MotionTelltales;)V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/superDispatchKeyEvent;", "Lo/registerReceiver;", "AudioAttributesImplBaseParcelizer", "Z", "Lo/MotionTelltales;", "Lo/getCreatedOnDateMs;", "()Z", "AudioAttributesImplApi26Parcelizer", "Lo/setTextOutlineThickness;", "Lo/setTextOutlineThickness;", "Lo/isAbstract;", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "J", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTextureWidth extends _handleOddName.IconCompatParcelizer implements SpliceCommand, getLongMask, _writeCloseable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<WritableTypeIdInclusion> read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final registerReceiver IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private MotionTelltales write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private superDispatchKeyEvent AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private isAbstract MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setTextOutlineThickness AudioAttributesImplApi21Parcelizer = new setTextOutlineThickness();
    private long MediaMetadataCompat = getKey.INSTANCE.RemoteActionCompatParcelizer();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[superDispatchKeyEvent.values().length];
            try {
                iArr[superDispatchKeyEvent.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[superDispatchKeyEvent.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            read = iArr;
        }
    }

    public setTextureWidth(superDispatchKeyEvent superdispatchkeyevent, registerReceiver registerreceiver, boolean z, MotionTelltales motionTelltales, getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems) {
        this.AudioAttributesCompatParcelizer = superdispatchkeyevent;
        this.IconCompatParcelizer = registerreceiver;
        this.RemoteActionCompatParcelizer = z;
        this.write = motionTelltales;
        this.read = getcreatedondatems;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.SpliceCommand
    public final WritableTypeIdInclusion read(WritableTypeIdInclusion p0) {
        if (getKey.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
            getRootStableInsets.AudioAttributesCompatParcelizer("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return IconCompatParcelizer(p0);
    }

    private final MotionTelltales AudioAttributesImplApi21Parcelizer() {
        MotionTelltales motionTelltales = this.write;
        return motionTelltales == null ? (MotionTelltales) MappingJsonFactory.write(this, Barrier.AudioAttributesCompatParcelizer()) : motionTelltales;
    }

    @Override // kotlin.SpliceCommand
    public final Object write(getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems, SampleVideos<? super getShowPopup> sampleVideos) {
        WritableTypeIdInclusion writableTypeIdInclusionInvoke = getcreatedondatems.invoke();
        if (writableTypeIdInclusionInvoke == null || RemoteActionCompatParcelizer$default(this, writableTypeIdInclusionInvoke, 0L, 0L, 3, null)) {
            return getShowPopup.INSTANCE;
        }
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        if (this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(new AudioAttributesCompatParcelizer(getcreatedondatems, setstatesolvedcount)) && !this.MediaBrowserCompatMediaItem) {
            IconCompatParcelizer$default(this, 0L, 1, null);
        }
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(isAbstract p0) {
        WritableTypeIdInclusion writableTypeIdInclusionMediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatCustomActionResultReceiver = p0;
        if (this.MediaBrowserCompatItemReceiver && (writableTypeIdInclusionMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver()) != null && !RemoteActionCompatParcelizer$default(this, writableTypeIdInclusionMediaBrowserCompatItemReceiver, this.MediaMetadataCompat, 0L, 2, null)) {
            this.AudioAttributesImplBaseParcelizer = true;
            IconCompatParcelizer$default(this, 0L, 1, null);
        }
        this.MediaBrowserCompatItemReceiver = false;
    }

    @Override // kotlin._writeCloseable
    public final void AudioAttributesCompatParcelizer(long p0) {
        long jWrite;
        if (!getDesignInfoListui_tooling.AudioAttributesImplBaseParcelizer) {
            read(p0);
            return;
        }
        long j = this.MediaMetadataCompat;
        this.MediaMetadataCompat = p0;
        if (AudioAttributesCompatParcelizer(p0, j) < 0) {
            if (!this.RemoteActionCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == superDispatchKeyEvent.write) {
                    long j2 = -1;
                    jWrite = hasReferringProperties.read(((long) (((int) j) - ((int) p0))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))));
                } else {
                    jWrite = hasReferringProperties.read(((long) (((int) (j >> 32)) - ((int) (p0 >> 32)))) << 32);
                }
            } else {
                jWrite = hasReferringProperties.INSTANCE.write();
            }
            WritableTypeIdInclusion writableTypeIdInclusionInvoke = this.read.invoke();
            if (writableTypeIdInclusionInvoke == null || this.MediaBrowserCompatMediaItem || this.AudioAttributesImplBaseParcelizer || !RemoteActionCompatParcelizer$default(this, writableTypeIdInclusionInvoke, j, 0L, 2, null) || RemoteActionCompatParcelizer$default(this, writableTypeIdInclusionInvoke, 0L, jWrite, 1, null)) {
                return;
            }
            this.AudioAttributesImplBaseParcelizer = true;
            IconCompatParcelizer(jWrite);
        }
    }

    private final void read(long p0) {
        WritableTypeIdInclusion writableTypeIdInclusionMediaBrowserCompatItemReceiver;
        long j = this.MediaMetadataCompat;
        this.MediaMetadataCompat = p0;
        if (AudioAttributesCompatParcelizer(p0, j) >= 0 || this.MediaBrowserCompatMediaItem || this.AudioAttributesImplBaseParcelizer || (writableTypeIdInclusionMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver()) == null || !RemoteActionCompatParcelizer$default(this, writableTypeIdInclusionMediaBrowserCompatItemReceiver, j, 0L, 2, null)) {
            return;
        }
        this.MediaBrowserCompatItemReceiver = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableTypeIdInclusion MediaBrowserCompatItemReceiver() {
        if (getDesignInfoListui_tooling.AudioAttributesImplBaseParcelizer) {
            return this.read.invoke();
        }
        if (!getRatingCompat()) {
            return null;
        }
        isAbstract isabstractAudioAttributesImplApi21Parcelizer = collectLongDefaults.AudioAttributesImplApi21Parcelizer(this);
        isAbstract isabstract = this.MediaBrowserCompatCustomActionResultReceiver;
        if (isabstract != null) {
            if (!isabstract.MediaBrowserCompatItemReceiver()) {
                isabstract = null;
            }
            if (isabstract != null) {
                return isabstractAudioAttributesImplApi21Parcelizer.write(isabstract, false);
            }
        }
        return null;
    }

    static /* synthetic */ void IconCompatParcelizer$default(setTextureWidth settexturewidth, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = hasReferringProperties.INSTANCE.write();
        }
        settexturewidth.IconCompatParcelizer(j);
    }

    private final void IconCompatParcelizer(long p0) {
        MotionTelltales motionTelltalesAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (this.MediaBrowserCompatMediaItem) {
            getRootStableInsets.AudioAttributesCompatParcelizer("launchAnimation called when previous animation was running");
        }
        C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, getCollegeName.AudioAttributesCompatParcelizer, new IconCompatParcelizer(new onInitializeAccessibilityEvent(AudioAttributesImplApi21Parcelizer().IconCompatParcelizer()), motionTelltalesAudioAttributesImplApi21Parcelizer, p0, null), 1);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ onInitializeAccessibilityEvent AudioAttributesCompatParcelizer;
        private /* synthetic */ Object MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ MotionTelltales read;
        final /* synthetic */ long write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            try {
                try {
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        setPassingYear setpassingyearRemoteActionCompatParcelizer = getUserConfig.RemoteActionCompatParcelizer(((TopUserCompanion) this.MediaBrowserCompatItemReceiver).getIconCompatParcelizer());
                        setTextureWidth.this.MediaBrowserCompatMediaItem = true;
                        this.RemoteActionCompatParcelizer = 1;
                        if (setTextureWidth.this.IconCompatParcelizer.read(Flow.read, new AnonymousClass1(this.AudioAttributesCompatParcelizer, setTextureWidth.this, this.read, this.write, setpassingyearRemoteActionCompatParcelizer, null), this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    setTextureWidth.this.AudioAttributesImplApi21Parcelizer.read();
                    setTextureWidth.this.MediaBrowserCompatMediaItem = false;
                    setTextureWidth.this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(null);
                    setTextureWidth.this.AudioAttributesImplBaseParcelizer = false;
                    return getShowPopup.INSTANCE;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                setTextureWidth.this.MediaBrowserCompatMediaItem = false;
                setTextureWidth.this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer((Throwable) null);
                setTextureWidth.this.AudioAttributesImplBaseParcelizer = false;
                throw th;
            }
        }

        /* JADX INFO: renamed from: o.setTextureWidth$IconCompatParcelizer$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<shouldSkipDump, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ MotionTelltales AudioAttributesCompatParcelizer;
            final /* synthetic */ setTextureWidth AudioAttributesImplApi26Parcelizer;
            private /* synthetic */ Object AudioAttributesImplBaseParcelizer;
            final /* synthetic */ onInitializeAccessibilityEvent IconCompatParcelizer;
            final /* synthetic */ setPassingYear RemoteActionCompatParcelizer;
            final /* synthetic */ long read;
            int write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.write;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    final shouldSkipDump shouldskipdump = (shouldSkipDump) this.AudioAttributesImplBaseParcelizer;
                    this.IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.read(this.AudioAttributesCompatParcelizer, this.read));
                    final onInitializeAccessibilityEvent oninitializeaccessibilityevent = this.IconCompatParcelizer;
                    final setTextureWidth settexturewidth = this.AudioAttributesImplApi26Parcelizer;
                    final setPassingYear setpassingyear = this.RemoteActionCompatParcelizer;
                    getAnswerMap<? super Float, getShowPopup> getanswermap = new getAnswerMap() { // from class: o.setMargin
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj2) {
                            return setTextureWidth.IconCompatParcelizer.AnonymousClass1.AudioAttributesCompatParcelizer(settexturewidth, oninitializeaccessibilityevent, setpassingyear, shouldskipdump, ((Float) obj2).floatValue());
                        }
                    };
                    final setTextureWidth settexturewidth2 = this.AudioAttributesImplApi26Parcelizer;
                    final onInitializeAccessibilityEvent oninitializeaccessibilityevent2 = this.IconCompatParcelizer;
                    final MotionTelltales motionTelltales = this.AudioAttributesCompatParcelizer;
                    this.write = 1;
                    if (oninitializeaccessibilityevent.read(getanswermap, new getCreatedOnDateMs() { // from class: o.setReferencedIds
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return setTextureWidth.IconCompatParcelizer.AnonymousClass1.AudioAttributesCompatParcelizer(settexturewidth2, oninitializeaccessibilityevent2, motionTelltales);
                        }
                    }, this) == objIconCompatParcelizer) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup AudioAttributesCompatParcelizer(setTextureWidth settexturewidth, onInitializeAccessibilityEvent oninitializeaccessibilityevent, setPassingYear setpassingyear, shouldSkipDump shouldskipdump, float f) {
                float f2 = settexturewidth.RemoteActionCompatParcelizer ? 1.0f : -1.0f;
                registerReceiver registerreceiver = settexturewidth.IconCompatParcelizer;
                float fIconCompatParcelizer = f2 * registerreceiver.IconCompatParcelizer(registerreceiver.write(shouldskipdump.write(registerreceiver.write(registerreceiver.RemoteActionCompatParcelizer(f2 * f)), findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer())));
                if (Math.abs(fIconCompatParcelizer) < Math.abs(f)) {
                    StringBuilder sb = new StringBuilder("Scroll animation cancelled because scroll was not consumed (");
                    sb.append(fIconCompatParcelizer);
                    sb.append(" < ");
                    sb.append(f);
                    sb.append(')');
                    getUserConfig.RemoteActionCompatParcelizer(setpassingyear, sb.toString(), null);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup AudioAttributesCompatParcelizer(setTextureWidth settexturewidth, onInitializeAccessibilityEvent oninitializeaccessibilityevent, MotionTelltales motionTelltales) {
                WritableTypeIdInclusion writableTypeIdInclusionMediaBrowserCompatItemReceiver;
                WritableTypeIdInclusion writableTypeIdInclusionInvoke;
                setTextOutlineThickness settextoutlinethickness = settexturewidth.AudioAttributesImplApi21Parcelizer;
                while (settextoutlinethickness.write.getAudioAttributesCompatParcelizer() != 0 && ((writableTypeIdInclusionInvoke = ((AudioAttributesCompatParcelizer) settextoutlinethickness.write.AudioAttributesCompatParcelizer()).RemoteActionCompatParcelizer().invoke()) == null || setTextureWidth.RemoteActionCompatParcelizer$default(settexturewidth, writableTypeIdInclusionInvoke, 0L, 0L, 3, null))) {
                    setStateRank<getShowPopup> setstaterankWrite = ((AudioAttributesCompatParcelizer) settextoutlinethickness.write.RemoteActionCompatParcelizer(settextoutlinethickness.write.getAudioAttributesCompatParcelizer() - 1)).write();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                    setstaterankWrite.resumeWith(C0177getRfBanners.read(getshowpopup));
                }
                if (settexturewidth.AudioAttributesImplBaseParcelizer && (writableTypeIdInclusionMediaBrowserCompatItemReceiver = settexturewidth.MediaBrowserCompatItemReceiver()) != null && setTextureWidth.RemoteActionCompatParcelizer$default(settexturewidth, writableTypeIdInclusionMediaBrowserCompatItemReceiver, 0L, 0L, 3, null)) {
                    settexturewidth.AudioAttributesImplBaseParcelizer = false;
                }
                oninitializeaccessibilityevent.IconCompatParcelizer(settexturewidth.read(motionTelltales, hasReferringProperties.INSTANCE.write()));
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(onInitializeAccessibilityEvent oninitializeaccessibilityevent, setTextureWidth settexturewidth, MotionTelltales motionTelltales, long j, setPassingYear setpassingyear, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = oninitializeaccessibilityevent;
                this.AudioAttributesImplApi26Parcelizer = settexturewidth;
                this.AudioAttributesCompatParcelizer = motionTelltales;
                this.read = j;
                this.RemoteActionCompatParcelizer = setpassingyear;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, sampleVideos);
                anonymousClass1.AudioAttributesImplBaseParcelizer = obj;
                return anonymousClass1;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(shouldSkipDump shouldskipdump, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(shouldskipdump, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(onInitializeAccessibilityEvent oninitializeaccessibilityevent, MotionTelltales motionTelltales, long j, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = oninitializeaccessibilityevent;
            this.read = motionTelltales;
            this.write = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = setTextureWidth.this.new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read, this.write, sampleVideos);
            iconCompatParcelizer.MediaBrowserCompatItemReceiver = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float read(MotionTelltales p0, long p1) {
        if (getKey.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        WritableTypeIdInclusion writableTypeIdInclusionMediaBrowserCompatItemReceiver = read();
        if (writableTypeIdInclusionMediaBrowserCompatItemReceiver == null) {
            writableTypeIdInclusionMediaBrowserCompatItemReceiver = this.AudioAttributesImplBaseParcelizer ? MediaBrowserCompatItemReceiver() : null;
            if (writableTypeIdInclusionMediaBrowserCompatItemReceiver == null) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
        long jAudioAttributesCompatParcelizer = SetterlessProperty.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
        int i = WhenMappings.read[this.AudioAttributesCompatParcelizer.ordinal()];
        if (i == 1) {
            return p0.AudioAttributesCompatParcelizer(writableTypeIdInclusionMediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer() - hasReferringProperties.AudioAttributesCompatParcelizer(p1), writableTypeIdInclusionMediaBrowserCompatItemReceiver.getIconCompatParcelizer() - writableTypeIdInclusionMediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer(), Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer));
        }
        if (i != 2) {
            throw new RenewEligibleCreator();
        }
        return p0.AudioAttributesCompatParcelizer(writableTypeIdInclusionMediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer() - hasReferringProperties.IconCompatParcelizer(p1), writableTypeIdInclusionMediaBrowserCompatItemReceiver.getWrite() - writableTypeIdInclusionMediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer(), Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32)));
    }

    private final WritableTypeIdInclusion read() {
        UTF32Reader uTF32Reader = this.AudioAttributesImplApi21Parcelizer.write;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer() - 1;
        Object[] objArr = uTF32Reader.IconCompatParcelizer;
        WritableTypeIdInclusion writableTypeIdInclusion = null;
        if (audioAttributesCompatParcelizer < objArr.length) {
            while (true) {
                if (audioAttributesCompatParcelizer < 0) {
                    break;
                }
                WritableTypeIdInclusion writableTypeIdInclusionInvoke = ((AudioAttributesCompatParcelizer) objArr[audioAttributesCompatParcelizer]).RemoteActionCompatParcelizer().invoke();
                if (writableTypeIdInclusionInvoke != null) {
                    if (RemoteActionCompatParcelizer(writableTypeIdInclusionInvoke.MediaBrowserCompatItemReceiver(), SetterlessProperty.AudioAttributesCompatParcelizer(this.MediaMetadataCompat)) <= 0) {
                        writableTypeIdInclusion = writableTypeIdInclusionInvoke;
                    } else if (writableTypeIdInclusion == null) {
                        return writableTypeIdInclusionInvoke;
                    }
                }
                audioAttributesCompatParcelizer--;
            }
        }
        return writableTypeIdInclusion;
    }

    private final WritableTypeIdInclusion IconCompatParcelizer(WritableTypeIdInclusion p0) {
        return p0.RemoteActionCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer(read(p0, this.MediaMetadataCompat, hasReferringProperties.INSTANCE.write()) ^ (-9223372034707292160L)));
    }

    static /* synthetic */ boolean RemoteActionCompatParcelizer$default(setTextureWidth settexturewidth, WritableTypeIdInclusion writableTypeIdInclusion, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = settexturewidth.MediaMetadataCompat;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = hasReferringProperties.INSTANCE.write();
        }
        return settexturewidth.RemoteActionCompatParcelizer(writableTypeIdInclusion, j3, j2);
    }

    private final boolean RemoteActionCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion, long j, long j2) {
        long j3 = read(writableTypeIdInclusion, j, j2);
        return Math.abs(Float.intBitsToFloat((int) (j3 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) j3)) <= 0.5f;
    }

    private final long read(WritableTypeIdInclusion p0, long p1, long p2) {
        long jAudioAttributesCompatParcelizer = SetterlessProperty.AudioAttributesCompatParcelizer(p1);
        int i = WhenMappings.read[this.AudioAttributesCompatParcelizer.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new RenewEligibleCreator();
            }
            long j = -1;
            return getReferencedType.AudioAttributesCompatParcelizer((Float.floatToRawIntBits(AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(p0.getAudioAttributesCompatParcelizer() - hasReferringProperties.IconCompatParcelizer(p2), p0.getWrite() - p0.getAudioAttributesCompatParcelizer(), Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32)))) << 32) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        }
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(p0.getRemoteActionCompatParcelizer() - hasReferringProperties.AudioAttributesCompatParcelizer(p2), p0.getIconCompatParcelizer() - p0.getRemoteActionCompatParcelizer(), Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer)))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    private final int AudioAttributesCompatParcelizer(long j, long j2) {
        int i = WhenMappings.read[this.AudioAttributesCompatParcelizer.ordinal()];
        if (i == 1) {
            return toMagicModuleMetaRepoModel.read((int) j, (int) j2);
        }
        if (i != 2) {
            throw new RenewEligibleCreator();
        }
        return toMagicModuleMetaRepoModel.read((int) (j >> 32), (int) (j2 >> 32));
    }

    private final int RemoteActionCompatParcelizer(long j, long j2) {
        int i = WhenMappings.read[this.AudioAttributesCompatParcelizer.ordinal()];
        if (i == 1) {
            return Float.compare(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2));
        }
        if (i != 2) {
            throw new RenewEligibleCreator();
        }
        return Float.compare(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public final void write(superDispatchKeyEvent p0, boolean p1, MotionTelltales p2) {
        this.AudioAttributesCompatParcelizer = p0;
        this.RemoteActionCompatParcelizer = p1;
        this.write = p2;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013"}, d2 = {"Lo/setTextureWidth$AudioAttributesCompatParcelizer;", "", "Lkotlin/Function0;", "Lo/WritableTypeIdInclusion;", "p0", "Lo/setStateRank;", "", "p1", "<init>", "(Lo/getCreatedOnDateMs;Lo/setStateRank;)V", "", "toString", "()Ljava/lang/String;", "write", "Lo/getCreatedOnDateMs;", "RemoteActionCompatParcelizer", "()Lo/getCreatedOnDateMs;", "read", "Lo/setStateRank;", "()Lo/setStateRank;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final setStateRank<getShowPopup> RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final getCreatedOnDateMs<WritableTypeIdInclusion> read;

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer(getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems, setStateRank<? super getShowPopup> setstaterank) {
            this.read = getcreatedondatems;
            this.RemoteActionCompatParcelizer = setstaterank;
        }

        public final getCreatedOnDateMs<WritableTypeIdInclusion> RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final setStateRank<getShowPopup> write() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                r4 = this;
                o.setStateRank<o.getShowPopup> r0 = r4.RemoteActionCompatParcelizer
                o.CurrentQuery r0 = r0.getWrite()
                o.isScoreStatsAvailable$read r1 = kotlin.isScoreStatsAvailable.INSTANCE
                o.CurrentQuery$IconCompatParcelizer r1 = (o.CurrentQuery.IconCompatParcelizer) r1
                o.CurrentQuery$write r0 = r0.get(r1)
                o.isScoreStatsAvailable r0 = (kotlin.isScoreStatsAvailable) r0
                if (r0 == 0) goto L17
                java.lang.String r0 = r0.getWrite()
                goto L18
            L17:
                r0 = 0
            L18:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Request@"
                r1.<init>(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.setStatusTimestamp.RemoteActionCompatParcelizer(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = ""
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L4c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "["
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L4e
            L4c:
                java.lang.String r0 = "("
            L4e:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                o.getCreatedOnDateMs<o.WritableTypeIdInclusion> r0 = r4.read
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                o.setStateRank<o.getShowPopup> r4 = r4.RemoteActionCompatParcelizer
                r1.append(r4)
                r4 = 41
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setTextureWidth.AudioAttributesCompatParcelizer.toString():java.lang.String");
        }
    }
}
