package kotlin;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.onPrepareError;

/* JADX INFO: loaded from: classes3.dex */
final class getSelectionReason {
    static final DownloadHelperCallback IconCompatParcelizer = new DownloadHelperCallback() { // from class: o.getSelectionReason.4
        @Override // kotlin.DownloadHelperCallback
        public final InputStream IconCompatParcelizer(String str) {
            return getSelectionReason.class.getResourceAsStream(str);
        }
    };
    private static final Logger write = Logger.getLogger(getSelectionReason.class.getName());

    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        DownloadHelperExternalSyntheticLambda5.IconCompatParcelizer();
        updateSelectedTrack.write();
    }

    private getSelectionReason() {
    }

    static <T> onPrepareError.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(T t, ConcurrentHashMap<T, onPrepareError.AudioAttributesCompatParcelizer> concurrentHashMap, String str, DownloadHelperCallback downloadHelperCallback) {
        onPrepareError.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = concurrentHashMap.get(t);
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(t);
        String string = sb.toString();
        List<onPrepareError.AudioAttributesCompatParcelizer> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(string, downloadHelperCallback);
        if (listAudioAttributesCompatParcelizer.size() > 1) {
            write.log(Level.WARNING, "more than one metadata in file ".concat(String.valueOf(string)));
        }
        onPrepareError.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = listAudioAttributesCompatParcelizer.get(0);
        onPrepareError.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerPutIfAbsent = concurrentHashMap.putIfAbsent(t, audioAttributesCompatParcelizer2);
        return audioAttributesCompatParcelizerPutIfAbsent != null ? audioAttributesCompatParcelizerPutIfAbsent : audioAttributesCompatParcelizer2;
    }

    private static List<onPrepareError.AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer(String str, DownloadHelperCallback downloadHelperCallback) {
        InputStream inputStreamIconCompatParcelizer = downloadHelperCallback.IconCompatParcelizer(str);
        if (inputStreamIconCompatParcelizer == null) {
            throw new IllegalStateException("missing metadata: ".concat(String.valueOf(str)));
        }
        List<onPrepareError.AudioAttributesCompatParcelizer> listRemoteActionCompatParcelizer = write(inputStreamIconCompatParcelizer).RemoteActionCompatParcelizer();
        if (listRemoteActionCompatParcelizer.size() != 0) {
            return listRemoteActionCompatParcelizer;
        }
        throw new IllegalStateException("empty metadata: ".concat(String.valueOf(str)));
    }

    private static onPrepareError.write write(InputStream inputStream) throws Throwable {
        ObjectInputStream objectInputStream;
        try {
            try {
                objectInputStream = new ObjectInputStream(inputStream);
                try {
                    onPrepareError.write writeVar = new onPrepareError.write();
                    try {
                        writeVar.readExternal(objectInputStream);
                        try {
                            objectInputStream.close();
                            return writeVar;
                        } catch (IOException e) {
                            write.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e);
                            return writeVar;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException("cannot load/parse metadata", e2);
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        } else {
                            inputStream.close();
                        }
                    } catch (IOException e3) {
                        write.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e3);
                    }
                    throw th;
                }
            } catch (IOException e4) {
                throw new RuntimeException("cannot load/parse metadata", e4);
            }
        } catch (Throwable th2) {
            th = th2;
            objectInputStream = null;
        }
    }
}
