package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface executeSync {

    public static final class AudioAttributesCompatParcelizer implements executeSync {
        private final int read;
        private final int write;

        public AudioAttributesCompatParcelizer(int i, int i2) {
            this.write = i;
            this.read = i2;
        }

        public final int read() {
            return this.write;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.write == audioAttributesCompatParcelizer.write && this.read == audioAttributesCompatParcelizer.read;
        }

        public final int hashCode() {
            return (Integer.hashCode(this.write) * 31) + Integer.hashCode(this.read);
        }

        public final String toString() {
            int i = this.write;
            int i2 = this.read;
            StringBuilder sb = new StringBuilder("OnlyVideoCompleted(completed=");
            sb.append(i);
            sb.append(", total=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class IconCompatParcelizer implements executeSync {
        private final int AudioAttributesCompatParcelizer;
        private final int write;

        public IconCompatParcelizer(int i, int i2) {
            this.AudioAttributesCompatParcelizer = i;
            this.write = i2;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.AudioAttributesCompatParcelizer == iconCompatParcelizer.AudioAttributesCompatParcelizer && this.write == iconCompatParcelizer.write;
        }

        public final int hashCode() {
            return (Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Integer.hashCode(this.write);
        }

        public final String toString() {
            int i = this.AudioAttributesCompatParcelizer;
            int i2 = this.write;
            StringBuilder sb = new StringBuilder("OnlyActiveRecallCompleted(completed=");
            sb.append(i);
            sb.append(", total=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class write implements executeSync {
        private final int AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final int read;
        private final int write;

        public write(boolean z, int i, int i2, int i3, int i4) {
            this.RemoteActionCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
            this.write = i3;
            this.read = i4;
        }

        public final boolean write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final int read() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return this.RemoteActionCompatParcelizer == writeVar.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == writeVar.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == writeVar.IconCompatParcelizer && this.write == writeVar.write && this.read == writeVar.read;
        }

        public final int hashCode() {
            return (((((((Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.read);
        }

        public final String toString() {
            boolean z = this.RemoteActionCompatParcelizer;
            int i = this.AudioAttributesCompatParcelizer;
            int i2 = this.IconCompatParcelizer;
            int i3 = this.write;
            int i4 = this.read;
            StringBuilder sb = new StringBuilder("VideoAndActiveRecallCompleted(isFromVideoCompleted=");
            sb.append(z);
            sb.append(", completedVideoCount=");
            sb.append(i);
            sb.append(", totalVideoCount=");
            sb.append(i2);
            sb.append(", completedArqCount=");
            sb.append(i3);
            sb.append(", totalArqCount=");
            sb.append(i4);
            sb.append(")");
            return sb.toString();
        }
    }
}
