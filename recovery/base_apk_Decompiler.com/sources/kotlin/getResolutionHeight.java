package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class getResolutionHeight {
    static {
        VideoPlaybackConfiguration.RemoteActionCompatParcelizer("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);
    }

    public static final <T> NewNumberOtpResendRequest<T> write(Iterable<? extends NewNumberOtpResendRequest<? extends T>> iterable) {
        return new getLandscapeDurationMs(iterable, null, 0, null, 14, null);
    }

    public static final <T> NewNumberOtpResendRequest<T> RemoteActionCompatParcelizer(NewNumberOtpResendRequest<? extends T>... newNumberOtpResendRequestArr) {
        return VerifyNewNumberRequest.write(getOrderDetails.RemoteActionCompatParcelizer(newNumberOtpResendRequestArr));
    }

    public static final <T, R> NewNumberOtpResendRequest<R> IconCompatParcelizer(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, getModuleData<? super getValidationToken<? super R>, ? super T, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata) {
        return new getGeolocation(getmoduledata, newNumberOtpResendRequest, null, 0, null, 28, null);
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    static final class RemoteActionCompatParcelizer<R, T> extends getMagicModuleStats implements getModuleData<getValidationToken<? super R>, T, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ MagicModuleSubmissionRequestBody<T, SampleVideos<? super R>, Object> AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;
        private /* synthetic */ Object write;

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o.getResolutionHeight$RemoteActionCompatParcelizer<R, T> for r5v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.getMonthName
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.read
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L38
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                java.lang.Object r6 = r5.read
                r1 = r6
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                java.lang.Object r6 = r5.write
                o.MagicModuleSubmissionRequestBody<T, o.SampleVideos<? super R>, java.lang.Object> r4 = r5.AudioAttributesCompatParcelizer
                r5.read = r1
                r5.RemoteActionCompatParcelizer = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 == r0) goto L4a
            L38:
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4 = 0
                r5.read = r4
                r5.RemoteActionCompatParcelizer = r2
                java.lang.Object r5 = r1.IconCompatParcelizer(r6, r3)
                if (r5 != r0) goto L47
                goto L4a
            L47:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L4a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getResolutionHeight.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(3, sampleVideos);
            this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getModuleData
        public Object AudioAttributesCompatParcelizer(getValidationToken<? super R> getvalidationtoken, T t, SampleVideos<? super getShowPopup> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
            remoteActionCompatParcelizer.read = getvalidationtoken;
            remoteActionCompatParcelizer.write = t;
            return remoteActionCompatParcelizer.invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final <T, R> NewNumberOtpResendRequest<R> RemoteActionCompatParcelizer(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, MagicModuleSubmissionRequestBody<? super T, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody) {
        return VerifyNewNumberRequest.IconCompatParcelizer((NewNumberOtpResendRequest) newNumberOtpResendRequest, (getModuleData) new RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, null));
    }
}
