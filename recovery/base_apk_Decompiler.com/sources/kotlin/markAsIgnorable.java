package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin._findCachedDeserializer;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/markAsIgnorable;", "Lo/withName;", "Lo/BuilderBasedDeserializer1;", "p0", "Lo/CurrentQuery;", "p1", "<init>", "(Lo/BuilderBasedDeserializer1;Lo/CurrentQuery;)V", "Lo/_createDeserializer;", "Lo/_unwrapAndDeserialize;", "Lkotlin/Function1;", "Lo/_findCachedDeserializer$RemoteActionCompatParcelizer;", "", "p2", "", "p3", "Lo/_findCachedDeserializer;", "RemoteActionCompatParcelizer", "(Lo/_createDeserializer;Lo/_unwrapAndDeserialize;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/_findCachedDeserializer;", "AudioAttributesImplApi21Parcelizer", "Lo/BuilderBasedDeserializer1;", "Lo/TopUserCompanion;", "AudioAttributesCompatParcelizer", "Lo/TopUserCompanion;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class markAsIgnorable implements withName {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private TopUserCompanion read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final BuilderBasedDeserializer1 RemoteActionCompatParcelizer;
    public static final int RemoteActionCompatParcelizer = 8;
    private static final DataFormatReadersAccessorForReader write = new DataFormatReadersAccessorForReader();
    private static final CoroutineExceptionHandler read = new RemoteActionCompatParcelizer(CoroutineExceptionHandler.INSTANCE);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¸\u0006\n"}, d2 = {"Lo/YearItem$RemoteActionCompatParcelizer;", "Lo/getUnderrunThreshold;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lo/CurrentQuery;", "p0", "", "p1", "", "handleException", "(Lo/CurrentQuery;Ljava/lang/Throwable;)V", "o/YearItem$RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends getUnderrunThreshold implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(CurrentQuery p0, Throwable p1) {
        }

        public RemoteActionCompatParcelizer(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    public markAsIgnorable(BuilderBasedDeserializer1 builderBasedDeserializer1, CurrentQuery currentQuery) {
        this.RemoteActionCompatParcelizer = builderBasedDeserializer1;
        this.read = College.AudioAttributesCompatParcelizer(read.plus(createFromObjectWith.read()).plus(currentQuery).plus(getAltContact.read((setPassingYear) currentQuery.get(setPassingYear.b_))));
    }

    public /* synthetic */ markAsIgnorable(BuilderBasedDeserializer1 builderBasedDeserializer1, VideoSessionResponseBody videoSessionResponseBody, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new BuilderBasedDeserializer1() : builderBasedDeserializer1, (i & 2) != 0 ? VideoSessionResponseBody.RemoteActionCompatParcelizer : videoSessionResponseBody);
    }

    public final _findCachedDeserializer RemoteActionCompatParcelizer(_createDeserializer p0, _unwrapAndDeserialize p1, getAnswerMap<? super _findCachedDeserializer.RemoteActionCompatParcelizer, getShowPopup> p2, getAnswerMap<? super _createDeserializer, ? extends Object> p3) {
        if (!(p0.getRead() instanceof isInjectionOnly)) {
            return null;
        }
        Pair pairAudioAttributesCompatParcelizer = setAndReturn.AudioAttributesCompatParcelizer(write.RemoteActionCompatParcelizer(((isInjectionOnly) p0.getRead()).IconCompatParcelizer(), p0.getAudioAttributesCompatParcelizer(), p0.getIconCompatParcelizer()), p0, this.RemoteActionCompatParcelizer, p1, p3);
        List list = (List) pairAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        Object obj = pairAudioAttributesCompatParcelizer.read();
        if (list == null) {
            return new _findCachedDeserializer.RemoteActionCompatParcelizer(obj, false, 2, null);
        }
        _deserialize _deserializeVar = new _deserialize(list, obj, p0, this.RemoteActionCompatParcelizer, p2, p1);
        C0201setMcqCount.IconCompatParcelizer(this.read, null, getCollegeName.AudioAttributesCompatParcelizer, new read(_deserializeVar, null), 1);
        return new _findCachedDeserializer.IconCompatParcelizer(_deserializeVar);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ _deserialize RemoteActionCompatParcelizer;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(_deserialize _deserializeVar, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = _deserializeVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public markAsIgnorable() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
