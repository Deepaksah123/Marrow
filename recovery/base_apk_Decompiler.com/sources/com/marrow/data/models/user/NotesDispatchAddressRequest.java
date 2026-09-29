package com.marrow.data.models.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J~\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0011R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0011R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u0011R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u0011R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u0011R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010\u0011R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b7\u0010\u0011R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b9\u0010\u0011R\u001a\u0010:\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b;\u0010\u0011"}, d2 = {"Lcom/marrow/data/models/user/NotesDispatchAddressRequest;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/user/NotesDispatchAddressRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "name", "getName", "addLine1", "getAddLine1", "addLine2", "getAddLine2", "addLine3", "getAddLine3", NotesDispatchAddressRequestKt.KEY_CITY, "getCity", "pincode", "getPincode", NotesDispatchAddressRequestKt.KEY_STATE, "getState", NotesDispatchAddressRequestKt.KEY_CONTACT, "getContact", "altContact", "getAltContact", "paymentRefId", "getPaymentRefId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotesDispatchAddressRequest {

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_ADD_LINE1)
    private final String addLine1;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_ADD_LINE2)
    private final String addLine2;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_ADD_LINE3)
    private final String addLine3;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_ALT_CONTACT)
    private final String altContact;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_CITY)
    private final String city;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_CONTACT)
    private final String contact;

    @JsonProperty("_id")
    private final String id;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("payment_ref_id")
    private final String paymentRefId;

    @JsonProperty("pincode")
    private final String pincode;

    @JsonProperty(NotesDispatchAddressRequestKt.KEY_STATE)
    private final String state;

    public NotesDispatchAddressRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        toMagicModuleMetaRepoModel.write(str11, "");
        this.id = str;
        this.name = str2;
        this.addLine1 = str3;
        this.addLine2 = str4;
        this.addLine3 = str5;
        this.city = str6;
        this.pincode = str7;
        this.state = str8;
        this.contact = str9;
        this.altContact = str10;
        this.paymentRefId = str11;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAddLine1() {
        return this.addLine1;
    }

    public final String getAddLine2() {
        return this.addLine2;
    }

    public final String getAddLine3() {
        return this.addLine3;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getContact() {
        return this.contact;
    }

    public final String getAltContact() {
        return this.altContact;
    }

    public final String getPaymentRefId() {
        return this.paymentRefId;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAltContact() {
        return this.altContact;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPaymentRefId() {
        return this.paymentRefId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAddLine1() {
        return this.addLine1;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAddLine2() {
        return this.addLine2;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAddLine3() {
        return this.addLine3;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPincode() {
        return this.pincode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getContact() {
        return this.contact;
    }

    public final NotesDispatchAddressRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        toMagicModuleMetaRepoModel.write(p7, "");
        toMagicModuleMetaRepoModel.write(p8, "");
        toMagicModuleMetaRepoModel.write(p9, "");
        toMagicModuleMetaRepoModel.write(p10, "");
        return new NotesDispatchAddressRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NotesDispatchAddressRequest)) {
            return false;
        }
        NotesDispatchAddressRequest notesDispatchAddressRequest = (NotesDispatchAddressRequest) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) notesDispatchAddressRequest.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.name, (Object) notesDispatchAddressRequest.name) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.addLine1, (Object) notesDispatchAddressRequest.addLine1) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.addLine2, (Object) notesDispatchAddressRequest.addLine2) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.addLine3, (Object) notesDispatchAddressRequest.addLine3) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.city, (Object) notesDispatchAddressRequest.city) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pincode, (Object) notesDispatchAddressRequest.pincode) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.state, (Object) notesDispatchAddressRequest.state) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contact, (Object) notesDispatchAddressRequest.contact) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.altContact, (Object) notesDispatchAddressRequest.altContact) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.paymentRefId, (Object) notesDispatchAddressRequest.paymentRefId);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.addLine1.hashCode()) * 31) + this.addLine2.hashCode()) * 31) + this.addLine3.hashCode()) * 31) + this.city.hashCode()) * 31) + this.pincode.hashCode()) * 31) + this.state.hashCode()) * 31) + this.contact.hashCode()) * 31) + this.altContact.hashCode()) * 31) + this.paymentRefId.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.addLine1;
        String str4 = this.addLine2;
        String str5 = this.addLine3;
        String str6 = this.city;
        String str7 = this.pincode;
        String str8 = this.state;
        String str9 = this.contact;
        String str10 = this.altContact;
        String str11 = this.paymentRefId;
        StringBuilder sb = new StringBuilder("NotesDispatchAddressRequest(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", addLine1=");
        sb.append(str3);
        sb.append(", addLine2=");
        sb.append(str4);
        sb.append(", addLine3=");
        sb.append(str5);
        sb.append(", city=");
        sb.append(str6);
        sb.append(", pincode=");
        sb.append(str7);
        sb.append(", state=");
        sb.append(str8);
        sb.append(", contact=");
        sb.append(str9);
        sb.append(", altContact=");
        sb.append(str10);
        sb.append(", paymentRefId=");
        sb.append(str11);
        sb.append(")");
        return sb.toString();
    }
}
