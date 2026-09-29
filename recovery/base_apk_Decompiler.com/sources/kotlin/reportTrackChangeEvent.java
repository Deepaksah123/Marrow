package kotlin;

import android.media.MediaDrm;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class reportTrackChangeEvent {
    public static final String AudioAttributesCompatParcelizer() throws NoSuchAlgorithmException {
        MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
        byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
        mediaDrm.close();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(propertyByteArray);
        return getOrderDetails.write(messageDigest.digest(), "", "", "", -1, "...", (getAnswerMap<? super Byte, ? extends CharSequence>) getAbandonedBeforeReadyRatio.AudioAttributesCompatParcelizer);
    }
}
