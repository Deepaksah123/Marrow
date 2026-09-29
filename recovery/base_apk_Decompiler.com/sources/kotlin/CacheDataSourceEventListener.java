package kotlin;

import com.marrow.data.models.magicModule.MagicModuleTimeline;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface CacheDataSourceEventListener {
    Object read();

    Object read(List<MagicModuleTimeline> list);
}
