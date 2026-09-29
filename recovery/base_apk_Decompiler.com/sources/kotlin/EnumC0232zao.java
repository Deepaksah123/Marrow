package kotlin;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.zao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/zao;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnumC0232zao {
    private static final /* synthetic */ EnumC0232zao[] IconCompatParcelizer;
    public static final EnumC0232zao write = new EnumC0232zao("HOME_TAB", 0);
    public static final EnumC0232zao AudioAttributesCompatParcelizer = new EnumC0232zao("TRANSPARENT", 1);
    public static final EnumC0232zao read = new EnumC0232zao("PRACTICAL_CORNER", 2);
    public static final EnumC0232zao RemoteActionCompatParcelizer = new EnumC0232zao(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 3);

    private EnumC0232zao(String str, int i) {
    }

    static {
        EnumC0232zao[] enumC0232zaoArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        IconCompatParcelizer = enumC0232zaoArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(enumC0232zaoArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ EnumC0232zao[] RemoteActionCompatParcelizer() {
        return new EnumC0232zao[]{write, AudioAttributesCompatParcelizer, read, RemoteActionCompatParcelizer};
    }

    public static EnumC0232zao valueOf(String str) {
        return (EnumC0232zao) Enum.valueOf(EnumC0232zao.class, str);
    }

    public static EnumC0232zao[] values() {
        return (EnumC0232zao[]) IconCompatParcelizer.clone();
    }
}
