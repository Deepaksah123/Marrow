package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBasePlayerMediaItemData {
    private static final getAnswerMap<File, Bitmap> read = new getAnswerMap() { // from class: o.access7100
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return SimpleBasePlayerMediaItemData.IconCompatParcelizer((File) obj);
        }
    };
    private static final getAnswerMap<File, byte[]> IconCompatParcelizer = new getAnswerMap() { // from class: o.access5000
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return SimpleBasePlayerMediaItemData.RemoteActionCompatParcelizer((File) obj);
        }
    };
    private static final getAnswerMap<byte[], Bitmap> AudioAttributesCompatParcelizer = new getAnswerMap() { // from class: o.getCombinedMediaMetadata
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return SimpleBasePlayerMediaItemData.write((byte[]) obj);
        }
    };
    private static final getAnswerMap<Bitmap, byte[]> write = new getAnswerMap() { // from class: o.access4900
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return SimpleBasePlayerMediaItemData.AudioAttributesCompatParcelizer((Bitmap) obj);
        }
    };

    public static final getAnswerMap<File, Bitmap> IconCompatParcelizer() {
        return read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap IconCompatParcelizer(File file) {
        if (file == null || !SimpleBasePlayerExternalSyntheticLambda56.write(file)) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    public static final getAnswerMap<File, byte[]> write() {
        return IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] RemoteActionCompatParcelizer(File file) {
        if (file != null) {
            return downloadMagicModuleDetail.read(file);
        }
        return null;
    }

    public static final getAnswerMap<byte[], Bitmap> AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap write(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static final getAnswerMap<Bitmap, byte[]> RemoteActionCompatParcelizer() {
        return write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] AudioAttributesCompatParcelizer(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
