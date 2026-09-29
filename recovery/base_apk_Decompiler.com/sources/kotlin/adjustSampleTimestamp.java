package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class adjustSampleTimestamp {
    private final getLastAdjustedTimestampUs AudioAttributesCompatParcelizer;
    private final List<getFirstSampleTimestampUs> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public adjustSampleTimestamp(getLastAdjustedTimestampUs getlastadjustedtimestampus, List<? extends getFirstSampleTimestampUs> list) {
        toMagicModuleMetaRepoModel.write(getlastadjustedtimestampus, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = getlastadjustedtimestampus;
        this.IconCompatParcelizer = list;
    }

    public final getLastAdjustedTimestampUs AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<getFirstSampleTimestampUs> read() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adjustSampleTimestamp)) {
            return false;
        }
        adjustSampleTimestamp adjustsampletimestamp = (adjustSampleTimestamp) obj;
        return this.AudioAttributesCompatParcelizer == adjustsampletimestamp.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, adjustsampletimestamp.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        getLastAdjustedTimestampUs getlastadjustedtimestampus = this.AudioAttributesCompatParcelizer;
        List<getFirstSampleTimestampUs> list = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("SearchedItemResults(type=");
        sb.append(getlastadjustedtimestampus);
        sb.append(", list=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
