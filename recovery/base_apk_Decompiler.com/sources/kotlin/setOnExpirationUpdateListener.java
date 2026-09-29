package kotlin;

import kotlin.getPropertyString;

/* JADX INFO: loaded from: classes5.dex */
public abstract class setOnExpirationUpdateListener {

    public static abstract class IconCompatParcelizer {
        public abstract IconCompatParcelizer RemoteActionCompatParcelizer(getKeyRequest getkeyrequest);

        public abstract IconCompatParcelizer RemoteActionCompatParcelizer(write writeVar);

        public abstract setOnExpirationUpdateListener write();
    }

    public abstract getKeyRequest RemoteActionCompatParcelizer();

    public abstract write write();

    public enum write {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int write;

        write(int i) {
            this.write = i;
        }
    }

    public static IconCompatParcelizer IconCompatParcelizer() {
        return new getPropertyString.RemoteActionCompatParcelizer();
    }
}
