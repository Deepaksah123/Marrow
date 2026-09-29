package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.response.common.AttestationResponseBody;
import com.marrow.data.api.models.response.common.FIDResponseBody;
import com.marrow.data.api.models.response.common.SecurityResponseBody;
import com.marrow.data.api.models.response.security.playintegrity.PlayIntegrityResponseBody;
import com.marrow2.data.user.remote.model.ImageTokenRSModel;

/* JADX INFO: loaded from: classes3.dex */
public interface Cea608DecoderCueBuilderCueStyle {
    LessonDynamicResponseBody<MarrowResponse<SecurityResponseBody>> AudioAttributesCompatParcelizer();

    LessonDynamicResponseBody<MarrowResponse<AttestationResponseBody>> IconCompatParcelizer();

    LessonDynamicResponseBody<MarrowResponse<FIDResponseBody>> IconCompatParcelizer(String str);

    LessonDynamicResponseBody<MarrowResponse<FIDResponseBody>> RemoteActionCompatParcelizer();

    LessonDynamicResponseBody<MarrowResponse<PlayIntegrityResponseBody>> RemoteActionCompatParcelizer(String str);

    LessonDynamicResponseBody<MarrowResponse<ImageTokenRSModel>> write();
}
