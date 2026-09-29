package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class setLogSessionIdOnMediaDrmSession {
    private final String AudioAttributesCompatParcelizer;
    private final List<executeProvisionRequest> IconCompatParcelizer;
    private final setKeyRequestProperty read;
    private final clearAllKeyRequestProperties write;

    static {
        new read().read();
    }

    setLogSessionIdOnMediaDrmSession(setKeyRequestProperty setkeyrequestproperty, List<executeProvisionRequest> list, clearAllKeyRequestProperties clearallkeyrequestproperties, String str) {
        this.read = setkeyrequestproperty;
        this.IconCompatParcelizer = list;
        this.write = clearallkeyrequestproperties;
        this.AudioAttributesCompatParcelizer = str;
    }

    public final byte[] MediaBrowserCompatItemReceiver() {
        return getKeyId.read(this);
    }

    public static read read() {
        return new read();
    }

    public final setKeyRequestProperty AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final List<executeProvisionRequest> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final clearAllKeyRequestProperties RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static final class read {
        private setKeyRequestProperty RemoteActionCompatParcelizer = null;
        private List<executeProvisionRequest> IconCompatParcelizer = new ArrayList();
        private clearAllKeyRequestProperties AudioAttributesCompatParcelizer = null;
        private String write = "";

        read() {
        }

        public final setLogSessionIdOnMediaDrmSession read() {
            return new setLogSessionIdOnMediaDrmSession(this.RemoteActionCompatParcelizer, Collections.unmodifiableList(this.IconCompatParcelizer), this.AudioAttributesCompatParcelizer, this.write);
        }

        public final read AudioAttributesCompatParcelizer(setKeyRequestProperty setkeyrequestproperty) {
            this.RemoteActionCompatParcelizer = setkeyrequestproperty;
            return this;
        }

        public final read RemoteActionCompatParcelizer(executeProvisionRequest executeprovisionrequest) {
            this.IconCompatParcelizer.add(executeprovisionrequest);
            return this;
        }

        public final read write(clearAllKeyRequestProperties clearallkeyrequestproperties) {
            this.AudioAttributesCompatParcelizer = clearallkeyrequestproperties;
            return this;
        }

        public final read IconCompatParcelizer(String str) {
            this.write = str;
            return this;
        }
    }
}
