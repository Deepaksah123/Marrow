package kotlin;

import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public enum IcyDataSourceListener implements Serializable {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape");

    private final String IconCompatParcelizer;

    IcyDataSourceListener(String str) {
        this.IconCompatParcelizer = str;
    }

    @Override // java.lang.Enum
    @JsonValue
    public final String toString() {
        return this.IconCompatParcelizer;
    }
}
