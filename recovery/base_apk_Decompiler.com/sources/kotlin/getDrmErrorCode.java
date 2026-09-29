package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getDrmErrorCode {
    private final IconCompatParcelizer AudioAttributesCompatParcelizer;
    private final double AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final write IconCompatParcelizer;
    private final List<RemoteActionCompatParcelizer> MediaBrowserCompatItemReceiver;
    private final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private final int read;
    private final double write;

    public getDrmErrorCode(int i, double d, double d2, String str, String str2, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, write writeVar, IconCompatParcelizer iconCompatParcelizer, List<RemoteActionCompatParcelizer> list) {
        this.read = i;
        this.write = d;
        this.AudioAttributesImplApi21Parcelizer = d2;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer = writeVar;
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = list;
    }

    public static final class AudioAttributesCompatParcelizer {
        private final String write;

        public AudioAttributesCompatParcelizer(String str) {
            this.write = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) ((AudioAttributesCompatParcelizer) obj).write);
        }

        public final int hashCode() {
            return this.write.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("City(name=");
            sb.append(this.write);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class IconCompatParcelizer {
        private final String IconCompatParcelizer;
        private final String read;

        public IconCompatParcelizer(String str, String str2) {
            this.IconCompatParcelizer = str;
            this.read = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iconCompatParcelizer.read);
        }

        public final int hashCode() {
            return this.read.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Continent(code=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", name=");
            sb.append(this.read);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private final String IconCompatParcelizer;
        private final String write;

        public RemoteActionCompatParcelizer(String str, String str2) {
            this.IconCompatParcelizer = str;
            this.write = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) remoteActionCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) remoteActionCompatParcelizer.write);
        }

        public final int hashCode() {
            return this.write.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Subdivisions(isoCode=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", name=");
            sb.append(this.write);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class write {
        private final String RemoteActionCompatParcelizer;
        private final String write;

        public write(String str, String str2) {
            this.write = str;
            this.RemoteActionCompatParcelizer = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) writeVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) writeVar.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return this.RemoteActionCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Country(code=");
            sb.append(this.write);
            sb.append(", name=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDrmErrorCode)) {
            return false;
        }
        getDrmErrorCode getdrmerrorcode = (getDrmErrorCode) obj;
        return this.read == getdrmerrorcode.read && Double.compare(this.write, getdrmerrorcode.write) == 0 && Double.compare(this.AudioAttributesImplApi21Parcelizer, getdrmerrorcode.AudioAttributesImplApi21Parcelizer) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) getdrmerrorcode.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) getdrmerrorcode.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getdrmerrorcode.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getdrmerrorcode.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getdrmerrorcode.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, getdrmerrorcode.MediaBrowserCompatItemReceiver);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.read);
        int iHashCode2 = Double.hashCode(this.write);
        int iHashCode3 = Double.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode4 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        int iHashCode5 = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode6 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode7 = this.IconCompatParcelizer.hashCode();
        return this.MediaBrowserCompatItemReceiver.hashCode() + ((this.AudioAttributesCompatParcelizer.hashCode() + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IpLocation(accuracyRadius=");
        sb.append(this.read);
        sb.append(", latitude=");
        sb.append(this.write);
        sb.append(", longitude=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", postalCode=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", timezone=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", city=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", country=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", continent=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", subdivisions=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(')');
        return sb.toString();
    }
}
