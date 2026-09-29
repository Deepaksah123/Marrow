package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzm();
    CommonWalletObject zza;
    String zzb;
    String zzc;

    @Deprecated
    String zzd;
    long zze;
    String zzf;
    long zzg;
    String zzh;

    GiftCardWalletObject() {
        this.zza = CommonWalletObject.zzb().zzz();
    }

    public static Builder newBuilder() {
        return new GiftCardWalletObject().new Builder(null);
    }

    public final String getBarcodeAlternateText() {
        return this.zza.zzd();
    }

    @Deprecated
    public final String getBarcodeLabel() {
        return this.zza.zze();
    }

    public final String getBarcodeType() {
        return this.zza.zzf();
    }

    public final String getBarcodeValue() {
        return this.zza.zzg();
    }

    public final String getClassId() {
        return this.zza.zzh();
    }

    public final String getId() {
        return this.zza.zzi();
    }

    public final ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zza.zzn();
    }

    @Deprecated
    public final String getInfoModuleDataHexBackgroundColor() {
        return this.zza.zzj();
    }

    @Deprecated
    public final String getInfoModuleDataHexFontColor() {
        return this.zza.zzk();
    }

    public final ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zza.zzo();
    }

    public final boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zza.zzt();
    }

    public final String getIssuerName() {
        return this.zza.zzl();
    }

    public final ArrayList<UriData> getLinksModuleDataUris() {
        return this.zza.zzp();
    }

    public final ArrayList<LatLng> getLocations() {
        return this.zza.zzq();
    }

    public final ArrayList<WalletObjectMessage> getMessages() {
        return this.zza.zzr();
    }

    public final int getState() {
        return this.zza.zza();
    }

    public final ArrayList<TextModuleData> getTextModulesData() {
        return this.zza.zzs();
    }

    public final String getTitle() {
        return this.zza.zzm();
    }

    public final TimeInterval getValidTimeInterval() {
        return this.zza.zzc();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        CommonWalletObject.zzb();
        this.zza = commonWalletObject;
        this.zzb = str;
        this.zzc = str2;
        this.zze = j;
        this.zzf = str4;
        this.zzg = j2;
        this.zzh = str5;
        this.zzd = str3;
    }

    public final class Builder {
        private com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();

        /* synthetic */ Builder(zzl zzlVar) {
        }

        public final Builder addImageModuleDataMainImageUri(UriData uriData) {
            this.zzb.zza(uriData);
            return this;
        }

        public final Builder addImageModuleDataMainImageUris(Collection<UriData> collection) {
            this.zzb.zzb(collection);
            return this;
        }

        public final Builder addInfoModuleDataLabelValueRow(LabelValueRow labelValueRow) {
            this.zzb.zzc(labelValueRow);
            return this;
        }

        public final Builder addInfoModuleDataLabelValueRows(Collection<LabelValueRow> collection) {
            this.zzb.zzd(collection);
            return this;
        }

        public final Builder addLinksModuleDataUri(UriData uriData) {
            this.zzb.zze(uriData);
            return this;
        }

        public final Builder addLinksModuleDataUris(Collection<UriData> collection) {
            this.zzb.zzf(collection);
            return this;
        }

        public final Builder addLocation(LatLng latLng) {
            this.zzb.zzg(latLng);
            return this;
        }

        public final Builder addLocations(Collection<LatLng> collection) {
            this.zzb.zzh(collection);
            return this;
        }

        public final Builder addMessage(WalletObjectMessage walletObjectMessage) {
            this.zzb.zzi(walletObjectMessage);
            return this;
        }

        public final Builder addMessages(Collection<WalletObjectMessage> collection) {
            this.zzb.zzj(collection);
            return this;
        }

        public final Builder addTextModuleData(TextModuleData textModuleData) {
            this.zzb.zzk(textModuleData);
            return this;
        }

        public final Builder addTextModulesData(Collection<TextModuleData> collection) {
            this.zzb.zzl(collection);
            return this;
        }

        public final GiftCardWalletObject build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zzb), "Card number is required.");
            GiftCardWalletObject.this.zza = this.zzb.zzz();
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zza.zzm()), "Card name is required.");
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.zza.zzl()), "Card issuer name is required.");
            return GiftCardWalletObject.this;
        }

        public final Builder setBarcodeAlternateText(String str) {
            this.zzb.zzm(str);
            return this;
        }

        @Deprecated
        public final Builder setBarcodeLabel(String str) {
            this.zzb.zzn(str);
            return this;
        }

        public final Builder setBarcodeType(String str) {
            this.zzb.zzo(str);
            return this;
        }

        public final Builder setBarcodeValue(String str) {
            this.zzb.zzp(str);
            return this;
        }

        public final Builder setClassId(String str) {
            this.zzb.zzq(str);
            return this;
        }

        public final Builder setId(String str) {
            this.zzb.zzr(str);
            return this;
        }

        @Deprecated
        public final Builder setInfoModuleDataHexBackgroundColor(String str) {
            this.zzb.zzs(str);
            return this;
        }

        @Deprecated
        public final Builder setInfoModuleDataHexFontColor(String str) {
            this.zzb.zzt(str);
            return this;
        }

        public final Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.zzb.zzu(z);
            return this;
        }

        public final Builder setIssuerName(String str) {
            this.zzb.zzv(str);
            return this;
        }

        public final Builder setState(int i) {
            this.zzb.zzx(i);
            return this;
        }

        public final Builder setTitle(String str) {
            this.zzb.zzw(str);
            return this;
        }

        public final Builder setValidTimeInterval(TimeInterval timeInterval) {
            this.zzb.zzy(timeInterval);
            return this;
        }

        public final Builder setBalanceCurrencyCode(String str) {
            GiftCardWalletObject.this.zzf = str;
            return this;
        }

        public final Builder setBalanceMicros(long j) {
            GiftCardWalletObject.this.zze = j;
            return this;
        }

        public final Builder setBalanceUpdateTime(long j) {
            GiftCardWalletObject.this.zzg = j;
            return this;
        }

        @Deprecated
        public final Builder setCardIdentifier(String str) {
            GiftCardWalletObject.this.zzd = str;
            return this;
        }

        public final Builder setCardNumber(String str) {
            GiftCardWalletObject.this.zzb = str;
            return this;
        }

        public final Builder setEventNumber(String str) {
            GiftCardWalletObject.this.zzh = str;
            return this;
        }

        public final Builder setPin(String str) {
            GiftCardWalletObject.this.zzc = str;
            return this;
        }
    }

    public final String getBalanceCurrencyCode() {
        return this.zzf;
    }

    public final long getBalanceMicros() {
        return this.zze;
    }

    public final long getBalanceUpdateTime() {
        return this.zzg;
    }

    @Deprecated
    public final String getCardIdentifier() {
        return this.zzd;
    }

    public final String getCardNumber() {
        return this.zzb;
    }

    public final String getEventNumber() {
        return this.zzh;
    }

    public final String getPin() {
        return this.zzc;
    }
}
