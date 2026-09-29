package com.marrow.data.dataprovider.magic_module.local;

import com.marrow.data.dataprovider.magic_module.local.model.MagicModuleMetaLSModel;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleModel;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleStatusUcModel;
import com.marrow.data.models.magicModule.MagicModuleTimeline;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u000ej\u0002`\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\nH&¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u0019H&¢\u0006\u0004\b\u001e\u0010\u001fÀ\u0006\u0003"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocal;", "", "Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;", "getMagicModuleMetaData", "()Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "p0", "", "saveMagicModuleModel", "(Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;)V", "", "", "getMagicModuleSavedMcqCount", "(Ljava/lang/String;)I", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatsLSModel;", "saveMagicModuleStats", "(Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;)V", "getMagicModuleStats", "()Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "getAnsweredMcqCount", "invalidateDetail", "(Ljava/lang/String;)V", "setMagicModuleDownloadTime", "()V", "", "Lcom/marrow/data/models/magicModule/MagicModuleTimeline;", "Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleTimelineLSModel;", "saveMagicModuleTimeline", "(Ljava/util/List;)V", "getMagicModuleTimeline", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MagicModuleLocal {
    int getAnsweredMcqCount(String p0);

    MagicModuleMetaLSModel getMagicModuleMetaData();

    int getMagicModuleSavedMcqCount(String p0);

    MagicModuleStatusUcModel getMagicModuleStats();

    List<MagicModuleTimeline> getMagicModuleTimeline();

    void invalidateDetail(String p0);

    void saveMagicModuleModel(MagicModuleModel p0);

    void saveMagicModuleStats(MagicModuleStatusUcModel p0);

    void saveMagicModuleTimeline(List<MagicModuleTimeline> p0);

    void setMagicModuleDownloadTime();
}
