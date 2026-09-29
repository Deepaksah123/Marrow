package kotlin;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class getPauseCount {

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ NewNumberOtpResendRequest<T>[] AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private /* synthetic */ getModuleData<getValidationToken<? super R>, T[], SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private /* synthetic */ getCreatedOnDateMs<T[]> RemoteActionCompatParcelizer;
        private /* synthetic */ getValidationToken<R> read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
        
            if (r11.AudioAttributesCompatParcelizer(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0121, code lost:
        
            if (r12.AudioAttributesCompatParcelizer(r13, r11, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0030, code lost:
        
            if (r7 != 0) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[LOOP:0: B:28:0x00c0->B:46:?, LOOP_START, PHI: r7 r11
          0x00c0: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:25:0x00bb, B:46:?] A[DONT_GENERATE, DONT_INLINE]
          0x00c0: PHI (r11v6 o.SyncResult) = (r11v5 o.SyncResult), (r11v13 o.SyncResult) binds: [B:25:0x00bb, B:46:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0105 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0121 -> B:11:0x0030). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getPauseCount.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: o.getPauseCount$RemoteActionCompatParcelizer$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ AtomicInteger AudioAttributesCompatParcelizer;
            private /* synthetic */ fromCursor<SyncResult<Object>> IconCompatParcelizer;
            private /* synthetic */ int RemoteActionCompatParcelizer;
            private int read;
            private /* synthetic */ NewNumberOtpResendRequest<T>[] write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                try {
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        this.read = 1;
                        if (this.write[this.RemoteActionCompatParcelizer].write(new AnonymousClass4(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer), this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.IconCompatParcelizer.write((Throwable) null);
                    }
                    return getShowPopup.INSTANCE;
                } finally {
                    if (this.AudioAttributesCompatParcelizer.decrementAndGet() == 0) {
                        this.IconCompatParcelizer.write((Throwable) null);
                    }
                }
            }

            /* JADX INFO: renamed from: o.getPauseCount$RemoteActionCompatParcelizer$2$4, reason: invalid class name */
            static final class AnonymousClass4<T> implements getValidationToken {
                private /* synthetic */ fromCursor<SyncResult<Object>> AudioAttributesCompatParcelizer;
                private /* synthetic */ int write;

                /* JADX INFO: renamed from: o.getPauseCount$RemoteActionCompatParcelizer$2$4$write */
                static final class write extends getTotalMcq {
                    /* synthetic */ Object AudioAttributesCompatParcelizer;
                    int RemoteActionCompatParcelizer;
                    private /* synthetic */ AnonymousClass4<T> write;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    write(AnonymousClass4<? super T> anonymousClass4, SampleVideos<? super write> sampleVideos) {
                        super(sampleVideos);
                        this.write = anonymousClass4;
                    }

                    @Override // kotlin.getMonthName
                    public final Object invokeSuspend(Object obj) {
                        this.AudioAttributesCompatParcelizer = obj;
                        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
                        return this.write.IconCompatParcelizer(null, this);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
                
                    if (kotlin.PhoneNumberJsonParser.IconCompatParcelizer(r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlin.getValidationToken
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object IconCompatParcelizer(T r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof o.getPauseCount.RemoteActionCompatParcelizer.AnonymousClass2.AnonymousClass4.write
                        if (r0 == 0) goto L14
                        r0 = r7
                        o.getPauseCount$RemoteActionCompatParcelizer$2$4$write r0 = (o.getPauseCount.RemoteActionCompatParcelizer.AnonymousClass2.AnonymousClass4.write) r0
                        int r1 = r0.RemoteActionCompatParcelizer
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r7 = r0.RemoteActionCompatParcelizer
                        int r7 = r7 + r2
                        r0.RemoteActionCompatParcelizer = r7
                        goto L19
                    L14:
                        o.getPauseCount$RemoteActionCompatParcelizer$2$4$write r0 = new o.getPauseCount$RemoteActionCompatParcelizer$2$4$write
                        r0.<init>(r5, r7)
                    L19:
                        java.lang.Object r7 = r0.AudioAttributesCompatParcelizer
                        java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                        int r2 = r0.RemoteActionCompatParcelizer
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L39
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                        goto L56
                    L2d:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L35:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                        goto L4d
                    L39:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                        o.fromCursor<o.SyncResult<java.lang.Object>> r7 = r5.AudioAttributesCompatParcelizer
                        o.SyncResult r2 = new o.SyncResult
                        int r5 = r5.write
                        r2.<init>(r5, r6)
                        r0.RemoteActionCompatParcelizer = r4
                        java.lang.Object r5 = r7.RemoteActionCompatParcelizer(r2, r0)
                        if (r5 == r1) goto L59
                    L4d:
                        r0.RemoteActionCompatParcelizer = r3
                        java.lang.Object r5 = kotlin.PhoneNumberJsonParser.IconCompatParcelizer(r0)
                        if (r5 != r1) goto L56
                        goto L59
                    L56:
                        o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                        return r5
                    L59:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.getPauseCount.RemoteActionCompatParcelizer.AnonymousClass2.AnonymousClass4.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
                }

                AnonymousClass4(fromCursor<SyncResult<Object>> fromcursor, int i) {
                    this.AudioAttributesCompatParcelizer = fromcursor;
                    this.write = i;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(NewNumberOtpResendRequest<? extends T>[] newNumberOtpResendRequestArr, int i, AtomicInteger atomicInteger, fromCursor<SyncResult<Object>> fromcursor, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.write = newNumberOtpResendRequestArr;
                this.RemoteActionCompatParcelizer = i;
                this.AudioAttributesCompatParcelizer = atomicInteger;
                this.IconCompatParcelizer = fromcursor;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(NewNumberOtpResendRequest<? extends T>[] newNumberOtpResendRequestArr, getCreatedOnDateMs<T[]> getcreatedondatems, getModuleData<? super getValidationToken<? super R>, ? super T[], ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, getValidationToken<? super R> getvalidationtoken, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = newNumberOtpResendRequestArr;
            this.RemoteActionCompatParcelizer = getcreatedondatems;
            this.IconCompatParcelizer = getmoduledata;
            this.read = getvalidationtoken;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, sampleVideos);
            remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer = obj;
            return remoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final <R, T> Object IconCompatParcelizer(getValidationToken<? super R> getvalidationtoken, NewNumberOtpResendRequest<? extends T>[] newNumberOtpResendRequestArr, getCreatedOnDateMs<T[]> getcreatedondatems, getModuleData<? super getValidationToken<? super R>, ? super T[], ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = getReBufferCount.IconCompatParcelizer(new RemoteActionCompatParcelizer(newNumberOtpResendRequestArr, getcreatedondatems, getmoduledata, getvalidationtoken, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }
}
