package kotlin;

import java.text.BreakIterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a#\u0010\u0003\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\b\u001a#\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\t\u001a\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "", "p0", "RemoteActionCompatParcelizer", "(Ljava/lang/String;I)I", "IconCompatParcelizer", "", "p1", "(Ljava/lang/CharSequence;II)I", "(Ljava/lang/String;II)I", "Lo/_booleanType;", "write", "()Lo/_booleanType;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setFractionalTextSize {
    public static final int RemoteActionCompatParcelizer(String str, int i) {
        _booleanType _booleantypeWrite = write();
        Integer num = null;
        if (_booleantypeWrite != null) {
            Integer numValueOf = Integer.valueOf(_booleantypeWrite.IconCompatParcelizer(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final int IconCompatParcelizer(String str, int i) {
        _booleanType _booleantypeWrite = write();
        Integer num = null;
        if (_booleantypeWrite != null) {
            Integer numValueOf = Integer.valueOf(_booleantypeWrite.AudioAttributesCompatParcelizer(str, i));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    private static final int RemoteActionCompatParcelizer(CharSequence charSequence, int i, int i2) {
        return i <= 0 ? i2 : Character.offsetByCodePoints(charSequence, i, -1);
    }

    public static final int RemoteActionCompatParcelizer(String str, int i, int i2) {
        if (i <= 0) {
            return i2;
        }
        _booleanType _booleantypeWrite = write();
        if (_booleantypeWrite == null) {
            return RemoteActionCompatParcelizer((CharSequence) str, i, i2);
        }
        String str2 = str;
        int iIconCompatParcelizer = _booleantypeWrite.IconCompatParcelizer(str2, i - 1);
        return iIconCompatParcelizer < 0 ? RemoteActionCompatParcelizer((CharSequence) str2, i, i2) : iIconCompatParcelizer;
    }

    private static final _booleanType write() {
        if (!_booleanType.read()) {
            return null;
        }
        _booleanType _booleantypeAudioAttributesCompatParcelizer = _booleanType.AudioAttributesCompatParcelizer();
        if (_booleantypeAudioAttributesCompatParcelizer.IconCompatParcelizer() == 1) {
            return _booleantypeAudioAttributesCompatParcelizer;
        }
        return null;
    }
}
