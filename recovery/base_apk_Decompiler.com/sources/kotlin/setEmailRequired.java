package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface setEmailRequired {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setEmailRequired$read;", "Lo/setEmailRequired;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class read implements setEmailRequired {
        public static final read INSTANCE = new read();

        public final int hashCode() {
            return 1599291831;
        }

        private read() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof read)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "read";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setEmailRequired$RemoteActionCompatParcelizer;", "Lo/setEmailRequired;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer implements setEmailRequired {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        public final int hashCode() {
            return -1969929554;
        }

        private RemoteActionCompatParcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "RemoteActionCompatParcelizer";
        }
    }

    public static final class AudioAttributesCompatParcelizer implements setEmailRequired {
        private final PaymentDataRequestBuilder AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final List<withTimeout> read;
        private final withSavedState write;

        public AudioAttributesCompatParcelizer(List<withTimeout> list, withSavedState withsavedstate, PaymentDataRequestBuilder paymentDataRequestBuilder, int i) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(withsavedstate, "");
            toMagicModuleMetaRepoModel.write(paymentDataRequestBuilder, "");
            this.read = list;
            this.write = withsavedstate;
            this.AudioAttributesCompatParcelizer = paymentDataRequestBuilder;
            this.IconCompatParcelizer = i;
        }

        public final List<withTimeout> read() {
            return this.read;
        }

        public final withSavedState AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final PaymentDataRequestBuilder write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(List<withTimeout> list, withSavedState withsavedstate, PaymentDataRequestBuilder paymentDataRequestBuilder, int i) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(withsavedstate, "");
            toMagicModuleMetaRepoModel.write(paymentDataRequestBuilder, "");
            return new AudioAttributesCompatParcelizer(list, withsavedstate, paymentDataRequestBuilder, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, audioAttributesCompatParcelizer.read) && this.write == audioAttributesCompatParcelizer.write && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (((((this.read.hashCode() * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            List<withTimeout> list = this.read;
            withSavedState withsavedstate = this.write;
            PaymentDataRequestBuilder paymentDataRequestBuilder = this.AudioAttributesCompatParcelizer;
            int i = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("Content(gtaStats=");
            sb.append(list);
            sb.append(", sort=");
            sb.append(withsavedstate);
            sb.append(", metric=");
            sb.append(paymentDataRequestBuilder);
            sb.append(", selectedTestIndex=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }
}
