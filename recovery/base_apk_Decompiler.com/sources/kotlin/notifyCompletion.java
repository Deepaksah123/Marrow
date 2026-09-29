package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/notifyCompletion;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class notifyCompletion {
    public static final notifyCompletion AudioAttributesCompatParcelizer = new notifyCompletion("ALL", 0);
    public static final notifyCompletion IconCompatParcelizer = new notifyCompletion("CHOOSE", 1);
    private static final /* synthetic */ notifyCompletion[] RemoteActionCompatParcelizer;

    private notifyCompletion(String str, int i) {
    }

    static {
        notifyCompletion[] notifycompletionArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        RemoteActionCompatParcelizer = notifycompletionArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(notifycompletionArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ notifyCompletion[] AudioAttributesCompatParcelizer() {
        return new notifyCompletion[]{AudioAttributesCompatParcelizer, IconCompatParcelizer};
    }

    public static notifyCompletion valueOf(String str) {
        return (notifyCompletion) Enum.valueOf(notifyCompletion.class, str);
    }

    public static notifyCompletion[] values() {
        return (notifyCompletion[]) RemoteActionCompatParcelizer.clone();
    }
}
