package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/ReusableBufferedOutputStream;", "", "", "p0", "", "p1", "Lo/ReusableBufferedOutputStream$RemoteActionCompatParcelizer;", "p2", "<init>", "(ILjava/lang/String;Lo/ReusableBufferedOutputStream$RemoteActionCompatParcelizer;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "numberOfExtensionDays", "I", "read", "couponCode", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "userDetail", "Lo/ReusableBufferedOutputStream$RemoteActionCompatParcelizer;", "write", "()Lo/ReusableBufferedOutputStream$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReusableBufferedOutputStream {
    public static final int $stable = 0;

    @JsonProperty("rf_coupon")
    private final String couponCode;

    @JsonProperty("extension_days")
    private final int numberOfExtensionDays;

    @JsonProperty("user_details")
    private final RemoteActionCompatParcelizer userDetail;

    private ReusableBufferedOutputStream(int i, String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.numberOfExtensionDays = i;
        this.couponCode = str;
        this.userDetail = remoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getNumberOfExtensionDays() {
        return this.numberOfExtensionDays;
    }

    public /* synthetic */ ReusableBufferedOutputStream(int i, String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : remoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getCouponCode() {
        return this.couponCode;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final RemoteActionCompatParcelizer getUserDetail() {
        return this.userDetail;
    }

    public ReusableBufferedOutputStream() {
        this(0, null, null, 7, null);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Lo/ReusableBufferedOutputStream$RemoteActionCompatParcelizer;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "userId", "Ljava/lang/String;", "IconCompatParcelizer", "firstName", "lastName"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer {
        public static final int $stable = 0;

        @JsonProperty("fname")
        private final String firstName;

        @JsonProperty("lname")
        private final String lastName;

        @JsonProperty("_id")
        private final String userId;

        private RemoteActionCompatParcelizer(String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.userId = str;
            this.firstName = str2;
            this.lastName = str3;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        public RemoteActionCompatParcelizer() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.userId, (Object) remoteActionCompatParcelizer.userId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.firstName, (Object) remoteActionCompatParcelizer.firstName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lastName, (Object) remoteActionCompatParcelizer.lastName);
        }

        public final int hashCode() {
            return (((this.userId.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode();
        }

        public final String toString() {
            String str = this.userId;
            String str2 = this.firstName;
            String str3 = this.lastName;
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(userId=");
            sb.append(str);
            sb.append(", firstName=");
            sb.append(str2);
            sb.append(", lastName=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ReusableBufferedOutputStream)) {
            return false;
        }
        ReusableBufferedOutputStream reusableBufferedOutputStream = (ReusableBufferedOutputStream) p0;
        return this.numberOfExtensionDays == reusableBufferedOutputStream.numberOfExtensionDays && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.couponCode, (Object) reusableBufferedOutputStream.couponCode) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.userDetail, reusableBufferedOutputStream.userDetail);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.numberOfExtensionDays);
        int iHashCode2 = this.couponCode.hashCode();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.userDetail;
        return (((iHashCode * 31) + iHashCode2) * 31) + (remoteActionCompatParcelizer == null ? 0 : remoteActionCompatParcelizer.hashCode());
    }

    public final String toString() {
        int i = this.numberOfExtensionDays;
        String str = this.couponCode;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.userDetail;
        StringBuilder sb = new StringBuilder("ReusableBufferedOutputStream(numberOfExtensionDays=");
        sb.append(i);
        sb.append(", couponCode=");
        sb.append(str);
        sb.append(", userDetail=");
        sb.append(remoteActionCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
