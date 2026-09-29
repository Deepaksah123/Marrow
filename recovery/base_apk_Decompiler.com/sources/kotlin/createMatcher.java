package kotlin;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/createMatcher;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class createMatcher {
    public static final createMatcher INSTANCE = new createMatcher();

    private createMatcher() {
    }

    public final int RemoteActionCompatParcelizer(Context p0) {
        if (Build.VERSION.SDK_INT >= 31) {
            return createParserWithMatch.INSTANCE.AudioAttributesCompatParcelizer(p0);
        }
        return 0;
    }
}
