package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\b\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/CCryptoMode;", "Lo/CColorRange;", "Lo/ValueClassSerializerStaticJsonValue;", "p0", "<init>", "(Lo/ValueClassSerializerStaticJsonValue;)V", "Lo/CBufferFlags;", "", "RemoteActionCompatParcelizer", "(Lo/CBufferFlags;)V", "", "", "p1", "write", "(Ljava/lang/String;I)Lo/CBufferFlags;", "", "()Ljava/util/List;", "IconCompatParcelizer", "(Ljava/lang/String;)V", "Lo/ValueClassSerializerStaticJsonValue;", "Lo/serializeE0BElUM;", "AudioAttributesCompatParcelizer", "Lo/serializeE0BElUM;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CCryptoMode implements CColorRange {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final serializeE0BElUM<CBufferFlags> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ValueClassSerializerStaticJsonValue IconCompatParcelizer;

    public CCryptoMode(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        this.IconCompatParcelizer = valueClassSerializerStaticJsonValue;
        this.AudioAttributesCompatParcelizer = new serializeE0BElUM<CBufferFlags>() { // from class: o.CCryptoMode.2
            @Override // kotlin.serializeE0BElUM
            public final /* synthetic */ void IconCompatParcelizer(setDrawEntryLabels setdrawentrylabels, CBufferFlags cBufferFlags) {
                read(setdrawentrylabels, cBufferFlags);
            }

            @Override // kotlin.serializeE0BElUM
            public final String read() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }

            private static void read(setDrawEntryLabels setdrawentrylabels, CBufferFlags cBufferFlags) {
                toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
                toMagicModuleMetaRepoModel.write(cBufferFlags, "");
                setdrawentrylabels.RemoteActionCompatParcelizer(1, cBufferFlags.IconCompatParcelizer);
                setdrawentrylabels.IconCompatParcelizer(2, cBufferFlags.IconCompatParcelizer());
                setdrawentrylabels.IconCompatParcelizer(3, cBufferFlags.read);
            }
        };
    }

    @Override // kotlin.CColorRange
    public final void RemoteActionCompatParcelizer(final CBufferFlags p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setExtraBottomOffset.IconCompatParcelizer(this.IconCompatParcelizer, false, true, new getAnswerMap() { // from class: o.CDataType
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CCryptoMode.read(this.write, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(CCryptoMode cCryptoMode, CBufferFlags cBufferFlags, setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        cCryptoMode.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(setdrawholeenabled, cBufferFlags);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.CColorRange
    public final CBufferFlags write(final String p0, final int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        return (CBufferFlags) setExtraBottomOffset.IconCompatParcelizer(this.IconCompatParcelizer, true, false, new getAnswerMap() { // from class: o.CCryptoType
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CCryptoMode.AudioAttributesCompatParcelizer(str, p0, p1, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CBufferFlags AudioAttributesCompatParcelizer(String str, String str2, int i, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(2, i);
            return setdrawentrylabelsIconCompatParcelizer.write() ? new CBufferFlags(setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "work_spec_id")), (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "generation")), (int) setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(setLogEnabled.write(setdrawentrylabelsIconCompatParcelizer, "system_id"))) : null;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CColorRange
    public final List<String> RemoteActionCompatParcelizer() {
        final String str = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.IconCompatParcelizer, true, false, new getAnswerMap() { // from class: o.CEncoding
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CCryptoMode.AudioAttributesCompatParcelizer(str, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AudioAttributesCompatParcelizer(String str, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (setdrawentrylabelsIconCompatParcelizer.write()) {
                arrayList.add(setdrawentrylabelsIconCompatParcelizer.AudioAttributesCompatParcelizer(0));
            }
            return arrayList;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    @Override // kotlin.CColorRange
    public final void IconCompatParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "DELETE FROM SystemIdInfo where work_spec_id=?";
        setExtraBottomOffset.IconCompatParcelizer(this.IconCompatParcelizer, false, true, new getAnswerMap() { // from class: o.CContentType
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CCryptoMode.read(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            setdrawentrylabelsIconCompatParcelizer.write();
            setdrawentrylabelsIconCompatParcelizer.close();
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setdrawentrylabelsIconCompatParcelizer.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: o.CCryptoMode$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/CCryptoMode$IconCompatParcelizer;", "", "<init>", "()V", "", "Lo/isHdPlaybackError;", "read", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<isHdPlaybackError<?>> read() {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
