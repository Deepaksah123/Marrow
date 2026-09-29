package kotlin;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/_handleResolvable;", "Lo/getDateFormat;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "", "IconCompatParcelizer", "(Ljava/lang/String;)V", "read", "Landroid/content/Context;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _handleResolvable implements getDateFormat {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Context write;

    public _handleResolvable(Context context) {
        this.write = context;
    }

    @Override // kotlin.getDateFormat
    public final void IconCompatParcelizer(String p0) {
        try {
            this.write.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p0)));
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder("Can't open ");
            sb.append(p0);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }
}
