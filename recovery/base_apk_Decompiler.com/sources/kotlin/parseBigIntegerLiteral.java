package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00138\u0007¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\t\u0010\u0015"}, d2 = {"", "", "", "", "p0", "Lkotlin/Function1;", "", "p1", "Lo/JavaBigIntegerFromCharSequence;", "AudioAttributesCompatParcelizer", "(Ljava/util/Map;Lo/getAnswerMap;)Lo/JavaBigIntegerFromCharSequence;", "", "write", "(Ljava/lang/CharSequence;)Z", "K", "V", "Lo/setKeyListener;", "read", "(Ljava/util/Map;)Lo/setKeyListener;", "Lo/CharacterEscapes;", "Lo/CharacterEscapes;", "()Lo/CharacterEscapes;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class parseBigIntegerLiteral {
    private static final CharacterEscapes<JavaBigIntegerFromCharSequence> AudioAttributesCompatParcelizer = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.parseDecDigits
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return parseBigIntegerLiteral.RemoteActionCompatParcelizer();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaBigIntegerFromCharSequence RemoteActionCompatParcelizer() {
        return null;
    }

    public static final JavaBigIntegerFromCharSequence AudioAttributesCompatParcelizer(Map<String, ? extends List<? extends Object>> map, getAnswerMap<Object, Boolean> getanswermap) {
        return new parseBigDecimalStringWithManyDigits(map, getanswermap);
    }

    public static final CharacterEscapes<JavaBigIntegerFromCharSequence> AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!setStatusTimestamp.RemoteActionCompatParcelizer(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> setKeyListener<K, V> read(Map<K, ? extends V> map) {
        setKeyListener<K, V> setkeylistener = new setKeyListener<>(map.size());
        setkeylistener.read((Map) map);
        return setkeylistener;
    }
}
