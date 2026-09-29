package kotlin;

import kotlin.registerCustomCommandReceiver;

/* JADX INFO: loaded from: classes5.dex */
final class canDispatchToQueueNavigator extends registerCustomCommandReceiver {
    private final int IconCompatParcelizer;
    private final long MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final long write;

    /* synthetic */ canDispatchToQueueNavigator(long j, int i, int i2, long j2, int i3, byte b) {
        this(j, i, i2, j2, i3);
    }

    private canDispatchToQueueNavigator(long j, int i, int i2, long j2, int i3) {
        this.MediaBrowserCompatItemReceiver = j;
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.write = j2;
        this.IconCompatParcelizer = i3;
    }

    @Override // kotlin.registerCustomCommandReceiver
    final long IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.registerCustomCommandReceiver
    final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.registerCustomCommandReceiver
    final int write() {
        return this.read;
    }

    @Override // kotlin.registerCustomCommandReceiver
    final long RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.registerCustomCommandReceiver
    final int read() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", loadBatchSize=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.read);
        sb.append(", eventCleanUpAge=");
        sb.append(this.write);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof registerCustomCommandReceiver)) {
            return false;
        }
        registerCustomCommandReceiver registercustomcommandreceiver = (registerCustomCommandReceiver) obj;
        return this.MediaBrowserCompatItemReceiver == registercustomcommandreceiver.IconCompatParcelizer() && this.RemoteActionCompatParcelizer == registercustomcommandreceiver.AudioAttributesCompatParcelizer() && this.read == registercustomcommandreceiver.write() && this.write == registercustomcommandreceiver.RemoteActionCompatParcelizer() && this.IconCompatParcelizer == registercustomcommandreceiver.read();
    }

    public final int hashCode() {
        long j = this.MediaBrowserCompatItemReceiver;
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.read;
        long j2 = this.write;
        return this.IconCompatParcelizer ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    static final class RemoteActionCompatParcelizer extends registerCustomCommandReceiver.AudioAttributesCompatParcelizer {
        private Integer AudioAttributesCompatParcelizer;
        private Integer IconCompatParcelizer;
        private Long RemoteActionCompatParcelizer;
        private Integer read;
        private Long write;

        RemoteActionCompatParcelizer() {
        }

        @Override // o.registerCustomCommandReceiver.AudioAttributesCompatParcelizer
        final registerCustomCommandReceiver.AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver() {
            this.write = 10485760L;
            return this;
        }

        @Override // o.registerCustomCommandReceiver.AudioAttributesCompatParcelizer
        final registerCustomCommandReceiver.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
            this.read = 200;
            return this;
        }

        @Override // o.registerCustomCommandReceiver.AudioAttributesCompatParcelizer
        final registerCustomCommandReceiver.AudioAttributesCompatParcelizer read() {
            this.IconCompatParcelizer = 10000;
            return this;
        }

        @Override // o.registerCustomCommandReceiver.AudioAttributesCompatParcelizer
        final registerCustomCommandReceiver.AudioAttributesCompatParcelizer IconCompatParcelizer() {
            this.RemoteActionCompatParcelizer = 604800000L;
            return this;
        }

        @Override // o.registerCustomCommandReceiver.AudioAttributesCompatParcelizer
        final registerCustomCommandReceiver.AudioAttributesCompatParcelizer write() {
            this.AudioAttributesCompatParcelizer = 81920;
            return this;
        }

        @Override // o.registerCustomCommandReceiver.AudioAttributesCompatParcelizer
        final registerCustomCommandReceiver RemoteActionCompatParcelizer() {
            String string;
            if (this.write != null) {
                string = "";
            } else {
                string = " maxStorageSizeInBytes";
            }
            if (this.read == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" loadBatchSize");
                string = sb.toString();
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" criticalSectionEnterTimeoutMs");
                string = sb2.toString();
            }
            if (this.RemoteActionCompatParcelizer == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" eventCleanUpAge");
                string = sb3.toString();
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" maxBlobByteSizePerRow");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new canDispatchToQueueNavigator(this.write.longValue(), this.read.intValue(), this.IconCompatParcelizer.intValue(), this.RemoteActionCompatParcelizer.longValue(), this.AudioAttributesCompatParcelizer.intValue(), (byte) 0);
        }
    }
}
