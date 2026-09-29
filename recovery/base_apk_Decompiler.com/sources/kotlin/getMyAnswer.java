package kotlin;

import java.io.InputStream;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class getMyAnswer extends getReviewTime implements getQBankGroupMeta {
    public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(0);
    private final boolean write;

    private getMyAnswer(getNotesCount getnotescount, getMini getmini, getTopSection gettopsection, setActiveRecallQbankId.MediaMetadataCompat mediaMetadataCompat, setPaid setpaid, boolean z) {
        super(getnotescount, getmini, gettopsection, mediaMetadataCompat, setpaid);
        this.write = z;
    }

    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static getMyAnswer IconCompatParcelizer(getNotesCount getnotescount, getMini getmini, getTopSection gettopsection, InputStream inputStream, boolean z) {
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            toMagicModuleMetaRepoModel.write(getmini, "");
            toMagicModuleMetaRepoModel.write(gettopsection, "");
            toMagicModuleMetaRepoModel.write(inputStream, "");
            Pair<setActiveRecallQbankId.MediaMetadataCompat, setPaid> pair = setPytMcqCount.read(inputStream);
            setActiveRecallQbankId.MediaMetadataCompat mediaMetadataCompatRemoteActionCompatParcelizer = pair.RemoteActionCompatParcelizer();
            setPaid setpaid = pair.read();
            if (mediaMetadataCompatRemoteActionCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder("Kotlin built-in definition format version is not supported: expected ");
                sb.append(setPaid.IconCompatParcelizer);
                sb.append(", actual ");
                sb.append(setpaid);
                sb.append(". Please update Kotlin");
                throw new UnsupportedOperationException(sb.toString());
            }
            return new getMyAnswer(getnotescount, getmini, gettopsection, mediaMetadataCompatRemoteActionCompatParcelizer, setpaid, z, (byte) 0);
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    @Override // kotlin.isHyt, kotlin.getBooleanMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(IconCompatParcelizer());
        sb.append(" from ");
        sb.append(setLocked.IconCompatParcelizer(this));
        return sb.toString();
    }

    public /* synthetic */ getMyAnswer(getNotesCount getnotescount, getMini getmini, getTopSection gettopsection, setActiveRecallQbankId.MediaMetadataCompat mediaMetadataCompat, setPaid setpaid, boolean z, byte b) {
        this(getnotescount, getmini, gettopsection, mediaMetadataCompat, setpaid, z);
    }
}
