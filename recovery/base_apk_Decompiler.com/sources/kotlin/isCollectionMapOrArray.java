package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public interface isCollectionMapOrArray {
    boolean IconCompatParcelizer();

    long read();

    read write(long j);

    public static class write implements isCollectionMapOrArray {
        private final read AudioAttributesCompatParcelizer;
        private final long read;

        @Override // kotlin.isCollectionMapOrArray
        public final boolean IconCompatParcelizer() {
            return false;
        }

        public write(long j) {
            this(j, 0L);
        }

        public write(long j, long j2) {
            this.read = j;
            this.AudioAttributesCompatParcelizer = new read(j2 == 0 ? isLocalType.AudioAttributesCompatParcelizer : new isLocalType(0L, j2));
        }

        @Override // kotlin.isCollectionMapOrArray
        public final long read() {
            return this.read;
        }

        @Override // kotlin.isCollectionMapOrArray
        public final read write(long j) {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class read {
        public final isLocalType AudioAttributesCompatParcelizer;
        public final isLocalType IconCompatParcelizer;

        public read(isLocalType islocaltype) {
            this(islocaltype, islocaltype);
        }

        public read(isLocalType islocaltype, isLocalType islocaltype2) {
            this.AudioAttributesCompatParcelizer = (isLocalType) buildTypeSerializer.IconCompatParcelizer(islocaltype);
            this.IconCompatParcelizer = (isLocalType) buildTypeSerializer.IconCompatParcelizer(islocaltype2);
        }

        public final String toString() {
            String string;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.AudioAttributesCompatParcelizer);
            if (this.AudioAttributesCompatParcelizer.equals(this.IconCompatParcelizer)) {
                string = "";
            } else {
                StringBuilder sb2 = new StringBuilder(", ");
                sb2.append(this.IconCompatParcelizer);
                string = sb2.toString();
            }
            sb.append(string);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            read readVar = (read) obj;
            return this.AudioAttributesCompatParcelizer.equals(readVar.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer.equals(readVar.IconCompatParcelizer);
        }

        public final int hashCode() {
            return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
        }
    }
}
