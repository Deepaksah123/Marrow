package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/isFmgStudent;", "Lo/getPlatform;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "p0", "p1", "read", "(ILjava/lang/String;)Lo/getPlatform;", "write", "RemoteActionCompatParcelizer", "()Lo/isFmgStudent;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class isFmgStudent extends getPlatform {
    public abstract isFmgStudent RemoteActionCompatParcelizer();

    @Override // kotlin.getPlatform
    public String toString() {
        String strWrite = write();
        if (strWrite != null) {
            return strWrite;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(isVerified.read(this));
        sb.append('@');
        sb.append(isVerified.IconCompatParcelizer(this));
        return sb.toString();
    }

    @Override // kotlin.getPlatform
    public getPlatform read(int p0, String p1) {
        setPbSessionId.AudioAttributesCompatParcelizer(p0);
        return setPbSessionId.read(this, p1);
    }

    protected final String write() {
        isFmgStudent isfmgstudentRemoteActionCompatParcelizer;
        isFmgStudent isfmgstudentRemoteActionCompatParcelizer2 = setMbbsVerificationYear.RemoteActionCompatParcelizer();
        if (this == isfmgstudentRemoteActionCompatParcelizer2) {
            return "Dispatchers.Main";
        }
        try {
            isfmgstudentRemoteActionCompatParcelizer = isfmgstudentRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer();
        } catch (UnsupportedOperationException unused) {
            isfmgstudentRemoteActionCompatParcelizer = null;
        }
        if (this == isfmgstudentRemoteActionCompatParcelizer) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
