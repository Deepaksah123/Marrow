package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class isContactVerified {
    public static final <T> NewNumberOtpResendRequest<T> RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super getValidationToken<? super T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        return new fromThemeState(magicModuleSubmissionRequestBody);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class read<T> implements NewNumberOtpResendRequest<T> {
        private /* synthetic */ Object[] RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.isContactVerified$read$5, reason: invalid class name */
        public static final class AnonymousClass5 extends getTotalMcq {
            Object AudioAttributesCompatParcelizer;
            /* synthetic */ Object AudioAttributesImplBaseParcelizer;
            int IconCompatParcelizer;
            Object RemoteActionCompatParcelizer;
            int read;
            int write;

            public AnonymousClass5(SampleVideos sampleVideos) {
                super(sampleVideos);
            }

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                this.AudioAttributesImplBaseParcelizer = obj;
                this.write |= Integer.MIN_VALUE;
                return read.this.write(null, this);
            }
        }

        public read(Object[] objArr) {
            this.RemoteActionCompatParcelizer = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, o.getValidationToken] */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0064 -> B:20:0x0066). Please report as a decompilation issue!!! */
        @Override // kotlin.NewNumberOtpResendRequest
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object write(kotlin.getValidationToken<? super T> r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.isContactVerified.read.AnonymousClass5
                if (r0 == 0) goto L14
                r0 = r8
                o.isContactVerified$read$5 r0 = (o.isContactVerified.read.AnonymousClass5) r0
                int r1 = r0.write
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.write
                int r8 = r8 + r2
                r0.write = r8
                goto L19
            L14:
                o.isContactVerified$read$5 r0 = new o.isContactVerified$read$5
                r0.<init>(r8)
            L19:
                java.lang.Object r8 = r0.AudioAttributesImplBaseParcelizer
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.write
                r3 = 1
                if (r2 == 0) goto L3f
                if (r2 != r3) goto L37
                int r6 = r0.read
                int r7 = r0.IconCompatParcelizer
                java.lang.Object r2 = r0.RemoteActionCompatParcelizer
                o.getValidationToken r2 = (kotlin.getValidationToken) r2
                java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
                o.isContactVerified$read r4 = (o.isContactVerified.read) r4
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                r8 = r2
                goto L66
            L37:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3f:
                kotlin.SdkPayloadData.IconCompatParcelizer(r8)
                r8 = r0
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                java.lang.Object[] r8 = r6.RemoteActionCompatParcelizer
                int r8 = r8.length
                r2 = 0
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r5
            L4d:
                if (r2 >= r6) goto L6a
                java.lang.Object[] r4 = r7.RemoteActionCompatParcelizer
                r4 = r4[r2]
                r0.AudioAttributesCompatParcelizer = r7
                r0.RemoteActionCompatParcelizer = r8
                r0.IconCompatParcelizer = r2
                r0.read = r6
                r0.write = r3
                java.lang.Object r4 = r8.IconCompatParcelizer(r4, r0)
                if (r4 != r1) goto L64
                return r1
            L64:
                r4 = r7
                r7 = r2
            L66:
                int r2 = r7 + 1
                r7 = r4
                goto L4d
            L6a:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isContactVerified.read.write(o.getValidationToken, o.SampleVideos):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class write<T> implements NewNumberOtpResendRequest<T> {
        private /* synthetic */ Object read;

        public write(Object obj) {
            this.read = obj;
        }

        @Override // kotlin.NewNumberOtpResendRequest
        public final Object write(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = getvalidationtoken.IconCompatParcelizer((Object) this.read, sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }
    }

    public static final <T> NewNumberOtpResendRequest<T> read(MagicModuleSubmissionRequestBody<? super getShowPearlDeletionPopup<? super T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        return new UserConfigResponseCompanion(magicModuleSubmissionRequestBody, null, 0, null, 14, null);
    }

    public static final <T> NewNumberOtpResendRequest<T> AudioAttributesCompatParcelizer(T... tArr) {
        return new read(tArr);
    }

    public static final <T> NewNumberOtpResendRequest<T> IconCompatParcelizer(T t) {
        return new write(t);
    }
}
