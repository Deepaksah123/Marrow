package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class readUnsignedIntToInt {
    private final boolean AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final List<ReusableBufferedOutputStream> IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final long RemoteActionCompatParcelizer;
    private final int read;
    private final String write;

    public readUnsignedIntToInt(int i, int i2, String str, boolean z, long j, int i3, int i4, int i5, String str2, List<ReusableBufferedOutputStream> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesImplBaseParcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.AudioAttributesCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = j;
        this.read = i3;
        this.AudioAttributesImplApi21Parcelizer = i4;
        this.MediaBrowserCompatItemReceiver = i5;
        this.write = str2;
        this.IconCompatParcelizer = list;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final List<ReusableBufferedOutputStream> read() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readUnsignedIntToInt)) {
            return false;
        }
        readUnsignedIntToInt readunsignedinttoint = (readUnsignedIntToInt) obj;
        return this.AudioAttributesImplBaseParcelizer == readunsignedinttoint.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi26Parcelizer == readunsignedinttoint.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) readunsignedinttoint.MediaBrowserCompatCustomActionResultReceiver) && this.AudioAttributesCompatParcelizer == readunsignedinttoint.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == readunsignedinttoint.RemoteActionCompatParcelizer && this.read == readunsignedinttoint.read && this.AudioAttributesImplApi21Parcelizer == readunsignedinttoint.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatItemReceiver == readunsignedinttoint.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) readunsignedinttoint.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, readunsignedinttoint.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.AudioAttributesImplBaseParcelizer) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.write.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.AudioAttributesImplBaseParcelizer;
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.AudioAttributesCompatParcelizer;
        long j = this.RemoteActionCompatParcelizer;
        int i3 = this.read;
        int i4 = this.AudioAttributesImplApi21Parcelizer;
        int i5 = this.MediaBrowserCompatItemReceiver;
        String str2 = this.write;
        List<ReusableBufferedOutputStream> list = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("ReferralCouponDetailsUCModel(referralBenefitLimit=");
        sb.append(i);
        sb.append(", referralExtensionDaysLimit=");
        sb.append(i2);
        sb.append(", referralCode=");
        sb.append(str);
        sb.append(", isCodeActive=");
        sb.append(z);
        sb.append(", codeEndTime=");
        sb.append(j);
        sb.append(", numberOfReferralCouponsUsedByCurrentUser=");
        sb.append(i3);
        sb.append(", numberOfTimesCurrentUserReferralUsed=");
        sb.append(i4);
        sb.append(", totalRedeemCount=");
        sb.append(i5);
        sb.append(", currentUserId=");
        sb.append(str2);
        sb.append(", benefitDetails=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
