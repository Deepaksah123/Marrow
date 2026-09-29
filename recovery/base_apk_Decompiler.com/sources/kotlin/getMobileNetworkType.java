package kotlin;

import com.marrow2.data.lesson.remote.model.CalendarDayMatrix;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getMobileNetworkType {
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final List<List<CalendarDayMatrix>> RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    /* JADX WARN: Multi-variable type inference failed */
    public getMobileNetworkType(List<? extends List<CalendarDayMatrix>> list, int i, int i2, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = i;
        this.write = i2;
        this.read = i3;
        this.IconCompatParcelizer = i4;
    }

    public final List<List<CalendarDayMatrix>> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final int write() {
        return this.read;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMobileNetworkType)) {
            return false;
        }
        getMobileNetworkType getmobilenetworktype = (getMobileNetworkType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getmobilenetworktype.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == getmobilenetworktype.AudioAttributesCompatParcelizer && this.write == getmobilenetworktype.write && this.read == getmobilenetworktype.read && this.IconCompatParcelizer == getmobilenetworktype.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        List<List<CalendarDayMatrix>> list = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.write;
        int i3 = this.read;
        int i4 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("QBankStatsModel(calendarDayMatrix=");
        sb.append(list);
        sb.append(", nextQueryMonth=");
        sb.append(i);
        sb.append(", previousQueryMonth=");
        sb.append(i2);
        sb.append(", totalSolvedModule=");
        sb.append(i3);
        sb.append(", totalModule=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
