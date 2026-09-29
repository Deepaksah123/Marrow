package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleBasePlayerPositionSupplier {
    private final PlayerListener AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final CleverTapInstanceConfig IconCompatParcelizer;
    private final Object MediaBrowserCompatItemReceiver = new Object();
    private final lambdasetDeviceMuted29 RemoteActionCompatParcelizer;
    private final addAllCommands read;
    private ArrayList<clearPositionDiscontinuity> write;

    public SimpleBasePlayerPositionSupplier(CleverTapInstanceConfig cleverTapInstanceConfig, String str, lambdasetDeviceMuted29 lambdasetdevicemuted29, PlayerListener playerListener, addAllCommands addallcommands, boolean z) {
        this.AudioAttributesImplBaseParcelizer = str;
        this.RemoteActionCompatParcelizer = lambdasetdevicemuted29;
        this.write = lambdasetdevicemuted29.write(str);
        this.AudioAttributesImplApi21Parcelizer = z;
        this.AudioAttributesCompatParcelizer = playerListener;
        this.read = addallcommands;
        this.IconCompatParcelizer = cleverTapInstanceConfig;
    }

    public final int RemoteActionCompatParcelizer() {
        return write().size();
    }

    public final clearPositionDiscontinuity IconCompatParcelizer(String str) {
        return read(str);
    }

    public final ArrayList<clearPositionDiscontinuity> write() {
        ArrayList<clearPositionDiscontinuity> arrayList;
        synchronized (this.MediaBrowserCompatItemReceiver) {
            read();
            arrayList = this.write;
        }
        return arrayList;
    }

    public final void RemoteActionCompatParcelizer(final CTInboxMessage cTInboxMessage) {
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer).read().read("markReadInboxMessage", new Callable<Void>() { // from class: o.SimpleBasePlayerPositionSupplier.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() {
                synchronized (SimpleBasePlayerPositionSupplier.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
                    if (SimpleBasePlayerPositionSupplier.this.write(cTInboxMessage.write())) {
                        addAllCommands unused = SimpleBasePlayerPositionSupplier.this.read;
                    }
                }
                return null;
            }
        });
    }

    public final boolean AudioAttributesCompatParcelizer(JSONArray jSONArray) {
        RendererWakeupListener.MediaMetadataCompat();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                clearPositionDiscontinuity clearpositiondiscontinuityWrite = clearPositionDiscontinuity.write(jSONArray.getJSONObject(i), this.AudioAttributesImplBaseParcelizer);
                if (clearpositiondiscontinuityWrite != null) {
                    if (!this.AudioAttributesImplApi21Parcelizer && clearpositiondiscontinuityWrite.IconCompatParcelizer()) {
                        RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    } else {
                        arrayList.add(clearpositiondiscontinuityWrite);
                        clearpositiondiscontinuityWrite.RemoteActionCompatParcelizer();
                        RendererWakeupListener.MediaMetadataCompat();
                    }
                }
            } catch (JSONException e) {
                e.getLocalizedMessage();
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        this.RemoteActionCompatParcelizer.read(arrayList);
        RendererWakeupListener.MediaMetadataCompat();
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.write = this.RemoteActionCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer);
            read();
        }
        return true;
    }

    private boolean AudioAttributesCompatParcelizer(final String str) {
        clearPositionDiscontinuity clearpositiondiscontinuity = read(str);
        if (clearpositiondiscontinuity == null) {
            return false;
        }
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.write.remove(clearpositiondiscontinuity);
        }
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer).read().read("RunDeleteMessage", new Callable<Void>() { // from class: o.SimpleBasePlayerPositionSupplier.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Void call() {
                SimpleBasePlayerPositionSupplier.this.RemoteActionCompatParcelizer.read(str, SimpleBasePlayerPositionSupplier.this.AudioAttributesImplBaseParcelizer);
                return null;
            }
        });
        return true;
    }

    final boolean write(final String str) {
        clearPositionDiscontinuity clearpositiondiscontinuity = read(str);
        if (clearpositiondiscontinuity == null) {
            return false;
        }
        synchronized (this.MediaBrowserCompatItemReceiver) {
            clearpositiondiscontinuity.AudioAttributesCompatParcelizer(1);
        }
        isTrackSupported istracksupported = TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer).read();
        istracksupported.RemoteActionCompatParcelizer(new TracksGroupExternalSyntheticLambda0() { // from class: o.lambdagetExtrapolating1
            @Override // kotlin.TracksGroupExternalSyntheticLambda0
            public final void read(Object obj) {
            }
        });
        istracksupported.read(new isAdaptiveSupported() { // from class: o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1
            @Override // kotlin.isAdaptiveSupported
            public final void AudioAttributesCompatParcelizer(Object obj) {
                String str2 = str;
                RendererWakeupListener.AudioAttributesImplBaseParcelizer();
            }
        });
        istracksupported.read("RunMarkMessageRead", new Callable<Void>() { // from class: o.SimpleBasePlayerPositionSupplier.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() {
                SimpleBasePlayerPositionSupplier.this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, SimpleBasePlayerPositionSupplier.this.AudioAttributesImplBaseParcelizer);
                return null;
            }
        });
        return true;
    }

    private clearPositionDiscontinuity read(String str) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            for (clearPositionDiscontinuity clearpositiondiscontinuity : this.write) {
                if (clearpositiondiscontinuity.RemoteActionCompatParcelizer().equals(str)) {
                    return clearpositiondiscontinuity;
                }
            }
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        }
    }

    private void read() {
        RendererWakeupListener.MediaMetadataCompat();
        ArrayList arrayList = new ArrayList();
        synchronized (this.MediaBrowserCompatItemReceiver) {
            for (clearPositionDiscontinuity clearpositiondiscontinuity : this.write) {
                if (!this.AudioAttributesImplApi21Parcelizer && clearpositiondiscontinuity.IconCompatParcelizer()) {
                    RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    arrayList.add(clearpositiondiscontinuity);
                } else {
                    long jWrite = clearpositiondiscontinuity.write();
                    if (jWrite > 0 && System.currentTimeMillis() / 1000 > jWrite) {
                        clearpositiondiscontinuity.RemoteActionCompatParcelizer();
                        RendererWakeupListener.MediaMetadataCompat();
                        arrayList.add(clearpositiondiscontinuity);
                    }
                }
            }
            if (arrayList.size() <= 0) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AudioAttributesCompatParcelizer(((clearPositionDiscontinuity) it.next()).RemoteActionCompatParcelizer());
            }
        }
    }
}
