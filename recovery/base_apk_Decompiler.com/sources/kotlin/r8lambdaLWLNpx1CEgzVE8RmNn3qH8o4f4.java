package kotlin;

import java.io.File;
import kotlin.MediaItemClippingProperties;

/* JADX INFO: loaded from: classes2.dex */
public class r8lambdaLWLNpx1CEgzVE8RmNn3qH8o4f4 implements MediaItemClippingProperties.IconCompatParcelizer {
    private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private final long write = 262144000;

    public interface AudioAttributesCompatParcelizer {
        File write();
    }

    public r8lambdaLWLNpx1CEgzVE8RmNn3qH8o4f4(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
    }

    @Override // o.MediaItemClippingProperties.IconCompatParcelizer
    public final MediaItemClippingProperties write() {
        File fileWrite = this.AudioAttributesCompatParcelizer.write();
        if (fileWrite == null) {
            return null;
        }
        if (fileWrite.isDirectory() || fileWrite.mkdirs()) {
            return setNullableScheme.read(fileWrite, this.write);
        }
        return null;
    }
}
