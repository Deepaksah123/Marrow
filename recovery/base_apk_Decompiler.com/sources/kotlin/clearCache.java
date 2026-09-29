package kotlin;

import kotlin.isResolutionNotSupported;

/* JADX INFO: loaded from: classes4.dex */
public interface clearCache<D, E, V> extends isResolutionNotSupported<V>, MagicModuleSubmissionRequestBody<D, E, V> {

    public interface IconCompatParcelizer<D, E, V> extends isResolutionNotSupported.IconCompatParcelizer<V>, MagicModuleSubmissionRequestBody<D, E, V> {
    }

    V read(D d, E e);

    IconCompatParcelizer<D, E, V> write();
}
