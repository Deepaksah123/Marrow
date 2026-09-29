package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UserShortInfo<T> implements UserShortInfoJsonParser<T> {

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        private /* synthetic */ UserShortInfo<T> IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        Object read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(UserShortInfo<T> userShortInfo, SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
            this.IconCompatParcelizer = userShortInfo;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.write(null, this);
        }
    }

    public abstract Object read(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.NewNumberOtpResendRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.getValidationToken<? super T> r5, kotlin.SampleVideos<? super kotlin.getShowPopup> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.UserShortInfo.read
            if (r0 == 0) goto L14
            r0 = r6
            o.UserShortInfo$read r0 = (o.UserShortInfo.read) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.AudioAttributesCompatParcelizer
            int r6 = r6 + r2
            r0.AudioAttributesCompatParcelizer = r6
            goto L19
        L14:
            o.UserShortInfo$read r0 = new o.UserShortInfo$read
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.read
            o.getSeekCount r4 = (kotlin.getSeekCount) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)     // Catch: java.lang.Throwable -> L2e
            goto L53
        L2e:
            r5 = move-exception
            goto L5c
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.SdkPayloadData.IconCompatParcelizer(r6)
            o.getSeekCount r6 = new o.getSeekCount
            o.CurrentQuery r2 = r0.getContext()
            r6.<init>(r5, r2)
            r5 = r6
            o.getValidationToken r5 = (kotlin.getValidationToken) r5     // Catch: java.lang.Throwable -> L59
            r0.read = r6     // Catch: java.lang.Throwable -> L59
            r0.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r4.read(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r4 != r1) goto L52
            return r1
        L52:
            r4 = r6
        L53:
            r4.releaseIntercepted()
            o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
            return r4
        L59:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L5c:
            r4.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.UserShortInfo.write(o.getValidationToken, o.SampleVideos):java.lang.Object");
    }
}
