package kotlin;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes4.dex */
public final class getClassDef extends _anyExplicits {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getClassDef(Fragment fragment) {
        super(fragment, "Attempting to get retain instance for fragment ".concat(String.valueOf(fragment)));
        toMagicModuleMetaRepoModel.write(fragment, "");
    }
}
