package kotlin;

import com.marrow.data.models.user.State;

/* JADX INFO: loaded from: classes4.dex */
public final class fromLatLngZoom {
    public static final fromPath RemoteActionCompatParcelizer(ensureCapacity ensurecapacity) {
        toMagicModuleMetaRepoModel.write(ensurecapacity, "");
        return new fromPath(ensurecapacity.write(), ensurecapacity.read());
    }

    public static final fromPath RemoteActionCompatParcelizer(State state) {
        toMagicModuleMetaRepoModel.write(state, "");
        String id = state.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String name = state.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        return new fromPath(id, name);
    }
}
