package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.marrow.data.api.models.response.Data;
import com.marrow.data.models.ResponseError;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import com.marrow2.core.network.model.NetworkApiResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class createDataSink {
    public static final <T> T RemoteActionCompatParcelizer(NetworkApiResponse<T> networkApiResponse) {
        toMagicModuleMetaRepoModel.write(networkApiResponse, "");
        if (networkApiResponse.isSuccessful() && networkApiResponse.hasData()) {
            Data<T> data = networkApiResponse.getData();
            toMagicModuleMetaRepoModel.write(data);
            return data.data;
        }
        if (networkApiResponse.isSuccessful()) {
            throw new ResponseErrorException(new ResponseError(AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, "No data found", false, 4, null));
        }
        throw new ResponseErrorException(new ResponseError(networkApiResponse.getCode(), networkApiResponse.getErrorMessage(), false, 4, null));
    }

    public static final <T> Data<T> write(NetworkApiResponse<T> networkApiResponse) {
        toMagicModuleMetaRepoModel.write(networkApiResponse, "");
        if (networkApiResponse.isSuccessful() && networkApiResponse.hasData()) {
            Data<T> data = networkApiResponse.getData();
            if (data != null) {
                return data;
            }
            throw new ResponseErrorException(new ResponseError(AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, "No data found", false, 4, null));
        }
        throw new ResponseErrorException(new ResponseError(networkApiResponse.getCode(), networkApiResponse.getErrorMessage(), false, 4, null));
    }
}
