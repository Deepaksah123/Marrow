package com.razorpay;

import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/razorpay/PhoneNumberHintHelper$PhoneNumberResponse;", "", NotesDispatchAddressRequestKt.KEY_STATE, "Lcom/razorpay/PhoneNumberHintHelper$PhoneNumberHintResponseStates;", NotesDispatchAddressRequestKt.KEY_CONTACT, "", "message", "(Lcom/razorpay/PhoneNumberHintHelper$PhoneNumberHintResponseStates;Ljava/lang/String;Ljava/lang/String;)V", "getContact", "()Ljava/lang/String;", "setContact", "(Ljava/lang/String;)V", "getMessage", "setMessage", "getState", "()Lcom/razorpay/PhoneNumberHintHelper$PhoneNumberHintResponseStates;", "setState", "(Lcom/razorpay/PhoneNumberHintHelper$PhoneNumberHintResponseStates;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class o_$O$0$$$_$O0_o {
    private String contact;
    private String message;
    private o_$O$0$$$O$$$__o0Oo state;

    public o_$O$0$$$_$O0_o(o_$O$0$$$O$$$__o0Oo o__o_0___o_____o0oo, String str, String str2) {
        toMagicModuleMetaRepoModel.write(o__o_0___o_____o0oo, "");
        this.state = o__o_0___o_____o0oo;
        this.contact = str;
        this.message = str2;
    }

    public final o_$O$0$$$O$$$__o0Oo getState() {
        return this.state;
    }

    public final void setState(o_$O$0$$$O$$$__o0Oo o__o_0___o_____o0oo) {
        toMagicModuleMetaRepoModel.write(o__o_0___o_____o0oo, "");
        this.state = o__o_0___o_____o0oo;
    }

    public final String getContact() {
        return this.contact;
    }

    public final void setContact(String str) {
        this.contact = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public static /* synthetic */ o_$O$0$$$_$O0_o copy$default(o_$O$0$$$_$O0_o o__o_0_____o0_o, o_$O$0$$$O$$$__o0Oo o__o_0___o_____o0oo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            o__o_0___o_____o0oo = o__o_0_____o0_o.state;
        }
        if ((i & 2) != 0) {
            str = o__o_0_____o0_o.contact;
        }
        if ((i & 4) != 0) {
            str2 = o__o_0_____o0_o.message;
        }
        return o__o_0_____o0_o.copy(o__o_0___o_____o0oo, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final o_$O$0$$$O$$$__o0Oo getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContact() {
        return this.contact;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final o_$O$0$$$_$O0_o copy(o_$O$0$$$O$$$__o0Oo o__o_0___o_____o0oo, String str, String str2) {
        toMagicModuleMetaRepoModel.write(o__o_0___o_____o0oo, "");
        return new o_$O$0$$$_$O0_o(o__o_0___o_____o0oo, str, str2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o_$O$0$$$_$O0_o)) {
            return false;
        }
        o_$O$0$$$_$O0_o o__o_0_____o0_o = (o_$O$0$$$_$O0_o) other;
        return this.state == o__o_0_____o0_o.state && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contact, (Object) o__o_0_____o0_o.contact) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.message, (Object) o__o_0_____o0_o.message);
    }

    public final int hashCode() {
        int iHashCode = this.state.hashCode();
        String str = this.contact;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneNumberResponse(state=");
        sb.append(this.state);
        sb.append(", contact=");
        sb.append(this.contact);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(')');
        return sb.toString();
    }
}
