package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u00152\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0015\u000fB-\u0012$\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\f\u001a\u00020\u00072$\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R4\u0010\f\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R/\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\r8C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0011\u0010\u000e"}, d2 = {"Lo/ChangeImageTransform;", "Lo/addAbstractTypeResolver;", "Lo/getLongMask;", "Lo/insertAnnotationIntrospector;", "Lkotlin/Function2;", "Lo/getReferencedType;", "Lo/SampleVideos;", "", "", "p0", "<init>", "(Lo/MagicModuleSubmissionRequestBody;)V", "AudioAttributesCompatParcelizer", "Lo/isAbstract;", "(Lo/isAbstract;)V", "IconCompatParcelizer", "(J)V", "write", "Lo/MagicModuleSubmissionRequestBody;", "RemoteActionCompatParcelizer", "Lo/InputAccessor;", "read", "()Lo/isAbstract;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ChangeImageTransform extends addAbstractTypeResolver implements getLongMask, insertAnnotationIntrospector {
    private static final read read = new read(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor read = _qbuf.RemoteActionCompatParcelizer(null, _qbuf.AudioAttributesCompatParcelizer());

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> AudioAttributesCompatParcelizer;

    public ChangeImageTransform(MagicModuleSubmissionRequestBody<? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        AudioAttributesCompatParcelizer(hasSomeOfFeatures.write(new PointerInputEventHandler() { // from class: o.ChangeImageTransform.5

            /* JADX INFO: renamed from: o.ChangeImageTransform$5$1, reason: invalid class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final /* synthetic */ class AnonymousClass1 extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<getReferencedType, getShowPopup> {
                @Override // kotlin.getAnswerMap
                public final /* synthetic */ getShowPopup invoke(getReferencedType getreferencedtype) {
                    write(getreferencedtype.getWrite());
                    return getShowPopup.INSTANCE;
                }

                public final void write(long j) {
                    ((ChangeImageTransform) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(j);
                }

                AnonymousClass1(Object obj) {
                    super(1, obj, ChangeImageTransform.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
                Object obj = isBound.read(handlebadmerge, new AnonymousClass1(ChangeImageTransform.this), sampleVideos);
                return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
            }
        }));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ChangeImageTransform$read;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final isAbstract read() {
        return (isAbstract) this.read.getRemoteActionCompatParcelizer();
    }

    private final void write(isAbstract isabstract) {
        this.read.write(isabstract);
    }

    public final void AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody<? super getReferencedType, ? super SampleVideos<? super getShowPopup>, ? extends Object> p0) {
        this.AudioAttributesCompatParcelizer = p0;
    }

    @Override // kotlin.insertAnnotationIntrospector
    public final void AudioAttributesCompatParcelizer(isAbstract p0) {
        write(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(long p0) {
        setStrokeAlpha setstrokealpha = (setStrokeAlpha) MappingJsonFactory.write(this, setTrimPathOffset.RemoteActionCompatParcelizer());
        if (setstrokealpha == null) {
            return;
        }
        C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new AudioAttributesCompatParcelizer(p0, setstrokealpha, new IconCompatParcelizer(this, p0, null), null), 3);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ long AudioAttributesCompatParcelizer;
        final /* synthetic */ setStrokeAlpha RemoteActionCompatParcelizer;
        final /* synthetic */ IconCompatParcelizer read;
        int write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r6.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r6.read, r6) == r0) goto L16;
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
                int r1 = r6.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L49
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L37
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                o.ChangeImageTransform r7 = kotlin.ChangeImageTransform.this
                o.MagicModuleSubmissionRequestBody r7 = kotlin.ChangeImageTransform.RemoteActionCompatParcelizer(r7)
                if (r7 == 0) goto L37
                long r4 = r6.AudioAttributesCompatParcelizer
                o.getReferencedType r1 = kotlin.getReferencedType.read(r4)
                r6.write = r3
                java.lang.Object r7 = r7.invoke(r1, r6)
                if (r7 == r0) goto L48
            L37:
                o.setStrokeAlpha r7 = r6.RemoteActionCompatParcelizer
                o.ChangeImageTransform$IconCompatParcelizer r1 = r6.read
                o.setFillAlpha r1 = (kotlin.setFillAlpha) r1
                r3 = r6
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r6.write = r2
                java.lang.Object r6 = r7.RemoteActionCompatParcelizer(r1, r3)
                if (r6 != r0) goto L49
            L48:
                return r0
            L49:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ChangeImageTransform.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(long j, setStrokeAlpha setstrokealpha, IconCompatParcelizer iconCompatParcelizer, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = j;
            this.RemoteActionCompatParcelizer = setstrokealpha;
            this.read = iconCompatParcelizer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return ChangeImageTransform.this.new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f"}, d2 = {"Lo/ChangeImageTransform$IconCompatParcelizer;", "Lo/setFillAlpha;", "Lo/getReferencedType;", "p0", "<init>", "(Lo/ChangeImageTransform;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/isAbstract;", "RemoteActionCompatParcelizer", "(Lo/isAbstract;)J", "Lo/WritableTypeIdInclusion;", "read", "(Lo/isAbstract;)Lo/WritableTypeIdInclusion;", "Lo/isAttachedToTransitionOverlay;", "IconCompatParcelizer", "()Lo/isAttachedToTransitionOverlay;", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class IconCompatParcelizer implements setFillAlpha {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final long RemoteActionCompatParcelizer;

        private IconCompatParcelizer(long j) {
            this.RemoteActionCompatParcelizer = j;
        }

        @Override // kotlin.setFillAlpha
        public final long RemoteActionCompatParcelizer(isAbstract p0) {
            isAbstract isabstract = ChangeImageTransform.this.read();
            if (isabstract != null) {
                return p0.RemoteActionCompatParcelizer(isabstract, this.RemoteActionCompatParcelizer);
            }
            getRootStableInsets.IconCompatParcelizer("Tried to open context menu before the anchor was placed.");
            throw new PlanDetailsCreator();
        }

        @Override // kotlin.setFillAlpha
        public final WritableTypeIdInclusion read(isAbstract p0) {
            return BufferRecycler.read(RemoteActionCompatParcelizer(p0), calloc.INSTANCE.AudioAttributesCompatParcelizer());
        }

        @Override // kotlin.setFillAlpha
        public final isAttachedToTransitionOverlay IconCompatParcelizer() {
            return ChangeScroll.RemoteActionCompatParcelizer(ChangeImageTransform.this);
        }

        public /* synthetic */ IconCompatParcelizer(ChangeImageTransform changeImageTransform, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(j);
        }
    }
}
