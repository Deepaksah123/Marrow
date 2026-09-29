package kotlin;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import kotlin.PropertyBuilder;
import kotlin.modifyEnumSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class _constructPropertyWriter implements PropertyBuilder.RemoteActionCompatParcelizer {
    private Boolean RemoteActionCompatParcelizer;
    private final Context write;

    public _constructPropertyWriter() {
        this(null);
    }

    public _constructPropertyWriter(Context context) {
        this.write = context;
    }

    @Override // o.PropertyBuilder.RemoteActionCompatParcelizer
    public final modifyEnumSerializer RemoteActionCompatParcelizer(C0170format c0170format, JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 29 || c0170format.onPrepareFromUri == -1) {
            return modifyEnumSerializer.read;
        }
        boolean zIconCompatParcelizer = IconCompatParcelizer(this.write);
        int i = DefaultBaseTypeLimitingValidator.read((String) buildTypeSerializer.IconCompatParcelizer(c0170format.onPlayFromUri), c0170format.RemoteActionCompatParcelizer);
        if (i == 0 || LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < LaissezFaireSubTypeValidator.read(i)) {
            return modifyEnumSerializer.read;
        }
        int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(c0170format.AudioAttributesCompatParcelizer);
        if (iRemoteActionCompatParcelizer == 0) {
            return modifyEnumSerializer.read;
        }
        try {
            AudioFormat audioFormatIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(c0170format.onPrepareFromUri, iRemoteActionCompatParcelizer, i);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 31) {
                return write.write(audioFormatIconCompatParcelizer, jsonIntegerFormatVisitor.RemoteActionCompatParcelizer().IconCompatParcelizer, zIconCompatParcelizer);
            }
            return IconCompatParcelizer.read(audioFormatIconCompatParcelizer, jsonIntegerFormatVisitor.RemoteActionCompatParcelizer().IconCompatParcelizer, zIconCompatParcelizer);
        } catch (IllegalArgumentException unused) {
            return modifyEnumSerializer.read;
        }
    }

    private boolean IconCompatParcelizer(Context context) {
        AudioManager audioManager;
        Boolean bool = this.RemoteActionCompatParcelizer;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
            String parameters = audioManager.getParameters("offloadVariableRateSupported");
            boolean z = false;
            if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                z = true;
            }
            this.RemoteActionCompatParcelizer = Boolean.valueOf(z);
        } else {
            this.RemoteActionCompatParcelizer = Boolean.FALSE;
        }
        return this.RemoteActionCompatParcelizer.booleanValue();
    }

    static final class IconCompatParcelizer {
        public static modifyEnumSerializer read(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return modifyEnumSerializer.read;
            }
            return new modifyEnumSerializer.IconCompatParcelizer().read().RemoteActionCompatParcelizer(z).IconCompatParcelizer();
        }
    }

    static final class write {
        public static modifyEnumSerializer write(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return modifyEnumSerializer.read;
            }
            return new modifyEnumSerializer.IconCompatParcelizer().read().IconCompatParcelizer(LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver > 32 && playbackOffloadSupport == 2).RemoteActionCompatParcelizer(z).IconCompatParcelizer();
        }
    }
}
