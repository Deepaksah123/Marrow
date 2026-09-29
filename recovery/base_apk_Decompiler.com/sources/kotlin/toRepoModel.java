package kotlin;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
final class toRepoModel implements GTSubjectAnalyticsV2RSModel {
    private static final GTSubjectAnalyticsV2RSModel read = new toRepoModel();

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    toRepoModel() {
    }

    static Annotation[] AudioAttributesCompatParcelizer(Annotation[] annotationArr) {
        if (GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(annotationArr, (Class<? extends Annotation>) GTSubjectAnalyticsV2RSModel.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = read;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return GTSubjectAnalyticsV2RSModel.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof GTSubjectAnalyticsV2RSModel;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append(GTSubjectAnalyticsV2RSModel.class.getName());
        sb.append("()");
        return sb.toString();
    }
}
