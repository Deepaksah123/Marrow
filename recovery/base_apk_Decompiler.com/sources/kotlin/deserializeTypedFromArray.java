package kotlin;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public interface deserializeTypedFromArray {
    public static final ByteBuffer AudioAttributesCompatParcelizer = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void AudioAttributesCompatParcelizer();

    void AudioAttributesImplApi26Parcelizer();

    ByteBuffer IconCompatParcelizer();

    IconCompatParcelizer RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) throws RemoteActionCompatParcelizer;

    boolean RemoteActionCompatParcelizer();

    void read(ByteBuffer byteBuffer);

    boolean read();

    void write();

    public static final class IconCompatParcelizer {
        public static final IconCompatParcelizer read = new IconCompatParcelizer(-1, -1, -1);
        public final int AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final int write;

        public IconCompatParcelizer(C0170format c0170format) {
            this(c0170format.onPrepareFromUri, c0170format.AudioAttributesCompatParcelizer, c0170format.onMediaButtonEvent);
        }

        public IconCompatParcelizer(int i, int i2, int i3) {
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
            this.write = i3;
            this.AudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.MediaBrowserCompatMediaItem(i3) ? LaissezFaireSubTypeValidator.read(i3, i2) : -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", channelCount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", encoding=");
            sb.append(this.write);
            sb.append(']');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer && this.write == iconCompatParcelizer.write;
        }

        public final int hashCode() {
            return parseSmta.read(Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.write));
        }
    }

    public static final class RemoteActionCompatParcelizer extends Exception {
        public final IconCompatParcelizer write;

        public RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this("Unhandled input format:", iconCompatParcelizer);
        }

        private RemoteActionCompatParcelizer(String str, IconCompatParcelizer iconCompatParcelizer) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(iconCompatParcelizer);
            super(sb.toString());
            this.write = iconCompatParcelizer;
        }
    }
}
