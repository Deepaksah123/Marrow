package kotlin;

import java.io.InputStream;
import kotlin.setActiveRecallQbankId;
import kotlin.setPaid;

/* JADX INFO: loaded from: classes4.dex */
public final class setPytMcqCount {
    public static final Pair<setActiveRecallQbankId.MediaMetadataCompat, setPaid> read(InputStream inputStream) {
        setActiveRecallQbankId.MediaMetadataCompat mediaMetadataCompatWrite;
        toMagicModuleMetaRepoModel.write(inputStream, "");
        InputStream inputStream2 = inputStream;
        try {
            InputStream inputStream3 = inputStream2;
            setPaid.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = setPaid.AudioAttributesCompatParcelizer;
            setPaid setpaidAudioAttributesCompatParcelizer = setPaid.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(inputStream3);
            if (setpaidAudioAttributesCompatParcelizer.IconCompatParcelizer()) {
                setStepType setsteptype = setStepType.read();
                setParentIds.RemoteActionCompatParcelizer(setsteptype);
                mediaMetadataCompatWrite = setActiveRecallQbankId.MediaMetadataCompat.write(inputStream3, setsteptype);
            } else {
                mediaMetadataCompatWrite = null;
            }
            Pair<setActiveRecallQbankId.MediaMetadataCompat, setPaid> pairWrite = setAction.write(mediaMetadataCompatWrite, setpaidAudioAttributesCompatParcelizer);
            MagicModuleMetaLSModel.IconCompatParcelizer(inputStream2, null);
            return pairWrite;
        } finally {
        }
    }
}
