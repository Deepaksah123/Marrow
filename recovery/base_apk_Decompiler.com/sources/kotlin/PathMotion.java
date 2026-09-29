package kotlin;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Be\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\u001e\u0010\u000b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u0011\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR:\u0010\u001b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b\u0019\u0010$R:\u0010\u0011\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010#\"\u0004\b\"\u0010$R*\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\"\u0010!\"\u0004\b\u001b\u0010$R\u0018\u0010\"\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+"}, d2 = {"Lo/PathMotion;", "Lo/addAbstractTypeResolver;", "Lo/getLongMask;", "Lo/setFillAlpha;", "Lo/getFillAlpha;", "p0", "Lkotlin/Function1;", "Lo/SampleVideos;", "", "", "p1", "p2", "Lo/isAbstract;", "Lo/WritableTypeIdInclusion;", "p3", "<init>", "(Lo/getFillAlpha;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getAnswerMap;)V", "IconCompatParcelizer", "(Lo/getFillAlpha;)V", "c_", "()V", "MediaDescriptionCompat", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getReferencedType;", "RemoteActionCompatParcelizer", "(Lo/isAbstract;)J", "read", "(Lo/isAbstract;)Lo/WritableTypeIdInclusion;", "Lo/isAttachedToTransitionOverlay;", "()Lo/isAttachedToTransitionOverlay;", "Lo/getFillAlpha;", "AudioAttributesCompatParcelizer", "Lo/getAnswerMap;", "write", "()Lo/getAnswerMap;", "(Lo/getAnswerMap;)V", "Lo/setPassingYear;", "AudioAttributesImplBaseParcelizer", "Lo/setPassingYear;", "Lo/parseDouble;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "Lo/WritableTypeIdInclusion;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PathMotion extends addAbstractTypeResolver implements getLongMask, setFillAlpha {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private setPassingYear write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public getFillAlpha AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private getAnswerMap<? super isAbstract, WritableTypeIdInclusion> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final parseDouble AudioAttributesImplApi21Parcelizer = _qbuf.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.Visibility
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return PathMotion.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
    });

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private WritableTypeIdInclusion AudioAttributesImplApi26Parcelizer = WritableTypeIdInclusion.INSTANCE.write();

    public PathMotion(getFillAlpha getfillalpha, getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap, getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap2, getAnswerMap<? super isAbstract, WritableTypeIdInclusion> getanswermap3) {
        this.AudioAttributesCompatParcelizer = getfillalpha;
        this.read = getanswermap;
        this.IconCompatParcelizer = getanswermap2;
        this.RemoteActionCompatParcelizer = getanswermap3;
    }

    public final void RemoteActionCompatParcelizer(getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap) {
        this.read = getanswermap;
    }

    public final getAnswerMap<SampleVideos<? super getShowPopup>, Object> write() {
        return this.read;
    }

    public final getAnswerMap<SampleVideos<? super getShowPopup>, Object> read() {
        return this.IconCompatParcelizer;
    }

    public final void write(getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap) {
        this.IconCompatParcelizer = getanswermap;
    }

    public final void read(getAnswerMap<? super isAbstract, WritableTypeIdInclusion> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    private final isAttachedToTransitionOverlay MediaBrowserCompatItemReceiver() {
        return (isAttachedToTransitionOverlay) this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isAttachedToTransitionOverlay RemoteActionCompatParcelizer(PathMotion pathMotion) {
        return pathMotion.getRatingCompat() ? ChangeScroll.RemoteActionCompatParcelizer(pathMotion) : isAttachedToTransitionOverlay.INSTANCE.read();
    }

    public final void IconCompatParcelizer(getFillAlpha p0) {
        Transition transition;
        this.AudioAttributesCompatParcelizer.write(null);
        this.AudioAttributesCompatParcelizer = p0;
        p0.write(this);
        getFillAlpha getfillalpha = this.AudioAttributesCompatParcelizer;
        if (getRatingCompat()) {
            transition = Transition.read;
        } else {
            transition = Transition.write;
        }
        getfillalpha.AudioAttributesCompatParcelizer(transition);
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        super.c_();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(Transition.read);
        this.AudioAttributesCompatParcelizer.write(this);
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(Transition.write);
        this.AudioAttributesCompatParcelizer.write(null);
        super.MediaDescriptionCompat();
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        setStrokeAlpha setstrokealpha;
        if (getRatingCompat()) {
            setPassingYear setpassingyear = this.write;
            if ((setpassingyear == null || !setpassingyear.read()) && (setstrokealpha = (setStrokeAlpha) MappingJsonFactory.write(this, setTrimPathOffset.AudioAttributesCompatParcelizer())) != null) {
                this.write = C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, getCollegeName.AudioAttributesCompatParcelizer, new read(setstrokealpha, null), 1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;
        final /* synthetic */ setStrokeAlpha read;
        Object write;

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        
            if (r7.invoke(r6) != r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.IconCompatParcelizer
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L30
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L28
                if (r1 == r3) goto L24
                if (r1 == r2) goto L1c
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1c:
                java.lang.Object r6 = r6.write
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L7d
            L24:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L65
            L28:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)     // Catch: java.lang.Throwable -> L68
                goto L55
            L2c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)     // Catch: java.lang.Throwable -> L68
                goto L44
            L30:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                o.PathMotion r7 = kotlin.PathMotion.this     // Catch: java.lang.Throwable -> L68
                o.getAnswerMap r7 = r7.write()     // Catch: java.lang.Throwable -> L68
                if (r7 == 0) goto L44
                r6.IconCompatParcelizer = r5     // Catch: java.lang.Throwable -> L68
                java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L68
                if (r7 != r0) goto L44
                goto L7b
            L44:
                o.setStrokeAlpha r7 = r6.read     // Catch: java.lang.Throwable -> L68
                o.PathMotion r1 = kotlin.PathMotion.this     // Catch: java.lang.Throwable -> L68
                o.setFillAlpha r1 = (kotlin.setFillAlpha) r1     // Catch: java.lang.Throwable -> L68
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5     // Catch: java.lang.Throwable -> L68
                r6.IconCompatParcelizer = r4     // Catch: java.lang.Throwable -> L68
                java.lang.Object r7 = r7.RemoteActionCompatParcelizer(r1, r5)     // Catch: java.lang.Throwable -> L68
                if (r7 == r0) goto L7b
            L55:
                o.PathMotion r7 = kotlin.PathMotion.this
                o.getAnswerMap r7 = r7.read()
                if (r7 == 0) goto L65
                r6.IconCompatParcelizer = r3
                java.lang.Object r6 = r7.invoke(r6)
                if (r6 == r0) goto L7b
            L65:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L68:
                r7 = move-exception
                o.PathMotion r1 = kotlin.PathMotion.this
                o.getAnswerMap r1 = r1.read()
                if (r1 == 0) goto L7e
                r6.write = r7
                r6.IconCompatParcelizer = r2
                java.lang.Object r6 = r1.invoke(r6)
                if (r6 != r0) goto L7c
            L7b:
                return r0
            L7c:
                r6 = r7
            L7d:
                r7 = r6
            L7e:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.PathMotion.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(setStrokeAlpha setstrokealpha, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.read = setstrokealpha;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return PathMotion.this.new read(this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        setPassingYear setpassingyear = this.write;
        if (setpassingyear == null) {
            return;
        }
        setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        this.write = null;
    }

    @Override // kotlin.setFillAlpha
    public final long RemoteActionCompatParcelizer(isAbstract p0) {
        return read(p0).AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.setFillAlpha
    public final WritableTypeIdInclusion read(isAbstract p0) {
        WritableTypeIdInclusion writableTypeIdInclusionInvoke;
        if (getRatingCompat() && (writableTypeIdInclusionInvoke = this.RemoteActionCompatParcelizer.invoke(p0)) != null) {
            this.AudioAttributesImplApi26Parcelizer = writableTypeIdInclusionInvoke;
            return writableTypeIdInclusionInvoke;
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.setFillAlpha
    public final isAttachedToTransitionOverlay IconCompatParcelizer() {
        return MediaBrowserCompatItemReceiver();
    }
}
