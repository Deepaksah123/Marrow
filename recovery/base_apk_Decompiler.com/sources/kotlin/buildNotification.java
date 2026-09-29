package kotlin;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\"\u0010\u001c\u001a\u00020\u00168\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001c\u0010\u0014\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b!\u0010\"\"\u0004\b\u0015\u0010#R\u001c\u0010!\u001a\u00020\u00058\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b$\u0010\"\"\u0004\b\u001c\u0010#"}, d2 = {"Lo/buildNotification;", "Landroid/view/animation/Animation;", "Landroid/view/View;", "p0", "p1", "", "p2", "p3", "<init>", "(Landroid/view/View;Landroid/view/View;II)V", "", "initialize", "(IIII)V", "", "Landroid/view/animation/Transformation;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "AudioAttributesImplApi21Parcelizer", "Landroid/view/View;", "write", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "Landroid/graphics/Camera;", "Landroid/graphics/Camera;", "IconCompatParcelizer", "()Landroid/graphics/Camera;", "read", "(Landroid/graphics/Camera;)V", "AudioAttributesCompatParcelizer", "F", "", "Z", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "I", "()V", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class buildNotification extends Animation {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private View write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private View RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Camera AudioAttributesCompatParcelizer;

    public buildNotification(View view, View view2, int i, int i2) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(view2, "");
        this.write = view;
        this.RemoteActionCompatParcelizer = view2;
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.MediaBrowserCompatItemReceiver = 1;
        this.AudioAttributesImplApi26Parcelizer = 3;
        setDuration(500L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
    }

    private Camera IconCompatParcelizer() {
        Camera camera = this.AudioAttributesCompatParcelizer;
        if (camera != null) {
            return camera;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    private void read(Camera camera) {
        toMagicModuleMetaRepoModel.write(camera, "");
        this.AudioAttributesCompatParcelizer = camera;
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver = 1;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer = 3;
    }

    @Override // android.view.animation.Animation
    public final void initialize(int p0, int p1, int p2, int p3) {
        super.initialize(p0, p1, p2, p3);
        read(new Camera());
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float p0, Transformation p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        double d = ((double) p0) * 3.141592653589793d;
        float f = (float) ((180.0d * d) / 3.141592653589793d);
        if (p0 >= 0.5f) {
            f -= 180.0f;
            if (!this.AudioAttributesImplApi21Parcelizer) {
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(this.write);
                PlayerControlViewExternalSyntheticLambda1.write(this.RemoteActionCompatParcelizer);
                this.AudioAttributesImplApi21Parcelizer = true;
            }
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            f = -f;
        }
        Matrix matrix = p1.getMatrix();
        IconCompatParcelizer().save();
        int i = this.AudioAttributesImplApi26Parcelizer;
        if (i == 2) {
            IconCompatParcelizer().translate(BitmapDescriptorFactory.HUE_RED, (float) (Math.sin(d) * 150.0d), BitmapDescriptorFactory.HUE_RED);
        } else if (i == 3) {
            IconCompatParcelizer().translate(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (Math.sin(d) * 150.0d));
        } else {
            IconCompatParcelizer().translate((float) (Math.sin(d) * 150.0d), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        int i2 = this.MediaBrowserCompatItemReceiver;
        if (i2 == 2) {
            IconCompatParcelizer().rotateY(f);
        } else if (i2 == 3) {
            IconCompatParcelizer().rotateZ(f);
        } else {
            IconCompatParcelizer().rotateX(f);
        }
        IconCompatParcelizer().getMatrix(matrix);
        IconCompatParcelizer().restore();
        matrix.preTranslate(-this.read, -this.IconCompatParcelizer);
        matrix.postTranslate(this.read, this.IconCompatParcelizer);
    }
}
