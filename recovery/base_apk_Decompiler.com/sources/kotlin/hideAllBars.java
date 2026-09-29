package kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/hideAllBars;", "", "<init>", "()V", "", "finalData", "Ljava/lang/String;", "read", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hideAllBars {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    @JsonProperty("final_data")
    private String finalData = "";

    public final String read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
        write = i3 % 128;
        int i4 = i3 % 2;
        String str = this.finalData;
        if (i4 == 0) {
            int i5 = 40 / 0;
        }
        return str;
    }
}
