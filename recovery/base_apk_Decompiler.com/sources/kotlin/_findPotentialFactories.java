package kotlin;

import java.io.File;
import java.util.List;
import kotlin.AnnotatedCreatorCollector;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/_findPotentialFactories;", "", "<init>", "()V", "T", "Lo/constructNonDefaultConstructor;", "p0", "Lo/AnnotatedFieldCollector;", "p1", "", "Lo/withAnnotations;", "p2", "Lo/TopUserCompanion;", "p3", "Lkotlin/Function0;", "Ljava/io/File;", "p4", "Lo/collectAnnotations;", "IconCompatParcelizer", "(Lo/constructNonDefaultConstructor;Lo/AnnotatedFieldCollector;Ljava/util/List;Lo/TopUserCompanion;Lo/getCreatedOnDateMs;)Lo/collectAnnotations;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class _findPotentialFactories {
    public static final _findPotentialFactories INSTANCE = new _findPotentialFactories();

    private _findPotentialFactories() {
    }

    public static <T> collectAnnotations<T> IconCompatParcelizer(constructNonDefaultConstructor<T> p0, AnnotatedFieldCollector<T> p1, List<? extends withAnnotations<T>> p2, TopUserCompanion p3, getCreatedOnDateMs<? extends File> p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        if (p1 == null) {
            p1 = (AnnotatedFieldCollector<T>) new AnnotatedFieldSerialization();
        }
        AnnotatedFieldCollector<T> annotatedFieldCollector = p1;
        AnnotatedCreatorCollector.Companion readVar = AnnotatedCreatorCollector.INSTANCE;
        return new collect(p4, p0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(AnnotatedCreatorCollector.Companion.IconCompatParcelizer(p2)), annotatedFieldCollector, p3);
    }
}
