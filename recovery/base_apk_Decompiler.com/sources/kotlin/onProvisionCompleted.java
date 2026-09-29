package kotlin;

import android.graphics.Color;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onProvisionCompleted<T extends Entry> extends DefaultDrmSessionExternalSyntheticLambda0<T> implements setKeyRequestParameters<T> {
    private int read;

    public onProvisionCompleted(List<T> list, String str) {
        super(list, str);
        this.read = Color.rgb(255, 187, 115);
    }

    @Override // kotlin.setKeyRequestParameters
    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }
}
