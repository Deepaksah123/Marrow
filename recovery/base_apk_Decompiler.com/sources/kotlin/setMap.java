package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class setMap {

    /* JADX INFO: loaded from: classes.dex */
    public static final class AudioAttributesCompatParcelizer<T> extends getTotalMcq {
        public static int AudioAttributesCompatParcelizer;
        public static int read;
        int IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        /* synthetic */ Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return setMap.write(null, null, null, this);
        }

        public static int read() {
            int i = read;
            int i2 = i % 7927654;
            read = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int iMyTid = Process.myTid();
            AudioAttributesCompatParcelizer = iMyTid;
            return iMyTid;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class RemoteActionCompatParcelizer<T> implements NewNumberOtpResendRequest<T> {
        private /* synthetic */ NewNumberOtpResendRequest read;
        private /* synthetic */ MagicModuleSubmissionRequestBody write;

        /* JADX INFO: renamed from: o.setMap$RemoteActionCompatParcelizer$2, reason: invalid class name */
        public static final class AnonymousClass2 extends getTotalMcq {
            Object AudioAttributesCompatParcelizer;
            int IconCompatParcelizer;
            Object RemoteActionCompatParcelizer;
            /* synthetic */ Object read;
            Object write;

            public AnonymousClass2(SampleVideos sampleVideos) {
                super(sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.read = obj;
                this.IconCompatParcelizer |= Integer.MIN_VALUE;
                return RemoteActionCompatParcelizer.this.write(null, this);
            }
        }

        public RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, NewNumberOtpResendRequest newNumberOtpResendRequest) {
            this.write = magicModuleSubmissionRequestBody;
            this.read = newNumberOtpResendRequest;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
        
            if (r6.write(r7, r0) != r1) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlin.NewNumberOtpResendRequest
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object write(kotlin.getValidationToken<? super T> r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.setMap.RemoteActionCompatParcelizer.AnonymousClass2
                if (r0 == 0) goto L14
                r0 = r8
                o.setMap$RemoteActionCompatParcelizer$2 r0 = (o.setMap.RemoteActionCompatParcelizer.AnonymousClass2) r0
                int r1 = r0.IconCompatParcelizer
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.IconCompatParcelizer
                int r8 = r8 + r2
                r0.IconCompatParcelizer = r8
                goto L19
            L14:
                o.setMap$RemoteActionCompatParcelizer$2 r0 = new o.setMap$RemoteActionCompatParcelizer$2
                r0.<init>(r8)
            L19:
                java.lang.Object r8 = r0.read
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.IconCompatParcelizer
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L47
                if (r2 == r4) goto L35
                if (r2 != r3) goto L2d
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                goto L7e
            L2d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L35:
                java.lang.Object r6 = r0.AudioAttributesCompatParcelizer
                o.getSeekCount r6 = (kotlin.getSeekCount) r6
                java.lang.Object r7 = r0.write
                o.getValidationToken r7 = (kotlin.getValidationToken) r7
                java.lang.Object r2 = r0.RemoteActionCompatParcelizer
                o.setMap$RemoteActionCompatParcelizer r2 = (o.setMap.RemoteActionCompatParcelizer) r2
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.lang.Throwable -> L45
                goto L69
            L45:
                r7 = move-exception
                goto L85
            L47:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                r8 = r0
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                o.CurrentQuery r8 = r0.getContext()
                o.getSeekCount r2 = new o.getSeekCount
                r2.<init>(r7, r8)
                o.MagicModuleSubmissionRequestBody r8 = r6.write     // Catch: java.lang.Throwable -> L82
                r0.RemoteActionCompatParcelizer = r6     // Catch: java.lang.Throwable -> L82
                r0.write = r7     // Catch: java.lang.Throwable -> L82
                r0.AudioAttributesCompatParcelizer = r2     // Catch: java.lang.Throwable -> L82
                r0.IconCompatParcelizer = r4     // Catch: java.lang.Throwable -> L82
                java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L82
                if (r8 == r1) goto L81
                r5 = r2
                r2 = r6
                r6 = r5
            L69:
                r6.releaseIntercepted()
                o.NewNumberOtpResendRequest r6 = r2.read
                r8 = 0
                r0.RemoteActionCompatParcelizer = r8
                r0.write = r8
                r0.AudioAttributesCompatParcelizer = r8
                r0.IconCompatParcelizer = r3
                java.lang.Object r6 = r6.write(r7, r0)
                if (r6 != r1) goto L7e
                goto L81
            L7e:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L81:
                return r1
            L82:
                r6 = move-exception
                r7 = r6
                r6 = r2
            L85:
                r6.releaseIntercepted()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMap.RemoteActionCompatParcelizer.write(o.getValidationToken, o.SampleVideos):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class write<T> implements NewNumberOtpResendRequest<T> {
        private /* synthetic */ getModuleData AudioAttributesCompatParcelizer;
        private /* synthetic */ NewNumberOtpResendRequest IconCompatParcelizer;

        /* JADX INFO: renamed from: o.setMap$write$3, reason: invalid class name */
        public static final class AnonymousClass3 extends getTotalMcq {
            int AudioAttributesCompatParcelizer;
            Object IconCompatParcelizer;
            /* synthetic */ Object RemoteActionCompatParcelizer;
            Object write;

            public AnonymousClass3(SampleVideos sampleVideos) {
                super(sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.RemoteActionCompatParcelizer = obj;
                this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
                return write.this.write(null, this);
            }
        }

        public write(NewNumberOtpResendRequest newNumberOtpResendRequest, getModuleData getmoduledata) {
            this.IconCompatParcelizer = newNumberOtpResendRequest;
            this.AudioAttributesCompatParcelizer = getmoduledata;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlin.NewNumberOtpResendRequest
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object write(kotlin.getValidationToken<? super T> r9, kotlin.SampleVideos<? super kotlin.getShowPopup> r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof o.setMap.write.AnonymousClass3
                if (r0 == 0) goto L14
                r0 = r10
                o.setMap$write$3 r0 = (o.setMap.write.AnonymousClass3) r0
                int r1 = r0.AudioAttributesCompatParcelizer
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r10 = r0.AudioAttributesCompatParcelizer
                int r10 = r10 + r2
                r0.AudioAttributesCompatParcelizer = r10
                goto L19
            L14:
                o.setMap$write$3 r0 = new o.setMap$write$3
                r0.<init>(r10)
            L19:
                java.lang.Object r10 = r0.RemoteActionCompatParcelizer
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.AudioAttributesCompatParcelizer
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L47
                if (r2 == r4) goto L3f
                if (r2 != r3) goto L37
                java.lang.Object r8 = r0.write
                o.getSeekCount r8 = (kotlin.getSeekCount) r8
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L35
                goto L80
            L35:
                r9 = move-exception
                goto L89
            L37:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3f:
                java.lang.Object r8 = r0.write
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto La7
            L47:
                java.lang.Object r8 = r0.IconCompatParcelizer
                r9 = r8
                o.getValidationToken r9 = (kotlin.getValidationToken) r9
                java.lang.Object r8 = r0.write
                o.setMap$write r8 = (o.setMap.write) r8
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L8d
                goto L68
            L54:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                r10 = r0
                o.SampleVideos r10 = (kotlin.SampleVideos) r10
                o.NewNumberOtpResendRequest r10 = r8.IconCompatParcelizer     // Catch: java.lang.Throwable -> L8d
                r0.write = r8     // Catch: java.lang.Throwable -> L8d
                r0.IconCompatParcelizer = r9     // Catch: java.lang.Throwable -> L8d
                r0.AudioAttributesCompatParcelizer = r5     // Catch: java.lang.Throwable -> L8d
                java.lang.Object r10 = r10.write(r9, r0)     // Catch: java.lang.Throwable -> L8d
                if (r10 == r1) goto La6
            L68:
                o.CurrentQuery r10 = r0.getContext()
                o.getSeekCount r2 = new o.getSeekCount
                r2.<init>(r9, r10)
                o.getModuleData r8 = r8.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L86
                r0.write = r2     // Catch: java.lang.Throwable -> L86
                r0.IconCompatParcelizer = r6     // Catch: java.lang.Throwable -> L86
                r0.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Throwable -> L86
                java.lang.Object r8 = r8.AudioAttributesCompatParcelizer(r2, r6, r0)     // Catch: java.lang.Throwable -> L86
                if (r8 == r1) goto La6
                r8 = r2
            L80:
                r8.releaseIntercepted()
                o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
                return r8
            L86:
                r8 = move-exception
                r9 = r8
                r8 = r2
            L89:
                r8.releaseIntercepted()
                throw r9
            L8d:
                r9 = move-exception
                r7 = r9
                r9 = r8
                r8 = r7
                o.getPytMcqId r10 = new o.getPytMcqId
                r10.<init>(r8)
                o.getValidationToken r10 = (kotlin.getValidationToken) r10
                o.getModuleData r9 = r9.AudioAttributesCompatParcelizer
                r0.write = r8
                r0.IconCompatParcelizer = r6
                r0.AudioAttributesCompatParcelizer = r4
                java.lang.Object r9 = kotlin.setMap.AudioAttributesCompatParcelizer(r10, r9, r8, r0)
                if (r9 != r1) goto La7
            La6:
                return r1
            La7:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMap.write.write(o.getValidationToken, o.SampleVideos):java.lang.Object");
        }
    }

    public static final void read(getValidationToken<?> getvalidationtoken) {
        if (getvalidationtoken instanceof getPytMcqId) {
            throw ((getPytMcqId) getvalidationtoken).RemoteActionCompatParcelizer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object write(kotlin.getValidationToken<? super T> r4, kotlin.getModuleData<? super kotlin.getValidationToken<? super T>, ? super java.lang.Throwable, ? super kotlin.SampleVideos<? super kotlin.getShowPopup>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
        /*
            boolean r0 = r7 instanceof o.setMap.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.setMap$AudioAttributesCompatParcelizer r0 = (o.setMap.AudioAttributesCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.IconCompatParcelizer
            int r7 = r7 + r2
            r0.IconCompatParcelizer = r7
            goto L19
        L14:
            o.setMap$AudioAttributesCompatParcelizer r0 = new o.setMap$AudioAttributesCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.RemoteActionCompatParcelizer
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)     // Catch: java.lang.Throwable -> L48
            goto L45
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            r0.RemoteActionCompatParcelizer = r6     // Catch: java.lang.Throwable -> L48
            r0.IconCompatParcelizer = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r5.AudioAttributesCompatParcelizer(r4, r6, r0)     // Catch: java.lang.Throwable -> L48
            if (r4 != r1) goto L45
            return r1
        L45:
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        L48:
            r4 = move-exception
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            kotlin.getPlanName.IconCompatParcelizer(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMap.write(o.getValidationToken, o.getModuleData, java.lang.Throwable, o.SampleVideos):java.lang.Object");
    }

    public static final <T> NewNumberOtpResendRequest<T> read(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, MagicModuleSubmissionRequestBody<? super getValidationToken<? super T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        return new RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, newNumberOtpResendRequest);
    }

    public static final <T> NewNumberOtpResendRequest<T> AudioAttributesCompatParcelizer(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, getModuleData<? super getValidationToken<? super T>, ? super Throwable, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata) {
        return new write(newNumberOtpResendRequest, getmoduledata);
    }
}
