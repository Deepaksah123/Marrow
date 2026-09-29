package kotlin;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal {
    private final lambdasendMessageToTargetThread1comgoogleandroidexoplayer2ExoPlayerImplInternal read;

    public lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal(lambdasendMessageToTargetThread1comgoogleandroidexoplayer2ExoPlayerImplInternal lambdasendmessagetotargetthread1comgoogleandroidexoplayer2exoplayerimplinternal) {
        this.read = lambdasendmessagetotargetthread1comgoogleandroidexoplayer2exoplayerimplinternal;
    }

    final Pair<updateLoadControlTrackSelection, InputStream> RemoteActionCompatParcelizer(String str) {
        updateLoadControlTrackSelection updateloadcontroltrackselection;
        try {
            File fileWrite = write(str);
            if (fileWrite == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileWrite);
            if (fileWrite.getAbsolutePath().endsWith(".zip")) {
                updateloadcontroltrackselection = updateLoadControlTrackSelection.ZIP;
            } else if (fileWrite.getAbsolutePath().endsWith(".gz")) {
                updateloadcontroltrackselection = updateLoadControlTrackSelection.GZIP;
            } else {
                updateloadcontroltrackselection = updateLoadControlTrackSelection.JSON;
            }
            StringBuilder sb = new StringBuilder("Cache hit for ");
            sb.append(str);
            sb.append(" at ");
            sb.append(fileWrite.getAbsolutePath());
            access3000.write(sb.toString());
            return new Pair<>(updateloadcontroltrackselection, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    final File read(String str, InputStream inputStream, updateLoadControlTrackSelection updateloadcontroltrackselection) throws IOException {
        File file = new File(AudioAttributesCompatParcelizer(), IconCompatParcelizer(str, updateloadcontroltrackselection, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    final void RemoteActionCompatParcelizer(String str, updateLoadControlTrackSelection updateloadcontroltrackselection) {
        File file = new File(AudioAttributesCompatParcelizer(), IconCompatParcelizer(str, updateloadcontroltrackselection, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        StringBuilder sb = new StringBuilder("Copying temp file to real file (");
        sb.append(file2);
        sb.append(")");
        access3000.write(sb.toString());
        if (zRenameTo) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unable to rename cache file ");
        sb2.append(file.getAbsolutePath());
        sb2.append(" to ");
        sb2.append(file2.getAbsolutePath());
        sb2.append(".");
        access3000.AudioAttributesCompatParcelizer(sb2.toString());
    }

    private File write(String str) throws FileNotFoundException {
        File file = new File(AudioAttributesCompatParcelizer(), IconCompatParcelizer(str, updateLoadControlTrackSelection.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(AudioAttributesCompatParcelizer(), IconCompatParcelizer(str, updateLoadControlTrackSelection.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(AudioAttributesCompatParcelizer(), IconCompatParcelizer(str, updateLoadControlTrackSelection.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    private File AudioAttributesCompatParcelizer() {
        File file = this.read.read();
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String IconCompatParcelizer(String str, updateLoadControlTrackSelection updateloadcontroltrackselection, boolean z) {
        String strRemoteActionCompatParcelizer = z ? updateloadcontroltrackselection.RemoteActionCompatParcelizer() : updateloadcontroltrackselection.IconCompatParcelizer;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strRemoteActionCompatParcelizer.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = read(strReplaceAll, length);
        }
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(strReplaceAll);
        sb.append(strRemoteActionCompatParcelizer);
        return sb.toString();
    }

    private static String read(String str, int i) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i);
        }
    }
}
