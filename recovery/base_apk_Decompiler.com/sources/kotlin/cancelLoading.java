package kotlin;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.ResponseError;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\t\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015"}, d2 = {"Lo/cancelLoading;", "Lo/Loader;", "Landroid/app/Application;", "p0", "<init>", "(Landroid/app/Application;)V", "", "p1", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "", "()Ljava/lang/Object;", "", "read", "()J", "write", "(Ljava/lang/String;)J", "Landroid/app/Application;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cancelLoading implements Loader {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Application IconCompatParcelizer;

    @setSdkPayload
    public cancelLoading(Application application) {
        toMagicModuleMetaRepoModel.write(application, "");
        this.IconCompatParcelizer = application;
    }

    @Override // kotlin.Loader
    public final Object AudioAttributesCompatParcelizer(String p0, String p1) throws IOException {
        File file = new File(this.IconCompatParcelizer.getCacheDir(), p0);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(p1);
        bufferedWriter.close();
        fileWriter.close();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.Loader
    public final Object IconCompatParcelizer(String p0) throws IOException {
        File file = new File(this.IconCompatParcelizer.getCacheDir(), p0);
        if (!file.exists()) {
            throw new ResponseErrorException(new ResponseError(899, "File not Found", false, 4, null));
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
                sb.append("\n");
            } else {
                bufferedReader.close();
                fileReader.close();
                String string = sb.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                return string;
            }
        }
    }

    @Override // kotlin.Loader
    public final Object RemoteActionCompatParcelizer(String p0) throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer.getExternalFilesDir(null), ".marrow"};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(780100948);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (Color.blue(0) + 46567), 17245 - TextUtils.indexOf("", ""), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 62, 1345757633, false, "read", new Class[]{File.class, String.class});
            }
            File file = new File((File) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr), p0);
            if (!file.exists() || file.listFiles() == null) {
                return getShowPopup.INSTANCE;
            }
            Util.recursiveDelete(file);
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // kotlin.Loader
    public final Object AudioAttributesCompatParcelizer() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(read() < 524288000);
    }

    private final long read() {
        File externalFilesDir = this.IconCompatParcelizer.getExternalFilesDir(null);
        return write(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
    }

    private static long write(String p0) {
        try {
            StatFs statFs = new StatFs(p0);
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (IllegalArgumentException unused) {
            return TimestampAdjuster.MODE_SHARED;
        }
    }
}
