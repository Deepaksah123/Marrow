package kotlin;

import android.util.Base64;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.StreamVolumeManager1;
import kotlin.getCurrentTracksInternal;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0006*\u00020\u000e0\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\t\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u0012J\u0015\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016"}, d2 = {"Lo/blockUntilConstructorFinished;", "", "Lo/getCurrentPeriodOrAdPositionMs;", "p0", "Lo/getCurrentTracksInternal;", "p1", "<init>", "(Lo/getCurrentPeriodOrAdPositionMs;Lo/getCurrentTracksInternal;)V", "Ljavax/crypto/SecretKey;", "AudioAttributesCompatParcelizer", "()Ljavax/crypto/SecretKey;", "", "write", "()[B", "", "IconCompatParcelizer", "()Ljava/lang/String;", "Lo/ThumbRating;", "(Ljava/lang/String;)Lo/ThumbRating;", "([B)Ljava/lang/String;", "read", "Lo/getCurrentPeriodOrAdPositionMs;", "Lo/getCurrentTracksInternal;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class blockUntilConstructorFinished {
    private static volatile SecretKey write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getCurrentTracksInternal write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getCurrentPeriodOrAdPositionMs IconCompatParcelizer;
    private static final Object IconCompatParcelizer = new Object();

    public blockUntilConstructorFinished(getCurrentPeriodOrAdPositionMs getcurrentperiodoradpositionms, getCurrentTracksInternal getcurrenttracksinternal) {
        toMagicModuleMetaRepoModel.write(getcurrentperiodoradpositionms, "");
        toMagicModuleMetaRepoModel.write(getcurrenttracksinternal, "");
        this.IconCompatParcelizer = getcurrentperiodoradpositionms;
        this.write = getcurrenttracksinternal;
    }

    private final SecretKey AudioAttributesCompatParcelizer() {
        if (write == null) {
            synchronized (IconCompatParcelizer) {
                if (write == null) {
                    write = getCurrentPeriodOrAdPositionMs.AudioAttributesCompatParcelizer();
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
        SecretKey secretKey = write;
        toMagicModuleMetaRepoModel.write(secretKey);
        return secretKey;
    }

    private final byte[] write() {
        byte[] encoded = AudioAttributesCompatParcelizer().getEncoded();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(encoded, "");
        return encoded;
    }

    public final String IconCompatParcelizer() {
        return Base64.encodeToString(write(), 2);
    }

    public final ThumbRating AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        byte[] bytes = p0.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        getCurrentTracksInternal.write writeVar = getCurrentTracksInternal.read(1, bytes, null, AudioAttributesCompatParcelizer());
        if (writeVar != null) {
            return new StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0(write(writeVar.AudioAttributesCompatParcelizer()), write(writeVar.read()));
        }
        return isMuted.INSTANCE;
    }

    public final ThumbRating IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            StreamVolumeManager1.Companion companion = StreamVolumeManager1.INSTANCE;
            StreamVolumeManager1 streamVolumeManager1IconCompatParcelizer = StreamVolumeManager1.Companion.IconCompatParcelizer(p0);
            String audioAttributesCompatParcelizer = streamVolumeManager1IconCompatParcelizer.getAudioAttributesCompatParcelizer();
            String write2 = streamVolumeManager1IconCompatParcelizer.getWrite();
            byte[] bArrDecode = Base64.decode(audioAttributesCompatParcelizer, 2);
            byte[] bArrDecode2 = Base64.decode(write2, 2);
            toMagicModuleMetaRepoModel.write(bArrDecode);
            getCurrentTracksInternal.write writeVar = getCurrentTracksInternal.read(2, bArrDecode, bArrDecode2, AudioAttributesCompatParcelizer());
            if (writeVar != null) {
                return new StreamVolumeManagerVolumeChangeReceiverExternalSyntheticLambda0(new String(writeVar.AudioAttributesCompatParcelizer(), getSubmissionTimestamp.IconCompatParcelizer), new String(writeVar.read(), getSubmissionTimestamp.IconCompatParcelizer));
            }
            return isMuted.INSTANCE;
        } catch (Exception e) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return isMuted.INSTANCE;
        }
    }

    private static String write(byte[] p0) {
        String strEncodeToString = Base64.encodeToString(p0, 2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strEncodeToString, "");
        return strEncodeToString;
    }
}
