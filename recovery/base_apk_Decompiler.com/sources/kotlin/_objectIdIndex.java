package kotlin;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class _objectIdIndex {
    public static _currentObject read(_currentObject _currentobject, String[] strArr, Map<String, _currentObject> map) {
        int i = 0;
        if (_currentobject == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                _currentObject _currentobject2 = new _currentObject();
                int length = strArr.length;
                while (i < length) {
                    _currentobject2.AudioAttributesCompatParcelizer(map.get(strArr[i]));
                    i++;
                }
                return _currentobject2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return _currentobject.AudioAttributesCompatParcelizer(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    _currentobject.AudioAttributesCompatParcelizer(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return _currentobject;
    }

    public static void IconCompatParcelizer(Spannable spannable, int i, int i2, _currentObject _currentobject, _convertNumberToInt _convertnumbertoint, Map<String, _currentObject> map, int i3) {
        _convertNumberToInt _convertnumbertointIconCompatParcelizer;
        _currentObject _currentobject2;
        int i4;
        int i5;
        if (_currentobject.RatingCompat() != -1) {
            spannable.setSpan(new StyleSpan(_currentobject.RatingCompat()), i, i2, 33);
        }
        if (_currentobject.handleMediaPlayPauseIfPendingOnHandler()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (_currentobject.onCustomAction()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (_currentobject.onCommand()) {
            idFromValueAndType.RemoteActionCompatParcelizer(spannable, new ForegroundColorSpan(_currentobject.IconCompatParcelizer()), i, i2);
        }
        if (_currentobject.MediaBrowserCompatSearchResultReceiver()) {
            idFromValueAndType.RemoteActionCompatParcelizer(spannable, new BackgroundColorSpan(_currentobject.write()), i, i2);
        }
        if (_currentobject.AudioAttributesCompatParcelizer() != null) {
            idFromValueAndType.RemoteActionCompatParcelizer(spannable, new TypefaceSpan(_currentobject.AudioAttributesCompatParcelizer()), i, i2);
        }
        if (_currentobject.MediaMetadataCompat() != null) {
            TokenBufferParser tokenBufferParser = (TokenBufferParser) buildTypeSerializer.IconCompatParcelizer(_currentobject.MediaMetadataCompat());
            if (tokenBufferParser.AudioAttributesCompatParcelizer == -1) {
                i4 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i5 = 1;
            } else {
                i4 = tokenBufferParser.AudioAttributesCompatParcelizer;
                i5 = tokenBufferParser.read;
            }
            idFromValueAndType.RemoteActionCompatParcelizer(spannable, new typeFromId(i4, i5, tokenBufferParser.IconCompatParcelizer == -2 ? 1 : tokenBufferParser.IconCompatParcelizer), i, i2);
        }
        int iAudioAttributesImplApi21Parcelizer = _currentobject.AudioAttributesImplApi21Parcelizer();
        if (iAudioAttributesImplApi21Parcelizer == 2) {
            _convertNumberToInt _convertnumbertointWrite = write(_convertnumbertoint, map);
            if (_convertnumbertointWrite != null && (_convertnumbertointIconCompatParcelizer = IconCompatParcelizer(_convertnumbertointWrite, map)) != null) {
                if (_convertnumbertointIconCompatParcelizer.IconCompatParcelizer() == 1 && _convertnumbertointIconCompatParcelizer.IconCompatParcelizer(0).MediaBrowserCompatCustomActionResultReceiver != null) {
                    String str = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(_convertnumbertointIconCompatParcelizer.IconCompatParcelizer(0).MediaBrowserCompatCustomActionResultReceiver);
                    _currentObject _currentobject3 = read(_convertnumbertointIconCompatParcelizer.AudioAttributesImplApi21Parcelizer, _convertnumbertointIconCompatParcelizer.RemoteActionCompatParcelizer(), map);
                    int iMediaBrowserCompatCustomActionResultReceiver = _currentobject3 != null ? _currentobject3.MediaBrowserCompatCustomActionResultReceiver() : -1;
                    if (iMediaBrowserCompatCustomActionResultReceiver == -1 && (_currentobject2 = read(_convertnumbertointWrite.AudioAttributesImplApi21Parcelizer, _convertnumbertointWrite.RemoteActionCompatParcelizer(), map)) != null) {
                        iMediaBrowserCompatCustomActionResultReceiver = _currentobject2.MediaBrowserCompatCustomActionResultReceiver();
                    }
                    spannable.setSpan(new getDescForKnownTypeIds(str, iMediaBrowserCompatCustomActionResultReceiver), i, i2, 33);
                } else {
                    prune.write("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (iAudioAttributesImplApi21Parcelizer == 3 || iAudioAttributesImplApi21Parcelizer == 4) {
            spannable.setSpan(new _smallerThanInt(), i, i2, 33);
        }
        if (_currentobject.MediaBrowserCompatMediaItem()) {
            idFromValueAndType.RemoteActionCompatParcelizer(spannable, new TypeDeserializer1(), i, i2);
        }
        int iRemoteActionCompatParcelizer = _currentobject.RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer == 1) {
            idFromValueAndType.RemoteActionCompatParcelizer(spannable, new AbsoluteSizeSpan((int) _currentobject.read(), true), i, i2);
        } else if (iRemoteActionCompatParcelizer == 2) {
            idFromValueAndType.RemoteActionCompatParcelizer(spannable, new RelativeSizeSpan(_currentobject.read()), i, i2);
        } else {
            if (iRemoteActionCompatParcelizer != 3) {
                return;
            }
            idFromValueAndType.RemoteActionCompatParcelizer(spannable, _currentobject.read() / 100.0f, i, i2);
        }
    }

    private static _convertNumberToInt IconCompatParcelizer(_convertNumberToInt _convertnumbertoint, Map<String, _currentObject> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(_convertnumbertoint);
        while (!arrayDeque.isEmpty()) {
            _convertNumberToInt _convertnumbertoint2 = (_convertNumberToInt) arrayDeque.pop();
            _currentObject _currentobject = read(_convertnumbertoint2.AudioAttributesImplApi21Parcelizer, _convertnumbertoint2.RemoteActionCompatParcelizer(), map);
            if (_currentobject != null && _currentobject.AudioAttributesImplApi21Parcelizer() == 3) {
                return _convertnumbertoint2;
            }
            for (int iIconCompatParcelizer = _convertnumbertoint2.IconCompatParcelizer() - 1; iIconCompatParcelizer >= 0; iIconCompatParcelizer--) {
                arrayDeque.push(_convertnumbertoint2.IconCompatParcelizer(iIconCompatParcelizer));
            }
        }
        return null;
    }

    private static _convertNumberToInt write(_convertNumberToInt _convertnumbertoint, Map<String, _currentObject> map) {
        while (_convertnumbertoint != null) {
            _currentObject _currentobject = read(_convertnumbertoint.AudioAttributesImplApi21Parcelizer, _convertnumbertoint.RemoteActionCompatParcelizer(), map);
            if (_currentobject != null && _currentobject.AudioAttributesImplApi21Parcelizer() == 1) {
                return _convertnumbertoint;
            }
            _convertnumbertoint = _convertnumbertoint.write;
        }
        return null;
    }

    static void IconCompatParcelizer(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    static String IconCompatParcelizer(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
}
