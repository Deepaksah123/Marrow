package kotlin;

import android.view.View;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0091\u0001\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0085\u0001\u0010\u001b\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u001eJ\u0013\u0010%\u001a\u00020\f*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\t\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0013\u0010%\u001a\u00020\f*\u00020*H\u0016¢\u0006\u0004\b%\u0010+R\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b!\u0010,R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b-\u0010,R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b%\u0010,R\u0016\u0010\u001b\u001a\u00020\u000e8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010(\u001a\u00020\u00108\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\"\u00101R\u0016\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b.\u00100R\u0016\u00104\u001a\u00020\u00138\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u001b\u00100R\u0016\u0010/\u001a\u00020\u00108\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b(\u00101R\u0016\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010 \u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00109R\u0018\u0010\u001f\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R/\u0010@\u001a\u0004\u0018\u00010'2\b\u0010\t\u001a\u0004\u0018\u00010'8C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010>\u001a\u0004\b\u001b\u0010?\"\u0004\b%\u0010)R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010A8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010BR\u0014\u00107\u001a\u00020\b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010CR\u0016\u0010<\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u00103R\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010J"}, d2 = {"Lo/Carousel;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/insertAnnotationIntrospector;", "Lo/addKeySerializers;", "Lo/hasIndex;", "Lo/_prefetchRootDeserializer;", "Lkotlin/Function1;", "Lo/bufferMapProperty;", "Lo/getReferencedType;", "p0", "p1", "Lo/handleIdValue;", "", "p2", "", "p3", "", "p4", "p5", "Lo/assignParameter;", "p6", "p7", "p8", "Lo/setPaddingRight;", "p9", "<init>", "(Lo/getAnswerMap;Lo/getAnswerMap;Lo/getAnswerMap;FZJFFZLo/setPaddingRight;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "read", "(Lo/getAnswerMap;Lo/getAnswerMap;FZJFFZLo/getAnswerMap;Lo/setPaddingRight;)V", "c_", "()V", "MediaDescriptionCompat", "MediaMetadataCompat", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "Lo/findSerializer;", "write", "(Lo/findSerializer;)V", "Lo/isAbstract;", "AudioAttributesCompatParcelizer", "(Lo/isAbstract;)V", "Lo/getConfigOverride;", "(Lo/getConfigOverride;)V", "Lo/getAnswerMap;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "F", "Z", "MediaBrowserCompatItemReceiver", "J", "AudioAttributesImplApi21Parcelizer", "Lo/setPaddingRight;", "Landroid/view/View;", "onCommand", "Landroid/view/View;", "Lo/bufferMapProperty;", "RatingCompat", "Lo/setLastHorizontalBias;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/setLastHorizontalBias;", "Lo/InputAccessor;", "()Lo/isAbstract;", "MediaBrowserCompatSearchResultReceiver", "Lo/parseDouble;", "Lo/parseDouble;", "()J", "onCustomAction", "Lo/getKey;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/getKey;", "onAddQueueItem", "Lo/fromCursor;", "Lo/fromCursor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Carousel extends _handleOddName.IconCompatParcelizer implements insertAnnotationIntrospector, addKeySerializers, hasIndex, _prefetchRootDeserializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    public setPaddingRight MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    public getAnswerMap<? super bufferMapProperty, getReferencedType> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    public float read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public getAnswerMap<? super bufferMapProperty, getReferencedType> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    public boolean AudioAttributesCompatParcelizer;
    public long MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private bufferMapProperty RatingCompat;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private setLastHorizontalBias MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private parseDouble<getReferencedType> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private fromCursor<getShowPopup> onCustomAction;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private getKey onAddQueueItem;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private View MediaMetadataCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public float AudioAttributesImplApi21Parcelizer;
    public getAnswerMap<? super handleIdValue, getShowPopup> write;

    private Carousel(getAnswerMap<? super bufferMapProperty, getReferencedType> getanswermap, getAnswerMap<? super bufferMapProperty, getReferencedType> getanswermap2, getAnswerMap<? super handleIdValue, getShowPopup> getanswermap3, float f, boolean z, long j, float f2, float f3, boolean z2, setPaddingRight setpaddingright) {
        this.IconCompatParcelizer = getanswermap;
        this.RemoteActionCompatParcelizer = getanswermap2;
        this.write = getanswermap3;
        this.read = f;
        this.AudioAttributesCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = j;
        this.AudioAttributesImplApi26Parcelizer = f2;
        this.AudioAttributesImplApi21Parcelizer = f3;
        this.AudioAttributesImplBaseParcelizer = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = setpaddingright;
        this.MediaBrowserCompatSearchResultReceiver = _qbuf.RemoteActionCompatParcelizer(null, _qbuf.AudioAttributesCompatParcelizer());
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getReferencedType.INSTANCE.read();
    }

    private final isAbstract read() {
        return (isAbstract) this.MediaBrowserCompatSearchResultReceiver.getRemoteActionCompatParcelizer();
    }

    private final void write(isAbstract isabstract) {
        this.MediaBrowserCompatSearchResultReceiver.write(isabstract);
    }

    private final long write() {
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.setDefaultAngle
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return Carousel.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
                }
            });
        }
        parseDouble<getReferencedType> parsedouble = this.MediaBrowserCompatMediaItem;
        return parsedouble != null ? parsedouble.getRemoteActionCompatParcelizer().getWrite() : getReferencedType.INSTANCE.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getReferencedType AudioAttributesImplApi21Parcelizer(Carousel carousel) {
        isAbstract isabstract = carousel.read();
        return getReferencedType.read(isabstract != null ? hasRawClass.AudioAttributesCompatParcelizer(isabstract) : getReferencedType.INSTANCE.read());
    }

    public final void read(getAnswerMap<? super bufferMapProperty, getReferencedType> p0, getAnswerMap<? super bufferMapProperty, getReferencedType> p1, float p2, boolean p3, long p4, float p5, float p6, boolean p7, getAnswerMap<? super handleIdValue, getShowPopup> p8, setPaddingRight p9) {
        float f = this.read;
        long j = this.MediaBrowserCompatItemReceiver;
        float f2 = this.AudioAttributesImplApi26Parcelizer;
        boolean z = this.AudioAttributesCompatParcelizer;
        float f3 = this.AudioAttributesImplApi21Parcelizer;
        boolean z2 = this.AudioAttributesImplBaseParcelizer;
        setPaddingRight setpaddingright = this.MediaBrowserCompatCustomActionResultReceiver;
        View view = this.MediaMetadataCompat;
        bufferMapProperty buffermapproperty = this.RatingCompat;
        this.IconCompatParcelizer = p0;
        this.RemoteActionCompatParcelizer = p1;
        this.read = p2;
        this.AudioAttributesCompatParcelizer = p3;
        this.MediaBrowserCompatItemReceiver = p4;
        this.AudioAttributesImplApi26Parcelizer = p5;
        this.AudioAttributesImplApi21Parcelizer = p6;
        this.AudioAttributesImplBaseParcelizer = p7;
        this.write = p8;
        this.MediaBrowserCompatCustomActionResultReceiver = p9;
        Carousel carousel = this;
        View viewRemoteActionCompatParcelizer = C0217version.RemoteActionCompatParcelizer(carousel);
        bufferMapProperty buffermappropertyWrite = collectLongDefaults.write((Module) carousel);
        if (this.MediaDescriptionCompat != null && ((!setDefaultRadius.IconCompatParcelizer(p2, f) && !p9.IconCompatParcelizer()) || !handleIdValue.write(p4, j) || !assignParameter.IconCompatParcelizer(p5, f2) || !assignParameter.IconCompatParcelizer(p6, f3) || p3 != z || p7 != z2 || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p9, setpaddingright) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer, view) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(buffermappropertyWrite, buffermapproperty))) {
            AudioAttributesImplApi26Parcelizer();
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        MediaMetadataCompat();
        this.onCustomAction = getLastName.read(0, null, 7);
        C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, getCollegeName.AudioAttributesCompatParcelizer, new IconCompatParcelizer(null), 1);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            if (kotlin.TokenFilterInclusion.read(new kotlin.CircularFlow(), r4) == r0) goto L19;
         */
        /* JADX WARN: Path cross not found for [B:13:0x0029, B:15:0x0034], limit reached: 23 */
        /* JADX WARN: Path cross not found for [B:15:0x0034, B:13:0x0029], limit reached: 23 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003a -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004a -> B:20:0x004d). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L4d
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L34
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            L21:
                o.Carousel r5 = kotlin.Carousel.this
                o.fromCursor r5 = kotlin.Carousel.RemoteActionCompatParcelizer(r5)
                if (r5 == 0) goto L34
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.RemoteActionCompatParcelizer = r3
                java.lang.Object r5 = r5.IconCompatParcelizer(r1)
                if (r5 == r0) goto L4c
            L34:
                o.Carousel r5 = kotlin.Carousel.this
                o.setLastHorizontalBias r5 = kotlin.Carousel.read(r5)
                if (r5 == 0) goto L21
                o.CircularFlow r5 = new o.CircularFlow
                r5.<init>()
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.RemoteActionCompatParcelizer = r2
                java.lang.Object r5 = kotlin.TokenFilterInclusion.read(r5, r1)
                if (r5 != r0) goto L4d
            L4c:
                return r0
            L4d:
                o.Carousel r5 = kotlin.Carousel.this
                o.setLastHorizontalBias r5 = kotlin.Carousel.read(r5)
                if (r5 == 0) goto L21
                r5.RemoteActionCompatParcelizer()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Carousel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(long j) {
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return Carousel.this.new IconCompatParcelizer(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        setLastHorizontalBias setlasthorizontalbias = this.MediaDescriptionCompat;
        if (setlasthorizontalbias != null) {
            setlasthorizontalbias.AudioAttributesCompatParcelizer();
        }
        this.MediaDescriptionCompat = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(Carousel carousel) {
        carousel.MediaBrowserCompatCustomActionResultReceiver();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin._prefetchRootDeserializer
    public final void MediaMetadataCompat() {
        _detectBindAndClose.read(this, new getCreatedOnDateMs() { // from class: o.setPopupContentSizefhxjrPA
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Carousel.MediaBrowserCompatCustomActionResultReceiver(this.write);
            }
        });
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        setLastHorizontalBias setlasthorizontalbias = this.MediaDescriptionCompat;
        if (setlasthorizontalbias != null) {
            setlasthorizontalbias.AudioAttributesCompatParcelizer();
        }
        View viewRemoteActionCompatParcelizer = this.MediaMetadataCompat;
        if (viewRemoteActionCompatParcelizer == null) {
            viewRemoteActionCompatParcelizer = C0217version.RemoteActionCompatParcelizer(this);
        }
        View view = viewRemoteActionCompatParcelizer;
        this.MediaMetadataCompat = view;
        bufferMapProperty buffermappropertyWrite = this.RatingCompat;
        if (buffermappropertyWrite == null) {
            buffermappropertyWrite = collectLongDefaults.write((Module) this);
        }
        bufferMapProperty buffermapproperty = buffermappropertyWrite;
        this.RatingCompat = buffermapproperty;
        this.MediaDescriptionCompat = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(view, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer, buffermapproperty, this.read);
        MediaBrowserCompatMediaItem();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaBrowserCompatCustomActionResultReceiver() {
        /*
            r9 = this;
            o.bufferMapProperty r0 = r9.RatingCompat
            if (r0 != 0) goto Ld
            r0 = r9
            o.Module r0 = (kotlin.Module) r0
            o.bufferMapProperty r0 = kotlin.collectLongDefaults.write(r0)
            r9.RatingCompat = r0
        Ld:
            o.getAnswerMap<? super o.bufferMapProperty, o.getReferencedType> r1 = r9.IconCompatParcelizer
            java.lang.Object r1 = r1.invoke(r0)
            o.getReferencedType r1 = (kotlin.getReferencedType) r1
            long r1 = r1.getWrite()
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r1 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L84
            long r5 = r9.write()
            long r5 = r5 & r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L84
            long r5 = r9.write()
            long r1 = kotlin.getReferencedType.RemoteActionCompatParcelizer(r5, r1)
            r9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r1
            o.getAnswerMap<? super o.bufferMapProperty, o.getReferencedType> r1 = r9.RemoteActionCompatParcelizer
            if (r1 == 0) goto L67
            java.lang.Object r0 = r1.invoke(r0)
            o.getReferencedType r0 = (kotlin.getReferencedType) r0
            long r0 = r0.getWrite()
            o.getReferencedType r0 = kotlin.getReferencedType.read(r0)
            long r1 = r0.getWrite()
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L58
            r0 = 0
        L58:
            if (r0 == 0) goto L67
            long r0 = r0.getWrite()
            long r2 = r9.write()
            long r0 = kotlin.getReferencedType.RemoteActionCompatParcelizer(r2, r0)
            goto L6d
        L67:
            o.getReferencedType$RemoteActionCompatParcelizer r0 = kotlin.getReferencedType.INSTANCE
            long r0 = r0.read()
        L6d:
            r5 = r0
            o.setLastHorizontalBias r0 = r9.MediaDescriptionCompat
            if (r0 != 0) goto L75
            r9.AudioAttributesImplApi26Parcelizer()
        L75:
            o.setLastHorizontalBias r2 = r9.MediaDescriptionCompat
            if (r2 == 0) goto L80
            long r3 = r9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            float r7 = r9.read
            r2.read(r3, r5, r7)
        L80:
            r9.MediaBrowserCompatMediaItem()
            return
        L84:
            o.getReferencedType$RemoteActionCompatParcelizer r0 = kotlin.getReferencedType.INSTANCE
            long r0 = r0.read()
            r9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r0
            o.setLastHorizontalBias r9 = r9.MediaDescriptionCompat
            if (r9 == 0) goto L93
            r9.AudioAttributesCompatParcelizer()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Carousel.MediaBrowserCompatCustomActionResultReceiver():void");
    }

    private final void MediaBrowserCompatMediaItem() {
        bufferMapProperty buffermapproperty;
        setLastHorizontalBias setlasthorizontalbias = this.MediaDescriptionCompat;
        if (setlasthorizontalbias == null || (buffermapproperty = this.RatingCompat) == null || getKey.AudioAttributesCompatParcelizer(setlasthorizontalbias.read(), this.onAddQueueItem)) {
            return;
        }
        getAnswerMap<? super handleIdValue, getShowPopup> getanswermap = this.write;
        if (getanswermap != null) {
            getanswermap.invoke(handleIdValue.read(buffermapproperty.b_(SetterlessProperty.AudioAttributesCompatParcelizer(setlasthorizontalbias.read()))));
        }
        this.onAddQueueItem = getKey.AudioAttributesCompatParcelizer(setlasthorizontalbias.read());
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        findserializer.write();
        fromCursor<getShowPopup> fromcursor = this.onCustomAction;
        if (fromcursor != null) {
            getNameArray.RemoteActionCompatParcelizer(fromcursor.read(getShowPopup.INSTANCE));
        }
    }

    @Override // kotlin.insertAnnotationIntrospector
    public final void AudioAttributesCompatParcelizer(isAbstract p0) {
        write(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getReferencedType AudioAttributesImplBaseParcelizer(Carousel carousel) {
        return getReferencedType.read(carousel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        getconfigoverride.write(setDefaultRadius.write(), new getCreatedOnDateMs() { // from class: o.setTestTag
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Carousel.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    public /* synthetic */ Carousel(getAnswerMap getanswermap, getAnswerMap getanswermap2, getAnswerMap getanswermap3, float f, boolean z, long j, float f2, float f3, boolean z2, setPaddingRight setpaddingright, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getanswermap, getanswermap2, getanswermap3, f, z, j, f2, f3, z2, setpaddingright);
    }
}
