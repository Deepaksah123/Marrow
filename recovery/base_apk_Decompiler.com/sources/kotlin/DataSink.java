package kotlin;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.marrow.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0012J1\u0010\u0014\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/DataSink;", "", "<init>", "()V", "Landroid/content/Context;", "", "p0", "p1", "", "write", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/net/Uri;", "p2", "Landroid/content/Intent;", "read", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;)V", "p3", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DataSink {
    public static final DataSink INSTANCE = new DataSink();

    private DataSink() {
    }

    @getMagicModuleMeta
    public static final void write(Context context, String str, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        context.startActivity(Intent.createChooser(read(str, str2), "Share with "));
    }

    private static Intent read(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        return intent;
    }

    private static Intent IconCompatParcelizer(String p0, String p1, String p2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{p0});
        intent.putExtra("android.intent.extra.SUBJECT", p1);
        intent.putExtra("android.intent.extra.TEXT", p2);
        return intent;
    }

    private static void IconCompatParcelizer(Context p0, Intent p1) {
        try {
            p0.startActivity(p1);
        } catch (ActivityNotFoundException unused) {
            p0.startActivity(Intent.createChooser(p1, "Contact through"));
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Context p0, String p1, String p2, String p3) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        Intent intentIconCompatParcelizer = IconCompatParcelizer(p1, p2, p3);
        if (p0 != null) {
            intentIconCompatParcelizer.setPackage(p0.getString(R.string.package_email));
            IconCompatParcelizer(p0, intentIconCompatParcelizer);
        }
    }
}
