package kotlin;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class parseCsdBuffer {
    private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = null;
    private final Context read;

    public parseCsdBuffer(Context context) {
        this.read = context;
    }

    public final String read() {
        return RemoteActionCompatParcelizer().write;
    }

    public final String AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AudioAttributesCompatParcelizer(String str) {
        if (this.read.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.read.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this, (byte) 0);
        }
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: loaded from: classes5.dex */
    class AudioAttributesCompatParcelizer {
        private final String AudioAttributesCompatParcelizer;
        private final String write;

        /* synthetic */ AudioAttributesCompatParcelizer(parseCsdBuffer parsecsdbuffer, byte b) {
            this();
        }

        private AudioAttributesCompatParcelizer() {
            int iRemoteActionCompatParcelizer = putSps.RemoteActionCompatParcelizer(parseCsdBuffer.this.read, "com.google.firebase.crashlytics.unity_version", "string");
            if (iRemoteActionCompatParcelizer == 0) {
                if (parseCsdBuffer.this.AudioAttributesCompatParcelizer("flutter_assets/NOTICES.Z")) {
                    this.write = "Flutter";
                    this.AudioAttributesCompatParcelizer = null;
                    DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Development platform is: Flutter");
                    return;
                } else {
                    this.write = null;
                    this.AudioAttributesCompatParcelizer = null;
                    return;
                }
            }
            this.write = "Unity";
            String string = parseCsdBuffer.this.read.getResources().getString(iRemoteActionCompatParcelizer);
            this.AudioAttributesCompatParcelizer = string;
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Unity Editor version is: ".concat(String.valueOf(string)));
        }
    }
}
