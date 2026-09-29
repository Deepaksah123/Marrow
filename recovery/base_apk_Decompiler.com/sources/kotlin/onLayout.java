package kotlin;

import kotlin.Metadata;
import kotlin.getTappableElementInsets;
import kotlin.isVisible;
import kotlin.setOverriddenInsets;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b"}, d2 = {"Lo/onLayout;", "", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/isRound;", "IconCompatParcelizer", "(Lo/isRound;)F", "", "AudioAttributesCompatParcelizer", "(FFFFLo/SampleVideos;)Ljava/lang/Object;", "read", "(Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "(Lo/isRound;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/parseDouble;", "write", "()Lo/parseDouble;", "F", "AudioAttributesImplApi26Parcelizer", "Lo/LinearLayoutCompat;", "Lo/setHoverListener;", "Lo/LinearLayoutCompat;", "Lo/isRound;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class onLayout {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private isRound AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private float RemoteActionCompatParcelizer;
    private final LinearLayoutCompat<assignParameter, setHoverListener> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private isRound AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float write;
    private float read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private float AudioAttributesCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        int read;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return onLayout.this.RemoteActionCompatParcelizer((isRound) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return onLayout.this.read(this);
        }
    }

    private onLayout(float f, float f2, float f3, float f4) {
        this.write = f;
        this.RemoteActionCompatParcelizer = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.read = f4;
        this.IconCompatParcelizer = new LinearLayoutCompat<>(assignParameter.read(this.write), hitCount.write(assignParameter.INSTANCE), null, null, 12, null);
    }

    private final float IconCompatParcelizer(isRound isround) {
        return isround instanceof setOverriddenInsets.read ? this.RemoteActionCompatParcelizer : isround instanceof isVisible.read ? this.AudioAttributesCompatParcelizer : isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer ? this.read : this.write;
    }

    public final Object AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4, SampleVideos<? super getShowPopup> sampleVideos) {
        this.write = f;
        this.RemoteActionCompatParcelizer = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.read = f4;
        Object obj = read(sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.onLayout.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            o.onLayout$RemoteActionCompatParcelizer r0 = (o.onLayout.RemoteActionCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.RemoteActionCompatParcelizer
            int r5 = r5 + r2
            r0.RemoteActionCompatParcelizer = r5
            goto L19
        L14:
            o.onLayout$RemoteActionCompatParcelizer r0 = new o.onLayout$RemoteActionCompatParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L61
            goto L5c
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.isRound r5 = r4.AudioAttributesImplBaseParcelizer
            float r5 = r4.IconCompatParcelizer(r5)
            o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r2 = r4.IconCompatParcelizer
            java.lang.Object r2 = r2.write()
            o.assignParameter r2 = (kotlin.assignParameter) r2
            float r2 = r2.getRemoteActionCompatParcelizer()
            boolean r2 = kotlin.assignParameter.IconCompatParcelizer(r2, r5)
            if (r2 != 0) goto L67
            o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r2 = r4.IconCompatParcelizer     // Catch: java.lang.Throwable -> L61
            o.assignParameter r5 = kotlin.assignParameter.read(r5)     // Catch: java.lang.Throwable -> L61
            r0.RemoteActionCompatParcelizer = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = r2.read(r5, r0)     // Catch: java.lang.Throwable -> L61
            if (r5 != r1) goto L5c
            return r1
        L5c:
            o.isRound r5 = r4.AudioAttributesImplBaseParcelizer
            r4.AudioAttributesImplApi21Parcelizer = r5
            goto L67
        L61:
            r5 = move-exception
            o.isRound r0 = r4.AudioAttributesImplBaseParcelizer
            r4.AudioAttributesImplApi21Parcelizer = r0
            throw r5
        L67:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onLayout.read(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o.getShowPopup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.isRound r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.onLayout.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.onLayout$AudioAttributesCompatParcelizer r0 = (o.onLayout.AudioAttributesCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            o.onLayout$AudioAttributesCompatParcelizer r0 = new o.onLayout$AudioAttributesCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            o.isRound r6 = (kotlin.isRound) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)     // Catch: java.lang.Throwable -> L65
            goto L60
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            float r7 = r5.IconCompatParcelizer(r6)
            r5.AudioAttributesImplBaseParcelizer = r6
            o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r2 = r5.IconCompatParcelizer     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = r2.write()     // Catch: java.lang.Throwable -> L65
            o.assignParameter r2 = (kotlin.assignParameter) r2     // Catch: java.lang.Throwable -> L65
            float r2 = r2.getRemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> L65
            boolean r2 = kotlin.assignParameter.IconCompatParcelizer(r2, r7)     // Catch: java.lang.Throwable -> L65
            if (r2 != 0) goto L60
            o.LinearLayoutCompat<o.assignParameter, o.setHoverListener> r2 = r5.IconCompatParcelizer     // Catch: java.lang.Throwable -> L65
            o.isRound r4 = r5.AudioAttributesImplApi21Parcelizer     // Catch: java.lang.Throwable -> L65
            r0.RemoteActionCompatParcelizer = r6     // Catch: java.lang.Throwable -> L65
            r0.read = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r7 = kotlin.isShimmerStarted.RemoteActionCompatParcelizer(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L65
            if (r7 != r1) goto L60
            return r1
        L60:
            r5.AudioAttributesImplApi21Parcelizer = r6
            o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
            return r5
        L65:
            r7 = move-exception
            r5.AudioAttributesImplApi21Parcelizer = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onLayout.RemoteActionCompatParcelizer(o.isRound, o.SampleVideos):java.lang.Object");
    }

    public final parseDouble<assignParameter> write() {
        return this.IconCompatParcelizer.read();
    }

    public /* synthetic */ onLayout(float f, float f2, float f3, float f4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4);
    }
}
