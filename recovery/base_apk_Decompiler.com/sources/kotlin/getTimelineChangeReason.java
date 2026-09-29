package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u0006j\u0002\b\n"}, d2 = {"Lo/getTimelineChangeReason;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "IconCompatParcelizer", "()I", "write", "I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTimelineChangeReason {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final /* synthetic */ getTimelineChangeReason[] read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    public static final getTimelineChangeReason IconCompatParcelizer = new getTimelineChangeReason("NONE", 0, 0);
    public static final getTimelineChangeReason AudioAttributesCompatParcelizer = new getTimelineChangeReason("MEDIUM", 1, 1);

    private getTimelineChangeReason(String str, int i, int i2) {
        this.AudioAttributesCompatParcelizer = i2;
    }

    static {
        getTimelineChangeReason[] gettimelinechangereasonArrWrite = write();
        read = gettimelinechangereasonArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(gettimelinechangereasonArrWrite);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.getTimelineChangeReason$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getTimelineChangeReason$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/getTimelineChangeReason;", "RemoteActionCompatParcelizer", "(I)Lo/getTimelineChangeReason;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getTimelineChangeReason RemoteActionCompatParcelizer(int p0) {
            getTimelineChangeReason gettimelinechangereason;
            getTimelineChangeReason[] gettimelinechangereasonArrValues = getTimelineChangeReason.values();
            int length = gettimelinechangereasonArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gettimelinechangereason = null;
                    break;
                }
                gettimelinechangereason = gettimelinechangereasonArrValues[i];
                if (gettimelinechangereason.AudioAttributesCompatParcelizer == p0) {
                    break;
                }
                i++;
            }
            return gettimelinechangereason == null ? getTimelineChangeReason.IconCompatParcelizer : gettimelinechangereason;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static getTimelineChangeReason valueOf(String str) {
        return (getTimelineChangeReason) Enum.valueOf(getTimelineChangeReason.class, str);
    }

    public static getTimelineChangeReason[] values() {
        return (getTimelineChangeReason[]) read.clone();
    }

    private static final /* synthetic */ getTimelineChangeReason[] write() {
        return new getTimelineChangeReason[]{IconCompatParcelizer, AudioAttributesCompatParcelizer};
    }
}
