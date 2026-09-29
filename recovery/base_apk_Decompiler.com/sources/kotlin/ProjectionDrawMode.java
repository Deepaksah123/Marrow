package kotlin;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.marrow.R;
import kotlin.ResolvableApiException;

/* JADX INFO: loaded from: classes3.dex */
public final class ProjectionDrawMode {
    public static final void IconCompatParcelizer(Activity activity, String str) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
            activity.startActivity(ResolvableApiException.Companion.read(activity, new canceledPendingResult(str, null, null, 6, null)));
        }
    }

    public static final void AudioAttributesCompatParcelizer(Fragment fragment, String str) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            fragment.startActivity(intent);
        } catch (Exception unused) {
            String string = fragment.getString(R.string.something_went_wrong);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(fragment, string, 0);
        }
    }
}
