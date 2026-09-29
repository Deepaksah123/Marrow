package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class defineDefaultImpl {
    public static Bitmap RemoteActionCompatParcelizer(byte[] bArr, int i) throws IOException {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, null);
        if (bitmapDecodeByteArray == null) {
            throw SchemaAware.RemoteActionCompatParcelizer("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            createEnumNamingStrategyInstance createenumnamingstrategyinstance = new createEnumNamingStrategyInstance(byteArrayInputStream);
            byteArrayInputStream.close();
            int iRemoteActionCompatParcelizer = createenumnamingstrategyinstance.RemoteActionCompatParcelizer();
            if (iRemoteActionCompatParcelizer == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iRemoteActionCompatParcelizer);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
