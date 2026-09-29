package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class setPopupCallback extends setGroupDividerEnabled {
    private static final Executor read;
    private static volatile setPopupCallback write;
    private final setGroupDividerEnabled AudioAttributesCompatParcelizer;
    private setGroupDividerEnabled RemoteActionCompatParcelizer;

    static {
        new Executor() { // from class: o.setShortcut
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                setPopupCallback.RemoteActionCompatParcelizer().read(runnable);
            }
        };
        read = new Executor() { // from class: o.ExpandedMenuView
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                setPopupCallback.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(runnable);
            }
        };
    }

    private setPopupCallback() {
        setForceShowIcon setforceshowicon = new setForceShowIcon();
        this.AudioAttributesCompatParcelizer = setforceshowicon;
        this.RemoteActionCompatParcelizer = setforceshowicon;
    }

    public static setPopupCallback RemoteActionCompatParcelizer() {
        if (write != null) {
            return write;
        }
        synchronized (setPopupCallback.class) {
            if (write == null) {
                write = new setPopupCallback();
            }
        }
        return write;
    }

    @Override // kotlin.setGroupDividerEnabled
    public final void AudioAttributesCompatParcelizer(Runnable runnable) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(runnable);
    }

    @Override // kotlin.setGroupDividerEnabled
    public final void read(Runnable runnable) {
        this.RemoteActionCompatParcelizer.read(runnable);
    }

    public static Executor read() {
        return read;
    }

    @Override // kotlin.setGroupDividerEnabled
    public final boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
