package kotlin;

import kotlin.a;

/* JADX INFO: loaded from: classes2.dex */
final class setGridBackgroundColor implements a, setRendererLeftYAxis {
    private a.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private final RadarChart read;

    static final class AudioAttributesCompatParcelizer<R> extends getTotalMcq {
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return setGridBackgroundColor.RemoteActionCompatParcelizer(setGridBackgroundColor.this, this);
        }
    }

    public final /* synthetic */ class write {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[a.AudioAttributesCompatParcelizer.values().length];
            try {
                iArr[a.AudioAttributesCompatParcelizer.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public setGridBackgroundColor(RadarChart radarChart) {
        toMagicModuleMetaRepoModel.write(radarChart, "");
        this.read = radarChart;
    }

    public static final /* synthetic */ Object RemoteActionCompatParcelizer(setGridBackgroundColor setgridbackgroundcolor, SampleVideos sampleVideos) {
        return setgridbackgroundcolor.AudioAttributesCompatParcelizer((a.AudioAttributesCompatParcelizer) null, (MagicModuleSubmissionRequestBody) null, sampleVideos);
    }

    public final RadarChart read() {
        return this.read;
    }

    @Override // kotlin.setRendererLeftYAxis
    public final setDrawHoleEnabled write() {
        return this.read;
    }

    @Override // kotlin.ValueClassBoxConverterdelegatingSerializer2
    public final <R> Object AudioAttributesCompatParcelizer(String str, getAnswerMap<? super setDrawEntryLabels, ? extends R> getanswermap, SampleVideos<? super R> sampleVideos) throws Exception {
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = this.read.IconCompatParcelizer(str);
        try {
            R rInvoke = getanswermap.invoke(setdrawentrylabelsIconCompatParcelizer);
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
            return rInvoke;
        } finally {
        }
    }

    @Override // kotlin.a
    public final <R> Object write(a.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, MagicModuleSubmissionRequestBody<? super setDrawValueAboveBar<R>, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super R> sampleVideos) {
        return AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, magicModuleSubmissionRequestBody, sampleVideos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <R> java.lang.Object AudioAttributesCompatParcelizer(o.a.AudioAttributesCompatParcelizer r7, kotlin.MagicModuleSubmissionRequestBody<? super kotlin.setDrawValueAboveBar<R>, ? super kotlin.SampleVideos<? super R>, ? extends java.lang.Object> r8, kotlin.SampleVideos<? super R> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof o.setGridBackgroundColor.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.setGridBackgroundColor$AudioAttributesCompatParcelizer r0 = (o.setGridBackgroundColor.AudioAttributesCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.RemoteActionCompatParcelizer
            int r9 = r9 + r2
            r0.RemoteActionCompatParcelizer = r9
            goto L19
        L14:
            o.setGridBackgroundColor$AudioAttributesCompatParcelizer r0 = new o.setGridBackgroundColor$AudioAttributesCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            java.lang.Object r6 = r0.write
            android.database.sqlite.SQLiteDatabase r6 = (android.database.sqlite.SQLiteDatabase) r6
            java.lang.Object r7 = r0.IconCompatParcelizer
            o.setGridBackgroundColor r7 = (kotlin.setGridBackgroundColor) r7
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L33 o.setDrawGridBackground.read -> L39
            goto L8c
        L33:
            r8 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
            goto Lb1
        L39:
            r8 = move-exception
            goto La1
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.RadarChart r9 = r6.read
            android.database.sqlite.SQLiteDatabase r9 = r9.IconCompatParcelizer()
            boolean r2 = r9.inTransaction()
            if (r2 != 0) goto L55
            r6.RemoteActionCompatParcelizer = r7
        L55:
            int[] r2 = o.setGridBackgroundColor.write.AudioAttributesCompatParcelizer
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r4) goto L73
            r2 = 2
            if (r7 == r2) goto L6f
            r2 = 3
            if (r7 != r2) goto L69
            r9.beginTransaction()
            goto L76
        L69:
            o.RenewEligibleCreator r6 = new o.RenewEligibleCreator
            r6.<init>()
            throw r6
        L6f:
            r9.beginTransactionNonExclusive()
            goto L76
        L73:
            r9.beginTransactionNonExclusive()
        L76:
            o.setGridBackgroundColor$read r7 = new o.setGridBackgroundColor$read     // Catch: java.lang.Throwable -> L9b o.setDrawGridBackground.read -> L9d
            r7.<init>()     // Catch: java.lang.Throwable -> L9b o.setDrawGridBackground.read -> L9d
            r0.IconCompatParcelizer = r6     // Catch: java.lang.Throwable -> L9b o.setDrawGridBackground.read -> L9d
            r0.write = r9     // Catch: java.lang.Throwable -> L9b o.setDrawGridBackground.read -> L9d
            r0.RemoteActionCompatParcelizer = r4     // Catch: java.lang.Throwable -> L9b o.setDrawGridBackground.read -> L9d
            java.lang.Object r7 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L9b o.setDrawGridBackground.read -> L9d
            if (r7 != r1) goto L88
            return r1
        L88:
            r5 = r7
            r7 = r6
            r6 = r9
            r9 = r5
        L8c:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L33 o.setDrawGridBackground.read -> L39
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto L9a
            r7.RemoteActionCompatParcelizer = r3
        L9a:
            return r9
        L9b:
            r7 = move-exception
            goto Lb3
        L9d:
            r7 = move-exception
            r8 = r7
            r7 = r6
            r6 = r9
        La1:
            java.lang.Object r8 = r8.RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> L33
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto Lb0
            r7.RemoteActionCompatParcelizer = r3
        Lb0:
            return r8
        Lb1:
            r9 = r7
            r7 = r8
        Lb3:
            r9.endTransaction()
            boolean r8 = r9.inTransaction()
            if (r8 != 0) goto Lbe
            r6.RemoteActionCompatParcelizer = r3
        Lbe:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setGridBackgroundColor.AudioAttributesCompatParcelizer(o.a$AudioAttributesCompatParcelizer, o.MagicModuleSubmissionRequestBody, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.a
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.read.IconCompatParcelizer().inTransaction());
    }

    final class read<T> implements setDrawValueAboveBar<T>, setRendererLeftYAxis {
        public read() {
        }

        @Override // kotlin.setRendererLeftYAxis
        public final setDrawHoleEnabled write() {
            return setGridBackgroundColor.this.write();
        }

        @Override // kotlin.ValueClassBoxConverterdelegatingSerializer2
        public final <R> Object AudioAttributesCompatParcelizer(String str, getAnswerMap<? super setDrawEntryLabels, ? extends R> getanswermap, SampleVideos<? super R> sampleVideos) {
            return setGridBackgroundColor.this.AudioAttributesCompatParcelizer(str, getanswermap, sampleVideos);
        }
    }
}
