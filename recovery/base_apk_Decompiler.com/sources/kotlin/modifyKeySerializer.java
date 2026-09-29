package kotlin;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class modifyKeySerializer {
    private final Context AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final Handler AudioAttributesImplApi26Parcelizer;
    private modifySerializer AudioAttributesImplBaseParcelizer;
    private modifyMapSerializer IconCompatParcelizer;
    private final AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private final BroadcastReceiver MediaBrowserCompatItemReceiver;
    private JsonIntegerFormatVisitor RemoteActionCompatParcelizer;
    private final write read;
    private final read write;

    public interface AudioAttributesCompatParcelizer {
        void write(modifyMapSerializer modifymapserializer);
    }

    static /* synthetic */ modifySerializer AudioAttributesCompatParcelizer(modifyKeySerializer modifykeyserializer) {
        modifykeyserializer.AudioAttributesImplBaseParcelizer = null;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    modifyKeySerializer(Context context, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, JsonIntegerFormatVisitor jsonIntegerFormatVisitor, modifySerializer modifyserializer) {
        Context applicationContext = context.getApplicationContext();
        this.AudioAttributesCompatParcelizer = applicationContext;
        this.MediaBrowserCompatCustomActionResultReceiver = (AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer);
        this.RemoteActionCompatParcelizer = jsonIntegerFormatVisitor;
        this.AudioAttributesImplBaseParcelizer = modifyserializer;
        Handler handler = LaissezFaireSubTypeValidator.read();
        this.AudioAttributesImplApi26Parcelizer = handler;
        this.write = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 ? new read() : null;
        this.MediaBrowserCompatItemReceiver = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 ? new IconCompatParcelizer(this, (byte) 0) : null;
        Uri uriRemoteActionCompatParcelizer = modifyMapSerializer.RemoteActionCompatParcelizer();
        this.read = uriRemoteActionCompatParcelizer != null ? new write(handler, applicationContext.getContentResolver(), uriRemoteActionCompatParcelizer) : null;
    }

    public final void write(JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
        this.RemoteActionCompatParcelizer = jsonIntegerFormatVisitor;
        write(modifyMapSerializer.read(this.AudioAttributesCompatParcelizer, jsonIntegerFormatVisitor, this.AudioAttributesImplBaseParcelizer));
    }

    public final void write(AudioDeviceInfo audioDeviceInfo) {
        modifySerializer modifyserializer = this.AudioAttributesImplBaseParcelizer;
        if (LaissezFaireSubTypeValidator.read(audioDeviceInfo, modifyserializer == null ? null : modifyserializer.IconCompatParcelizer)) {
            return;
        }
        modifySerializer modifyserializer2 = audioDeviceInfo != null ? new modifySerializer(audioDeviceInfo) : null;
        this.AudioAttributesImplBaseParcelizer = modifyserializer2;
        write(modifyMapSerializer.read(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, modifyserializer2));
    }

    public final modifyMapSerializer AudioAttributesCompatParcelizer() {
        read readVar;
        if (this.AudioAttributesImplApi21Parcelizer) {
            return (modifyMapSerializer) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        this.AudioAttributesImplApi21Parcelizer = true;
        write writeVar = this.read;
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer();
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && (readVar = this.write) != null) {
            RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, readVar, this.AudioAttributesImplApi26Parcelizer);
        }
        modifyMapSerializer modifymapserializer = modifyMapSerializer.read(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver != null ? this.AudioAttributesCompatParcelizer.registerReceiver(this.MediaBrowserCompatItemReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.AudioAttributesImplApi26Parcelizer) : null, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
        this.IconCompatParcelizer = modifymapserializer;
        return modifymapserializer;
    }

    public final void read() {
        read readVar;
        if (this.AudioAttributesImplApi21Parcelizer) {
            this.IconCompatParcelizer = null;
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && (readVar = this.write) != null) {
                RemoteActionCompatParcelizer.write(this.AudioAttributesCompatParcelizer, readVar);
            }
            BroadcastReceiver broadcastReceiver = this.MediaBrowserCompatItemReceiver;
            if (broadcastReceiver != null) {
                this.AudioAttributesCompatParcelizer.unregisterReceiver(broadcastReceiver);
            }
            write writeVar = this.read;
            if (writeVar != null) {
                writeVar.AudioAttributesCompatParcelizer();
            }
            this.AudioAttributesImplApi21Parcelizer = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(modifyMapSerializer modifymapserializer) {
        if (!this.AudioAttributesImplApi21Parcelizer || modifymapserializer.equals(this.IconCompatParcelizer)) {
            return;
        }
        this.IconCompatParcelizer = modifymapserializer;
        this.MediaBrowserCompatCustomActionResultReceiver.write(modifymapserializer);
    }

    final class IconCompatParcelizer extends BroadcastReceiver {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(modifyKeySerializer modifykeyserializer, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            modifyKeySerializer modifykeyserializer = modifyKeySerializer.this;
            modifykeyserializer.write(modifyMapSerializer.read(context, intent, modifykeyserializer.RemoteActionCompatParcelizer, modifyKeySerializer.this.AudioAttributesImplBaseParcelizer));
        }
    }

    final class write extends ContentObserver {
        private final ContentResolver AudioAttributesCompatParcelizer;
        private final Uri read;

        public write(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.AudioAttributesCompatParcelizer = contentResolver;
            this.read = uri;
        }

        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.registerContentObserver(this.read, false, this);
        }

        public final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            modifyKeySerializer modifykeyserializer = modifyKeySerializer.this;
            modifykeyserializer.write(modifyMapSerializer.read(modifykeyserializer.AudioAttributesCompatParcelizer, modifyKeySerializer.this.RemoteActionCompatParcelizer, modifyKeySerializer.this.AudioAttributesImplBaseParcelizer));
        }
    }

    final class read extends AudioDeviceCallback {
        private read() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            modifyKeySerializer modifykeyserializer = modifyKeySerializer.this;
            modifykeyserializer.write(modifyMapSerializer.read(modifykeyserializer.AudioAttributesCompatParcelizer, modifyKeySerializer.this.RemoteActionCompatParcelizer, modifyKeySerializer.this.AudioAttributesImplBaseParcelizer));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(audioDeviceInfoArr, modifyKeySerializer.this.AudioAttributesImplBaseParcelizer)) {
                modifyKeySerializer.AudioAttributesCompatParcelizer(modifyKeySerializer.this);
            }
            modifyKeySerializer modifykeyserializer = modifyKeySerializer.this;
            modifykeyserializer.write(modifyMapSerializer.read(modifykeyserializer.AudioAttributesCompatParcelizer, modifyKeySerializer.this.RemoteActionCompatParcelizer, modifyKeySerializer.this.AudioAttributesImplBaseParcelizer));
        }
    }

    static final class RemoteActionCompatParcelizer {
        public static void IconCompatParcelizer(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) buildTypeSerializer.IconCompatParcelizer((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void write(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) buildTypeSerializer.IconCompatParcelizer((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }
}
