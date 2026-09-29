package kotlin;

import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class getSegmentStartTimeUs {
    public static final <T, R> MarrowResponse<R> AudioAttributesCompatParcelizer(MarrowResponse<T> marrowResponse, getAnswerMap<? super T, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        if (marrowResponse instanceof Success) {
            return new Success(getanswermap.invoke((Object) ((Success) marrowResponse).getData()));
        }
        if (marrowResponse instanceof Failed) {
            return new Failed(((Failed) marrowResponse).getError());
        }
        if (marrowResponse instanceof MarrowError) {
            return new MarrowError(((MarrowError) marrowResponse).getThrowable());
        }
        throw new RenewEligibleCreator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(Object[] objArr) {
        toMagicModuleMetaRepoModel.write(objArr, "");
        return IntermediateLoginResponseBody.RatingCompat(getOrderDetails.onCommand(objArr));
    }

    public static final <T> MarrowResponse<T> write(MarrowResponse<T[]> marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        return AudioAttributesCompatParcelizer(marrowResponse, new eventStreamId());
    }

    public static final <T> T AudioAttributesCompatParcelizer(MarrowResponse<T> marrowResponse) throws Throwable {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Success) {
            return (T) ((Success) marrowResponse).getData();
        }
        if (marrowResponse instanceof Failed) {
            throw new ResponseErrorException(((Failed) marrowResponse).getError());
        }
        if (!(marrowResponse instanceof MarrowError)) {
            throw new RenewEligibleCreator();
        }
        throw ((MarrowError) marrowResponse).getThrowable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(MarrowResponse marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        return AudioAttributesCompatParcelizer(marrowResponse);
    }

    public static final <T> accessgetEmptyStatecp<T> read(accessgetEmptyStatecp<MarrowResponse<T>> accessgetemptystatecp) {
        toMagicModuleMetaRepoModel.write(accessgetemptystatecp, "");
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.isSegmentAvailableAtFullNetworkSpeed
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getSegmentStartTimeUs.read((MarrowResponse) obj);
            }
        };
        accessgetEmptyStatecp<T> accessgetemptystatecp2 = (accessgetEmptyStatecp<T>) accessgetemptystatecp.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.EventSampleStream
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return getSegmentStartTimeUs.RemoteActionCompatParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecp2, "");
        return accessgetemptystatecp2;
    }

    public static final <T> MarrowResponse<T> IconCompatParcelizer(accessgetEmptyStatecp<MarrowResponse<T>> accessgetemptystatecp) {
        toMagicModuleMetaRepoModel.write(accessgetemptystatecp, "");
        try {
            MarrowResponse<T> marrowResponseWrite = accessgetemptystatecp.write();
            toMagicModuleMetaRepoModel.write(marrowResponseWrite);
            return marrowResponseWrite;
        } catch (Throwable th) {
            return new MarrowError(th);
        }
    }

    public static final <T> MarrowResponse<T> IconCompatParcelizer(MarrowResponse<MarrowResponse<T>> marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Success) {
            Success success = (Success) marrowResponse;
            MarrowResponse marrowResponse2 = (MarrowResponse) success.getData();
            if (marrowResponse2 instanceof Success) {
                return new Success(((Success) success.getData()).getData());
            }
            if (marrowResponse2 instanceof Failed) {
                return new Failed(((Failed) success.getData()).getError());
            }
            if (marrowResponse2 instanceof MarrowError) {
                return new MarrowError(((MarrowError) success.getData()).getThrowable());
            }
            throw new RenewEligibleCreator();
        }
        if (marrowResponse instanceof Failed) {
            return new Failed(((Failed) marrowResponse).getError());
        }
        if (!(marrowResponse instanceof MarrowError)) {
            throw new RenewEligibleCreator();
        }
        return new MarrowError(((MarrowError) marrowResponse).getThrowable());
    }

    public static final <T> MarrowResponse<T> AudioAttributesCompatParcelizer(T t) {
        return new Success(t);
    }

    public static final String RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        String str2 = (String) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(TestGroupLSModel.write(str, new String[]{"."}, 0, 6));
        return str2 == null ? "" : str2;
    }

    public static final String write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return String.valueOf(Integer.parseInt((String) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem(TestGroupLSModel.write(RemoteActionCompatParcelizer(str), new String[]{"_"}, 0, 6))));
    }
}
