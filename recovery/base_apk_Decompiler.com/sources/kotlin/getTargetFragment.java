package kotlin;

import android.os.Build;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.NioPathSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ%\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u001e8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lo/getTargetFragment;", "Lo/NioPathSerializer$read;", "Ljava/lang/Runnable;", "Lo/finishBranchObject;", "Landroid/view/View$OnAttachStateChangeListener;", "Lo/onCreateContextMenu;", "p0", "<init>", "(Lo/onCreateContextMenu;)V", "Lo/NioPathSerializer;", "", "write", "(Lo/NioPathSerializer;)V", "Lo/NioPathSerializer$RemoteActionCompatParcelizer;", "p1", "(Lo/NioPathSerializer;Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;", "Landroidx/core/view/WindowInsetsCompat;", "", "AudioAttributesCompatParcelizer", "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;", "IconCompatParcelizer", "Landroid/view/View;", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lo/onCreateContextMenu;", "", "Z", "RemoteActionCompatParcelizer", "read", "Landroidx/core/view/WindowInsetsCompat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getTargetFragment extends NioPathSerializer.read implements Runnable, finishBranchObject, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final onCreateContextMenu write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public WindowInsetsCompat IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public boolean AudioAttributesCompatParcelizer;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p0) {
    }

    public getTargetFragment(onCreateContextMenu oncreatecontextmenu) {
        super(!oncreatecontextmenu.getOnPause() ? 1 : 0);
        this.write = oncreatecontextmenu;
    }

    @Override // o.NioPathSerializer.read
    public final void write(NioPathSerializer p0) {
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer = true;
        super.write(p0);
    }

    @Override // o.NioPathSerializer.read
    public final NioPathSerializer.RemoteActionCompatParcelizer write(NioPathSerializer p0, NioPathSerializer.RemoteActionCompatParcelizer p1) {
        this.RemoteActionCompatParcelizer = false;
        return super.write(p0, p1);
    }

    @Override // o.NioPathSerializer.read
    public final WindowInsetsCompat AudioAttributesCompatParcelizer(WindowInsetsCompat p0, List<NioPathSerializer> p1) {
        onCreateContextMenu.RemoteActionCompatParcelizer$default(this.write, p0, 0, 2, null);
        return this.write.getOnPause() ? WindowInsetsCompat.IconCompatParcelizer : p0;
    }

    @Override // o.NioPathSerializer.read
    public final void IconCompatParcelizer(NioPathSerializer p0) {
        this.RemoteActionCompatParcelizer = false;
        this.AudioAttributesCompatParcelizer = false;
        WindowInsetsCompat windowInsetsCompat = this.IconCompatParcelizer;
        if (p0.write() > 0 && windowInsetsCompat != null) {
            this.write.RemoteActionCompatParcelizer(windowInsetsCompat);
            this.write.read(windowInsetsCompat);
            onCreateContextMenu.RemoteActionCompatParcelizer$default(this.write, windowInsetsCompat, 0, 2, null);
        }
        this.IconCompatParcelizer = null;
        super.IconCompatParcelizer(p0);
    }

    @Override // kotlin.finishBranchObject
    public final WindowInsetsCompat onApplyWindowInsets(View p0, WindowInsetsCompat p1) {
        this.IconCompatParcelizer = p1;
        this.write.read(p1);
        if (this.RemoteActionCompatParcelizer) {
            if (Build.VERSION.SDK_INT == 30) {
                p0.post(this);
            }
        } else if (!this.AudioAttributesCompatParcelizer) {
            this.write.RemoteActionCompatParcelizer(p1);
            onCreateContextMenu.RemoteActionCompatParcelizer$default(this.write, p1, 0, 2, null);
        }
        return this.write.getOnPause() ? WindowInsetsCompat.IconCompatParcelizer : p1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = false;
            this.AudioAttributesCompatParcelizer = false;
            WindowInsetsCompat windowInsetsCompat = this.IconCompatParcelizer;
            if (windowInsetsCompat != null) {
                this.write.RemoteActionCompatParcelizer(windowInsetsCompat);
                onCreateContextMenu.RemoteActionCompatParcelizer$default(this.write, windowInsetsCompat, 0, 2, null);
                this.IconCompatParcelizer = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p0) {
        p0.requestApplyInsets();
    }
}
