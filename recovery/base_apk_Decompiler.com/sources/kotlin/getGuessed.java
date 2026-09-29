package kotlin;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
final class getGuessed<R> implements SearchMcqResponseBody<R, Object> {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final getIds AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final Type MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    getGuessed(Type type, getIds getids, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.MediaBrowserCompatCustomActionResultReceiver = type;
        this.AudioAttributesImplBaseParcelizer = getids;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = z2;
        this.read = z3;
        this.RemoteActionCompatParcelizer = z4;
        this.AudioAttributesImplApi26Parcelizer = z5;
        this.AudioAttributesCompatParcelizer = z6;
        this.write = z7;
    }

    @Override // kotlin.SearchMcqResponseBody
    public final Type read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // kotlin.SearchMcqResponseBody
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SearchTextResponseBody<R> r2) {
        /*
            r1 = this;
            boolean r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto La
            o.GTSubjectAnalyticsV2ResponseModelKt r0 = new o.GTSubjectAnalyticsV2ResponseModelKt
            r0.<init>(r2)
            goto Lf
        La:
            o.setTopicStat r0 = new o.setTopicStat
            r0.<init>(r2)
        Lf:
            boolean r2 = r1.MediaBrowserCompatItemReceiver
            if (r2 == 0) goto L1a
            o.getMcqTimingDetails r2 = new o.getMcqTimingDetails
            r2.<init>(r0)
        L18:
            r0 = r2
            goto L24
        L1a:
            boolean r2 = r1.read
            if (r2 == 0) goto L24
            o.GTSubjectAnalyticsV2ResponseModelCompanion r2 = new o.GTSubjectAnalyticsV2ResponseModelCompanion
            r2.<init>(r0)
            goto L18
        L24:
            o.getIds r2 = r1.AudioAttributesImplBaseParcelizer
            if (r2 == 0) goto L2c
            o.LessonIndexResponseBody r0 = r0.write(r2)
        L2c:
            boolean r2 = r1.RemoteActionCompatParcelizer
            if (r2 == 0) goto L37
            o.InteractiveVideoElementRSModel r1 = kotlin.InteractiveVideoElementRSModel.LATEST
            o.accessgetEmptyStatecp r1 = r0.write(r1)
            return r1
        L37:
            boolean r2 = r1.AudioAttributesImplApi26Parcelizer
            if (r2 == 0) goto L40
            o.LessonDynamicResponseBody r1 = r0.IconCompatParcelizer()
            return r1
        L40:
            boolean r2 = r1.AudioAttributesCompatParcelizer
            if (r2 == 0) goto L49
            o.getEmptyState r1 = r0.AudioAttributesCompatParcelizer()
            return r1
        L49:
            boolean r1 = r1.write
            if (r1 == 0) goto L52
            o.getAllOptions r1 = r0.write()
            return r1
        L52:
            o.LessonIndexResponseBody r1 = kotlin.getPaymentRefIds.read(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getGuessed.AudioAttributesCompatParcelizer(o.SearchTextResponseBody):java.lang.Object");
    }
}
