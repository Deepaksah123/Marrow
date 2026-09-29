package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "compare", "", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, "b", "pathFromRoot", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ResolvedType implements Comparator<_handleSpillOverflow> {
    public static final ResolvedType IconCompatParcelizer = new ResolvedType();

    private ResolvedType() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final int compare(_handleSpillOverflow _handlespilloverflow, _handleSpillOverflow _handlespilloverflow2) {
        int i = 0;
        if (!_hashToIndex.AudioAttributesCompatParcelizer(_handlespilloverflow) || !_hashToIndex.AudioAttributesCompatParcelizer(_handlespilloverflow2)) {
            if (_hashToIndex.AudioAttributesCompatParcelizer(_handlespilloverflow)) {
                return -1;
            }
            return _hashToIndex.AudioAttributesCompatParcelizer(_handlespilloverflow2) ? 1 : 0;
        }
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow);
        _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer2 = collectLongDefaults.AudioAttributesImplApi26Parcelizer(_handlespilloverflow2);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer, _assertnotnullAudioAttributesImplApi26Parcelizer2)) {
            return 0;
        }
        UTF32Reader<_assertNotNull> uTF32ReaderIconCompatParcelizer = IconCompatParcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer);
        UTF32Reader<_assertNotNull> uTF32ReaderIconCompatParcelizer2 = IconCompatParcelizer(_assertnotnullAudioAttributesImplApi26Parcelizer2);
        int iMin = Math.min(uTF32ReaderIconCompatParcelizer.getAudioAttributesCompatParcelizer() - 1, uTF32ReaderIconCompatParcelizer2.getAudioAttributesCompatParcelizer() - 1);
        if (iMin >= 0) {
            while (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(uTF32ReaderIconCompatParcelizer.IconCompatParcelizer[i], uTF32ReaderIconCompatParcelizer2.IconCompatParcelizer[i])) {
                if (i != iMin) {
                    i++;
                }
            }
            return toMagicModuleMetaRepoModel.read(uTF32ReaderIconCompatParcelizer.IconCompatParcelizer[i].accessaddObserverForBackInvoker(), uTF32ReaderIconCompatParcelizer2.IconCompatParcelizer[i].accessaddObserverForBackInvoker());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }

    private final UTF32Reader<_assertNotNull> IconCompatParcelizer(_assertNotNull _assertnotnull) {
        UTF32Reader<_assertNotNull> uTF32Reader = new UTF32Reader<>(new _assertNotNull[16], 0);
        while (_assertnotnull != null) {
            uTF32Reader.RemoteActionCompatParcelizer(0, _assertnotnull);
            _assertnotnull = _assertnotnull._init_lambda4();
        }
        return uTF32Reader;
    }
}
