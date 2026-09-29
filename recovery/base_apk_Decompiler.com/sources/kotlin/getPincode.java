package kotlin;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class getPincode extends CancellationException implements setTestStatus<getPincode> {
    public final transient setPassingYear read;

    public getPincode(String str, setPassingYear setpassingyear) {
        super(str);
        this.read = setpassingyear;
    }

    public getPincode(String str) {
        this(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setTestStatus
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public getPincode RemoteActionCompatParcelizer() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        getPincode getpincode = new getPincode(message, this.read);
        getpincode.initCause(this);
        return getpincode;
    }
}
