package kotlin;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.onPrepareError;

/* JADX INFO: loaded from: classes3.dex */
final class DownloadHelperDownloadTrackSelection implements getSelectionData {
    private final ConcurrentHashMap<Integer, onPrepareError.AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final DownloadHelperCallback read;
    private final ConcurrentHashMap<String, onPrepareError.AudioAttributesCompatParcelizer> write;

    private DownloadHelperDownloadTrackSelection(String str, DownloadHelperCallback downloadHelperCallback) {
        this.write = new ConcurrentHashMap<>();
        this.AudioAttributesCompatParcelizer = new ConcurrentHashMap<>();
        this.IconCompatParcelizer = str;
        this.read = downloadHelperCallback;
    }

    DownloadHelperDownloadTrackSelection(DownloadHelperCallback downloadHelperCallback) {
        this("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", downloadHelperCallback);
    }

    @Override // kotlin.getSelectionData
    public final onPrepareError.AudioAttributesCompatParcelizer write(String str) {
        return getSelectionReason.RemoteActionCompatParcelizer(str, this.write, this.IconCompatParcelizer, this.read);
    }

    @Override // kotlin.getSelectionData
    public final onPrepareError.AudioAttributesCompatParcelizer IconCompatParcelizer(int i) {
        if (AudioAttributesCompatParcelizer(i)) {
            return getSelectionReason.RemoteActionCompatParcelizer(Integer.valueOf(i), this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read);
        }
        return null;
    }

    private static boolean AudioAttributesCompatParcelizer(int i) {
        List<String> list = DownloadHelper1.RemoteActionCompatParcelizer().get(Integer.valueOf(i));
        return list.size() == 1 && "001".equals(list.get(0));
    }
}
