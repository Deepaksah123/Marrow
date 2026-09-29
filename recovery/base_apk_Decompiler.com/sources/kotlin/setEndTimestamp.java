package kotlin;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setEndTimestamp {

    static final class read extends getTotalMcq {
        Object IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return setEndTimestamp.read(null, this);
        }
    }

    public static final <T> Object IconCompatParcelizer(getYearOfAdmission<? extends T>[] getyearofadmissionArr, SampleVideos<? super List<? extends T>> sampleVideos) {
        return getyearofadmissionArr.length == 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : new setFromDetailApi(getyearofadmissionArr).AudioAttributesCompatParcelizer(sampleVideos);
    }

    public static final <T> Object AudioAttributesCompatParcelizer(Collection<? extends getYearOfAdmission<? extends T>> collection, SampleVideos<? super List<? extends T>> sampleVideos) {
        return collection.isEmpty() ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : new setFromDetailApi((getYearOfAdmission[]) collection.toArray(new getYearOfAdmission[0])).AudioAttributesCompatParcelizer(sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object read(java.util.Collection<? extends kotlin.setPassingYear> r4, kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            boolean r0 = r5 instanceof o.setEndTimestamp.read
            if (r0 == 0) goto L14
            r0 = r5
            o.setEndTimestamp$read r0 = (o.setEndTimestamp.read) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.write
            int r5 = r5 + r2
            r0.write = r5
            goto L19
        L14:
            o.setEndTimestamp$read r0 = new o.setEndTimestamp$read
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.IconCompatParcelizer
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L3f
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.next()
            o.setPassingYear r5 = (kotlin.setPassingYear) r5
            r0.IconCompatParcelizer = r4
            r0.write = r3
            java.lang.Object r5 = r5.a_(r0)
            if (r5 != r1) goto L3f
            return r1
        L56:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setEndTimestamp.read(java.util.Collection, o.SampleVideos):java.lang.Object");
    }
}
