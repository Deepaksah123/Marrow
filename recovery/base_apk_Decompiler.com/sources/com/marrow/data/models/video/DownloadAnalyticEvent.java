package com.marrow.data.models.video;

import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/marrow/data/models/video/DownloadAnalyticEvent;", "", NotesDispatchAddressRequestKt.KEY_STATE, "", "map", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "<init>", "(ILjava/util/HashMap;)V", "getState", "()I", "setState", "(I)V", "getMap", "()Ljava/util/HashMap;", "setMap", "(Ljava/util/HashMap;)V", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DownloadAnalyticEvent {
    public static final String LESSON_ID = "lesson_id";
    public static final int STATE_DOWNLOAD_COMPLETED = 2;
    public static final int STATE_INIT_DOWNLOAD = 1;
    public static final int STATE_PAUSE_DOWNLOAD = 3;
    public static final int STATE_SERVICE_TIMEOUT = 5;
    public static final int STATE_STOP_DOWNLOAD = 4;
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;
    private HashMap<String, String> map;
    private int state;

    public DownloadAnalyticEvent(int i, HashMap<String, String> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.state = i;
        this.map = map;
    }

    public final HashMap<String, String> getMap() {
        return this.map;
    }

    public final int getState() {
        return this.state;
    }

    public final void setMap(HashMap<String, String> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.map = map;
    }

    public final void setState(int i) {
        this.state = i;
    }
}
