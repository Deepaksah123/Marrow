package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/setBufferDurationsMs;", "Lo/shouldStartPlayback;", "Lo/ValueClassSerializerStaticJsonValue;", "p0", "<init>", "(Lo/ValueClassSerializerStaticJsonValue;)V", "Lo/setBackBuffer;", "", "write", "(Lo/setBackBuffer;)V", "", "", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/util/List;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "Lo/ValueClassSerializerStaticJsonValue;", "read", "Lo/serializeE0BElUM;", "AudioAttributesCompatParcelizer", "Lo/serializeE0BElUM;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setBufferDurationsMs implements shouldStartPlayback {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final serializeE0BElUM<setBackBuffer> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ValueClassSerializerStaticJsonValue read;

    public setBufferDurationsMs(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        this.read = valueClassSerializerStaticJsonValue;
        this.write = new serializeE0BElUM<setBackBuffer>() { // from class: o.setBufferDurationsMs.4
            @Override // kotlin.serializeE0BElUM
            public final /* bridge */ /* synthetic */ void IconCompatParcelizer(setDrawEntryLabels setdrawentrylabels, setBackBuffer setbackbuffer) {
                IconCompatParcelizer2(setdrawentrylabels, setbackbuffer);
            }

            @Override // kotlin.serializeE0BElUM
            public final String read() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
            private static void IconCompatParcelizer2(setDrawEntryLabels setdrawentrylabels, setBackBuffer setbackbuffer) {
                toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
                toMagicModuleMetaRepoModel.write(setbackbuffer, "");
                setdrawentrylabels.RemoteActionCompatParcelizer(1, setbackbuffer.IconCompatParcelizer());
                setdrawentrylabels.RemoteActionCompatParcelizer(2, setbackbuffer.read());
            }
        };
    }

    @Override // kotlin.shouldStartPlayback
    public final void write(final setBackBuffer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setExtraBottomOffset.IconCompatParcelizer(this.read, false, true, new getAnswerMap() { // from class: o.setPrioritizeTimeOverSizeThresholds
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setBufferDurationsMs.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setBufferDurationsMs setbufferdurationsms, setBackBuffer setbackbuffer, setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setbufferdurationsms.write.RemoteActionCompatParcelizer(setdrawholeenabled, setbackbuffer);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.shouldStartPlayback
    public final List<String> IconCompatParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        return (List) setExtraBottomOffset.IconCompatParcelizer(this.read, true, false, new getAnswerMap() { // from class: o.DefaultLoadControlBuilder
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setBufferDurationsMs.read(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List read(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
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

    @Override // kotlin.shouldStartPlayback
    public final void RemoteActionCompatParcelizer(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "DELETE FROM worktag WHERE work_spec_id=?";
        setExtraBottomOffset.IconCompatParcelizer(this.read, false, true, new getAnswerMap() { // from class: o.setAllocator
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setBufferDurationsMs.AudioAttributesCompatParcelizer(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
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

    /* JADX INFO: renamed from: o.setBufferDurationsMs$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/setBufferDurationsMs$read;", "", "<init>", "()V", "", "Lo/isHdPlaybackError;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<isHdPlaybackError<?>> AudioAttributesCompatParcelizer() {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
