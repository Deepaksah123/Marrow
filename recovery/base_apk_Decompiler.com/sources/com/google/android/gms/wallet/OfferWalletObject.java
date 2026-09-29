package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzu();
    String zza;
    String zzb;
    CommonWalletObject zzc;
    private final int zzd;

    public final class Builder {
        private com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();

        /* synthetic */ Builder(zzt zztVar) {
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

        public final OfferWalletObject build() {
            OfferWalletObject.this.zzc = this.zzb.zzz();
            return OfferWalletObject.this;
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
            OfferWalletObject.this.zza = str;
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

        public final Builder setRedemptionCode(String str) {
            OfferWalletObject.this.zzb = str;
            return this;
        }
    }

    OfferWalletObject() {
        this.zzd = 3;
    }

    public static Builder newBuilder() {
        return new OfferWalletObject().new Builder(null);
    }

    public final String getBarcodeAlternateText() {
        return this.zzc.zzd();
    }

    @Deprecated
    public final String getBarcodeLabel() {
        return this.zzc.zze();
    }

    public final String getBarcodeType() {
        return this.zzc.zzf();
    }

    public final String getBarcodeValue() {
        return this.zzc.zzg();
    }

    public final String getClassId() {
        return this.zzc.zzh();
    }

    public final String getId() {
        return this.zzc.zzi();
    }

    public final ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzc.zzn();
    }

    @Deprecated
    public final String getInfoModuleDataHexBackgroundColor() {
        return this.zzc.zzj();
    }

    @Deprecated
    public final String getInfoModuleDataHexFontColor() {
        return this.zzc.zzk();
    }

    public final ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzc.zzo();
    }

    public final boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzc.zzt();
    }

    public final String getIssuerName() {
        return this.zzc.zzl();
    }

    public final ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzc.zzp();
    }

    public final ArrayList<LatLng> getLocations() {
        return this.zzc.zzq();
    }

    public final ArrayList<WalletObjectMessage> getMessages() {
        return this.zzc.zzr();
    }

    public final int getState() {
        return this.zzc.zza();
    }

    public final ArrayList<TextModuleData> getTextModulesData() {
        return this.zzc.zzs();
    }

    public final String getTitle() {
        return this.zzc.zzm();
    }

    public final TimeInterval getValidTimeInterval() {
        return this.zzc.zzc();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.zzd = i;
        this.zzb = str2;
        if (i >= 3) {
            this.zzc = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.zzb zzbVarZzb = CommonWalletObject.zzb();
        zzbVarZzb.zzr(str);
        this.zzc = zzbVarZzb.zzz();
    }

    public final String getRedemptionCode() {
        return this.zzb;
    }

    public final int getVersionCode() {
        return this.zzd;
    }
}
