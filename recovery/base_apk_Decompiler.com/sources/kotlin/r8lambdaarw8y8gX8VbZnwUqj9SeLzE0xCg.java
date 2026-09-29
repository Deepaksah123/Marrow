package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/r8lambdaarw8y8gX8VbZnwUqj9SeLzE0xCg;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "read", "(Landroid/content/Context;)Ljava/lang/String;"}, k = 1, mv = {1, 4, 0})
public final class r8lambdaarw8y8gX8VbZnwUqj9SeLzE0xCg {
    public static final r8lambdaarw8y8gX8VbZnwUqj9SeLzE0xCg INSTANCE = new r8lambdaarw8y8gX8VbZnwUqj9SeLzE0xCg();

    private r8lambdaarw8y8gX8VbZnwUqj9SeLzE0xCg() {
    }

    @getMagicModuleMeta
    public static final String read(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            Signature[] signatureArr = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                sb.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            String string = sb.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
