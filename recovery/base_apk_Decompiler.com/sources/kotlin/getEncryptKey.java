package kotlin;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getEncryptKey implements setQuestionCount {
    public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer(0);

    protected abstract Type RemoteActionCompatParcelizer();

    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static getEncryptKey IconCompatParcelizer(Type type) {
            toMagicModuleMetaRepoModel.write(type, "");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new setThumbnailWidth(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new getImageCitationAuthor(type);
            }
            return type instanceof WildcardType ? new setImageType((WildcardType) type) : new getThumbnailHeight(type);
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof getEncryptKey) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), ((getEncryptKey) obj).RemoteActionCompatParcelizer());
    }

    public int hashCode() {
        return RemoteActionCompatParcelizer().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(RemoteActionCompatParcelizer());
        return sb.toString();
    }

    @Override // kotlin.HomeQbankModel
    public RecentUpdatesReferences write(getNotesCount getnotescount) {
        Object obj;
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        Iterator<T> it = read().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            RevisionSubjectStatusModel revisionSubjectStatusModelWrite = ((RecentUpdatesReferences) next).write();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(revisionSubjectStatusModelWrite != null ? revisionSubjectStatusModelWrite.AudioAttributesCompatParcelizer() : null, getnotescount)) {
                obj = next;
                break;
            }
        }
        return (RecentUpdatesReferences) obj;
    }
}
