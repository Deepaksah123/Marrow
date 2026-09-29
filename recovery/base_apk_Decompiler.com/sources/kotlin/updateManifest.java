package kotlin;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.dataprovider.video.playbackconfig.remote.models.PlaybackConfigRootRequestBody;
import com.marrow.data.dataprovider.video.playbackconfig.remote.models.PlaybackConfigRootResponseBody;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class updateManifest implements updateTrackSelection {
    private static int read = 1;
    private static int write;
    private final Object AudioAttributesCompatParcelizer;
    private final selectBaseUrl RemoteActionCompatParcelizer;

    public updateManifest(selectBaseUrl selectbaseurl, Object obj) {
        toMagicModuleMetaRepoModel.write(selectbaseurl, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        this.RemoteActionCompatParcelizer = selectbaseurl;
        this.AudioAttributesCompatParcelizer = obj;
    }

    @Override // kotlin.updateTrackSelection
    public final accessgetEmptyStatecp<MarrowResponse<PlaybackConfigRootResponseBody>> AudioAttributesCompatParcelizer(int i, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = write + 38;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        read = i5 % 128;
        int i6 = i5 % 2;
        Object obj = this.AudioAttributesCompatParcelizer;
        String country = Locale.US.getCountry();
        int i7 = write;
        int i8 = i7 & 19;
        int i9 = ((((i7 ^ 19) | i8) << 1) - (~(-((i7 | 19) & (~i8))))) - 1;
        read = i9 % 128;
        if (i9 % 2 == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(country, "");
            try {
                Object[] objArr = {country};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-887834388);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 11781), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 8676, Color.alpha(0) + 14, -1252164487, false, "write", new Class[]{String.class});
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(country, "");
        try {
            Object[] objArr2 = {country};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-887834388);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (11781 - Color.red(0)), 8677 - (Process.myTid() >> 22), 14 - ExpandableListView.getPackedPositionType(0L), -1252164487, false, "write", new Class[]{String.class});
            }
            String str = (String) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr2);
            selectBaseUrl selectbaseurl = this.RemoteActionCompatParcelizer;
            PlaybackConfigRootRequestBody playbackConfigRootRequestBody = new PlaybackConfigRootRequestBody(String.valueOf(i), i2);
            int i10 = write;
            int i11 = (i10 & 49) + (i10 | 49);
            read = i11 % 128;
            int i12 = i11 % 2;
            accessgetEmptyStatecp<MarrowResponse<PlaybackConfigRootResponseBody>> marrowResponse = ResponseExtensionsKt.toMarrowResponse(selectbaseurl.write(str, playbackConfigRootRequestBody));
            int i13 = read + 117;
            write = i13 % 128;
            int i14 = i13 % 2;
            return marrowResponse;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }
}
