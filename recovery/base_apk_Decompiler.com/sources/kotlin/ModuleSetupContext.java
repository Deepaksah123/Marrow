package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\"\u001e\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"DepthComparator", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ModuleSetupContext {
    private static final Comparator<_assertNotNull> IconCompatParcelizer = new AudioAttributesCompatParcelizer();

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/node/DepthSortedSetKt$DepthComparator$1", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "compare", "", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, "b", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements Comparator<_assertNotNull> {
        AudioAttributesCompatParcelizer() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final int compare(_assertNotNull _assertnotnull, _assertNotNull _assertnotnull2) {
            int i = toMagicModuleMetaRepoModel.read(_assertnotnull.getOnPlayFromUri(), _assertnotnull2.getOnPlayFromUri());
            return i != 0 ? i : toMagicModuleMetaRepoModel.read(_assertnotnull.hashCode(), _assertnotnull2.hashCode());
        }
    }
}
