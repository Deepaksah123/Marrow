package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "", "p0", "p1", "write", "(Ljava/util/List;II)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _addImplicitConstructorCreators {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> write(List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer> audioAttributesCompatParcelizer = list.get(i3);
            if (withAdditionalKeySerializers.RemoteActionCompatParcelizer(i, i2, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer())) {
                ArrayList arrayList2 = arrayList;
                if (i > audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer() || audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() > i2) {
                    withStackTrace.read("placeholder can not overlap with paragraph.");
                }
                arrayList2.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer(), audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer() - i, audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() - i));
            }
        }
        return arrayList;
    }
}
