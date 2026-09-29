package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppRatingThreshHoldRemoteModel {
    private final getCreatedOnDateMs<Boolean> AudioAttributesCompatParcelizer;
    private final getCreatedOnDateMs<Boolean> read;
    private final getCreatedOnDateMs<getShowPopup> write;

    public InAppRatingThreshHoldRemoteModel(getCreatedOnDateMs<Boolean> getcreatedondatems, getCreatedOnDateMs<Boolean> getcreatedondatems2, getCreatedOnDateMs<getShowPopup> getcreatedondatems3) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems3, "");
        this.read = getcreatedondatems;
        this.AudioAttributesCompatParcelizer = getcreatedondatems2;
        this.write = getcreatedondatems3;
    }

    public final getCreatedOnDateMs<Boolean> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final getCreatedOnDateMs<Boolean> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getCreatedOnDateMs<getShowPopup> write() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppRatingThreshHoldRemoteModel)) {
            return false;
        }
        InAppRatingThreshHoldRemoteModel inAppRatingThreshHoldRemoteModel = (InAppRatingThreshHoldRemoteModel) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, inAppRatingThreshHoldRemoteModel.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, inAppRatingThreshHoldRemoteModel.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, inAppRatingThreshHoldRemoteModel.write);
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        getCreatedOnDateMs<Boolean> getcreatedondatems = this.read;
        getCreatedOnDateMs<Boolean> getcreatedondatems2 = this.AudioAttributesCompatParcelizer;
        getCreatedOnDateMs<getShowPopup> getcreatedondatems3 = this.write;
        StringBuilder sb = new StringBuilder("PayloadEncryptionConfig(isRemoteConfigEnabled=");
        sb.append(getcreatedondatems);
        sb.append(", isKillSwitchActive=");
        sb.append(getcreatedondatems2);
        sb.append(", onKillSwitchActivated=");
        sb.append(getcreatedondatems3);
        sb.append(")");
        return sb.toString();
    }
}
