package kotlin;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ThrowableDeserializer {
    private AudioAttributesCompatParcelizer IconCompatParcelizer;
    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private final Context write;

    public interface AudioAttributesCompatParcelizer {
        void write();
    }

    public interface RemoteActionCompatParcelizer {
        void read(boolean z);
    }

    public abstract View AudioAttributesCompatParcelizer();

    public boolean IconCompatParcelizer() {
        return true;
    }

    public boolean RemoteActionCompatParcelizer() {
        return false;
    }

    public boolean read() {
        return false;
    }

    public void write(SubMenu subMenu) {
    }

    public boolean write() {
        return false;
    }

    public ThrowableDeserializer(Context context) {
        this.write = context;
    }

    public View AudioAttributesCompatParcelizer(MenuItem menuItem) {
        return AudioAttributesCompatParcelizer();
    }

    public void RemoteActionCompatParcelizer(boolean z) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.read(z);
        }
    }

    public void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
    }

    public void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (this.IconCompatParcelizer != null && audioAttributesCompatParcelizer != null) {
            getClass().getSimpleName();
        }
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
    }

    public void AudioAttributesImplBaseParcelizer() {
        this.IconCompatParcelizer = null;
        this.RemoteActionCompatParcelizer = null;
    }
}
