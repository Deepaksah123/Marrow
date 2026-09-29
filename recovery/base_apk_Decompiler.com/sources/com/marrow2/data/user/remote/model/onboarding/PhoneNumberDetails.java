package com.marrow2.data.user.remote.model.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\rR\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\u0011"}, d2 = {"Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "", "isPhoneNumberVerified", "()Z", "asSingleEntity", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "describeContents", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "countryCode", "Ljava/lang/String;", "getCountryCode", "setCountryCode", "(Ljava/lang/String;)V", "nationalNumber", "getNationalNumber", "isVerified", "I", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhoneNumberDetails implements Parcelable {
    private static final String KEY_COUNTRY_CODE = "country_code";
    private static final String KEY_IS_VERIFIED = "is_verified";
    private static final String KEY_NATIONAL_NUMBER = "national_number";

    @JsonProperty(KEY_COUNTRY_CODE)
    private String countryCode;

    @JsonProperty(KEY_IS_VERIFIED)
    private final int isVerified;

    @JsonProperty(KEY_NATIONAL_NUMBER)
    private final String nationalNumber;
    public static final Parcelable.Creator<PhoneNumberDetails> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhoneNumberDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneNumberDetails createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new PhoneNumberDetails(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneNumberDetails[] newArray(int i) {
            return new PhoneNumberDetails[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PhoneNumberDetails(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.countryCode = str;
        this.nationalNumber = str2;
        this.isVerified = i;
    }

    public /* synthetic */ PhoneNumberDetails(String str, String str2, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "+91" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final void setCountryCode(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.countryCode = str;
    }

    public final String getNationalNumber() {
        return this.nationalNumber;
    }

    public final int isVerified() {
        return this.isVerified;
    }

    public final boolean isPhoneNumberVerified() {
        return this.isVerified == 1;
    }

    public final String asSingleEntity() {
        String strConcat = this.countryCode;
        if (strConcat.length() > 0 && !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strConcat, "+")) {
            strConcat = "+".concat(String.valueOf(strConcat));
        }
        String str = this.nationalNumber;
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat);
        sb.append(str);
        return sb.toString();
    }

    public PhoneNumberDetails() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ PhoneNumberDetails copy$default(PhoneNumberDetails phoneNumberDetails, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = phoneNumberDetails.countryCode;
        }
        if ((i2 & 2) != 0) {
            str2 = phoneNumberDetails.nationalNumber;
        }
        if ((i2 & 4) != 0) {
            i = phoneNumberDetails.isVerified;
        }
        return phoneNumberDetails.copy(str, str2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNationalNumber() {
        return this.nationalNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIsVerified() {
        return this.isVerified;
    }

    public final PhoneNumberDetails copy(String p0, String p1, int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new PhoneNumberDetails(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PhoneNumberDetails)) {
            return false;
        }
        PhoneNumberDetails phoneNumberDetails = (PhoneNumberDetails) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.countryCode, (Object) phoneNumberDetails.countryCode) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.nationalNumber, (Object) phoneNumberDetails.nationalNumber) && this.isVerified == phoneNumberDetails.isVerified;
    }

    public final int hashCode() {
        return (((this.countryCode.hashCode() * 31) + this.nationalNumber.hashCode()) * 31) + Integer.hashCode(this.isVerified);
    }

    public final String toString() {
        String str = this.countryCode;
        String str2 = this.nationalNumber;
        int i = this.isVerified;
        StringBuilder sb = new StringBuilder("PhoneNumberDetails(countryCode=");
        sb.append(str);
        sb.append(", nationalNumber=");
        sb.append(str2);
        sb.append(", isVerified=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.countryCode);
        p0.writeString(this.nationalNumber);
        p0.writeInt(this.isVerified);
    }
}
