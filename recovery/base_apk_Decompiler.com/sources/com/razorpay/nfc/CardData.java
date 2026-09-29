package com.razorpay.nfc;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/razorpay/nfc/CardData;", "", "pan", "", "expiry", "(Ljava/lang/String;Ljava/lang/String;)V", "getExpiry", "()Ljava/lang/String;", "getPan", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class CardData {
    private final String __l1_;
    private final String l$1_I$l$;

    public CardData(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.l$1_I$l$ = str;
        this.__l1_ = str2;
    }

    public final String getExpiry() {
        return this.__l1_;
    }

    public final String getPan() {
        return this.l$1_I$l$;
    }

    public static /* synthetic */ CardData copy$default(CardData cardData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardData.l$1_I$l$;
        }
        if ((i & 2) != 0) {
            str2 = cardData.__l1_;
        }
        return cardData.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getL$1_I$l$() {
        return this.l$1_I$l$;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String get__l1_() {
        return this.__l1_;
    }

    public final CardData copy(String pan, String expiry) {
        toMagicModuleMetaRepoModel.write(pan, "");
        return new CardData(pan, expiry);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardData)) {
            return false;
        }
        CardData cardData = (CardData) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.l$1_I$l$, (Object) cardData.l$1_I$l$) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.__l1_, (Object) cardData.__l1_);
    }

    public final int hashCode() {
        int iHashCode = this.l$1_I$l$.hashCode();
        String str = this.__l1_;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardData(pan=");
        sb.append(this.l$1_I$l$);
        sb.append(", expiry=");
        sb.append(this.__l1_);
        sb.append(')');
        return sb.toString();
    }
}
