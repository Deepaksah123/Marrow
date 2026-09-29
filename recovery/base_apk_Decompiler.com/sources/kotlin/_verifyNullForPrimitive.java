package kotlin;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin._verifyNullForPrimitiveCoercion;

/* JADX INFO: loaded from: classes2.dex */
public final class _verifyNullForPrimitive {
    private static final ThreadLocal<StringArrayDeserializer<Rect, Rect>> write = new ThreadLocal<>();

    public static boolean write(Paint paint, _parseString _parsestring) {
        IconCompatParcelizer.AudioAttributesCompatParcelizer(paint, _parsestring != null ? _verifyNullForPrimitiveCoercion.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_parsestring) : null);
        return true;
    }

    static class IconCompatParcelizer {
        static void AudioAttributesCompatParcelizer(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }
}
