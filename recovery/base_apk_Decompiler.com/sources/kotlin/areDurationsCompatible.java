package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.getStartPositionRendererTime;
import kotlin.removeMediaSourcesInternal;

/* JADX INFO: loaded from: classes2.dex */
final class areDurationsCompatible {
    private static volatile areDurationsCompatible IconCompatParcelizer;
    private final RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    final Set<getStartPositionRendererTime.AudioAttributesCompatParcelizer> read = new HashSet();
    private boolean write;

    interface RemoteActionCompatParcelizer {
        boolean IconCompatParcelizer();

        void RemoteActionCompatParcelizer();
    }

    static areDurationsCompatible RemoteActionCompatParcelizer(Context context) {
        if (IconCompatParcelizer == null) {
            synchronized (areDurationsCompatible.class) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new areDurationsCompatible(context.getApplicationContext());
                }
            }
        }
        return IconCompatParcelizer;
    }

    private areDurationsCompatible(final Context context) {
        this.RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(removeMediaSourcesInternal.write(new removeMediaSourcesInternal.RemoteActionCompatParcelizer<ConnectivityManager>() { // from class: o.areDurationsCompatible.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.removeMediaSourcesInternal.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public ConnectivityManager RemoteActionCompatParcelizer() {
                return (ConnectivityManager) context.getSystemService("connectivity");
            }
        }), new getStartPositionRendererTime.AudioAttributesCompatParcelizer() { // from class: o.areDurationsCompatible.3
            @Override // o.getStartPositionRendererTime.AudioAttributesCompatParcelizer
            public final void write(boolean z) {
                ArrayList arrayList;
                moveMediaSourceRange.write();
                synchronized (areDurationsCompatible.this) {
                    arrayList = new ArrayList(areDurationsCompatible.this.read);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((getStartPositionRendererTime.AudioAttributesCompatParcelizer) it.next()).write(z);
                }
            }
        });
    }

    final void RemoteActionCompatParcelizer(getStartPositionRendererTime.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this) {
            this.read.add(audioAttributesCompatParcelizer);
            AudioAttributesCompatParcelizer();
        }
    }

    final void AudioAttributesCompatParcelizer(getStartPositionRendererTime.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this) {
            this.read.remove(audioAttributesCompatParcelizer);
            write();
        }
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.write || this.read.isEmpty()) {
            return;
        }
        this.write = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    private void write() {
        if (this.write && this.read.isEmpty()) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            this.write = false;
        }
    }

    static final class AudioAttributesCompatParcelizer implements RemoteActionCompatParcelizer {
        private final removeMediaSourcesInternal.RemoteActionCompatParcelizer<ConnectivityManager> AudioAttributesCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        final getStartPositionRendererTime.AudioAttributesCompatParcelizer read;
        private final ConnectivityManager.NetworkCallback write = new AnonymousClass4();

        /* JADX INFO: renamed from: o.areDurationsCompatible$AudioAttributesCompatParcelizer$4, reason: invalid class name */
        final class AnonymousClass4 extends ConnectivityManager.NetworkCallback {
            AnonymousClass4() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                write(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                write(false);
            }

            private void write(final boolean z) {
                moveMediaSourceRange.RemoteActionCompatParcelizer(new Runnable() { // from class: o.areDurationsCompatible.AudioAttributesCompatParcelizer.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass4.this.RemoteActionCompatParcelizer(z);
                    }
                });
            }

            final void RemoteActionCompatParcelizer(boolean z) {
                moveMediaSourceRange.write();
                boolean z2 = AudioAttributesCompatParcelizer.this.RemoteActionCompatParcelizer;
                AudioAttributesCompatParcelizer.this.RemoteActionCompatParcelizer = z;
                if (z2 != z) {
                    AudioAttributesCompatParcelizer.this.read.write(z);
                }
            }
        }

        AudioAttributesCompatParcelizer(removeMediaSourcesInternal.RemoteActionCompatParcelizer<ConnectivityManager> remoteActionCompatParcelizer, getStartPositionRendererTime.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            this.read = audioAttributesCompatParcelizer;
        }

        @Override // o.areDurationsCompatible.RemoteActionCompatParcelizer
        public final boolean IconCompatParcelizer() {
            this.RemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().getActiveNetwork() != null;
            try {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().registerDefaultNetworkCallback(this.write);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // o.areDurationsCompatible.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().unregisterNetworkCallback(this.write);
        }
    }
}
