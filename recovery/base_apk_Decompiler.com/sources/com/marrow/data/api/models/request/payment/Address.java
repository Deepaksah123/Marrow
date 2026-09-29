package com.marrow.data.api.models.request.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012J\u0080\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0012R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0012R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u0012R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u0012R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u0012R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010\u0012R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b7\u0010\u0012R\u001a\u00108\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001cR\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010\u0012"}, d2 = {"Lcom/marrow/data/api/models/request/payment/Address;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "", "p9", "p10", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()I", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/marrow/data/api/models/request/payment/Address;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "name", "Ljava/lang/String;", "getName", "email", "getEmail", NotesDispatchAddressRequestKt.KEY_CONTACT, "getContact", "alternatePhone", "getAlternatePhone", "addressLine1", "getAddressLine1", "addressLine2", "getAddressLine2", "addressLine3", "getAddressLine3", NotesDispatchAddressRequestKt.KEY_CITY, "getCity", NotesDispatchAddressRequestKt.KEY_STATE, "getState", "pinCode", "I", "getPinCode", "notesSlot", "getNotesSlot"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Address {

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_ADD_LINE1)
    private final String addressLine1;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_ADD_LINE2)
    private final String addressLine2;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_ADD_LINE3)
    private final String addressLine3;

    @JsonProperty("alt_phone")
    private final String alternatePhone;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_CITY)
    private final String city;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_CONTACT)
    private final String contact;

    @JsonProperty("email")
    private final String email;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("notes_slot")
    private final String notesSlot;

    @JsonProperty("pincode")
    private final int pinCode;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_STATE)
    private final String state;

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        this.name = str;
        this.email = str2;
        this.contact = str3;
        this.alternatePhone = str4;
        this.addressLine1 = str5;
        this.addressLine2 = str6;
        this.addressLine3 = str7;
        this.city = str8;
        this.state = str9;
        this.pinCode = i;
        this.notesSlot = str10;
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, i, (i2 & 1024) != 0 ? null : str10);
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getContact() {
        return this.contact;
    }

    public final String getAlternatePhone() {
        return this.alternatePhone;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAddressLine3() {
        return this.addressLine3;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getState() {
        return this.state;
    }

    public final int getPinCode() {
        return this.pinCode;
    }

    public final String getNotesSlot() {
        return this.notesSlot;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPinCode() {
        return this.pinCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNotesSlot() {
        return this.notesSlot;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContact() {
        return this.contact;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAlternatePhone() {
        return this.alternatePhone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAddressLine3() {
        return this.addressLine3;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final Address copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, int p9, String p10) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        toMagicModuleMetaRepoModel.write(p7, "");
        toMagicModuleMetaRepoModel.write(p8, "");
        return new Address(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Address)) {
            return false;
        }
        Address address = (Address) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.name, (Object) address.name) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.email, (Object) address.email) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contact, (Object) address.contact) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.alternatePhone, (Object) address.alternatePhone) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.addressLine1, (Object) address.addressLine1) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.addressLine2, (Object) address.addressLine2) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.addressLine3, (Object) address.addressLine3) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.city, (Object) address.city) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.state, (Object) address.state) && this.pinCode == address.pinCode && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.notesSlot, (Object) address.notesSlot);
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.email.hashCode();
        int iHashCode3 = this.contact.hashCode();
        int iHashCode4 = this.alternatePhone.hashCode();
        int iHashCode5 = this.addressLine1.hashCode();
        int iHashCode6 = this.addressLine2.hashCode();
        int iHashCode7 = this.addressLine3.hashCode();
        int iHashCode8 = this.city.hashCode();
        int iHashCode9 = this.state.hashCode();
        int iHashCode10 = Integer.hashCode(this.pinCode);
        String str = this.notesSlot;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.email;
        String str3 = this.contact;
        String str4 = this.alternatePhone;
        String str5 = this.addressLine1;
        String str6 = this.addressLine2;
        String str7 = this.addressLine3;
        String str8 = this.city;
        String str9 = this.state;
        int i = this.pinCode;
        String str10 = this.notesSlot;
        StringBuilder sb = new StringBuilder("Address(name=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", contact=");
        sb.append(str3);
        sb.append(", alternatePhone=");
        sb.append(str4);
        sb.append(", addressLine1=");
        sb.append(str5);
        sb.append(", addressLine2=");
        sb.append(str6);
        sb.append(", addressLine3=");
        sb.append(str7);
        sb.append(", city=");
        sb.append(str8);
        sb.append(", state=");
        sb.append(str9);
        sb.append(", pinCode=");
        sb.append(i);
        sb.append(", notesSlot=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }
}
