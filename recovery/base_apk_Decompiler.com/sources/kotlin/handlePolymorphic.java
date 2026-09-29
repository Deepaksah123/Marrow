package kotlin;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/handlePolymorphic;", "", "<init>", "()V", "Lo/addInjectables;", "p0", "Landroid/graphics/RectF;", "p1", "", "p2", "Lkotlin/Function2;", "", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/addInjectables;Landroid/graphics/RectF;ILo/MagicModuleSubmissionRequestBody;)[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handlePolymorphic {
    public static final handlePolymorphic INSTANCE = new handlePolymorphic();

    private handlePolymorphic() {
    }

    public final int[] AudioAttributesCompatParcelizer(addInjectables p0, RectF p1, int p2, final MagicModuleSubmissionRequestBody<? super RectF, ? super RectF, Boolean> p3) {
        GraphemeClusterSegmentFinder graphemeClusterSegmentFinder;
        if (p2 == 1) {
            graphemeClusterSegmentFinder = _findUnsupportedTypeDeserializer.INSTANCE.ch_(new filterBeanProps(p0.MediaBrowserCompatItemReceiver(), p0.AudioAttributesImplBaseParcelizer()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(p0.MediaBrowserCompatItemReceiver(), p0.getRead());
        }
        return p0.getMediaBrowserCompatItemReceiver().getRangeForRect(p1, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: o.wrapAndThrow
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                return handlePolymorphic.write(p3, rectF, rectF2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, RectF rectF, RectF rectF2) {
        return ((Boolean) magicModuleSubmissionRequestBody.invoke(rectF, rectF2)).booleanValue();
    }
}
