package kotlin;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/setAnimationListener;", "Landroid/view/ActionMode$Callback2;", "Landroid/view/ActionMode$Callback;", "Lo/setOnChildScrollUpCallback;", "p0", "<init>", "(Lo/setOnChildScrollUpCallback;)V", "Landroid/view/ActionMode;", "Landroid/view/Menu;", "p1", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/view/View;", "Landroid/graphics/Rect;", "p2", "onGetContentRect", "(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V", "RemoteActionCompatParcelizer", "Lo/setOnChildScrollUpCallback;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setAnimationListener extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setOnChildScrollUpCallback AudioAttributesCompatParcelizer;

    public setAnimationListener(setOnChildScrollUpCallback setonchildscrollupcallback) {
        this.AudioAttributesCompatParcelizer = setonchildscrollupcallback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode p0, Menu p1) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode p0, Menu p1) {
        return this.AudioAttributesCompatParcelizer.read(p0, p1);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode p0, MenuItem p1) {
        return this.AudioAttributesCompatParcelizer.write(p0, p1);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode p0) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0);
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode p0, View p1, Rect p2) {
        WritableTypeIdInclusion writableTypeIdInclusionRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
        p2.set(Math.round(writableTypeIdInclusionRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()), Math.round(writableTypeIdInclusionRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()), Math.round(writableTypeIdInclusionRemoteActionCompatParcelizer.getWrite()), Math.round(writableTypeIdInclusionRemoteActionCompatParcelizer.getIconCompatParcelizer()));
    }
}
