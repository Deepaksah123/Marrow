package kotlin;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.getEncryptKey;

/* JADX INFO: loaded from: classes4.dex */
public final class getImageCitationAuthor extends getEncryptKey implements isUnattempted {
    private final getEncryptKey AudioAttributesCompatParcelizer;
    private final Type IconCompatParcelizer;
    private final Collection<RecentUpdatesReferences> RemoteActionCompatParcelizer;
    private final boolean read;

    public getImageCitationAuthor(Type type) {
        getEncryptKey getencryptkeyIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(type, "");
        this.IconCompatParcelizer = type;
        Type typeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (!(typeRemoteActionCompatParcelizer instanceof GenericArrayType)) {
            if (typeRemoteActionCompatParcelizer instanceof Class) {
                Class cls = (Class) typeRemoteActionCompatParcelizer;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(componentType, "");
                    getencryptkeyIconCompatParcelizer = getEncryptKey.RemoteActionCompatParcelizer.IconCompatParcelizer(componentType);
                }
            }
            StringBuilder sb = new StringBuilder("Not an array type (");
            sb.append(RemoteActionCompatParcelizer().getClass());
            sb.append("): ");
            sb.append(RemoteActionCompatParcelizer());
            throw new IllegalArgumentException(sb.toString());
        }
        Type genericComponentType = ((GenericArrayType) typeRemoteActionCompatParcelizer).getGenericComponentType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericComponentType, "");
        getencryptkeyIconCompatParcelizer = getEncryptKey.RemoteActionCompatParcelizer.IconCompatParcelizer(genericComponentType);
        this.AudioAttributesCompatParcelizer = getencryptkeyIconCompatParcelizer;
        this.RemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getEncryptKey
    protected final Type RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isUnattempted
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public getEncryptKey AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.HomeQbankModel
    public final Collection<RecentUpdatesReferences> read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.HomeQbankModel
    public final boolean IconCompatParcelizer() {
        return this.read;
    }
}
