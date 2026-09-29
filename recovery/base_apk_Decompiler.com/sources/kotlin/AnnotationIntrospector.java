package kotlin;

import android.graphics.RenderEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/AnnotationIntrospector;", "", "<init>", "()V", "Lo/parseVersionPart;", "p0", "", "p1", "p2", "Lo/findContentSerializer;", "p3", "Landroid/graphics/RenderEffect;", "ce_", "(Lo/parseVersionPart;FFI)Landroid/graphics/RenderEffect;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AnnotationIntrospector {
    public static final AnnotationIntrospector INSTANCE = new AnnotationIntrospector();

    private AnnotationIntrospector() {
    }

    public final RenderEffect ce_(parseVersionPart p0, float p1, float p2, int p3) {
        if (p1 == BitmapDescriptorFactory.HUE_RED && p2 == BitmapDescriptorFactory.HUE_RED) {
            return RenderEffect.createOffsetEffect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        if (p0 == null) {
            return RenderEffect.createBlurEffect(p1, p2, isInline.read(p3));
        }
        return RenderEffect.createBlurEffect(p1, p2, p0.cc_(), isInline.read(p3));
    }
}
