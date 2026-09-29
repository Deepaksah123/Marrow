package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class parseH265SpsNalUnitPayload {
    private final Integer AudioAttributesCompatParcelizer;
    private final Integer IconCompatParcelizer;

    public parseH265SpsNalUnitPayload(Integer num, Integer num2) {
        this.AudioAttributesCompatParcelizer = num;
        this.IconCompatParcelizer = num2;
    }

    public final Integer read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseH265SpsNalUnitPayload)) {
            return false;
        }
        parseH265SpsNalUnitPayload parseh265spsnalunitpayload = (parseH265SpsNalUnitPayload) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, parseh265spsnalunitpayload.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, parseh265spsnalunitpayload.IconCompatParcelizer);
    }

    public final int hashCode() {
        Integer num = this.AudioAttributesCompatParcelizer;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.IconCompatParcelizer;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.AudioAttributesCompatParcelizer;
        Integer num2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("InAppRatingThresholdUcModel(qbankThreshold=");
        sb.append(num);
        sb.append(", videoThreshold=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }
}
