package kotlin;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¥\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000422\u0010\f\u001a.\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b2(\u0010\u000e\u001a$\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"T", "R", "", "Lo/JsonReadContext;", "Lkotlin/Function1;", "Lo/setCurrentName;", "", "p0", "Lkotlin/Function4;", "Lo/JsonReadFeature;", "Lo/PropertyBasedObjectIdGenerator;", "", "p1", "Lkotlin/Function3;", "p2", "Lo/PropertyBasedCreator;", "p3", "IconCompatParcelizer", "(Ljava/util/Set;Lo/getAnswerMap;Lo/getMagicModuleStat;Lo/getModuleData;Lo/PropertyBasedCreator;)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ObjectIdValueProperty {
    public static /* synthetic */ List IconCompatParcelizer$default(Set set, getAnswerMap getanswermap, getMagicModuleStat getmagicmodulestat, getModuleData getmoduledata, PropertyBasedCreator propertyBasedCreator, int i, Object obj) {
        if ((i & 8) != 0) {
            propertyBasedCreator = new PropertyBasedCreator();
        }
        return IconCompatParcelizer(set, getanswermap, getmagicmodulestat, getmoduledata, propertyBasedCreator);
    }

    public static final <T, R> List<R> IconCompatParcelizer(Set<? extends JsonReadContext> set, getAnswerMap<? super setCurrentName, getShowPopup> getanswermap, getMagicModuleStat<? super JsonReadFeature, ? super PropertyBasedObjectIdGenerator, ? super List<? extends T>, ? super List<? extends R>, ? extends T> getmagicmodulestat, getModuleData<? super setCurrentName, ? super T, ? super List<? extends setCurrentName>, ? extends R> getmoduledata, PropertyBasedCreator propertyBasedCreator) {
        return new constructForRootValue(set, getanswermap, getmagicmodulestat, getmoduledata, propertyBasedCreator).write();
    }
}
