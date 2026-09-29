package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/marrow2/ui/notespurchase/landing/NotesPurchaseLandingUiState;", "", "carouselImageUrls", "", "", "isPlanPurchaseAllowed", "", "planBasePriceText", "planDiscountedPriceText", "planIneligibilityMessage", "showOrderTracking", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCarouselImageUrls", "()Ljava/util/List;", "()Z", "getPlanBasePriceText", "()Ljava/lang/String;", "getPlanDiscountedPriceText", "getPlanIneligibilityMessage", "getShowOrderTracking", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getMaxMethodInvocationsInBatch {
    private final List<String> AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final boolean MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final boolean write;

    private getMaxMethodInvocationsInBatch(List<String> list, boolean z, String str, String str2, String str3, boolean z2) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = list;
        this.write = z;
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompatItemReceiver = z2;
    }

    public /* synthetic */ getMaxMethodInvocationsInBatch(List list, boolean z, String str, String str2, String str3, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null, (i & 32) == 0 ? z2 : false);
    }

    public final List<String> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public getMaxMethodInvocationsInBatch() {
        this(null, false, null, null, null, false, 63, null);
    }

    public static /* synthetic */ getMaxMethodInvocationsInBatch IconCompatParcelizer(getMaxMethodInvocationsInBatch getmaxmethodinvocationsinbatch, List list, boolean z, String str, String str2, String str3, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = getmaxmethodinvocationsinbatch.AudioAttributesCompatParcelizer;
        }
        if ((i & 2) != 0) {
            z = getmaxmethodinvocationsinbatch.write;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str = getmaxmethodinvocationsinbatch.read;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = getmaxmethodinvocationsinbatch.RemoteActionCompatParcelizer;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = getmaxmethodinvocationsinbatch.IconCompatParcelizer;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            z2 = getmaxmethodinvocationsinbatch.MediaBrowserCompatItemReceiver;
        }
        return AudioAttributesCompatParcelizer(list, z3, str4, str5, str6, z2);
    }

    private static getMaxMethodInvocationsInBatch AudioAttributesCompatParcelizer(List<String> list, boolean z, String str, String str2, String str3, boolean z2) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new getMaxMethodInvocationsInBatch(list, z, str, str2, str3, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getMaxMethodInvocationsInBatch)) {
            return false;
        }
        getMaxMethodInvocationsInBatch getmaxmethodinvocationsinbatch = (getMaxMethodInvocationsInBatch) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getmaxmethodinvocationsinbatch.AudioAttributesCompatParcelizer) && this.write == getmaxmethodinvocationsinbatch.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getmaxmethodinvocationsinbatch.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getmaxmethodinvocationsinbatch.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getmaxmethodinvocationsinbatch.IconCompatParcelizer) && this.MediaBrowserCompatItemReceiver == getmaxmethodinvocationsinbatch.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode2 = Boolean.hashCode(this.write);
        String str = this.read;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.IconCompatParcelizer;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver);
    }

    public final String toString() {
        List<String> list = this.AudioAttributesCompatParcelizer;
        boolean z = this.write;
        String str = this.read;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.IconCompatParcelizer;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("NotesPurchaseLandingUiState(carouselImageUrls=");
        sb.append(list);
        sb.append(", isPlanPurchaseAllowed=");
        sb.append(z);
        sb.append(", planBasePriceText=");
        sb.append(str);
        sb.append(", planDiscountedPriceText=");
        sb.append(str2);
        sb.append(", planIneligibilityMessage=");
        sb.append(str3);
        sb.append(", showOrderTracking=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
