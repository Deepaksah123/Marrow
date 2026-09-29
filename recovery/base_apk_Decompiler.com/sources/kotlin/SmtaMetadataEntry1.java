package kotlin;

import android.os.Process;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/SmtaMetadataEntry1;", "", "Lo/hasSamples;", "p0", "Lo/SlowMotionDataSegmentExternalSyntheticLambda0;", "p1", "<init>", "(Lo/hasSamples;Lo/SlowMotionDataSegmentExternalSyntheticLambda0;)V", "Lo/parseFromSection;", "", "read", "(Lo/parseFromSection;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/SlowMotionDataSegmentExternalSyntheticLambda0;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/hasSamples;", "write"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SmtaMetadataEntry1 {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final hasSamples AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final SlowMotionDataSegmentExternalSyntheticLambda0 IconCompatParcelizer;

    static final class AudioAttributesCompatParcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return SmtaMetadataEntry1.this.read(null, this);
        }
    }

    public SmtaMetadataEntry1(hasSamples hassamples, SlowMotionDataSegmentExternalSyntheticLambda0 slowMotionDataSegmentExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(hassamples, "");
        toMagicModuleMetaRepoModel.write(slowMotionDataSegmentExternalSyntheticLambda0, "");
        this.AudioAttributesCompatParcelizer = hassamples;
        this.IconCompatParcelizer = slowMotionDataSegmentExternalSyntheticLambda0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object read(kotlin.parseFromSection r7, kotlin.SampleVideos<? super kotlin.getShowPopup> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.SmtaMetadataEntry1.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r8
            o.SmtaMetadataEntry1$AudioAttributesCompatParcelizer r0 = (o.SmtaMetadataEntry1.AudioAttributesCompatParcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.AudioAttributesCompatParcelizer
            int r8 = r8 + r2
            r0.AudioAttributesCompatParcelizer = r8
            goto L19
        L14:
            o.SmtaMetadataEntry1$AudioAttributesCompatParcelizer r0 = new o.SmtaMetadataEntry1$AudioAttributesCompatParcelizer
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.AudioAttributesImplBaseParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            java.lang.String r4 = ""
            if (r2 == 0) goto L4c
            if (r2 != r3) goto L44
            java.lang.Object r6 = r0.write
            o.SpliceScheduleCommandComponentSplice r6 = (kotlin.SpliceScheduleCommandComponentSplice) r6
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            o.SpliceScheduleCommandComponentSplice r7 = (kotlin.SpliceScheduleCommandComponentSplice) r7
            java.lang.Object r1 = r0.read
            o.parseFromSection r1 = (kotlin.parseFromSection) r1
            java.lang.Object r0 = r0.IconCompatParcelizer
            o.SmtaMetadataEntry1 r0 = (kotlin.SmtaMetadataEntry1) r0
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)     // Catch: java.lang.Exception -> L42
            r5 = r8
            r8 = r6
            r6 = r0
            r0 = r7
            r7 = r1
            r1 = r5
            goto L6f
        L42:
            r6 = move-exception
            goto L83
        L44:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4c:
            kotlin.SdkPayloadData.IconCompatParcelizer(r8)
            o.SpliceScheduleCommandComponentSplice r8 = r7.write()
            o.hasSamples r2 = r6.AudioAttributesCompatParcelizer     // Catch: java.lang.Exception -> L7b
            com.google.android.gms.tasks.Task r2 = r2.write()     // Catch: java.lang.Exception -> L7b
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, r4)     // Catch: java.lang.Exception -> L7b
            r0.IconCompatParcelizer = r6     // Catch: java.lang.Exception -> L7b
            r0.read = r7     // Catch: java.lang.Exception -> L7b
            r0.RemoteActionCompatParcelizer = r8     // Catch: java.lang.Exception -> L7b
            r0.write = r8     // Catch: java.lang.Exception -> L7b
            r0.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Exception -> L7b
            java.lang.Object r0 = kotlin.getLicenseByteEncrypt.RemoteActionCompatParcelizer(r2, r0)     // Catch: java.lang.Exception -> L7b
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r1 = r0
            r0 = r8
        L6f:
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r1, r4)     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L76
            r4 = r1
            goto L89
        L76:
            r8 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L80
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L80:
            r1 = r0
            r0 = r6
            r6 = r8
        L83:
            r6.toString()
            r8 = r7
            r6 = r0
            r7 = r1
        L89:
            r8.IconCompatParcelizer(r4)
            o.SlowMotionDataSegmentExternalSyntheticLambda0 r6 = r6.IconCompatParcelizer     // Catch: java.lang.RuntimeException -> L99
            r6.AudioAttributesCompatParcelizer(r7)     // Catch: java.lang.RuntimeException -> L99
            o.SpliceScheduleCommandComponentSplice r6 = r7.write()     // Catch: java.lang.RuntimeException -> L99
            r6.getIconCompatParcelizer()     // Catch: java.lang.RuntimeException -> L99
            goto L9c
        L99:
            r6 = move-exception
            java.lang.Throwable r6 = (java.lang.Throwable) r6
        L9c:
            o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SmtaMetadataEntry1.read(o.parseFromSection, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: renamed from: o.SmtaMetadataEntry1$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/SmtaMetadataEntry1$write;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static int IconCompatParcelizer;
        public static int read;

        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static int IconCompatParcelizer() {
            int i = read;
            int i2 = i % 5226590;
            read = i + 1;
            if (i2 != 0) {
                return IconCompatParcelizer;
            }
            int iMyPid = Process.myPid();
            IconCompatParcelizer = iMyPid;
            return iMyPid;
        }
    }
}
