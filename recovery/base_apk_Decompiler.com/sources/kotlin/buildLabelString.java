package kotlin;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/buildLabelString;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Bitmap;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class buildLabelString {
    public static final buildLabelString INSTANCE = new buildLabelString();

    private buildLabelString() {
    }

    @getMagicModuleMeta
    public static final String AudioAttributesCompatParcelizer(Bitmap p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p0.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 10);
        toMagicModuleMetaRepoModel.write((Object) strEncodeToString);
        return strEncodeToString;
    }
}
