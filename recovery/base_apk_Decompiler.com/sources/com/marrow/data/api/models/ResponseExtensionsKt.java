package com.marrow.data.api.models;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.Data;
import com.marrow.data.models.ResponseError;
import kotlin.LessonDynamicResponseBody;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SearchTextResponseBody;
import kotlin.accessgetEmptyStatecp;
import kotlin.getAnswerMap;
import kotlin.getSegmentStartTimeUs;
import kotlin.getSubjectTitle;
import kotlin.setRootSubjectId;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\t\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\t2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\n¢\u0006\u0004\b\u0011\u0010\r\u001a)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\t\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\t¢\u0006\u0004\b\u0006\u0010\u0015\u001aU\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\t2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\t0\n¢\u0006\u0004\b\u0016\u0010\r\u001a/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0007\u001a/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\t\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\t¢\u0006\u0004\b\u0017\u0010\u0015"}, d2 = {"T", "Lcom/marrow/data/api/models/response/ApiResponse;", "Lcom/marrow/data/api/models/MarrowResponse;", "asMarrowResponse", "(Lcom/marrow/data/api/models/response/ApiResponse;)Lcom/marrow/data/api/models/MarrowResponse;", "Lo/accessgetEmptyStatecp;", "toMarrowResponse", "(Lo/accessgetEmptyStatecp;)Lo/accessgetEmptyStatecp;", "R", "Lo/LessonDynamicResponseBody;", "Lkotlin/Function1;", "p0", "nestedMap", "(Lo/LessonDynamicResponseBody;Lo/getAnswerMap;)Lo/LessonDynamicResponseBody;", "Lo/getSubscriptionExpiresOn;", "", "", "errorIf", "Lo/SearchTextResponseBody;", "executeSync", "(Lo/SearchTextResponseBody;)Lcom/marrow/data/api/models/MarrowResponse;", "(Lo/LessonDynamicResponseBody;)Lo/LessonDynamicResponseBody;", "flatMapResponse", "handleProcessingError"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ResponseExtensionsKt {
    public static final <T> MarrowResponse<T> asMarrowResponse(ApiResponse<T> apiResponse) {
        toMagicModuleMetaRepoModel.write(apiResponse, "");
        if (apiResponse.isSuccessful() && apiResponse.hasData()) {
            Data<T> data = apiResponse.data;
            toMagicModuleMetaRepoModel.write(data);
            return new Success(data.data);
        }
        if (apiResponse.isSuccessful()) {
            return new Failed(AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED);
        }
        int i = apiResponse.code;
        String str = apiResponse.errorMessage;
        return new Failed(i, str != null ? str : "");
    }

    public static final <T> accessgetEmptyStatecp<MarrowResponse<T>> toMarrowResponse(accessgetEmptyStatecp<ApiResponse<T>> accessgetemptystatecp) {
        toMagicModuleMetaRepoModel.write(accessgetemptystatecp, "");
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda5
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ResponseExtensionsKt.toMarrowResponse$lambda$0((ApiResponse) obj);
            }
        };
        accessgetEmptyStatecp<R> accessgetemptystatecpRemoteActionCompatParcelizer = accessgetemptystatecp.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda6
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.toMarrowResponse$lambda$1(getanswermap, obj);
            }
        });
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda7
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ResponseExtensionsKt.toMarrowResponse$lambda$2((Throwable) obj);
            }
        };
        accessgetEmptyStatecp<MarrowResponse<T>> accessgetemptystatecp2 = accessgetemptystatecpRemoteActionCompatParcelizer.read((getSubjectTitle<? super Throwable, ? extends R>) new getSubjectTitle() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda8
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.toMarrowResponse$lambda$3(getanswermap2, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecp2, "");
        return accessgetemptystatecp2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse toMarrowResponse$lambda$1(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse toMarrowResponse$lambda$0(ApiResponse apiResponse) {
        toMagicModuleMetaRepoModel.write(apiResponse, "");
        return asMarrowResponse(apiResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse toMarrowResponse$lambda$3(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse toMarrowResponse$lambda$2(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        return new MarrowError(th);
    }

    public static final <T, R> LessonDynamicResponseBody<MarrowResponse<R>> nestedMap(LessonDynamicResponseBody<MarrowResponse<T>> lessonDynamicResponseBody, final getAnswerMap<? super T, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(lessonDynamicResponseBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda14
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ResponseExtensionsKt.nestedMap$lambda$0(getanswermap, (MarrowResponse) obj);
            }
        };
        LessonDynamicResponseBody<R> lessonDynamicResponseBody2 = lessonDynamicResponseBody.read(new getSubjectTitle() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda15
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.nestedMap$lambda$1(getanswermap2, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBody2, "");
        return lessonDynamicResponseBody2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse nestedMap$lambda$0(final getAnswerMap getanswermap, MarrowResponse marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        return getSegmentStartTimeUs.AudioAttributesCompatParcelizer(marrowResponse, new getAnswerMap() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getanswermap.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse nestedMap$lambda$1(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    public static final <T> LessonDynamicResponseBody<MarrowResponse<T>> errorIf(LessonDynamicResponseBody<MarrowResponse<T>> lessonDynamicResponseBody, final getAnswerMap<? super T, Pair<Boolean, String>> getanswermap) {
        toMagicModuleMetaRepoModel.write(lessonDynamicResponseBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda16
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ResponseExtensionsKt.errorIf$lambda$0(getanswermap, (MarrowResponse) obj);
            }
        };
        LessonDynamicResponseBody<MarrowResponse<T>> lessonDynamicResponseBody2 = (LessonDynamicResponseBody<MarrowResponse<T>>) lessonDynamicResponseBody.read(new getSubjectTitle() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda17
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.errorIf$lambda$1(getanswermap2, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBody2, "");
        return lessonDynamicResponseBody2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse errorIf$lambda$1(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse errorIf$lambda$0(final getAnswerMap getanswermap, MarrowResponse marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        return getSegmentStartTimeUs.IconCompatParcelizer(getSegmentStartTimeUs.AudioAttributesCompatParcelizer(marrowResponse, new getAnswerMap() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda10
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ResponseExtensionsKt.errorIf$lambda$0$0(getanswermap, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse errorIf$lambda$0$0(getAnswerMap getanswermap, Object obj) {
        Pair pair = (Pair) getanswermap.invoke(obj);
        boolean zBooleanValue = ((Boolean) pair.RemoteActionCompatParcelizer()).booleanValue();
        String str = (String) pair.read();
        if (zBooleanValue) {
            return new Failed(ResponseError.NO_INTERNET_ERROR, str);
        }
        return new Success(obj);
    }

    public static final <T> MarrowResponse<T> executeSync(SearchTextResponseBody<ApiResponse<T>> searchTextResponseBody) {
        toMagicModuleMetaRepoModel.write(searchTextResponseBody, "");
        try {
            ApiResponse<T> apiResponseAudioAttributesCompatParcelizer = searchTextResponseBody.read().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.write(apiResponseAudioAttributesCompatParcelizer);
            return asMarrowResponse(apiResponseAudioAttributesCompatParcelizer);
        } catch (Throwable th) {
            return new MarrowError(th);
        }
    }

    public static final <T> LessonDynamicResponseBody<MarrowResponse<T>> toMarrowResponse(LessonDynamicResponseBody<ApiResponse<T>> lessonDynamicResponseBody) {
        toMagicModuleMetaRepoModel.write(lessonDynamicResponseBody, "");
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda2
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ResponseExtensionsKt.toMarrowResponse$lambda$4((ApiResponse) obj);
            }
        };
        LessonDynamicResponseBody<MarrowResponse<T>> lessonDynamicResponseBodyWrite = lessonDynamicResponseBody.read(new getSubjectTitle() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda3
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.toMarrowResponse$lambda$5(getanswermap, obj);
            }
        }).write((getSubjectTitle<Throwable, ? extends R>) new getSubjectTitle() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda4
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.toMarrowResponse$lambda$6((Throwable) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, "");
        return lessonDynamicResponseBodyWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse toMarrowResponse$lambda$5(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse toMarrowResponse$lambda$4(ApiResponse apiResponse) {
        toMagicModuleMetaRepoModel.write(apiResponse, "");
        return asMarrowResponse(apiResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse toMarrowResponse$lambda$6(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        return new MarrowError(th);
    }

    public static final <T, R> LessonDynamicResponseBody<MarrowResponse<R>> flatMapResponse(LessonDynamicResponseBody<MarrowResponse<T>> lessonDynamicResponseBody, final getAnswerMap<? super T, ? extends LessonDynamicResponseBody<MarrowResponse<R>>> getanswermap) {
        toMagicModuleMetaRepoModel.write(lessonDynamicResponseBody, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ResponseExtensionsKt.flatMapResponse$lambda$0(getanswermap, (MarrowResponse) obj);
            }
        };
        LessonDynamicResponseBody<R> lessonDynamicResponseBodyRemoteActionCompatParcelizer = lessonDynamicResponseBody.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda9
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.flatMapResponse$lambda$1(getanswermap2, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId flatMapResponse$lambda$1(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (setRootSubjectId) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setRootSubjectId flatMapResponse$lambda$0(getAnswerMap getanswermap, MarrowResponse marrowResponse) {
        LessonDynamicResponseBody lessonDynamicResponseBodyRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Success) {
            lessonDynamicResponseBodyRemoteActionCompatParcelizer = (LessonDynamicResponseBody) getanswermap.invoke(((Success) marrowResponse).getData());
        } else if (marrowResponse instanceof Failed) {
            lessonDynamicResponseBodyRemoteActionCompatParcelizer = LessonDynamicResponseBody.RemoteActionCompatParcelizer(new Failed(((Failed) marrowResponse).getError()));
        } else if (marrowResponse instanceof MarrowError) {
            lessonDynamicResponseBodyRemoteActionCompatParcelizer = LessonDynamicResponseBody.RemoteActionCompatParcelizer(new MarrowError(((MarrowError) marrowResponse).getThrowable()));
        } else {
            lessonDynamicResponseBodyRemoteActionCompatParcelizer = LessonDynamicResponseBody.RemoteActionCompatParcelizer(new MarrowError(new RuntimeException("Unreach error")));
        }
        return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
    }

    public static final <T> accessgetEmptyStatecp<MarrowResponse<T>> handleProcessingError(accessgetEmptyStatecp<MarrowResponse<T>> accessgetemptystatecp) {
        toMagicModuleMetaRepoModel.write(accessgetemptystatecp, "");
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda11
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ResponseExtensionsKt.handleProcessingError$lambda$0((Throwable) obj);
            }
        };
        accessgetEmptyStatecp<MarrowResponse<T>> accessgetemptystatecp2 = accessgetemptystatecp.read(new getSubjectTitle() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda12
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.handleProcessingError$lambda$1(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecp2, "");
        return accessgetemptystatecp2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse handleProcessingError$lambda$0(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        return new MarrowError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse handleProcessingError$lambda$1(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    public static final <T> LessonDynamicResponseBody<MarrowResponse<T>> handleProcessingError(LessonDynamicResponseBody<MarrowResponse<T>> lessonDynamicResponseBody) {
        toMagicModuleMetaRepoModel.write(lessonDynamicResponseBody, "");
        LessonDynamicResponseBody<MarrowResponse<T>> lessonDynamicResponseBodyWrite = lessonDynamicResponseBody.write(new getSubjectTitle() { // from class: com.marrow.data.api.models.ResponseExtensionsKt$$ExternalSyntheticLambda13
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ResponseExtensionsKt.handleProcessingError$lambda$2((Throwable) obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, "");
        return lessonDynamicResponseBodyWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse handleProcessingError$lambda$2(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        return new MarrowError(th);
    }
}
