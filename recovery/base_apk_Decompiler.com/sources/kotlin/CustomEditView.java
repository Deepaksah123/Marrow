package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomEditView implements setLockedFromSeek {
    private final resetCurrentSelectedPosition AudioAttributesCompatParcelizer;
    private final LessonCompletedDialog AudioAttributesImplBaseParcelizer;
    private getMarkerPaint IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private long read;
    private boolean write;

    public CustomEditView(LessonCompletedDialog lessonCompletedDialog) {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialog, "");
        this.AudioAttributesImplBaseParcelizer = lessonCompletedDialog;
        resetCurrentSelectedPosition resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer = lessonCompletedDialog.AudioAttributesImplApi26Parcelizer();
        this.AudioAttributesCompatParcelizer = resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer;
        this.IconCompatParcelizer = resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.head;
        getMarkerPaint getmarkerpaint = resetcurrentselectedpositionAudioAttributesImplApi26Parcelizer.head;
        this.RemoteActionCompatParcelizer = getmarkerpaint != null ? getmarkerpaint.pos : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r3 == r4.pos) goto L15;
     */
    @Override // kotlin.setLockedFromSeek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AudioAttributesCompatParcelizer(kotlin.resetCurrentSelectedPosition r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L89
            boolean r3 = r8.write
            if (r3 != 0) goto L7d
            o.getMarkerPaint r3 = r8.IconCompatParcelizer
            if (r3 == 0) goto L33
            o.resetCurrentSelectedPosition r4 = r8.AudioAttributesCompatParcelizer
            o.getMarkerPaint r4 = r4.head
            if (r3 != r4) goto L27
            int r3 = r8.RemoteActionCompatParcelizer
            o.resetCurrentSelectedPosition r4 = r8.AudioAttributesCompatParcelizer
            o.getMarkerPaint r4 = r4.head
            kotlin.toMagicModuleMetaRepoModel.write(r4)
            int r4 = r4.pos
            if (r3 != r4) goto L27
            goto L33
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L33:
            if (r2 != 0) goto L36
            return r0
        L36:
            o.LessonCompletedDialog r0 = r8.AudioAttributesImplBaseParcelizer
            long r1 = r8.read
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.MediaBrowserCompatCustomActionResultReceiver(r1)
            if (r0 != 0) goto L46
            r8 = -1
            return r8
        L46:
            o.getMarkerPaint r0 = r8.IconCompatParcelizer
            if (r0 != 0) goto L61
            o.resetCurrentSelectedPosition r0 = r8.AudioAttributesCompatParcelizer
            o.getMarkerPaint r0 = r0.head
            if (r0 == 0) goto L61
            o.resetCurrentSelectedPosition r0 = r8.AudioAttributesCompatParcelizer
            o.getMarkerPaint r0 = r0.head
            r8.IconCompatParcelizer = r0
            o.resetCurrentSelectedPosition r0 = r8.AudioAttributesCompatParcelizer
            o.getMarkerPaint r0 = r0.head
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            int r0 = r0.pos
            r8.RemoteActionCompatParcelizer = r0
        L61:
            o.resetCurrentSelectedPosition r0 = r8.AudioAttributesCompatParcelizer
            long r0 = r0.getSize()
            long r2 = r8.read
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            o.resetCurrentSelectedPosition r2 = r8.AudioAttributesCompatParcelizer
            long r4 = r8.read
            r3 = r9
            r6 = r10
            r2.write(r3, r4, r6)
            long r0 = r8.read
            long r0 = r0 + r10
            r8.read = r0
            return r10
        L7d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L89:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r9 = r9.concat(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CustomEditView.AudioAttributesCompatParcelizer(o.resetCurrentSelectedPosition, long):long");
    }

    @Override // kotlin.setLockedFromSeek
    public final CustomTextView RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.write = true;
    }
}
