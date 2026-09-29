package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/MotionPhotoMetadata;", "Lo/SlowMotionData;", "<init>", "()V", "Lo/WritableTypeIdInclusion;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/WritableTypeIdInclusion;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/UTF32Reader;", "Lo/SpliceScheduleCommand;", "write", "Lo/UTF32Reader;", "RemoteActionCompatParcelizer", "()Lo/UTF32Reader;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class MotionPhotoMetadata implements SlowMotionData {
    private final UTF32Reader<SpliceScheduleCommand> write = new UTF32Reader<>(new SpliceScheduleCommand[16], 0);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        int read;
        Object write;

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return MotionPhotoMetadata.this.AudioAttributesCompatParcelizer(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableTypeIdInclusion AudioAttributesCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion) {
        return writableTypeIdInclusion;
    }

    public final UTF32Reader<SpliceScheduleCommand> RemoteActionCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006a -> B:19:0x006d). Please report as a decompilation issue!!! */
    @Override // kotlin.SlowMotionData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.WritableTypeIdInclusion r8, kotlin.SampleVideos<? super kotlin.getShowPopup> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.MotionPhotoMetadata.RemoteActionCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r9
            o.MotionPhotoMetadata$RemoteActionCompatParcelizer r0 = (o.MotionPhotoMetadata.RemoteActionCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.IconCompatParcelizer
            int r9 = r9 + r2
            r0.IconCompatParcelizer = r9
            goto L19
        L14:
            o.MotionPhotoMetadata$RemoteActionCompatParcelizer r0 = new o.MotionPhotoMetadata$RemoteActionCompatParcelizer
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.MediaBrowserCompatItemReceiver
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r7 = r0.RemoteActionCompatParcelizer
            int r8 = r0.read
            java.lang.Object r2 = r0.write
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
            o.WritableTypeIdInclusion r4 = (kotlin.WritableTypeIdInclusion) r4
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            r9 = r4
            goto L6d
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.SdkPayloadData.IconCompatParcelizer(r9)
            o.UTF32Reader<o.SpliceScheduleCommand> r7 = r7.write
            T[] r9 = r7.IconCompatParcelizer
            int r7 = r7.getAudioAttributesCompatParcelizer()
            r2 = 0
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
        L4f:
            if (r8 >= r7) goto L6f
            r4 = r2[r8]
            o.SpliceScheduleCommand r4 = (kotlin.SpliceScheduleCommand) r4
            o.Module r4 = (kotlin.Module) r4
            o.SmtaMetadataEntry r5 = new o.SmtaMetadataEntry
            r5.<init>()
            r0.AudioAttributesCompatParcelizer = r9
            r0.write = r2
            r0.read = r8
            r0.RemoteActionCompatParcelizer = r7
            r0.IconCompatParcelizer = r3
            java.lang.Object r4 = kotlin.ConstructorDetector.read(r4, r5, r0)
            if (r4 != r1) goto L6d
            return r1
        L6d:
            int r8 = r8 + r3
            goto L4f
        L6f:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MotionPhotoMetadata.AudioAttributesCompatParcelizer(o.WritableTypeIdInclusion, o.SampleVideos):java.lang.Object");
    }
}
