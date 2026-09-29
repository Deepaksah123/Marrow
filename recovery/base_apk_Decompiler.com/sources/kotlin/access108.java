package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public abstract class access108 {
    public abstract write RemoteActionCompatParcelizer();

    public abstract RemoteActionCompatParcelizer read();

    public abstract read write();

    public static access108 AudioAttributesCompatParcelizer(read readVar, RemoteActionCompatParcelizer remoteActionCompatParcelizer, write writeVar) {
        return new readFirstPcrValue(readVar, remoteActionCompatParcelizer, writeVar);
    }

    public static abstract class read {
        public abstract int AudioAttributesCompatParcelizer();

        public abstract String AudioAttributesImplBaseParcelizer();

        public abstract String IconCompatParcelizer();

        public abstract parseCsdBuffer RemoteActionCompatParcelizer();

        public abstract String read();

        public abstract String write();

        public static read AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4, int i, parseCsdBuffer parsecsdbuffer) {
            return new readLastPcrValueFromBuffer(str, str2, str3, str4, i, parsecsdbuffer);
        }
    }

    public static abstract class RemoteActionCompatParcelizer {
        public abstract String IconCompatParcelizer();

        public abstract boolean RemoteActionCompatParcelizer();

        public abstract String read();

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str, String str2, boolean z) {
            return new findEndOfFirstTsPacketInBuffer(str, str2, z);
        }
    }

    public static abstract class write {
        public abstract String AudioAttributesCompatParcelizer();

        public abstract String AudioAttributesImplApi26Parcelizer();

        public abstract long AudioAttributesImplBaseParcelizer();

        public abstract boolean IconCompatParcelizer();

        public abstract String MediaBrowserCompatCustomActionResultReceiver();

        public abstract int MediaBrowserCompatItemReceiver();

        public abstract int RemoteActionCompatParcelizer();

        public abstract int read();

        public abstract long write();

        public static write IconCompatParcelizer(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            return new getPcrTimestampAdjuster(i, str, i2, j, j2, z, i3, str2, str3);
        }
    }
}
