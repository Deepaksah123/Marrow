package kotlin;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0002\u0010\r"}, d2 = {"Lo/findNullValueSerializer;", "Lo/AbstractDeserializer;", "RemoteActionCompatParcelizer", "(Lo/findNullValueSerializer;Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "(Lo/AbstractDeserializer;)Lo/findNullValueSerializer;", "Lo/findNullKeySerializer;", "", "write", "(Lo/findNullKeySerializer;)Z", "", "AudioAttributesCompatParcelizer", "(Lo/AbstractDeserializer;)Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;)Lo/AbstractDeserializer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setStableInsets {
    public static final boolean RemoteActionCompatParcelizer(findNullKeySerializer findnullkeyserializer) {
        return true;
    }

    public static final boolean write(findNullKeySerializer findnullkeyserializer) {
        return true;
    }

    public static final Object RemoteActionCompatParcelizer(findNullValueSerializer findnullvalueserializer, SampleVideos<? super AbstractDeserializer> sampleVideos) {
        return setRootWindowInsets.IconCompatParcelizer(findnullvalueserializer);
    }

    public static final findNullValueSerializer IconCompatParcelizer(AbstractDeserializer abstractDeserializer) {
        return setRootWindowInsets.read(abstractDeserializer);
    }

    public static final CharSequence AudioAttributesCompatParcelizer(AbstractDeserializer abstractDeserializer) {
        if (abstractDeserializer.read().isEmpty()) {
            return abstractDeserializer.getIconCompatParcelizer();
        }
        SpannableString spannableString = new SpannableString(abstractDeserializer.getIconCompatParcelizer());
        WindowInsetsCompatImpl20 windowInsetsCompatImpl20 = new WindowInsetsCompatImpl20();
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> list = abstractDeserializer.read();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper> audioAttributesCompatParcelizer = list.get(i);
            _findPropertyUnwrapper _findpropertyunwrapperRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            int write = audioAttributesCompatParcelizer.getWrite();
            int iWrite = audioAttributesCompatParcelizer.write();
            windowInsetsCompatImpl20.IconCompatParcelizer();
            windowInsetsCompatImpl20.AudioAttributesCompatParcelizer(_findpropertyunwrapperRemoteActionCompatParcelizer);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", windowInsetsCompatImpl20.RemoteActionCompatParcelizer()), write, iWrite, 33);
        }
        return spannableString;
    }

    public static final AbstractDeserializer RemoteActionCompatParcelizer(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AbstractDeserializer(charSequence.toString(), null, 2, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iMediaDescriptionCompat = getOrderDetails.MediaDescriptionCompat(annotationArr);
        if (iMediaDescriptionCompat >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) annotation.getKey(), (Object) "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new AbstractDeserializer.AudioAttributesCompatParcelizer(new setSystemUiVisibility(annotation.getValue()).read(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == iMediaDescriptionCompat) {
                    break;
                }
                i++;
            }
        }
        return new AbstractDeserializer(charSequence.toString(), arrayList, null, 4, null);
    }
}
