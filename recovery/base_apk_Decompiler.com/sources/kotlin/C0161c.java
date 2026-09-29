package kotlin;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.queryInstrumentation;

/* JADX INFO: renamed from: o.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\f"}, d2 = {"Lo/c;", "Lo/setComponentEnabledSetting;", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/queryIntentServices;", "p1", "Lo/getSystemSharedLibraryNames;", "read", "(Landroid/content/Context;Lo/queryIntentServices;)Lo/getSystemSharedLibraryNames;", "Landroid/app/Activity;", "(Landroid/app/Activity;Lo/queryIntentServices;)Lo/getSystemSharedLibraryNames;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0161c implements setComponentEnabledSetting {
    public static final C0161c INSTANCE = new C0161c();

    private C0161c() {
    }

    @Override // kotlin.setComponentEnabledSetting
    public final getSystemSharedLibraryNames read(Context p0, queryIntentServices p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Context contextIconCompatParcelizer = queryIntentContentProviders.INSTANCE.IconCompatParcelizer(p0);
        if (contextIconCompatParcelizer instanceof Activity) {
            return read((Activity) contextIconCompatParcelizer, p1);
        }
        if ((contextIconCompatParcelizer instanceof InputMethodService) || (contextIconCompatParcelizer instanceof Application)) {
            Object systemService = p0.getSystemService("window");
            toMagicModuleMetaRepoModel.read(systemService, "");
            resolveActivity resolveactivity = resolveActivity.INSTANCE;
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultDisplay, "");
            Point pointAudioAttributesCompatParcelizer = resolveActivity.AudioAttributesCompatParcelizer(defaultDisplay);
            return new getSystemSharedLibraryNames(new Rect(0, 0, pointAudioAttributesCompatParcelizer.x, pointAudioAttributesCompatParcelizer.y), p1.write(p0));
        }
        throw new IllegalArgumentException("Must provide a UiContext or Application Context");
    }

    public final getSystemSharedLibraryNames read(Activity p0, queryIntentServices p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        queryInstrumentation.Companion companion = queryInstrumentation.INSTANCE;
        return new getSystemSharedLibraryNames(new getPackageGids(queryInstrumentation.Companion.AudioAttributesCompatParcelizer().read(p0)), p1.write(p0));
    }
}
