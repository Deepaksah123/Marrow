package kotlin;

import android.graphics.Shader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "p0", "Lo/throwInternal;", "IconCompatParcelizer", "(Landroid/graphics/Shader;)Lo/throwInternal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InternCache {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/InternCache$write;", "Lo/throwInternal;", "Lo/calloc;", "p0", "Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(J)Landroid/graphics/Shader;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends throwInternal {
        final /* synthetic */ Shader read;

        write(Shader shader) {
            this.read = shader;
        }

        @Override // kotlin.throwInternal
        public final Shader IconCompatParcelizer(long p0) {
            return this.read;
        }
    }

    public static final throwInternal IconCompatParcelizer(Shader shader) {
        return new write(shader);
    }
}
