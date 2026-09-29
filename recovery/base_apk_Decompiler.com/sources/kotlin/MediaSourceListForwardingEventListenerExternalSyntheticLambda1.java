package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda1;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaSourceListForwardingEventListenerExternalSyntheticLambda1 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final /* synthetic */ MediaSourceListForwardingEventListenerExternalSyntheticLambda1[] RemoteActionCompatParcelizer;
    public static final MediaSourceListForwardingEventListenerExternalSyntheticLambda1 IconCompatParcelizer = new MediaSourceListForwardingEventListenerExternalSyntheticLambda1("FIT_CENTER", 0);
    public static final MediaSourceListForwardingEventListenerExternalSyntheticLambda1 write = new MediaSourceListForwardingEventListenerExternalSyntheticLambda1("CENTER_CROP", 1);

    private MediaSourceListForwardingEventListenerExternalSyntheticLambda1(String str, int i) {
    }

    static {
        MediaSourceListForwardingEventListenerExternalSyntheticLambda1[] mediaSourceListForwardingEventListenerExternalSyntheticLambda1Arr = read();
        RemoteActionCompatParcelizer = mediaSourceListForwardingEventListenerExternalSyntheticLambda1Arr;
        getMagicModuleTimeline.IconCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda1Arr);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: o.MediaSourceListForwardingEventListenerExternalSyntheticLambda1$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda1$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda1;", "IconCompatParcelizer", "(Ljava/lang/String;)Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static MediaSourceListForwardingEventListenerExternalSyntheticLambda1 IconCompatParcelizer(String p0) {
            MediaSourceListForwardingEventListenerExternalSyntheticLambda1 mediaSourceListForwardingEventListenerExternalSyntheticLambda1;
            MediaSourceListForwardingEventListenerExternalSyntheticLambda1[] mediaSourceListForwardingEventListenerExternalSyntheticLambda1ArrValues = MediaSourceListForwardingEventListenerExternalSyntheticLambda1.values();
            int length = mediaSourceListForwardingEventListenerExternalSyntheticLambda1ArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    mediaSourceListForwardingEventListenerExternalSyntheticLambda1 = null;
                    break;
                }
                mediaSourceListForwardingEventListenerExternalSyntheticLambda1 = mediaSourceListForwardingEventListenerExternalSyntheticLambda1ArrValues[i];
                if (TestGroupLSModel.read(mediaSourceListForwardingEventListenerExternalSyntheticLambda1.name(), p0, true)) {
                    break;
                }
                i++;
            }
            return mediaSourceListForwardingEventListenerExternalSyntheticLambda1 == null ? MediaSourceListForwardingEventListenerExternalSyntheticLambda1.write : mediaSourceListForwardingEventListenerExternalSyntheticLambda1;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static MediaSourceListForwardingEventListenerExternalSyntheticLambda1 valueOf(String str) {
        return (MediaSourceListForwardingEventListenerExternalSyntheticLambda1) Enum.valueOf(MediaSourceListForwardingEventListenerExternalSyntheticLambda1.class, str);
    }

    public static MediaSourceListForwardingEventListenerExternalSyntheticLambda1[] values() {
        return (MediaSourceListForwardingEventListenerExternalSyntheticLambda1[]) RemoteActionCompatParcelizer.clone();
    }

    private static final /* synthetic */ MediaSourceListForwardingEventListenerExternalSyntheticLambda1[] read() {
        return new MediaSourceListForwardingEventListenerExternalSyntheticLambda1[]{IconCompatParcelizer, write};
    }
}
