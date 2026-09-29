package kotlin;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class getDataSchemeDataSource implements getContentDataSource {
    private final Object RemoteActionCompatParcelizer;
    private final Application read;

    public getDataSchemeDataSource(Application application, Object obj) {
        toMagicModuleMetaRepoModel.write(application, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        this.read = application;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // kotlin.getContentDataSource
    public final String read() {
        return updateShuffleButton.read(this.read);
    }

    @Override // kotlin.getContentDataSource
    public final String RemoteActionCompatParcelizer() throws Throwable {
        Object obj = this.RemoteActionCompatParcelizer;
        String country = Locale.US.getCountry();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(country, "");
        try {
            Object[] objArr = {country};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-887834388);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11781), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8676, (-16777202) - Color.rgb(0, 0, 0), -1252164487, false, "write", new Class[]{String.class});
            }
            return (String) ((Method) objRemoteActionCompatParcelizer).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
