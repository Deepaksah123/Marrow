package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class PrivateMaxEntriesMapValues extends argCount {
    private static final boolean read = Log.isLoggable("UseSupportDynamicGroup", 3);
    private C0185kotlinModule IconCompatParcelizer;
    private Dialog RemoteActionCompatParcelizer;

    public PrivateMaxEntriesMapValues() {
        setCancelable(true);
    }

    private void write() {
        if (this.IconCompatParcelizer == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.IconCompatParcelizer = C0185kotlinModule.RemoteActionCompatParcelizer(arguments.getBundle("selector"));
            }
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = C0185kotlinModule.read;
            }
        }
    }

    public final void write(C0185kotlinModule c0185kotlinModule) {
        if (c0185kotlinModule == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        write();
        if (this.IconCompatParcelizer.equals(c0185kotlinModule)) {
            return;
        }
        this.IconCompatParcelizer = c0185kotlinModule;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", c0185kotlinModule.IconCompatParcelizer());
        setArguments(arguments);
        Dialog dialog = this.RemoteActionCompatParcelizer;
        if (dialog == null || !read) {
            return;
        }
        ((PrivateMaxEntriesMapSerializationProxy) dialog).AudioAttributesCompatParcelizer(c0185kotlinModule);
    }

    private static PrivateMaxEntriesMapSerializationProxy RemoteActionCompatParcelizer(Context context) {
        return new PrivateMaxEntriesMapSerializationProxy(context);
    }

    private static PrivateMaxEntriesMapWriteThroughEntry read(Context context) {
        return new PrivateMaxEntriesMapWriteThroughEntry(context);
    }

    @Override // kotlin.argCount
    public Dialog onCreateDialog(Bundle bundle) {
        if (read) {
            PrivateMaxEntriesMapSerializationProxy privateMaxEntriesMapSerializationProxyRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getContext());
            this.RemoteActionCompatParcelizer = privateMaxEntriesMapSerializationProxyRemoteActionCompatParcelizer;
            privateMaxEntriesMapSerializationProxyRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        } else {
            this.RemoteActionCompatParcelizer = read(getContext());
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.RemoteActionCompatParcelizer;
        if (dialog == null || read) {
            return;
        }
        ((PrivateMaxEntriesMapWriteThroughEntry) dialog).read(false);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.RemoteActionCompatParcelizer;
        if (dialog != null) {
            if (read) {
                ((PrivateMaxEntriesMapSerializationProxy) dialog).MediaBrowserCompatItemReceiver();
            } else {
                ((PrivateMaxEntriesMapWriteThroughEntry) dialog).MediaMetadataCompat();
            }
        }
    }
}
