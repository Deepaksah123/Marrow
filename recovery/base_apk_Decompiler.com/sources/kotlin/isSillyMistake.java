package kotlin;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public enum isSillyMistake {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set<isSillyMistake> RemoteActionCompatParcelizer;
    public static final Set<isSillyMistake> read;
    private final boolean onAddQueueItem;

    isSillyMistake(boolean z) {
        this.onAddQueueItem = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new AudioAttributesCompatParcelizer(0 == true ? 1 : 0);
        isSillyMistake[] issillymistakeArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (isSillyMistake issillymistake : issillymistakeArrValues) {
            if (issillymistake.onAddQueueItem) {
                arrayList.add(issillymistake);
            }
        }
        read = IntermediateLoginResponseBody.onPlayFromUri(arrayList);
        RemoteActionCompatParcelizer = getOrderDetails.handleMediaPlayPauseIfPendingOnHandler(values());
    }

    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }
}
