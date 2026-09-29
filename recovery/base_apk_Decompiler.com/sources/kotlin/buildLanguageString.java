package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class buildLanguageString {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    public buildLanguageString(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.read = z;
        this.write = z2;
        this.IconCompatParcelizer = z3;
        this.AudioAttributesCompatParcelizer = z4;
        this.RemoteActionCompatParcelizer = z5;
        this.AudioAttributesImplBaseParcelizer = z6;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean read() {
        return this.write;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buildLanguageString)) {
            return false;
        }
        buildLanguageString buildlanguagestring = (buildLanguageString) obj;
        return this.read == buildlanguagestring.read && this.write == buildlanguagestring.write && this.IconCompatParcelizer == buildlanguagestring.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == buildlanguagestring.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == buildlanguagestring.RemoteActionCompatParcelizer && this.AudioAttributesImplBaseParcelizer == buildlanguagestring.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        return (((((((((Boolean.hashCode(this.read) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        boolean z = this.read;
        boolean z2 = this.write;
        boolean z3 = this.IconCompatParcelizer;
        boolean z4 = this.AudioAttributesCompatParcelizer;
        boolean z5 = this.RemoteActionCompatParcelizer;
        boolean z6 = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("ChromeOsDetectionResult(hasSystemFeature=");
        sb.append(z);
        sb.append(", isChromeOsByBuildProperties=");
        sb.append(z2);
        sb.append(", hasVirtualizationCpuFlags=");
        sb.append(z3);
        sb.append(", hasArcSpecificFiles=");
        sb.append(z4);
        sb.append(", hasArcProcessesOrServices=");
        sb.append(z5);
        sb.append(", isChromeOsByHeuristics=");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }
}
