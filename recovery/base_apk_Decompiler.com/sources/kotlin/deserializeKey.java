package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005\" \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t"}, d2 = {"Lo/JsonSerializerNone;", "", "AudioAttributesCompatParcelizer", "(Lo/JsonSerializerNone;)Z", "Lo/deserializeKey$read;", "Lo/deserializeKey$read;", "IconCompatParcelizer", "Lkotlin/Function1;", "", "Lo/getAnswerMap;", "read", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class deserializeKey {
    private static final read AudioAttributesCompatParcelizer = new read();
    private static final getAnswerMap<JsonSerializerNone, getShowPopup> IconCompatParcelizer = AnonymousClass2.AudioAttributesCompatParcelizer;
    private static final getAnswerMap<JsonSerializerNone, getShowPopup> read = AnonymousClass3.IconCompatParcelizer;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0001"}, d2 = {"Lo/deserializeKey$read;", "Lo/usesObjectId;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements usesObjectId {
        read() {
        }
    }

    /* JADX INFO: renamed from: o.deserializeKey$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/JsonSerializerNone;", "p0", "", "IconCompatParcelizer", "(Lo/JsonSerializerNone;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<JsonSerializerNone, getShowPopup> {
        public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

        public final void IconCompatParcelizer(JsonSerializerNone jsonSerializerNone) {
            jsonSerializerNone.onRewind();
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(JsonSerializerNone jsonSerializerNone) {
            IconCompatParcelizer(jsonSerializerNone);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.deserializeKey$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/JsonSerializerNone;", "p0", "", "IconCompatParcelizer", "(Lo/JsonSerializerNone;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<JsonSerializerNone, getShowPopup> {
        public static final AnonymousClass3 IconCompatParcelizer = new AnonymousClass3();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(JsonSerializerNone jsonSerializerNone) {
            IconCompatParcelizer(jsonSerializerNone);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(JsonSerializerNone jsonSerializerNone) {
            jsonSerializerNone.onSetRating();
        }

        AnonymousClass3() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(JsonSerializerNone jsonSerializerNone) {
        _handleOddName.IconCompatParcelizer audioAttributesCompatParcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(jsonSerializerNone).get_init_lambda2().getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
        return ((withMergeInfo) audioAttributesCompatParcelizer).getIconCompatParcelizer();
    }
}
