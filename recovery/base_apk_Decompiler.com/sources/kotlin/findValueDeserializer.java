package kotlin;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/findValueDeserializer;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "p0", "Lo/WritableTypeIdInclusion;", "p1", "AudioAttributesCompatParcelizer", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lo/WritableTypeIdInclusion;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class findValueDeserializer {
    public static final findValueDeserializer INSTANCE = new findValueDeserializer();

    private findValueDeserializer() {
    }

    @getMagicModuleMeta
    public static final CursorAnchorInfo.Builder AudioAttributesCompatParcelizer(CursorAnchorInfo.Builder p0, WritableTypeIdInclusion p1) {
        return p0.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(VersionUtil.IconCompatParcelizer(p1)).setHandwritingBounds(VersionUtil.IconCompatParcelizer(p1)).build());
    }
}
