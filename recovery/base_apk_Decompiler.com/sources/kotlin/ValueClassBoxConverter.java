package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueClassBoxConverter {
    private final getResolutionSize<int[]> IconCompatParcelizer;

    static final class write extends getTotalMcq {
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return ValueClassBoxConverter.this.IconCompatParcelizer(null, this);
        }
    }

    public ValueClassBoxConverter(int i) {
        this.IconCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new int[i]);
    }

    public final void AudioAttributesCompatParcelizer(Set<Integer> set) {
        int[] iArrIconCompatParcelizer;
        int[] iArr;
        int i;
        toMagicModuleMetaRepoModel.write(set, "");
        if (set.isEmpty()) {
            return;
        }
        getResolutionSize<int[]> getresolutionsize = this.IconCompatParcelizer;
        do {
            iArrIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            int[] iArr2 = iArrIconCompatParcelizer;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                if (set.contains(Integer.valueOf(i2))) {
                    i = iArr2[i2] + 1;
                } else {
                    i = iArr2[i2];
                }
                iArr[i2] = i;
            }
        } while (!getresolutionsize.AudioAttributesCompatParcelizer(iArrIconCompatParcelizer, iArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.getValidationToken<? super int[]> r5, kotlin.SampleVideos<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.ValueClassBoxConverter.write
            if (r0 == 0) goto L14
            r0 = r6
            o.ValueClassBoxConverter$write r0 = (o.ValueClassBoxConverter.write) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.read
            int r6 = r6 + r2
            r0.read = r6
            goto L19
        L14:
            o.ValueClassBoxConverter$write r0 = new o.ValueClassBoxConverter$write
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            goto L40
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getResolutionSize<int[]> r4 = r4.IconCompatParcelizer
            r0.read = r3
            java.lang.Object r4 = r4.write(r5, r0)
            if (r4 != r1) goto L40
            return r1
        L40:
            o.PlanDetailsCreator r4 = new o.PlanDetailsCreator
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ValueClassBoxConverter.IconCompatParcelizer(o.getValidationToken, o.SampleVideos):java.lang.Object");
    }
}
