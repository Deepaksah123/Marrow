package kotlin;

import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setCurrentItem;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "p0", "Lo/deserializeFromNumber;", "p1", "Lo/WritableTypeIdInclusion;", "p2", "IconCompatParcelizer", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lo/deserializeFromNumber;Lo/WritableTypeIdInclusion;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setCurrentItem {
    public static final setCurrentItem INSTANCE = new setCurrentItem();

    private setCurrentItem() {
    }

    @getMagicModuleMeta
    public static final CursorAnchorInfo.Builder IconCompatParcelizer(CursorAnchorInfo.Builder p0, deserializeFromNumber p1, WritableTypeIdInclusion p2) {
        int iWrite;
        int iWrite2;
        int iWrite3;
        if (!p2.MediaBrowserCompatCustomActionResultReceiver() && (iWrite2 = getQues.write(p1.read(p2.getRemoteActionCompatParcelizer()), 0, (iWrite = getQues.write(p1.AudioAttributesImplBaseParcelizer() - 1, 0)))) <= (iWrite3 = getQues.write(p1.read(p2.getIconCompatParcelizer()), 0, iWrite))) {
            while (true) {
                p0.addVisibleLineBounds(p1.MediaBrowserCompatCustomActionResultReceiver(iWrite2), p1.AudioAttributesImplBaseParcelizer(iWrite2), p1.MediaBrowserCompatItemReceiver(iWrite2), p1.read(iWrite2));
                if (iWrite2 == iWrite3) {
                    break;
                }
                iWrite2++;
            }
        }
        return p0;
    }
}
