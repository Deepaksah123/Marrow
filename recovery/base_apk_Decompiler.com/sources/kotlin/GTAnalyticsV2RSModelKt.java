package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.GTSubjectAnalyticsV2ResponseModel;
import kotlin.toDownloadInfo;

/* JADX INFO: loaded from: classes4.dex */
abstract class GTAnalyticsV2RSModelKt<ResponseT, ReturnT> extends getShowNudge<ReturnT> {
    private final PlanSubscriptionRSModel<ActivityAdapterModule, ResponseT> IconCompatParcelizer;
    private final toDownloadInfo.AudioAttributesCompatParcelizer read;
    private final GTSubjectAnalyticsV2RSModelKt write;

    protected abstract ReturnT RemoteActionCompatParcelizer(SearchTextResponseBody<ResponseT> searchTextResponseBody, Object[] objArr);

    static <ResponseT, ReturnT> GTAnalyticsV2RSModelKt<ResponseT, ReturnT> IconCompatParcelizer(GTNudgeRequestModel gTNudgeRequestModel, Method method, GTSubjectAnalyticsV2RSModelKt gTSubjectAnalyticsV2RSModelKt) {
        Type genericReturnType;
        boolean z;
        boolean z2 = gTSubjectAnalyticsV2RSModelKt.RemoteActionCompatParcelizer;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            z = true;
            Type typeIconCompatParcelizer = GTSubjectAnalyticsV2ResponseModel.IconCompatParcelizer((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(typeIconCompatParcelizer) == getTopicStat.class && (typeIconCompatParcelizer instanceof ParameterizedType)) {
                typeIconCompatParcelizer = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, (ParameterizedType) typeIconCompatParcelizer);
            } else {
                z = false;
            }
            genericReturnType = new GTSubjectAnalyticsV2ResponseModel.read(null, SearchTextResponseBody.class, typeIconCompatParcelizer);
            annotations = toRepoModel.AudioAttributesCompatParcelizer(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        SearchMcqResponseBody searchMcqResponseBodyAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(gTNudgeRequestModel, method, genericReturnType, annotations);
        Type type = searchMcqResponseBodyAudioAttributesCompatParcelizer.read();
        if (type == C0156TypeKt.class) {
            StringBuilder sb = new StringBuilder("'");
            sb.append(GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type).getName());
            sb.append("' is not a valid response body type. Did you mean ResponseBody?");
            throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(method, sb.toString(), new Object[0]);
        }
        if (type == getTopicStat.class) {
            throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (gTSubjectAnalyticsV2RSModelKt.AudioAttributesCompatParcelizer.equals("HEAD") && !Void.class.equals(type)) {
            throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        PlanSubscriptionRSModel planSubscriptionRSModelIconCompatParcelizer = IconCompatParcelizer(gTNudgeRequestModel, method, type);
        toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = gTNudgeRequestModel.IconCompatParcelizer;
        if (!z2) {
            return new read(gTSubjectAnalyticsV2RSModelKt, audioAttributesCompatParcelizer, planSubscriptionRSModelIconCompatParcelizer, searchMcqResponseBodyAudioAttributesCompatParcelizer);
        }
        if (z) {
            return new AudioAttributesCompatParcelizer(gTSubjectAnalyticsV2RSModelKt, audioAttributesCompatParcelizer, planSubscriptionRSModelIconCompatParcelizer, searchMcqResponseBodyAudioAttributesCompatParcelizer);
        }
        return new write(gTSubjectAnalyticsV2RSModelKt, audioAttributesCompatParcelizer, planSubscriptionRSModelIconCompatParcelizer, searchMcqResponseBodyAudioAttributesCompatParcelizer);
    }

    private static <ResponseT, ReturnT> SearchMcqResponseBody<ResponseT, ReturnT> AudioAttributesCompatParcelizer(GTNudgeRequestModel gTNudgeRequestModel, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (SearchMcqResponseBody<ResponseT, ReturnT>) gTNudgeRequestModel.write(type, annotationArr);
        } catch (RuntimeException e) {
            throw GTSubjectAnalyticsV2ResponseModel.read(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> PlanSubscriptionRSModel<ActivityAdapterModule, ResponseT> IconCompatParcelizer(GTNudgeRequestModel gTNudgeRequestModel, Method method, Type type) {
        try {
            return gTNudgeRequestModel.AudioAttributesCompatParcelizer(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw GTSubjectAnalyticsV2ResponseModel.read(method, e, "Unable to create converter for %s", type);
        }
    }

    GTAnalyticsV2RSModelKt(GTSubjectAnalyticsV2RSModelKt gTSubjectAnalyticsV2RSModelKt, toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, PlanSubscriptionRSModel<ActivityAdapterModule, ResponseT> planSubscriptionRSModel) {
        this.write = gTSubjectAnalyticsV2RSModelKt;
        this.read = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer = planSubscriptionRSModel;
    }

    @Override // kotlin.getShowNudge
    final ReturnT write(Object[] objArr) {
        return RemoteActionCompatParcelizer(new getNudgeType(this.write, objArr, this.read, this.IconCompatParcelizer), objArr);
    }

    static final class read<ResponseT, ReturnT> extends GTAnalyticsV2RSModelKt<ResponseT, ReturnT> {
        private final SearchMcqResponseBody<ResponseT, ReturnT> IconCompatParcelizer;

        read(GTSubjectAnalyticsV2RSModelKt gTSubjectAnalyticsV2RSModelKt, toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, PlanSubscriptionRSModel<ActivityAdapterModule, ResponseT> planSubscriptionRSModel, SearchMcqResponseBody<ResponseT, ReturnT> searchMcqResponseBody) {
            super(gTSubjectAnalyticsV2RSModelKt, audioAttributesCompatParcelizer, planSubscriptionRSModel);
            this.IconCompatParcelizer = searchMcqResponseBody;
        }

        @Override // kotlin.GTAnalyticsV2RSModelKt
        protected final ReturnT RemoteActionCompatParcelizer(SearchTextResponseBody<ResponseT> searchTextResponseBody, Object[] objArr) {
            return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(searchTextResponseBody);
        }
    }

    static final class AudioAttributesCompatParcelizer<ResponseT> extends GTAnalyticsV2RSModelKt<ResponseT, Object> {
        private final SearchMcqResponseBody<ResponseT, SearchTextResponseBody<ResponseT>> IconCompatParcelizer;

        AudioAttributesCompatParcelizer(GTSubjectAnalyticsV2RSModelKt gTSubjectAnalyticsV2RSModelKt, toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, PlanSubscriptionRSModel<ActivityAdapterModule, ResponseT> planSubscriptionRSModel, SearchMcqResponseBody<ResponseT, SearchTextResponseBody<ResponseT>> searchMcqResponseBody) {
            super(gTSubjectAnalyticsV2RSModelKt, audioAttributesCompatParcelizer, planSubscriptionRSModel);
            this.IconCompatParcelizer = searchMcqResponseBody;
        }

        @Override // kotlin.GTAnalyticsV2RSModelKt
        protected final Object RemoteActionCompatParcelizer(SearchTextResponseBody<ResponseT> searchTextResponseBody, Object[] objArr) {
            SearchTextResponseBody<ResponseT> searchTextResponseBodyAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(searchTextResponseBody);
            SampleVideos sampleVideos = (SampleVideos) objArr[objArr.length - 1];
            try {
                return GTAnalyticsV2RSModel.IconCompatParcelizer(searchTextResponseBodyAudioAttributesCompatParcelizer, sampleVideos);
            } catch (Exception e) {
                return GTAnalyticsV2RSModel.RemoteActionCompatParcelizer(e, sampleVideos);
            }
        }
    }

    static final class write<ResponseT> extends GTAnalyticsV2RSModelKt<ResponseT, Object> {
        private final boolean AudioAttributesCompatParcelizer;
        private final SearchMcqResponseBody<ResponseT, SearchTextResponseBody<ResponseT>> write;

        write(GTSubjectAnalyticsV2RSModelKt gTSubjectAnalyticsV2RSModelKt, toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, PlanSubscriptionRSModel<ActivityAdapterModule, ResponseT> planSubscriptionRSModel, SearchMcqResponseBody<ResponseT, SearchTextResponseBody<ResponseT>> searchMcqResponseBody) {
            super(gTSubjectAnalyticsV2RSModelKt, audioAttributesCompatParcelizer, planSubscriptionRSModel);
            this.write = searchMcqResponseBody;
            this.AudioAttributesCompatParcelizer = false;
        }

        @Override // kotlin.GTAnalyticsV2RSModelKt
        protected final Object RemoteActionCompatParcelizer(SearchTextResponseBody<ResponseT> searchTextResponseBody, Object[] objArr) {
            SearchTextResponseBody<ResponseT> searchTextResponseBodyAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(searchTextResponseBody);
            SampleVideos sampleVideos = (SampleVideos) objArr[objArr.length - 1];
            try {
                return GTAnalyticsV2RSModel.AudioAttributesCompatParcelizer(searchTextResponseBodyAudioAttributesCompatParcelizer, sampleVideos);
            } catch (Exception e) {
                return GTAnalyticsV2RSModel.RemoteActionCompatParcelizer(e, sampleVideos);
            }
        }
    }
}
