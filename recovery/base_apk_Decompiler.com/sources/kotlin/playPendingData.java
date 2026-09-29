package kotlin;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class playPendingData {
    private String AudioAttributesCompatParcelizer;
    private PackageManager IconCompatParcelizer;

    public playPendingData(PackageManager packageManager, String str) {
        this.IconCompatParcelizer = packageManager;
        this.AudioAttributesCompatParcelizer = str;
    }

    public final DefaultAudioSinkApi31 RemoteActionCompatParcelizer() {
        String str;
        Object obj;
        String[] strArr;
        int[] iArr;
        PackageManager packageManager = this.IconCompatParcelizer;
        if (packageManager == null || (str = this.AudioAttributesCompatParcelizer) == null) {
            return new codecNeedsDiscardChannelsWorkaround(getShowPopup.INSTANCE);
        }
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 4096);
            toMagicModuleMetaRepoModel.write(packageInfo);
            strArr = packageInfo.requestedPermissions;
            toMagicModuleMetaRepoModel.write(strArr);
            iArr = packageInfo.requestedPermissionsFlags;
            toMagicModuleMetaRepoModel.write(iArr);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        if (strArr.length != iArr.length) {
            throw new IllegalStateException();
        }
        List listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(getOrderDetails.onCommand(strArr), getOrderDetails.AudioAttributesImplApi26Parcelizer(iArr));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listAudioAttributesImplApi26Parcelizer) {
            if (((Pair) obj2).write() != null) {
                arrayList.add(obj2);
            }
        }
        obj = C0177getRfBanners.read(VideoTimelineResponseBody.read(arrayList));
        DefaultAudioSinkApi31 defaultAudioSinkApi31AudioAttributesCompatParcelizer = DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj);
        if (defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof Ac4Util) {
            return defaultAudioSinkApi31AudioAttributesCompatParcelizer;
        }
        if (!(defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        return new codecNeedsDiscardChannelsWorkaround(getShowPopup.INSTANCE);
    }
}
