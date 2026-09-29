package kotlin;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\u0012B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018"}, d2 = {"Lo/PlayerControlView1;", "Landroid/view/animation/Animation;", "Landroid/widget/ProgressBar;", "p0", "", "p1", "p2", "<init>", "(Landroid/widget/ProgressBar;F)V", "Lo/PlayerControlView1$read;", "", "read", "(Lo/PlayerControlView1$read;)V", "Landroid/view/animation/Transformation;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "AudioAttributesCompatParcelizer", "Landroid/widget/ProgressBar;", "RemoteActionCompatParcelizer", "F", "IconCompatParcelizer", "write", "Lo/PlayerControlView1$read;", "Lo/PlayerControlView1$RemoteActionCompatParcelizer;", "Lo/PlayerControlView1$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlayerControlView1 extends Animation {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ProgressBar read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private read RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    public interface RemoteActionCompatParcelizer {
    }

    public interface read {
        void read(int i);
    }

    public PlayerControlView1(ProgressBar progressBar, float f) {
        toMagicModuleMetaRepoModel.write(progressBar, "");
        this.read = progressBar;
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesCompatParcelizer = f;
    }

    public final void read(read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = p0;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float p0, Transformation p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        super.applyTransformation(p0, p1);
        int i = (int) (this.IconCompatParcelizer + (this.AudioAttributesCompatParcelizer * p0));
        this.read.setProgress(i);
        read readVar = this.RemoteActionCompatParcelizer;
        if (readVar != null) {
            readVar.read(i);
        }
    }
}
