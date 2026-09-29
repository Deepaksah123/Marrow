package kotlin;

import com.marrow.data.models.plan.NotesSubscriptionResponse;
import dagger.Lazy;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class EGLSurfaceTexture implements createEGLSurface {
    private final getDebugPreviewSurfaceView AudioAttributesCompatParcelizer;
    private final Lazy<createEGLContext> read;

    static final class IconCompatParcelizer extends getTotalMcq {
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return EGLSurfaceTexture.this.read(null, this);
        }
    }

    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return EGLSurfaceTexture.this.read(this);
        }
    }

    public static final class write extends getTotalMcq {
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;
        private static final byte[] $$a = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, 13, 21, 98, -19, -10, -3, 20, -6, 5};
        private static final int $$b = 26;
        private static int write = 0;
        private static int read = 1;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        private static void a(byte b, byte b2, byte b3, Object[] objArr) {
            byte[] bArr = $$a;
            int i = 114 - (b3 * 39);
            int i2 = b2 * 3;
            int i3 = 6 - (b * 3);
            byte[] bArr2 = new byte[i2 + 4];
            int i4 = i2 + 3;
            int i5 = -1;
            if (bArr == null) {
                i5 = -1;
                i = i4 + i3 + 6;
                i3 = i3;
            }
            while (true) {
                int i6 = i5 + 1;
                int i7 = i3 + 1;
                bArr2[i6] = (byte) i;
                if (i6 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i5 = i6;
                i = i + bArr[i7] + 6;
                i3 = i7;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return EGLSurfaceTexture.this.write(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x02a6 A[PHI: r1 r7
          0x02a6: PHI (r1v15 int) = (r1v14 int), (r1v58 int) binds: [B:30:0x02a4, B:27:0x0298] A[DONT_GENERATE, DONT_INLINE]
          0x02a6: PHI (r7v45 int) = (r7v44 int), (r7v85 int) binds: [B:30:0x02a4, B:27:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x061f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] IconCompatParcelizer(int r43, int r44, int r45) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2144
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.EGLSurfaceTexture.write.IconCompatParcelizer(int, int, int):java.lang.Object[]");
        }
    }

    @setSdkPayload
    public EGLSurfaceTexture(getDebugPreviewSurfaceView getdebugpreviewsurfaceview, Lazy<createEGLContext> lazy) {
        toMagicModuleMetaRepoModel.write(getdebugpreviewsurfaceview, "");
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.AudioAttributesCompatParcelizer = getdebugpreviewsurfaceview;
        this.read = lazy;
    }

    private final createEGLContext IconCompatParcelizer() {
        createEGLContext createeglcontext = this.read.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(createeglcontext, "");
        return createeglcontext;
    }

    @Override // kotlin.createEGLSurface
    public final Object write(getTrackTypeString gettracktypestring, SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.read(gettracktypestring, sampleVideos);
    }

    @Override // kotlin.createEGLSurface
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.write();
    }

    @Override // kotlin.createEGLSurface
    public final Object AudioAttributesImplApi26Parcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.createEGLSurface
    public final Object AudioAttributesCompatParcelizer(getTrackTypeString gettracktypestring, String str, SampleVideos<? super Boolean> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.read(gettracktypestring, str, sampleVideos);
    }

    @Override // kotlin.createEGLSurface
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super List<String>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createEGLSurface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(java.lang.String r6, kotlin.SampleVideos<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.EGLSurfaceTexture.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.EGLSurfaceTexture$IconCompatParcelizer r0 = (o.EGLSurfaceTexture.IconCompatParcelizer) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.RemoteActionCompatParcelizer
            int r7 = r7 + r2
            r0.RemoteActionCompatParcelizer = r7
            goto L19
        L14:
            o.EGLSurfaceTexture$IconCompatParcelizer r0 = new o.EGLSurfaceTexture$IconCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.read
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.write
            java.lang.String r5 = (java.lang.String) r5
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            return r7
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.Object r6 = r0.write
            java.lang.String r6 = (java.lang.String) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L50
        L41:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.getTrackTypeString r7 = kotlin.getTrackTypeString.read
            r0.write = r6
            r0.RemoteActionCompatParcelizer = r4
            java.lang.Object r7 = r5.write(r7, r0)
            if (r7 == r1) goto L6c
        L50:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L67
            o.getTrackTypeString r7 = kotlin.getTrackTypeString.RemoteActionCompatParcelizer
            r2 = 0
            r0.write = r2
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r5 = r5.AudioAttributesCompatParcelizer(r7, r6, r0)
            if (r5 != r1) goto L66
            goto L6c
        L66:
            return r5
        L67:
            java.lang.Boolean r5 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r4)
            return r5
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.EGLSurfaceTexture.read(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createEGLSurface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super java.util.List<kotlin.dispatchOnFrameAvailable>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.EGLSurfaceTexture.write
            if (r0 == 0) goto L14
            r0 = r5
            o.EGLSurfaceTexture$write r0 = (o.EGLSurfaceTexture.write) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.IconCompatParcelizer
            int r5 = r5 + r2
            r0.IconCompatParcelizer = r5
            goto L19
        L14:
            o.EGLSurfaceTexture$write r0 = new o.EGLSurfaceTexture$write
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L42
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.createEGLContext r4 = r4.IconCompatParcelizer()
            r0.IconCompatParcelizer = r3
            java.lang.Object r5 = r4.AudioAttributesCompatParcelizer(r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r5, r0)
            r4.<init>(r0)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r5.next()
            com.marrow2.data.subscription.remote.model.PlanSubscriptionRSModel r0 = (com.marrow2.data.subscription.remote.model.PlanSubscriptionRSModel) r0
            o.dispatchOnFrameAvailable r0 = kotlin.getSurfaceTexture.IconCompatParcelizer(r0)
            r4.add(r0)
            goto L55
        L69:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.EGLSurfaceTexture.write(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.createEGLSurface
    public final Object IconCompatParcelizer(SampleVideos<? super List<updateAndPost>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.read();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.createEGLSurface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.SampleVideos<? super java.lang.String> r8) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.EGLSurfaceTexture.read(o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.createEGLSurface
    public final Object IconCompatParcelizer(getTrackTypeString gettracktypestring, SampleVideos<? super Long> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.write(gettracktypestring);
    }

    @Override // kotlin.createEGLSurface
    public final Object MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super Boolean> sampleVideos) {
        return write(getTrackTypeString.read, sampleVideos);
    }

    @Override // kotlin.createEGLSurface
    public final Object MediaBrowserCompatItemReceiver(SampleVideos<? super Boolean> sampleVideos) {
        return write(getTrackTypeString.IconCompatParcelizer, sampleVideos);
    }

    @Override // kotlin.createEGLSurface
    public final Object write(int i, SampleVideos<? super NotesSubscriptionResponse> sampleVideos) {
        return IconCompatParcelizer().write(i, sampleVideos);
    }
}
