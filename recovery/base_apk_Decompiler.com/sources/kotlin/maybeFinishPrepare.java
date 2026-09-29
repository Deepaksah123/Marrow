package kotlin;

import com.marrow.data.api.models.response.sync.SyncResult;

/* JADX INFO: loaded from: classes.dex */
public interface maybeFinishPrepare {

    public interface AudioAttributesCompatParcelizer {
        void write();
    }

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(int i);

        void IconCompatParcelizer(int i, SyncResult syncResult);

        void read(int i, SyncResult syncResult);

        void write(int i, SyncResult syncResult);
    }
}
