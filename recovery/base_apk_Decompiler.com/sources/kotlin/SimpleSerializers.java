package kotlin;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class SimpleSerializers {
    private final IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private AudioFocusRequest IconCompatParcelizer;
    private write MediaBrowserCompatItemReceiver;
    private JsonIntegerFormatVisitor RemoteActionCompatParcelizer;
    private int read;
    private final AudioManager write;
    private float MediaBrowserCompatCustomActionResultReceiver = 1.0f;
    private int AudioAttributesCompatParcelizer = 0;

    public interface write {
        void read(int i);

        void write();
    }

    public SimpleSerializers(Context context, Handler handler, write writeVar) {
        this.write = (AudioManager) buildTypeSerializer.IconCompatParcelizer((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.MediaBrowserCompatItemReceiver = writeVar;
        this.AudioAttributesImplApi21Parcelizer = new IconCompatParcelizer(handler);
    }

    public final float IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void write(JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
        if (LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, jsonIntegerFormatVisitor)) {
            return;
        }
        this.RemoteActionCompatParcelizer = jsonIntegerFormatVisitor;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(jsonIntegerFormatVisitor);
        this.read = iRemoteActionCompatParcelizer;
        boolean z = true;
        if (iRemoteActionCompatParcelizer != 1 && iRemoteActionCompatParcelizer != 0) {
            z = false;
        }
        buildTypeSerializer.write(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final int IconCompatParcelizer(boolean z, int i) {
        if (!AudioAttributesCompatParcelizer(i)) {
            AudioAttributesCompatParcelizer();
            write(0);
            return 1;
        }
        if (z) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        int i2 = this.AudioAttributesCompatParcelizer;
        if (i2 != 1) {
            return i2 != 3 ? 1 : 0;
        }
        return -1;
    }

    public final void write() {
        this.MediaBrowserCompatItemReceiver = null;
        AudioAttributesCompatParcelizer();
        write(0);
    }

    private boolean AudioAttributesCompatParcelizer(int i) {
        return i != 1 && this.read == 1;
    }

    private int MediaBrowserCompatCustomActionResultReceiver() {
        if (this.AudioAttributesCompatParcelizer == 2) {
            return 1;
        }
        if ((LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 26 ? AudioAttributesImplApi26Parcelizer() : MediaBrowserCompatItemReceiver()) == 1) {
            write(2);
            return 1;
        }
        write(1);
        return -1;
    }

    private void AudioAttributesCompatParcelizer() {
        int i = this.AudioAttributesCompatParcelizer;
        if (i == 1 || i == 0) {
            return;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 26) {
            read();
        } else {
            RemoteActionCompatParcelizer();
        }
    }

    private int MediaBrowserCompatItemReceiver() {
        return this.write.requestAudioFocus(this.AudioAttributesImplApi21Parcelizer, LaissezFaireSubTypeValidator.AudioAttributesImplApi21Parcelizer(((JsonIntegerFormatVisitor) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer)).AudioAttributesImplApi21Parcelizer), this.read);
    }

    private int AudioAttributesImplApi26Parcelizer() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.IconCompatParcelizer;
        if (audioFocusRequest == null) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.read);
            } else {
                builder = new AudioFocusRequest.Builder(this.IconCompatParcelizer);
            }
            this.IconCompatParcelizer = builder.setAudioAttributes(((JsonIntegerFormatVisitor) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer)).RemoteActionCompatParcelizer().IconCompatParcelizer).setWillPauseWhenDucked(AudioAttributesImplBaseParcelizer()).setOnAudioFocusChangeListener(this.AudioAttributesImplApi21Parcelizer).build();
            this.AudioAttributesImplBaseParcelizer = false;
        }
        return this.write.requestAudioFocus(this.IconCompatParcelizer);
    }

    private void RemoteActionCompatParcelizer() {
        this.write.abandonAudioFocus(this.AudioAttributesImplApi21Parcelizer);
    }

    private void read() {
        AudioFocusRequest audioFocusRequest = this.IconCompatParcelizer;
        if (audioFocusRequest != null) {
            this.write.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        JsonIntegerFormatVisitor jsonIntegerFormatVisitor = this.RemoteActionCompatParcelizer;
        return jsonIntegerFormatVisitor != null && jsonIntegerFormatVisitor.IconCompatParcelizer == 1;
    }

    private static int RemoteActionCompatParcelizer(JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
        if (jsonIntegerFormatVisitor == null) {
            return 0;
        }
        switch (jsonIntegerFormatVisitor.AudioAttributesImplApi21Parcelizer) {
            case 0:
                prune.RemoteActionCompatParcelizer("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                break;
            case 1:
            case 14:
                break;
            case 2:
            case 4:
                break;
            case 3:
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (jsonIntegerFormatVisitor.IconCompatParcelizer == 1) {
                }
                break;
            case 15:
            default:
                StringBuilder sb = new StringBuilder("Unidentified audio usage: ");
                sb.append(jsonIntegerFormatVisitor.AudioAttributesImplApi21Parcelizer);
                prune.RemoteActionCompatParcelizer("AudioFocusManager", sb.toString());
                break;
            case 16:
                break;
        }
        return 0;
    }

    private void write(int i) {
        if (this.AudioAttributesCompatParcelizer != i) {
            this.AudioAttributesCompatParcelizer = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.MediaBrowserCompatCustomActionResultReceiver != f) {
                this.MediaBrowserCompatCustomActionResultReceiver = f;
                write writeVar = this.MediaBrowserCompatItemReceiver;
                if (writeVar != null) {
                    writeVar.write();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(int i) {
        if (i == -3 || i == -2) {
            if (i == -2 || AudioAttributesImplBaseParcelizer()) {
                IconCompatParcelizer(0);
                write(3);
                return;
            } else {
                write(4);
                return;
            }
        }
        if (i == -1) {
            IconCompatParcelizer(-1);
            AudioAttributesCompatParcelizer();
            write(1);
        } else if (i == 1) {
            write(2);
            IconCompatParcelizer(1);
        } else {
            prune.RemoteActionCompatParcelizer("AudioFocusManager", "Unknown focus change type: ".concat(String.valueOf(i)));
        }
    }

    private void IconCompatParcelizer(int i) {
        write writeVar = this.MediaBrowserCompatItemReceiver;
        if (writeVar != null) {
            writeVar.read(i);
        }
    }

    class IconCompatParcelizer implements AudioManager.OnAudioFocusChangeListener {
        private final Handler RemoteActionCompatParcelizer;

        public IconCompatParcelizer(Handler handler) {
            this.RemoteActionCompatParcelizer = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i) {
            this.RemoteActionCompatParcelizer.post(new Runnable() { // from class: o._findInterfaceMapping
                @Override // java.lang.Runnable
                public final void run() {
                    this.read.write(i);
                }
            });
        }

        final /* synthetic */ void write(int i) {
            SimpleSerializers.this.read(i);
        }
    }
}
