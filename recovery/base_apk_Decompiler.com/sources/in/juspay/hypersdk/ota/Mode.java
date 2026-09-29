package in.juspay.hypersdk.ota;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t"}, d2 = {"Lin/juspay/hypersdk/ota/Mode;", "", "Beta", "CUG", "DevQa", "Release", "Lin/juspay/hypersdk/ota/Mode$Beta;", "Lin/juspay/hypersdk/ota/Mode$CUG;", "Lin/juspay/hypersdk/ota/Mode$DevQa;", "Lin/juspay/hypersdk/ota/Mode$Release;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Mode {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/Mode$Beta;", "Lin/juspay/hypersdk/ota/Mode;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Beta implements Mode {
        public static final Beta INSTANCE = new Beta();

        private Beta() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/Mode$CUG;", "Lin/juspay/hypersdk/ota/Mode;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CUG implements Mode {
        public static final CUG INSTANCE = new CUG();

        private CUG() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lin/juspay/hypersdk/ota/Mode$DevQa;", "Lin/juspay/hypersdk/ota/Mode;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lin/juspay/hypersdk/ota/Mode$DevQa;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "ticket", "Ljava/lang/String;", "getTicket"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DevQa implements Mode {
        private final String ticket;

        public DevQa(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.ticket = str;
        }

        public final String getTicket() {
            return this.ticket;
        }

        public static /* synthetic */ DevQa copy$default(DevQa devQa, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = devQa.ticket;
            }
            return devQa.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTicket() {
            return this.ticket;
        }

        public final DevQa copy(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new DevQa(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof DevQa) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.ticket, (Object) ((DevQa) p0).ticket);
        }

        public final int hashCode() {
            return this.ticket.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DevQa(ticket=");
            sb.append(this.ticket);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/Mode$Release;", "Lin/juspay/hypersdk/ota/Mode;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Release implements Mode {
        public static final Release INSTANCE = new Release();

        private Release() {
        }
    }
}
