package kotlin;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class ChannelMappingAudioProcessor {
    public final newNoDataInstance AudioAttributesCompatParcelizer;
    public final maybePrepareFile IconCompatParcelizer;

    public ChannelMappingAudioProcessor(maybePrepareFile maybepreparefile, newNoDataInstance newnodatainstance) {
        this.IconCompatParcelizer = maybepreparefile;
        this.AudioAttributesCompatParcelizer = newnodatainstance;
    }

    public static final audioSinkError RemoteActionCompatParcelizer(ChannelMappingAudioProcessor channelMappingAudioProcessor, Location location, String str, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zIsMock;
        if (location == null) {
            return null;
        }
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            maybePrepareFile maybepreparefile = channelMappingAudioProcessor.IconCompatParcelizer;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Geocoder geocoder = maybepreparefile.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(geocoder);
            List<Address> fromLocation = geocoder.getFromLocation(latitude, longitude, i);
            toMagicModuleMetaRepoModel.write(fromLocation);
            ArrayList arrayList = new ArrayList();
            for (Address address : fromLocation) {
                String countryCode = address != null ? address.getCountryCode() : null;
                if (countryCode != null) {
                    arrayList.add(countryCode);
                }
            }
            obj = C0177getRfBanners.read(arrayList);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        List list = (List) setForHeaderData.read(mayHandleBuffer.RemoteActionCompatParcelizer(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj)), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
            if (Build.VERSION.SDK_INT < 31) {
                zIsMock = location.isFromMockProvider();
            } else {
                zIsMock = location.isMock();
            }
            obj2 = C0177getRfBanners.read(Boolean.valueOf(zIsMock));
        } catch (Throwable th2) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer4 = C0177getRfBanners.IconCompatParcelizer;
            obj2 = C0177getRfBanners.read(SdkPayloadData.write(th2));
        }
        boolean zBooleanValue = ((Boolean) setForHeaderData.read(mayHandleBuffer.RemoteActionCompatParcelizer(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj2)), Boolean.FALSE)).booleanValue();
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer5 = C0177getRfBanners.IconCompatParcelizer;
            obj3 = C0177getRfBanners.read(Long.valueOf((SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000));
        } catch (Throwable th3) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer6 = C0177getRfBanners.IconCompatParcelizer;
            obj3 = C0177getRfBanners.read(SdkPayloadData.write(th3));
        }
        return new audioSinkError(list, zBooleanValue, str, ((Number) setForHeaderData.read(mayHandleBuffer.RemoteActionCompatParcelizer(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj3)), 0L)).longValue());
    }
}
