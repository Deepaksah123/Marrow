package kotlin;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\b"}, d2 = {"Lo/RepeatModeUtil;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "MediaBrowserCompatItemReceiver", "I", "AudioAttributesCompatParcelizer", "()I", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RepeatModeUtil {
    private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesImplApi21Parcelizer;
    private static final /* synthetic */ RepeatModeUtil[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int write;
    public static final RepeatModeUtil RemoteActionCompatParcelizer = new RepeatModeUtil("ALL", 0, -1);
    public static final RepeatModeUtil IconCompatParcelizer = new RepeatModeUtil("NORMAL", 1, 1);
    public static final RepeatModeUtil read = new RepeatModeUtil("PRACTICAL_CORNER", 2, 2);
    public static final RepeatModeUtil AudioAttributesImplBaseParcelizer = new RepeatModeUtil("REVISION", 3, 3);
    public static final RepeatModeUtil AudioAttributesCompatParcelizer = new RepeatModeUtil("HIDDEN", 4, 4);

    private RepeatModeUtil(String str, int i, int i2) {
        this.write = i2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    static {
        RepeatModeUtil[] repeatModeUtilArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver = repeatModeUtilArrRemoteActionCompatParcelizer;
        AudioAttributesImplApi21Parcelizer = getMagicModuleTimeline.IconCompatParcelizer(repeatModeUtilArrRemoteActionCompatParcelizer);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: o.RepeatModeUtil$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/RepeatModeUtil$write;", "", "<init>", "()V", "", "p0", "Lo/RepeatModeUtil;", "RemoteActionCompatParcelizer", "(Ljava/lang/Integer;)Lo/RepeatModeUtil;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static RepeatModeUtil RemoteActionCompatParcelizer(Integer p0) {
            RepeatModeUtil next;
            Iterator<RepeatModeUtil> it = RepeatModeUtil.write().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int write = next.getWrite();
                if (p0 != null && write == p0.intValue()) {
                    break;
                }
            }
            RepeatModeUtil repeatModeUtil = next;
            return repeatModeUtil == null ? RepeatModeUtil.RemoteActionCompatParcelizer : repeatModeUtil;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static final /* synthetic */ RepeatModeUtil[] RemoteActionCompatParcelizer() {
        return new RepeatModeUtil[]{RemoteActionCompatParcelizer, IconCompatParcelizer, read, AudioAttributesImplBaseParcelizer, AudioAttributesCompatParcelizer};
    }

    public static getMagicModuleSavedMcqCount<RepeatModeUtil> write() {
        return AudioAttributesImplApi21Parcelizer;
    }

    public static RepeatModeUtil valueOf(String str) {
        return (RepeatModeUtil) Enum.valueOf(RepeatModeUtil.class, str);
    }

    public static RepeatModeUtil[] values() {
        return (RepeatModeUtil[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
