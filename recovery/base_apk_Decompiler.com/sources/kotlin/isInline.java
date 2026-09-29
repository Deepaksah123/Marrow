package kotlin;

import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findContentSerializer;", "Landroid/graphics/Shader$TileMode;", "read", "(I)Landroid/graphics/Shader$TileMode;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isInline {
    public static final Shader.TileMode read(int i) {
        if (findContentSerializer.IconCompatParcelizer(i, findContentSerializer.INSTANCE.AudioAttributesCompatParcelizer())) {
            return Shader.TileMode.CLAMP;
        }
        if (findContentSerializer.IconCompatParcelizer(i, findContentSerializer.INSTANCE.write())) {
            return Shader.TileMode.REPEAT;
        }
        if (findContentSerializer.IconCompatParcelizer(i, findContentSerializer.INSTANCE.read())) {
            return Shader.TileMode.MIRROR;
        }
        if (findContentSerializer.IconCompatParcelizer(i, findContentSerializer.INSTANCE.RemoteActionCompatParcelizer())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return findContentDeserializer.INSTANCE.IconCompatParcelizer();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
