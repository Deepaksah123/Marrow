package in.juspay.hypersdk.ota;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateResult;", "", "Error", "NA", "Ok", "PackageUpdateTimeout", "ReleaseConfigFetchTimeout", "Lin/juspay/hypersdk/ota/UpdateResult$Error;", "Lin/juspay/hypersdk/ota/UpdateResult$NA;", "Lin/juspay/hypersdk/ota/UpdateResult$Ok;", "Lin/juspay/hypersdk/ota/UpdateResult$PackageUpdateTimeout;", "Lin/juspay/hypersdk/ota/UpdateResult$ReleaseConfigFetchTimeout;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface UpdateResult {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateResult$Error;", "Lin/juspay/hypersdk/ota/UpdateResult;", "RCFetchError", "Unknown", "Lin/juspay/hypersdk/ota/UpdateResult$Error$RCFetchError;", "Lin/juspay/hypersdk/ota/UpdateResult$Error$Unknown;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Error extends UpdateResult {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateResult$Error$RCFetchError;", "Lin/juspay/hypersdk/ota/UpdateResult$Error;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RCFetchError implements Error {
            public static final RCFetchError INSTANCE = new RCFetchError();

            private RCFetchError() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateResult$Error$Unknown;", "Lin/juspay/hypersdk/ota/UpdateResult$Error;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unknown implements Error {
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateResult$NA;", "Lin/juspay/hypersdk/ota/UpdateResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NA implements UpdateResult {
        public static final NA INSTANCE = new NA();

        private NA() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateResult$Ok;", "Lin/juspay/hypersdk/ota/UpdateResult;", "Lin/juspay/hypersdk/ota/ReleaseConfig;", "p0", "<init>", "(Lin/juspay/hypersdk/ota/ReleaseConfig;)V", "component1", "()Lin/juspay/hypersdk/ota/ReleaseConfig;", "copy", "(Lin/juspay/hypersdk/ota/ReleaseConfig;)Lin/juspay/hypersdk/ota/UpdateResult$Ok;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "releaseConfig", "Lin/juspay/hypersdk/ota/ReleaseConfig;", "getReleaseConfig"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Ok implements UpdateResult {
        private final ReleaseConfig releaseConfig;

        public Ok(ReleaseConfig releaseConfig) {
            toMagicModuleMetaRepoModel.write(releaseConfig, "");
            this.releaseConfig = releaseConfig;
        }

        public final ReleaseConfig getReleaseConfig() {
            return this.releaseConfig;
        }

        public static /* synthetic */ Ok copy$default(Ok ok, ReleaseConfig releaseConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                releaseConfig = ok.releaseConfig;
            }
            return ok.copy(releaseConfig);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ReleaseConfig getReleaseConfig() {
            return this.releaseConfig;
        }

        public final Ok copy(ReleaseConfig p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Ok(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof Ok) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.releaseConfig, ((Ok) p0).releaseConfig);
        }

        public final int hashCode() {
            return this.releaseConfig.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ok(releaseConfig=");
            sb.append(this.releaseConfig);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateResult$PackageUpdateTimeout;", "Lin/juspay/hypersdk/ota/UpdateResult;", "Lin/juspay/hypersdk/ota/ReleaseConfig;", "p0", "<init>", "(Lin/juspay/hypersdk/ota/ReleaseConfig;)V", "component1", "()Lin/juspay/hypersdk/ota/ReleaseConfig;", "copy", "(Lin/juspay/hypersdk/ota/ReleaseConfig;)Lin/juspay/hypersdk/ota/UpdateResult$PackageUpdateTimeout;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "releaseConfig", "Lin/juspay/hypersdk/ota/ReleaseConfig;", "getReleaseConfig"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PackageUpdateTimeout implements UpdateResult {
        private final ReleaseConfig releaseConfig;

        public PackageUpdateTimeout(ReleaseConfig releaseConfig) {
            this.releaseConfig = releaseConfig;
        }

        public final ReleaseConfig getReleaseConfig() {
            return this.releaseConfig;
        }

        public static /* synthetic */ PackageUpdateTimeout copy$default(PackageUpdateTimeout packageUpdateTimeout, ReleaseConfig releaseConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                releaseConfig = packageUpdateTimeout.releaseConfig;
            }
            return packageUpdateTimeout.copy(releaseConfig);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ReleaseConfig getReleaseConfig() {
            return this.releaseConfig;
        }

        public final PackageUpdateTimeout copy(ReleaseConfig p0) {
            return new PackageUpdateTimeout(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof PackageUpdateTimeout) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.releaseConfig, ((PackageUpdateTimeout) p0).releaseConfig);
        }

        public final int hashCode() {
            ReleaseConfig releaseConfig = this.releaseConfig;
            if (releaseConfig == null) {
                return 0;
            }
            return releaseConfig.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PackageUpdateTimeout(releaseConfig=");
            sb.append(this.releaseConfig);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lin/juspay/hypersdk/ota/UpdateResult$ReleaseConfigFetchTimeout;", "Lin/juspay/hypersdk/ota/UpdateResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ReleaseConfigFetchTimeout implements UpdateResult {
        public static final ReleaseConfigFetchTimeout INSTANCE = new ReleaseConfigFetchTimeout();

        private ReleaseConfigFetchTimeout() {
        }
    }
}
