package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface setPaymentMethodTokenizationParameters {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setPaymentMethodTokenizationParameters$IconCompatParcelizer;", "Lo/setPaymentMethodTokenizationParameters;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer implements setPaymentMethodTokenizationParameters {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        public final int hashCode() {
            return 1319571313;
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/setPaymentMethodTokenizationParameters$AudioAttributesCompatParcelizer;", "Lo/setPaymentMethodTokenizationParameters;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AudioAttributesCompatParcelizer implements setPaymentMethodTokenizationParameters {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        public final int hashCode() {
            return -2051331020;
        }

        private AudioAttributesCompatParcelizer() {
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "AudioAttributesCompatParcelizer";
        }
    }

    public static final class RemoteActionCompatParcelizer implements setPaymentMethodTokenizationParameters {
        private final int AudioAttributesCompatParcelizer;
        private final List<withTimeout> RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(List<withTimeout> list, int i) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.RemoteActionCompatParcelizer = list;
            this.AudioAttributesCompatParcelizer = i;
        }

        public final List<withTimeout> AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static RemoteActionCompatParcelizer read(List<withTimeout> list, int i) {
            toMagicModuleMetaRepoModel.write(list, "");
            return new RemoteActionCompatParcelizer(list, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer);
        }

        public final String toString() {
            List<withTimeout> list = this.RemoteActionCompatParcelizer;
            int i = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("Content(gtaModelResponse=");
            sb.append(list);
            sb.append(", selectedTestIndex=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }
    }
}
