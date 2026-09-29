package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setTotalDiscCount implements IllegalSeekPositionException<Uri, Drawable> {
    public static final isRated<Resources.Theme> IconCompatParcelizer = isRated.write("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    private final Context write;

    @Override // kotlin.IllegalSeekPositionException
    public final /* bridge */ /* synthetic */ setMimeType<Drawable> AudioAttributesCompatParcelizer(Uri uri, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return AudioAttributesCompatParcelizer(uri, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    @Override // kotlin.IllegalSeekPositionException
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(Uri uri, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return read(uri);
    }

    public setTotalDiscCount(Context context) {
        this.write = context.getApplicationContext();
    }

    private static boolean read(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final setMimeType<Drawable> AudioAttributesCompatParcelizer(Uri uri, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        Drawable drawableIconCompatParcelizer;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            StringBuilder sb = new StringBuilder("Package name for ");
            sb.append(uri);
            sb.append(" is null or empty");
            throw new IllegalStateException(sb.toString());
        }
        Context contextAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(uri, authority);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, uri);
        Resources.Theme theme = ((String) moveMediaSource.AudioAttributesCompatParcelizer(authority)).equals(this.write.getPackageName()) ? (Resources.Theme) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(IconCompatParcelizer) : null;
        if (theme == null) {
            drawableIconCompatParcelizer = setReleaseMonth.IconCompatParcelizer(this.write, contextAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer);
        } else {
            drawableIconCompatParcelizer = setReleaseMonth.read(this.write, iAudioAttributesCompatParcelizer, theme);
        }
        return setTrackNumber.read(drawableIconCompatParcelizer);
    }

    private Context AudioAttributesCompatParcelizer(Uri uri, String str) {
        if (str.equals(this.write.getPackageName())) {
            return this.write;
        }
        try {
            return this.write.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.write.getPackageName())) {
                return this.write;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(uri)), e);
        }
    }

    private static int AudioAttributesCompatParcelizer(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return IconCompatParcelizer(context, uri);
        }
        if (pathSegments.size() == 1) {
            return RemoteActionCompatParcelizer(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(uri)));
    }

    private static int IconCompatParcelizer(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, LogSubCategory.LifeCycle.ANDROID);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(uri)));
    }

    private static int RemoteActionCompatParcelizer(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(uri)), e);
        }
    }
}
