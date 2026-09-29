package kotlin;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class updateNextSearchBytePosition extends Property<ImageView, Matrix> {
    private final Matrix write;

    @Override // android.util.Property
    public final /* synthetic */ void set(ImageView imageView, Matrix matrix) {
        read(imageView, matrix);
    }

    public updateNextSearchBytePosition() {
        super(Matrix.class, "imageMatrixProperty");
        this.write = new Matrix();
    }

    private static void read(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.util.Property
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.write.set(imageView.getImageMatrix());
        return this.write;
    }
}
