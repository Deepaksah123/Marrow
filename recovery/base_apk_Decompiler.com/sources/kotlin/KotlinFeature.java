package kotlin;

import kotlin.getInstanceParameter;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinFeature {
    public static final boolean IconCompatParcelizer(getInstanceParameter getinstanceparameter, getInstanceParameter getinstanceparameter2, accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter) {
        toMagicModuleMetaRepoModel.write(getinstanceparameter, "");
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        if (getinstanceparameter2 == null) {
            return true;
        }
        if ((getinstanceparameter2 instanceof getInstanceParameter.AudioAttributesCompatParcelizer) && (getinstanceparameter instanceof getInstanceParameter.IconCompatParcelizer)) {
            return true;
        }
        if ((getinstanceparameter instanceof getInstanceParameter.AudioAttributesCompatParcelizer) && (getinstanceparameter2 instanceof getInstanceParameter.IconCompatParcelizer)) {
            return false;
        }
        return (getinstanceparameter.getAudioAttributesCompatParcelizer() == getinstanceparameter2.getAudioAttributesCompatParcelizer() && getinstanceparameter.getRead() == getinstanceparameter2.getRead() && getinstanceparameter2.RemoteActionCompatParcelizer(accessgetstaticjsonkeygetter) <= getinstanceparameter.RemoteActionCompatParcelizer(accessgetstaticjsonkeygetter)) ? false : true;
    }
}
