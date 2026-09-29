package kotlin;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface removeFirstOccurrence {

    public interface AudioAttributesCompatParcelizer {
        removeFirstOccurrence AudioAttributesCompatParcelizer(int i, read readVar);

        SparseArray<removeFirstOccurrence> read();
    }

    void IconCompatParcelizer();

    void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) throws SchemaAware;

    void RemoteActionCompatParcelizer(MinimalClassNameIdResolver minimalClassNameIdResolver, findRawSuperTypes findrawsupertypes, write writeVar);

    public static final class read {
        public final int AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final byte[] read;
        public final List<RemoteActionCompatParcelizer> write;

        public final int RemoteActionCompatParcelizer() {
            int i = this.AudioAttributesCompatParcelizer;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }

        public read(int i, String str, int i2, List<RemoteActionCompatParcelizer> list, byte[] bArr) {
            List<RemoteActionCompatParcelizer> listUnmodifiableList;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = i2;
            if (list == null) {
                listUnmodifiableList = Collections.emptyList();
            } else {
                listUnmodifiableList = Collections.unmodifiableList(list);
            }
            this.write = listUnmodifiableList;
            this.read = bArr;
        }
    }

    public static final class RemoteActionCompatParcelizer {
        public final byte[] AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final String write;

        public RemoteActionCompatParcelizer(String str, int i, byte[] bArr) {
            this.write = str;
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = bArr;
        }
    }

    public static final class write {
        private String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final int read;
        private final String write;

        public write(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public write(int i, int i2, int i3) {
            String string;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("/");
                string = sb.toString();
            } else {
                string = "";
            }
            this.write = string;
            this.RemoteActionCompatParcelizer = i2;
            this.read = i3;
            this.IconCompatParcelizer = Integer.MIN_VALUE;
            this.AudioAttributesCompatParcelizer = "";
        }

        public final void read() {
            int i = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i == Integer.MIN_VALUE ? this.RemoteActionCompatParcelizer : i + this.read;
            StringBuilder sb = new StringBuilder();
            sb.append(this.write);
            sb.append(this.IconCompatParcelizer);
            this.AudioAttributesCompatParcelizer = sb.toString();
        }

        public final int write() {
            RemoteActionCompatParcelizer();
            return this.IconCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            RemoteActionCompatParcelizer();
            return this.AudioAttributesCompatParcelizer;
        }

        private void RemoteActionCompatParcelizer() {
            if (this.IconCompatParcelizer == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }
}
