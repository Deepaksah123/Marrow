package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setVideoSurface implements setDeviceVolume<Uri, Uri> {
    private final Context IconCompatParcelizer;

    public setVideoSurface(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = context;
    }

    @Override // kotlin.setDeviceVolume
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(Uri uri) {
        return AudioAttributesCompatParcelizer(uri);
    }

    private static boolean AudioAttributesCompatParcelizer(Uri uri) {
        String authority;
        toMagicModuleMetaRepoModel.write(uri, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) uri.getScheme(), (Object) "android.resource") || (authority = uri.getAuthority()) == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) authority)) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pathSegments, "");
        return pathSegments.size() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDeviceVolume
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Uri write(Uri uri) throws PackageManager.NameNotFoundException {
        toMagicModuleMetaRepoModel.write(uri, "");
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = this.IconCompatParcelizer.getPackageManager().getResourcesForApplication(authority);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resourcesForApplication, "");
        List<String> pathSegments = uri.getPathSegments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pathSegments, "");
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Invalid android.resource URI: ", (Object) uri).toString());
        }
        StringBuilder sb = new StringBuilder("android.resource://");
        sb.append(authority);
        sb.append('/');
        sb.append(identifier);
        Uri uri2 = Uri.parse(sb.toString());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri2, "");
        return uri2;
    }
}
