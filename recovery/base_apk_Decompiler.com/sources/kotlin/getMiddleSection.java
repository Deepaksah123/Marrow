package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.TaxPercentInfoCompanion;

/* JADX INFO: loaded from: classes4.dex */
public final class getMiddleSection<Type extends TaxPercentInfoCompanion> extends CourseConfigV2ZenAreaItem<Type> {
    private final List<Pair<getRelatedLessonId, Type>> IconCompatParcelizer;
    private final Map<getRelatedLessonId, Type> read;

    @Override // kotlin.CourseConfigV2ZenAreaItem
    public final List<Pair<getRelatedLessonId, Type>> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public getMiddleSection(List<? extends Pair<getRelatedLessonId, ? extends Type>> list) {
        super((byte) 0);
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = list;
        Map<getRelatedLessonId, Type> map = VideoTimelineResponseBody.read(AudioAttributesCompatParcelizer());
        if (map.size() == AudioAttributesCompatParcelizer().size()) {
            this.read = map;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(')');
        return sb.toString();
    }
}
