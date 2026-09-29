package com.marrow2.data.user.remote.model.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ`\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0013J\u001d\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u001f¢\u0006\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0013R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0013R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0013R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u0013R\u001c\u00104\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0018R\"\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001aR\u001a\u0010:\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001c"}, d2 = {"Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p4", "", "p5", "", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;Ljava/util/List;J)V", "", "hasProPlan", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "component6", "()Ljava/util/List;", "component7", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;Ljava/util/List;J)Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "id", "Ljava/lang/String;", "getId", "email", "getEmail", "firstName", "getFirstName", "lastName", "getLastName", "phoneNumber", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "getPhoneNumber", PaymentStatusResponseKt.KEY_SUBSCRIPTION, "Ljava/util/List;", "getSubscriptions", "createdOn", "J", "getCreatedOn"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserBasicDetails implements Parcelable {

    @JsonProperty(LoggedUserResponse.KEY_CREATED_ON)
    private final long createdOn;

    @JsonProperty("email")
    private final String email;

    @JsonProperty("fname")
    private final String firstName;

    @JsonProperty("_id")
    private final String id;

    @JsonProperty("lname")
    private final String lastName;

    @JsonProperty("primary_contact")
    private final PhoneNumberDetails phoneNumber;

    @JsonProperty("subscription")
    private final List<String> subscriptions;
    public static final Parcelable.Creator<UserBasicDetails> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserBasicDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserBasicDetails createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new UserBasicDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PhoneNumberDetails.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserBasicDetails[] newArray(int i) {
            return new UserBasicDetails[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UserBasicDetails(String str, String str2, String str3, String str4, PhoneNumberDetails phoneNumberDetails, List<String> list, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.id = str;
        this.email = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.phoneNumber = phoneNumberDetails;
        this.subscriptions = list;
        this.createdOn = j;
    }

    public /* synthetic */ UserBasicDetails(String str, String str2, String str3, String str4, PhoneNumberDetails phoneNumberDetails, List list, long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : phoneNumberDetails, (i & 32) != 0 ? null : list, (i & 64) != 0 ? 0L : j);
    }

    public final String getId() {
        return this.id;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final PhoneNumberDetails getPhoneNumber() {
        return this.phoneNumber;
    }

    public final List<String> getSubscriptions() {
        return this.subscriptions;
    }

    public final long getCreatedOn() {
        return this.createdOn;
    }

    public final boolean hasProPlan() {
        List<String> list = this.subscriptions;
        return !(list == null || list.isEmpty());
    }

    public UserBasicDetails() {
        this(null, null, null, null, null, null, 0L, 127, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PhoneNumberDetails getPhoneNumber() {
        return this.phoneNumber;
    }

    public final List<String> component6() {
        return this.subscriptions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreatedOn() {
        return this.createdOn;
    }

    public final UserBasicDetails copy(String p0, String p1, String p2, String p3, PhoneNumberDetails p4, List<String> p5, long p6) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new UserBasicDetails(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UserBasicDetails)) {
            return false;
        }
        UserBasicDetails userBasicDetails = (UserBasicDetails) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) userBasicDetails.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.email, (Object) userBasicDetails.email) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.firstName, (Object) userBasicDetails.firstName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lastName, (Object) userBasicDetails.lastName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.phoneNumber, userBasicDetails.phoneNumber) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subscriptions, userBasicDetails.subscriptions) && this.createdOn == userBasicDetails.createdOn;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.email.hashCode();
        int iHashCode3 = this.firstName.hashCode();
        int iHashCode4 = this.lastName.hashCode();
        PhoneNumberDetails phoneNumberDetails = this.phoneNumber;
        int iHashCode5 = phoneNumberDetails == null ? 0 : phoneNumberDetails.hashCode();
        List<String> list = this.subscriptions;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Long.hashCode(this.createdOn);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.email;
        String str3 = this.firstName;
        String str4 = this.lastName;
        PhoneNumberDetails phoneNumberDetails = this.phoneNumber;
        List<String> list = this.subscriptions;
        long j = this.createdOn;
        StringBuilder sb = new StringBuilder("UserBasicDetails(id=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", firstName=");
        sb.append(str3);
        sb.append(", lastName=");
        sb.append(str4);
        sb.append(", phoneNumber=");
        sb.append(phoneNumberDetails);
        sb.append(", subscriptions=");
        sb.append(list);
        sb.append(", createdOn=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.id);
        p0.writeString(this.email);
        p0.writeString(this.firstName);
        p0.writeString(this.lastName);
        PhoneNumberDetails phoneNumberDetails = this.phoneNumber;
        if (phoneNumberDetails == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            phoneNumberDetails.writeToParcel(p0, p1);
        }
        p0.writeStringList(this.subscriptions);
        p0.writeLong(this.createdOn);
    }
}
