package kotlin;

import android.graphics.Matrix;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class AdWordsConversionReporter {
    public static void RemoteActionCompatParcelizer(ImageView imageView, Matrix matrix) {
        write.IconCompatParcelizer(imageView, matrix);
    }

    static class write {
        static void IconCompatParcelizer(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }
}
