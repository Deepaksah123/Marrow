package kotlin;

import android.widget.Checkable;
import kotlin.skipFullyQuietly;

/* JADX INFO: loaded from: classes3.dex */
public interface skipFullyQuietly<T extends skipFullyQuietly<T>> extends Checkable {

    public interface RemoteActionCompatParcelizer<C> {
        void AudioAttributesCompatParcelizer(C c, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer);
}
