package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.isVisible;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006J'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u000e\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000e\u0010\u0014J\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/getResetBlock;", "Lo/forRootType;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/hashCode;", "p0", "<init>", "(Lo/hashCode;)V", "", "IconCompatParcelizer", "Lo/DeserializationContext;", "Lo/_shapeForToken;", "p1", "Lo/getKey;", "p2", "write", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "MediaBrowserCompatMediaItem", "()V", "MediaDescriptionCompat", "read", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/hashCode;", "AudioAttributesCompatParcelizer", "Lo/isVisible$read;", "RemoteActionCompatParcelizer", "Lo/isVisible$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getResetBlock extends _handleOddName.IconCompatParcelizer implements forRootType {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private hashCode AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private isVisible.read read;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        Object IconCompatParcelizer;
        int read;
        /* synthetic */ Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return getResetBlock.this.read(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getTotalMcq {
        /* synthetic */ Object read;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return getResetBlock.this.write(this);
        }
    }

    public getResetBlock(hashCode hashcode) {
        this.AudioAttributesCompatParcelizer = hashcode;
    }

    public final void IconCompatParcelizer(hashCode p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0)) {
            return;
        }
        write();
        this.AudioAttributesCompatParcelizer = p0;
    }

    @Override // kotlin.forRootType
    public final void write(DeserializationContext p0, _shapeForToken p1, long p2) {
        if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
            int mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver();
            if (constructCalendar.AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver, constructCalendar.INSTANCE.read())) {
                C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new RemoteActionCompatParcelizer(null), 3);
            } else if (constructCalendar.AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver, constructCalendar.INSTANCE.AudioAttributesCompatParcelizer())) {
                C0201setMcqCount.IconCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), null, null, new IconCompatParcelizer(null), 3);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (getResetBlock.this.read(this) == objIconCompatParcelizer) {
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getResetBlock.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (getResetBlock.this.write(this) == objIconCompatParcelizer) {
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
            return getResetBlock.this.new IconCompatParcelizer(sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.forRootType
    public final void MediaBrowserCompatMediaItem() {
        write();
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o.getResetBlock.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.getResetBlock$AudioAttributesCompatParcelizer r0 = (o.getResetBlock.AudioAttributesCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.read
            int r6 = r6 + r2
            r0.read = r6
            goto L19
        L14:
            o.getResetBlock$AudioAttributesCompatParcelizer r0 = new o.getResetBlock$AudioAttributesCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.IconCompatParcelizer
            o.isVisible$read r0 = (o.isVisible.read) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L53
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.isVisible$read r6 = r5.read
            if (r6 != 0) goto L55
            o.isVisible$read r6 = new o.isVisible$read
            r6.<init>()
            o.hashCode r2 = r5.AudioAttributesCompatParcelizer
            r4 = r6
            o.isRound r4 = (kotlin.isRound) r4
            r0.IconCompatParcelizer = r6
            r0.read = r3
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r6
        L53:
            r5.read = r0
        L55:
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getResetBlock.read(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.getResetBlock.write
            if (r0 == 0) goto L14
            r0 = r5
            o.getResetBlock$write r0 = (o.getResetBlock.write) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.write
            int r5 = r5 + r2
            r0.write = r5
            goto L19
        L14:
            o.getResetBlock$write r0 = new o.getResetBlock$write
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L4b
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.isVisible$read r5 = r4.read
            if (r5 == 0) goto L4e
            o.isVisible$IconCompatParcelizer r2 = new o.isVisible$IconCompatParcelizer
            r2.<init>(r5)
            o.hashCode r5 = r4.AudioAttributesCompatParcelizer
            o.isRound r2 = (kotlin.isRound) r2
            r0.write = r3
            java.lang.Object r5 = r5.RemoteActionCompatParcelizer(r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = 0
            r4.read = r5
        L4e:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getResetBlock.write(o.SampleVideos):java.lang.Object");
    }

    private final void write() {
        isVisible.read readVar = this.read;
        if (readVar != null) {
            this.AudioAttributesCompatParcelizer.read(new isVisible.IconCompatParcelizer(readVar));
            this.read = null;
        }
    }
}
