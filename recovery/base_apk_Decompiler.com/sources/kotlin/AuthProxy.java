package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthProxy {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<kotlin.AuthProxyOptions> write(java.util.List<com.marrow.data.models.common.CourseConfigV2.CustomModuleQuestionSource> r9) {
        /*
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r9, r0)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r9, r1)
            r0.<init>(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r9 = r9.iterator()
        L18:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r9.next()
            com.marrow.data.models.common.CourseConfigV2$CustomModuleQuestionSource r1 = (com.marrow.data.models.common.CourseConfigV2.CustomModuleQuestionSource) r1
            java.lang.String r3 = r1.getLabel()
            java.lang.String r4 = r1.getCategory()
            java.lang.String r1 = r1.getType()
            int r2 = r1.hashCode()
            r5 = 3556498(0x364492, float:4.983715E-39)
            if (r2 == r5) goto L59
            r5 = 107374125(0x666662d, float:4.333326E-35)
            if (r2 == r5) goto L4e
            r5 = 2005378358(0x7787a536, float:5.5024293E33)
            if (r2 != r5) goto L61
            java.lang.String r2 = "bookmark"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L61
            o.WorkAccountApiAddAccountResult r1 = kotlin.WorkAccountApiAddAccountResult.AudioAttributesCompatParcelizer
            goto L63
        L4e:
            java.lang.String r2 = "qbank"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L61
            o.WorkAccountApiAddAccountResult r1 = kotlin.WorkAccountApiAddAccountResult.read
            goto L63
        L59:
            java.lang.String r2 = "test"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L65
        L61:
            o.WorkAccountApiAddAccountResult r1 = kotlin.WorkAccountApiAddAccountResult.IconCompatParcelizer
        L63:
            r6 = r1
            goto L68
        L65:
            o.WorkAccountApiAddAccountResult r1 = kotlin.WorkAccountApiAddAccountResult.write
            goto L63
        L68:
            o.AuthProxyOptions r1 = new o.AuthProxyOptions
            r5 = 0
            r7 = 4
            r8 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.add(r1)
            goto L18
        L75:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AuthProxy.write(java.util.List):java.util.List");
    }
}
