package kotlin;

import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {TarConstants.VERSION_ANT}, d2 = {}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _findSyncTypeName {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements getAnswerMap<ObjectIdReferenceProperty, Boolean> {
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(ObjectIdReferenceProperty objectIdReferenceProperty) {
            return Boolean.valueOf(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) objectIdReferenceProperty.getWrite(), (Object) "remember"));
        }
    }
}
