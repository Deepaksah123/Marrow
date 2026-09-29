package kotlin;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0003\u000f\u0010\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J9\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/paging/SingleRunner;", "", "cancelPreviousInEqualPriority", "", "(Z)V", "holder", "Landroidx/paging/SingleRunner$Holder;", "runInIsolation", "", "priority", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelIsolatedRunnerException", "Companion", "Holder", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class getStaticJsonValueGetter {
    public static final write IconCompatParcelizer = new write(null);
    private final read AudioAttributesCompatParcelizer;

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return getStaticJsonValueGetter.this.AudioAttributesCompatParcelizer(0, null, this);
        }
    }

    public getStaticJsonValueGetter(boolean z) {
        this.AudioAttributesCompatParcelizer = new read(this, z);
    }

    public /* synthetic */ getStaticJsonValueGetter(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? true : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o.getStaticJsonValueGetter] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(int r5, kotlin.getAnswerMap<? super kotlin.SampleVideos<? super kotlin.getShowPopup>, ? extends java.lang.Object> r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.getStaticJsonValueGetter.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.getStaticJsonValueGetter$RemoteActionCompatParcelizer r0 = (o.getStaticJsonValueGetter.RemoteActionCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.write
            int r7 = r7 + r2
            r0.write = r7
            goto L19
        L14:
            o.getStaticJsonValueGetter$RemoteActionCompatParcelizer r0 = new o.getStaticJsonValueGetter$RemoteActionCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
            o.getStaticJsonValueGetter r4 = (kotlin.getStaticJsonValueGetter) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)     // Catch: o.getStaticJsonValueGetter.IconCompatParcelizer -> L4c
            goto L53
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getStaticJsonValueGetter$AudioAttributesCompatParcelizer r7 = new o.getStaticJsonValueGetter$AudioAttributesCompatParcelizer     // Catch: o.getStaticJsonValueGetter.IconCompatParcelizer -> L4c
            r2 = 0
            r7.<init>(r5, r6, r2)     // Catch: o.getStaticJsonValueGetter.IconCompatParcelizer -> L4c
            o.MagicModuleSubmissionRequestBody r7 = (kotlin.MagicModuleSubmissionRequestBody) r7     // Catch: o.getStaticJsonValueGetter.IconCompatParcelizer -> L4c
            r0.AudioAttributesCompatParcelizer = r4     // Catch: o.getStaticJsonValueGetter.IconCompatParcelizer -> L4c
            r0.write = r3     // Catch: o.getStaticJsonValueGetter.IconCompatParcelizer -> L4c
            java.lang.Object r4 = kotlin.College.IconCompatParcelizer(r7, r0)     // Catch: o.getStaticJsonValueGetter.IconCompatParcelizer -> L4c
            if (r4 != r1) goto L53
            return r1
        L4c:
            r5 = move-exception
            o.getStaticJsonValueGetter r6 = r5.write()
            if (r6 != r4) goto L56
        L53:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStaticJsonValueGetter.AudioAttributesCompatParcelizer(int, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        final /* synthetic */ getAnswerMap<SampleVideos<? super getShowPopup>, Object> read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        
            if (r9 != r0) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v16, types: [o.getStaticJsonValueGetter$read] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.setPassingYear] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [o.setPassingYear] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3, types: [o.SampleVideos] */
        /* JADX WARN: Type inference failed for: r3v2, types: [o.getStaticJsonValueGetter$read] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o.getStaticJsonValueGetter$AudioAttributesCompatParcelizer] */
        /* JADX WARN: Type inference failed for: r9v1, types: [o.getStaticJsonValueGetter$AudioAttributesCompatParcelizer] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r9.write
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3c
                if (r1 == r5) goto L34
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L25
                if (r1 == r2) goto L1c
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L1c:
                java.lang.Object r9 = r9.RemoteActionCompatParcelizer
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto La9
            L25:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto Laa
            L2a:
                java.lang.Object r1 = r9.RemoteActionCompatParcelizer
                o.setPassingYear r1 = (kotlin.setPassingYear) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L32
                goto L7f
            L32:
                r10 = move-exception
                goto L94
            L34:
                java.lang.Object r1 = r9.RemoteActionCompatParcelizer
                o.setPassingYear r1 = (kotlin.setPassingYear) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L6b
            L3c:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                java.lang.Object r10 = r9.RemoteActionCompatParcelizer
                o.TopUserCompanion r10 = (kotlin.TopUserCompanion) r10
                o.CurrentQuery r10 = r10.getIconCompatParcelizer()
                o.setPassingYear$write r1 = kotlin.setPassingYear.b_
                o.CurrentQuery$IconCompatParcelizer r1 = (o.CurrentQuery.IconCompatParcelizer) r1
                o.CurrentQuery$write r10 = r10.get(r1)
                if (r10 == 0) goto Lae
                o.setPassingYear r10 = (kotlin.setPassingYear) r10
                o.getStaticJsonValueGetter r1 = kotlin.getStaticJsonValueGetter.this
                o.getStaticJsonValueGetter$read r1 = kotlin.getStaticJsonValueGetter.RemoteActionCompatParcelizer(r1)
                int r6 = r9.AudioAttributesCompatParcelizer
                r7 = r9
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r9.RemoteActionCompatParcelizer = r10
                r9.write = r5
                java.lang.Object r1 = r1.RemoteActionCompatParcelizer(r6, r10, r7)
                if (r1 == r0) goto Lad
                r8 = r1
                r1 = r10
                r10 = r8
            L6b:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Laa
                o.getAnswerMap<o.SampleVideos<? super o.getShowPopup>, java.lang.Object> r10 = r9.read     // Catch: java.lang.Throwable -> L32
                r9.RemoteActionCompatParcelizer = r1     // Catch: java.lang.Throwable -> L32
                r9.write = r4     // Catch: java.lang.Throwable -> L32
                java.lang.Object r10 = r10.invoke(r9)     // Catch: java.lang.Throwable -> L32
                if (r10 == r0) goto Lad
            L7f:
                o.getStaticJsonValueGetter r10 = kotlin.getStaticJsonValueGetter.this
                o.getStaticJsonValueGetter$read r10 = kotlin.getStaticJsonValueGetter.RemoteActionCompatParcelizer(r10)
                r2 = r9
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r4 = 0
                r9.RemoteActionCompatParcelizer = r4
                r9.write = r3
                java.lang.Object r9 = r10.AudioAttributesCompatParcelizer(r1, r2)
                if (r9 != r0) goto Laa
                goto Lad
            L94:
                o.getStaticJsonValueGetter r3 = kotlin.getStaticJsonValueGetter.this
                o.getStaticJsonValueGetter$read r3 = kotlin.getStaticJsonValueGetter.RemoteActionCompatParcelizer(r3)
                r4 = r9
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r9.RemoteActionCompatParcelizer = r10
                r9.write = r2
                java.lang.Object r9 = r3.AudioAttributesCompatParcelizer(r1, r4)
                if (r9 != r0) goto La8
                goto Lad
            La8:
                r9 = r10
            La9:
                throw r9
            Laa:
                o.getShowPopup r9 = kotlin.getShowPopup.INSTANCE
                return r9
            Lad:
                return r0
            Lae:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "Internal error. coroutineScope should've created a job."
                java.lang.String r10 = r10.toString()
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getStaticJsonValueGetter.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(int i, getAnswerMap<? super SampleVideos<? super getShowPopup>, ? extends Object> getanswermap, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
            this.read = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getStaticJsonValueGetter.this.new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = obj;
            return audioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public getStaticJsonValueGetter() {
        this(false, 1, null);
    }

    static final class IconCompatParcelizer extends CancellationException {
        private final getStaticJsonValueGetter RemoteActionCompatParcelizer;

        public IconCompatParcelizer(getStaticJsonValueGetter getstaticjsonvaluegetter) {
            toMagicModuleMetaRepoModel.write(getstaticjsonvaluegetter, "");
            this.RemoteActionCompatParcelizer = getstaticjsonvaluegetter;
        }

        public final getStaticJsonValueGetter write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    static final class read {
        private final setDownloadPercent AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private setPassingYear RemoteActionCompatParcelizer;
        private final getStaticJsonValueGetter read;
        private int write;

        static final class AudioAttributesCompatParcelizer extends getTotalMcq {
            Object AudioAttributesCompatParcelizer;
            /* synthetic */ Object IconCompatParcelizer;
            int RemoteActionCompatParcelizer;
            Object read;
            Object write;

            AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                super(sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.IconCompatParcelizer = obj;
                this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
                return read.this.AudioAttributesCompatParcelizer(null, this);
            }
        }

        static final class IconCompatParcelizer extends getTotalMcq {
            int AudioAttributesCompatParcelizer;
            Object IconCompatParcelizer;
            /* synthetic */ Object MediaBrowserCompatItemReceiver;
            Object RemoteActionCompatParcelizer;
            int read;
            Object write;

            IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.MediaBrowserCompatItemReceiver = obj;
                this.read |= Integer.MIN_VALUE;
                return read.this.RemoteActionCompatParcelizer(0, null, this);
            }
        }

        public read(getStaticJsonValueGetter getstaticjsonvaluegetter, boolean z) {
            toMagicModuleMetaRepoModel.write(getstaticjsonvaluegetter, "");
            this.read = getstaticjsonvaluegetter;
            this.IconCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = setEncryptSalt.AudioAttributesCompatParcelizer(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /* JADX WARN: Type inference failed for: r10v0, types: [int] */
        /* JADX WARN: Type inference failed for: r10v1, types: [o.setDownloadPercent] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v4, types: [o.setDownloadPercent] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v4, types: [int] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object RemoteActionCompatParcelizer(int r10, kotlin.setPassingYear r11, kotlin.SampleVideos<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof o.getStaticJsonValueGetter.read.IconCompatParcelizer
                if (r0 == 0) goto L14
                r0 = r12
                o.getStaticJsonValueGetter$read$IconCompatParcelizer r0 = (o.getStaticJsonValueGetter.read.IconCompatParcelizer) r0
                int r1 = r0.read
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r12 = r0.read
                int r12 = r12 + r2
                r0.read = r12
                goto L19
            L14:
                o.getStaticJsonValueGetter$read$IconCompatParcelizer r0 = new o.getStaticJsonValueGetter$read$IconCompatParcelizer
                r0.<init>(r12)
            L19:
                java.lang.Object r12 = r0.MediaBrowserCompatItemReceiver
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.read
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L5e
                if (r2 == r5) goto L48
                if (r2 != r3) goto L40
                int r9 = r0.AudioAttributesCompatParcelizer
                java.lang.Object r10 = r0.RemoteActionCompatParcelizer
                o.setDownloadPercent r10 = (kotlin.setDownloadPercent) r10
                java.lang.Object r11 = r0.write
                o.setPassingYear r11 = (kotlin.setPassingYear) r11
                java.lang.Object r0 = r0.IconCompatParcelizer
                o.getStaticJsonValueGetter$read r0 = (o.getStaticJsonValueGetter.read) r0
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)     // Catch: java.lang.Throwable -> L3d
                goto Lb2
            L3d:
                r9 = move-exception
                goto Lc1
            L40:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L48:
                int r10 = r0.AudioAttributesCompatParcelizer
                java.lang.Object r9 = r0.RemoteActionCompatParcelizer
                o.setDownloadPercent r9 = (kotlin.setDownloadPercent) r9
                java.lang.Object r11 = r0.write
                o.setPassingYear r11 = (kotlin.setPassingYear) r11
                java.lang.Object r2 = r0.IconCompatParcelizer
                o.getStaticJsonValueGetter$read r2 = (o.getStaticJsonValueGetter.read) r2
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r2
                goto L77
            L5e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                o.setDownloadPercent r12 = r9.AudioAttributesCompatParcelizer
                r0.IconCompatParcelizer = r9
                r0.write = r11
                r0.RemoteActionCompatParcelizer = r12
                r0.AudioAttributesCompatParcelizer = r10
                r0.read = r5
                java.lang.Object r2 = r12.RemoteActionCompatParcelizer(r4, r0)
                if (r2 == r1) goto Lc5
                r8 = r11
                r11 = r10
                r10 = r12
                r12 = r8
            L77:
                o.setPassingYear r2 = r9.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L3d
                if (r2 == 0) goto L8e
                boolean r6 = r2.read()     // Catch: java.lang.Throwable -> L3d
                if (r6 == 0) goto L8e
                int r6 = r9.write     // Catch: java.lang.Throwable -> L3d
                if (r6 < r11) goto L8e
                if (r6 != r11) goto L8c
                boolean r6 = r9.IconCompatParcelizer     // Catch: java.lang.Throwable -> L3d
                if (r6 == 0) goto L8c
                goto L8e
            L8c:
                r5 = 0
                goto Lb9
            L8e:
                if (r2 == 0) goto L9c
                o.getStaticJsonValueGetter$IconCompatParcelizer r6 = new o.getStaticJsonValueGetter$IconCompatParcelizer     // Catch: java.lang.Throwable -> L3d
                o.getStaticJsonValueGetter r7 = r9.read     // Catch: java.lang.Throwable -> L3d
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L3d
                java.util.concurrent.CancellationException r6 = (java.util.concurrent.CancellationException) r6     // Catch: java.lang.Throwable -> L3d
                r2.RemoteActionCompatParcelizer(r6)     // Catch: java.lang.Throwable -> L3d
            L9c:
                if (r2 == 0) goto Lb5
                r0.IconCompatParcelizer = r9     // Catch: java.lang.Throwable -> L3d
                r0.write = r12     // Catch: java.lang.Throwable -> L3d
                r0.RemoteActionCompatParcelizer = r10     // Catch: java.lang.Throwable -> L3d
                r0.AudioAttributesCompatParcelizer = r11     // Catch: java.lang.Throwable -> L3d
                r0.read = r3     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r0 = r2.a_(r0)     // Catch: java.lang.Throwable -> L3d
                if (r0 != r1) goto Laf
                goto Lc5
            Laf:
                r0 = r9
                r9 = r11
                r11 = r12
            Lb2:
                r12 = r11
                r11 = r9
                r9 = r0
            Lb5:
                r9.RemoteActionCompatParcelizer = r12     // Catch: java.lang.Throwable -> L3d
                r9.write = r11     // Catch: java.lang.Throwable -> L3d
            Lb9:
                java.lang.Boolean r9 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)     // Catch: java.lang.Throwable -> L3d
                r10.write(r4)
                return r9
            Lc1:
                r10.write(r4)
                throw r9
            Lc5:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getStaticJsonValueGetter.read.RemoteActionCompatParcelizer(int, o.setPassingYear, o.SampleVideos):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.setPassingYear r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.getStaticJsonValueGetter.read.AudioAttributesCompatParcelizer
                if (r0 == 0) goto L14
                r0 = r7
                o.getStaticJsonValueGetter$read$AudioAttributesCompatParcelizer r0 = (o.getStaticJsonValueGetter.read.AudioAttributesCompatParcelizer) r0
                int r1 = r0.RemoteActionCompatParcelizer
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r7 = r0.RemoteActionCompatParcelizer
                int r7 = r7 + r2
                r0.RemoteActionCompatParcelizer = r7
                goto L19
            L14:
                o.getStaticJsonValueGetter$read$AudioAttributesCompatParcelizer r0 = new o.getStaticJsonValueGetter$read$AudioAttributesCompatParcelizer
                r0.<init>(r7)
            L19:
                java.lang.Object r7 = r0.IconCompatParcelizer
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.RemoteActionCompatParcelizer
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L41
                if (r2 != r3) goto L39
                java.lang.Object r5 = r0.AudioAttributesCompatParcelizer
                o.setDownloadPercent r5 = (kotlin.setDownloadPercent) r5
                java.lang.Object r6 = r0.read
                o.setPassingYear r6 = (kotlin.setPassingYear) r6
                java.lang.Object r0 = r0.write
                o.getStaticJsonValueGetter$read r0 = (o.getStaticJsonValueGetter.read) r0
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                r7 = r5
                r5 = r0
                goto L55
            L39:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L41:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                o.setDownloadPercent r7 = r5.AudioAttributesCompatParcelizer
                r0.write = r5
                r0.read = r6
                r0.AudioAttributesCompatParcelizer = r7
                r0.RemoteActionCompatParcelizer = r3
                java.lang.Object r0 = r7.RemoteActionCompatParcelizer(r4, r0)
                if (r0 != r1) goto L55
                return r1
            L55:
                o.setPassingYear r0 = r5.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L63
                if (r6 != r0) goto L5b
                r5.RemoteActionCompatParcelizer = r4     // Catch: java.lang.Throwable -> L63
            L5b:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE     // Catch: java.lang.Throwable -> L63
                r7.write(r4)
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L63:
                r5 = move-exception
                r7.write(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getStaticJsonValueGetter.read.AudioAttributesCompatParcelizer(o.setPassingYear, o.SampleVideos):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getStaticJsonValueGetter$write;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
