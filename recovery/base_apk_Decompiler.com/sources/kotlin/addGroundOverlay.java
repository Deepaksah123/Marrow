package kotlin;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class addGroundOverlay {
    private int IconCompatParcelizer;
    private Uri RemoteActionCompatParcelizer;
    private Uri read;
    private String write;

    public addGroundOverlay(String str, Uri uri, Uri uri2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(uri, "");
        toMagicModuleMetaRepoModel.write(uri2, "");
        this.write = str;
        this.IconCompatParcelizer = -1;
        this.read = uri;
        this.RemoteActionCompatParcelizer = uri2;
    }

    public final String read() {
        return this.write;
    }

    public final void write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = str;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.IconCompatParcelizer = i;
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    public final Uri IconCompatParcelizer() {
        return this.read;
    }

    public final void RemoteActionCompatParcelizer(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        this.read = uri;
    }

    public final void IconCompatParcelizer(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        this.RemoteActionCompatParcelizer = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addGroundOverlay)) {
            return false;
        }
        addGroundOverlay addgroundoverlay = (addGroundOverlay) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) addgroundoverlay.write) && this.IconCompatParcelizer == addgroundoverlay.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, addgroundoverlay.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, addgroundoverlay.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.write.hashCode() * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + this.read.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        int i = this.IconCompatParcelizer;
        Uri uri = this.read;
        Uri uri2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("KycUserUiData(docTypeTitle=");
        sb.append(str);
        sb.append(", docType=");
        sb.append(i);
        sb.append(", frontImageUri=");
        sb.append(uri);
        sb.append(", backImageUri=");
        sb.append(uri2);
        sb.append(")");
        return sb.toString();
    }
}
