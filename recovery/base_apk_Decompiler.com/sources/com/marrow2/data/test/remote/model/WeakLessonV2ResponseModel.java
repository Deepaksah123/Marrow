package com.marrow2.data.test.remote.model;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow2/data/test/remote/model/WeakLessonV2ResponseModel;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow2/data/test/remote/model/WeakLessonV2ResponseModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "title", "Ljava/lang/String;", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WeakLessonV2ResponseModel {
    public static final int $stable = 0;
    private final String title;

    public WeakLessonV2ResponseModel(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.title = str;
    }

    public /* synthetic */ WeakLessonV2ResponseModel(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeakLessonV2ResponseModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WeakLessonV2ResponseModel copy$default(WeakLessonV2ResponseModel weakLessonV2ResponseModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weakLessonV2ResponseModel.title;
        }
        return weakLessonV2ResponseModel.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final WeakLessonV2ResponseModel copy(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new WeakLessonV2ResponseModel(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof WeakLessonV2ResponseModel) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) ((WeakLessonV2ResponseModel) p0).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        String str = this.title;
        StringBuilder sb = new StringBuilder("WeakLessonV2ResponseModel(title=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
