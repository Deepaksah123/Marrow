package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class executeProvisionRequest {
    private final List<clearKeyRequestProperty> AudioAttributesCompatParcelizer;
    private final String read;

    static {
        new write().write();
    }

    executeProvisionRequest(String str, List<clearKeyRequestProperty> list) {
        this.read = str;
        this.AudioAttributesCompatParcelizer = list;
    }

    public static write read() {
        return new write();
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final List<clearKeyRequestProperty> write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static final class write {
        private String write = "";
        private List<clearKeyRequestProperty> read = new ArrayList();

        write() {
        }

        public final executeProvisionRequest write() {
            return new executeProvisionRequest(this.write, Collections.unmodifiableList(this.read));
        }

        public final write write(String str) {
            this.write = str;
            return this;
        }

        public final write AudioAttributesCompatParcelizer(List<clearKeyRequestProperty> list) {
            this.read = list;
            return this;
        }
    }
}
