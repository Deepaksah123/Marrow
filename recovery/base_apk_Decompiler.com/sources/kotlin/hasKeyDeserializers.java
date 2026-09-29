package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/ui/semantics/RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "<init>", "()V", "compare", "", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, "b", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class hasKeyDeserializers implements Comparator<valueInstantiatorInstance> {
    public static final hasKeyDeserializers read = new hasKeyDeserializers();

    private hasKeyDeserializers() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final int compare(valueInstantiatorInstance valueinstantiatorinstance, valueInstantiatorInstance valueinstantiatorinstance2) {
        WritableTypeIdInclusion writableTypeIdInclusionRemoteActionCompatParcelizer = valueinstantiatorinstance.RemoteActionCompatParcelizer();
        WritableTypeIdInclusion writableTypeIdInclusionRemoteActionCompatParcelizer2 = valueinstantiatorinstance2.RemoteActionCompatParcelizer();
        int iCompare = Float.compare(writableTypeIdInclusionRemoteActionCompatParcelizer2.getWrite(), writableTypeIdInclusionRemoteActionCompatParcelizer.getWrite());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(writableTypeIdInclusionRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer(), writableTypeIdInclusionRemoteActionCompatParcelizer2.getRemoteActionCompatParcelizer());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(writableTypeIdInclusionRemoteActionCompatParcelizer.getIconCompatParcelizer(), writableTypeIdInclusionRemoteActionCompatParcelizer2.getIconCompatParcelizer());
        return iCompare3 != 0 ? iCompare3 : Float.compare(writableTypeIdInclusionRemoteActionCompatParcelizer2.getAudioAttributesCompatParcelizer(), writableTypeIdInclusionRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer());
    }
}
