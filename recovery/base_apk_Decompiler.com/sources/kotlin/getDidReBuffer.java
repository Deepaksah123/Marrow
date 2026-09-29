package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getDidReBuffer<T> implements getPbConfig<T> {
    public final setAddressLine2 AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final CurrentQuery RemoteActionCompatParcelizer;

    protected abstract getDidReBuffer<T> AudioAttributesCompatParcelizer(CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2);

    protected abstract Object read(getShowPearlDeletionPopup<? super T> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos);

    protected String read() {
        return null;
    }

    public NewNumberOtpResendRequest<T> write() {
        return null;
    }

    public getDidReBuffer(CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        this.RemoteActionCompatParcelizer = currentQuery;
        this.IconCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = setaddressline2;
        getCollegeId.write();
    }

    public static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getShowPearlDeletionPopup<? super T>, SampleVideos<? super getShowPopup>, Object> {
        private static final byte[] $$a = {16, -111, 25, -45, 19, 10, 3, -20, 6, -5};
        private static final int $$b = 169;
        private static int IconCompatParcelizer = 0;
        private static int write = 1;
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ getDidReBuffer<T> RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = o.getDidReBuffer.write.$$a
                int r8 = r8 * 4
                int r8 = r8 + 4
                int r9 = r9 * 39
                int r9 = r9 + 75
                int r7 = r7 * 3
                int r7 = 6 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2f
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                int r7 = r7 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2f:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r3 + 6
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getDidReBuffer.write.a(int, short, byte, java.lang.Object[]):void");
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getShowPearlDeletionPopup<? super T> getshowpearldeletionpopup = (getShowPearlDeletionPopup) this.read;
                this.AudioAttributesCompatParcelizer = 1;
                if (this.RemoteActionCompatParcelizer.read(getshowpearldeletionpopup, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(getDidReBuffer<T> getdidrebuffer, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getdidrebuffer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.RemoteActionCompatParcelizer, sampleVideos);
            writeVar.read = obj;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(getShowPearlDeletionPopup<? super T> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(getshowpearldeletionpopup, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x06e2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] AudioAttributesCompatParcelizer(int r33, int r34, int r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getDidReBuffer.write.AudioAttributesCompatParcelizer(int, int, int):java.lang.Object[]");
        }
    }

    public final MagicModuleSubmissionRequestBody<getShowPearlDeletionPopup<? super T>, SampleVideos<? super getShowPopup>, Object> RemoteActionCompatParcelizer() {
        return new write(this, null);
    }

    private int IconCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[PHI: r4
      0x002a: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v6 int) binds: [B:6:0x0012, B:10:0x0018, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.getPbConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.NewNumberOtpResendRequest<T> write(kotlin.CurrentQuery r2, int r3, kotlin.setAddressLine2 r4) {
        /*
            r1 = this;
            kotlin.getCollegeId.write()
            o.CurrentQuery r0 = r1.RemoteActionCompatParcelizer
            o.CurrentQuery r2 = r2.plus(r0)
            o.setAddressLine2 r0 = kotlin.setAddressLine2.read
            if (r4 != r0) goto L2d
            int r4 = r1.IconCompatParcelizer
            r0 = -3
            if (r4 == r0) goto L2b
            if (r3 != r0) goto L15
            goto L2a
        L15:
            r0 = -2
            if (r4 == r0) goto L2b
            if (r3 != r0) goto L1b
            goto L2a
        L1b:
            kotlin.getCollegeId.write()
            kotlin.getCollegeId.write()
            int r4 = r1.IconCompatParcelizer
            int r4 = r4 + r3
            if (r4 >= 0) goto L2a
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L2b
        L2a:
            r3 = r4
        L2b:
            o.setAddressLine2 r4 = r1.AudioAttributesCompatParcelizer
        L2d:
            o.CurrentQuery r0 = r1.RemoteActionCompatParcelizer
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r0)
            if (r0 == 0) goto L40
            int r0 = r1.IconCompatParcelizer
            if (r3 != r0) goto L40
            o.setAddressLine2 r0 = r1.AudioAttributesCompatParcelizer
            if (r4 != r0) goto L40
            o.NewNumberOtpResendRequest r1 = (kotlin.NewNumberOtpResendRequest) r1
            return r1
        L40:
            o.getDidReBuffer r1 = r1.AudioAttributesCompatParcelizer(r2, r3, r4)
            o.NewNumberOtpResendRequest r1 = (kotlin.NewNumberOtpResendRequest) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getDidReBuffer.write(o.CurrentQuery, int, o.setAddressLine2):o.NewNumberOtpResendRequest");
    }

    public setLastName<T> IconCompatParcelizer(TopUserCompanion topUserCompanion) {
        return UserConfigResponse.IconCompatParcelizer(topUserCompanion, this.RemoteActionCompatParcelizer, IconCompatParcelizer(), this.AudioAttributesCompatParcelizer, getCollegeName.read, null, RemoteActionCompatParcelizer());
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        private /* synthetic */ getDidReBuffer<T> IconCompatParcelizer;
        private /* synthetic */ getValidationToken<T> RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesCompatParcelizer;
                this.read = 1;
                if (VerifyNewNumberRequest.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer.IconCompatParcelizer(topUserCompanion), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getValidationToken<? super T> getvalidationtoken, getDidReBuffer<T> getdidrebuffer, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getvalidationtoken;
            this.IconCompatParcelizer = getdidrebuffer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            iconCompatParcelizer.AudioAttributesCompatParcelizer = obj;
            return iconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static /* synthetic */ <T> Object read(getDidReBuffer<T> getdidrebuffer, getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = College.IconCompatParcelizer(new IconCompatParcelizer(getvalidationtoken, getdidrebuffer, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String str = read();
        if (str != null) {
            arrayList.add(str);
        }
        if (this.RemoteActionCompatParcelizer != VideoSessionResponseBody.RemoteActionCompatParcelizer) {
            StringBuilder sb = new StringBuilder("context=");
            sb.append(this.RemoteActionCompatParcelizer);
            arrayList.add(sb.toString());
        }
        if (this.IconCompatParcelizer != -3) {
            StringBuilder sb2 = new StringBuilder("capacity=");
            sb2.append(this.IconCompatParcelizer);
            arrayList.add(sb2.toString());
        }
        if (this.AudioAttributesCompatParcelizer != setAddressLine2.read) {
            StringBuilder sb3 = new StringBuilder("onBufferOverflow=");
            sb3.append(this.AudioAttributesCompatParcelizer);
            arrayList.add(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(isVerified.read(this));
        sb4.append('[');
        sb4.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList, ", ", null, null, 0, null, null, 62));
        sb4.append(']');
        return sb4.toString();
    }

    @Override // kotlin.NewNumberOtpResendRequest
    public Object write(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
        return read(this, getvalidationtoken, sampleVideos);
    }
}
