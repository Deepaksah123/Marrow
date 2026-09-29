package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7 {
    private static final /* synthetic */ VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7[] read;
    public static final VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7 IconCompatParcelizer = new VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7("Compact", 0);
    public static final VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7 RemoteActionCompatParcelizer = new VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7("Medium", 1);
    public static final VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7 AudioAttributesCompatParcelizer = new VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7("Expanded", 2);

    private VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7(String str, int i) {
    }

    static {
        VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7[] videoRendererEventListenerEventDispatcherExternalSyntheticLambda7ArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        read = videoRendererEventListenerEventDispatcherExternalSyntheticLambda7ArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(videoRendererEventListenerEventDispatcherExternalSyntheticLambda7ArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7[] RemoteActionCompatParcelizer() {
        return new VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7[]{IconCompatParcelizer, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7 valueOf(String str) {
        return (VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7) Enum.valueOf(VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7.class, str);
    }

    public static VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7[] values() {
        return (VideoRendererEventListenerEventDispatcherExternalSyntheticLambda7[]) read.clone();
    }
}
