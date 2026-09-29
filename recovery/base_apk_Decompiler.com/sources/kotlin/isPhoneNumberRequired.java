package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface isPhoneNumberRequired {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/isPhoneNumberRequired$IconCompatParcelizer;", "Lo/isPhoneNumberRequired;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer implements isPhoneNumberRequired {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        public final int hashCode() {
            return -1766341193;
        }

        private IconCompatParcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "IconCompatParcelizer";
        }
    }

    public static final class read implements isPhoneNumberRequired {
        private final getShippingAddressRequirements IconCompatParcelizer;

        public read(getShippingAddressRequirements getshippingaddressrequirements) {
            toMagicModuleMetaRepoModel.write(getshippingaddressrequirements, "");
            this.IconCompatParcelizer = getshippingaddressrequirements;
        }

        public final getShippingAddressRequirements RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((read) obj).IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }

        public final String toString() {
            getShippingAddressRequirements getshippingaddressrequirements = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("Content(data=");
            sb.append(getshippingaddressrequirements);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class RemoteActionCompatParcelizer implements isPhoneNumberRequired {
        private final String AudioAttributesCompatParcelizer;
        private final int write;

        public RemoteActionCompatParcelizer(int i, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = i;
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.write == remoteActionCompatParcelizer.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (Integer.hashCode(this.write) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            int i = this.write;
            String str = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("Error(errorCode=");
            sb.append(i);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }
}
