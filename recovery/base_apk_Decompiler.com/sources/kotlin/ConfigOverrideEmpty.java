package kotlin;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0016\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/ConfigOverrideEmpty;", "Landroid/view/ActionMode$Callback2;", "Lo/getMergeable;", "p0", "<init>", "(Lo/getMergeable;)V", "Landroid/view/ActionMode;", "Landroid/view/MenuItem;", "p1", "", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "Landroid/view/Menu;", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/view/View;", "Landroid/graphics/Rect;", "p2", "onGetContentRect", "(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V", "read", "Lo/getMergeable;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfigOverrideEmpty extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getMergeable RemoteActionCompatParcelizer;

    public ConfigOverrideEmpty(getMergeable getmergeable) {
        this.RemoteActionCompatParcelizer = getmergeable;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode p0, MenuItem p1) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode p0, Menu p1) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode p0, Menu p1) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode p0) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode p0, View p1, Rect p2) {
        WritableTypeIdInclusion write = this.RemoteActionCompatParcelizer.getWrite();
        if (p2 != null) {
            p2.set((int) write.getAudioAttributesCompatParcelizer(), (int) write.getRemoteActionCompatParcelizer(), (int) write.getWrite(), (int) write.getIconCompatParcelizer());
        }
    }
}
