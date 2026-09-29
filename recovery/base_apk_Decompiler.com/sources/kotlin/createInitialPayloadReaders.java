package kotlin;

import android.os.Bundle;
import java.util.Locale;
import kotlin.TrackSampleTable;

/* JADX INFO: loaded from: classes5.dex */
final class createInitialPayloadReaders implements TrackSampleTable.IconCompatParcelizer {
    private onData read;
    private onData write;

    createInitialPayloadReaders() {
    }

    public final void AudioAttributesCompatParcelizer(onData ondata) {
        this.write = ondata;
    }

    public final void read(onData ondata) {
        this.read = ondata;
    }

    @Override // o.TrackSampleTable.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(int i, Bundle bundle) {
        DvbSubtitleReader.read().AudioAttributesCompatParcelizer(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            read(string, bundle2);
        }
    }

    private void read(String str, Bundle bundle) {
        onData ondata;
        if ("clx".equals(bundle.getString("_o"))) {
            ondata = this.write;
        } else {
            ondata = this.read;
        }
        IconCompatParcelizer(ondata, str, bundle);
    }

    private static void IconCompatParcelizer(onData ondata, String str, Bundle bundle) {
        if (ondata == null) {
            return;
        }
        ondata.IconCompatParcelizer(str, bundle);
    }
}
