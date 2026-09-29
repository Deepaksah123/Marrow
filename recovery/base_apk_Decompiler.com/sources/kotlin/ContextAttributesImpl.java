package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u000b\u0010\u0011J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\r\u0010\u0011R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R0\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00058\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\r\u0010\u0017"}, d2 = {"Lo/ContextAttributesImpl;", "", "", "p0", "Lkotlin/Function2;", "", "Lo/SampleVideos;", "p1", "<init>", "(ILo/MagicModuleSubmissionRequestBody;)V", "", "IconCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "(IILo/SampleVideos;)Ljava/lang/Object;", "read", "(I)I", "(FLo/SampleVideos;)Ljava/lang/Object;", "I", "write", "Lo/MagicModuleSubmissionRequestBody;", "AudioAttributesCompatParcelizer", "F", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ContextAttributesImpl {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final MagicModuleSubmissionRequestBody<Float, SampleVideos<? super Float>, Object> write;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return ContextAttributesImpl.this.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContextAttributesImpl(int i, MagicModuleSubmissionRequestBody<? super Float, ? super SampleVideos<? super Float>, ? extends Object> magicModuleSubmissionRequestBody) {
        this.RemoteActionCompatParcelizer = i;
        this.write = magicModuleSubmissionRequestBody;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public final Object RemoteActionCompatParcelizer(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        if (i > i2) {
            StringBuilder sb = new StringBuilder("Expected min=");
            sb.append(i);
            sb.append(" ≤ max=");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int i3 = i2 - i;
        int i4 = this.RemoteActionCompatParcelizer;
        if (i3 > i4) {
            StringBuilder sb2 = new StringBuilder("Expected range (");
            sb2.append(i3);
            sb2.append(") to be ≤ viewportSize=");
            sb2.append(this.RemoteActionCompatParcelizer);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        float f = i;
        float f2 = this.IconCompatParcelizer;
        if (f >= f2 && i2 <= i4 + f2) {
            return getShowPopup.INSTANCE;
        }
        if (f >= f2) {
            i = i2 - i4;
        }
        Object objIconCompatParcelizer = IconCompatParcelizer(i, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    public final Object read(int i, int i2, SampleVideos<? super getShowPopup> sampleVideos) {
        if (i > i2) {
            StringBuilder sb = new StringBuilder("Expected min=");
            sb.append(i);
            sb.append(" ≤ max=");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int i3 = i2 - i;
        int i4 = this.RemoteActionCompatParcelizer;
        if (i3 > i4) {
            StringBuilder sb2 = new StringBuilder("Expected range (");
            sb2.append(i3);
            sb2.append(") to be ≤ viewportSize=");
            sb2.append(this.RemoteActionCompatParcelizer);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        float f = i;
        float f2 = this.IconCompatParcelizer;
        if (f >= f2 && i2 <= f2 + i4) {
            return getShowPopup.INSTANCE;
        }
        Object objIconCompatParcelizer = IconCompatParcelizer((i + (i3 / 2)) - (i4 / 2), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    public final int IconCompatParcelizer(int p0) {
        return getQues.write(p0 - getOnline.RemoteActionCompatParcelizer(this.IconCompatParcelizer), 0, this.RemoteActionCompatParcelizer);
    }

    public final Object IconCompatParcelizer(float f, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(f - this.IconCompatParcelizer, sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(float r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.ContextAttributesImpl.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r6
            o.ContextAttributesImpl$IconCompatParcelizer r0 = (o.ContextAttributesImpl.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.RemoteActionCompatParcelizer
            int r6 = r6 + r2
            r0.RemoteActionCompatParcelizer = r6
            goto L19
        L14:
            o.ContextAttributesImpl$IconCompatParcelizer r0 = new o.ContextAttributesImpl$IconCompatParcelizer
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L44
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.MagicModuleSubmissionRequestBody<java.lang.Float, o.SampleVideos<? super java.lang.Float>, java.lang.Object> r6 = r4.write
            java.lang.Float r5 = kotlin.QBankStatsResponse.write(r5)
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.IconCompatParcelizer
            float r6 = r6 + r5
            r4.IconCompatParcelizer = r6
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ContextAttributesImpl.RemoteActionCompatParcelizer(float, o.SampleVideos):java.lang.Object");
    }
}
