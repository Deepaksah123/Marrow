package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface GoogleApiClientBuilder {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/GoogleApiClientBuilder$AudioAttributesCompatParcelizer;", "Lo/GoogleApiClientBuilder;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer implements GoogleApiClientBuilder {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        public final int hashCode() {
            return -53339494;
        }

        private AudioAttributesCompatParcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "AudioAttributesCompatParcelizer";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/GoogleApiClientBuilder$RemoteActionCompatParcelizer;", "Lo/GoogleApiClientBuilder;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer implements GoogleApiClientBuilder {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        public final int hashCode() {
            return 1749775914;
        }

        private RemoteActionCompatParcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "RemoteActionCompatParcelizer";
        }
    }

    public static final class read implements GoogleApiClientBuilder {
        private final long read;

        public read(long j) {
            this.read = j;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof read) && this.read == ((read) obj).read;
        }

        public final int hashCode() {
            return Long.hashCode(this.read);
        }

        public final String toString() {
            long j = this.read;
            StringBuilder sb = new StringBuilder("WaterDragStarted(pointerId=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class write implements GoogleApiClientBuilder {
        private final long read;

        public write(long j) {
            this.read = j;
        }

        public final long AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof write) && this.read == ((write) obj).read;
        }

        public final int hashCode() {
            return Long.hashCode(this.read);
        }

        public final String toString() {
            long j = this.read;
            StringBuilder sb = new StringBuilder("WaterPointerReleased(pointerId=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }
    }
}
