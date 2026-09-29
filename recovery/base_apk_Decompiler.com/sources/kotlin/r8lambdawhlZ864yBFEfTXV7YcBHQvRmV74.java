package kotlin;

import com.marrow.data.models.pearl.Pearl;
import dagger.Lazy;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74 implements copyWithMutationsApplied {
    private final Lazy<applyMutations> AudioAttributesCompatParcelizer;
    private final deleteRow write;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        Object read;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74.this.AudioAttributesImplApi26Parcelizer(null, this);
        }
    }

    static final class read extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        int IconCompatParcelizer;
        int MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        int read;
        int write;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.MediaBrowserCompatItemReceiver |= Integer.MIN_VALUE;
            return r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74.this.AudioAttributesCompatParcelizer(0, null, 0, this);
        }
    }

    @setSdkPayload
    public r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74(deleteRow deleterow, Lazy<applyMutations> lazy) {
        toMagicModuleMetaRepoModel.write(deleterow, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.write = deleterow;
        this.AudioAttributesCompatParcelizer = lazy;
    }

    private final applyMutations IconCompatParcelizer() {
        applyMutations applymutations = this.AudioAttributesCompatParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applymutations, "");
        return applymutations;
    }

    @Override // kotlin.copyWithMutationsApplied
    public final void IconCompatParcelizer(List<? extends Pearl> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write.read(list);
    }

    @Override // kotlin.copyWithMutationsApplied
    public final Object IconCompatParcelizer(String str, List<String> list, SampleVideos<? super NewNumberOtpResendRequest<? extends List<addValues>>> sampleVideos) {
        return this.write.read(str, list);
    }

    @Override // kotlin.copyWithMutationsApplied
    public final Object MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super Integer> sampleVideos) {
        return this.write.AudioAttributesImplApi26Parcelizer(str);
    }

    @Override // kotlin.copyWithMutationsApplied
    public final Object IconCompatParcelizer(String str, boolean z, int i, String str2, SampleVideos<? super NewNumberOtpResendRequest<? extends List<? extends getEditedValues>>> sampleVideos) {
        return this.write.read(str, z, i, str2);
    }

    @Override // kotlin.copyWithMutationsApplied
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super NewNumberOtpResendRequest<? extends List<ContentMetadataMutations>>> sampleVideos) {
        return this.write.write(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (r6.IconCompatParcelizer(r8, r9) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.copyWithMutationsApplied
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(int r7, java.lang.String r8, int r9, kotlin.SampleVideos<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74.read
            if (r0 == 0) goto L14
            r0 = r10
            o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74$read r0 = (o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74.read) r0
            int r1 = r0.MediaBrowserCompatItemReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.MediaBrowserCompatItemReceiver
            int r10 = r10 + r2
            r0.MediaBrowserCompatItemReceiver = r10
            goto L19
        L14:
            o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74$read r0 = new o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74$read
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.AudioAttributesImplApi26Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.MediaBrowserCompatItemReceiver
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            int r6 = r0.write
            int r6 = r0.AudioAttributesCompatParcelizer
            int r6 = r0.read
            int r6 = r0.IconCompatParcelizer
            java.lang.Object r6 = r0.AudioAttributesImplApi21Parcelizer
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            java.lang.String r6 = (java.lang.String) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L91
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            int r9 = r0.read
            int r7 = r0.IconCompatParcelizer
            java.lang.Object r8 = r0.RemoteActionCompatParcelizer
            java.lang.String r8 = (java.lang.String) r8
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L64
        L4f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            o.applyMutations r10 = r6.IconCompatParcelizer()
            r0.RemoteActionCompatParcelizer = r8
            r0.IconCompatParcelizer = r7
            r0.read = r9
            r0.MediaBrowserCompatItemReceiver = r4
            java.lang.Object r10 = r10.IconCompatParcelizer(r7, r8, r9, r0)
            if (r10 == r1) goto L96
        L64:
            com.marrow2.data.pearl.remote.model.PearlResponseBody r10 = (com.marrow2.data.pearl.remote.model.PearlResponseBody) r10
            java.lang.Integer r10 = r10.getBookmarked()
            r2 = 0
            if (r10 == 0) goto L75
            int r10 = r10.intValue()
            if (r9 != r10) goto L75
            r10 = r4
            goto L76
        L75:
            r10 = r2
        L76:
            if (r10 == 0) goto L90
            o.deleteRow r6 = r6.write
            r5 = 0
            r0.RemoteActionCompatParcelizer = r5
            r0.AudioAttributesImplApi21Parcelizer = r5
            r0.IconCompatParcelizer = r7
            r0.read = r9
            r0.AudioAttributesCompatParcelizer = r2
            r0.write = r10
            r0.MediaBrowserCompatItemReceiver = r3
            java.lang.Object r6 = r6.IconCompatParcelizer(r8, r9)
            if (r6 != r1) goto L91
            goto L96
        L90:
            r4 = r2
        L91:
            java.lang.Boolean r6 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
            return r6
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74.AudioAttributesCompatParcelizer(int, java.lang.String, int, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.copyWithMutationsApplied
    public final Object IconCompatParcelizer(String str, boolean z, int i, SampleVideos<? super NewNumberOtpResendRequest<? extends List<CachedContentIndexStorage>>> sampleVideos) {
        return this.write.IconCompatParcelizer(str, z, i);
    }

    @Override // kotlin.copyWithMutationsApplied
    public final Object write(String str, SampleVideos<? super isMetadataEqual> sampleVideos) {
        return this.write.AudioAttributesCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.copyWithMutationsApplied
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super isMetadataEqual> sampleVideos) {
        return this.write.read(str);
    }

    @Override // kotlin.copyWithMutationsApplied
    public final Object read(String str, SampleVideos<? super List<String>> sampleVideos) {
        return this.write.IconCompatParcelizer(str);
    }

    @Override // kotlin.copyWithMutationsApplied
    public final Object IconCompatParcelizer(String str, SampleVideos<? super List<String>> sampleVideos) {
        return this.write.AudioAttributesCompatParcelizer(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.copyWithMutationsApplied
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplApi26Parcelizer(java.lang.String r6, kotlin.SampleVideos<? super kotlin.checkAndSet> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74$AudioAttributesCompatParcelizer r0 = (o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74.AudioAttributesCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74$AudioAttributesCompatParcelizer r0 = new o.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74$AudioAttributesCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.read
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.deleteRow r5 = r5.write
            r0.read = r4
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r7 = r5.RemoteActionCompatParcelizer(r6)
            if (r7 != r1) goto L45
            return r1
        L45:
            o.setRedirectedUri r7 = (kotlin.setRedirectedUri) r7
            if (r7 == 0) goto L4e
            o.checkAndSet r5 = kotlin.getRemovedValues.write(r7)
            return r5
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.r8lambdawhlZ864yBFEfTXV7YcBHQvRmV74.AudioAttributesImplApi26Parcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }
}
