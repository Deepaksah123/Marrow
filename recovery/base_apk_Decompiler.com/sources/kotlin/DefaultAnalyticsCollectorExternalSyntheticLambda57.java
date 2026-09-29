package kotlin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import in.juspay.hyper.constants.LogCategory;
import java.util.HashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/FacebookSignatureValidator;", "", "()V", "FBF_HASH", "", "FBI_HASH", "FBL_HASH", "FBR2_HASH", "FBR_HASH", "MSR_HASH", "validAppSignatureHashes", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "validateSignature", "", LogCategory.CONTEXT, "Landroid/content/Context;", "packageName", "facebook-core_release"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda57 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda57 IconCompatParcelizer = new DefaultAnalyticsCollectorExternalSyntheticLambda57();
    private static final HashSet<String> read = getKycMessage.read((Object[]) new String[]{"8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3"});

    private DefaultAnalyticsCollectorExternalSyntheticLambda57() {
    }

    @getMagicModuleMeta
    public static final boolean RemoteActionCompatParcelizer(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str2, "generic") && (i & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo.signatures != null) {
                Signature[] signatureArr = packageInfo.signatures;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(signatureArr, "");
                if (signatureArr.length != 0) {
                    Signature[] signatureArr2 = packageInfo.signatures;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(signatureArr2, "");
                    for (Signature signature : signatureArr2) {
                        HashSet<String> hashSet = read;
                        byte[] byteArray = signature.toByteArray();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(byteArray, "");
                        if (!IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(hashSet, DefaultAnalyticsCollectorMediaPeriodQueueTracker.RemoteActionCompatParcelizer(byteArray))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
