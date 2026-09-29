package kotlin;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.getEncryptKey;

/* JADX INFO: loaded from: classes4.dex */
public final class getThumbnailHeight extends getEncryptKey implements QbankSubModel {
    private final Type AudioAttributesCompatParcelizer;
    private final setThumbnail RemoteActionCompatParcelizer;

    @Override // kotlin.HomeQbankModel
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public getThumbnailHeight(Type type) {
        getImageCitation getimagecitation;
        toMagicModuleMetaRepoModel.write(type, "");
        this.AudioAttributesCompatParcelizer = type;
        Type typeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (typeRemoteActionCompatParcelizer instanceof Class) {
            getimagecitation = new getImageCitation((Class) typeRemoteActionCompatParcelizer);
        } else if (typeRemoteActionCompatParcelizer instanceof TypeVariable) {
            getimagecitation = new getFileName((TypeVariable) typeRemoteActionCompatParcelizer);
        } else {
            if (!(typeRemoteActionCompatParcelizer instanceof ParameterizedType)) {
                StringBuilder sb = new StringBuilder("Not a classifier type (");
                sb.append(typeRemoteActionCompatParcelizer.getClass());
                sb.append("): ");
                sb.append(typeRemoteActionCompatParcelizer);
                throw new IllegalStateException(sb.toString());
            }
            Type rawType = ((ParameterizedType) typeRemoteActionCompatParcelizer).getRawType();
            toMagicModuleMetaRepoModel.read(rawType, "");
            getimagecitation = new getImageCitation((Class) rawType);
        }
        this.RemoteActionCompatParcelizer = getimagecitation;
    }

    @Override // kotlin.getEncryptKey
    public final Type RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.QbankSubModel
    public final setThumbnail AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.QbankSubModel
    public final String write() {
        StringBuilder sb = new StringBuilder("Type not found: ");
        sb.append(RemoteActionCompatParcelizer());
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // kotlin.QbankSubModel
    public final String MediaBrowserCompatItemReceiver() {
        return RemoteActionCompatParcelizer().toString();
    }

    @Override // kotlin.QbankSubModel
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        Type typeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (!(typeRemoteActionCompatParcelizer instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) typeRemoteActionCompatParcelizer).getTypeParameters();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typeParameters, "");
        return typeParameters.length != 0;
    }

    @Override // kotlin.QbankSubModel
    public final List<setQuestionCount> AudioAttributesImplApi26Parcelizer() {
        List<Type> list = getFinalImageUrl.read(RemoteActionCompatParcelizer());
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getEncryptKey.RemoteActionCompatParcelizer.IconCompatParcelizer((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.HomeQbankModel
    public final Collection<RecentUpdatesReferences> read() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getEncryptKey, kotlin.HomeQbankModel
    public final RecentUpdatesReferences write(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return null;
    }
}
