package kotlin;

import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
final class searchForPcrValueInBuffer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer {
    private final int AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final Double read;
    private final long write;

    /* synthetic */ searchForPcrValueInBuffer(Double d, int i, boolean z, int i2, long j, long j2, byte b) {
        this(d, i, z, i2, j, j2);
    }

    private searchForPcrValueInBuffer(Double d, int i, boolean z, int i2, long j, long j2) {
        this.read = d;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = i2;
        this.AudioAttributesImplBaseParcelizer = j;
        this.write = j2;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer
    public final Double write() {
        return this.read;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer
    public final int read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer
    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer
    public final long RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer
    public final long IconCompatParcelizer() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.read);
        sb.append(", batteryVelocity=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", proximityOn=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", orientation=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", ramUsed=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", diskUsed=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer)) {
            return false;
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer abstractC0071RemoteActionCompatParcelizer = (fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer) obj;
        Double d = this.read;
        if (d == null) {
            if (abstractC0071RemoteActionCompatParcelizer.write() != null) {
                return false;
            }
        } else if (!d.equals(abstractC0071RemoteActionCompatParcelizer.write())) {
            return false;
        }
        return this.RemoteActionCompatParcelizer == abstractC0071RemoteActionCompatParcelizer.read() && this.IconCompatParcelizer == abstractC0071RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer() && this.AudioAttributesCompatParcelizer == abstractC0071RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer() && this.AudioAttributesImplBaseParcelizer == abstractC0071RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() && this.write == abstractC0071RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public final int hashCode() {
        Double d = this.read;
        int iHashCode = d == null ? 0 : d.hashCode();
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer ? 1231 : 1237;
        int i3 = this.AudioAttributesCompatParcelizer;
        long j = this.AudioAttributesImplBaseParcelizer;
        int i4 = (int) (j ^ (j >>> 32));
        long j2 = this.write;
        return ((int) ((j2 >>> 32) ^ j2)) ^ ((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003);
    }

    static final class RemoteActionCompatParcelizer extends fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write {
        private Integer AudioAttributesCompatParcelizer;
        private Long IconCompatParcelizer;
        private Long MediaBrowserCompatItemReceiver;
        private Boolean RemoteActionCompatParcelizer;
        private Integer read;
        private Double write;

        RemoteActionCompatParcelizer() {
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write AudioAttributesCompatParcelizer(Double d) {
            this.write = d;
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write read(int i) {
            this.read = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write IconCompatParcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = Boolean.valueOf(z);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = Integer.valueOf(i);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write read(long j) {
            this.MediaBrowserCompatItemReceiver = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write write(long j) {
            this.IconCompatParcelizer = Long.valueOf(j);
            return this;
        }

        @Override // o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.write
        public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            String string;
            if (this.read != null) {
                string = "";
            } else {
                string = " batteryVelocity";
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" proximityOn");
                string = sb.toString();
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" orientation");
                string = sb2.toString();
            }
            if (this.MediaBrowserCompatItemReceiver == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" ramUsed");
                string = sb3.toString();
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" diskUsed");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new searchForPcrValueInBuffer(this.write, this.read.intValue(), this.RemoteActionCompatParcelizer.booleanValue(), this.AudioAttributesCompatParcelizer.intValue(), this.MediaBrowserCompatItemReceiver.longValue(), this.IconCompatParcelizer.longValue(), (byte) 0);
        }
    }
}
