package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class chainedTransformer {
    public final int AudioAttributesCompatParcelizer;

    public static int AudioAttributesCompatParcelizer(int i) {
        return i >>> 24;
    }

    public static int write(int i) {
        return i & 16777215;
    }

    public chainedTransformer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public String toString() {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    static final class IconCompatParcelizer extends chainedTransformer {
        public final AsPropertyTypeDeserializer write;

        public IconCompatParcelizer(int i, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
            super(i);
            this.write = asPropertyTypeDeserializer;
        }
    }

    static final class RemoteActionCompatParcelizer extends chainedTransformer {
        public final long IconCompatParcelizer;
        public final List<IconCompatParcelizer> read;
        public final List<RemoteActionCompatParcelizer> write;

        public RemoteActionCompatParcelizer(int i, long j) {
            super(i);
            this.IconCompatParcelizer = j;
            this.read = new ArrayList();
            this.write = new ArrayList();
        }

        public final void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.read.add(iconCompatParcelizer);
        }

        public final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.write.add(remoteActionCompatParcelizer);
        }

        public final IconCompatParcelizer IconCompatParcelizer(int i) {
            int size = this.read.size();
            for (int i2 = 0; i2 < size; i2++) {
                IconCompatParcelizer iconCompatParcelizer = this.read.get(i2);
                if (iconCompatParcelizer.AudioAttributesCompatParcelizer == i) {
                    return iconCompatParcelizer;
                }
            }
            return null;
        }

        public final RemoteActionCompatParcelizer read(int i) {
            int size = this.write.size();
            for (int i2 = 0; i2 < size; i2++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write.get(i2);
                if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer == i) {
                    return remoteActionCompatParcelizer;
                }
            }
            return null;
        }

        @Override // kotlin.chainedTransformer
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
            sb.append(" leaves: ");
            sb.append(Arrays.toString(this.read.toArray()));
            sb.append(" containers: ");
            sb.append(Arrays.toString(this.write.toArray()));
            return sb.toString();
        }
    }

    public static String RemoteActionCompatParcelizer(int i) {
        StringBuilder sb = new StringBuilder("");
        sb.append((char) (i >>> 24));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }
}
