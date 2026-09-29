package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.size.Size;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/getDeviceInfo;", "Lo/ExoPlayerBuilderExternalSyntheticLambda9;", "Landroid/net/Uri;", "Landroid/content/Context;", "p0", "Lo/ExoPlayerBuilderExternalSyntheticLambda19;", "p1", "<init>", "(Landroid/content/Context;Lo/ExoPlayerBuilderExternalSyntheticLambda19;)V", "Lo/setDeviceVolumeControlEnabled;", "Lcoil/size/Size;", "p2", "Lo/ExoPlayerBuilderExternalSyntheticLambda4;", "p3", "Lo/ExoPlayerDeviceComponent;", "write", "(Landroid/net/Uri;Lcoil/size/Size;Lo/ExoPlayerBuilderExternalSyntheticLambda4;)Ljava/lang/Object;", "", "IconCompatParcelizer", "(Landroid/net/Uri;)Z", "", "AudioAttributesCompatParcelizer", "(Landroid/net/Uri;)Ljava/lang/String;", "", "(Landroid/net/Uri;)Ljava/lang/Void;", "read", "Landroid/content/Context;", "Lo/ExoPlayerBuilderExternalSyntheticLambda19;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getDeviceInfo implements ExoPlayerBuilderExternalSyntheticLambda9<Uri> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Context IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ExoPlayerBuilderExternalSyntheticLambda19 read;

    public getDeviceInfo(Context context, ExoPlayerBuilderExternalSyntheticLambda19 exoPlayerBuilderExternalSyntheticLambda19) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda19, "");
        this.IconCompatParcelizer = context;
        this.read = exoPlayerBuilderExternalSyntheticLambda19;
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Uri uri, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, SampleVideos sampleVideos) {
        return write(uri, size, exoPlayerBuilderExternalSyntheticLambda4);
    }

    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    public final /* synthetic */ boolean write(Uri uri) {
        return IconCompatParcelizer(uri);
    }

    private static boolean IconCompatParcelizer(Uri p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getScheme(), (Object) "android.resource");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerBuilderExternalSyntheticLambda9
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public String RemoteActionCompatParcelizer(Uri p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append('-');
        Configuration configuration = this.IconCompatParcelizer.getResources().getConfiguration();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(configuration, "");
        sb.append(sendRendererMessage.read(configuration));
        return sb.toString();
    }

    private Object write(Uri uri, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4) throws XmlPullParserException, PackageManager.NameNotFoundException {
        Drawable drawableAudioAttributesCompatParcelizer;
        String authority = uri.getAuthority();
        if (authority == null || !QBankStatsResponse.AudioAttributesCompatParcelizer(!TestGroupLSModel.IconCompatParcelizer((CharSequence) authority)).booleanValue()) {
            authority = null;
        }
        if (authority == null) {
            write2(uri);
            throw new PlanDetailsCreator();
        }
        List<String> pathSegments = uri.getPathSegments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pathSegments, "");
        String str = (String) IntermediateLoginResponseBody.MediaMetadataCompat((List) pathSegments);
        Integer numAudioAttributesImplApi26Parcelizer = str != null ? TestGroupLSModel.AudioAttributesImplApi26Parcelizer(str) : null;
        if (numAudioAttributesImplApi26Parcelizer == null) {
            write2(uri);
            throw new PlanDetailsCreator();
        }
        int iIntValue = numAudioAttributesImplApi26Parcelizer.intValue();
        Context iconCompatParcelizer = exoPlayerBuilderExternalSyntheticLambda4.getIconCompatParcelizer();
        Resources resourcesForApplication = iconCompatParcelizer.getPackageManager().getResourcesForApplication(authority);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resourcesForApplication, "");
        TypedValue typedValue = new TypedValue();
        resourcesForApplication.getValue(iIntValue, typedValue, true);
        CharSequence charSequence = typedValue.string;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charSequence, "");
        String string = charSequence.subSequence(TestGroupLSModel.AudioAttributesCompatParcelizer(charSequence, '/', 0, 6), charSequence.length()).toString();
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(singleton, "");
        String strWrite = sendRendererMessage.write(singleton, string);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strWrite, (Object) "text/xml")) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) authority, (Object) iconCompatParcelizer.getPackageName())) {
                drawableAudioAttributesCompatParcelizer = lambdaupdatePlaybackInfo25.IconCompatParcelizer(iconCompatParcelizer, iIntValue);
            } else {
                drawableAudioAttributesCompatParcelizer = lambdaupdatePlaybackInfo25.AudioAttributesCompatParcelizer(iconCompatParcelizer, resourcesForApplication, iIntValue);
            }
            BitmapDrawable bitmapDrawable = drawableAudioAttributesCompatParcelizer;
            boolean zAudioAttributesCompatParcelizer = sendRendererMessage.AudioAttributesCompatParcelizer(bitmapDrawable);
            if (zAudioAttributesCompatParcelizer) {
                Bitmap bitmapWrite = this.read.write(bitmapDrawable, exoPlayerBuilderExternalSyntheticLambda4.getWrite(), size, exoPlayerBuilderExternalSyntheticLambda4.getRatingCompat(), exoPlayerBuilderExternalSyntheticLambda4.getRemoteActionCompatParcelizer());
                Resources resources = iconCompatParcelizer.getResources();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources, "");
                bitmapDrawable = new BitmapDrawable(resources, bitmapWrite);
            }
            return new ExoPlayerBuilderExternalSyntheticLambda7(bitmapDrawable, zAudioAttributesCompatParcelizer, ExoPlayerBuilderExternalSyntheticLambda15.DISK);
        }
        InputStream inputStreamOpenRawResource = resourcesForApplication.openRawResource(iIntValue);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(inputStreamOpenRawResource, "");
        return new getDeviceVolume(CustomAppBarLayout.AudioAttributesCompatParcelizer(CustomAppBarLayout.AudioAttributesCompatParcelizer(inputStreamOpenRawResource)), strWrite, ExoPlayerBuilderExternalSyntheticLambda15.DISK);
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    private static Void write2(Uri p0) {
        throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Invalid android.resource URI: ", (Object) p0));
    }
}
