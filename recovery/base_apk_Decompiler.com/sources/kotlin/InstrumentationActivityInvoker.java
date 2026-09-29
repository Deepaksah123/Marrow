package kotlin;

import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/InstrumentationActivityInvoker;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Lo/setOnChildScrollUpCallback;", "p1", "Landroid/view/ActionMode;", "write", "(Landroid/view/View;Lo/setOnChildScrollUpCallback;)Landroid/view/ActionMode;", "", "RemoteActionCompatParcelizer", "(Landroid/view/ActionMode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class InstrumentationActivityInvoker {
    public static final InstrumentationActivityInvoker INSTANCE = new InstrumentationActivityInvoker();

    private InstrumentationActivityInvoker() {
    }

    public final ActionMode write(View p0, setOnChildScrollUpCallback p1) {
        return InstrumentationActivityInvokerEmptyFloatingActivity1.INSTANCE.AudioAttributesCompatParcelizer(p0, new setAnimationListener(p1), 1);
    }

    public final void RemoteActionCompatParcelizer(ActionMode p0) {
        InstrumentationActivityInvokerEmptyFloatingActivity1.INSTANCE.write(p0);
    }
}
