package kotlin;

import com.marrow.data.api.models.response.Data;
import com.marrow2.data.schema.remote.model.SchemaCompletionStatusRSModel;
import com.marrow2.data.schema.remote.model.SchemaDetailRSModel;
import com.marrow2.data.schema.remote.model.SchemaUserStatusRSModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface startWrite {
    Object IconCompatParcelizer(String str, long j, SampleVideos<? super SchemaDetailRSModel> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super SchemaCompletionStatusRSModel> sampleVideos);

    Object write(long j, String str, SampleVideos<? super Data<List<SchemaUserStatusRSModel>>> sampleVideos);
}
