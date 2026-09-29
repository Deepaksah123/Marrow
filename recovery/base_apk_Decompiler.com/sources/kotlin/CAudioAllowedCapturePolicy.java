package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/CAudioAllowedCapturePolicy;", "Lo/CAudioFlags;", "Lo/ValueClassSerializerStaticJsonValue;", "p0", "<init>", "(Lo/ValueClassSerializerStaticJsonValue;)V", "Lo/msToUs;", "", "IconCompatParcelizer", "(Lo/msToUs;)V", "", "", "read", "(Ljava/lang/String;)Ljava/lang/Long;", "write", "Lo/ValueClassSerializerStaticJsonValue;", "Lo/serializeE0BElUM;", "RemoteActionCompatParcelizer", "Lo/serializeE0BElUM;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CAudioAllowedCapturePolicy implements CAudioFlags {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final serializeE0BElUM<msToUs> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ValueClassSerializerStaticJsonValue read;

    public CAudioAllowedCapturePolicy(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        this.read = valueClassSerializerStaticJsonValue;
        this.write = new serializeE0BElUM<msToUs>() { // from class: o.CAudioAllowedCapturePolicy.5
            @Override // kotlin.serializeE0BElUM
            public final /* bridge */ /* synthetic */ void IconCompatParcelizer(setDrawEntryLabels setdrawentrylabels, msToUs mstous) {
                IconCompatParcelizer2(setdrawentrylabels, mstous);
            }

            @Override // kotlin.serializeE0BElUM
            public final String read() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
            private static void IconCompatParcelizer2(setDrawEntryLabels setdrawentrylabels, msToUs mstous) {
                toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
                toMagicModuleMetaRepoModel.write(mstous, "");
                setdrawentrylabels.RemoteActionCompatParcelizer(1, mstous.AudioAttributesCompatParcelizer());
                Long lIconCompatParcelizer = mstous.IconCompatParcelizer();
                if (lIconCompatParcelizer == null) {
                    setdrawentrylabels.read(2);
                } else {
                    setdrawentrylabels.IconCompatParcelizer(2, lIconCompatParcelizer.longValue());
                }
            }
        };
    }

    @Override // kotlin.CAudioFlags
    public final void IconCompatParcelizer(final msToUs p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setExtraBottomOffset.IconCompatParcelizer(this.read, false, true, new getAnswerMap() { // from class: o.usToMs
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CAudioAllowedCapturePolicy.IconCompatParcelizer(this.write, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(CAudioAllowedCapturePolicy cAudioAllowedCapturePolicy, msToUs mstous, setDrawHoleEnabled setdrawholeenabled) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        cAudioAllowedCapturePolicy.write.RemoteActionCompatParcelizer(setdrawholeenabled, mstous);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.CAudioFlags
    public final Long read(final String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final String str = "SELECT long_value FROM Preference where `key`=?";
        return (Long) setExtraBottomOffset.IconCompatParcelizer(this.read, true, false, new getAnswerMap() { // from class: o.CAudioUsage
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return CAudioAllowedCapturePolicy.write(str, p0, (setDrawHoleEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long write(String str, String str2, setDrawHoleEnabled setdrawholeenabled) {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.RemoteActionCompatParcelizer(1, str2);
            Long lValueOf = null;
            if (setdrawentrylabelsIconCompatParcelizer.write() && !setdrawentrylabelsIconCompatParcelizer.AudioAttributesImplBaseParcelizer(0)) {
                lValueOf = Long.valueOf(setdrawentrylabelsIconCompatParcelizer.IconCompatParcelizer(0));
            }
            return lValueOf;
        } finally {
            setdrawentrylabelsIconCompatParcelizer.close();
        }
    }

    /* JADX INFO: renamed from: o.CAudioAllowedCapturePolicy$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/CAudioAllowedCapturePolicy$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "Lo/isHdPlaybackError;", "IconCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
