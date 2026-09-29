package kotlin;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.ExtensionsKtkotlinModule1;

/* JADX INFO: loaded from: classes4.dex */
public class ExtensionsKt extends Fragment {
    private C0185kotlinModule RemoteActionCompatParcelizer;
    private ExtensionsKtkotlinModule1 read;
    private ExtensionsKtkotlinModule1.IconCompatParcelizer write;

    private void RemoteActionCompatParcelizer() {
        if (this.read == null) {
            this.read = ExtensionsKtkotlinModule1.write(getContext());
        }
    }

    private void read() {
        if (this.RemoteActionCompatParcelizer == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.RemoteActionCompatParcelizer = C0185kotlinModule.RemoteActionCompatParcelizer(arguments.getBundle("selector"));
            }
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = C0185kotlinModule.read;
            }
        }
    }

    private ExtensionsKtkotlinModule1.IconCompatParcelizer write() {
        return new ExtensionsKtkotlinModule1.IconCompatParcelizer() { // from class: o.ExtensionsKt.4
        };
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        read();
        RemoteActionCompatParcelizer();
        ExtensionsKtkotlinModule1.IconCompatParcelizer iconCompatParcelizerWrite = write();
        this.write = iconCompatParcelizerWrite;
        this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, iconCompatParcelizerWrite, 4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        ExtensionsKtkotlinModule1.IconCompatParcelizer iconCompatParcelizer = this.write;
        if (iconCompatParcelizer != null) {
            this.read.read(iconCompatParcelizer);
            this.write = null;
        }
        super.onStop();
    }
}
