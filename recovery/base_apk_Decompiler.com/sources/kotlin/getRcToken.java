package kotlin;

import kotlin.MagicModuleUseCaseImplWhenMappings;

/* JADX INFO: loaded from: classes4.dex */
final class getRcToken<T> implements NewNumberOtpResendRequest<T> {
    public final MagicModuleSubmissionRequestBody<Object, Object, Boolean> AudioAttributesCompatParcelizer;
    public final getAnswerMap<T, Object> IconCompatParcelizer;
    private final NewNumberOtpResendRequest<T> write;

    /* JADX WARN: Multi-variable type inference failed */
    public getRcToken(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, getAnswerMap<? super T, ? extends Object> getanswermap, MagicModuleSubmissionRequestBody<Object, Object, Boolean> magicModuleSubmissionRequestBody) {
        this.write = newNumberOtpResendRequest;
        this.IconCompatParcelizer = getanswermap;
        this.AudioAttributesCompatParcelizer = magicModuleSubmissionRequestBody;
    }

    static final class RemoteActionCompatParcelizer<T> implements getValidationToken {
        private /* synthetic */ getValidationToken<T> RemoteActionCompatParcelizer;
        private /* synthetic */ getRcToken<T> read;
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<Object> write;

        static final class IconCompatParcelizer extends getTotalMcq {
            int IconCompatParcelizer;
            private /* synthetic */ RemoteActionCompatParcelizer<T> RemoteActionCompatParcelizer;
            /* synthetic */ Object write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            IconCompatParcelizer(RemoteActionCompatParcelizer<? super T> remoteActionCompatParcelizer, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
                super(sampleVideos);
                this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.write = obj;
                this.IconCompatParcelizer |= Integer.MIN_VALUE;
                return this.RemoteActionCompatParcelizer.IconCompatParcelizer(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
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
        @Override // kotlin.getValidationToken
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object IconCompatParcelizer(T r6, kotlin.SampleVideos<? super kotlin.getShowPopup> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.getRcToken.RemoteActionCompatParcelizer.IconCompatParcelizer
                if (r0 == 0) goto L14
                r0 = r7
                o.getRcToken$RemoteActionCompatParcelizer$IconCompatParcelizer r0 = (o.getRcToken.RemoteActionCompatParcelizer.IconCompatParcelizer) r0
                int r1 = r0.IconCompatParcelizer
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r7 = r0.IconCompatParcelizer
                int r7 = r7 + r2
                r0.IconCompatParcelizer = r7
                goto L19
            L14:
                o.getRcToken$RemoteActionCompatParcelizer$IconCompatParcelizer r0 = new o.getRcToken$RemoteActionCompatParcelizer$IconCompatParcelizer
                r0.<init>(r5, r7)
            L19:
                java.lang.Object r7 = r0.write
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.IconCompatParcelizer
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L6b
            L2a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L32:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                o.getRcToken<T> r7 = r5.read
                o.getAnswerMap<T, java.lang.Object> r7 = r7.IconCompatParcelizer
                java.lang.Object r7 = r7.invoke(r6)
                o.MagicModuleUseCaseImplWhenMappings$write<java.lang.Object> r2 = r5.write
                T r2 = r2.write
                o.accessgetVideoConfigurationC2cp r4 = kotlin.getStartupDurationMs.IconCompatParcelizer
                if (r2 == r4) goto L5c
                o.getRcToken<T> r2 = r5.read
                o.MagicModuleSubmissionRequestBody<java.lang.Object, java.lang.Object, java.lang.Boolean> r2 = r2.AudioAttributesCompatParcelizer
                o.MagicModuleUseCaseImplWhenMappings$write<java.lang.Object> r4 = r5.write
                T r4 = r4.write
                java.lang.Object r2 = r2.invoke(r4, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L5c
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L5c:
                o.MagicModuleUseCaseImplWhenMappings$write<java.lang.Object> r2 = r5.write
                r2.write = r7
                o.getValidationToken<T> r5 = r5.RemoteActionCompatParcelizer
                r0.IconCompatParcelizer = r3
                java.lang.Object r5 = r5.IconCompatParcelizer(r6, r0)
                if (r5 != r1) goto L6b
                return r1
            L6b:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getRcToken.RemoteActionCompatParcelizer.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(getRcToken<T> getrctoken, MagicModuleUseCaseImplWhenMappings.write<Object> writeVar, getValidationToken<? super T> getvalidationtoken) {
            this.read = getrctoken;
            this.write = writeVar;
            this.RemoteActionCompatParcelizer = getvalidationtoken;
        }
    }

    @Override // kotlin.NewNumberOtpResendRequest
    public final Object write(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        writeVar.write = (T) getStartupDurationMs.IconCompatParcelizer;
        Object objWrite = this.write.write(new RemoteActionCompatParcelizer(this, writeVar, getvalidationtoken), sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }
}
