package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;
import kotlin.appendDesc;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\b\u0010\fR\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/getInputCodeComment;", "Lo/appendDesc;", "p0", "<init>", "(Lo/appendDesc;)V", "", "write", "()V", "IconCompatParcelizer", "R", "Lkotlin/Function1;", "", "(Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Lo/appendDesc;", "Lo/includeElement;", "RemoteActionCompatParcelizer", "Lo/includeElement;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getInputCodeComment implements appendDesc {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final appendDesc IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final includeElement AudioAttributesCompatParcelizer = new includeElement();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer<R> extends getTotalMcq {
        Object RemoteActionCompatParcelizer;
        int read;
        /* synthetic */ Object write;

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return getInputCodeComment.this.IconCompatParcelizer(null, this);
        }
    }

    public getInputCodeComment(appendDesc appenddesc) {
        this.IconCompatParcelizer = appenddesc;
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) appendDesc.DefaultImpls.write(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) appendDesc.DefaultImpls.AudioAttributesCompatParcelizer(this, iconCompatParcelizer);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return appendDesc.DefaultImpls.IconCompatParcelizer(this, iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return appendDesc.DefaultImpls.IconCompatParcelizer(this, currentQuery);
    }

    public final void write() {
        this.AudioAttributesCompatParcelizer.read();
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.appendDesc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <R> java.lang.Object IconCompatParcelizer(kotlin.getAnswerMap<? super java.lang.Long, ? extends R> r6, kotlin.SampleVideos<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.getInputCodeComment.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r7
            o.getInputCodeComment$AudioAttributesCompatParcelizer r0 = (o.getInputCodeComment.AudioAttributesCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.read
            int r7 = r7 + r2
            r0.read = r7
            goto L19
        L14:
            o.getInputCodeComment$AudioAttributesCompatParcelizer r0 = new o.getInputCodeComment$AudioAttributesCompatParcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.write
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.Object r6 = r0.RemoteActionCompatParcelizer
            o.getAnswerMap r6 = (kotlin.getAnswerMap) r6
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L4c
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            o.includeElement r7 = r5.AudioAttributesCompatParcelizer
            r0.RemoteActionCompatParcelizer = r6
            r0.read = r4
            java.lang.Object r7 = r7.write(r0)
            if (r7 == r1) goto L5b
        L4c:
            o.appendDesc r5 = r5.IconCompatParcelizer
            r7 = 0
            r0.RemoteActionCompatParcelizer = r7
            r0.read = r3
            java.lang.Object r5 = r5.IconCompatParcelizer(r6, r0)
            if (r5 != r1) goto L5a
            goto L5b
        L5a:
            return r5
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getInputCodeComment.IconCompatParcelizer(o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }
}
