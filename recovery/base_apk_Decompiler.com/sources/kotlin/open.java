package kotlin;

import com.fasterxml.jackson.annotation.JsonValue;
import com.marrow.data.models.custommodule.CustomModule;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public enum open implements Serializable {
    INVISIBLE("invisible"),
    NORMAL(CustomModule.DEFAULT_MODULE_OWNER),
    COMPACT("compact");

    private final String read;

    open(String str) {
        this.read = str;
    }

    @Override // java.lang.Enum
    @JsonValue
    public final String toString() {
        return this.read;
    }
}
