package kotlin;

import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public enum LoadEventInfo implements Serializable {
    DARK("dark"),
    LIGHT("light"),
    CONTRAST("contrast");

    private final String read;

    LoadEventInfo(String str) {
        this.read = str;
    }

    @Override // java.lang.Enum
    @JsonValue
    public final String toString() {
        return this.read;
    }
}
