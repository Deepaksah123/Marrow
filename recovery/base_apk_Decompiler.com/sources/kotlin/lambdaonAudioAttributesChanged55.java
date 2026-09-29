package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonAudioAttributesChanged55 {
    private final lambdaonCues52 write;
    private boolean RemoteActionCompatParcelizer = false;
    private boolean read = false;
    private final List<lambdaonDrmKeysRemoved65> MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
    private final List<lambdaonDrmKeysRemoved65> AudioAttributesCompatParcelizer = new ArrayList();
    private final List<lambdaonDrmKeysRemoved65> AudioAttributesImplApi26Parcelizer = new ArrayList();
    private final List<lambdaonDrmKeysRemoved65> IconCompatParcelizer = new ArrayList();

    private static void write(String str) {
        RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
    }

    public lambdaonAudioAttributesChanged55(lambdaonCues52 lambdaoncues52) {
        this.write = lambdaoncues52;
        lambdaoncues52.IconCompatParcelizer(new Runnable() { // from class: o.lambdaonAudioEnabled3
            @Override // java.lang.Runnable
            public final void run() {
                this.write.MediaBrowserCompatItemReceiver();
            }
        });
    }

    final /* synthetic */ void MediaBrowserCompatItemReceiver() {
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            Iterator<lambdaonDrmKeysRemoved65> it = this.MediaBrowserCompatCustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                RendererCapabilitiesListener.AudioAttributesCompatParcelizer(it.next());
            }
        }
        synchronized (this.AudioAttributesCompatParcelizer) {
            Iterator<lambdaonDrmKeysRemoved65> it2 = this.AudioAttributesCompatParcelizer.iterator();
            while (it2.hasNext()) {
                RendererCapabilitiesListener.AudioAttributesCompatParcelizer(it2.next());
            }
            this.AudioAttributesCompatParcelizer.clear();
        }
    }

    public final void read() {
        write("init() called");
        this.write.read(new getCreatedOnDateMs() { // from class: o.lambdaonAudioInputFormatChanged5
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return null;
            }
        });
    }

    public final void RemoteActionCompatParcelizer(JSONObject jSONObject, lambdaonDeviceInfoChanged58 lambdaondeviceinfochanged58) {
        StringBuilder sb = new StringBuilder("handleVariableResponse() called with: response = [");
        sb.append(jSONObject);
        sb.append("]");
        write(sb.toString());
        if (jSONObject == null) {
            RemoteActionCompatParcelizer();
        } else {
            read(jSONObject);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (AudioAttributesImplApi26Parcelizer().booleanValue()) {
            return;
        }
        AudioAttributesCompatParcelizer(true);
        this.write.AudioAttributesCompatParcelizer(new getCreatedOnDateMs() { // from class: o.lambdaonAudioSinkError10
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return this.read.write();
            }
        });
    }

    final /* synthetic */ getShowPopup write() {
        MediaBrowserCompatCustomActionResultReceiver();
        this.read = true;
        return null;
    }

    private void read(JSONObject jSONObject) {
        AudioAttributesCompatParcelizer(true);
        this.write.IconCompatParcelizer(lambdaonAudioDisabled9.IconCompatParcelizer((Map<String, Object>) lambdaonAudioSessionIdChanged54.IconCompatParcelizer(jSONObject)), new getCreatedOnDateMs() { // from class: o.lambdaonAudioPositionAdvancing6
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return this.read.AudioAttributesCompatParcelizer();
            }
        });
    }

    final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver();
        this.read = true;
        return null;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            Iterator<lambdaonDrmKeysRemoved65> it = this.AudioAttributesImplApi26Parcelizer.iterator();
            while (it.hasNext()) {
                RendererCapabilitiesListener.AudioAttributesCompatParcelizer(it.next());
            }
        }
        synchronized (this.IconCompatParcelizer) {
            Iterator<lambdaonDrmKeysRemoved65> it2 = this.IconCompatParcelizer.iterator();
            while (it2.hasNext()) {
                RendererCapabilitiesListener.AudioAttributesCompatParcelizer(it2.next());
            }
            this.IconCompatParcelizer.clear();
        }
    }

    public final void IconCompatParcelizer() {
        write("Clear user content in CTVariables");
        AudioAttributesCompatParcelizer(false);
        this.read = false;
        this.write.IconCompatParcelizer();
    }

    private Boolean AudioAttributesImplApi26Parcelizer() {
        return Boolean.valueOf(this.RemoteActionCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }
}
