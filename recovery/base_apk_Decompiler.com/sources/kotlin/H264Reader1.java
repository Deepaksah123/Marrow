package kotlin;

import kotlin.LatmReader;

/* JADX INFO: loaded from: classes5.dex */
final class H264Reader1 extends LatmReader.IconCompatParcelizer {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;

    H264Reader1(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    @Override // o.LatmReader.IconCompatParcelizer
    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.LatmReader.IconCompatParcelizer
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", firebaseInstallationId=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LatmReader.IconCompatParcelizer)) {
            return false;
        }
        LatmReader.IconCompatParcelizer iconCompatParcelizer = (LatmReader.IconCompatParcelizer) obj;
        if (!this.IconCompatParcelizer.equals(iconCompatParcelizer.IconCompatParcelizer())) {
            return false;
        }
        String str = this.AudioAttributesCompatParcelizer;
        if (str == null) {
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!str.equals(iconCompatParcelizer.AudioAttributesCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        String str = this.AudioAttributesCompatParcelizer;
        return (str == null ? 0 : str.hashCode()) ^ ((iHashCode ^ 1000003) * 1000003);
    }
}
