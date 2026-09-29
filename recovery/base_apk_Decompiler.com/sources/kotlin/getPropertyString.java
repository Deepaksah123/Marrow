package kotlin;

import kotlin.setOnExpirationUpdateListener;

/* JADX INFO: loaded from: classes5.dex */
final class getPropertyString extends setOnExpirationUpdateListener {
    private final setOnExpirationUpdateListener.write AudioAttributesCompatParcelizer;
    private final getKeyRequest RemoteActionCompatParcelizer;

    /* synthetic */ getPropertyString(setOnExpirationUpdateListener.write writeVar, getKeyRequest getkeyrequest, byte b) {
        this(writeVar, getkeyrequest);
    }

    private getPropertyString(setOnExpirationUpdateListener.write writeVar, getKeyRequest getkeyrequest) {
        this.AudioAttributesCompatParcelizer = writeVar;
        this.RemoteActionCompatParcelizer = getkeyrequest;
    }

    @Override // kotlin.setOnExpirationUpdateListener
    public final setOnExpirationUpdateListener.write write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setOnExpirationUpdateListener
    public final getKeyRequest RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientInfo{clientType=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", androidClientInfo=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setOnExpirationUpdateListener)) {
            return false;
        }
        setOnExpirationUpdateListener setonexpirationupdatelistener = (setOnExpirationUpdateListener) obj;
        setOnExpirationUpdateListener.write writeVar = this.AudioAttributesCompatParcelizer;
        if (writeVar == null) {
            if (setonexpirationupdatelistener.write() != null) {
                return false;
            }
        } else if (!writeVar.equals(setonexpirationupdatelistener.write())) {
            return false;
        }
        getKeyRequest getkeyrequest = this.RemoteActionCompatParcelizer;
        if (getkeyrequest == null) {
            if (setonexpirationupdatelistener.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!getkeyrequest.equals(setonexpirationupdatelistener.RemoteActionCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        setOnExpirationUpdateListener.write writeVar = this.AudioAttributesCompatParcelizer;
        int iHashCode = writeVar == null ? 0 : writeVar.hashCode();
        getKeyRequest getkeyrequest = this.RemoteActionCompatParcelizer;
        return ((iHashCode ^ 1000003) * 1000003) ^ (getkeyrequest != null ? getkeyrequest.hashCode() : 0);
    }

    static final class RemoteActionCompatParcelizer extends setOnExpirationUpdateListener.IconCompatParcelizer {
        private setOnExpirationUpdateListener.write IconCompatParcelizer;
        private getKeyRequest read;

        RemoteActionCompatParcelizer() {
        }

        @Override // o.setOnExpirationUpdateListener.IconCompatParcelizer
        public final setOnExpirationUpdateListener.IconCompatParcelizer RemoteActionCompatParcelizer(setOnExpirationUpdateListener.write writeVar) {
            this.IconCompatParcelizer = writeVar;
            return this;
        }

        @Override // o.setOnExpirationUpdateListener.IconCompatParcelizer
        public final setOnExpirationUpdateListener.IconCompatParcelizer RemoteActionCompatParcelizer(getKeyRequest getkeyrequest) {
            this.read = getkeyrequest;
            return this;
        }

        @Override // o.setOnExpirationUpdateListener.IconCompatParcelizer
        public final setOnExpirationUpdateListener write() {
            return new getPropertyString(this.IconCompatParcelizer, this.read, (byte) 0);
        }
    }
}
