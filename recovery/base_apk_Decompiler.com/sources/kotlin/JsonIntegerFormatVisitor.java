package kotlin;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonIntegerFormatVisitor {
    public static final JsonIntegerFormatVisitor write = new IconCompatParcelizer().write();
    public final int AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi21Parcelizer;
    private AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;

    /* synthetic */ JsonIntegerFormatVisitor(int i, int i2, int i3, int i4, int i5, byte b) {
        this(i, i2, i3, i4, i5);
    }

    public static final class AudioAttributesCompatParcelizer {
        public final AudioAttributes IconCompatParcelizer;

        private AudioAttributesCompatParcelizer(JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(jsonIntegerFormatVisitor.IconCompatParcelizer).setFlags(jsonIntegerFormatVisitor.RemoteActionCompatParcelizer).setUsage(jsonIntegerFormatVisitor.AudioAttributesImplApi21Parcelizer);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29) {
                RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(usage, jsonIntegerFormatVisitor.AudioAttributesCompatParcelizer);
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 32) {
                write.write(usage, jsonIntegerFormatVisitor.read);
            }
            this.IconCompatParcelizer = usage.build();
        }
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
    }

    public static final class IconCompatParcelizer {
        private int AudioAttributesCompatParcelizer = 0;
        private int RemoteActionCompatParcelizer = 0;
        private int IconCompatParcelizer = 1;
        private int write = 1;
        private int read = 0;

        public final IconCompatParcelizer read() {
            this.AudioAttributesCompatParcelizer = 3;
            return this;
        }

        public final IconCompatParcelizer AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer = 1;
            return this;
        }

        public final JsonIntegerFormatVisitor write() {
            return new JsonIntegerFormatVisitor(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.read, (byte) 0);
        }
    }

    private JsonIntegerFormatVisitor(int i, int i2, int i3, int i4, int i5) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.AudioAttributesCompatParcelizer = i4;
        this.read = i5;
    }

    public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = new AudioAttributesCompatParcelizer();
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JsonIntegerFormatVisitor jsonIntegerFormatVisitor = (JsonIntegerFormatVisitor) obj;
        return this.IconCompatParcelizer == jsonIntegerFormatVisitor.IconCompatParcelizer && this.RemoteActionCompatParcelizer == jsonIntegerFormatVisitor.RemoteActionCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == jsonIntegerFormatVisitor.AudioAttributesImplApi21Parcelizer && this.AudioAttributesCompatParcelizer == jsonIntegerFormatVisitor.AudioAttributesCompatParcelizer && this.read == jsonIntegerFormatVisitor.read;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        return ((((((((i + 527) * 31) + i2) * 31) + this.AudioAttributesImplApi21Parcelizer) * 31) + this.AudioAttributesCompatParcelizer) * 31) + this.read;
    }

    static final class RemoteActionCompatParcelizer {
        public static void RemoteActionCompatParcelizer(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    static final class write {
        public static void write(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }
}
