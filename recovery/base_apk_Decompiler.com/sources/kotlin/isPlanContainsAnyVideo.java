package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isPlanContainsAnyVideo implements setDefault {
    public String toString() {
        if (write()) {
            return "*";
        }
        if (read() == getTotalSubject.INVARIANT) {
            return AudioAttributesCompatParcelizer().toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(read());
        sb.append(" ");
        sb.append(AudioAttributesCompatParcelizer());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDefault)) {
            return false;
        }
        setDefault setdefault = (setDefault) obj;
        return write() == setdefault.write() && read() == setdefault.read() && AudioAttributesCompatParcelizer().equals(setdefault.AudioAttributesCompatParcelizer());
    }

    public int hashCode() {
        int iHashCode = read().hashCode();
        if (setPlanAddOns.MediaBrowserCompatItemReceiver(AudioAttributesCompatParcelizer())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (write() ? 17 : AudioAttributesCompatParcelizer().hashCode());
    }
}
