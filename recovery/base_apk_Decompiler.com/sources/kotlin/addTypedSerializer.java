package kotlin;

import java.util.List;
import kotlin.AttributePropertyWriter;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public interface addTypedSerializer extends MapLikeType {

    public interface write {
        addTypedSerializer AudioAttributesCompatParcelizer(classForName classforname, FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, typedValueSerializer typedvalueserializer, int i, int[] iArr, _verifyAndResolvePlaceholders _verifyandresolveplaceholders, int i2, long j, boolean z, List<C0170format> list, AttributePropertyWriter.write writeVar, TypeNameIdResolver typeNameIdResolver, modifyArraySerializer modifyarrayserializer, _fromClass _fromclass);

        default write IconCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
            return this;
        }

        default write IconCompatParcelizer(boolean z) {
            return this;
        }

        default C0170format read(C0170format c0170format) {
            return c0170format;
        }
    }

    void RemoteActionCompatParcelizer(FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, int i);

    void RemoteActionCompatParcelizer(_verifyAndResolvePlaceholders _verifyandresolveplaceholders);
}
