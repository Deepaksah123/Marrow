package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/CFormatSupport;", "Lo/CRoleFlags;", "Lo/ValueClassSerializerStaticJsonValue;", "p0", "<init>", "(Lo/ValueClassSerializerStaticJsonValue;)V", "Lo/CNetworkType;", "", "IconCompatParcelizer", "(Lo/CNetworkType;)V", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Ljava/util/List;", "read", "Lo/ValueClassSerializerStaticJsonValue;", "RemoteActionCompatParcelizer", "Lo/serializeE0BElUM;", "write", "Lo/serializeE0BElUM;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CFormatSupport implements CRoleFlags {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final ValueClassSerializerStaticJsonValue RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final serializeE0BElUM<CNetworkType> IconCompatParcelizer;

    public CFormatSupport(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        this.RemoteActionCompatParcelizer = valueClassSerializerStaticJsonValue;
        this.IconCompatParcelizer = new serializeE0BElUM<CNetworkType>() { // from class: o.CFormatSupport.3
            @Override // kotlin.serializeE0BElUM
            public final /* synthetic */ void IconCompatParcelizer(setDrawEntryLabels setdrawentrylabels, CNetworkType cNetworkType) {
                write(setdrawentrylabels, cNetworkType);
            }

            @Override // kotlin.serializeE0BElUM
            public final String read() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            private static void write(setDrawEntryLabels setdrawentrylabels, CNetworkType cNetworkType) {
                toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
                toMagicModuleMetaRepoModel.write(cNetworkType, "");
                setdrawentrylabels.RemoteActionCompatParcelizer(1, cNetworkType.AudioAttributesCompatParcelizer());
                setdrawentrylabels.RemoteActionCompatParcelizer(2, cNetworkType.RemoteActionCompatParcelizer());
            }
        };
    }

    @Override // kotlin.CRoleFlags
    public final void IconCompatParcelizer(final CNetworkType p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setExtraBottomOffset.IconCompatParcelizer(this.RemoteActionCompatParcelizer, false, true, new getAnswerMap() { // from class: o.CSpatializationBehavior
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CFormatSupport.read(this.read, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(CFormatSupport cFormatSupport, CNetworkType cNetworkType, setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        cFormatSupport.IconCompatParcelizer.RemoteActionCompatParcelizer(setdrawholeenabled, cNetworkType);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.CRoleFlags
    public final List<String> AudioAttributesCompatParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT name FROM workname WHERE work_spec_id=?";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.RemoteActionCompatParcelizer, true, false, new getAnswerMap() { // from class: o.CStereoMode
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CFormatSupport.AudioAttributesCompatParcelizer(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AudioAttributesCompatParcelizer(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                arrayList.add(setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(0));
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    /* JADX INFO: renamed from: o.CFormatSupport$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/CFormatSupport$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "Lo/isHdPlaybackError;", "IconCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<isHdPlaybackError<?>> IconCompatParcelizer() {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
