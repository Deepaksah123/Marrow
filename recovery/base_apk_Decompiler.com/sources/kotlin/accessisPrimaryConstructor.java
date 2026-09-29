package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2;

/* JADX INFO: loaded from: classes2.dex */
public final class accessisPrimaryConstructor<Key, Value> {
    private final Integer AudioAttributesCompatParcelizer;
    private final List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> IconCompatParcelizer;
    private final accessfilterOutSingleStringCallables RemoteActionCompatParcelizer;
    private final int write;

    public accessisPrimaryConstructor(List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> list, Integer num, accessfilterOutSingleStringCallables accessfilteroutsinglestringcallables, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(accessfilteroutsinglestringcallables, "");
        this.IconCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = num;
        this.RemoteActionCompatParcelizer = accessfilteroutsinglestringcallables;
        this.write = i;
    }

    public final List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> read() {
        return this.IconCompatParcelizer;
    }

    public final Integer RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof accessisPrimaryConstructor)) {
            return false;
        }
        accessisPrimaryConstructor accessisprimaryconstructor = (accessisPrimaryConstructor) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, accessisprimaryconstructor.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, accessisprimaryconstructor.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, accessisprimaryconstructor.RemoteActionCompatParcelizer) && this.write == accessisprimaryconstructor.write;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        Integer num = this.AudioAttributesCompatParcelizer;
        return iHashCode + (num != null ? num.hashCode() : 0) + this.RemoteActionCompatParcelizer.hashCode() + Integer.hashCode(this.write);
    }

    public final Value AudioAttributesCompatParcelizer(int i) {
        List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> list = this.IconCompatParcelizer;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write) it.next()).IconCompatParcelizer().isEmpty()) {
                int size = i - this.write;
                int i2 = 0;
                while (i2 < IntermediateLoginResponseBody.write((List) read()) && size > IntermediateLoginResponseBody.write((List) read().get(i2).IconCompatParcelizer())) {
                    size -= read().get(i2).IconCompatParcelizer().size();
                    i2++;
                }
                Iterator<T> it2 = this.IconCompatParcelizer.iterator();
                while (it2.hasNext()) {
                    KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write writeVar = (KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write) it2.next();
                    if (!writeVar.IconCompatParcelizer().isEmpty()) {
                        List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> list2 = this.IconCompatParcelizer;
                        ListIterator<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> listIterator = list2.listIterator(list2.size());
                        while (listIterator.hasPrevious()) {
                            KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value> writeVarPrevious = listIterator.previous();
                            if (!writeVarPrevious.IconCompatParcelizer().isEmpty()) {
                                if (size < 0) {
                                    return (Value) IntermediateLoginResponseBody.RatingCompat((List) writeVar.IconCompatParcelizer());
                                }
                                if (i2 == IntermediateLoginResponseBody.write((List) this.IconCompatParcelizer) && size > IntermediateLoginResponseBody.write((List) ((KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) this.IconCompatParcelizer)).IconCompatParcelizer())) {
                                    return (Value) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) writeVarPrevious.IconCompatParcelizer());
                                }
                                return this.IconCompatParcelizer.get(i2).IconCompatParcelizer().get(size);
                            }
                        }
                        throw new NoSuchElementException("List contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return null;
    }

    public final KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value> IconCompatParcelizer(int i) {
        List<KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write<Key, Value>> list = this.IconCompatParcelizer;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write) it.next()).IconCompatParcelizer().isEmpty()) {
                int size = i - this.write;
                int i2 = 0;
                while (i2 < IntermediateLoginResponseBody.write((List) read()) && size > IntermediateLoginResponseBody.write((List) read().get(i2).IconCompatParcelizer())) {
                    size -= read().get(i2).IconCompatParcelizer().size();
                    i2++;
                }
                if (size < 0) {
                    return (KotlinNamesAnnotationIntrospectorhasCreatorAnnotation2.IconCompatParcelizer.write) IntermediateLoginResponseBody.RatingCompat((List) this.IconCompatParcelizer);
                }
                return this.IconCompatParcelizer.get(i2);
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", anchorPosition=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", config=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", leadingPlaceholderCount=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
