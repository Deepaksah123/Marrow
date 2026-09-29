package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/semantics/TopBottomBoundsComparator;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "<init>", "()V", "compare", "", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, "b", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class findMixInClassFor implements Comparator<Pair<? extends WritableTypeIdInclusion, ? extends List<valueInstantiatorInstance>>> {
    public static final findMixInClassFor RemoteActionCompatParcelizer = new findMixInClassFor();

    private findMixInClassFor() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final int compare(Pair<WritableTypeIdInclusion, ? extends List<valueInstantiatorInstance>> pair, Pair<WritableTypeIdInclusion, ? extends List<valueInstantiatorInstance>> pair2) {
        int iCompare = Float.compare(pair.write().getRemoteActionCompatParcelizer(), pair2.write().getRemoteActionCompatParcelizer());
        return iCompare != 0 ? iCompare : Float.compare(pair.write().getIconCompatParcelizer(), pair2.write().getIconCompatParcelizer());
    }
}
