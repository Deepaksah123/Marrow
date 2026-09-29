package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\r\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010*(\b\u0002\u0010\u0013\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\u0011*<\b\u0002\u0010\u0015\"\u0010\u0012\u0006\u0012\u0004\u0018\u0001`\u0014\u0012\u0004\u0012\u00020\u00030\u00112$\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014\u0012\u0004\u0012\u00020\u00030\u0011"}, d2 = {"Landroid/view/View;", "Lo/_assertNotNull;", "p0", "", "write", "(Landroid/view/View;Lo/_assertNotNull;)V", "", "", "read", "(I)F", "RemoteActionCompatParcelizer", "(F)F", "Lo/findCoercionAction;", "AudioAttributesCompatParcelizer", "(I)I", "Lo/AtomicReferenceDeserializer$AudioAttributesCompatParcelizer;", "Lo/AtomicReferenceDeserializer$AudioAttributesCompatParcelizer;", "Lkotlin/Function1;", "Lo/WritableTypeIdInclusion;", "BringIntoViewRequester", "Lo/BringIntoViewRequester;", "OnRequesterReady"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AtomicReferenceDeserializer {
    private static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RemoteActionCompatParcelizer(float f) {
        return -f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float read(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(View view, _assertNotNull _assertnotnull) {
        long jAudioAttributesCompatParcelizer = hasRawClass.AudioAttributesCompatParcelizer(_assertnotnull.RemoteActionCompatParcelizer());
        int iRound = Math.round(Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0001"}, d2 = {"Lo/AtomicReferenceDeserializer$AudioAttributesCompatParcelizer;", "Lo/DatabindException;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements DatabindException {
        AudioAttributesCompatParcelizer() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(int i) {
        if (i == 0) {
            return findCoercionAction.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return findCoercionAction.INSTANCE.write();
    }
}
