package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getAudioComponent;
import kotlin.newEncryptedObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/AudioAttributesImplApi21;", "Lo/getAudioComponent;", "p0", "Lo/deliverCancellation;", "p1", "", "", "read", "(Lo/AudioAttributesImplApi21;Lo/getAudioComponent;Lo/deliverCancellation;)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class onStopLoading {
    public static final List<Integer> read(AudioAttributesImplApi21 audioAttributesImplApi21, getAudioComponent getaudiocomponent, deliverCancellation delivercancellation) {
        newEncryptedObject newencryptedobjectIconCompatParcelizer;
        if (!delivercancellation.read() && getaudiocomponent.isEmpty()) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        if (delivercancellation.read()) {
            newencryptedobjectIconCompatParcelizer = new newEncryptedObject(delivercancellation.write(), Math.min(delivercancellation.IconCompatParcelizer(), audioAttributesImplApi21.read() - 1));
        } else {
            newEncryptedObject.Companion companion = newEncryptedObject.INSTANCE;
            newencryptedobjectIconCompatParcelizer = newEncryptedObject.Companion.IconCompatParcelizer();
        }
        getAudioComponent getaudiocomponent2 = getaudiocomponent;
        int size = getaudiocomponent2.size();
        for (int i = 0; i < size; i++) {
            getAudioComponent.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getaudiocomponent2.get(i);
            int iWrite = DrmInitData.write(audioAttributesImplApi21, audioAttributesCompatParcelizer.write(), audioAttributesCompatParcelizer.IconCompatParcelizer());
            int read = newencryptedobjectIconCompatParcelizer.getRead();
            if ((iWrite > newencryptedobjectIconCompatParcelizer.getAudioAttributesCompatParcelizer() || read > iWrite) && iWrite >= 0 && iWrite < audioAttributesImplApi21.read()) {
                arrayList.add(Integer.valueOf(iWrite));
            }
        }
        int read2 = newencryptedobjectIconCompatParcelizer.getRead();
        int audioAttributesCompatParcelizer2 = newencryptedobjectIconCompatParcelizer.getAudioAttributesCompatParcelizer();
        if (read2 <= audioAttributesCompatParcelizer2) {
            while (true) {
                arrayList.add(Integer.valueOf(read2));
                if (read2 == audioAttributesCompatParcelizer2) {
                    break;
                }
                read2++;
            }
        }
        return arrayList;
    }
}
