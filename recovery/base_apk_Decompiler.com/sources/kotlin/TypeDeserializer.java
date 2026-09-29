package kotlin;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeDeserializer {
    public final initExtraTracks<Integer> RemoteActionCompatParcelizer;
    public final setName read;

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
    }

    public TypeDeserializer(setName setname, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= setname.write)) {
            throw new IndexOutOfBoundsException();
        }
        this.read = setname;
        this.RemoteActionCompatParcelizer = initExtraTracks.write(list);
    }

    public final int IconCompatParcelizer() {
        return this.read.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TypeDeserializer typeDeserializer = (TypeDeserializer) obj;
        return this.read.equals(typeDeserializer.read) && this.RemoteActionCompatParcelizer.equals(typeDeserializer.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }
}
