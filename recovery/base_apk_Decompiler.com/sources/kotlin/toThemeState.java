package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class toThemeState {

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final class IconCompatParcelizer<R> extends getMagicModuleStats implements getModuleData<getValidationToken<? super R>, Object[], SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private /* synthetic */ getModuleData<T1, T2, SampleVideos<? super R>, Object> read;
        private int write;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o.toThemeState$IconCompatParcelizer<R> for r6v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.getMonthName
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L4e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                java.lang.Object r1 = r6.IconCompatParcelizer
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L3f
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                java.lang.Object r7 = r6.IconCompatParcelizer
                r1 = r7
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                java.lang.Object r7 = r6.RemoteActionCompatParcelizer
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                o.getModuleData<T1, T2, o.SampleVideos<? super R>, java.lang.Object> r4 = r6.read
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.IconCompatParcelizer = r1
                r6.write = r3
                java.lang.Object r7 = r4.AudioAttributesCompatParcelizer(r5, r7, r6)
                if (r7 == r0) goto L51
            L3f:
                r3 = r6
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4 = 0
                r6.IconCompatParcelizer = r4
                r6.write = r2
                java.lang.Object r6 = r1.IconCompatParcelizer(r7, r3)
                if (r6 != r0) goto L4e
                goto L51
            L4e:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L51:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.toThemeState.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getModuleData<? super T1, ? super T2, ? super SampleVideos<? super R>, ? extends Object> getmoduledata, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(3, sampleVideos);
            this.read = getmoduledata;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getModuleData
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object AudioAttributesCompatParcelizer(getValidationToken<? super R> getvalidationtoken, Object[] objArr, SampleVideos<? super getShowPopup> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.read, sampleVideos);
            iconCompatParcelizer.IconCompatParcelizer = getvalidationtoken;
            iconCompatParcelizer.RemoteActionCompatParcelizer = objArr;
            return iconCompatParcelizer.invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final <T1, T2, R> NewNumberOtpResendRequest<R> RemoteActionCompatParcelizer(NewNumberOtpResendRequest<? extends T1> newNumberOtpResendRequest, NewNumberOtpResendRequest<? extends T2> newNumberOtpResendRequest2, getModuleData<? super T1, ? super T2, ? super SampleVideos<? super R>, ? extends Object> getmoduledata) {
        return VerifyNewNumberRequest.IconCompatParcelizer(newNumberOtpResendRequest, newNumberOtpResendRequest2, getmoduledata);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class write<R> implements NewNumberOtpResendRequest<R> {
        private /* synthetic */ getModuleData AudioAttributesCompatParcelizer;
        private /* synthetic */ NewNumberOtpResendRequest IconCompatParcelizer;
        private /* synthetic */ NewNumberOtpResendRequest write;

        public write(NewNumberOtpResendRequest newNumberOtpResendRequest, NewNumberOtpResendRequest newNumberOtpResendRequest2, getModuleData getmoduledata) {
            this.IconCompatParcelizer = newNumberOtpResendRequest;
            this.write = newNumberOtpResendRequest2;
            this.AudioAttributesCompatParcelizer = getmoduledata;
        }

        @Override // kotlin.NewNumberOtpResendRequest
        public final Object write(getValidationToken<? super R> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = getPauseCount.IconCompatParcelizer(getvalidationtoken, new NewNumberOtpResendRequest[]{this.IconCompatParcelizer, this.write}, toThemeState.read(), new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, null), sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> getCreatedOnDateMs<T[]> read() {
        return read.IconCompatParcelizer;
    }

    static final class read implements getCreatedOnDateMs {
        public static final read IconCompatParcelizer = new read();

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Object invoke() {
            return null;
        }

        read() {
        }
    }

    public static final <T1, T2, R> NewNumberOtpResendRequest<R> read(NewNumberOtpResendRequest<? extends T1> newNumberOtpResendRequest, NewNumberOtpResendRequest<? extends T2> newNumberOtpResendRequest2, getModuleData<? super T1, ? super T2, ? super SampleVideos<? super R>, ? extends Object> getmoduledata) {
        return new write(newNumberOtpResendRequest, newNumberOtpResendRequest2, getmoduledata);
    }
}
