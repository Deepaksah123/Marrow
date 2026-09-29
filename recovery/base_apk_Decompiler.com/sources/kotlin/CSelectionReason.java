package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.e1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/CSelectionReason;", "Lo/CStreamType;", "Lo/ValueClassSerializerStaticJsonValue;", "p0", "<init>", "(Lo/ValueClassSerializerStaticJsonValue;)V", "", "", "read", "(Ljava/lang/String;)V", "()V", "RemoteActionCompatParcelizer", "Lo/ValueClassSerializerStaticJsonValue;", "IconCompatParcelizer", "Lo/serializeE0BElUM;", "Lo/CSelectionFlags;", "AudioAttributesCompatParcelizer", "Lo/serializeE0BElUM;", "write"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CSelectionReason implements CStreamType {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final serializeE0BElUM<CSelectionFlags> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ValueClassSerializerStaticJsonValue IconCompatParcelizer;

    public CSelectionReason(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        this.IconCompatParcelizer = valueClassSerializerStaticJsonValue;
        this.RemoteActionCompatParcelizer = new serializeE0BElUM<CSelectionFlags>() { // from class: o.CSelectionReason.4
            @Override // kotlin.serializeE0BElUM
            public final /* synthetic */ void IconCompatParcelizer(setDrawEntryLabels setdrawentrylabels, CSelectionFlags cSelectionFlags) {
                read(setdrawentrylabels, cSelectionFlags);
            }

            @Override // kotlin.serializeE0BElUM
            public final String read() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }

            private static void read(setDrawEntryLabels setdrawentrylabels, CSelectionFlags cSelectionFlags) {
                toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
                toMagicModuleMetaRepoModel.write(cSelectionFlags, "");
                setdrawentrylabels.RemoteActionCompatParcelizer(1, cSelectionFlags.RemoteActionCompatParcelizer());
                e1.Companion companion = e1.INSTANCE;
                setdrawentrylabels.read(2, e1.Companion.IconCompatParcelizer(cSelectionFlags.IconCompatParcelizer()));
            }
        };
    }

    @Override // kotlin.CStreamType
    public final void read(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "DELETE from WorkProgress where work_spec_id=?";
        setExtraBottomOffset.IconCompatParcelizer(this.IconCompatParcelizer, false, true, new getAnswerMap() { // from class: o.CVideoOutputMode
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CSelectionReason.RemoteActionCompatParcelizer(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
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

    @Override // kotlin.CStreamType
    public final void read() {
        final String str = "DELETE FROM WorkProgress";
        setExtraBottomOffset.IconCompatParcelizer(this.IconCompatParcelizer, false, true, new getAnswerMap() { // from class: o.CTrackType
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CSelectionReason.AudioAttributesCompatParcelizer(str, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.write();
            setdrawentrylabelsIconCompatParcelizer.close();
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setdrawentrylabelsIconCompatParcelizer.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: o.CSelectionReason$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/CSelectionReason$write;", "", "<init>", "()V", "", "Lo/isHdPlaybackError;", "IconCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
