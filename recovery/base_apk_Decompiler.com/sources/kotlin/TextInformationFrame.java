package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00020\t*\u00020\b2\u0006\u0010\u0003\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/TextInformationFrame;", "Lo/CoordinatorLayout;", "Lo/performClickableSpanAction;", "p0", "Lo/ApicFrame;", "p1", "<init>", "(Lo/performClickableSpanAction;Lo/ApicFrame;)V", "Lo/checkSelfPermission;", "", "AudioAttributesCompatParcelizer", "(Lo/checkSelfPermission;FLo/SampleVideos;)Ljava/lang/Object;", "read", "Lo/performClickableSpanAction;", "IconCompatParcelizer", "Lo/ApicFrame;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TextInformationFrame implements CoordinatorLayout {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final ApicFrame write;
    private final performClickableSpanAction read;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return TextInformationFrame.this.AudioAttributesCompatParcelizer(null, BitmapDescriptorFactory.HUE_RED, this);
        }
    }

    public TextInformationFrame(performClickableSpanAction performclickablespanaction, ApicFrame apicFrame) {
        this.read = performclickablespanaction;
        this.write = apicFrame;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.CoordinatorLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(final kotlin.checkSelfPermission r5, float r6, kotlin.SampleVideos<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.TextInformationFrame.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.TextInformationFrame$RemoteActionCompatParcelizer r0 = (o.TextInformationFrame.RemoteActionCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.TextInformationFrame$RemoteActionCompatParcelizer r0 = new o.TextInformationFrame$RemoteActionCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L45
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.performClickableSpanAction r7 = r4.read
            o.PrivFrame r2 = new o.PrivFrame
            r2.<init>()
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r7 = r7.write(r5, r6, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            o.ApicFrame r6 = r4.write
            float r6 = r6.MediaDescriptionCompat()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L76
            o.ApicFrame r6 = r4.write
            float r6 = r6.MediaDescriptionCompat()
            float r6 = java.lang.Math.abs(r6)
            double r0 = (double) r6
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L76
            o.ApicFrame r4 = r4.write
            int r6 = r4.AudioAttributesImplApi21Parcelizer()
            r0 = 2
            r1 = 0
            kotlin.ApicFrame.IconCompatParcelizer$default(r4, r6, r7, r0, r1)
            goto L7b
        L76:
            o.ApicFrame r4 = r4.write
            r4.MediaDescriptionCompat()
        L7b:
            java.lang.Float r4 = kotlin.QBankStatsResponse.write(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TextInformationFrame.AudioAttributesCompatParcelizer(o.checkSelfPermission, float, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(TextInformationFrame textInformationFrame, checkSelfPermission checkselfpermission, float f) {
        textInformationFrame.write.read(checkselfpermission, getOnline.RemoteActionCompatParcelizer(textInformationFrame.write.onPause() != 0 ? f / textInformationFrame.write.onPause() : BitmapDescriptorFactory.HUE_RED) + textInformationFrame.write.AudioAttributesImplApi21Parcelizer());
        return getShowPopup.INSTANCE;
    }
}
