package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000b\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u00048\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0010\u0010\u0012"}, d2 = {"Lo/getExternalCacheDirs;", "Lo/DatabindException;", "Lo/createDeviceProtectedStorageContext;", "p0", "", "p1", "<init>", "(Lo/createDeviceProtectedStorageContext;Z)V", "Lo/getReferencedType;", "Lo/findCoercionAction;", "p2", "IconCompatParcelizer", "(JJI)J", "Lo/UnsupportedTypeDeserializer;", "(JJLo/SampleVideos;)Ljava/lang/Object;", "Lo/createDeviceProtectedStorageContext;", "AudioAttributesCompatParcelizer", "Z", "(Z)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getExternalCacheDirs implements DatabindException {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;
    private final createDeviceProtectedStorageContext IconCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;
        long write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return getExternalCacheDirs.this.IconCompatParcelizer(0L, 0L, this);
        }
    }

    public getExternalCacheDirs(createDeviceProtectedStorageContext createdeviceprotectedstoragecontext, boolean z) {
        this.IconCompatParcelizer = createdeviceprotectedstoragecontext;
        this.RemoteActionCompatParcelizer = z;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // kotlin.DatabindException
    public final long IconCompatParcelizer(long p0, long p1, int p2) {
        if (this.RemoteActionCompatParcelizer) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p1);
        }
        return getReferencedType.INSTANCE.write();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.DatabindException
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(long r3, long r5, kotlin.SampleVideos<? super kotlin.UnsupportedTypeDeserializer> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof o.getExternalCacheDirs.IconCompatParcelizer
            if (r3 == 0) goto L14
            r3 = r7
            o.getExternalCacheDirs$IconCompatParcelizer r3 = (o.getExternalCacheDirs.IconCompatParcelizer) r3
            int r4 = r3.read
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r0
            if (r4 == 0) goto L14
            int r4 = r3.read
            int r4 = r4 + r0
            r3.read = r4
            goto L19
        L14:
            o.getExternalCacheDirs$IconCompatParcelizer r3 = new o.getExternalCacheDirs$IconCompatParcelizer
            r3.<init>(r7)
        L19:
            java.lang.Object r4 = r3.AudioAttributesCompatParcelizer
            java.lang.Object r7 = kotlin.getYear.IconCompatParcelizer()
            int r0 = r3.read
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            long r5 = r3.write
            kotlin.SdkPayloadData.IconCompatParcelizer(r4)
            goto L57
        L2c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L34:
            kotlin.SdkPayloadData.IconCompatParcelizer(r4)
            boolean r4 = r2.RemoteActionCompatParcelizer
            if (r4 == 0) goto L62
            o.createDeviceProtectedStorageContext r4 = r2.IconCompatParcelizer
            boolean r4 = r4.read()
            if (r4 == 0) goto L4a
            o.UnsupportedTypeDeserializer$write r2 = kotlin.UnsupportedTypeDeserializer.INSTANCE
            long r2 = r2.write()
            goto L5d
        L4a:
            o.createDeviceProtectedStorageContext r2 = r2.IconCompatParcelizer
            r3.write = r5
            r3.read = r1
            java.lang.Object r4 = r2.AudioAttributesCompatParcelizer(r5, r3)
            if (r4 != r7) goto L57
            return r7
        L57:
            o.UnsupportedTypeDeserializer r4 = (kotlin.UnsupportedTypeDeserializer) r4
            long r2 = r4.getIconCompatParcelizer()
        L5d:
            long r2 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r5, r2)
            goto L68
        L62:
            o.UnsupportedTypeDeserializer$write r2 = kotlin.UnsupportedTypeDeserializer.INSTANCE
            long r2 = r2.write()
        L68:
            o.UnsupportedTypeDeserializer r2 = kotlin.UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getExternalCacheDirs.IconCompatParcelizer(long, long, o.SampleVideos):java.lang.Object");
    }
}
