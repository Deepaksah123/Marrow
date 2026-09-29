package kotlin;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class collectAndResolveSubtypesByTypeId {
    public static final collectAndResolveSubtypesByTypeId RemoteActionCompatParcelizer = new collectAndResolveSubtypesByTypeId(initExtraTracks.AudioAttributesImplApi26Parcelizer());
    private final initExtraTracks<write> AudioAttributesCompatParcelizer;

    public static final class write {
        private final setName AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final boolean[] read;
        private final int[] write;

        public write(setName setname, boolean z, int[] iArr, boolean[] zArr) {
            int i = setname.write;
            this.IconCompatParcelizer = i;
            buildTypeSerializer.IconCompatParcelizer(i == iArr.length && i == zArr.length);
            this.AudioAttributesCompatParcelizer = setname;
            this.RemoteActionCompatParcelizer = z && i > 1;
            this.write = (int[]) iArr.clone();
            this.read = (boolean[]) zArr.clone();
        }

        public final setName read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final C0170format RemoteActionCompatParcelizer(int i) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
        }

        public final boolean write(int i) {
            return RemoteActionCompatParcelizer(i, false);
        }

        private boolean RemoteActionCompatParcelizer(int i, boolean z) {
            int i2 = this.write[i];
            if (i2 != 4) {
                return z && i2 == 3;
            }
            return true;
        }

        public final boolean IconCompatParcelizer() {
            return parseCommentAttribute.RemoteActionCompatParcelizer(this.read);
        }

        public final boolean write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean write(boolean z) {
            for (int i = 0; i < this.write.length; i++) {
                if (RemoteActionCompatParcelizer(i, false)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean read(int i) {
            return this.read[i];
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write writeVar = (write) obj;
            return this.RemoteActionCompatParcelizer == writeVar.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer.equals(writeVar.AudioAttributesCompatParcelizer) && Arrays.equals(this.write, writeVar.write) && Arrays.equals(this.read, writeVar.read);
        }

        public final int hashCode() {
            int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
            boolean z = this.RemoteActionCompatParcelizer;
            return (((((iHashCode * 31) + (z ? 1 : 0)) * 31) + Arrays.hashCode(this.write)) * 31) + Arrays.hashCode(this.read);
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        }
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
    }

    public collectAndResolveSubtypesByTypeId(List<write> list) {
        this.AudioAttributesCompatParcelizer = initExtraTracks.write(list);
    }

    public final initExtraTracks<write> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean write() {
        return this.AudioAttributesCompatParcelizer.isEmpty();
    }

    public final boolean RemoteActionCompatParcelizer() {
        return read(2);
    }

    private boolean read(int i) {
        for (int i2 = 0; i2 < this.AudioAttributesCompatParcelizer.size(); i2++) {
            if (this.AudioAttributesCompatParcelizer.get(i2).AudioAttributesCompatParcelizer() == 2 && this.AudioAttributesCompatParcelizer.get(i2).write(false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean IconCompatParcelizer(int i) {
        for (int i2 = 0; i2 < this.AudioAttributesCompatParcelizer.size(); i2++) {
            write writeVar = this.AudioAttributesCompatParcelizer.get(i2);
            if (writeVar.IconCompatParcelizer() && writeVar.AudioAttributesCompatParcelizer() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.AudioAttributesCompatParcelizer.equals(((collectAndResolveSubtypesByTypeId) obj).AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }
}
