package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class setTimelineTitle implements getPytMcqIds {
    private final long AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;

    public setTimelineTitle(long j, long j2) {
        this.AudioAttributesCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
        if (j < 0) {
            StringBuilder sb = new StringBuilder("stopTimeout(");
            sb.append(j);
            sb.append(" ms) cannot be negative");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (j2 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("replayExpiration(");
        sb2.append(j2);
        sb2.append(" ms) cannot be negative");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getModuleData<getValidationToken<? super isUpdateTagVisible>, Integer, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            if (r10.IconCompatParcelizer(kotlin.isUpdateTagVisible.IconCompatParcelizer, r9) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
        
            if (r1.IconCompatParcelizer(kotlin.isUpdateTagVisible.write, r9) != r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[PHI: r1
          0x0098: PHI (r1v10 o.getValidationToken) = (r1v8 o.getValidationToken), (r1v9 o.getValidationToken), (r1v16 o.getValidationToken) binds: [B:25:0x0074, B:29:0x0096, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r9.RemoteActionCompatParcelizer
                r2 = 4
                r3 = 5
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3d
                if (r1 == r6) goto L39
                if (r1 == r5) goto L31
                if (r1 == r4) goto L29
                if (r1 == r2) goto L20
                if (r1 != r3) goto L18
                goto L39
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L20:
                java.lang.Object r1 = r9.IconCompatParcelizer
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L98
            L29:
                java.lang.Object r1 = r9.IconCompatParcelizer
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L85
            L31:
                java.lang.Object r1 = r9.IconCompatParcelizer
                o.getValidationToken r1 = (kotlin.getValidationToken) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L6a
            L39:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto La9
            L3d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                java.lang.Object r10 = r9.IconCompatParcelizer
                o.getValidationToken r10 = (kotlin.getValidationToken) r10
                int r1 = r9.AudioAttributesCompatParcelizer
                if (r1 <= 0) goto L56
                o.isUpdateTagVisible r1 = kotlin.isUpdateTagVisible.IconCompatParcelizer
                r2 = r9
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r9.RemoteActionCompatParcelizer = r6
                java.lang.Object r9 = r10.IconCompatParcelizer(r1, r2)
                if (r9 != r0) goto La9
                goto Lac
            L56:
                o.setTimelineTitle r1 = kotlin.setTimelineTitle.this
                long r6 = kotlin.setTimelineTitle.IconCompatParcelizer(r1)
                r1 = r9
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r9.IconCompatParcelizer = r10
                r9.RemoteActionCompatParcelizer = r5
                java.lang.Object r1 = kotlin.setCountry.IconCompatParcelizer(r6, r1)
                if (r1 == r0) goto Lac
                r1 = r10
            L6a:
                o.setTimelineTitle r10 = kotlin.setTimelineTitle.this
                long r5 = kotlin.setTimelineTitle.RemoteActionCompatParcelizer(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L98
                o.isUpdateTagVisible r10 = kotlin.isUpdateTagVisible.read
                r5 = r9
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r9.IconCompatParcelizer = r1
                r9.RemoteActionCompatParcelizer = r4
                java.lang.Object r10 = r1.IconCompatParcelizer(r10, r5)
                if (r10 == r0) goto Lac
            L85:
                o.setTimelineTitle r10 = kotlin.setTimelineTitle.this
                long r4 = kotlin.setTimelineTitle.RemoteActionCompatParcelizer(r10)
                r10 = r9
                o.SampleVideos r10 = (kotlin.SampleVideos) r10
                r9.IconCompatParcelizer = r1
                r9.RemoteActionCompatParcelizer = r2
                java.lang.Object r10 = kotlin.setCountry.IconCompatParcelizer(r4, r10)
                if (r10 == r0) goto Lac
            L98:
                o.isUpdateTagVisible r10 = kotlin.isUpdateTagVisible.write
                r2 = r9
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r4 = 0
                r9.IconCompatParcelizer = r4
                r9.RemoteActionCompatParcelizer = r3
                java.lang.Object r9 = r1.IconCompatParcelizer(r10, r2)
                if (r9 != r0) goto La9
                goto Lac
            La9:
                o.getShowPopup r9 = kotlin.getShowPopup.INSTANCE
                return r9
            Lac:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setTimelineTitle.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(3, sampleVideos);
        }

        @Override // kotlin.getModuleData
        public final /* synthetic */ Object AudioAttributesCompatParcelizer(getValidationToken<? super isUpdateTagVisible> getvalidationtoken, Integer num, SampleVideos<? super getShowPopup> sampleVideos) {
            return IconCompatParcelizer(getvalidationtoken, num.intValue(), sampleVideos);
        }

        private Object IconCompatParcelizer(getValidationToken<? super isUpdateTagVisible> getvalidationtoken, int i, SampleVideos<? super getShowPopup> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = setTimelineTitle.this.new RemoteActionCompatParcelizer(sampleVideos);
            remoteActionCompatParcelizer.IconCompatParcelizer = getvalidationtoken;
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = i;
            return remoteActionCompatParcelizer.invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getPytMcqIds
    public final NewNumberOtpResendRequest<isUpdateTagVisible> IconCompatParcelizer(setUpdatedStatus<Integer> setupdatedstatus) {
        return VerifyNewNumberRequest.read(VerifyNewNumberRequest.write(VerifyNewNumberRequest.IconCompatParcelizer((NewNumberOtpResendRequest) setupdatedstatus, (getModuleData) new RemoteActionCompatParcelizer(null)), new write(null)));
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<isUpdateTagVisible, SampleVideos<? super Boolean>, Object> {
        private /* synthetic */ Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.AudioAttributesCompatParcelizer(((isUpdateTagVisible) this.IconCompatParcelizer) != isUpdateTagVisible.IconCompatParcelizer);
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(sampleVideos);
            writeVar.IconCompatParcelizer = obj;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(isUpdateTagVisible isupdatetagvisible, SampleVideos<? super Boolean> sampleVideos) {
            return ((write) create(isupdatetagvisible, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final String toString() {
        List listWrite = IntermediateLoginResponseBody.write(2);
        if (this.AudioAttributesCompatParcelizer > 0) {
            StringBuilder sb = new StringBuilder("stopTimeout=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append("ms");
            listWrite.add(sb.toString());
        }
        if (this.IconCompatParcelizer < Long.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder("replayExpiration=");
            sb2.append(this.IconCompatParcelizer);
            sb2.append("ms");
            listWrite.add(sb2.toString());
        }
        List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listWrite);
        StringBuilder sb3 = new StringBuilder("SharingStarted.WhileSubscribed(");
        sb3.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(listAudioAttributesCompatParcelizer, null, null, null, 0, null, null, 63));
        sb3.append(')');
        return sb3.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setTimelineTitle)) {
            return false;
        }
        setTimelineTitle settimelinetitle = (setTimelineTitle) obj;
        return this.AudioAttributesCompatParcelizer == settimelinetitle.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == settimelinetitle.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (Long.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Long.hashCode(this.IconCompatParcelizer);
    }
}
