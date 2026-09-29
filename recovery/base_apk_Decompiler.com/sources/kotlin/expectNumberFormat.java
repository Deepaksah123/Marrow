package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class expectNumberFormat {
    public final int IconCompatParcelizer = 0;
    public final float write = BitmapDescriptorFactory.HUE_RED;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        expectNumberFormat expectnumberformat = (expectNumberFormat) obj;
        return this.IconCompatParcelizer == expectnumberformat.IconCompatParcelizer && Float.compare(expectnumberformat.write, this.write) == 0;
    }

    public final int hashCode() {
        return ((this.IconCompatParcelizer + 527) * 31) + Float.floatToIntBits(this.write);
    }
}
