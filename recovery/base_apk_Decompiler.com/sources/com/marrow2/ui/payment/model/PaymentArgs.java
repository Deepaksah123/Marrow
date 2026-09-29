package com.marrow2.ui.payment.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0010\u0010\u001aR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\u001aR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001e\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b$\u0010)R\u001c\u0010,\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b \u0010+"}, d2 = {"Lcom/marrow2/ui/payment/model/PaymentArgs;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "", "p3", "", "p4", "Lcom/marrow2/ui/payment/model/DeliveryAddressModel;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Lcom/marrow2/ui/payment/model/DeliveryAddressModel;)V", "Landroid/content/Intent;", "", "RemoteActionCompatParcelizer", "(Landroid/content/Intent;)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "writeToParcel", "(Landroid/os/Parcel;I)V", "write", "Ljava/lang/String;", "IconCompatParcelizer", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "Lcom/marrow2/ui/payment/model/DeliveryAddressModel;", "()Lcom/marrow2/ui/payment/model/DeliveryAddressModel;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentArgs implements Parcelable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PaymentArgs> CREATOR = new read();

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Integer write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final DeliveryAddressModel AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Double RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public static final class read implements Parcelable.Creator<PaymentArgs> {
        private static PaymentArgs RemoteActionCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new PaymentArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? DeliveryAddressModel.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PaymentArgs createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        private static PaymentArgs[] AudioAttributesCompatParcelizer(int i) {
            return new PaymentArgs[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PaymentArgs[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PaymentArgs(String str, String str2, String str3, Integer num, Double d, DeliveryAddressModel deliveryAddressModel) {
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.write = num;
        this.RemoteActionCompatParcelizer = d;
        this.AudioAttributesImplApi26Parcelizer = deliveryAddressModel;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Integer getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Double getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final DeliveryAddressModel getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void RemoteActionCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.putExtra("planId", this.IconCompatParcelizer);
        p0.putExtra("planGroupId", this.read);
        p0.putExtra("planTitle", this.AudioAttributesCompatParcelizer);
        p0.putExtra("planSubscriptionPeriod", this.write);
        p0.putExtra("amount", this.RemoteActionCompatParcelizer);
        p0.putExtra("deliveryAddress", this.AudioAttributesImplApi26Parcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PaymentArgs)) {
            return false;
        }
        PaymentArgs paymentArgs = (PaymentArgs) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) paymentArgs.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) paymentArgs.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) paymentArgs.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, paymentArgs.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, paymentArgs.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, paymentArgs.AudioAttributesImplApi26Parcelizer);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.AudioAttributesCompatParcelizer;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.write;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Double d = this.RemoteActionCompatParcelizer;
        int iHashCode5 = d == null ? 0 : d.hashCode();
        DeliveryAddressModel deliveryAddressModel = this.AudioAttributesImplApi26Parcelizer;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (deliveryAddressModel != null ? deliveryAddressModel.hashCode() : 0);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.read;
        String str3 = this.AudioAttributesCompatParcelizer;
        Integer num = this.write;
        Double d = this.RemoteActionCompatParcelizer;
        DeliveryAddressModel deliveryAddressModel = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("PaymentArgs(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str3);
        sb.append(", write=");
        sb.append(num);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(d);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(deliveryAddressModel);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.IconCompatParcelizer);
        p0.writeString(this.read);
        p0.writeString(this.AudioAttributesCompatParcelizer);
        Integer num = this.write;
        if (num == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(num.intValue());
        }
        Double d = this.RemoteActionCompatParcelizer;
        if (d == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d.doubleValue());
        }
        DeliveryAddressModel deliveryAddressModel = this.AudioAttributesImplApi26Parcelizer;
        if (deliveryAddressModel == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            deliveryAddressModel.writeToParcel(p0, p1);
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.payment.model.PaymentArgs$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow2/ui/payment/model/PaymentArgs$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/POJOPropertyBuilder5;", "p0", "Lcom/marrow2/ui/payment/model/PaymentArgs;", "AudioAttributesCompatParcelizer", "(Lo/POJOPropertyBuilder5;)Lcom/marrow2/ui/payment/model/PaymentArgs;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static PaymentArgs AudioAttributesCompatParcelizer(POJOPropertyBuilder5 p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new PaymentArgs((String) p0.write("planId"), (String) p0.write("planGroupId"), (String) p0.write("planTitle"), (Integer) p0.write("planSubscriptionPeriod"), (Double) p0.write("amount"), (DeliveryAddressModel) p0.write("deliveryAddress"));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
