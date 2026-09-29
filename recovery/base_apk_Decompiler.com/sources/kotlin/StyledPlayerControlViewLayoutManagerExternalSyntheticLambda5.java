package kotlin;

import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5 {
    public static final StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5 INSTANCE = new StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "p1", "", "read", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        public static void read(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("how", p0);
            linkedHashMap.put("title", p1);
            RtspHeadersBuilder.IconCompatParcelizer().write("Subscribe", linkedHashMap, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        }
    }

    private StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5() {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/StyledPlayerControlViewLayoutManagerExternalSyntheticLambda5$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "read", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }

        public static void read(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", p0);
            RtspHeadersBuilder.IconCompatParcelizer().write("mcq_bookmarked", linkedHashMap, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        }
    }
}
