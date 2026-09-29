package kotlin;

import java.util.List;
import kotlin.TaxPercentInfoCompanion;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseConfigV2NavDrawerItemMarrowNotes<Type extends TaxPercentInfoCompanion> extends CourseConfigV2ZenAreaItem<Type> {
    private final Type AudioAttributesCompatParcelizer;
    private final getRelatedLessonId RemoteActionCompatParcelizer;

    public final getRelatedLessonId read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Type IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseConfigV2NavDrawerItemMarrowNotes(getRelatedLessonId getrelatedlessonid, Type type) {
        super((byte) 0);
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(type, "");
        this.RemoteActionCompatParcelizer = getrelatedlessonid;
        this.AudioAttributesCompatParcelizer = type;
    }

    @Override // kotlin.CourseConfigV2ZenAreaItem
    public final List<Pair<getRelatedLessonId, Type>> AudioAttributesCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setAction.write(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InlineClassRepresentation(underlyingPropertyName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", underlyingType=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
